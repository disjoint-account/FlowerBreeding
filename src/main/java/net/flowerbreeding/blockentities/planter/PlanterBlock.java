package net.flowerbreeding.blockentities.planter;

import com.mojang.serialization.MapCodec;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.flowerbreeding.util.FBTags;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemScatterer;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.Heightmap;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import org.jetbrains.annotations.Nullable;

public class PlanterBlock extends BlockWithEntity implements BlockEntityProvider {
    private static final VoxelShape SHAPE1 =
            Block.createCuboidShape(2, 0, 2, 14, 7, 14);
    private static final VoxelShape SHAPE2 =
            Block.createCuboidShape(2, 7, 2, 4, 9, 14);
    private static final VoxelShape SHAPE3 =
            Block.createCuboidShape(12, 7, 2, 14, 9, 14);
    private static final VoxelShape SHAPE4 =
            Block.createCuboidShape(4, 7, 2, 12, 9, 4);
    private static final VoxelShape SHAPE5 =
            Block.createCuboidShape(4, 7, 12, 12, 9, 14);
    private static final VoxelShape SHAPE =
            VoxelShapes.union(SHAPE1, SHAPE2, SHAPE3, SHAPE4, SHAPE5);
    public static final MapCodec<PlanterBlock> CODEC = PlanterBlock.createCodec(PlanterBlock::new);

    public PlanterBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    protected MapCodec<? extends BlockWithEntity> getCodec() {
        return CODEC;
    }

    @Override
    protected boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        BlockState blockState = world.getBlockState(pos.up());
        BlockState blockState1 = world.getBlockState(pos.up(2));
        return !blockState.isSolidBlock(world, pos) && !blockState1.isSolidBlock(world, pos);
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new PlanterBlockEntity(pos, state);
    }

    @Override
    protected void onStateReplaced(BlockState state, ServerWorld world, BlockPos pos, boolean moved) {
            BlockEntity blockEntity = world.getBlockEntity(pos);
            if (blockEntity instanceof PlanterBlockEntity) {
                ItemScatterer.spawn(world, pos, ((PlanterBlockEntity) blockEntity));
                world.updateComparators(pos, this);
            }
            super.onStateReplaced(state, world, pos, moved);
    }

    @Override
    protected ActionResult onUseWithItem(ItemStack stack, BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (world.getBlockEntity(pos) instanceof PlanterBlockEntity entity) {
            if ((stack.isIn(ConventionalItemTags.TALL_FLOWERS) || stack.isIn(FBTags.Items.PLANTER_PLANTS)) && entity.isEmpty() && !player.isSneaking()) {
                entity.setStack(0, stack);
                if (!player.isInCreativeMode()) {
                    stack.decrement(1);
                }
                return ActionResult.SUCCESS;
            }
            else {
                if (!entity.isEmpty() && !player.isSneaking()) {
                    if (!player.isInCreativeMode()) {
                        player.getInventory().offerOrDrop(entity.getStack(0));
                    }
                    entity.removeStack(0);
                    return ActionResult.SUCCESS;
                }
            }
        }
        return ActionResult.PASS_TO_DEFAULT_BLOCK_ACTION;
    }

    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        if (world.getBlockEntity(pos) instanceof PlanterBlockEntity entity) {
            if (random.nextInt(30) == 0 && world.isNightAndNatural() && world.getTopY(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, pos) <= pos.getY() && entity.getStack(0).isOf(Items.FIREFLY_BUSH)) {
                world.playSoundAtBlockCenterClient(pos, SoundEvents.BLOCK_FIREFLY_BUSH_IDLE, SoundCategory.AMBIENT, 1.0F, 1.0F, false);
            }

            if (world.getLightLevel(pos) <= 13 && random.nextDouble() <= 0.7 && entity.getStack(0).isOf(Items.FIREFLY_BUSH)) {
                double d = (double) pos.getX() + random.nextDouble() * (double) 10.0F - (double) 5.0F;
                double e = (double) pos.getY() + random.nextDouble() * (double) 5.0F;
                double f = (double) pos.getZ() + random.nextDouble() * (double) 10.0F - (double) 5.0F;
                world.addParticleClient(ParticleTypes.FIREFLY, d, e, f, 0.0F, 0.0F, 0.0F);
            }
        }
    }
}