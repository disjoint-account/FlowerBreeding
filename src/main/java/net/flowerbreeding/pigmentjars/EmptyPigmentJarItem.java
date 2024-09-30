package net.flowerbreeding.pigmentjars;


import net.flowerbreeding.FBItems;
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

public class EmptyPigmentJarItem extends Item {
    public EmptyPigmentJarItem(Settings settings) {
        super(settings);
    }

    public ActionResult useOnBlock(ItemUsageContext context) {
        PlayerEntity user = context.getPlayer();
        Hand hand = context.getHand();
        ItemStack itemStack = user.getStackInHand(hand);
        BlockPos blockPos = context.getBlockPos();
        World world = context.getWorld();
        BlockState pos = world.getBlockState(blockPos);
        if (pos.isOf(Blocks.ALLIUM)) {
            ItemStack itemStack1 = ItemUsage.exchangeStack(itemStack, user, new ItemStack(FBItems.MAGENTA_PIGMENT_JAR));
            user.setStackInHand(hand, itemStack1);
        }
        if (pos.isOf(Blocks.CORNFLOWER)) {
            ItemStack itemStack2 = ItemUsage.exchangeStack(itemStack, user, new ItemStack(FBItems.BLUE_PIGMENT_JAR));
            user.setStackInHand(hand, itemStack2);
        }
        if (pos.isOf(Blocks.OXEYE_DAISY)) {
            ItemStack itemStack1 = ItemUsage.exchangeStack(itemStack, user, new ItemStack(FBItems.WHITE_PIGMENT_JAR));
            user.setStackInHand(hand, itemStack1);
        }
        if (pos.isOf(Blocks.TORCHFLOWER)) {
            ItemStack itemStack1 = ItemUsage.exchangeStack(itemStack, user, new ItemStack(FBItems.ORANGE_PIGMENT_JAR));
            user.setStackInHand(hand, itemStack1);
        }
        if (pos.isOf(Blocks.RED_TULIP)) {
            ItemStack itemStack1 = ItemUsage.exchangeStack(itemStack, user, new ItemStack(FBItems.RED_PIGMENT_JAR));
            user.setStackInHand(hand, itemStack1);
        }
        if (pos.isOf(Blocks.AZURE_BLUET)) {
            ItemStack itemStack1 = ItemUsage.exchangeStack(itemStack, user, new ItemStack(FBItems.WHITE_PIGMENT_JAR));
            user.setStackInHand(hand, itemStack1);
        }
        if (pos.isOf(Blocks.DANDELION)) {
            ItemStack itemStack1 = ItemUsage.exchangeStack(itemStack, user, new ItemStack(FBItems.YELLOW_PIGMENT_JAR));
            user.setStackInHand(hand, itemStack1);
        }
        if (pos.isOf(Blocks.ORANGE_TULIP)) {
            ItemStack itemStack1 = ItemUsage.exchangeStack(itemStack, user, new ItemStack(FBItems.ORANGE_PIGMENT_JAR));
            user.setStackInHand(hand, itemStack1);
        }
        if (pos.isOf(Blocks.WHITE_TULIP)) {
            ItemStack itemStack1 = ItemUsage.exchangeStack(itemStack, user, new ItemStack(FBItems.WHITE_PIGMENT_JAR));
            user.setStackInHand(hand, itemStack1);
        }
        if (pos.isOf(Blocks.BLUE_ORCHID)) {
            ItemStack itemStack1 = ItemUsage.exchangeStack(itemStack, user, new ItemStack(FBItems.CYAN_PIGMENT_JAR));
            user.setStackInHand(hand, itemStack1);
        }
        if (pos.isOf(Blocks.LILY_OF_THE_VALLEY)) {
            ItemStack itemStack1 = ItemUsage.exchangeStack(itemStack, user, new ItemStack(FBItems.WHITE_PIGMENT_JAR));
            user.setStackInHand(hand, itemStack1);
        }
        if (pos.isOf(Blocks.POPPY)) {
            ItemStack itemStack1 = ItemUsage.exchangeStack(itemStack, user, new ItemStack(FBItems.RED_PIGMENT_JAR));
            user.setStackInHand(hand, itemStack1);
        }
        if (pos.isOf(Blocks.PINK_TULIP)) {
            ItemStack itemStack1 = ItemUsage.exchangeStack(itemStack, user, new ItemStack(FBItems.PINK_PIGMENT_JAR));
            user.setStackInHand(hand, itemStack1);
        }
        if (pos.isOf(Blocks.WITHER_ROSE)) {
            ItemStack itemStack1 = ItemUsage.exchangeStack(itemStack, user, new ItemStack(FBItems.BLACK_PIGMENT_JAR));
            user.setStackInHand(hand, itemStack1);
        }
        if (pos.isOf(Blocks.LILAC)) {
            ItemStack itemStack1 = ItemUsage.exchangeStack(itemStack, user, new ItemStack(FBItems.LILAC_PIGMENT_JAR));
            user.setStackInHand(hand, itemStack1);
        }
        if (pos.isOf(Blocks.PEONY)) {
            ItemStack itemStack1 = ItemUsage.exchangeStack(itemStack, user, new ItemStack(FBItems.PINK_PIGMENT_JAR));
            user.setStackInHand(hand, itemStack1);
        }
        if (pos.isOf(Blocks.ROSE_BUSH)) {
            ItemStack itemStack1 = ItemUsage.exchangeStack(itemStack, user, new ItemStack(FBItems.RED_PIGMENT_JAR));
            user.setStackInHand(hand, itemStack1);
        }
        if (pos.isOf(Blocks.SUNFLOWER)) {
            ItemStack itemStack1 = ItemUsage.exchangeStack(itemStack, user, new ItemStack(FBItems.YELLOW_PIGMENT_JAR));
            user.setStackInHand(hand, itemStack1);
        }
        if (pos.isOf(Blocks.PITCHER_PLANT)) {
            ItemStack itemStack1 = ItemUsage.exchangeStack(itemStack, user, new ItemStack(FBItems.BLUE_PIGMENT_JAR));
            user.setStackInHand(hand, itemStack1);
        }
        return ActionResult.PASS;
    }
}