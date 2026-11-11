package net.flowerbreeding.pigmentjars;

import net.flowerbreeding.FBBlocks;
import net.flowerbreeding.FBItems;
import net.flowerbreeding.FlowerBreeding;
import net.flowerbreeding.util.FBTags;
import net.minecraft.util.Prediction;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.sounds.SoundSource;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;

import java.util.Objects;

@NullMarked
public class BlackPigmentJarItem extends Item {
    public BlackPigmentJarItem(Properties settings) {
        super(settings);
    }

    public InteractionResult useOn(UseOnContext context) {
        Player user = context.getPlayer();
        InteractionHand hand = context.getHand();
        BlockPos pos = context.getClickedPos();
        Level world = context.getLevel();
        BlockState state = world.getBlockState(pos);
        assert user != null;
        ItemStack itemStack = user.getItemInHand(hand);
        int qty = JarCounter.countJars(user);
        if ((state.is(FBTags.Blocks.COLOUR_FLOWERS)) && FlowerBreeding.CONFIG.fastRecolouring) {
            ItemStack itemStack1 = new ItemStack(Objects.requireNonNull(getFlower(context)));
            ItemStack itemStack2 = new ItemStack(FBItems.EMPTY_PIGMENT_JAR);
            if ((qty > 1) && (!user.hasInfiniteMaterials())) {
                itemStack.shrink(1);
                user.getInventory().placeItemBackInInventory(itemStack1, Prediction.SERVER_ONLY);
                user.getInventory().placeItemBackInInventory(itemStack2, Prediction.SERVER_ONLY);
                world.playSound(user, pos, SoundEvents.SWEET_BERRY_BUSH_PICK_BERRIES, SoundSource.BLOCKS, 1f, 1f);
                return InteractionResult.SUCCESS;
            } else if (user.hasInfiniteMaterials()) {
                user.getInventory().placeItemBackInInventory(itemStack1, Prediction.SERVER_ONLY);
                world.playSound(user, pos, SoundEvents.SWEET_BERRY_BUSH_PICK_BERRIES, SoundSource.BLOCKS, 1f, 1f);
                return InteractionResult.SUCCESS;
            } else if (qty == 1) {
                user.getInventory().placeItemBackInInventory(itemStack1, Prediction.SERVER_ONLY);
                user.setItemInHand(hand, itemStack2);
                world.playSound(user, pos, SoundEvents.SWEET_BERRY_BUSH_PICK_BERRIES, SoundSource.BLOCKS, 1f, 1f);
                return InteractionResult.SUCCESS;
            }
        }
        return InteractionResult.TRY_WITH_EMPTY_HAND;
    }

