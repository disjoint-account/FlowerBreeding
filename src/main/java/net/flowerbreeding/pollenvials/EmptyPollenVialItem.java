package net.flowerbreeding.pollenvials;


import net.flowerbreeding.FBItems;
import net.flowerbreeding.util.FBTags;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
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

public class EmptyPollenVialItem extends Item {
    public EmptyPollenVialItem(Settings settings) {
        super(settings);
    }

    public ActionResult useOnBlock(ItemUsageContext context) {
        PlayerEntity user = context.getPlayer();
        Hand hand = context.getHand();
        BlockPos blockPos = context.getBlockPos();
        World world = context.getWorld();
        BlockState pos = world.getBlockState(blockPos);
        if (pos.isIn(FBTags.Blocks.POLLEN_PLANTS)) {
                if (pos.isIn(FBTags.Blocks.ALLIUMS)) {
                    ItemStack itemStack1 = new ItemStack(FBItems.ALLIUM_POLLEN_VIAL);
                    user.setStackInHand(hand, itemStack1);
                }
                if (pos.isIn(FBTags.Blocks.CORNFLOWERS)) {
                    ItemStack itemStack2 = new ItemStack(FBItems.CORNFLOWER_POLLEN_VIAL);
                    user.setStackInHand(hand, itemStack2);
                }
                if (pos.isIn(FBTags.Blocks.DAISIES)) {
                    ItemStack itemStack1 = new ItemStack(FBItems.DAISY_POLLEN_VIAL);
                    user.setStackInHand(hand, itemStack1);
                }
                if (pos.isIn(FBTags.Blocks.TORCHFLOWERS)) {
                    ItemStack itemStack1 = new ItemStack(FBItems.TORCHFLOWER_POLLEN_VIAL);
                    user.setStackInHand(hand, itemStack1);
                }
                if (pos.isIn(FBTags.Blocks.TULIPS)) {
                    ItemStack itemStack1 = new ItemStack(FBItems.TULIP_POLLEN_VIAL);
                    user.setStackInHand(hand, itemStack1);
                }
                if (pos.isIn(FBTags.Blocks.AZURE_BLUETS)) {
                    ItemStack itemStack1 = new ItemStack(FBItems.AZURE_BLUET_POLLEN_VIAL);
                    user.setStackInHand(hand, itemStack1);
                }
                if (pos.isIn(FBTags.Blocks.DANDELIONS)) {
                    ItemStack itemStack1 = new ItemStack(FBItems.DANDELION_POLLEN_VIAL);
                    user.setStackInHand(hand, itemStack1);
                }
                if (pos.isIn(FBTags.Blocks.ORCHIDS)) {
                    ItemStack itemStack1 = new ItemStack(FBItems.ORCHID_POLLEN_VIAL);
                    user.setStackInHand(hand, itemStack1);
                }
                if (pos.isIn(FBTags.Blocks.LILIES)) {
                    ItemStack itemStack1 = new ItemStack(FBItems.LILY_POLLEN_VIAL);
                    user.setStackInHand(hand, itemStack1);
                }
                if (pos.isIn(FBTags.Blocks.POPPIES)) {
                    ItemStack itemStack1 = new ItemStack(FBItems.POPPY_POLLEN_VIAL);
                    user.setStackInHand(hand, itemStack1);
                }
                if (pos.isIn(FBTags.Blocks.WITHER_ROSES)) {
                    ItemStack itemStack1 = new ItemStack(FBItems.WITHER_ROSE_POLLEN_VIAL);
                    user.setStackInHand(hand, itemStack1);
                }
                if (pos.isIn(FBTags.Blocks.OPEN_EYEBLOSSOMS)) {
                    ItemStack itemStack1 = new ItemStack(FBItems.EYEBLOSSOM_POLLEN_VIAL);
                    user.setStackInHand(hand, itemStack1);
                }
                if (pos.isIn(FBTags.Blocks.LILACS)) {
                    ItemStack itemStack1 = new ItemStack(FBItems.LILAC_POLLEN_VIAL);
                    user.setStackInHand(hand, itemStack1);
                }
                if (pos.isIn(FBTags.Blocks.PEONIES)) {
                    ItemStack itemStack1 = new ItemStack(FBItems.PEONY_POLLEN_VIAL);
                    user.setStackInHand(hand, itemStack1);
                }
                if (pos.isIn(FBTags.Blocks.PITCHER_PLANTS)) {
                    ItemStack itemStack1 = new ItemStack(FBItems.PITCHER_PLANT_POLLEN_VIAL);
                    user.setStackInHand(hand, itemStack1);
                }
                if (pos.isIn(FBTags.Blocks.ROSE_BUSHES)) {
                    ItemStack itemStack1 = new ItemStack(FBItems.ROSE_BUSH_POLLEN_VIAL);
                    user.setStackInHand(hand, itemStack1);
                }
                if (pos.isIn(FBTags.Blocks.SUNFLOWERS)) {
                    ItemStack itemStack1 = new ItemStack(FBItems.SUNFLOWER_POLLEN_VIAL);
                    user.setStackInHand(hand, itemStack1);
                }
                if (pos.isOf(Blocks.SWEET_BERRY_BUSH)) {
                    ItemStack itemStack1 = new ItemStack(FBItems.SWEET_BERRY_POLLEN_VIAL);
                    user.setStackInHand(hand, itemStack1);
                }
                if (pos.isOf(Blocks.CAVE_VINES)) {
                    ItemStack itemStack1 = new ItemStack(FBItems.GLOW_VINE_POLLEN_VIAL);
                    user.setStackInHand(hand, itemStack1);
                }
                if (pos.isOf(Blocks.VINE)) {
                    ItemStack itemStack1 = new ItemStack(FBItems.VINE_POLLEN_VIAL);
                    user.setStackInHand(hand, itemStack1);
                }
                if (pos.isOf(Blocks.LILY_PAD)) {
                    ItemStack itemStack1 = new ItemStack(FBItems.LILY_PAD_POLLEN_VIAL);
                    user.setStackInHand(hand, itemStack1);
                }
                world.playSound(user, blockPos, SoundEvents.BLOCK_SWEET_BERRY_BUSH_PICK_BERRIES, SoundCategory.BLOCKS, 1f, 1f);
                return ActionResult.SUCCESS;
                }
        return ActionResult.PASS;
    }
}