package net.flowerbreeding.pigmentjars;


import net.flowerbreeding.FBItems;
import net.flowerbreeding.util.FBTags;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
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
        BlockPos blockPos = context.getBlockPos();
        World world = context.getWorld();
        BlockState pos = world.getBlockState(blockPos);
        if (pos.isIn(FBTags.Blocks.FBFLOWERS)) {
            if (pos.isIn(FBTags.Blocks.MAGENTA_FLOWERS)) {
                ItemStack itemStack1 = new ItemStack(FBItems.MAGENTA_PIGMENT_JAR);
                user.setStackInHand(hand, itemStack1);
            }
            if (pos.isIn(FBTags.Blocks.BLUE_FLOWERS)) {
                ItemStack itemStack2 = new ItemStack(FBItems.BLUE_PIGMENT_JAR);
                user.setStackInHand(hand, itemStack2);
            }
            if (pos.isIn(FBTags.Blocks.WHITE_FLOWERS)) {
                ItemStack itemStack1 = new ItemStack(FBItems.WHITE_PIGMENT_JAR);
                user.setStackInHand(hand, itemStack1);
            }
            if (pos.isIn(FBTags.Blocks.ORANGE_FLOWERS)) {
                ItemStack itemStack1 = new ItemStack(FBItems.ORANGE_PIGMENT_JAR);
                user.setStackInHand(hand, itemStack1);
            }
            if (pos.isIn(FBTags.Blocks.RED_FLOWERS)) {
                ItemStack itemStack1 = new ItemStack(FBItems.RED_PIGMENT_JAR);
                user.setStackInHand(hand, itemStack1);
            }
            if (pos.isIn(FBTags.Blocks.YELLOW_FLOWERS)) {
                ItemStack itemStack1 = new ItemStack(FBItems.YELLOW_PIGMENT_JAR);
                user.setStackInHand(hand, itemStack1);
            }
            if (pos.isIn(FBTags.Blocks.LIGHT_BLUE_FLOWERS)) {
                ItemStack itemStack1 = new ItemStack(FBItems.LIGHT_BLUE_PIGMENT_JAR);
                user.setStackInHand(hand, itemStack1);
            }
            if (pos.isIn(FBTags.Blocks.PINK_FLOWERS)) {
                ItemStack itemStack1 = new ItemStack(FBItems.PINK_PIGMENT_JAR);
                user.setStackInHand(hand, itemStack1);
            }
            if (pos.isIn(FBTags.Blocks.BLACK_FLOWERS)) {
                ItemStack itemStack1 = new ItemStack(FBItems.BLACK_PIGMENT_JAR);
                user.setStackInHand(hand, itemStack1);
            }
            if (pos.isIn(FBTags.Blocks.CYAN_FLOWERS)) {
                ItemStack itemStack1 = new ItemStack(FBItems.CYAN_PIGMENT_JAR);
                user.setStackInHand(hand, itemStack1);
            }
            world.playSound(user, blockPos, SoundEvents.BLOCK_SWEET_BERRY_BUSH_PICK_BERRIES, SoundCategory.BLOCKS, 1f, 1f);
            return ActionResult.SUCCESS;
        }
        return ActionResult.PASS;
    }
}