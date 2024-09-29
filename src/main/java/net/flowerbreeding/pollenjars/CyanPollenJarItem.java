package net.flowerbreeding.pollenjars;

import net.flowerbreeding.FBBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsage;
import net.minecraft.stat.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.World;

public class CyanPollenJarItem extends Item {
    public CyanPollenJarItem(Settings settings) {
        super(settings);
    }

    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        BlockHitResult blockHitResult = raycast(world, user, RaycastContext.FluidHandling.SOURCE_ONLY);
        if (blockHitResult.getType() == HitResult.Type.MISS) {
            return TypedActionResult.pass(itemStack);
        } else {
            if (blockHitResult.getType() == HitResult.Type.BLOCK) {
                BlockPos blockPos = blockHitResult.getBlockPos();
                if (!world.canPlayerModifyAt(user, blockPos)) {
                    return TypedActionResult.pass(itemStack);
                }

                if (world.getBlockState(blockPos).isOf(Blocks.CORNFLOWER)) {
                    return TypedActionResult.success(this.fill(itemStack, user, new ItemStack(FBBlocks.CYAN_CORNFLOWER)), world.isClient());
                }
                if (world.getBlockState(blockPos).isOf(Blocks.OXEYE_DAISY)) {
                    return TypedActionResult.success(this.fill(itemStack, user, new ItemStack(FBBlocks.CYAN_DAISY)), world.isClient());
                }
                if (world.getBlockState(blockPos).isOf(Blocks.TORCHFLOWER)) {
                    return TypedActionResult.success(this.fill(itemStack, user, new ItemStack(FBBlocks.CYAN_TORCHFLOWER)), world.isClient());
                }
                if (world.getBlockState(blockPos).isOf(Blocks.RED_TULIP)) {
                    return TypedActionResult.success(this.fill(itemStack, user, new ItemStack(FBBlocks.CYAN_TULIP)), world.isClient());
                }
                if (world.getBlockState(blockPos).isOf(Blocks.AZURE_BLUET)) {
                    return TypedActionResult.success(this.fill(itemStack, user, new ItemStack(FBBlocks.CYAN_AZURE_BLUET)), world.isClient());
                }
                if (world.getBlockState(blockPos).isOf(Blocks.DANDELION)) {
                    return TypedActionResult.success(this.fill(itemStack, user, new ItemStack(FBBlocks.CYAN_DANDELION)), world.isClient());
                }
                if (world.getBlockState(blockPos).isOf(Blocks.ORANGE_TULIP)) {
                    return TypedActionResult.success(this.fill(itemStack, user, new ItemStack(FBBlocks.CYAN_TULIP)), world.isClient());
                }
                if (world.getBlockState(blockPos).isOf(Blocks.WHITE_TULIP)) {
                    return TypedActionResult.success(this.fill(itemStack, user, new ItemStack(FBBlocks.CYAN_TULIP)), world.isClient());
                }
                if (world.getBlockState(blockPos).isOf(Blocks.BLUE_ORCHID)) {
                    return TypedActionResult.success(this.fill(itemStack, user, new ItemStack(FBBlocks.CYAN_ALLIUM)), world.isClient());
                }
                if (world.getBlockState(blockPos).isOf(Blocks.LILY_OF_THE_VALLEY)) {
                    return TypedActionResult.success(this.fill(itemStack, user, new ItemStack(FBBlocks.CYAN_LILY)), world.isClient());
                }
                if (world.getBlockState(blockPos).isOf(Blocks.POPPY)) {
                    return TypedActionResult.success(this.fill(itemStack, user, new ItemStack(FBBlocks.CYAN_POPPY)), world.isClient());
                }
                if (world.getBlockState(blockPos).isOf(Blocks.PINK_TULIP)) {
                    return TypedActionResult.success(this.fill(itemStack, user, new ItemStack(FBBlocks.CYAN_TULIP)), world.isClient());
                }
                if (world.getBlockState(blockPos).isOf(Blocks.WITHER_ROSE)) {
                    return TypedActionResult.success(this.fill(itemStack, user, new ItemStack(FBBlocks.CYAN_WITHER_ROSE)), world.isClient());
                }
                if (world.getBlockState(blockPos).isOf(Blocks.LILAC)) {
                    return TypedActionResult.success(this.fill(itemStack, user, new ItemStack(FBBlocks.CYAN_LILAC)), world.isClient());
                }
                if (world.getBlockState(blockPos).isOf(Blocks.PEONY)) {
                    return TypedActionResult.success(this.fill(itemStack, user, new ItemStack(FBBlocks.CYAN_PEONY)), world.isClient());
                }
                if (world.getBlockState(blockPos).isOf(Blocks.PITCHER_PLANT)) {
                    return TypedActionResult.success(this.fill(itemStack, user, new ItemStack(FBBlocks.CYAN_PITCHER_PLANT)), world.isClient());
                }
                if (world.getBlockState(blockPos).isOf(Blocks.ROSE_BUSH)) {
                    return TypedActionResult.success(this.fill(itemStack, user, new ItemStack(FBBlocks.CYAN_ROSE)), world.isClient());
                }
                if (world.getBlockState(blockPos).isOf(Blocks.SUNFLOWER)) {
                    return TypedActionResult.success(this.fill(itemStack, user, new ItemStack(FBBlocks.CYAN_SUNFLOWER)), world.isClient());
                }
            }
        }
        return TypedActionResult.pass(itemStack);
    }

    protected ItemStack fill(ItemStack stack, PlayerEntity player, ItemStack outputStack) {
        player.incrementStat(Stats.USED.getOrCreateStat(this));
        return ItemUsage.exchangeStack(stack, player, outputStack);
    }
}