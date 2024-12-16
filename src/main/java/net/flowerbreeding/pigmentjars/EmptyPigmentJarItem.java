package net.flowerbreeding.pigmentjars;


import net.flowerbreeding.FBItems;
import net.flowerbreeding.util.FBTags;
import net.minecraft.block.BlockState;
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

public class EmptyPigmentJarItem extends Item {
    public EmptyPigmentJarItem(Settings settings) {
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
        if (state.isIn(FBTags.Blocks.COLOUR_FLOWERS)) {
            ItemStack itemStack1 = new ItemStack(getColour(context));
            if ((qty > 1) && (!user.isInCreativeMode())) {
                itemStack.decrement(1);
                user.getInventory().offerOrDrop(itemStack1);
                world.playSound(user, pos, SoundEvents.BLOCK_SWEET_BERRY_BUSH_PICK_BERRIES, SoundCategory.BLOCKS, 1f, 1f);
                return ActionResult.SUCCESS;
            } else if (user.isInCreativeMode()) {
                user.getInventory().offerOrDrop(itemStack1);
                world.playSound(user, pos, SoundEvents.BLOCK_SWEET_BERRY_BUSH_PICK_BERRIES, SoundCategory.BLOCKS, 1f, 1f);
                return ActionResult.SUCCESS;
            } else if (qty == 1) {
                user.setStackInHand(hand, itemStack1);
                world.playSound(user, pos, SoundEvents.BLOCK_SWEET_BERRY_BUSH_PICK_BERRIES, SoundCategory.BLOCKS, 1f, 1f);
                return ActionResult.SUCCESS;
            }
        }
        return ActionResult.PASS_TO_DEFAULT_BLOCK_ACTION;
    }

        public ItemConvertible getColour(ItemUsageContext context) {
        BlockPos blockPos = context.getBlockPos();
        World world = context.getWorld();
        BlockState pos = world.getBlockState(blockPos);
        if (pos.isIn(FBTags.Blocks.FBFLOWERS)) {
            if (pos.isIn(FBTags.Blocks.MAGENTA_FLOWERS)) {
                return FBItems.MAGENTA_PIGMENT_JAR;
            }
            if (pos.isIn(FBTags.Blocks.BLUE_FLOWERS)) {
                return FBItems.BLUE_PIGMENT_JAR;
            }
            if (pos.isIn(FBTags.Blocks.WHITE_FLOWERS)) {
                return FBItems.WHITE_PIGMENT_JAR;
            }
            if (pos.isIn(FBTags.Blocks.ORANGE_FLOWERS)) {
                return FBItems.ORANGE_PIGMENT_JAR;
            }
            if (pos.isIn(FBTags.Blocks.RED_FLOWERS)) {
                return FBItems.RED_PIGMENT_JAR;
            }
            if (pos.isIn(FBTags.Blocks.YELLOW_FLOWERS)) {
                return FBItems.YELLOW_PIGMENT_JAR;
            }
            if (pos.isIn(FBTags.Blocks.LIGHT_BLUE_FLOWERS)) {
                return FBItems.LIGHT_BLUE_PIGMENT_JAR;
            }
            if (pos.isIn(FBTags.Blocks.PINK_FLOWERS)) {
                return FBItems.PINK_PIGMENT_JAR;
            }
            if (pos.isIn(FBTags.Blocks.BLACK_FLOWERS)) {
                return FBItems.BLACK_PIGMENT_JAR;
            }
            if (pos.isIn(FBTags.Blocks.CYAN_FLOWERS)) {
                return FBItems.CYAN_PIGMENT_JAR;
            }
        }
        return null;
    }
}