package net.flowerbreeding.pigmentjars;

import net.flowerbreeding.FBBlocks;
import net.flowerbreeding.FBItems;
import net.flowerbreeding.util.FBTags;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsage;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class LightBluePigmentJarItem extends Item {
    public LightBluePigmentJarItem(Settings settings) {
        super(settings);
    }
    public ActionResult useOnBlock(ItemUsageContext context) {
        PlayerEntity user = context.getPlayer();
        Hand hand = context.getHand();
        ItemStack itemStack = user.getStackInHand(hand);
        BlockPos blockPos = context.getBlockPos();
        World world = context.getWorld();
        BlockState pos = world.getBlockState(blockPos);
        if (pos.isIn(FBTags.Blocks.FBFLOWERS)) {
            if (pos.isIn(FBTags.Blocks.LIGHT_BLUE_FLOWERS))
                return ActionResult.PASS;
            else {
                ItemStack itemStack1 = ItemUsage.exchangeStack(itemStack, user, new ItemStack(FBItems.EMPTY_PIGMENT_JAR));
                user.setStackInHand(hand, itemStack1);
                if (pos.isIn(FBTags.Blocks.ALLIUMS)) {
                    user.getInventory().offerOrDrop(new ItemStack(FBBlocks.LIGHT_BLUE_ALLIUM));
                }
                if (pos.isIn(FBTags.Blocks.CORNFLOWERS)) {
                    user.getInventory().offerOrDrop(new ItemStack(FBBlocks.LIGHT_BLUE_CORNFLOWER));
                }
                if (pos.isIn(FBTags.Blocks.DAISIES)) {
                    user.getInventory().offerOrDrop(new ItemStack(FBBlocks.LIGHT_BLUE_DAISY));
                }
                if (pos.isIn(FBTags.Blocks.TORCHFLOWERS)) {
                    user.getInventory().offerOrDrop(new ItemStack(FBBlocks.LIGHT_BLUE_TORCHFLOWER));
                }
                if (pos.isIn(FBTags.Blocks.TULIPS)) {
                    user.getInventory().offerOrDrop(new ItemStack(FBBlocks.LIGHT_BLUE_TULIP));
                }
                if (pos.isIn(FBTags.Blocks.AZURE_BLUETS)) {
                    user.getInventory().offerOrDrop(new ItemStack(FBBlocks.LIGHT_BLUE_AZURE_BLUET));
                }
                if (pos.isIn(FBTags.Blocks.DANDELIONS)) {
                    user.getInventory().offerOrDrop(new ItemStack(FBBlocks.LIGHT_BLUE_DANDELION));
                }
                if (pos.isIn(FBTags.Blocks.ORCHIDS)) {
                    user.getInventory().offerOrDrop(new ItemStack(Blocks.BLUE_ORCHID));
                }
                if (pos.isIn(FBTags.Blocks.LILIES)) {
                    user.getInventory().offerOrDrop(new ItemStack(FBBlocks.LIGHT_BLUE_LILY));
                }
                if (pos.isIn(FBTags.Blocks.POPPIES)) {
                    user.getInventory().offerOrDrop(new ItemStack(FBBlocks.LIGHT_BLUE_POPPY));
                }
                if (pos.isIn(FBTags.Blocks.WITHER_ROSES)) {
                    user.getInventory().offerOrDrop(new ItemStack(FBBlocks.LIGHT_BLUE_WITHER_ROSE));
                }
                if (pos.isIn(FBTags.Blocks.LILACS)) {
                    user.getInventory().offerOrDrop(new ItemStack(FBBlocks.LIGHT_BLUE_LILAC));
                }
                if (pos.isIn(FBTags.Blocks.PEONIES)) {
                    user.getInventory().offerOrDrop(new ItemStack(FBBlocks.LIGHT_BLUE_PEONY));
                }
                if (pos.isIn(FBTags.Blocks.PITCHER_PLANTS)) {
                    user.getInventory().offerOrDrop(new ItemStack(FBBlocks.LIGHT_BLUE_PITCHER_PLANT));
                }
                if (pos.isIn(FBTags.Blocks.ROSE_BUSHES)) {
                    user.getInventory().offerOrDrop(new ItemStack(FBBlocks.LIGHT_BLUE_ROSE_BUSH));
                }
                if (pos.isIn(FBTags.Blocks.SUNFLOWERS)) {
                    user.getInventory().offerOrDrop(new ItemStack(FBBlocks.LIGHT_BLUE_SUNFLOWER));
                }
                world.playSound(user, blockPos, SoundEvents.BLOCK_CAVE_VINES_PICK_BERRIES, SoundCategory.BLOCKS, 1f, 1f);
                return ActionResult.SUCCESS;
            }
        }
        return ActionResult.PASS;
    }
}