package net.flowerbreeding;

import com.mojang.serialization.MapCodec;
import net.flowerbreeding.util.FBProperties;
import net.minecraft.block.*;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.state.property.Property;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import net.minecraft.world.tick.ScheduledTickView;
import org.jetbrains.annotations.Nullable;

public class CattailsBlock extends Block implements Fertilizable, Waterloggable {
    public static final BooleanProperty CATTAIL_TIP;
    public static final BooleanProperty WATERLOGGED;
    public static final VoxelShape SHAPE = Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 16.0, 16.0);
    public static final MapCodec<CattailsBlock> CODEC = createCodec(CattailsBlock::new);

    public MapCodec<CattailsBlock> getCodec() {
        return CODEC;
    }

    public CattailsBlock(Settings settings) {
        super(settings);
        this.setDefaultState((BlockState)((BlockState) this.stateManager.getDefaultState().with(CATTAIL_TIP, true)).with(WATERLOGGED, true));
    }

    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Nullable
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        FluidState fluidState = ctx.getWorld().getFluidState(ctx.getBlockPos());
        boolean waterlogged = fluidState.isIn(FluidTags.WATER) && fluidState.getLevel() == 8;
        if (ctx.getWorld().getBlockState(ctx.getBlockPos().down()).isIn(BlockTags.DIRT) || ctx.getWorld().getBlockState(ctx.getBlockPos().down()).isOf(Blocks.SAND)) {
            return this.getDefaultState().with(WATERLOGGED, waterlogged);
        }
        else return this.getDefaultState().with(WATERLOGGED, waterlogged);
    }

    protected boolean isTransparent(BlockState state) {
        return true;
    }

    protected boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        BlockPos pos1 = pos.offset(Direction.DOWN);
        BlockState state1 = world.getBlockState(pos1);
        if (state1.isIn(BlockTags.DIRT) || state1.isOf(Blocks.SAND)) {
            return world.getFluidState(pos).isIn(FluidTags.WATER) && world.getFluidState(pos).getLevel() == 8;
        }
        return state1.isOf(FBBlocks.CATTAILS);
    }

    protected boolean validCheck(BlockState state, WorldView world, BlockPos pos) {
        boolean waterlogged = state.get(WATERLOGGED);
        if (world.getBlockState(pos.down()).isIn(BlockTags.DIRT) || world.getBlockState(pos.down()).isOf(Blocks.SAND)) {
            return waterlogged;
        }
        else return world.getBlockState(pos.down()).isOf(FBBlocks.CATTAILS);
    }

    protected int countCattailsAbove(BlockView world, BlockPos pos) {
        int i;
        for (i = 0; i < 383 && world.getBlockState(pos.up(i + 1)).isOf(FBBlocks.CATTAILS); ++i) {
        }
        return i;
    }

    protected int countCattailsBelow(BlockView world, BlockPos pos) {
        int i;
        for (i = 0; i < 383 && world.getBlockState(pos.down(i + 1)).isOf(FBBlocks.CATTAILS); ++i) {
        }
        return i;
    }

    protected int countDryCattailsBelow(BlockView world, BlockPos pos) {
        int i;
        for (i = 0; i < 383 && world.getBlockState(pos.down(i + 1)).isOf(FBBlocks.CATTAILS) && !world.getBlockState(pos.down(i + 1)).get(WATERLOGGED); ++i) {
        }
        return i;
    }

    protected boolean hasRandomTicks(BlockState state) {
        return true;
    }

    protected void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (random.nextDouble() < 0.1) {
            BlockPos blockPos = pos.offset(Direction.UP);
            if (canPlaceAt(state, world, blockPos) && world.getBlockState(blockPos).isAir() && countDryCattailsBelow(world, pos) < 2) {
                FluidState state1 = world.getFluidState(pos.up());
                if (state1.isIn(FluidTags.WATER) && state1.getLevel() == 8) {
                    world.setBlockState(blockPos, state.with(WATERLOGGED, true));
                }
                else {
                    world.setBlockState(blockPos, state.with(WATERLOGGED, false));
                }
            }
        }
    }

    protected BlockState getStateForNeighborUpdate(BlockState state, WorldView world, ScheduledTickView tickView, BlockPos pos, Direction direction, BlockPos neighborPos, BlockState neighborState, Random random) {
        boolean cattailTip = state.get(CATTAIL_TIP);
        if (!validCheck(state, world, pos)) {
            tickView.scheduleBlockTick(pos, this, 1);
        }
        if (world.getBlockState(pos.up()).isOf(FBBlocks.CATTAILS) && cattailTip) {
            tickView.scheduleBlockTick(pos, this, 1);
        }
        if (!world.getBlockState(pos.up()).isOf(FBBlocks.CATTAILS) && !cattailTip) {
            tickView.scheduleBlockTick(pos, this, 1);
        }
        if (state.get(WATERLOGGED)) {
            tickView.scheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        }
        return super.getStateForNeighborUpdate(state, world, tickView, pos, direction, neighborPos, neighborState, random);
    }

    protected void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        boolean cattailTip = state.get(CATTAIL_TIP);
        if (!validCheck(state, world, pos)) {
            world.breakBlock(pos, true);
        }
        if (world.getBlockState(pos.up()).isOf(FBBlocks.CATTAILS) && cattailTip) {
            world.setBlockState(pos, state.with(CATTAIL_TIP, false));
        }
        if (!world.getBlockState(pos.up()).isOf(FBBlocks.CATTAILS) && !cattailTip) {
            world.setBlockState(pos, state.with(CATTAIL_TIP, true));
        }
    }

    public boolean isFertilizable(WorldView world, BlockPos pos, BlockState state) {
        int iAbove = (countCattailsAbove(world, pos) + 1);
        BlockState state1 = world.getBlockState(pos.up(iAbove));
        FluidState state2 = world.getFluidState(pos.up(iAbove));
        return canPlaceAt(state, world, pos.offset(Direction.UP, iAbove)) && (state1.isAir() || (state2.isIn(FluidTags.WATER) && state2.getLevel() == 8));
    }

    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        return isFertilizable(world, pos, state);
    }

    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        int i = (countCattailsAbove(world, pos) + 1);
        BlockPos blockPos = pos.offset(Direction.UP, i);
        FluidState state1 = world.getFluidState(pos.up(i));
        if (state1.isIn(FluidTags.WATER) && state1.getLevel() == 8) {
            world.setBlockState(blockPos, state.with(WATERLOGGED, true));
        }
        else {
            world.setBlockState(blockPos, state.with(WATERLOGGED, false));
        }
    }

    protected FluidState getFluidState(BlockState state) {
        return (Boolean)state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{CATTAIL_TIP, WATERLOGGED});
    }

    static {
        CATTAIL_TIP = FBProperties.CATTAIL_TIP;
        WATERLOGGED = Properties.WATERLOGGED;
    }
}