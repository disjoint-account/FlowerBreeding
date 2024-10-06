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
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class OrangePigmentJarItem extends Item {
    public OrangePigmentJarItem(Settings settings) {
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
                if (pos.isIn(FBTags.Blocks.ORANGE_FLOWERS))
                    return ActionResult.PASS;
                else {
                    ItemStack itemStack1 = ItemUsage.exchangeStack(itemStack, user, new ItemStack(FBItems.EMPTY_PIGMENT_JAR));
                    user.setStackInHand(hand, itemStack1);
                    if (pos.isIn(FBTags.Blocks.ALLIUMS)) {
                        user.getInventory().offerOrDrop(new ItemStack(FBBlocks.ORANGE_ALLIUM));
                    }
                    if (pos.isIn(FBTags.Blocks.CORNFLOWERS)) {
                        user.getInventory().offerOrDrop(new ItemStack(FBBlocks.ORANGE_CORNFLOWER));
                    }
                    if (pos.isIn(FBTags.Blocks.DAISIES)) {
                        user.getInventory().offerOrDrop(new ItemStack(FBBlocks.ORANGE_DAISY));
                    }
                    if (pos.isIn(FBTags.Blocks.TORCHFLOWERS)) {
                        user.getInventory().offerOrDrop(new ItemStack(Blocks.TORCHFLOWER));
                    }
                    if (pos.isIn(FBTags.Blocks.TULIPS)) {
                        user.getInventory().offerOrDrop(new ItemStack(Blocks.ORANGE_TULIP));
                    }
                    if (pos.isIn(FBTags.Blocks.AZURE_BLUETS)) {
                        user.getInventory().offerOrDrop(new ItemStack(FBBlocks.ORANGE_AZURE_BLUET));
                    }
                    if (pos.isIn(FBTags.Blocks.DANDELIONS)) {
                        user.getInventory().offerOrDrop(new ItemStack(FBBlocks.ORANGE_DANDELION));
                    }
                    if (pos.isIn(FBTags.Blocks.ORCHIDS)) {
                        user.getInventory().offerOrDrop(new ItemStack(FBBlocks.ORANGE_ORCHID));
                    }
                    if (pos.isIn(FBTags.Blocks.LILIES)) {
                        user.getInventory().offerOrDrop(new ItemStack(FBBlocks.ORANGE_LILY));
                    }
                    if (pos.isIn(FBTags.Blocks.POPPIES)) {
                        user.getInventory().offerOrDrop(new ItemStack(FBBlocks.ORANGE_POPPY));
                    }
                    if (pos.isIn(FBTags.Blocks.WITHER_ROSES)) {
                        user.getInventory().offerOrDrop(new ItemStack(FBBlocks.ORANGE_WITHER_ROSE));
                    }
                    if (pos.isIn(FBTags.Blocks.LILACS)) {
                        user.getInventory().offerOrDrop(new ItemStack(FBBlocks.ORANGE_LILAC));
                    }
                    if (pos.isIn(FBTags.Blocks.PEONIES)) {
                        user.getInventory().offerOrDrop(new ItemStack(FBBlocks.ORANGE_PEONY));
                    }
                    if (pos.isIn(FBTags.Blocks.PITCHER_PLANTS)) {
                        user.getInventory().offerOrDrop(new ItemStack(FBBlocks.ORANGE_PITCHER_PLANT));
                    }
                    if (pos.isIn(FBTags.Blocks.ROSE_BUSHES)) {
                        user.getInventory().offerOrDrop(new ItemStack(FBBlocks.ORANGE_ROSE_BUSH));
                    }
                    if (pos.isIn(FBTags.Blocks.SUNFLOWERS)) {
                        user.getInventory().offerOrDrop(new ItemStack(FBBlocks.ORANGE_SUNFLOWER));
                    }
                    if (pos.isIn(FBTags.Blocks.DAFFODILS)) {
                        user.getInventory().offerOrDrop(new ItemStack(FBBlocks.ORANGE_DAFFODIL));
                    }
                    if (pos.isIn(FBTags.Blocks.FOXGLOVES)) {
                        user.getInventory().offerOrDrop(new ItemStack(FBBlocks.ORANGE_FOXGLOVE));
                    }
                    if (pos.isIn(FBTags.Blocks.HYACINTHS)) {
                        user.getInventory().offerOrDrop(new ItemStack(FBBlocks.ORANGE_HYACINTH));
                    }
                    if (pos.isIn(FBTags.Blocks.LAVENDERS)) {
                        user.getInventory().offerOrDrop(new ItemStack(FBBlocks.ORANGE_LAVENDER));
                    }
                    if (pos.isIn(FBTags.Blocks.PHLOXES)) {
                        user.getInventory().offerOrDrop(new ItemStack(FBBlocks.ORANGE_PHLOX));
                    }
                    if (pos.isIn(FBTags.Blocks.LOTUS_FLOWERS)) {
                        user.getInventory().offerOrDrop(new ItemStack(FBItems.ORANGE_LOTUS_FLOWER));
                    }
                    world.playSound(user, blockPos, SoundEvents.BLOCK_SWEET_BERRY_BUSH_PICK_BERRIES, SoundCategory.BLOCKS, 1f, 1f);
                    return ActionResult.SUCCESS;
            }
        }
        return ActionResult.PASS;
    }
    public TypedActionResult use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        BlockPos blockPos = user.getBlockPos();
        ItemStack itemStack1 = ItemUsage.exchangeStack(itemStack, user, new ItemStack(FBItems.EMPTY_PIGMENT_JAR));
        world.playSound(user, blockPos, SoundEvents.ITEM_BOTTLE_FILL, SoundCategory.BLOCKS, 1f, 1f);
        return TypedActionResult.success(itemStack1);
    }
}