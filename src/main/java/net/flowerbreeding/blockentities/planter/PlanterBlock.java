package net.flowerbreeding.blockentities.planter;

import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.flowerbreeding.util.FBTags;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Prediction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.Containers;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.attribute.EnvironmentAttributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;
import org.jspecify.annotations.NullMarked;

@NullMarked
public class PlanterBlock extends BaseEntityBlock implements EntityBlock {
    private static final VoxelShape SHAPE1 =
            Block.box(2, 0, 2, 14, 7, 14);
    private static final VoxelShape SHAPE2 =
            Block.box(2, 7, 2, 4, 9, 14);
    private static final VoxelShape SHAPE3 =
            Block.box(12, 7, 2, 14, 9, 14);
    private static final VoxelShape SHAPE4 =
            Block.box(4, 7, 2, 12, 9, 4);
    private static final VoxelShape SHAPE5 =
            Block.box(4, 7, 12, 12, 9, 14);
    private static final VoxelShape SHAPE =
            Shapes.or(SHAPE1, SHAPE2, SHAPE3, SHAPE4, SHAPE5);

    public PlanterBlock(Properties settings) {
        super(settings);
    }

    @Override
    protected VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }

    @Override
    protected boolean canSurvive(BlockState state, LevelReader world, BlockPos pos) {
        BlockState blockState = world.getBlockState(pos.above());
        BlockState blockState1 = world.getBlockState(pos.above(2));
        return !blockState.isRedstoneConductor(world, pos) && !blockState1.isRedstoneConductor(world, pos);
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new PlanterBlockEntity(pos, state);
    }

    @Override
    protected void affectNeighborsAfterRemoval(BlockState state, ServerLevel world, BlockPos pos, boolean moved) {
            BlockEntity blockEntity = world.getBlockEntity(pos);
            if (blockEntity instanceof PlanterBlockEntity) {
                Containers.dropContents(world, pos, ((PlanterBlockEntity) blockEntity));
                world.updateNeighbourForOutputSignal(pos, this);
            }
            super.affectNeighborsAfterRemoval(state, world, pos, moved);
    }

    @Override
    protected InteractionResult useItemOn(ItemStack stack, BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        if (world.getBlockEntity(pos) instanceof PlanterBlockEntity entity) {
            if ((stack.is(ConventionalItemTags.TALL_FLOWERS) || stack.is(FBTags.Items.PLANTER_PLANTS)) && entity.isEmpty() && !player.isShiftKeyDown()) {
                entity.setItem(0, stack);
                if (!player.hasInfiniteMaterials()) {
                    stack.shrink(1);
                }
                return InteractionResult.SUCCESS;
            }
            else {
                if (!entity.isEmpty() && !player.isShiftKeyDown()) {
                    if (!player.hasInfiniteMaterials()) {
                        player.getInventory().placeItemBackInInventory(entity.getItem(0), Prediction.SERVER_ONLY);
                    }
                    entity.removeItem(0, 1);
                    return InteractionResult.SUCCESS;
                }
            }
        }
        return InteractionResult.TRY_WITH_EMPTY_HAND;
    }

    public void animateTick(BlockState state, Level world, BlockPos pos, RandomSource random) {
        if (world.getBlockEntity(pos) instanceof PlanterBlockEntity entity) {
            if (random.nextInt(30) == 0 && world.environmentAttributes().getValue(EnvironmentAttributes.FIREFLY_BUSH_SOUNDS, pos) && world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, pos) <= pos.getY() && entity.getItem(0).is(Items.FIREFLY_BUSH)) {
                world.playLocalSound(pos, SoundEvents.FIREFLY_BUSH_IDLE, SoundSource.AMBIENT, 1.0F, 1.0F, false);
            }

            if (world.getMaxLocalRawBrightness(pos) <= 13 && random.nextDouble() <= 0.7 && entity.getItem(0).is(Items.FIREFLY_BUSH)) {
                double d = (double) pos.getX() + random.nextDouble() * (double) 10.0F - (double) 5.0F;
                double e = (double) pos.getY() + random.nextDouble() * (double) 5.0F;
                double f = (double) pos.getZ() + random.nextDouble() * (double) 10.0F - (double) 5.0F;
                world.addParticle(ParticleTypes.FIREFLY, d, e, f, 0.0F, 0.0F, 0.0F);
            }
        }
    }
}