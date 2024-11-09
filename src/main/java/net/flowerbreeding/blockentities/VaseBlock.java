package net.flowerbreeding.blockentities;

import com.mojang.serialization.MapCodec;
import net.flowerbreeding.util.FBTags;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemScatterer;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class VaseBlock extends BlockWithEntity implements BlockEntityProvider {
    private static final VoxelShape SHAPE1 =
            Block.createCuboidShape(5, 0, 5, 11, 6, 11);
    private static final VoxelShape SHAPE2 =
            Block.createCuboidShape(4, 0, 4, 5, 8, 12);
    private static final VoxelShape SHAPE3 =
            Block.createCuboidShape(11, 0, 4, 12, 8, 12);
    private static final VoxelShape SHAPE4 =
            Block.createCuboidShape(5, 0, 4, 11, 8, 12);
    private static final VoxelShape SHAPE5 =
            Block.createCuboidShape(5, 0, 11, 11, 8, 12);
    private static final VoxelShape SHAPE = VoxelShapes.union(SHAPE1, SHAPE2, SHAPE3,SHAPE4,SHAPE5);
    public static final MapCodec<VaseBlock> CODEC = VaseBlock.createCodec(VaseBlock::new);

    public VaseBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected MapCodec<? extends BlockWithEntity> getCodec() {
        return CODEC;
    }

    @Override
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new VaseBlockEntity(pos, state);
    }

    @Override
    protected BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    @Override
    protected void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved) {
        if(state.getBlock() != newState.getBlock()) {
            BlockEntity blockEntity = world.getBlockEntity(pos);
            if(blockEntity instanceof VaseBlockEntity) {
                ItemScatterer.spawn(world, pos, ((VaseBlockEntity) blockEntity));
                world.updateComparators(pos, this);
            }
            super.onStateReplaced(state, world, pos, newState, moved);
        }
    }

    @Override
    protected ActionResult onUseWithItem(ItemStack stack, BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (world.getBlockEntity(pos) instanceof VaseBlockEntity VaseBlockEntity) {
            if (VaseBlockEntity.isEmpty() && !player.isSneaking() && stack.isIn(FBTags.Items.VASE_FLOWERS)) {
                VaseBlockEntity.setStack(0, stack);
                world.playSound(player, pos, SoundEvents.BLOCK_BEEHIVE_EXIT, SoundCategory.BLOCKS, 1f, 1f);
                stack.decrement(1);
                VaseBlockEntity.markDirty();
                world.updateListeners(pos, state, state, 0);
            } else {
                if (VaseBlockEntity.getStack(1).isEmpty() && !player.isSneaking() && stack.isIn(FBTags.Items.VASE_FLOWERS)) {
                    VaseBlockEntity.setStack(1, stack);
                    world.playSound(player, pos, SoundEvents.BLOCK_BEEHIVE_EXIT, SoundCategory.BLOCKS, 1f, 1f);
                    stack.decrement(1);
                    VaseBlockEntity.markDirty();
                    world.updateListeners(pos, state, state, 0);
                } else {
                    if (VaseBlockEntity.getStack(2).isEmpty() && !player.isSneaking() && stack.isIn(FBTags.Items.VASE_FLOWERS)) {
                        VaseBlockEntity.setStack(2, stack);
                        world.playSound(player, pos, SoundEvents.BLOCK_BEEHIVE_EXIT, SoundCategory.BLOCKS, 1f, 1f);
                        stack.decrement(1);
                        VaseBlockEntity.markDirty();
                        world.updateListeners(pos, state, state, 0);
                    } else {
                        if (VaseBlockEntity.getStack(3).isEmpty() && !player.isSneaking() && stack.isIn(FBTags.Items.VASE_FLOWERS)) {
                            VaseBlockEntity.setStack(3, stack);
                            world.playSound(player, pos, SoundEvents.BLOCK_BEEHIVE_EXIT, SoundCategory.BLOCKS, 1f, 1f);
                            stack.decrement(1);
                            VaseBlockEntity.markDirty();
                            world.updateListeners(pos, state, state, 0);
                        } else {
                            if (stack.isEmpty() && !player.isSneaking() && !VaseBlockEntity.getStack(3).isEmpty()) {
                                ItemStack stackInCrate = VaseBlockEntity.getStack(3);
                                player.setStackInHand(Hand.MAIN_HAND, stackInCrate);
                                world.playSound(player, pos, SoundEvents.BLOCK_BEEHIVE_EXIT, SoundCategory.BLOCKS, 1f, 2f);
                                VaseBlockEntity.removeStack(3);
                                VaseBlockEntity.markDirty();
                                world.updateListeners(pos, state, state, 0);
                            } else {
                                if (stack.isEmpty() && !player.isSneaking() && !VaseBlockEntity.getStack(2).isEmpty()) {
                                    ItemStack stackInCrate = VaseBlockEntity.getStack(2);
                                    player.setStackInHand(Hand.MAIN_HAND, stackInCrate);
                                    world.playSound(player, pos, SoundEvents.BLOCK_BEEHIVE_EXIT, SoundCategory.BLOCKS, 1f, 2f);
                                    VaseBlockEntity.removeStack(2);
                                    VaseBlockEntity.markDirty();
                                    world.updateListeners(pos, state, state, 0);
                                } else {
                                    if (stack.isEmpty() && !player.isSneaking() && !VaseBlockEntity.getStack(1).isEmpty()) {
                                        ItemStack stackInCrate = VaseBlockEntity.getStack(1);
                                        player.setStackInHand(Hand.MAIN_HAND, stackInCrate);
                                        world.playSound(player, pos, SoundEvents.BLOCK_BEEHIVE_EXIT, SoundCategory.BLOCKS, 1f, 2f);
                                        VaseBlockEntity.removeStack(1);
                                        VaseBlockEntity.markDirty();
                                        world.updateListeners(pos, state, state, 0);
                                    } else if (stack.isEmpty() && !player.isSneaking() && !VaseBlockEntity.getStack(0).isEmpty()) {
                                        ItemStack stackInCrate = VaseBlockEntity.getStack(0);
                                        player.setStackInHand(Hand.MAIN_HAND, stackInCrate);
                                        world.playSound(player, pos, SoundEvents.BLOCK_BEEHIVE_EXIT, SoundCategory.BLOCKS, 1f, 2f);
                                        VaseBlockEntity.removeStack(0);
                                        VaseBlockEntity.markDirty();
                                        world.updateListeners(pos, state, state, 0);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return ActionResult.SUCCESS;
    }
    protected boolean canPathfindThrough(BlockState state, NavigationType type) {
        return false;
    }
}