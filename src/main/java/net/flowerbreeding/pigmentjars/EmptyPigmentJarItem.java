package net.flowerbreeding.pigmentjars;


import net.flowerbreeding.FBItems;
import net.flowerbreeding.util.FBTags;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.sounds.SoundSource;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import org.jspecify.annotations.NonNull;

public class EmptyPigmentJarItem extends Item {
    public EmptyPigmentJarItem(Properties settings) {
        super(settings);
    }

    public @NonNull InteractionResult useOn(UseOnContext context) {
        Player user = context.getPlayer();
        InteractionHand hand = context.getHand();
        BlockPos pos = context.getClickedPos();
        Level world = context.getLevel();
        BlockState state = world.getBlockState(pos);
        assert user != null;
        ItemStack itemStack = user.getItemInHand(hand);
        int qty = JarCounter.countJars(user);
        if (state.is(FBTags.Blocks.COLOUR_FLOWERS)) {
            ItemStack itemStack1 = new ItemStack(getColour(context));
            if ((qty > 1) && (!user.hasInfiniteMaterials())) {
                itemStack.shrink(1);
                user.getInventory().placeItemBackInInventory(itemStack1);
                world.playSound(user, pos, SoundEvents.SWEET_BERRY_BUSH_PICK_BERRIES, SoundSource.BLOCKS, 1f, 1f);
                return InteractionResult.SUCCESS;
            } else if (user.hasInfiniteMaterials()) {
                user.getInventory().placeItemBackInInventory(itemStack1);
                world.playSound(user, pos, SoundEvents.SWEET_BERRY_BUSH_PICK_BERRIES, SoundSource.BLOCKS, 1f, 1f);
                return InteractionResult.SUCCESS;
            } else if (qty == 1) {
                user.setItemInHand(hand, itemStack1);
                world.playSound(user, pos, SoundEvents.SWEET_BERRY_BUSH_PICK_BERRIES, SoundSource.BLOCKS, 1f, 1f);
                return InteractionResult.SUCCESS;
            }
        }
        return InteractionResult.TRY_WITH_EMPTY_HAND;
    }

        public ItemLike getColour(UseOnContext context) {
        BlockPos blockPos = context.getClickedPos();
        Level world = context.getLevel();
        BlockState pos = world.getBlockState(blockPos);
        if (pos.is(FBTags.Blocks.COLOUR_FLOWERS)) {
            if (pos.is(FBTags.Blocks.MAGENTA_FLOWERS)) {
                return FBItems.MAGENTA_PIGMENT_JAR;
            }
            if (pos.is(FBTags.Blocks.BLUE_FLOWERS)) {
                return FBItems.BLUE_PIGMENT_JAR;
            }
            if (pos.is(FBTags.Blocks.WHITE_FLOWERS)) {
                return FBItems.WHITE_PIGMENT_JAR;
            }
            if (pos.is(FBTags.Blocks.ORANGE_FLOWERS)) {
                return FBItems.ORANGE_PIGMENT_JAR;
            }
            if (pos.is(FBTags.Blocks.RED_FLOWERS)) {
                return FBItems.RED_PIGMENT_JAR;
            }
            if (pos.is(FBTags.Blocks.YELLOW_FLOWERS)) {
                return FBItems.YELLOW_PIGMENT_JAR;
            }
            if (pos.is(FBTags.Blocks.LIGHT_BLUE_FLOWERS)) {
                return FBItems.LIGHT_BLUE_PIGMENT_JAR;
            }
            if (pos.is(FBTags.Blocks.PINK_FLOWERS)) {
                return FBItems.PINK_PIGMENT_JAR;
            }
            if (pos.is(FBTags.Blocks.BLACK_FLOWERS)) {
                return FBItems.BLACK_PIGMENT_JAR;
            }
            if (pos.is(FBTags.Blocks.CYAN_FLOWERS)) {
                return FBItems.CYAN_PIGMENT_JAR;
            }
        }
        return null;
    }
}