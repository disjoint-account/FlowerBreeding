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
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class LilacPigmentJarItem extends Item {
    public LilacPigmentJarItem(Settings settings) {
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
            if (pos.isIn(FBTags.Blocks.LILAC_FLOWERS))
                return ActionResult.PASS;
            else {
                ItemStack itemStack1 = ItemUsage.exchangeStack(itemStack, user, new ItemStack(FBItems.EMPTY_PIGMENT_JAR));
                user.setStackInHand(hand, itemStack1);
                if (pos.isIn(FBTags.Blocks.ALLIUMS)) {
                    user.getInventory().offerOrDrop(new ItemStack(FBBlocks.LILAC_ALLIUM));
                }
                if (pos.isIn(FBTags.Blocks.CORNFLOWERS)) {
                    user.getInventory().offerOrDrop(new ItemStack(FBBlocks.LILAC_CORNFLOWER));
                }
                if (pos.isIn(FBTags.Blocks.DAISIES)) {
                    user.getInventory().offerOrDrop(new ItemStack(FBBlocks.LILAC_DAISY));
                }
                if (pos.isIn(FBTags.Blocks.TORCHFLOWERS)) {
                    user.getInventory().offerOrDrop(new ItemStack(FBBlocks.LILAC_TORCHFLOWER));
                }
                if (pos.isIn(FBTags.Blocks.TULIPS)) {
                    user.getInventory().offerOrDrop(new ItemStack(FBBlocks.LILAC_TULIP));
                }
                if (pos.isIn(FBTags.Blocks.AZURE_BLUETS)) {
                    user.getInventory().offerOrDrop(new ItemStack(FBBlocks.LILAC_AZURE_BLUET));
                }
                if (pos.isIn(FBTags.Blocks.DANDELIONS)) {
                    user.getInventory().offerOrDrop(new ItemStack(FBBlocks.LILAC_DANDELION));
                }
                if (pos.isIn(FBTags.Blocks.ORCHIDS)) {
                    user.getInventory().offerOrDrop(new ItemStack(FBBlocks.LILAC_ORCHID));
                }
                if (pos.isIn(FBTags.Blocks.LILIES)) {
                    user.getInventory().offerOrDrop(new ItemStack(FBBlocks.LILAC_LILY));
                }
                if (pos.isIn(FBTags.Blocks.POPPIES)) {
                    user.getInventory().offerOrDrop(new ItemStack(FBBlocks.LILAC_POPPY));
                }
                if (pos.isIn(FBTags.Blocks.WITHER_ROSES)) {
                    user.getInventory().offerOrDrop(new ItemStack(FBBlocks.LILAC_WITHER_ROSE));
                }
                if (pos.isIn(FBTags.Blocks.LILACS)) {
                    user.getInventory().offerOrDrop(new ItemStack(Blocks.LILAC));
                }
                if (pos.isIn(FBTags.Blocks.PEONIES)) {
                    user.getInventory().offerOrDrop(new ItemStack(FBBlocks.LILAC_PEONY));
                }
                if (pos.isIn(FBTags.Blocks.PITCHER_PLANTS)) {
                    user.getInventory().offerOrDrop(new ItemStack(FBBlocks.LILAC_PITCHER_PLANT));
                }
                if (pos.isIn(FBTags.Blocks.ROSE_BUSHES)) {
                    user.getInventory().offerOrDrop(new ItemStack(FBBlocks.LILAC_ROSE_BUSH));
                }
                if (pos.isIn(FBTags.Blocks.SUNFLOWERS)) {
                    user.getInventory().offerOrDrop(new ItemStack(FBBlocks.LILAC_SUNFLOWER));
                }
            }
        }
        return ActionResult.PASS;
    }
}