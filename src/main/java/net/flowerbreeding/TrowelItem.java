package net.flowerbreeding;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Items;
import net.minecraft.sounds.SoundSource;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionResult;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FarmlandBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.jspecify.annotations.NonNull;

import java.util.Objects;

public class TrowelItem extends Item {
    public TrowelItem(Item.Properties settings) {
        super(settings);
    }

    @Override
    public @NonNull InteractionResult useOn(UseOnContext context) {
        Level world = context.getLevel();
        BlockPos blockPos = context.getClickedPos();
        BlockState blockState = world.getBlockState(blockPos);
        if (!Objects.requireNonNull(context.getPlayer()).isShiftKeyDown() && !context.getPlayer().getOffhandItem().is(Items.SHIELD)) {
            if (blockState.is(Blocks.GRASS_BLOCK)) {
                world.setBlockAndUpdate(blockPos, FBBlocks.GRASS_FLOWERBED.defaultBlockState());
                context.getPlayer().getItemInHand(context.getHand()).hurtWithoutBreaking(1, context.getPlayer());
                world.playSound(context.getPlayer(), blockPos, SoundEvents.SHOVEL_FLATTEN.value(), SoundSource.BLOCKS, 1.0f, 2.0f);
                return InteractionResult.SUCCESS;
            }
            if (blockState.is(Blocks.DIRT)) {
                world.setBlockAndUpdate(blockPos, FBBlocks.DIRT_FLOWERBED.defaultBlockState());
                context.getPlayer().getItemInHand(context.getHand()).hurtWithoutBreaking(1, context.getPlayer());
                world.playSound(context.getPlayer(), blockPos, SoundEvents.SHOVEL_FLATTEN.value(), SoundSource.BLOCKS, 1f, 2f);
                return InteractionResult.SUCCESS;
            }
            if (blockState.is(Blocks.PODZOL)) {
                world.setBlockAndUpdate(blockPos, FBBlocks.PODZOL_FLOWERBED.defaultBlockState());
                context.getPlayer().getItemInHand(context.getHand()).hurtWithoutBreaking(1, context.getPlayer());
                world.playSound(context.getPlayer(), blockPos, SoundEvents.SHOVEL_FLATTEN.value(), SoundSource.BLOCKS, 1f, 2f);
                return InteractionResult.SUCCESS;
            }
            if (blockState.is(Blocks.FARMLAND)) {
                if (blockState.getValue(FarmlandBlock.MOISTURE) == 7) {
                    world.setBlockAndUpdate(blockPos, FBBlocks.FARMLAND_FLOWERBED.defaultBlockState());
                    context.getPlayer().getItemInHand(context.getHand()).hurtWithoutBreaking(1, context.getPlayer());
                    world.playSound(context.getPlayer(), blockPos, SoundEvents.SHOVEL_FLATTEN.value(), SoundSource.BLOCKS, 1f, 2f);
                    return InteractionResult.SUCCESS;
                }
            }
            if (blockState.is(Blocks.MOSS_BLOCK)) {
                world.setBlockAndUpdate(blockPos, FBBlocks.MOSS_FLOWERBED.defaultBlockState());
                context.getPlayer().getItemInHand(context.getHand()).hurtWithoutBreaking(1, context.getPlayer());
                world.playSound(context.getPlayer(), blockPos, SoundEvents.SHOVEL_FLATTEN.value(), SoundSource.BLOCKS, 1f, 2f);
                return InteractionResult.SUCCESS;
            }
        }
        return InteractionResult.TRY_WITH_EMPTY_HAND;
    }
}