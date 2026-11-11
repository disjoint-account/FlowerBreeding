package net.flowerbreeding;

import net.flowerbreeding.util.FBProperties;
import net.flowerbreeding.util.FBTags;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Prediction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.ScheduledTickAccess;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BonemealSource;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jspecify.annotations.NullMarked;

@NullMarked
public class JasmineBlock extends Block implements BonemealableBlock {
    public static final BooleanProperty JASMINE_FERTILE;
    public static final BooleanProperty JASMINE_TIP;
    public static final VoxelShape SHAPE = Block.box(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

    public JasmineBlock(Properties settings) {
        super(settings);
        this.registerDefaultState(this.stateDefinition.any().setValue(JASMINE_TIP, true).setValue(JASMINE_FERTILE, true));
    }

    protected VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }

    protected boolean propagatesSkylightDown(BlockState state) {
        return true;
    }

    protected static boolean faceCheck(LevelReader world, BlockPos pos) {
        BlockState state = world.getBlockState(pos.relative(Direction.UP));
        return (Block.isFaceFull(state.getCollisionShape(world, pos.relative(Direction.UP)), Direction.UP.getOpposite()));
    }

    protected boolean canSurvive(BlockState state, LevelReader world, BlockPos pos) {
        boolean validNeighbourFace = faceCheck(world, pos);
        BlockPos pos1 = pos.relative(Direction.UP);
        BlockState state1 = world.getBlockState(pos1);
        return state1.is(FBTags.Blocks.JASMINES) || validNeighbourFace;
    }

    protected boolean isRandomlyTicking(BlockState state) {
        return true;
    }

    protected void randomTick(BlockState state, ServerLevel world, BlockPos pos, RandomSource random) {
        if (random.nextDouble() < 0.1) {
            BlockPos blockPos = pos.relative(Direction.DOWN);
            if (canSurvive(state, world, blockPos) && world.getBlockState(blockPos).isAir() && state.getValue(JASMINE_FERTILE)) {
                world.setBlockAndUpdate(blockPos, state);
            }
        }
    }

    protected int countJasmineBelow(BlockGetter world, BlockPos pos) {
        int i;
        for (i = 0; i < 383 && world.getBlockState(pos.below(i + 1)).is(FBTags.Blocks.JASMINES); ++i) {
        }
        return i;
    }

    public void getFertility(BlockState state, ServerLevel world, BlockPos pos) {
        int i = countJasmineBelow(world, pos);
        BlockPos pos1 = pos.relative(Direction.DOWN, i);
        BlockState state1 = world.getBlockState(pos1);
        boolean bl = state1.getValue(JASMINE_FERTILE);
        if ((i != 0) && state.getValue(JASMINE_FERTILE) != bl) {
            world.setBlockAndUpdate(pos, state.setValue(JASMINE_FERTILE, bl));
        }
    }

    protected InteractionResult useItemOn(ItemStack stack, BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        ItemStack itemStack = player.getItemInHand(hand);
        if (itemStack.is(Items.SHEARS)) {
            if (state.getValue(JASMINE_FERTILE) && countJasmineBelow(world, pos) == 0) {
                world.setBlockAndUpdate(pos, state.setValue(JASMINE_FERTILE, false));
                world.playSound(null, pos, SoundEvents.PUMPKIN_CARVE, SoundSource.BLOCKS, 1.0F, 1.0F);
                itemStack.hurtWithoutBreaking(1, player);
            }
            return InteractionResult.SUCCESS;
        }
        if (itemStack.is(Items.HONEY_BOTTLE)) {
            if (!state.getValue(JASMINE_FERTILE) && countJasmineBelow(world, pos) == 0) {
                int qty = itemStack.getCount();
                world.setBlockAndUpdate(pos, state.setValue(JASMINE_FERTILE, true));
                if ((qty > 1) && (!player.hasInfiniteMaterials())) {
                    itemStack.shrink(1);
                    player.getInventory().placeItemBackInInventory(new ItemStack(Items.GLASS_BOTTLE), Prediction.SERVER_ONLY);
                }
                if ((qty == 1) && (!player.hasInfiniteMaterials())) {
                    player.setItemInHand(hand, new ItemStack(Items.GLASS_BOTTLE));
                }
                world.playSound(null, pos, SoundEvents.BEEHIVE_DRIP, SoundSource.BLOCKS, 1.0F, 1.0F);
            }
            return InteractionResult.SUCCESS;
        }
        return InteractionResult.TRY_WITH_EMPTY_HAND;
    }

    public boolean isValidBonemealTarget(LevelReader world, BlockPos pos, BlockState state, BonemealSource source) {
        int i = (countJasmineBelow(world, pos) + 1);
        return (canSurvive(state, world, pos.relative(Direction.DOWN, i))) && (state.getValue(JASMINE_FERTILE) && world.getBlockState(pos.relative(Direction.DOWN, i)).isAir());
    }

    public boolean isBonemealSuccess(Level world, RandomSource random, BlockPos pos, BlockState state, BonemealSource source) {
        return state.getValue(JASMINE_FERTILE);
    }

    public void performBonemeal(ServerLevel world, RandomSource random, BlockPos pos, BlockState state, BonemealSource source) {
        int i = (countJasmineBelow(world, pos) + 1);
        BlockPos blockPos = pos.relative(Direction.DOWN, i);
        world.setBlockAndUpdate(blockPos, state);
    }

    protected BlockState updateShape(BlockState state, LevelReader world, ScheduledTickAccess tickView, BlockPos pos, Direction direction, BlockPos neighborPos, BlockState neighborState, RandomSource random) {
        if (!state.canSurvive(world, pos)) {
            tickView.scheduleTick(pos, this, 1);
        }
        if (world.getBlockState(pos.below()).is(FBTags.Blocks.JASMINES)) {
            if (state.getValue(JASMINE_FERTILE) != world.getBlockState(pos.below()).getValue(JASMINE_FERTILE)) {
                tickView.scheduleTick(pos, this, 1);
            }
        }
        if (state.getValue(JASMINE_TIP) && world.getBlockState(pos.below()).is(FBTags.Blocks.JASMINES)) {
            tickView.scheduleTick(pos, this, 1);
        }
        if (!state.getValue(JASMINE_TIP) && !world.getBlockState(pos.below()).is(FBTags.Blocks.JASMINES)) {
            tickView.scheduleTick(pos, this, 1);
        }
        return super.updateShape(state, world, tickView, pos, direction, neighborPos, neighborState, random);
    }

    protected void tick(BlockState state, ServerLevel world, BlockPos pos, RandomSource random) {
        if (!state.canSurvive(world, pos)) {
            world.destroyBlock(pos, true);
        }
        if (world.getBlockState(pos.below()).is(FBTags.Blocks.JASMINES)) {
            if (state.getValue(JASMINE_FERTILE) != world.getBlockState(pos.below()).getValue(JASMINE_FERTILE)) {
                getFertility(state, world, pos);
            }
        }
        if (state.getValue(JASMINE_TIP) && world.getBlockState(pos.below()).is(FBTags.Blocks.JASMINES)) {
            world.setBlockAndUpdate(pos, state.setValue(JASMINE_TIP, false));
        }
        if (!state.getValue(JASMINE_TIP) && !world.getBlockState(pos.below()).is(FBTags.Blocks.JASMINES)) {
            world.setBlockAndUpdate(pos, state.setValue(JASMINE_TIP, true));
        }
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(JASMINE_FERTILE, JASMINE_TIP);
    }

    static {
        JASMINE_FERTILE = FBProperties.JASMINE_FERTILE;
        JASMINE_TIP = FBProperties.TIP;
    }
}
