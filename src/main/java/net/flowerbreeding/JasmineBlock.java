package net.flowerbreeding;

import com.mojang.serialization.MapCodec;
import net.flowerbreeding.util.FBProperties;
import net.flowerbreeding.util.FBTags;
import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import net.minecraft.world.tick.ScheduledTickView;

public class JasmineBlock extends Block implements Fertilizable {
    public static final BooleanProperty JASMINE_FERTILE;
    public static final BooleanProperty JASMINE_TIP;
    public static final VoxelShape SHAPE = Block.createCuboidShape(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
    public static final MapCodec<JasmineBlock> CODEC = createCodec(JasmineBlock::new);

    public MapCodec<JasmineBlock> getCodec() {
        return CODEC;
    }

    public JasmineBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(JASMINE_TIP, true).with(JASMINE_FERTILE, true));
    }

    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    protected boolean isTransparent(BlockState state) {
        return true;
    }

    protected static boolean faceCheck(WorldView world, BlockPos pos) {
        BlockState state = world.getBlockState(pos.offset(Direction.UP));
        return (Block.isFaceFullSquare(state.getCollisionShape(world, pos.offset(Direction.UP)), Direction.UP.getOpposite()));
    }

    protected boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        boolean validNeighbourFace = faceCheck(world, pos);
        BlockPos pos1 = pos.offset(Direction.UP);
        BlockState state1 = world.getBlockState(pos1);
        return state1.isIn(FBTags.Blocks.JASMINES) || validNeighbourFace;
    }

    protected boolean hasRandomTicks(BlockState state) {
        return true;
    }

    protected void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (random.nextDouble() < 0.1) {
            BlockPos blockPos = pos.offset(Direction.DOWN);
            if (canPlaceAt(state, world, blockPos) && world.getBlockState(blockPos).isAir() && state.get(JASMINE_FERTILE)) {
                world.setBlockState(blockPos, state);
            }
        }
    }

    protected int countJasmineBelow(BlockView world, BlockPos pos) {
        int i;
        for (i = 0; i < 383 && world.getBlockState(pos.down(i + 1)).isIn(FBTags.Blocks.JASMINES); ++i) {
        }
        return i;
    }

    public void getFertility(BlockState state, ServerWorld world, BlockPos pos) {
        int i = countJasmineBelow(world, pos);
        BlockPos pos1 = pos.offset(Direction.DOWN, i);
        BlockState state1 = world.getBlockState(pos1);
        boolean bl = state1.get(JASMINE_FERTILE);
        if ((i != 0) && state.get(JASMINE_FERTILE) != bl) {
            world.setBlockState(pos, state.with(JASMINE_FERTILE, bl));
        }
    }

    protected ActionResult onUseWithItem(ItemStack stack, BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        ItemStack itemStack = player.getStackInHand(hand);
        if (itemStack.isOf(Items.SHEARS)) {
            if (state.get(JASMINE_FERTILE) && countJasmineBelow(world, pos) == 0) {
                world.setBlockState(pos, state.with(JASMINE_FERTILE, false));
                world.playSound(null, pos, SoundEvents.BLOCK_PUMPKIN_CARVE, SoundCategory.BLOCKS, 1.0F, 1.0F);
                itemStack.damage(1, player);
            }
            return ActionResult.SUCCESS;
        }
        if (itemStack.isOf(Items.HONEY_BOTTLE)) {
            if (!state.get(JASMINE_FERTILE) && countJasmineBelow(world, pos) == 0) {
                int qty = itemStack.getCount();
                world.setBlockState(pos, state.with(JASMINE_FERTILE, true));
                if ((qty > 1) && (!player.isInCreativeMode())) {
                    itemStack.decrement(1);
                    player.getInventory().offerOrDrop(new ItemStack(Items.GLASS_BOTTLE));
                }
                if ((qty == 1) && (!player.isInCreativeMode())) {
                    player.setStackInHand(hand, new ItemStack(Items.GLASS_BOTTLE));
                }
                world.playSound(null, pos, SoundEvents.BLOCK_BEEHIVE_DRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
            }
            return ActionResult.SUCCESS;
        }
        return ActionResult.PASS_TO_DEFAULT_BLOCK_ACTION;
    }

    public boolean isFertilizable(WorldView world, BlockPos pos, BlockState state) {
        int i = (countJasmineBelow(world, pos) + 1);
        return (canPlaceAt(state, world, pos.offset(Direction.DOWN, i))) && (state.get(JASMINE_FERTILE) && world.getBlockState(pos.offset(Direction.DOWN, i)).isAir());
    }

    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        return state.get(JASMINE_FERTILE);
    }

    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        int i = (countJasmineBelow(world, pos) + 1);
        BlockPos blockPos = pos.offset(Direction.DOWN, i);
        world.setBlockState(blockPos, state);
    }

    protected BlockState getStateForNeighborUpdate(BlockState state, WorldView world, ScheduledTickView tickView, BlockPos pos, Direction direction, BlockPos neighborPos, BlockState neighborState, Random random) {
        if (!state.canPlaceAt(world, pos)) {
            tickView.scheduleBlockTick(pos, this, 1);
        }
        if (world.getBlockState(pos.down()).isIn(FBTags.Blocks.JASMINES)) {
            if (state.get(JASMINE_FERTILE) != world.getBlockState(pos.down()).get(JASMINE_FERTILE)) {
                tickView.scheduleBlockTick(pos, this, 1);
            }
        }
        if (state.get(JASMINE_TIP) && world.getBlockState(pos.down()).isIn(FBTags.Blocks.JASMINES)) {
            tickView.scheduleBlockTick(pos, this, 1);
        }
        if (!state.get(JASMINE_TIP) && !world.getBlockState(pos.down()).isIn(FBTags.Blocks.JASMINES)) {
            tickView.scheduleBlockTick(pos, this, 1);
        }
        return super.getStateForNeighborUpdate(state, world, tickView, pos, direction, neighborPos, neighborState, random);
    }

    protected void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (!state.canPlaceAt(world, pos)) {
            world.breakBlock(pos, true);
        }
        if (world.getBlockState(pos.down()).isIn(FBTags.Blocks.JASMINES)) {
            if (state.get(JASMINE_FERTILE) != world.getBlockState(pos.down()).get(JASMINE_FERTILE)) {
                getFertility(state, world, pos);
            }
        }
        if (state.get(JASMINE_TIP) && world.getBlockState(pos.down()).isIn(FBTags.Blocks.JASMINES)) {
            world.setBlockState(pos, state.with(JASMINE_TIP, false));
        }
        if (!state.get(JASMINE_TIP) && !world.getBlockState(pos.down()).isIn(FBTags.Blocks.JASMINES)) {
            world.setBlockState(pos, state.with(JASMINE_TIP, true));
        }
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(JASMINE_FERTILE, JASMINE_TIP);
    }

    static {
        JASMINE_FERTILE = FBProperties.JASMINE_FERTILE;
        JASMINE_TIP = FBProperties.JASMINE_TIP;
    }
}
