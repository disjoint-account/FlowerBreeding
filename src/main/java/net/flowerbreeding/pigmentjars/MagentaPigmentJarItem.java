package net.flowerbreeding.pigmentjars;

import net.flowerbreeding.FBBlocks;
import net.flowerbreeding.FBItems;
import net.flowerbreeding.FlowerBreeding;
import net.flowerbreeding.util.FBTags;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class MagentaPigmentJarItem extends Item {
    public MagentaPigmentJarItem(Settings settings) {
        super(settings);
    }

    public ActionResult useOnBlock(ItemUsageContext context) {
        PlayerEntity user = context.getPlayer();
        Hand hand = context.getHand();
        BlockPos pos = context.getBlockPos();
        World world = context.getWorld();
        BlockState state = world.getBlockState(pos);
        assert user != null;
        ItemStack itemStack = user.getStackInHand(hand);
        int qty = JarCounter.countJars(user);
        if ((state.isIn(FBTags.Blocks.COLOUR_FLOWERS)) && FlowerBreeding.CONFIG.fastRecolouring()) {
            ItemStack itemStack1 = new ItemStack(getFlower(context));
            ItemStack itemStack2 = new ItemStack(FBItems.EMPTY_PIGMENT_JAR);
            if ((qty > 1) && (!user.isInCreativeMode())) {
                itemStack.decrement(1);
                user.getInventory().offerOrDrop(itemStack1);
                user.getInventory().offerOrDrop(itemStack2);
                world.playSound(user, pos, SoundEvents.BLOCK_SWEET_BERRY_BUSH_PICK_BERRIES, SoundCategory.BLOCKS, 1f, 1f);
                return ActionResult.SUCCESS;
            } else if (user.isInCreativeMode()) {
                user.getInventory().offerOrDrop(itemStack1);
                world.playSound(user, pos, SoundEvents.BLOCK_SWEET_BERRY_BUSH_PICK_BERRIES, SoundCategory.BLOCKS, 1f, 1f);
                return ActionResult.SUCCESS;
            } else if (qty == 1) {
                user.getInventory().offerOrDrop(itemStack1);
                user.setStackInHand(hand, itemStack2);
                world.playSound(user, pos, SoundEvents.BLOCK_SWEET_BERRY_BUSH_PICK_BERRIES, SoundCategory.BLOCKS, 1f, 1f);
                return ActionResult.SUCCESS;
            }
        }
        return ActionResult.PASS_TO_DEFAULT_BLOCK_ACTION;
    }

    public ItemConvertible getFlower(ItemUsageContext context) {
        BlockPos blockPos = context.getBlockPos();
        World world = context.getWorld();
        BlockState pos = world.getBlockState(blockPos);
        if (FlowerBreeding.CONFIG.fastRecolouring()) {
            if (pos.isIn(FBTags.Blocks.COLOUR_FLOWERS)) {
                if (pos.isIn(FBTags.Blocks.ALLIUMS)) {
                    return Blocks.ALLIUM;
                }
                if (pos.isIn(FBTags.Blocks.CORNFLOWERS)) {
                    return FBBlocks.MAGENTA_CORNFLOWER;
                }
                if (pos.isIn(FBTags.Blocks.DAISIES)) {
                    return FBBlocks.MAGENTA_DAISY;
                }
                if (pos.isIn(FBTags.Blocks.TORCHFLOWERS)) {
                    return FBBlocks.MAGENTA_TORCHFLOWER;
                }
                if (pos.isIn(FBTags.Blocks.TULIPS)) {
                    return FBBlocks.MAGENTA_TULIP;
                }
                if (pos.isIn(FBTags.Blocks.AZURE_BLUETS)) {
                    return FBBlocks.MAGENTA_AZURE_BLUET;
                }
                if (pos.isIn(FBTags.Blocks.DANDELIONS)) {
                    return FBBlocks.MAGENTA_DANDELION;
                }
                if (pos.isIn(FBTags.Blocks.ORCHIDS)) {
                    return FBBlocks.MAGENTA_ORCHID;
                }
                if (pos.isIn(FBTags.Blocks.LILIES)) {
                    return FBBlocks.MAGENTA_LILY;
                }
                if (pos.isIn(FBTags.Blocks.POPPIES)) {
                    return FBBlocks.MAGENTA_POPPY;
                }
                if (pos.isIn(FBTags.Blocks.WITHER_ROSES)) {
                    return FBBlocks.MAGENTA_WITHER_ROSE;
                }
                if (pos.isIn(FBTags.Blocks.OPEN_EYEBLOSSOMS)) {
                    return FBBlocks.OPEN_MAGENTA_EYEBLOSSOM;
                }
                if (pos.isIn(FBTags.Blocks.LILACS)) {
                    return FBBlocks.MAGENTA_LILAC;
                }
                if (pos.isIn(FBTags.Blocks.PEONIES)) {
                    return FBBlocks.MAGENTA_PEONY;
                }
                if (pos.isIn(FBTags.Blocks.PITCHER_PLANTS)) {
                    return FBBlocks.MAGENTA_PITCHER_PLANT;
                }
                if (pos.isIn(FBTags.Blocks.ROSE_BUSHES)) {
                    return FBBlocks.MAGENTA_ROSE_BUSH;
                }
                if (pos.isIn(FBTags.Blocks.SUNFLOWERS)) {
                    return FBBlocks.MAGENTA_SUNFLOWER;
                }
                if (pos.isIn(FBTags.Blocks.DAFFODILS)) {
                    return FBBlocks.MAGENTA_DAFFODIL;
                }
                if (pos.isIn(FBTags.Blocks.FOXGLOVES)) {
                    return FBBlocks.MAGENTA_FOXGLOVE;
                }
                if (pos.isIn(FBTags.Blocks.HYACINTHS)) {
                    return FBBlocks.MAGENTA_HYACINTH;
                }
                if (pos.isIn(FBTags.Blocks.PHLOXES)) {
                    return FBBlocks.MAGENTA_PHLOX;
                }
                if (pos.isIn(FBTags.Blocks.LUPINS)) {
                    return FBBlocks.MAGENTA_LUPIN;
                }
                if (pos.isIn(FBTags.Blocks.SMALL_ROSES)) {
                    return FBBlocks.MAGENTA_SMALL_ROSE;
                }
                if (pos.isIn(FBTags.Blocks.LAVENDERS)) {
                    return FBBlocks.MAGENTA_LAVENDER;
                }
                if (pos.isIn(FBTags.Blocks.HYDRANGEAS)) {
                    return FBBlocks.MAGENTA_HYDRANGEA;
                }
                if (pos.isIn(FBTags.Blocks.LOTUS_FLOWERS)) {
                    return FBItems.MAGENTA_LOTUS_FLOWER;
                }
                if (pos.isIn(FBTags.Blocks.JASMINES)) {
                    return FBBlocks.MAGENTA_JASMINE;
                }
                if (pos.isIn(FBTags.Blocks.CYPRUS_VINES)) {
                    return FBBlocks.MAGENTA_CYPRUS_VINE;
                }
                if (pos.isIn(FBTags.Blocks.GLOWSHROOMS)) {
                    return FBBlocks.MAGENTA_GLOWSHROOM;
                }
            }
        }
        return null;
    }

    public ActionResult use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        BlockPos blockPos = user.getBlockPos();
        ItemStack itemStack1 = new ItemStack(FBItems.EMPTY_PIGMENT_JAR);
        int qty = itemStack.getCount();
        if ((qty > 1) && (!user.isInCreativeMode())) {
            itemStack.decrement(1);
            user.getInventory().offerOrDrop(itemStack1);
            world.playSound(user, blockPos, SoundEvents.ITEM_BOTTLE_FILL, SoundCategory.BLOCKS, 1f, 1f);
            return ActionResult.SUCCESS;
        }
        else if (user.isInCreativeMode()) {
            user.getInventory().offerOrDrop(itemStack1);
            world.playSound(user, blockPos, SoundEvents.ITEM_BOTTLE_FILL, SoundCategory.BLOCKS, 1f, 1f);
            return ActionResult.SUCCESS;
        }
        else if (qty == 1) {
            user.setStackInHand(hand, itemStack1);
            world.playSound(user, blockPos, SoundEvents.ITEM_BOTTLE_FILL, SoundCategory.BLOCKS, 1f, 1f);
            return ActionResult.SUCCESS;
        }
        return ActionResult.PASS_TO_DEFAULT_BLOCK_ACTION;
    }
}