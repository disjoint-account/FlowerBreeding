package net.flowerbreeding.pigmentjars;

import net.flowerbreeding.FBBlocks;
import net.flowerbreeding.FBItems;
import net.flowerbreeding.FlowerBreeding;
import net.flowerbreeding.util.FBTags;
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
public class BluePigmentJarItem extends Item {
    public BluePigmentJarItem(Properties settings) {
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
                user.getInventory().placeItemBackInInventory(itemStack1);
                user.getInventory().placeItemBackInInventory(itemStack2);
                world.playSound(user, pos, SoundEvents.SWEET_BERRY_BUSH_PICK_BERRIES, SoundSource.BLOCKS, 1f, 1f);
                return InteractionResult.SUCCESS;
            } else if (user.hasInfiniteMaterials()) {
                user.getInventory().placeItemBackInInventory(itemStack1);
                world.playSound(user, pos, SoundEvents.SWEET_BERRY_BUSH_PICK_BERRIES, SoundSource.BLOCKS, 1f, 1f);
                return InteractionResult.SUCCESS;
            } else if (qty == 1) {
                user.getInventory().placeItemBackInInventory(itemStack1);
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
                    return FBBlocks.BLUE_ALLIUM;
                }
                if (pos.is(FBTags.Blocks.CORNFLOWERS)) {
                    return Blocks.CORNFLOWER;
                }
                if (pos.is(FBTags.Blocks.DAISIES)) {
                    return FBBlocks.BLUE_DAISY;
                }
                if (pos.is(FBTags.Blocks.TORCHFLOWERS)) {
                    return FBBlocks.BLUE_TORCHFLOWER;
                }
                if (pos.is(FBTags.Blocks.TULIPS)) {
                    return FBBlocks.BLUE_TULIP;
                }
                if (pos.is(FBTags.Blocks.AZURE_BLUETS)) {
                    return FBBlocks.BLUE_AZURE_BLUET;
                }
                if (pos.is(FBTags.Blocks.DANDELIONS)) {
                    return FBBlocks.BLUE_DANDELION;
                }
                if (pos.is(FBTags.Blocks.ORCHIDS)) {
                    return FBBlocks.BLUE_ORCHID;
                }
                if (pos.is(FBTags.Blocks.LILIES)) {
                    return FBBlocks.BLUE_LILY;
                }
                if (pos.is(FBTags.Blocks.POPPIES)) {
                    return FBBlocks.BLUE_POPPY;
                }
                if (pos.is(FBTags.Blocks.WITHER_ROSES)) {
                    return FBBlocks.BLUE_WITHER_ROSE;
                }
                if (pos.is(FBTags.Blocks.OPEN_EYEBLOSSOMS)) {
                    return FBBlocks.OPEN_BLUE_EYEBLOSSOM;
                }
                if (pos.is(FBTags.Blocks.LILACS)) {
                    return FBBlocks.BLUE_LILAC;
                }
                if (pos.is(FBTags.Blocks.PEONIES)) {
                    return FBBlocks.BLUE_PEONY;
                }
                if (pos.is(FBTags.Blocks.PITCHER_PLANTS)) {
                    return FBBlocks.BLUE_PITCHER_PLANT;
                }
                if (pos.is(FBTags.Blocks.ROSE_BUSHES)) {
                    return FBBlocks.BLUE_ROSE_BUSH;
                }
                if (pos.is(FBTags.Blocks.SUNFLOWERS)) {
                    return FBBlocks.BLUE_SUNFLOWER;
                }
                if (pos.is(FBTags.Blocks.PETALS)) {
                    return FBBlocks.BLUE_PETALS;
                }
                if (pos.is(FBTags.Blocks.WILDFLOWERS)) {
                    return FBBlocks.BLUE_WILDFLOWERS;
                }
                if (pos.is(FBTags.Blocks.CACTUS_FLOWERS)) {
                    return FBBlocks.BLUE_CACTUS_FLOWER;
                }
                if (pos.is(FBTags.Blocks.SPORE_BLOSSOMS)) {
                    return FBBlocks.BLUE_SPORE_BLOSSOM;
                }
                if (pos.is(FBTags.Blocks.FLOWERING_AZALEAS)) {
                    return FBBlocks.BLUE_FLOWERING_AZALEA;
                }
                if (pos.is(FBTags.Blocks.FLOWERING_AZALEA_LEAVES)) {
                    return FBBlocks.BLUE_FLOWERING_AZALEA_LEAVES;
                }
                if (pos.is(FBTags.Blocks.DAFFODILS)) {
                    return FBBlocks.BLUE_DAFFODIL;
                }
                if (pos.is(FBTags.Blocks.FOXGLOVES)) {
                    return FBBlocks.BLUE_FOXGLOVE;
                }
                if (pos.is(FBTags.Blocks.HYACINTHS)) {
                    return FBBlocks.BLUE_HYACINTH;
                }
                if (pos.is(FBTags.Blocks.PHLOXES)) {
                    return FBBlocks.BLUE_PHLOX;
                }
                if (pos.is(FBTags.Blocks.LUPINS)) {
                    return FBBlocks.BLUE_LUPIN;
                }
                if (pos.is(FBTags.Blocks.SMALL_ROSES)) {
                    return FBBlocks.BLUE_SMALL_ROSE;
                }
                if (pos.is(FBTags.Blocks.LAVENDERS)) {
                    return FBBlocks.BLUE_LAVENDER;
                }
                if (pos.is(FBTags.Blocks.HYDRANGEAS)) {
                    return FBBlocks.BLUE_HYDRANGEA;
                }
                if (pos.is(FBTags.Blocks.LOTUS_FLOWERS)) {
                    return FBItems.BLUE_LOTUS_FLOWER;
                }
                if (pos.is(FBTags.Blocks.JASMINES)) {
                    return FBBlocks.BLUE_JASMINE;
                }
                if (pos.is(FBTags.Blocks.CYPRESS_VINES)) {
                    return FBBlocks.BLUE_CYPRESS_VINE;
                }
                if (pos.is(FBTags.Blocks.GLOWSHROOMS)) {
                    return FBBlocks.BLUE_GLOWSHROOM;
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
            user.getInventory().placeItemBackInInventory(itemStack1);
            world.playSound(user, blockPos, SoundEvents.BOTTLE_FILL, SoundSource.BLOCKS, 1f, 1f);
            return InteractionResult.SUCCESS;
        }
        else if (user.hasInfiniteMaterials()) {
            user.getInventory().placeItemBackInInventory(itemStack1);
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