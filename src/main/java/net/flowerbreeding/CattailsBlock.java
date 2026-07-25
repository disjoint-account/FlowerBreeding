package net.flowerbreeding;

import com.mojang.serialization.MapCodec;
import net.flowerbreeding.util.FBProperties;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.ScheduledTickAccess;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;
import org.jspecify.annotations.NullMarked;

@NullMarked
public class CattailsBlock extends Block implements BonemealableBlock, SimpleWaterloggedBlock {
    public static final BooleanProperty CATTAILS_TIP;
    public static final BooleanProperty WATERLOGGED;
    public static final VoxelShape SHAPE = Block.box(0.0, 0.0, 0.0, 16.0, 16.0, 16.0);
    public static final MapCodec<CattailsBlock> CODEC = simpleCodec(CattailsBlock::new);

    public MapCodec<CattailsBlock> codec() {
        return CODEC;
    }

    public CattailsBlock(Properties settings) {
        super(settings);
        this.registerDefaultState(this.stateDefinition.any().setValue(CATTAILS_TIP, true).setValue(WATERLOGGED, true));
    }

    protected VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }

    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext ctx) {
        FluidState fluidState = ctx.getLevel().getFluidState(ctx.getClickedPos());
        boolean waterlogged = fluidState.is(FluidTags.WATER) && fluidState.getAmount() == 8;
        if (ctx.getLevel().getBlockState(ctx.getClickedPos().below()).is(BlockTags.DIRT) || ctx.getLevel().getBlockState(ctx.getClickedPos().below()).is(Blocks.SAND)) {
            return this.defaultBlockState().setValue(WATERLOGGED, waterlogged);
        }
        else return this.defaultBlockState().setValue(WATERLOGGED, waterlogged);
    }

    protected boolean propagatesSkylightDown(BlockState state) {
        return true;
    }

    protected boolean canSurvive(BlockState state, LevelReader world, BlockPos pos) {
        BlockPos pos1 = pos.relative(Direction.DOWN);
        BlockState state1 = world.getBlockState(pos1);
        if (state1.is(BlockTags.DIRT) || state1.is(Blocks.SAND)) {
            return world.getFluidState(pos).is(FluidTags.WATER) && world.getFluidState(pos).getAmount() == 8;
        }
        return state1.is(FBBlocks.CATTAILS);
    }

    protected boolean validCheck(BlockState state, LevelReader world, BlockPos pos) {
        boolean waterlogged = state.getValue(WATERLOGGED);
        if (world.getBlockState(pos.below()).is(BlockTags.DIRT) || world.getBlockState(pos.below()).is(Blocks.SAND)) {
            return waterlogged;
        }
        else return world.getBlockState(pos.below()).is(FBBlocks.CATTAILS);
    }

    protected int countCattailsAbove(BlockGetter world, BlockPos pos) {
        int i;
        for (i = 0; i < 383 && world.getBlockState(pos.above(i + 1)).is(FBBlocks.CATTAILS); ++i) {
        }
        return i;
    }

    protected int countDryCattailsBelow(BlockGetter world, BlockPos pos) {
        int i;
        for (i = 0; i < 383 && world.getBlockState(pos.below(i + 1)).is(FBBlocks.CATTAILS) && !world.getBlockState(pos.below(i + 1)).getValue(WATERLOGGED); ++i) {
        }
        return i;
    }

    protected boolean isRandomlyTicking(BlockState state) {
        return true;
    }

    protected void randomTick(BlockState state, ServerLevel world, BlockPos pos, RandomSource random) {
        if (random.nextDouble() < 0.1) {
            BlockPos blockPos = pos.relative(Direction.UP);
            if (canSurvive(state, world, blockPos) && (world.getBlockState(blockPos).isAir() || (world.getFluidState(blockPos).is(FluidTags.WATER) && world.getFluidState(blockPos).getAmount() == 8)) && countDryCattailsBelow(world, pos) < 2 && !world.getBlockState(pos.above()).is(FBBlocks.CATTAILS)) {
                FluidState state1 = world.getFluidState(pos.above());
                if (state1.is(FluidTags.WATER) && state1.getAmount() == 8) {
                    world.setBlockAndUpdate(blockPos, state.setValue(WATERLOGGED, true));
                }
                else {
                    world.setBlockAndUpdate(blockPos, state.setValue(WATERLOGGED, false));
                }
            }
        }
    }

    protected BlockState updateShape(BlockState state, LevelReader world, ScheduledTickAccess tickView, BlockPos pos, Direction direction, BlockPos neighborPos, BlockState neighborState, RandomSource random) {
        boolean cattailTip = state.getValue(CATTAILS_TIP);
        if (!validCheck(state, world, pos)) {
            tickView.scheduleTick(pos, this, 1);
        }
        if (world.getBlockState(pos.above()).is(FBBlocks.CATTAILS) && cattailTip) {
            tickView.scheduleTick(pos, this, 1);
        }
        if (!world.getBlockState(pos.above()).is(FBBlocks.CATTAILS) && !cattailTip) {
            tickView.scheduleTick(pos, this, 1);
        }
        if (state.getValue(WATERLOGGED)) {
            tickView.scheduleTick(pos, Fluids.WATER, Fluids.WATER.getTickDelay(world));
        }
        return super.updateShape(state, world, tickView, pos, direction, neighborPos, neighborState, random);
    }

    protected void tick(BlockState state, ServerLevel world, BlockPos pos, RandomSource random) {
        boolean cattailTip = state.getValue(CATTAILS_TIP);
        if (!validCheck(state, world, pos)) {
            world.destroyBlock(pos, true);
        }
        if (world.getBlockState(pos.above()).is(FBBlocks.CATTAILS) && validCheck(state, world, pos) && cattailTip) {
            world.setBlockAndUpdate(pos, state.setValue(CATTAILS_TIP, false));
        }
        if (!world.getBlockState(pos.above()).is(FBBlocks.CATTAILS) && validCheck(state, world, pos) && !cattailTip) {
            world.setBlockAndUpdate(pos, state.setValue(CATTAILS_TIP, true));
        }
    }

    public boolean isValidBonemealTarget(LevelReader world, BlockPos pos, BlockState state) {
        int iAbove = (countCattailsAbove(world, pos) + 1);
        BlockState state1 = world.getBlockState(pos.above(iAbove));
        FluidState state2 = world.getFluidState(pos.above(iAbove));
        return canSurvive(state, world, pos.relative(Direction.UP, iAbove)) && (state1.isAir() || (state2.is(FluidTags.WATER) && state2.getAmount() == 8));
    }

    public boolean isBonemealSuccess(Level world, RandomSource random, BlockPos pos, BlockState state) {
        return isValidBonemealTarget(world, pos, state);
    }

    public void performBonemeal(ServerLevel world, RandomSource random, BlockPos pos, BlockState state) {
        int i = (countCattailsAbove(world, pos) + 1);
        BlockPos blockPos = pos.relative(Direction.UP, i);
        FluidState state1 = world.getFluidState(pos.above(i));
        if (state1.is(FluidTags.WATER) && state1.getAmount() == 8) {
            world.setBlockAndUpdate(blockPos, state.setValue(WATERLOGGED, true));
        }
        else {
            world.setBlockAndUpdate(blockPos, state.setValue(WATERLOGGED, false));
        }
    }

    protected FluidState getFluidState(BlockState state) {
        return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(CATTAILS_TIP, WATERLOGGED);
    }

    static {
        CATTAILS_TIP = FBProperties.TIP;
        WATERLOGGED = BlockStateProperties.WATERLOGGED;
    }
}