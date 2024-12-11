package net.flowerbreeding.pigmentjars;

import net.flowerbreeding.FBBlocks;
import net.flowerbreeding.FBItems;
import net.flowerbreeding.FlowerBreeding;
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

public class CyanPigmentJarItem extends Item {
    public CyanPigmentJarItem(Settings settings) {
        super(settings);
    }
    public ActionResult useOnBlock(ItemUsageContext context) {
        PlayerEntity user = context.getPlayer();
        Hand hand = context.getHand();
        BlockPos blockPos = context.getBlockPos();
        World world = context.getWorld();
        BlockState pos = world.getBlockState(blockPos);
        //if (FlowerBreeding.CONFIG.fastRecolouring()) {
            if (pos.isIn(FBTags.Blocks.FBFLOWERS)) {
                    ItemStack itemStack1 = new ItemStack(FBItems.EMPTY_PIGMENT_JAR);
                    user.setStackInHand(hand, itemStack1);
                    if (pos.isIn(FBTags.Blocks.ALLIUMS)) {
                        user.getInventory().offerOrDrop(new ItemStack(FBBlocks.CYAN_ALLIUM));
                    }
                    if (pos.isIn(FBTags.Blocks.CORNFLOWERS)) {
                        user.getInventory().offerOrDrop(new ItemStack(FBBlocks.CYAN_CORNFLOWER));
                    }
                    if (pos.isIn(FBTags.Blocks.DAISIES)) {
                        user.getInventory().offerOrDrop(new ItemStack(FBBlocks.CYAN_DAISY));
                    }
                    if (pos.isIn(FBTags.Blocks.TORCHFLOWERS)) {
                        user.getInventory().offerOrDrop(new ItemStack(FBBlocks.CYAN_TORCHFLOWER));
                    }
                    if (pos.isIn(FBTags.Blocks.TULIPS)) {
                        user.getInventory().offerOrDrop(new ItemStack(FBBlocks.CYAN_TULIP));
                    }
                    if (pos.isIn(FBTags.Blocks.AZURE_BLUETS)) {
                        user.getInventory().offerOrDrop(new ItemStack(FBBlocks.CYAN_AZURE_BLUET));
                    }
                    if (pos.isIn(FBTags.Blocks.DANDELIONS)) {
                        user.getInventory().offerOrDrop(new ItemStack(FBBlocks.CYAN_DANDELION));
                    }
                    if (pos.isIn(FBTags.Blocks.ORCHIDS)) {
                        user.getInventory().offerOrDrop(new ItemStack(FBBlocks.CYAN_ORCHID));
                    }
                    if (pos.isIn(FBTags.Blocks.LILIES)) {
                        user.getInventory().offerOrDrop(new ItemStack(FBBlocks.CYAN_LILY));
                    }
                    if (pos.isIn(FBTags.Blocks.POPPIES)) {
                        user.getInventory().offerOrDrop(new ItemStack(FBBlocks.CYAN_POPPY));
                    }
                    if (pos.isIn(FBTags.Blocks.WITHER_ROSES)) {
                        user.getInventory().offerOrDrop(new ItemStack(FBBlocks.CYAN_WITHER_ROSE));
                    }
                    if (pos.isIn(FBTags.Blocks.LILACS)) {
                        user.getInventory().offerOrDrop(new ItemStack(FBBlocks.CYAN_LILAC));
                    }
                    if (pos.isIn(FBTags.Blocks.PEONIES)) {
                        user.getInventory().offerOrDrop(new ItemStack(FBBlocks.CYAN_PEONY));
                    }
                    if (pos.isIn(FBTags.Blocks.PITCHER_PLANTS)) {
                        user.getInventory().offerOrDrop(new ItemStack(Blocks.PITCHER_PLANT));
                    }
                    if (pos.isIn(FBTags.Blocks.ROSE_BUSHES)) {
                        user.getInventory().offerOrDrop(new ItemStack(FBBlocks.CYAN_ROSE_BUSH));
                    }
                    if (pos.isIn(FBTags.Blocks.SUNFLOWERS)) {
                        user.getInventory().offerOrDrop(new ItemStack(FBBlocks.CYAN_SUNFLOWER));
                    }
                    if (pos.isIn(FBTags.Blocks.DAFFODILS)) {
                        user.getInventory().offerOrDrop(new ItemStack(FBBlocks.CYAN_DAFFODIL));
                    }
                    if (pos.isIn(FBTags.Blocks.FOXGLOVES)) {
                        user.getInventory().offerOrDrop(new ItemStack(FBBlocks.CYAN_FOXGLOVE));
                    }
                    if (pos.isIn(FBTags.Blocks.HYACINTHS)) {
                        user.getInventory().offerOrDrop(new ItemStack(FBBlocks.CYAN_HYACINTH));
                    }
                    if (pos.isIn(FBTags.Blocks.PHLOXES)) {
                        user.getInventory().offerOrDrop(new ItemStack(FBBlocks.CYAN_PHLOX));
                    }
                    if (pos.isIn(FBTags.Blocks.LUPINS)) {
                        user.getInventory().offerOrDrop(new ItemStack(FBBlocks.CYAN_LUPIN));
                    }
                    if (pos.isIn(FBTags.Blocks.SMALL_ROSES)) {
                        user.getInventory().offerOrDrop(new ItemStack(FBBlocks.CYAN_SMALL_ROSE));
                    }
                    if (pos.isIn(FBTags.Blocks.LAVENDERS)) {
                        user.getInventory().offerOrDrop(new ItemStack(FBBlocks.CYAN_LAVENDER));
                    }
                    if (pos.isIn(FBTags.Blocks.HYDRANGEAS)) {
                        user.getInventory().offerOrDrop(new ItemStack(FBBlocks.CYAN_HYDRANGEA));
                    }
                    if (pos.isIn(FBTags.Blocks.LOTUS_FLOWERS)) {
                        user.getInventory().offerOrDrop(new ItemStack(FBItems.CYAN_LOTUS_FLOWER));
                    }
                    if (pos.isIn(FBTags.Blocks.JASMINES)) {
                        user.getInventory().offerOrDrop(new ItemStack(FBBlocks.CYAN_JASMINE));
                    }
                    if (pos.isIn(FBTags.Blocks.CYPRUS_VINES)) {
                        user.getInventory().offerOrDrop(new ItemStack(FBBlocks.CYAN_CYPRUS_VINE));
                    }
                    world.playSound(user, blockPos, SoundEvents.BLOCK_SWEET_BERRY_BUSH_PICK_BERRIES, SoundCategory.BLOCKS, 1f, 1f);
                    return ActionResult.SUCCESS;
            }
        //}
        return ActionResult.PASS;
    }
    public ActionResult use(World world, PlayerEntity user, Hand hand) {
        BlockPos blockPos = user.getBlockPos();
        ItemStack itemStack1 = new ItemStack(FBItems.EMPTY_PIGMENT_JAR);
        world.playSound(user, blockPos, SoundEvents.ITEM_BOTTLE_FILL, SoundCategory.BLOCKS, 1f, 1f);
        user.setStackInHand(hand, itemStack1);
        return ActionResult.SUCCESS;
    }
}