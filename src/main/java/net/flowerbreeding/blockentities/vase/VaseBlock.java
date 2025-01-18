package net.flowerbreeding.blockentities.vase;

import com.mojang.serialization.MapCodec;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.flowerbreeding.FBBlocks;
import net.flowerbreeding.eyeblossoms.*;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.tag.ItemTags;
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
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class VaseBlock extends BlockWithEntity implements BlockEntityProvider {
    private static final VoxelShape SHAPE =
            Block.createCuboidShape(6, 0, 6, 10, 8, 10);
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

    @Override
    protected boolean hasRandomTicks(BlockState state) {
        return true;
    }

    @Override
    protected void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        VaseBlockEntity entity = (VaseBlockEntity) world.getBlockEntity(pos);
        assert entity != null;
        eyeBlossomToggle(0, entity, world, pos, random);
        eyeBlossomToggle(1, entity, world, pos, random);
        eyeBlossomToggle(2, entity, world, pos, random);
        eyeBlossomToggle(3, entity, world, pos, random);
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new VaseBlockEntity(pos, state);
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
        if (world.getBlockEntity(pos) instanceof VaseBlockEntity entity) {
            if ((entity.isEmpty() && player.getMainHandStack().isEmpty() && !(player.getOffHandStack().isIn(ItemTags.SMALL_FLOWERS) || player.getOffHandStack().isIn(ConventionalItemTags.SMALL_FLOWERS))) ||
                    (!entity.getStack(0).isEmpty() && !entity.getStack(1).isEmpty() && !entity.getStack(2).isEmpty() && !entity.getStack(3).isEmpty() && (stack.isIn(ItemTags.SMALL_FLOWERS) || stack.isIn(ConventionalItemTags.SMALL_FLOWERS)))) {
                return ActionResult.SUCCESS;
            }
            if ((stack.isIn(ItemTags.SMALL_FLOWERS) || stack.isIn(ConventionalItemTags.SMALL_FLOWERS)) && !player.isSneaking()) {
                if (entity.isEmpty()) {
                    entity.setStack(0, stack);
                } else {
                    if (entity.getStack(1).isEmpty()) {
                        entity.setStack(1, stack);
                    } else {
                        if (entity.getStack(2).isEmpty()) {
                            entity.setStack(2, stack);
                        } else {
                            if (entity.getStack(3).isEmpty()) {
                                entity.setStack(3, stack);
                            }
                        }
                    }
                }
                world.playSound(player, pos, SoundEvents.BLOCK_BEEHIVE_EXIT, SoundCategory.BLOCKS, 1f, 1f);
                if (!player.isInCreativeMode()) {
                    stack.decrement(1);
                }
                entity.markDirty();
                world.updateListeners(pos, state, state, 0);
                return ActionResult.SUCCESS;
            } else {
                if (player.getMainHandStack().isEmpty() && !player.isSneaking()) {
                    if (!entity.getStack(3).isEmpty()) {
                        ItemStack stackInVase = entity.getStack(3);
                        if (!player.isInCreativeMode()) {
                            player.getInventory().offerOrDrop(stackInVase);
                        }
                        entity.removeStack(3);
                        world.playSound(player, pos, SoundEvents.BLOCK_BEEHIVE_EXIT, SoundCategory.BLOCKS, 1f, 2f);
                        entity.markDirty();
                        world.updateListeners(pos, state, state, 0);
                        return ActionResult.SUCCESS;
                    } else {
                        if (!(player.getOffHandStack().isIn(ItemTags.SMALL_FLOWERS) || player.getOffHandStack().isIn(ConventionalItemTags.SMALL_FLOWERS))) {
                            if (!entity.getStack(2).isEmpty()) {
                                ItemStack stackInVase = entity.getStack(2);
                                if (!player.isInCreativeMode()) {
                                    player.getInventory().offerOrDrop(stackInVase);
                                }
                                entity.removeStack(2);
                            } else {
                                if (!entity.getStack(1).isEmpty()) {
                                    ItemStack stackInVase = entity.getStack(1);
                                    if (!player.isInCreativeMode()) {
                                        player.getInventory().offerOrDrop(stackInVase);
                                    }
                                    entity.removeStack(1);
                                } else {
                                    if (!entity.getStack(0).isEmpty()) {
                                        ItemStack stackInVase = entity.getStack(0);
                                        if (!player.isInCreativeMode()) {
                                            player.getInventory().offerOrDrop(stackInVase);
                                        }
                                        entity.removeStack(0);
                                    }
                                }
                            }
                            world.playSound(player, pos, SoundEvents.BLOCK_BEEHIVE_EXIT, SoundCategory.BLOCKS, 1f, 2f);
                            entity.markDirty();
                            world.updateListeners(pos, state, state, 0);
                            return ActionResult.SUCCESS;
                        }
                    }
                }
            }
        }
        return ActionResult.PASS_TO_DEFAULT_BLOCK_ACTION;
    }

    private void eyeBlossomToggle (int slot, VaseBlockEntity entity, ServerWorld world, BlockPos pos, Random random) {
        ItemStack stack = entity.getStack(slot);
        boolean isDay = !CreakingHeartBlock.isNightAndNatural(world);
        if (stack.isOf(FBBlocks.OPEN_MAGENTA_EYEBLOSSOM.asItem()) && isDay) {
            entity.setStack(slot, new ItemStack(FBBlocks.CLOSED_MAGENTA_EYEBLOSSOM.asItem()));
            world.updateListeners(pos, entity.getCachedState(), entity.getCachedState(), Block.NOTIFY_ALL);
            MagentaEyeblossomBlock.MagentaEyeblossomState magentaEyeblossomState = MagentaEyeblossomBlock.MagentaEyeblossomState.of(true).getOpposite();
            magentaEyeblossomState.spawnTrailParticle(world, pos, random);
            world.playSound(null, pos, magentaEyeblossomState.getLongSound(), SoundCategory.BLOCKS, 1.0F, 1.0F);
        }
        if (stack.isOf(FBBlocks.CLOSED_MAGENTA_EYEBLOSSOM.asItem()) && !isDay) {
            entity.setStack(slot, new ItemStack(FBBlocks.OPEN_MAGENTA_EYEBLOSSOM.asItem()));
            world.updateListeners(pos, entity.getCachedState(), entity.getCachedState(), Block.NOTIFY_ALL);
            MagentaEyeblossomBlock.MagentaEyeblossomState magentaEyeblossomState = MagentaEyeblossomBlock.MagentaEyeblossomState.of(false).getOpposite();
            magentaEyeblossomState.spawnTrailParticle(world, pos, random);
            world.playSound(null, pos, magentaEyeblossomState.getLongSound(), SoundCategory.BLOCKS, 1.0F, 1.0F);
        }
        if (stack.isOf(FBBlocks.OPEN_BLUE_EYEBLOSSOM.asItem()) && isDay) {
            entity.setStack(slot, new ItemStack(FBBlocks.CLOSED_BLUE_EYEBLOSSOM.asItem()));
            world.updateListeners(pos, entity.getCachedState(), entity.getCachedState(), Block.NOTIFY_ALL);
            BlueEyeblossomBlock.BlueEyeblossomState blueEyeblossomState = BlueEyeblossomBlock.BlueEyeblossomState.of(true).getOpposite();
            blueEyeblossomState.spawnTrailParticle(world, pos, random);
            world.playSound(null, pos, blueEyeblossomState.getLongSound(), SoundCategory.BLOCKS, 1.0F, 1.0F);
        }
        if (stack.isOf(FBBlocks.CLOSED_BLUE_EYEBLOSSOM.asItem()) && !isDay) {
            entity.setStack(slot, new ItemStack(FBBlocks.OPEN_BLUE_EYEBLOSSOM.asItem()));
            world.updateListeners(pos, entity.getCachedState(), entity.getCachedState(), Block.NOTIFY_ALL);
            BlueEyeblossomBlock.BlueEyeblossomState blueEyeblossomState = BlueEyeblossomBlock.BlueEyeblossomState.of(false).getOpposite();
            blueEyeblossomState.spawnTrailParticle(world, pos, random);
            world.playSound(null, pos, blueEyeblossomState.getLongSound(), SoundCategory.BLOCKS, 1.0F, 1.0F);
        }
        if (stack.isOf(FBBlocks.OPEN_WHITE_EYEBLOSSOM.asItem()) && isDay) {
            entity.setStack(slot, new ItemStack(FBBlocks.CLOSED_WHITE_EYEBLOSSOM.asItem()));
            world.updateListeners(pos, entity.getCachedState(), entity.getCachedState(), Block.NOTIFY_ALL);
            WhiteEyeblossomBlock.WhiteEyeblossomState whiteEyeblossomState = WhiteEyeblossomBlock.WhiteEyeblossomState.of(true).getOpposite();
            whiteEyeblossomState.spawnTrailParticle(world, pos, random);
            world.playSound(null, pos, whiteEyeblossomState.getLongSound(), SoundCategory.BLOCKS, 1.0F, 1.0F);
        }
        if (stack.isOf(FBBlocks.CLOSED_WHITE_EYEBLOSSOM.asItem()) && !isDay) {
            entity.setStack(slot, new ItemStack(FBBlocks.OPEN_WHITE_EYEBLOSSOM.asItem()));
            world.updateListeners(pos, entity.getCachedState(), entity.getCachedState(), Block.NOTIFY_ALL);
            WhiteEyeblossomBlock.WhiteEyeblossomState whiteEyeblossomState = WhiteEyeblossomBlock.WhiteEyeblossomState.of(false).getOpposite();
            whiteEyeblossomState.spawnTrailParticle(world, pos, random);
            world.playSound(null, pos, whiteEyeblossomState.getLongSound(), SoundCategory.BLOCKS, 1.0F, 1.0F);
        }
        if (stack.isOf(Items.OPEN_EYEBLOSSOM) && isDay) {
            entity.setStack(slot, new ItemStack(Items.CLOSED_EYEBLOSSOM));
            world.updateListeners(pos, entity.getCachedState(), entity.getCachedState(), Block.NOTIFY_ALL);
            EyeblossomBlock.EyeblossomState eyeblossomState = EyeblossomBlock.EyeblossomState.of(true).getOpposite();
            eyeblossomState.spawnTrailParticle(world, pos, random);
            world.playSound(null, pos, eyeblossomState.getLongSound(), SoundCategory.BLOCKS, 1.0F, 1.0F);
        }
        if (stack.isOf(Items.CLOSED_EYEBLOSSOM) && !isDay) {
            entity.setStack(slot, new ItemStack(Items.OPEN_EYEBLOSSOM));
            world.updateListeners(pos, entity.getCachedState(), entity.getCachedState(), Block.NOTIFY_ALL);
            EyeblossomBlock.EyeblossomState eyeblossomState = EyeblossomBlock.EyeblossomState.of(false).getOpposite();
            eyeblossomState.spawnTrailParticle(world, pos, random);
            world.playSound(null, pos, eyeblossomState.getLongSound(), SoundCategory.BLOCKS, 1.0F, 1.0F);
        }
        if (stack.isOf(FBBlocks.OPEN_RED_EYEBLOSSOM.asItem()) && isDay) {
            entity.setStack(slot, new ItemStack(FBBlocks.CLOSED_RED_EYEBLOSSOM.asItem()));
            world.updateListeners(pos, entity.getCachedState(), entity.getCachedState(), Block.NOTIFY_ALL);
            RedEyeblossomBlock.RedEyeblossomState redEyeblossomState = RedEyeblossomBlock.RedEyeblossomState.of(true).getOpposite();
            redEyeblossomState.spawnTrailParticle(world, pos, random);
            world.playSound(null, pos, redEyeblossomState.getLongSound(), SoundCategory.BLOCKS, 1.0F, 1.0F);
        }
        if (stack.isOf(FBBlocks.CLOSED_RED_EYEBLOSSOM.asItem()) && !isDay) {
            entity.setStack(slot, new ItemStack(FBBlocks.OPEN_RED_EYEBLOSSOM.asItem()));
            world.updateListeners(pos, entity.getCachedState(), entity.getCachedState(), Block.NOTIFY_ALL);
            RedEyeblossomBlock.RedEyeblossomState redEyeblossomState = RedEyeblossomBlock.RedEyeblossomState.of(false).getOpposite();
            redEyeblossomState.spawnTrailParticle(world, pos, random);
            world.playSound(null, pos, redEyeblossomState.getLongSound(), SoundCategory.BLOCKS, 1.0F, 1.0F);
        }
        if (stack.isOf(FBBlocks.OPEN_YELLOW_EYEBLOSSOM.asItem()) && isDay) {
            entity.setStack(slot, new ItemStack(FBBlocks.CLOSED_YELLOW_EYEBLOSSOM.asItem()));
            world.updateListeners(pos, entity.getCachedState(), entity.getCachedState(), Block.NOTIFY_ALL);
            YellowEyeblossomBlock.YellowEyeblossomState yellowEyeblossomState = YellowEyeblossomBlock.YellowEyeblossomState.of(true).getOpposite();
            yellowEyeblossomState.spawnTrailParticle(world, pos, random);
            world.playSound(null, pos, yellowEyeblossomState.getLongSound(), SoundCategory.BLOCKS, 1.0F, 1.0F);
        }
        if (stack.isOf(FBBlocks.CLOSED_YELLOW_EYEBLOSSOM.asItem()) && !isDay) {
            entity.setStack(slot, new ItemStack(FBBlocks.OPEN_YELLOW_EYEBLOSSOM.asItem()));
            world.updateListeners(pos, entity.getCachedState(), entity.getCachedState(), Block.NOTIFY_ALL);
            YellowEyeblossomBlock.YellowEyeblossomState yellowEyeblossomState = YellowEyeblossomBlock.YellowEyeblossomState.of(false).getOpposite();
            yellowEyeblossomState.spawnTrailParticle(world, pos, random);
            world.playSound(null, pos, yellowEyeblossomState.getLongSound(), SoundCategory.BLOCKS, 1.0F, 1.0F);
        }
        if (stack.isOf(FBBlocks.OPEN_LIGHT_BLUE_EYEBLOSSOM.asItem()) && isDay) {
            entity.setStack(slot, new ItemStack(FBBlocks.CLOSED_LIGHT_BLUE_EYEBLOSSOM.asItem()));
            world.updateListeners(pos, entity.getCachedState(), entity.getCachedState(), Block.NOTIFY_ALL);
            LightBlueEyeblossomBlock.LightBlueEyeblossomState lightBlueEyeblossomState = LightBlueEyeblossomBlock.LightBlueEyeblossomState.of(true).getOpposite();
            lightBlueEyeblossomState.spawnTrailParticle(world, pos, random);
            world.playSound(null, pos, lightBlueEyeblossomState.getLongSound(), SoundCategory.BLOCKS, 1.0F, 1.0F);
        }
        if (stack.isOf(FBBlocks.CLOSED_LIGHT_BLUE_EYEBLOSSOM.asItem()) && !isDay) {
            entity.setStack(slot, new ItemStack(FBBlocks.OPEN_LIGHT_BLUE_EYEBLOSSOM.asItem()));
            world.updateListeners(pos, entity.getCachedState(), entity.getCachedState(), Block.NOTIFY_ALL);
            LightBlueEyeblossomBlock.LightBlueEyeblossomState lightBlueEyeblossomState = LightBlueEyeblossomBlock.LightBlueEyeblossomState.of(false).getOpposite();
            lightBlueEyeblossomState.spawnTrailParticle(world, pos, random);
            world.playSound(null, pos, lightBlueEyeblossomState.getLongSound(), SoundCategory.BLOCKS, 1.0F, 1.0F);
        }
        if (stack.isOf(FBBlocks.OPEN_PINK_EYEBLOSSOM.asItem()) && isDay) {
            entity.setStack(slot, new ItemStack(FBBlocks.CLOSED_PINK_EYEBLOSSOM.asItem()));
            world.updateListeners(pos, entity.getCachedState(), entity.getCachedState(), Block.NOTIFY_ALL);
            PinkEyeblossomBlock.PinkEyeblossomState pinkEyeblossomState = PinkEyeblossomBlock.PinkEyeblossomState.of(true).getOpposite();
            pinkEyeblossomState.spawnTrailParticle(world, pos, random);
            world.playSound(null, pos, pinkEyeblossomState.getLongSound(), SoundCategory.BLOCKS, 1.0F, 1.0F);
        }
        if (stack.isOf(FBBlocks.CLOSED_PINK_EYEBLOSSOM.asItem()) && !isDay) {
            entity.setStack(slot, new ItemStack(FBBlocks.OPEN_PINK_EYEBLOSSOM.asItem()));
            world.updateListeners(pos, entity.getCachedState(), entity.getCachedState(), Block.NOTIFY_ALL);
            PinkEyeblossomBlock.PinkEyeblossomState pinkEyeblossomState = PinkEyeblossomBlock.PinkEyeblossomState.of(false).getOpposite();
            pinkEyeblossomState.spawnTrailParticle(world, pos, random);
            world.playSound(null, pos, pinkEyeblossomState.getLongSound(), SoundCategory.BLOCKS, 1.0F, 1.0F);
        }
        if (stack.isOf(FBBlocks.OPEN_BLACK_EYEBLOSSOM.asItem()) && isDay) {
            entity.setStack(slot, new ItemStack(FBBlocks.CLOSED_BLACK_EYEBLOSSOM.asItem()));
            world.updateListeners(pos, entity.getCachedState(), entity.getCachedState(), Block.NOTIFY_ALL);
            BlackEyeblossomBlock.BlackEyeblossomState blackEyeblossomState = BlackEyeblossomBlock.BlackEyeblossomState.of(true).getOpposite();
            blackEyeblossomState.spawnTrailParticle(world, pos, random);
            world.playSound(null, pos, blackEyeblossomState.getLongSound(), SoundCategory.BLOCKS, 1.0F, 1.0F);
        }
        if (stack.isOf(FBBlocks.CLOSED_BLACK_EYEBLOSSOM.asItem()) && !isDay) {
            entity.setStack(slot, new ItemStack(FBBlocks.OPEN_BLACK_EYEBLOSSOM.asItem()));
            world.updateListeners(pos, entity.getCachedState(), entity.getCachedState(), Block.NOTIFY_ALL);
            BlackEyeblossomBlock.BlackEyeblossomState blackEyeblossomState = BlackEyeblossomBlock.BlackEyeblossomState.of(false).getOpposite();
            blackEyeblossomState.spawnTrailParticle(world, pos, random);
            world.playSound(null, pos, blackEyeblossomState.getLongSound(), SoundCategory.BLOCKS, 1.0F, 1.0F);
        }
        if (stack.isOf(FBBlocks.OPEN_CYAN_EYEBLOSSOM.asItem()) && isDay) {
            entity.setStack(slot, new ItemStack(FBBlocks.CLOSED_CYAN_EYEBLOSSOM.asItem()));
            world.updateListeners(pos, entity.getCachedState(), entity.getCachedState(), Block.NOTIFY_ALL);
            CyanEyeblossomBlock.CyanEyeblossomState cyanEyeblossomState = CyanEyeblossomBlock.CyanEyeblossomState.of(true).getOpposite();
            cyanEyeblossomState.spawnTrailParticle(world, pos, random);
            world.playSound(null, pos, cyanEyeblossomState.getLongSound(), SoundCategory.BLOCKS, 1.0F, 1.0F);
        }
        if (stack.isOf(FBBlocks.CLOSED_CYAN_EYEBLOSSOM.asItem()) && !isDay) {
            entity.setStack(slot, new ItemStack(FBBlocks.OPEN_CYAN_EYEBLOSSOM.asItem()));
            world.updateListeners(pos, entity.getCachedState(), entity.getCachedState(), Block.NOTIFY_ALL);
            CyanEyeblossomBlock.CyanEyeblossomState cyanEyeblossomState = CyanEyeblossomBlock.CyanEyeblossomState.of(false).getOpposite();
            cyanEyeblossomState.spawnTrailParticle(world, pos, random);
            world.playSound(null, pos, cyanEyeblossomState.getLongSound(), SoundCategory.BLOCKS, 1.0F, 1.0F);
        }
    }

    protected boolean canPathfindThrough(BlockState state, NavigationType type) {
        return false;
    }
}