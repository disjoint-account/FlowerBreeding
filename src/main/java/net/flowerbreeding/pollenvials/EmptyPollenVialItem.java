package net.flowerbreeding.pollenvials;

import net.flowerbreeding.FBItems;
import net.flowerbreeding.util.FBTags;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
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

public class EmptyPollenVialItem extends Item {
    public EmptyPollenVialItem(Settings settings) {
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
        if (state.isIn(FBTags.Blocks.POLLEN_PLANTS)) {
            ItemStack itemStack1 = new ItemStack(getFlower(context));
            if (!user.isInCreativeMode()) {
                itemStack.decrement(1);
                user.getInventory().offerOrDrop(itemStack1);
                world.playSound(user, pos, SoundEvents.BLOCK_SWEET_BERRY_BUSH_PICK_BERRIES, SoundCategory.BLOCKS, 1f, 1f);
                return ActionResult.SUCCESS;
            } else if (user.isInCreativeMode()) {
                user.getInventory().offerOrDrop(itemStack1);
                world.playSound(user, pos, SoundEvents.BLOCK_SWEET_BERRY_BUSH_PICK_BERRIES, SoundCategory.BLOCKS, 1f, 1f);
                return ActionResult.SUCCESS;
            }
        }
        return ActionResult.PASS_TO_DEFAULT_BLOCK_ACTION;
    }

        public ItemConvertible getFlower(ItemUsageContext context) {
            BlockPos blockPos = context.getBlockPos();
            World world = context.getWorld();
            BlockState state = world.getBlockState(blockPos);
                if (state.isIn(FBTags.Blocks.ALLIUMS)) {
                    return FBItems.ALLIUM_POLLEN_VIAL;
                }
                if (state.isIn(FBTags.Blocks.CORNFLOWERS)) {
                    return FBItems.CORNFLOWER_POLLEN_VIAL;
                }
                if (state.isIn(FBTags.Blocks.DAISIES)) {
                    return FBItems.DAISY_POLLEN_VIAL;
                }
                if (state.isIn(FBTags.Blocks.TORCHFLOWERS)) {
                    return FBItems.TORCHFLOWER_POLLEN_VIAL;
                }
                if (state.isIn(FBTags.Blocks.TULIPS)) {
                    return FBItems.TULIP_POLLEN_VIAL;
                }
                if (state.isIn(FBTags.Blocks.AZURE_BLUETS)) {
                    return FBItems.AZURE_BLUET_POLLEN_VIAL;
                }
                if (state.isIn(FBTags.Blocks.DANDELIONS)) {
                    return FBItems.DANDELION_POLLEN_VIAL;
                }
                if (state.isIn(FBTags.Blocks.ORCHIDS)) {
                    return FBItems.ORCHID_POLLEN_VIAL;
                }
                if (state.isIn(FBTags.Blocks.LILIES)) {
                    return FBItems.LILY_POLLEN_VIAL;
                }
                if (state.isIn(FBTags.Blocks.POPPIES)) {
                    return FBItems.POPPY_POLLEN_VIAL;
                }
                if (state.isIn(FBTags.Blocks.WITHER_ROSES)) {
                    return FBItems.WITHER_ROSE_POLLEN_VIAL;
                }
                if (state.isIn(FBTags.Blocks.OPEN_EYEBLOSSOMS)) {
                    return FBItems.EYEBLOSSOM_POLLEN_VIAL;
                }
                if (state.isIn(FBTags.Blocks.LILACS)) {
                    return FBItems.LILAC_POLLEN_VIAL;
                }
                if (state.isIn(FBTags.Blocks.PEONIES)) {
                    return FBItems.PEONY_POLLEN_VIAL;
                }
                if (state.isIn(FBTags.Blocks.PITCHER_PLANTS)) {
                    return FBItems.PITCHER_PLANT_POLLEN_VIAL;
                }
                if (state.isIn(FBTags.Blocks.ROSE_BUSHES)) {
                    return FBItems.ROSE_BUSH_POLLEN_VIAL;
                }
                if (state.isIn(FBTags.Blocks.SUNFLOWERS)) {
                    return FBItems.SUNFLOWER_POLLEN_VIAL;
                }
                if (state.isOf(Blocks.SWEET_BERRY_BUSH)) {
                    return FBItems.SWEET_BERRY_POLLEN_VIAL;
                }
                if (state.isOf(Blocks.CAVE_VINES)) {
                    return FBItems.GLOW_VINE_POLLEN_VIAL;
                }
                if (state.isOf(Blocks.VINE)) {
                    return FBItems.VINE_POLLEN_VIAL;
                }
                if (state.isOf(Blocks.LILY_PAD)) {
                    return FBItems.LILY_PAD_POLLEN_VIAL;
                }
                if (state.isIn(FBTags.Blocks.MUSHROOMS)) {
                    return FBItems.MUSHROOM_POLLEN_VIAL;
                }
                if (state.isIn(FBTags.Blocks.FROGLIGHTS)) {
                    return FBItems.FROGLIGHT_POLLEN_VIAL;
                }
            return null;
        }
}
