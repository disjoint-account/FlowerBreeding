package net.flowerbreeding.pollenvials;

import net.flowerbreeding.FBItems;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jspecify.annotations.NullMarked;

@NullMarked
public class FullPollenVialItem extends Item {
    public FullPollenVialItem(Properties settings) {
        super(settings);
    }

    public InteractionResult use(Level world, Player user, InteractionHand hand) {
        ItemStack itemStack = user.getItemInHand(hand);
        BlockPos blockPos = user.blockPosition();
        ItemStack itemStack1 = new ItemStack(FBItems.EMPTY_POLLEN_VIAL);
        if (!user.hasInfiniteMaterials()) {
            itemStack.shrink(1);
            user.getInventory().placeItemBackInInventory(itemStack1);
            world.playSound(user, blockPos, SoundEvents.BOTTLE_FILL, SoundSource.BLOCKS, 1f, 1f);
            return InteractionResult.SUCCESS;
        }
        else if (user.hasInfiniteMaterials()) {
            user.getInventory().placeItemBackInInventory(itemStack1);
            world.playSound(user, blockPos, SoundEvents.BOTTLE_FILL, SoundSource.BLOCKS, 1f, 1f);
            return InteractionResult.SUCCESS;
        }
        return InteractionResult.TRY_WITH_EMPTY_HAND;
        }
}