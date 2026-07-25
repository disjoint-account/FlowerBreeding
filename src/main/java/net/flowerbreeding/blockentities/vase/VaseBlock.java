package net.flowerbreeding.blockentities.vase;

import com.mojang.serialization.MapCodec;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.flowerbreeding.FBBlocks;
import net.flowerbreeding.eyeblossoms.*;
import net.flowerbreeding.util.FBTags;
import net.minecraft.tags.BlockItemTags;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.EyeblossomBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundSource;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.Containers;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.attribute.EnvironmentAttributes;
import org.jetbrains.annotations.Nullable;
import org.jspecify.annotations.NullMarked;

@NullMarked
public class VaseBlock extends BaseEntityBlock implements EntityBlock {
    private static final VoxelShape SHAPE =
            Block.box(5, 0, 5, 11, 8, 11);
    public static final MapCodec<VaseBlock> CODEC = VaseBlock.simpleCodec(VaseBlock::new);

    public VaseBlock(Properties settings) {
        super(settings);
    }

    @Override
    protected MapCodec<? extends BaseEntityBlock> codec() {
        return CODEC;
    }

    @Override
    protected VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }

    @Override
    protected boolean isRandomlyTicking(BlockState state) {
        return true;
    }

    @Override
    protected void randomTick(BlockState state, ServerLevel world, BlockPos pos, RandomSource random) {
        VaseBlockEntity entity = (VaseBlockEntity) world.getBlockEntity(pos);
        assert entity != null;
        eyeBlossomToggle(0, entity, world, pos, random);
        eyeBlossomToggle(1, entity, world, pos, random);
        eyeBlossomToggle(2, entity, world, pos, random);
        eyeBlossomToggle(3, entity, world, pos, random);
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new VaseBlockEntity(pos, state);
    }

    @Override
    protected void affectNeighborsAfterRemoval(BlockState state, ServerLevel world, BlockPos pos, boolean moved) {
            BlockEntity blockEntity = world.getBlockEntity(pos);
            if(blockEntity instanceof VaseBlockEntity) {
                Containers.dropContents(world, pos, ((VaseBlockEntity) blockEntity));
                world.updateNeighbourForOutputSignal(pos, this);
            }
            super.affectNeighborsAfterRemoval(state, world, pos, moved);
    }

    private boolean isValidFlower(ItemStack stack) {
        if (stack.is(FBTags.Items.SMALL_FLOWERS)) {
            return stack.is(FBTags.Items.VASE_FLOWERS);
        }
        else return stack.is(BlockItemTags.SMALL_FLOWERS.item()) || stack.is(ConventionalItemTags.SMALL_FLOWERS);
    }

    @Override
    protected InteractionResult useItemOn(ItemStack stack, BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        if (world.getBlockEntity(pos) instanceof VaseBlockEntity entity) {
            if ((entity.isEmpty() && player.getMainHandItem().isEmpty() && !isValidFlower(player.getOffhandItem())) ||
                    (!entity.getItem(0).isEmpty() && !entity.getItem(1).isEmpty() && !entity.getItem(2).isEmpty() && !entity.getItem(3).isEmpty() && isValidFlower(stack))) {
                return InteractionResult.SUCCESS;
            }
            if (isValidFlower(stack) && !player.isShiftKeyDown()) {
                if (entity.isEmpty()) {
                    entity.setItem(0, stack);
                } else {
                    if (entity.getItem(1).isEmpty()) {
                        entity.setItem(1, stack);
                    } else {
                        if (entity.getItem(2).isEmpty()) {
                            entity.setItem(2, stack);
                        } else {
                            if (entity.getItem(3).isEmpty()) {
                                entity.setItem(3, stack);
                            }
                        }
                    }
                }
                world.playSound(player, pos, SoundEvents.BEEHIVE_EXIT, SoundSource.BLOCKS, 1f, 1f);
                if (!player.hasInfiniteMaterials()) {
                    stack.shrink(1);
                }
                entity.setChanged();
                world.sendBlockUpdated(pos, state, state, 0);
                return InteractionResult.SUCCESS;
            } else {
                if (player.getMainHandItem().isEmpty() && !player.isShiftKeyDown()) {
                    if (!entity.getItem(3).isEmpty()) {
                        ItemStack stackInVase = entity.getItem(3);
                        if (!player.hasInfiniteMaterials()) {
                            player.getInventory().placeItemBackInInventory(stackInVase);
                        }
                        entity.removeItemNoUpdate(3);
                        world.playSound(player, pos, SoundEvents.BEEHIVE_EXIT, SoundSource.BLOCKS, 1f, 2f);
                        entity.setChanged();
                        world.sendBlockUpdated(pos, state, state, 0);
                        return InteractionResult.SUCCESS;
                    } else {
                        if (!isValidFlower(player.getOffhandItem())) {
                            if (!entity.getItem(2).isEmpty()) {
                                ItemStack stackInVase = entity.getItem(2);
                                if (!player.hasInfiniteMaterials()) {
                                    player.getInventory().placeItemBackInInventory(stackInVase);
                                }
                                entity.removeItemNoUpdate(2);
                            } else {
                                if (!entity.getItem(1).isEmpty()) {
                                    ItemStack stackInVase = entity.getItem(1);
                                    if (!player.hasInfiniteMaterials()) {
                                        player.getInventory().placeItemBackInInventory(stackInVase);
                                    }
                                    entity.removeItemNoUpdate(1);
                                } else {
                                    if (!entity.getItem(0).isEmpty()) {
                                        ItemStack stackInVase = entity.getItem(0);
                                        if (!player.hasInfiniteMaterials()) {
                                            player.getInventory().placeItemBackInInventory(stackInVase);
                                        }
                                        entity.removeItemNoUpdate(0);
                                    }
                                }
                            }
                            world.playSound(player, pos, SoundEvents.BEEHIVE_EXIT, SoundSource.BLOCKS, 1f, 2f);
                            entity.setChanged();
                            world.sendBlockUpdated(pos, state, state, 0);
                            return InteractionResult.SUCCESS;
                        }
                    }
                }
            }
        }
        return InteractionResult.TRY_WITH_EMPTY_HAND;
    }

    private void eyeBlossomToggle (int slot, VaseBlockEntity entity, ServerLevel world, BlockPos pos, RandomSource random) {
        ItemStack stack = entity.getItem(slot);
        boolean isDay = !world.environmentAttributes().getValue(EnvironmentAttributes.EYEBLOSSOM_OPEN, pos).toBoolean(true);
        if (stack.is(FBBlocks.OPEN_MAGENTA_EYEBLOSSOM.asItem()) && isDay) {
            entity.setItem(slot, new ItemStack(FBBlocks.CLOSED_MAGENTA_EYEBLOSSOM.asItem()));
            world.sendBlockUpdated(pos, entity.getBlockState(), entity.getBlockState(), Block.UPDATE_ALL);
            MagentaEyeblossomBlock.MagentaEyeblossomState magentaEyeblossomState = MagentaEyeblossomBlock.MagentaEyeblossomState.of(true).getOpposite();
            magentaEyeblossomState.spawnTrailParticle(world, pos, random);
            world.playSound(null, pos, magentaEyeblossomState.getLongSound(), SoundSource.BLOCKS, 1.0F, 1.0F);
        }
        if (stack.is(FBBlocks.CLOSED_MAGENTA_EYEBLOSSOM.asItem()) && !isDay) {
            entity.setItem(slot, new ItemStack(FBBlocks.OPEN_MAGENTA_EYEBLOSSOM.asItem()));
            world.sendBlockUpdated(pos, entity.getBlockState(), entity.getBlockState(), Block.UPDATE_ALL);
            MagentaEyeblossomBlock.MagentaEyeblossomState magentaEyeblossomState = MagentaEyeblossomBlock.MagentaEyeblossomState.of(false).getOpposite();
            magentaEyeblossomState.spawnTrailParticle(world, pos, random);
            world.playSound(null, pos, magentaEyeblossomState.getLongSound(), SoundSource.BLOCKS, 1.0F, 1.0F);
        }
        if (stack.is(FBBlocks.OPEN_BLUE_EYEBLOSSOM.asItem()) && isDay) {
            entity.setItem(slot, new ItemStack(FBBlocks.CLOSED_BLUE_EYEBLOSSOM.asItem()));
            world.sendBlockUpdated(pos, entity.getBlockState(), entity.getBlockState(), Block.UPDATE_ALL);
            BlueEyeblossomBlock.BlueEyeblossomState blueEyeblossomState = BlueEyeblossomBlock.BlueEyeblossomState.of(true).getOpposite();
            blueEyeblossomState.spawnTrailParticle(world, pos, random);
            world.playSound(null, pos, blueEyeblossomState.getLongSound(), SoundSource.BLOCKS, 1.0F, 1.0F);
        }
        if (stack.is(FBBlocks.CLOSED_BLUE_EYEBLOSSOM.asItem()) && !isDay) {
            entity.setItem(slot, new ItemStack(FBBlocks.OPEN_BLUE_EYEBLOSSOM.asItem()));
            world.sendBlockUpdated(pos, entity.getBlockState(), entity.getBlockState(), Block.UPDATE_ALL);
            BlueEyeblossomBlock.BlueEyeblossomState blueEyeblossomState = BlueEyeblossomBlock.BlueEyeblossomState.of(false).getOpposite();
            blueEyeblossomState.spawnTrailParticle(world, pos, random);
            world.playSound(null, pos, blueEyeblossomState.getLongSound(), SoundSource.BLOCKS, 1.0F, 1.0F);
        }
        if (stack.is(FBBlocks.OPEN_WHITE_EYEBLOSSOM.asItem()) && isDay) {
            entity.setItem(slot, new ItemStack(FBBlocks.CLOSED_WHITE_EYEBLOSSOM.asItem()));
            world.sendBlockUpdated(pos, entity.getBlockState(), entity.getBlockState(), Block.UPDATE_ALL);
            WhiteEyeblossomBlock.WhiteEyeblossomState whiteEyeblossomState = WhiteEyeblossomBlock.WhiteEyeblossomState.of(true).getOpposite();
            whiteEyeblossomState.spawnTrailParticle(world, pos, random);
            world.playSound(null, pos, whiteEyeblossomState.getLongSound(), SoundSource.BLOCKS, 1.0F, 1.0F);
        }
        if (stack.is(FBBlocks.CLOSED_WHITE_EYEBLOSSOM.asItem()) && !isDay) {
            entity.setItem(slot, new ItemStack(FBBlocks.OPEN_WHITE_EYEBLOSSOM.asItem()));
            world.sendBlockUpdated(pos, entity.getBlockState(), entity.getBlockState(), Block.UPDATE_ALL);
            WhiteEyeblossomBlock.WhiteEyeblossomState whiteEyeblossomState = WhiteEyeblossomBlock.WhiteEyeblossomState.of(false).getOpposite();
            whiteEyeblossomState.spawnTrailParticle(world, pos, random);
            world.playSound(null, pos, whiteEyeblossomState.getLongSound(), SoundSource.BLOCKS, 1.0F, 1.0F);
        }
        if (stack.is(Items.OPEN_EYEBLOSSOM) && isDay) {
            entity.setItem(slot, new ItemStack(Items.CLOSED_EYEBLOSSOM));
            world.sendBlockUpdated(pos, entity.getBlockState(), entity.getBlockState(), Block.UPDATE_ALL);
            EyeblossomBlock.Type eyeblossomState = EyeblossomBlock.Type.fromBoolean(true).transform();
            eyeblossomState.spawnTransformParticle(world, pos, random);
            world.playSound(null, pos, eyeblossomState.longSwitchSound(), SoundSource.BLOCKS, 1.0F, 1.0F);
        }
        if (stack.is(Items.CLOSED_EYEBLOSSOM) && !isDay) {
            entity.setItem(slot, new ItemStack(Items.OPEN_EYEBLOSSOM));
            world.sendBlockUpdated(pos, entity.getBlockState(), entity.getBlockState(), Block.UPDATE_ALL);
            EyeblossomBlock.Type eyeblossomState = EyeblossomBlock.Type.fromBoolean(false).transform();
            eyeblossomState.spawnTransformParticle(world, pos, random);
            world.playSound(null, pos, eyeblossomState.longSwitchSound(), SoundSource.BLOCKS, 1.0F, 1.0F);
        }
        if (stack.is(FBBlocks.OPEN_RED_EYEBLOSSOM.asItem()) && isDay) {
            entity.setItem(slot, new ItemStack(FBBlocks.CLOSED_RED_EYEBLOSSOM.asItem()));
            world.sendBlockUpdated(pos, entity.getBlockState(), entity.getBlockState(), Block.UPDATE_ALL);
            RedEyeblossomBlock.RedEyeblossomState redEyeblossomState = RedEyeblossomBlock.RedEyeblossomState.of(true).getOpposite();
            redEyeblossomState.spawnTrailParticle(world, pos, random);
            world.playSound(null, pos, redEyeblossomState.getLongSound(), SoundSource.BLOCKS, 1.0F, 1.0F);
        }
        if (stack.is(FBBlocks.CLOSED_RED_EYEBLOSSOM.asItem()) && !isDay) {
            entity.setItem(slot, new ItemStack(FBBlocks.OPEN_RED_EYEBLOSSOM.asItem()));
            world.sendBlockUpdated(pos, entity.getBlockState(), entity.getBlockState(), Block.UPDATE_ALL);
            RedEyeblossomBlock.RedEyeblossomState redEyeblossomState = RedEyeblossomBlock.RedEyeblossomState.of(false).getOpposite();
            redEyeblossomState.spawnTrailParticle(world, pos, random);
            world.playSound(null, pos, redEyeblossomState.getLongSound(), SoundSource.BLOCKS, 1.0F, 1.0F);
        }
        if (stack.is(FBBlocks.OPEN_YELLOW_EYEBLOSSOM.asItem()) && isDay) {
            entity.setItem(slot, new ItemStack(FBBlocks.CLOSED_YELLOW_EYEBLOSSOM.asItem()));
            world.sendBlockUpdated(pos, entity.getBlockState(), entity.getBlockState(), Block.UPDATE_ALL);
            YellowEyeblossomBlock.YellowEyeblossomState yellowEyeblossomState = YellowEyeblossomBlock.YellowEyeblossomState.of(true).getOpposite();
            yellowEyeblossomState.spawnTrailParticle(world, pos, random);
            world.playSound(null, pos, yellowEyeblossomState.getLongSound(), SoundSource.BLOCKS, 1.0F, 1.0F);
        }
        if (stack.is(FBBlocks.CLOSED_YELLOW_EYEBLOSSOM.asItem()) && !isDay) {
            entity.setItem(slot, new ItemStack(FBBlocks.OPEN_YELLOW_EYEBLOSSOM.asItem()));
            world.sendBlockUpdated(pos, entity.getBlockState(), entity.getBlockState(), Block.UPDATE_ALL);
            YellowEyeblossomBlock.YellowEyeblossomState yellowEyeblossomState = YellowEyeblossomBlock.YellowEyeblossomState.of(false).getOpposite();
            yellowEyeblossomState.spawnTrailParticle(world, pos, random);
            world.playSound(null, pos, yellowEyeblossomState.getLongSound(), SoundSource.BLOCKS, 1.0F, 1.0F);
        }
        if (stack.is(FBBlocks.OPEN_LIGHT_BLUE_EYEBLOSSOM.asItem()) && isDay) {
            entity.setItem(slot, new ItemStack(FBBlocks.CLOSED_LIGHT_BLUE_EYEBLOSSOM.asItem()));
            world.sendBlockUpdated(pos, entity.getBlockState(), entity.getBlockState(), Block.UPDATE_ALL);
            LightBlueEyeblossomBlock.LightBlueEyeblossomState lightBlueEyeblossomState = LightBlueEyeblossomBlock.LightBlueEyeblossomState.of(true).getOpposite();
            lightBlueEyeblossomState.spawnTrailParticle(world, pos, random);
            world.playSound(null, pos, lightBlueEyeblossomState.getLongSound(), SoundSource.BLOCKS, 1.0F, 1.0F);
        }
        if (stack.is(FBBlocks.CLOSED_LIGHT_BLUE_EYEBLOSSOM.asItem()) && !isDay) {
            entity.setItem(slot, new ItemStack(FBBlocks.OPEN_LIGHT_BLUE_EYEBLOSSOM.asItem()));
            world.sendBlockUpdated(pos, entity.getBlockState(), entity.getBlockState(), Block.UPDATE_ALL);
            LightBlueEyeblossomBlock.LightBlueEyeblossomState lightBlueEyeblossomState = LightBlueEyeblossomBlock.LightBlueEyeblossomState.of(false).getOpposite();
            lightBlueEyeblossomState.spawnTrailParticle(world, pos, random);
            world.playSound(null, pos, lightBlueEyeblossomState.getLongSound(), SoundSource.BLOCKS, 1.0F, 1.0F);
        }
        if (stack.is(FBBlocks.OPEN_PINK_EYEBLOSSOM.asItem()) && isDay) {
            entity.setItem(slot, new ItemStack(FBBlocks.CLOSED_PINK_EYEBLOSSOM.asItem()));
            world.sendBlockUpdated(pos, entity.getBlockState(), entity.getBlockState(), Block.UPDATE_ALL);
            PinkEyeblossomBlock.PinkEyeblossomState pinkEyeblossomState = PinkEyeblossomBlock.PinkEyeblossomState.of(true).getOpposite();
            pinkEyeblossomState.spawnTrailParticle(world, pos, random);
            world.playSound(null, pos, pinkEyeblossomState.getLongSound(), SoundSource.BLOCKS, 1.0F, 1.0F);
        }
        if (stack.is(FBBlocks.CLOSED_PINK_EYEBLOSSOM.asItem()) && !isDay) {
            entity.setItem(slot, new ItemStack(FBBlocks.OPEN_PINK_EYEBLOSSOM.asItem()));
            world.sendBlockUpdated(pos, entity.getBlockState(), entity.getBlockState(), Block.UPDATE_ALL);
            PinkEyeblossomBlock.PinkEyeblossomState pinkEyeblossomState = PinkEyeblossomBlock.PinkEyeblossomState.of(false).getOpposite();
            pinkEyeblossomState.spawnTrailParticle(world, pos, random);
            world.playSound(null, pos, pinkEyeblossomState.getLongSound(), SoundSource.BLOCKS, 1.0F, 1.0F);
        }
        if (stack.is(FBBlocks.OPEN_BLACK_EYEBLOSSOM.asItem()) && isDay) {
            entity.setItem(slot, new ItemStack(FBBlocks.CLOSED_BLACK_EYEBLOSSOM.asItem()));
            world.sendBlockUpdated(pos, entity.getBlockState(), entity.getBlockState(), Block.UPDATE_ALL);
            BlackEyeblossomBlock.BlackEyeblossomState blackEyeblossomState = BlackEyeblossomBlock.BlackEyeblossomState.of(true).getOpposite();
            blackEyeblossomState.spawnTrailParticle(world, pos, random);
            world.playSound(null, pos, blackEyeblossomState.getLongSound(), SoundSource.BLOCKS, 1.0F, 1.0F);
        }
        if (stack.is(FBBlocks.CLOSED_BLACK_EYEBLOSSOM.asItem()) && !isDay) {
            entity.setItem(slot, new ItemStack(FBBlocks.OPEN_BLACK_EYEBLOSSOM.asItem()));
            world.sendBlockUpdated(pos, entity.getBlockState(), entity.getBlockState(), Block.UPDATE_ALL);
            BlackEyeblossomBlock.BlackEyeblossomState blackEyeblossomState = BlackEyeblossomBlock.BlackEyeblossomState.of(false).getOpposite();
            blackEyeblossomState.spawnTrailParticle(world, pos, random);
            world.playSound(null, pos, blackEyeblossomState.getLongSound(), SoundSource.BLOCKS, 1.0F, 1.0F);
        }
        if (stack.is(FBBlocks.OPEN_CYAN_EYEBLOSSOM.asItem()) && isDay) {
            entity.setItem(slot, new ItemStack(FBBlocks.CLOSED_CYAN_EYEBLOSSOM.asItem()));
            world.sendBlockUpdated(pos, entity.getBlockState(), entity.getBlockState(), Block.UPDATE_ALL);
            CyanEyeblossomBlock.CyanEyeblossomState cyanEyeblossomState = CyanEyeblossomBlock.CyanEyeblossomState.of(true).getOpposite();
            cyanEyeblossomState.spawnTrailParticle(world, pos, random);
            world.playSound(null, pos, cyanEyeblossomState.getLongSound(), SoundSource.BLOCKS, 1.0F, 1.0F);
        }
        if (stack.is(FBBlocks.CLOSED_CYAN_EYEBLOSSOM.asItem()) && !isDay) {
            entity.setItem(slot, new ItemStack(FBBlocks.OPEN_CYAN_EYEBLOSSOM.asItem()));
            world.sendBlockUpdated(pos, entity.getBlockState(), entity.getBlockState(), Block.UPDATE_ALL);
            CyanEyeblossomBlock.CyanEyeblossomState cyanEyeblossomState = CyanEyeblossomBlock.CyanEyeblossomState.of(false).getOpposite();
            cyanEyeblossomState.spawnTrailParticle(world, pos, random);
            world.playSound(null, pos, cyanEyeblossomState.getLongSound(), SoundSource.BLOCKS, 1.0F, 1.0F);
        }
    }

    protected boolean isPathfindable(BlockState state, PathComputationType type) {
        return false;
    }
}