package net.flowerbreeding.world.feature;

import net.flowerbreeding.FBBlocks;
import net.flowerbreeding.FlowerBreeding;
import net.minecraft.core.HolderSet;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.random.WeightedList;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.HugeMushroomBlock;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.core.Direction;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.RandomSpreadFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.WeightedStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.BendingTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.BlockPredicateFilter;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.RandomOffsetPlacement;

public class FBConfiguredFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> SAGE_KEY = registerKey("sage");
    public static final ResourceKey<ConfiguredFeature<?, ?>> HUGE_MAGENTA_GLOWSHROOM = registerKey("huge_magenta_glowshroom");
    public static final ResourceKey<ConfiguredFeature<?, ?>> HUGE_BLUE_GLOWSHROOM = registerKey("huge_blue_glowshroom");
    public static final ResourceKey<ConfiguredFeature<?, ?>> HUGE_WHITE_GLOWSHROOM = registerKey("huge_white_glowshroom");
    public static final ResourceKey<ConfiguredFeature<?, ?>> HUGE_ORANGE_GLOWSHROOM = registerKey("huge_orange_glowshroom");
    public static final ResourceKey<ConfiguredFeature<?, ?>> HUGE_RED_GLOWSHROOM = registerKey("huge_red_glowshroom");
    public static final ResourceKey<ConfiguredFeature<?, ?>> HUGE_YELLOW_GLOWSHROOM = registerKey("huge_yellow_glowshroom");
    public static final ResourceKey<ConfiguredFeature<?, ?>> HUGE_LIGHT_BLUE_GLOWSHROOM = registerKey("huge_light_blue_glowshroom");
    public static final ResourceKey<ConfiguredFeature<?, ?>> HUGE_PINK_GLOWSHROOM = registerKey("huge_pink_glowshroom");
    public static final ResourceKey<ConfiguredFeature<?, ?>> HUGE_BLACK_GLOWSHROOM = registerKey("huge_black_glowshroom");
    public static final ResourceKey<ConfiguredFeature<?, ?>> HUGE_CYAN_GLOWSHROOM = registerKey("huge_cyan_glowshroom");
    public static final ResourceKey<ConfiguredFeature<?, ?>> HUGE_GREEN_GLOWSHROOM = registerKey("huge_green_glowshroom");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MAGENTA_AZALEA_TREE = registerKey("magenta_azalea_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLUE_AZALEA_TREE = registerKey("blue_azalea_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WHITE_AZALEA_TREE = registerKey("white_azalea_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORANGE_AZALEA_TREE = registerKey("orange_azalea_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RED_AZALEA_TREE = registerKey("red_azalea_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> YELLOW_AZALEA_TREE = registerKey("yellow_azalea_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LIGHT_BLUE_AZALEA_TREE = registerKey("light_blue_azalea_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLACK_AZALEA_TREE = registerKey("black_azalea_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CYAN_AZALEA_TREE = registerKey("cyan_azalea_tree");


    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        register(
                context,
                SAGE_KEY,
                Feature.SIMPLE_RANDOM_SELECTOR,
                new CompositeFeatureConfiguration(
                        HolderSet.direct(
                                PlacementUtils.inlinePlaced(
                                        Feature.SIMPLE_BLOCK,
                                        new SimpleBlockConfiguration(BlockStateProvider.simple(FBBlocks.SAGE)),
                                        CountPlacement.of(96),
                                        RandomOffsetPlacement.ofTriangle(3, 3),
                                        BlockPredicateFilter.forPredicate(BlockPredicate.allOf(BlockPredicate.matchesTag(BlockTags.REPLACEABLE), BlockPredicate.matchesBlocks(Direction.DOWN.getUnitVec3i(), Blocks.PODZOL,
                                                Blocks.DIRT,
                                                Blocks.GRASS_BLOCK,
                                                Blocks.MOSS_BLOCK,
                                                Blocks.COARSE_DIRT)))
                                )
                        )
                )
        );

        register(context, HUGE_MAGENTA_GLOWSHROOM,
                Feature.HUGE_RED_MUSHROOM,
                new HugeMushroomFeatureConfiguration(
                        BlockStateProvider.simple(FBBlocks.MAGENTA_GLOWSHROOM_BLOCK.defaultBlockState().setValue(HugeMushroomBlock.DOWN, Boolean.FALSE)),
                        BlockStateProvider.simple(Blocks.MUSHROOM_STEM.defaultBlockState().setValue(HugeMushroomBlock.UP, Boolean.FALSE).setValue(HugeMushroomBlock.DOWN, Boolean.FALSE)),
                        2,
                        BlockPredicate.allOf(BlockPredicate.matchesTag(BlockTags.HUGE_RED_MUSHROOM_CAN_PLACE_ON), BlockPredicate.matchesBlocks(Blocks.PODZOL,
                        Blocks.DIRT,
                        Blocks.GRASS_BLOCK,
                        Blocks.MOSS_BLOCK,
                        Blocks.COARSE_DIRT))));

        register(context, HUGE_BLUE_GLOWSHROOM,
                Feature.HUGE_RED_MUSHROOM,
                new HugeMushroomFeatureConfiguration(
                        BlockStateProvider.simple(FBBlocks.BLUE_GLOWSHROOM_BLOCK.defaultBlockState().setValue(HugeMushroomBlock.DOWN, Boolean.FALSE)),
                        BlockStateProvider.simple(Blocks.MUSHROOM_STEM.defaultBlockState().setValue(HugeMushroomBlock.UP, Boolean.FALSE).setValue(HugeMushroomBlock.DOWN, Boolean.FALSE)),
                        2,
                        BlockPredicate.allOf(BlockPredicate.matchesTag(BlockTags.HUGE_RED_MUSHROOM_CAN_PLACE_ON), BlockPredicate.matchesBlocks(Blocks.PODZOL,
                                Blocks.DIRT,
                                Blocks.GRASS_BLOCK,
                                Blocks.MOSS_BLOCK,
                                Blocks.COARSE_DIRT))));

        register(context, HUGE_WHITE_GLOWSHROOM,
                Feature.HUGE_RED_MUSHROOM,
                new HugeMushroomFeatureConfiguration(
                        BlockStateProvider.simple(FBBlocks.WHITE_GLOWSHROOM_BLOCK.defaultBlockState().setValue(HugeMushroomBlock.DOWN, Boolean.FALSE)),
                        BlockStateProvider.simple(Blocks.MUSHROOM_STEM.defaultBlockState().setValue(HugeMushroomBlock.UP, Boolean.FALSE).setValue(HugeMushroomBlock.DOWN, Boolean.FALSE)),
                        2,
                        BlockPredicate.allOf(BlockPredicate.matchesTag(BlockTags.HUGE_RED_MUSHROOM_CAN_PLACE_ON), BlockPredicate.matchesBlocks(Blocks.PODZOL,
                                Blocks.DIRT,
                                Blocks.GRASS_BLOCK,
                                Blocks.MOSS_BLOCK,
                                Blocks.COARSE_DIRT))));

        register(context, HUGE_ORANGE_GLOWSHROOM,
                Feature.HUGE_RED_MUSHROOM,
                new HugeMushroomFeatureConfiguration(
                        BlockStateProvider.simple(FBBlocks.ORANGE_GLOWSHROOM_BLOCK.defaultBlockState().setValue(HugeMushroomBlock.DOWN, Boolean.FALSE)),
                        BlockStateProvider.simple(Blocks.MUSHROOM_STEM.defaultBlockState().setValue(HugeMushroomBlock.UP, Boolean.FALSE).setValue(HugeMushroomBlock.DOWN, Boolean.FALSE)),
                        2,
                        BlockPredicate.allOf(BlockPredicate.matchesTag(BlockTags.HUGE_RED_MUSHROOM_CAN_PLACE_ON), BlockPredicate.matchesBlocks(Blocks.PODZOL,
                                Blocks.DIRT,
                                Blocks.GRASS_BLOCK,
                                Blocks.MOSS_BLOCK,
                                Blocks.COARSE_DIRT))));

        register(context, HUGE_RED_GLOWSHROOM,
                Feature.HUGE_RED_MUSHROOM,
                new HugeMushroomFeatureConfiguration(
                        BlockStateProvider.simple(FBBlocks.RED_GLOWSHROOM_BLOCK.defaultBlockState().setValue(HugeMushroomBlock.DOWN, Boolean.FALSE)),
                        BlockStateProvider.simple(Blocks.MUSHROOM_STEM.defaultBlockState().setValue(HugeMushroomBlock.UP, Boolean.FALSE).setValue(HugeMushroomBlock.DOWN, Boolean.FALSE)),
                        2,
                        BlockPredicate.allOf(BlockPredicate.matchesTag(BlockTags.HUGE_RED_MUSHROOM_CAN_PLACE_ON), BlockPredicate.matchesBlocks(Blocks.PODZOL,
                                Blocks.DIRT,
                                Blocks.GRASS_BLOCK,
                                Blocks.MOSS_BLOCK,
                                Blocks.COARSE_DIRT))));

        register(context, HUGE_YELLOW_GLOWSHROOM,
                Feature.HUGE_RED_MUSHROOM,
                new HugeMushroomFeatureConfiguration(
                        BlockStateProvider.simple(FBBlocks.YELLOW_GLOWSHROOM_BLOCK.defaultBlockState().setValue(HugeMushroomBlock.DOWN, Boolean.FALSE)),
                        BlockStateProvider.simple(Blocks.MUSHROOM_STEM.defaultBlockState().setValue(HugeMushroomBlock.UP, Boolean.FALSE).setValue(HugeMushroomBlock.DOWN, Boolean.FALSE)),
                        2,
                        BlockPredicate.allOf(BlockPredicate.matchesTag(BlockTags.HUGE_RED_MUSHROOM_CAN_PLACE_ON), BlockPredicate.matchesBlocks(Blocks.PODZOL,
                                Blocks.DIRT,
                                Blocks.GRASS_BLOCK,
                                Blocks.MOSS_BLOCK,
                                Blocks.COARSE_DIRT))));

        register(context, HUGE_LIGHT_BLUE_GLOWSHROOM,
                Feature.HUGE_RED_MUSHROOM,
                new HugeMushroomFeatureConfiguration(
                        BlockStateProvider.simple(FBBlocks.LIGHT_BLUE_GLOWSHROOM_BLOCK.defaultBlockState().setValue(HugeMushroomBlock.DOWN, Boolean.FALSE)),
                        BlockStateProvider.simple(Blocks.MUSHROOM_STEM.defaultBlockState().setValue(HugeMushroomBlock.UP, Boolean.FALSE).setValue(HugeMushroomBlock.DOWN, Boolean.FALSE)),
                        2,
                        BlockPredicate.allOf(BlockPredicate.matchesTag(BlockTags.HUGE_RED_MUSHROOM_CAN_PLACE_ON), BlockPredicate.matchesBlocks(Blocks.PODZOL,
                                Blocks.DIRT,
                                Blocks.GRASS_BLOCK,
                                Blocks.MOSS_BLOCK,
                                Blocks.COARSE_DIRT))));

        register(context, HUGE_PINK_GLOWSHROOM,
                Feature.HUGE_RED_MUSHROOM,
                new HugeMushroomFeatureConfiguration(
                        BlockStateProvider.simple(FBBlocks.PINK_GLOWSHROOM_BLOCK.defaultBlockState().setValue(HugeMushroomBlock.DOWN, Boolean.FALSE)),
                        BlockStateProvider.simple(Blocks.MUSHROOM_STEM.defaultBlockState().setValue(HugeMushroomBlock.UP, Boolean.FALSE).setValue(HugeMushroomBlock.DOWN, Boolean.FALSE)),
                        2,
                        BlockPredicate.allOf(BlockPredicate.matchesTag(BlockTags.HUGE_RED_MUSHROOM_CAN_PLACE_ON), BlockPredicate.matchesBlocks(Blocks.PODZOL,
                                Blocks.DIRT,
                                Blocks.GRASS_BLOCK,
                                Blocks.MOSS_BLOCK,
                                Blocks.COARSE_DIRT))));

        register(context, HUGE_BLACK_GLOWSHROOM,
                Feature.HUGE_RED_MUSHROOM,
                new HugeMushroomFeatureConfiguration(
                        BlockStateProvider.simple(FBBlocks.BLACK_GLOWSHROOM_BLOCK.defaultBlockState().setValue(HugeMushroomBlock.DOWN, Boolean.FALSE)),
                        BlockStateProvider.simple(Blocks.MUSHROOM_STEM.defaultBlockState().setValue(HugeMushroomBlock.UP, Boolean.FALSE).setValue(HugeMushroomBlock.DOWN, Boolean.FALSE)),
                        2,
                        BlockPredicate.allOf(BlockPredicate.matchesTag(BlockTags.HUGE_RED_MUSHROOM_CAN_PLACE_ON), BlockPredicate.matchesBlocks(Blocks.PODZOL,
                                Blocks.DIRT,
                                Blocks.GRASS_BLOCK,
                                Blocks.MOSS_BLOCK,
                                Blocks.COARSE_DIRT))));

        register(context, HUGE_CYAN_GLOWSHROOM,
                Feature.HUGE_RED_MUSHROOM,
                new HugeMushroomFeatureConfiguration(
                        BlockStateProvider.simple(FBBlocks.CYAN_GLOWSHROOM_BLOCK.defaultBlockState().setValue(HugeMushroomBlock.DOWN, Boolean.FALSE)),
                        BlockStateProvider.simple(Blocks.MUSHROOM_STEM.defaultBlockState().setValue(HugeMushroomBlock.UP, Boolean.FALSE).setValue(HugeMushroomBlock.DOWN, Boolean.FALSE)),
                        2,
                        BlockPredicate.allOf(BlockPredicate.matchesTag(BlockTags.HUGE_RED_MUSHROOM_CAN_PLACE_ON), BlockPredicate.matchesBlocks(Blocks.PODZOL,
                                Blocks.DIRT,
                                Blocks.GRASS_BLOCK,
                                Blocks.MOSS_BLOCK,
                                Blocks.COARSE_DIRT))));

        register(context, HUGE_GREEN_GLOWSHROOM,
                Feature.HUGE_RED_MUSHROOM,
                new HugeMushroomFeatureConfiguration(
                        BlockStateProvider.simple(FBBlocks.GREEN_GLOWSHROOM_BLOCK.defaultBlockState().setValue(HugeMushroomBlock.DOWN, Boolean.FALSE)),
                        BlockStateProvider.simple(Blocks.MUSHROOM_STEM.defaultBlockState().setValue(HugeMushroomBlock.UP, Boolean.FALSE).setValue(HugeMushroomBlock.DOWN, Boolean.FALSE)),
                        2,
                        BlockPredicate.allOf(BlockPredicate.matchesTag(BlockTags.HUGE_RED_MUSHROOM_CAN_PLACE_ON), BlockPredicate.matchesBlocks(Blocks.PODZOL,
                                Blocks.DIRT,
                                Blocks.GRASS_BLOCK,
                                Blocks.MOSS_BLOCK,
                                Blocks.COARSE_DIRT))));

        register(context, MAGENTA_AZALEA_TREE,
                Feature.TREE,
                new TreeConfiguration.TreeConfigurationBuilder(
                        BlockStateProvider.simple(Blocks.OAK_LOG),
                        new BendingTrunkPlacer(4, 2, 0, 3, UniformInt.of(1, 2)),
                        new WeightedStateProvider(WeightedList.<BlockState>builder().add(Blocks.AZALEA_LEAVES.defaultBlockState(), 3).add(FBBlocks.MAGENTA_FLOWERING_AZALEA_LEAVES.defaultBlockState(), 1)),
                        new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 50),
                        new TwoLayersFeatureSize(1, 0, 1),
                        BlockStateProvider.simple(Blocks.ROOTED_DIRT)).build());

        register(context, BLUE_AZALEA_TREE,
                Feature.TREE,
                new TreeConfiguration.TreeConfigurationBuilder(
                        BlockStateProvider.simple(Blocks.OAK_LOG),
                        new BendingTrunkPlacer(4, 2, 0, 3, UniformInt.of(1, 2)),
                        new WeightedStateProvider(WeightedList.<BlockState>builder().add(Blocks.AZALEA_LEAVES.defaultBlockState(), 3).add(FBBlocks.BLUE_FLOWERING_AZALEA_LEAVES.defaultBlockState(), 1)),
                        new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 50),
                        new TwoLayersFeatureSize(1, 0, 1),
                        BlockStateProvider.simple(Blocks.ROOTED_DIRT)).build());

        register(context, WHITE_AZALEA_TREE,
                Feature.TREE,
                new TreeConfiguration.TreeConfigurationBuilder(
                        BlockStateProvider.simple(Blocks.OAK_LOG),
                        new BendingTrunkPlacer(4, 2, 0, 3, UniformInt.of(1, 2)),
                        new WeightedStateProvider(WeightedList.<BlockState>builder().add(Blocks.AZALEA_LEAVES.defaultBlockState(), 3).add(FBBlocks.WHITE_FLOWERING_AZALEA_LEAVES.defaultBlockState(), 1)),
                        new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 50),
                        new TwoLayersFeatureSize(1, 0, 1),
                        BlockStateProvider.simple(Blocks.ROOTED_DIRT)).build());

        register(context, ORANGE_AZALEA_TREE,
                Feature.TREE,
                new TreeConfiguration.TreeConfigurationBuilder(
                        BlockStateProvider.simple(Blocks.OAK_LOG),
                        new BendingTrunkPlacer(4, 2, 0, 3, UniformInt.of(1, 2)),
                        new WeightedStateProvider(WeightedList.<BlockState>builder().add(Blocks.AZALEA_LEAVES.defaultBlockState(), 3).add(FBBlocks.ORANGE_FLOWERING_AZALEA_LEAVES.defaultBlockState(), 1)),
                        new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 50),
                        new TwoLayersFeatureSize(1, 0, 1),
                        BlockStateProvider.simple(Blocks.ROOTED_DIRT)).build());

        register(context, RED_AZALEA_TREE,
                Feature.TREE,
                new TreeConfiguration.TreeConfigurationBuilder(
                        BlockStateProvider.simple(Blocks.OAK_LOG),
                        new BendingTrunkPlacer(4, 2, 0, 3, UniformInt.of(1, 2)),
                        new WeightedStateProvider(WeightedList.<BlockState>builder().add(Blocks.AZALEA_LEAVES.defaultBlockState(), 3).add(FBBlocks.RED_FLOWERING_AZALEA_LEAVES.defaultBlockState(), 1)),
                        new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 50),
                        new TwoLayersFeatureSize(1, 0, 1),
                        BlockStateProvider.simple(Blocks.ROOTED_DIRT)).build());

        register(context, YELLOW_AZALEA_TREE,
                Feature.TREE,
                new TreeConfiguration.TreeConfigurationBuilder(
                        BlockStateProvider.simple(Blocks.OAK_LOG),
                        new BendingTrunkPlacer(4, 2, 0, 3, UniformInt.of(1, 2)),
                        new WeightedStateProvider(WeightedList.<BlockState>builder().add(Blocks.AZALEA_LEAVES.defaultBlockState(), 3).add(FBBlocks.YELLOW_FLOWERING_AZALEA_LEAVES.defaultBlockState(), 1)),
                        new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 50),
                        new TwoLayersFeatureSize(1, 0, 1),
                        BlockStateProvider.simple(Blocks.ROOTED_DIRT)).build());

        register(context, LIGHT_BLUE_AZALEA_TREE,
                Feature.TREE,
                new TreeConfiguration.TreeConfigurationBuilder(
                        BlockStateProvider.simple(Blocks.OAK_LOG),
                        new BendingTrunkPlacer(4, 2, 0, 3, UniformInt.of(1, 2)),
                        new WeightedStateProvider(WeightedList.<BlockState>builder().add(Blocks.AZALEA_LEAVES.defaultBlockState(), 3).add(FBBlocks.LIGHT_BLUE_FLOWERING_AZALEA_LEAVES.defaultBlockState(), 1)),
                        new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 50),
                        new TwoLayersFeatureSize(1, 0, 1),
                        BlockStateProvider.simple(Blocks.ROOTED_DIRT)).build());

        register(context, BLACK_AZALEA_TREE, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                        BlockStateProvider.simple(Blocks.OAK_LOG),
                        new BendingTrunkPlacer(4, 2, 0, 3, UniformInt.of(1, 2)),
                        new WeightedStateProvider(WeightedList.<BlockState>builder().add(Blocks.AZALEA_LEAVES.defaultBlockState(), 3).add(FBBlocks.BLACK_FLOWERING_AZALEA_LEAVES.defaultBlockState(), 1)),
                        new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 50),
                        new TwoLayersFeatureSize(1, 0, 1),
                        BlockStateProvider.simple(Blocks.ROOTED_DIRT)).build());

        register(context, CYAN_AZALEA_TREE,
                Feature.TREE,
                new TreeConfiguration.TreeConfigurationBuilder(
                        BlockStateProvider.simple(Blocks.OAK_LOG),
                        new BendingTrunkPlacer(4, 2, 0, 3, UniformInt.of(1, 2)),
                        new WeightedStateProvider(WeightedList.<BlockState>builder().add(Blocks.AZALEA_LEAVES.defaultBlockState(), 3).add(FBBlocks.CYAN_FLOWERING_AZALEA_LEAVES.defaultBlockState(), 1)),
                        new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 50),
                        new TwoLayersFeatureSize(1, 0, 1),
                        BlockStateProvider.simple(Blocks.ROOTED_DIRT)).build());
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, Identifier.fromNamespaceAndPath(FlowerBreeding.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
