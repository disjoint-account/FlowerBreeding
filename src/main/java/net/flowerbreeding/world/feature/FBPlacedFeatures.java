package net.flowerbreeding.world.feature;

import net.flowerbreeding.FlowerBreeding;
import net.minecraft.core.Direction;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class FBPlacedFeatures {

    public static final ResourceKey<PlacedFeature> SAGE_PLACED_KEY = registerPlacedKey("sage_placed");

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        register(context, SAGE_PLACED_KEY, context.lookup(Registries.FEATURE).getOrThrow(FBConfiguredFeatures.SAGE_KEY),
                PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                CountPlacement.of(96),
                OffsetPlacement.ofTriangle(4, 3),
                BlockPredicateFilter.forPredicate(BlockPredicate.allOf(BlockPredicate.anyOf(BlockPredicate.matchesTag(BlockTags.REPLACEABLE_BY_MUSHROOMS), BlockPredicate.matchesBlocks(Blocks.AIR)),
                        BlockPredicate.matchesBlocks(Direction.DOWN, Blocks.PODZOL,
                                Blocks.DIRT,
                                Blocks.GRASS_BLOCK,
                                Blocks.MOSS_BLOCK,
                                Blocks.COARSE_DIRT))));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<Feature> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<Feature> configuration, PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
    public static ResourceKey<PlacedFeature> registerPlacedKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, Identifier.fromNamespaceAndPath(FlowerBreeding.MOD_ID, name));
    }
}
