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

public class BluePigmentJarItem extends Item {
    public BluePigmentJarItem(Settings settings) {
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
        if ((state.isIn(FBTags.Blocks.FBFLOWERS)) && FlowerBreeding.CONFIG.fastRecolouring()) {
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
            if (pos.isIn(FBTags.Blocks.FBFLOWERS)) {
                if (pos.isIn(FBTags.Blocks.ALLIUMS)) {
                    return FBBlocks.BLUE_ALLIUM;
                }
                if (pos.isIn(FBTags.Blocks.CORNFLOWERS)) {
                    return Blocks.CORNFLOWER;
                }
                if (pos.isIn(FBTags.Blocks.DAISIES)) {
                    return FBBlocks.BLUE_DAISY;
                }
                if (pos.isIn(FBTags.Blocks.TORCHFLOWERS)) {
                    return FBBlocks.BLUE_TORCHFLOWER;
                }
                if (pos.isIn(FBTags.Blocks.TULIPS)) {
                    return FBBlocks.BLUE_TULIP;
                }
                if (pos.isIn(FBTags.Blocks.AZURE_BLUETS)) {
                    return FBBlocks.BLUE_AZURE_BLUET;
                }
                if (pos.isIn(FBTags.Blocks.DANDELIONS)) {
                    return FBBlocks.BLUE_DANDELION;
                }
                if (pos.isIn(FBTags.Blocks.ORCHIDS)) {
                    return FBBlocks.BLUE_ORCHID;
                }
                if (pos.isIn(FBTags.Blocks.LILIES)) {
                    return FBBlocks.BLUE_LILY;
                }
                if (pos.isIn(FBTags.Blocks.POPPIES)) {
                    return FBBlocks.BLUE_POPPY;
                }
                if (pos.isIn(FBTags.Blocks.WITHER_ROSES)) {
                    return FBBlocks.BLUE_WITHER_ROSE;
                }
                if (pos.isIn(FBTags.Blocks.OPEN_EYEBLOSSOMS)) {
                    return FBBlocks.OPEN_BLUE_EYEBLOSSOM;
                }
                if (pos.isIn(FBTags.Blocks.LILACS)) {
                    return FBBlocks.BLUE_LILAC;
                }
                if (pos.isIn(FBTags.Blocks.PEONIES)) {
                    return FBBlocks.BLUE_PEONY;
                }
                if (pos.isIn(FBTags.Blocks.PITCHER_PLANTS)) {
                    return FBBlocks.BLUE_PITCHER_PLANT;
                }
                if (pos.isIn(FBTags.Blocks.ROSE_BUSHES)) {
                    return FBBlocks.BLUE_ROSE_BUSH;
                }
                if (pos.isIn(FBTags.Blocks.SUNFLOWERS)) {
                    return FBBlocks.BLUE_SUNFLOWER;
                }
                if (pos.isIn(FBTags.Blocks.DAFFODILS)) {
                    return FBBlocks.BLUE_DAFFODIL;
                }
                if (pos.isIn(FBTags.Blocks.FOXGLOVES)) {
                    return FBBlocks.BLUE_FOXGLOVE;
                }
                if (pos.isIn(FBTags.Blocks.HYACINTHS)) {
                    return FBBlocks.BLUE_HYACINTH;
                }
                if (pos.isIn(FBTags.Blocks.PHLOXES)) {
                    return FBBlocks.BLUE_PHLOX;
                }
                if (pos.isIn(FBTags.Blocks.LUPINS)) {
                    return FBBlocks.BLUE_LUPIN;
                }
                if (pos.isIn(FBTags.Blocks.SMALL_ROSES)) {
                    return FBBlocks.BLUE_SMALL_ROSE;
                }
                if (pos.isIn(FBTags.Blocks.LAVENDERS)) {
                    return FBBlocks.BLUE_LAVENDER;
                }
                if (pos.isIn(FBTags.Blocks.HYDRANGEAS)) {
                    return FBBlocks.BLUE_HYDRANGEA;
                }
                if (pos.isIn(FBTags.Blocks.LOTUS_FLOWERS)) {
                    return FBItems.BLUE_LOTUS_FLOWER;
                }
                if (pos.isIn(FBTags.Blocks.JASMINES)) {
                    return FBBlocks.BLUE_JASMINE;
                }
                if (pos.isIn(FBTags.Blocks.CYPRUS_VINES)) {
                    return FBBlocks.BLUE_CYPRUS_VINE;
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