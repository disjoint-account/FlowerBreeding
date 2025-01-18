package net.flowerbreeding.blockentities.flowerbed;

import com.mojang.serialization.MapCodec;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.flowerbreeding.FBBlocks;
import net.flowerbreeding.eyeblossoms.*;
import net.flowerbreeding.util.FBTags;
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
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import net.minecraft.world.tick.ScheduledTickView;
import org.jetbrains.annotations.Nullable;

import static net.minecraft.block.FarmlandBlock.setToDirt;

public class FBFlowerbedBlock extends BlockWithEntity implements BlockEntityProvider {
    public static final MapCodec<FBFlowerbedBlock> CODEC = FBFlowerbedBlock.createCodec(FBFlowerbedBlock::new);

    public FBFlowerbedBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected MapCodec<? extends BlockWithEntity> getCodec() {
        return CODEC;
    }

    @Override
    protected boolean hasRandomTicks(BlockState state) {
        return true;
    }

    @Override
    protected boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        BlockState blockState = world.getBlockState(pos.up());
        return !blockState.isSolidBlock(world, pos.up());
    }

    @Override
    protected BlockState getStateForNeighborUpdate(BlockState state, WorldView world, ScheduledTickView tickView, BlockPos pos, Direction direction, BlockPos neighborPos, BlockState neighborState, Random random
    ) {
        if (direction == Direction.UP && !state.canPlaceAt(world, pos)) {
            tickView.scheduleBlockTick(pos, this, 1);
        }

        return super.getStateForNeighborUpdate(state, world, tickView, pos, direction, neighborPos, neighborState, random);
    }

    @Override
    protected void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (!state.canPlaceAt(world, pos) && (state.isOf(FBBlocks.GRASS_FLOWERBED) || state.isOf(FBBlocks.DIRT_FLOWERBED))) {
            setToDirt(null, state, world, pos);
        }
        if (!state.canPlaceAt(world, pos) && state.isOf(FBBlocks.MOSS_FLOWERBED)) {
            world.setBlockState(pos, Blocks.MOSS_BLOCK.getDefaultState());
        }
    }

    @Override
    protected void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        FlowerbedBlockEntity entity = (FlowerbedBlockEntity) world.getBlockEntity(pos);
        assert entity != null;
        eyeBlossomToggle(0, entity, world, pos, random);
        eyeBlossomToggle(1, entity, world, pos, random);
        eyeBlossomToggle(2, entity, world, pos, random);
        eyeBlossomToggle(3, entity, world, pos, random);
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new FlowerbedBlockEntity(pos, state);
    }

    @Override
    protected void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved) {
        if (state.getBlock() != newState.getBlock()) {
            BlockEntity blockEntity = world.getBlockEntity(pos);
            if (blockEntity instanceof FlowerbedBlockEntity) {
                ItemScatterer.spawn(world, pos, ((FlowerbedBlockEntity) blockEntity));
                world.updateComparators(pos, this);
            }
            super.onStateReplaced(state, world, pos, newState, moved);
        }
    }

    private boolean isValidFlower(ItemStack stack) {
        if (stack.isIn(FBTags.Items.SMALL_FLOWERS)) {
            return stack.isIn(FBTags.Items.VASE_FLOWERS);
        }
        else return stack.isIn(ItemTags.SMALL_FLOWERS) || stack.isIn(ConventionalItemTags.SMALL_FLOWERS);
    }

    @Override
    protected ActionResult onUseWithItem(ItemStack stack, BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (world.getBlockEntity(pos) instanceof FlowerbedBlockEntity entity) {
            if ((entity.isEmpty() && player.getMainHandStack().isEmpty() && !isValidFlower(player.getOffHandStack())) || (entity.isFull() && isValidFlower(stack))) {
                return ActionResult.SUCCESS;
            }
            else {
                if (isValidFlower(stack) && !entity.isFull() && !player.isSneaking()) {
                    if (entity.isEmpty()) {
                        if (player.getHorizontalFacing() == Direction.NORTH) {
                        entity.setStack(0, stack);
                        }
                        if (player.getHorizontalFacing() == Direction.EAST) {
                        entity.setStack(1, stack);
                        }
                        if (player.getHorizontalFacing() == Direction.SOUTH) {
                        entity.setStack(2, stack);
                        }
                        if (player.getHorizontalFacing() == Direction.WEST) {
                        entity.setStack(3, stack);
                        }
                    }
                    else {
                        if (!entity.isEmpty() && !entity.isFull()) {
                            if (entity.getStack(0).isEmpty() && !entity.getStack(3).isEmpty()) {
                                entity.setStack(0, stack);
                            } else {
                                if (entity.getStack(1).isEmpty() && !entity.getStack(0).isEmpty()) {
                                    entity.setStack(1, stack);
                                } else {
                                    if (entity.getStack(2).isEmpty() && !entity.getStack(1).isEmpty()) {
                                        entity.setStack(2, stack);
                                    } else {
                                        if (entity.getStack(3).isEmpty() && !entity.getStack(2).isEmpty()) {
                                            entity.setStack(3, stack);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (!player.isInCreativeMode()) {
                        stack.decrement(1);
                    }
                    entity.markDirty();
                    world.updateListeners(pos, state, state, 0);
                    world.playSound(player, pos, SoundEvents.BLOCK_GRASS_PLACE, SoundCategory.BLOCKS, 1f, 1f);
                    return ActionResult.SUCCESS;
                }
                else {
                    if (player.getMainHandStack().isEmpty() && !player.isSneaking()) {
                        if (!entity.isEmpty()) {
                            if (entity.isFull()) {
                                if (player.getHorizontalFacing() == Direction.NORTH) {
                                    ItemStack stackInBed = entity.getStack(3);
                                    if (!player.isInCreativeMode()) {
                                        player.getInventory().offerOrDrop(stackInBed);
                                    }
                                    entity.removeStack(3);
                                }
                                if (player.getHorizontalFacing() == Direction.EAST) {
                                    ItemStack stackInBed = entity.getStack(0);
                                    if (!player.isInCreativeMode()) {
                                    player.getInventory().offerOrDrop(stackInBed);
                                    }
                                    entity.removeStack(0);
                                }
                                if (player.getHorizontalFacing() == Direction.SOUTH) {
                                    ItemStack stackInBed = entity.getStack(1);
                                    if (!player.isInCreativeMode()) {
                                        player.getInventory().offerOrDrop(stackInBed);
                                    }
                                    entity.removeStack(1);
                                }
                                if (player.getHorizontalFacing() == Direction.WEST) {
                                    ItemStack stackInBed = entity.getStack(2);
                                    if (!player.isInCreativeMode()) {
                                        player.getInventory().offerOrDrop(stackInBed);
                                    }
                                    entity.removeStack(2);
                                }
                                entity.markDirty();
                                world.updateListeners(pos, state, state, 0);
                                world.playSound(player, pos, SoundEvents.BLOCK_GRASS_BREAK, SoundCategory.BLOCKS, 1f, 1f);
                                return ActionResult.SUCCESS;
                            } else {
                                if (!entity.isFull() && !entity.isEmpty() && !isValidFlower(player.getOffHandStack())) {
                                    if (entity.getStack(0).isEmpty() && !entity.getStack(3).isEmpty()) {
                                      ItemStack stackInBed = entity.getStack(3);
                                      if (!player.isInCreativeMode()) {
                                          player.getInventory().offerOrDrop(stackInBed);
                                        }
                                        entity.removeStack(3);
                                    } else {
                                        if (entity.getStack(3).isEmpty() && !entity.getStack(2).isEmpty()) {
                                            ItemStack stackInBed = entity.getStack(2);
                                            if (!player.isInCreativeMode()) {
                                                player.getInventory().offerOrDrop(stackInBed);
                                            }
                                            entity.removeStack(2);
                                        } else {
                                            if (entity.getStack(2).isEmpty() && !entity.getStack(1).isEmpty()) {
                                                ItemStack stackInBed = entity.getStack(1);
                                                if (!player.isInCreativeMode()) {
                                                    player.getInventory().offerOrDrop(stackInBed);
                                                }
                                                entity.removeStack(1);
                                            } else {
                                                if (entity.getStack(1).isEmpty() && !entity.getStack(0).isEmpty()) {
                                                    ItemStack stackInBed = entity.getStack(0);
                                                    if (!player.isInCreativeMode()) {
                                                        player.getInventory().offerOrDrop(stackInBed);
                                                    }
                                                    entity.removeStack(0);
                                                }
                                            }
                                        }
                                    }
                                    entity.markDirty();
                                    world.updateListeners(pos, state, state, 0);
                                    world.playSound(player, pos, SoundEvents.BLOCK_GRASS_BREAK, SoundCategory.BLOCKS, 1f, 1f);
                                    return ActionResult.SUCCESS;
                                }
                            }
                        }
                    }
                }
            }
        }
        return ActionResult.PASS_TO_DEFAULT_BLOCK_ACTION;
    }

    private void eyeBlossomToggle (int slot, FlowerbedBlockEntity entity, ServerWorld world, BlockPos pos, Random random) {
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
