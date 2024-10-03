package net.flowerbreeding;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsage;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class FullPollenVialItem extends Item {
    public FullPollenVialItem(Settings settings) {
        super(settings);
    }

    public TypedActionResult use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        BlockPos blockPos = user.getBlockPos();
        ItemStack itemStack1 = ItemUsage.exchangeStack(itemStack, user, new ItemStack(FBItems.EMPTY_POLLEN_VIAL));
            world.playSound(user, blockPos, SoundEvents.ITEM_BOTTLE_FILL, SoundCategory.BLOCKS, 1f, 1f);
            return TypedActionResult.success(itemStack1);
        }
}