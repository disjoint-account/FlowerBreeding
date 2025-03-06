package net.flowerbreeding;

import net.minecraft.block.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Objects;

public class TrowelItem extends Item {
    public TrowelItem(Item.Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        BlockPos blockPos = context.getBlockPos();
        BlockState blockState = world.getBlockState(blockPos);
        if (!Objects.requireNonNull(context.getPlayer()).isSneaking() && !context.getPlayer().getOffHandStack().isOf(Items.SHIELD)) {
            if (blockState.isOf(Blocks.GRASS_BLOCK)) {
                world.setBlockState(blockPos, FBBlocks.GRASS_FLOWERBED.getDefaultState());
                context.getPlayer().getStackInHand(context.getHand()).damage(1, context.getPlayer());
                world.playSound(context.getPlayer(), blockPos, SoundEvents.ITEM_SHOVEL_FLATTEN, SoundCategory.BLOCKS, 1f, 2f);
                return ActionResult.SUCCESS;
            }
            if (blockState.isOf(Blocks.DIRT)) {
                world.setBlockState(blockPos, FBBlocks.DIRT_FLOWERBED.getDefaultState());
                context.getPlayer().getStackInHand(context.getHand()).damage(1, context.getPlayer());
                world.playSound(context.getPlayer(), blockPos, SoundEvents.ITEM_SHOVEL_FLATTEN, SoundCategory.BLOCKS, 1f, 2f);
                return ActionResult.SUCCESS;
            }
            if (blockState.isOf(Blocks.PODZOL)) {
                world.setBlockState(blockPos, FBBlocks.PODZOL_FLOWERBED.getDefaultState());
                context.getPlayer().getStackInHand(context.getHand()).damage(1, context.getPlayer());
                world.playSound(context.getPlayer(), blockPos, SoundEvents.ITEM_SHOVEL_FLATTEN, SoundCategory.BLOCKS, 1f, 2f);
                return ActionResult.SUCCESS;
            }
            if (blockState.isOf(Blocks.FARMLAND)) {
                if (blockState.get(FarmlandBlock.MOISTURE) == 7) {
                    world.setBlockState(blockPos, FBBlocks.FARMLAND_FLOWERBED.getDefaultState());
                    context.getPlayer().getStackInHand(context.getHand()).damage(1, context.getPlayer());
                    world.playSound(context.getPlayer(), blockPos, SoundEvents.ITEM_SHOVEL_FLATTEN, SoundCategory.BLOCKS, 1f, 2f);
                    return ActionResult.SUCCESS;
                }
            }
            if (blockState.isOf(Blocks.MOSS_BLOCK)) {
                world.setBlockState(blockPos, FBBlocks.MOSS_FLOWERBED.getDefaultState());
                context.getPlayer().getStackInHand(context.getHand()).damage(1, context.getPlayer());
                world.playSound(context.getPlayer(), blockPos, SoundEvents.ITEM_SHOVEL_FLATTEN, SoundCategory.BLOCKS, 1f, 2f);
                return ActionResult.SUCCESS;
            }
        }
        return ActionResult.PASS_TO_DEFAULT_BLOCK_ACTION;
    }
}