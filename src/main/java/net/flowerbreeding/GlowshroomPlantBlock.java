package net.flowerbreeding;

import net.minecraft.block.*;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldView;
import net.minecraft.world.gen.feature.ConfiguredFeature;

public class GlowshroomPlantBlock extends MushroomPlantBlock {

    public GlowshroomPlantBlock(RegistryKey<ConfiguredFeature<?, ?>> featureKey, AbstractBlock.Settings settings) {
        super(featureKey, settings);
    }

    @Override
    protected boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        BlockPos blockPos = pos.down();
        BlockState blockState = world.getBlockState(blockPos);
        return (blockState.isIn(BlockTags.MUSHROOM_GROW_BLOCK) || blockState.isIn(BlockTags.DIRT)) && this.canPlantOnTop(blockState, world, blockPos);
    }
}