        public @Nullable ItemLike getFlower(UseOnContext context) {
        BlockPos blockPos = context.getClickedPos();
        Level world = context.getLevel();
        BlockState pos = world.getBlockState(blockPos);
        if (FlowerBreeding.CONFIG.fastRecolouring) {
            if (pos.is(FBTags.Blocks.COLOUR_FLOWERS)) {
                if (pos.is(FBTags.Blocks.ALLIUMS)) {
                    return FBBlocks.BLACK_ALLIUM;
                }
                if (pos.is(FBTags.Blocks.CORNFLOWERS)) {
                    return FBBlocks.BLACK_CORNFLOWER;
                }
                if (pos.is(FBTags.Blocks.DAISIES)) {
                    return FBBlocks.BLACK_DAISY;
                }
                if (pos.is(FBTags.Blocks.TORCHFLOWERS)) {
                    return FBBlocks.BLACK_TORCHFLOWER;
                }
                if (pos.is(FBTags.Blocks.TULIPS)) {
                    return FBBlocks.BLACK_TULIP;
                }
                if (pos.is(FBTags.Blocks.AZURE_BLUETS)) {
                    return FBBlocks.BLACK_AZURE_BLUET;
                }
                if (pos.is(FBTags.Blocks.DANDELIONS)) {
                    return FBBlocks.BLACK_DANDELION;
                }
                if (pos.is(FBTags.Blocks.ORCHIDS)) {
                    return FBBlocks.BLACK_ORCHID;
                }
                if (pos.is(FBTags.Blocks.LILIES)) {
                    return FBBlocks.BLACK_LILY;
                }
                if (pos.is(FBTags.Blocks.POPPIES)) {
                    return FBBlocks.BLACK_POPPY;
                }
                if (pos.is(FBTags.Blocks.WITHER_ROSES)) {
                    return Blocks.WITHER_ROSE;
                }
                if (pos.is(FBTags.Blocks.OPEN_EYEBLOSSOMS)) {
                    return FBBlocks.OPEN_BLACK_EYEBLOSSOM;
                }
                if (pos.is(FBTags.Blocks.LILACS)) {
                    return FBBlocks.BLACK_LILAC;
                }
                if (pos.is(FBTags.Blocks.PEONIES)) {
                    return FBBlocks.BLACK_PEONY;
                }
                if (pos.is(FBTags.Blocks.PITCHER_PLANTS)) {
                    return FBBlocks.BLACK_PITCHER_PLANT;
                }
                if (pos.is(FBTags.Blocks.ROSE_BUSHES)) {
                    return FBBlocks.BLACK_ROSE_BUSH;
                }
                if (pos.is(FBTags.Blocks.SUNFLOWERS)) {
                    return FBBlocks.BLACK_SUNFLOWER;
                }
                if (pos.is(FBTags.Blocks.PETALS)) {
                    return FBBlocks.BLACK_PETALS;
                }
                if (pos.is(FBTags.Blocks.WILDFLOWERS)) {
                    return FBBlocks.BLACK_WILDFLOWERS;
                }
                if (pos.is(FBTags.Blocks.CACTUS_FLOWERS)) {
                    return FBBlocks.BLACK_CACTUS_FLOWER;
                }
                if (pos.is(FBTags.Blocks.SPORE_BLOSSOMS)) {
                    return FBBlocks.BLACK_SPORE_BLOSSOM;
                }
                if (pos.is(FBTags.Blocks.FLOWERING_AZALEAS)) {
                    return FBBlocks.BLACK_FLOWERING_AZALEA;
                }
                if (pos.is(FBTags.Blocks.FLOWERING_AZALEA_LEAVES)) {
                    return FBBlocks.BLACK_FLOWERING_AZALEA_LEAVES;
                }
                if (pos.is(FBTags.Blocks.SHRUBS)) {
                    return FBBlocks.BLACK_SHRUB;
                }
                if (pos.is(FBTags.Blocks.DAFFODILS)) {
                    return FBBlocks.BLACK_DAFFODIL;
                }
                if (pos.is(FBTags.Blocks.FOXGLOVES)) {
                    return FBBlocks.BLACK_FOXGLOVE;
                }
                if (pos.is(FBTags.Blocks.HYACINTHS)) {
                    return FBBlocks.BLACK_HYACINTH;
                }
                if (pos.is(FBTags.Blocks.PHLOXES)) {
                    return FBBlocks.BLACK_PHLOX;
                }
                if (pos.is(FBTags.Blocks.LUPINS)) {
                    return FBBlocks.BLACK_LUPIN;
                }
                if (pos.is(FBTags.Blocks.SMALL_ROSES)) {
                    return FBBlocks.BLACK_SMALL_ROSE;
                }
                if (pos.is(FBTags.Blocks.LAVENDERS)) {
                    return FBBlocks.BLACK_LAVENDER;
                }
                if (pos.is(FBTags.Blocks.HYDRANGEAS)) {
                    return FBBlocks.BLACK_HYDRANGEA;
                }
                if (pos.is(FBTags.Blocks.LOTUS_FLOWERS)) {
                    return FBItems.BLACK_LOTUS_FLOWER;
                }
                if (pos.is(FBTags.Blocks.JASMINES)) {
                    return FBBlocks.BLACK_JASMINE;
                }
                if (pos.is(FBTags.Blocks.CYPRESS_VINES)) {
                    return FBBlocks.BLACK_CYPRESS_VINE;
                }
                if (pos.is(FBTags.Blocks.GLOWSHROOMS)) {
                    return FBBlocks.BLACK_GLOWSHROOM;
                }
            }
        }
        return null;
    }

    public InteractionResult use(Level world, Player user, InteractionHand hand) {
        ItemStack itemStack = user.getItemInHand(hand);
        BlockPos blockPos = user.blockPosition();
        ItemStack itemStack1 = new ItemStack(FBItems.EMPTY_PIGMENT_JAR);
        int qty = itemStack.getCount();
        if ((qty > 1) && (!user.hasInfiniteMaterials())) {
            itemStack.shrink(1);
            user.getInventory().placeItemBackInInventory(itemStack1, Prediction.SERVER_ONLY);
            world.playSound(user, blockPos, SoundEvents.BOTTLE_FILL, SoundSource.BLOCKS, 1f, 1f);
            return InteractionResult.SUCCESS;
        }
        else if (user.hasInfiniteMaterials()) {
            user.getInventory().placeItemBackInInventory(itemStack1, Prediction.SERVER_ONLY);
            world.playSound(user, blockPos, SoundEvents.BOTTLE_FILL, SoundSource.BLOCKS, 1f, 1f);
            return InteractionResult.SUCCESS;
        }
        else if (qty == 1) {
            user.setItemInHand(hand, itemStack1);
            world.playSound(user, blockPos, SoundEvents.BOTTLE_FILL, SoundSource.BLOCKS, 1f, 1f);
            return InteractionResult.SUCCESS;
        }
        return InteractionResult.TRY_WITH_EMPTY_HAND;
    }
}