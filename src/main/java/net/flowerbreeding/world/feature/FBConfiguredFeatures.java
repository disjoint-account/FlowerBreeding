package net.flowerbreeding.world.feature;

import net.flowerbreeding.FBBlocks;
import net.flowerbreeding.FlowerBreeding;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;
import net.minecraft.world.gen.blockpredicate.BlockPredicate;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;

public class FBConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> SAGE_KEY = registerKey("sage");


    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {

        register(context, SAGE_KEY, Feature.RANDOM_PATCH, new RandomPatchFeatureConfig(32, 4, 1, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(FBBlocks.SAGE)), BlockPredicate.allOf(BlockPredicate.replaceable(), BlockPredicate.noFluid(), BlockPredicate.matchingBlocks(Direction.DOWN.getVector(),
                        Blocks.PODZOL,
                        Blocks.DIRT,
                        Blocks.GRASS_BLOCK,
                        Blocks.MOSS_BLOCK,
                        Blocks.COARSE_DIRT)))));
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(FlowerBreeding.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context, RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
