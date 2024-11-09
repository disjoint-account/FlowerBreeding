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
import net.minecraft.item.ItemUsage;
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
        ItemStack itemStack = user.getStackInHand(hand);
        BlockPos blockPos = context.getBlockPos();
        World world = context.getWorld();
        BlockState pos = world.getBlockState(blockPos);
        if (FlowerBreeding.CONFIG.fastRecolouring()) {
            if (pos.isIn(FBTags.Blocks.FBFLOWERS)) {
                    ItemStack itemStack1 = ItemUsage.exchangeStack(itemStack, user, new ItemStack(FBItems.EMPTY_PIGMENT_JAR));
                    user.setStackInHand(hand, itemStack1);
                    if (pos.isIn(FBTags.Blocks.ALLIUMS)) {
                        user.getInventory().offerOrDrop(new ItemStack(Blocks.ALLIUM));
                    }
                    if (pos.isIn(FBTags.Blocks.CORNFLOWERS)) {
                        user.getInventory().offerOrDrop(new ItemStack(FBBlocks.MAGENTA_CORNFLOWER));
                    }
                    if (pos.isIn(FBTags.Blocks.DAISIES)) {
                        user.getInventory().offerOrDrop(new ItemStack(FBBlocks.MAGENTA_DAISY));
                    }
                    if (pos.isIn(FBTags.Blocks.TORCHFLOWERS)) {
                        user.getInventory().offerOrDrop(new ItemStack(FBBlocks.MAGENTA_TORCHFLOWER));
                    }
                    if (pos.isIn(FBTags.Blocks.TULIPS)) {
                        user.getInventory().offerOrDrop(new ItemStack(FBBlocks.MAGENTA_TULIP));
                    }
                    if (pos.isIn(FBTags.Blocks.AZURE_BLUETS)) {
                        user.getInventory().offerOrDrop(new ItemStack(FBBlocks.MAGENTA_AZURE_BLUET));
                    }
                    if (pos.isIn(FBTags.Blocks.DANDELIONS)) {
                        user.getInventory().offerOrDrop(new ItemStack(FBBlocks.MAGENTA_DANDELION));
                    }
                    if (pos.isIn(FBTags.Blocks.ORCHIDS)) {
                        user.getInventory().offerOrDrop(new ItemStack(FBBlocks.MAGENTA_ORCHID));
                    }
                    if (pos.isIn(FBTags.Blocks.LILIES)) {
                        user.getInventory().offerOrDrop(new ItemStack(FBBlocks.MAGENTA_LILY));
                    }
                    if (pos.isIn(FBTags.Blocks.POPPIES)) {
                        user.getInventory().offerOrDrop(new ItemStack(FBBlocks.MAGENTA_POPPY));
                    }
                    if (pos.isIn(FBTags.Blocks.LILACS)) {
                        user.getInventory().offerOrDrop(new ItemStack(FBBlocks.MAGENTA_LILAC));
                    }
                    if (pos.isIn(FBTags.Blocks.PEONIES)) {
                        user.getInventory().offerOrDrop(new ItemStack(FBBlocks.MAGENTA_PEONY));
                    }
                    if (pos.isIn(FBTags.Blocks.PITCHER_PLANTS)) {
                        user.getInventory().offerOrDrop(new ItemStack(FBBlocks.MAGENTA_PITCHER_PLANT));
                    }
                    if (pos.isIn(FBTags.Blocks.ROSE_BUSHES)) {
                        user.getInventory().offerOrDrop(new ItemStack(FBBlocks.MAGENTA_ROSE_BUSH));
                    }
                    if (pos.isIn(FBTags.Blocks.SUNFLOWERS)) {
                        user.getInventory().offerOrDrop(new ItemStack(FBBlocks.MAGENTA_SUNFLOWER));
                    }
                    if (pos.isIn(FBTags.Blocks.DAFFODILS)) {
                        user.getInventory().offerOrDrop(new ItemStack(FBBlocks.MAGENTA_DAFFODIL));
                    }
                    if (pos.isIn(FBTags.Blocks.FOXGLOVES)) {
                        user.getInventory().offerOrDrop(new ItemStack(FBBlocks.MAGENTA_FOXGLOVE));
                    }
                    if (pos.isIn(FBTags.Blocks.HYACINTHS)) {
                        user.getInventory().offerOrDrop(new ItemStack(FBBlocks.MAGENTA_HYACINTH));
                    }
                    if (pos.isIn(FBTags.Blocks.PHLOXES)) {
                        user.getInventory().offerOrDrop(new ItemStack(FBBlocks.MAGENTA_PHLOX));
                    }
                    if (pos.isIn(FBTags.Blocks.LUPINS)) {
                        user.getInventory().offerOrDrop(new ItemStack(FBBlocks.MAGENTA_LUPIN));
                    }
                    if (pos.isIn(FBTags.Blocks.SMALL_ROSES)) {
                        user.getInventory().offerOrDrop(new ItemStack(FBBlocks.MAGENTA_SMALL_ROSE));
                    }
                    if (pos.isIn(FBTags.Blocks.LAVENDERS)) {
                        user.getInventory().offerOrDrop(new ItemStack(FBBlocks.MAGENTA_LAVENDER));
                    }
                    if (pos.isIn(FBTags.Blocks.HYDRANGEAS)) {
                        user.getInventory().offerOrDrop(new ItemStack(FBBlocks.MAGENTA_HYDRANGEA));
                    }
                    if (pos.isIn(FBTags.Blocks.LOTUS_FLOWERS)) {
                        user.getInventory().offerOrDrop(new ItemStack(FBItems.MAGENTA_LOTUS_FLOWER));
                    }
                    if (pos.isIn(FBTags.Blocks.JASMINES)) {
                        user.getInventory().offerOrDrop(new ItemStack(FBBlocks.MAGENTA_JASMINE));
                    }
                    if (pos.isIn(FBTags.Blocks.CYPRUS_VINES)) {
                        user.getInventory().offerOrDrop(new ItemStack(FBBlocks.MAGENTA_CYPRUS_VINE));
                    }
                    world.playSound(user, blockPos, SoundEvents.BLOCK_SWEET_BERRY_BUSH_PICK_BERRIES, SoundCategory.BLOCKS, 1f, 1f);
                    return ActionResult.SUCCESS;
            }
        }
        return ActionResult.PASS;
    }
    public ActionResult use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        BlockPos blockPos = user.getBlockPos();
        ItemStack itemStack1 = ItemUsage.exchangeStack(itemStack, user, new ItemStack(FBItems.EMPTY_PIGMENT_JAR));
        world.playSound(user, blockPos, SoundEvents.ITEM_BOTTLE_FILL, SoundCategory.BLOCKS, 1f, 1f);
        return ActionResult.SUCCESS;
    }
}