package net.flowerbreeding;

import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.MushroomBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import org.jspecify.annotations.NonNull;

public class GlowshroomPlantBlock extends MushroomBlock {

    public GlowshroomPlantBlock(ResourceKey<ConfiguredFeature<?, ?>> featureKey, BlockBehaviour.Properties settings) {
        super(featureKey, settings);
    }

    @Override
    protected boolean canSurvive(@NonNull BlockState state, LevelReader world, BlockPos pos) {
        BlockPos blockPos = pos.below();
        BlockState blockState = world.getBlockState(blockPos);
        return (blockState.is(BlockTags.HUGE_BROWN_MUSHROOM_CAN_PLACE_ON) || blockState.is(BlockTags.HUGE_RED_MUSHROOM_CAN_PLACE_ON) || blockState.is(BlockTags.SUBSTRATE_OVERWORLD)) && this.mayPlaceOn(blockState, world, blockPos);
    }
}