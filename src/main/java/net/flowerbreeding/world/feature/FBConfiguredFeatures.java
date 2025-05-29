package net.flowerbreeding.world.feature;

import net.flowerbreeding.FBBlocks;
import net.flowerbreeding.FlowerBreeding;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.MushroomBlock;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.Pool;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.gen.blockpredicate.BlockPredicate;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.RandomSpreadFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.stateprovider.WeightedBlockStateProvider;
import net.minecraft.world.gen.trunk.BendingTrunkPlacer;

public class FBConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> SAGE_KEY = registerKey("sage");
    public static final RegistryKey<ConfiguredFeature<?, ?>> HUGE_MAGENTA_GLOWSHROOM = registerKey("huge_magenta_glowshroom");
    public static final RegistryKey<ConfiguredFeature<?, ?>> HUGE_BLUE_GLOWSHROOM = registerKey("huge_blue_glowshroom");
    public static final RegistryKey<ConfiguredFeature<?, ?>> HUGE_WHITE_GLOWSHROOM = registerKey("huge_white_glowshroom");
    public static final RegistryKey<ConfiguredFeature<?, ?>> HUGE_ORANGE_GLOWSHROOM = registerKey("huge_orange_glowshroom");
    public static final RegistryKey<ConfiguredFeature<?, ?>> HUGE_RED_GLOWSHROOM = registerKey("huge_red_glowshroom");
    public static final RegistryKey<ConfiguredFeature<?, ?>> HUGE_YELLOW_GLOWSHROOM = registerKey("huge_yellow_glowshroom");
    public static final RegistryKey<ConfiguredFeature<?, ?>> HUGE_LIGHT_BLUE_GLOWSHROOM = registerKey("huge_light_blue_glowshroom");
    public static final RegistryKey<ConfiguredFeature<?, ?>> HUGE_PINK_GLOWSHROOM = registerKey("huge_pink_glowshroom");
    public static final RegistryKey<ConfiguredFeature<?, ?>> HUGE_BLACK_GLOWSHROOM = registerKey("huge_black_glowshroom");
    public static final RegistryKey<ConfiguredFeature<?, ?>> HUGE_CYAN_GLOWSHROOM = registerKey("huge_cyan_glowshroom");
    public static final RegistryKey<ConfiguredFeature<?, ?>> HUGE_GREEN_GLOWSHROOM = registerKey("huge_green_glowshroom");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MAGENTA_AZALEA_TREE = registerKey("magenta_azalea_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BLUE_AZALEA_TREE = registerKey("blue_azalea_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> WHITE_AZALEA_TREE = registerKey("white_azalea_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORANGE_AZALEA_TREE = registerKey("orange_azalea_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> RED_AZALEA_TREE = registerKey("red_azalea_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> YELLOW_AZALEA_TREE = registerKey("yellow_azalea_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> LIGHT_BLUE_AZALEA_TREE = registerKey("light_blue_azalea_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BLACK_AZALEA_TREE = registerKey("black_azalea_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CYAN_AZALEA_TREE = registerKey("cyan_azalea_tree");


    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {

        register(context, SAGE_KEY, Feature.RANDOM_PATCH, new RandomPatchFeatureConfig(32, 3, 1, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(FBBlocks.SAGE)), BlockPredicate.allOf(BlockPredicate.replaceable(), BlockPredicate.noFluid(), BlockPredicate.matchingBlocks(Direction.DOWN.getVector(),
                        Blocks.PODZOL,
                        Blocks.DIRT,
                        Blocks.GRASS_BLOCK,
                        Blocks.MOSS_BLOCK,
                        Blocks.COARSE_DIRT)))));

        register(context, HUGE_MAGENTA_GLOWSHROOM,
                Feature.HUGE_RED_MUSHROOM,
                new HugeMushroomFeatureConfig(
                        BlockStateProvider.of(FBBlocks.MAGENTA_GLOWSHROOM_BLOCK.getDefaultState().with(MushroomBlock.DOWN, Boolean.FALSE)),
                        BlockStateProvider.of(Blocks.MUSHROOM_STEM.getDefaultState().with(MushroomBlock.UP, Boolean.FALSE).with(MushroomBlock.DOWN, Boolean.FALSE)),
                        2));

        register(context, HUGE_BLUE_GLOWSHROOM,
                Feature.HUGE_RED_MUSHROOM,
                new HugeMushroomFeatureConfig(
                        BlockStateProvider.of(FBBlocks.BLUE_GLOWSHROOM_BLOCK.getDefaultState().with(MushroomBlock.DOWN, Boolean.FALSE)),
                        BlockStateProvider.of(Blocks.MUSHROOM_STEM.getDefaultState().with(MushroomBlock.UP, Boolean.FALSE).with(MushroomBlock.DOWN, Boolean.FALSE)),
                        2));

        register(context, HUGE_WHITE_GLOWSHROOM,
                Feature.HUGE_RED_MUSHROOM,
                new HugeMushroomFeatureConfig(
                        BlockStateProvider.of(FBBlocks.WHITE_GLOWSHROOM_BLOCK.getDefaultState().with(MushroomBlock.DOWN, Boolean.FALSE)),
                        BlockStateProvider.of(Blocks.MUSHROOM_STEM.getDefaultState().with(MushroomBlock.UP, Boolean.FALSE).with(MushroomBlock.DOWN, Boolean.FALSE)),
                        2));

        register(context, HUGE_ORANGE_GLOWSHROOM,
                Feature.HUGE_RED_MUSHROOM,
                new HugeMushroomFeatureConfig(
                        BlockStateProvider.of(FBBlocks.ORANGE_GLOWSHROOM_BLOCK.getDefaultState().with(MushroomBlock.DOWN, Boolean.FALSE)),
                        BlockStateProvider.of(Blocks.MUSHROOM_STEM.getDefaultState().with(MushroomBlock.UP, Boolean.FALSE).with(MushroomBlock.DOWN, Boolean.FALSE)),
                        2));

        register(context, HUGE_RED_GLOWSHROOM,
                Feature.HUGE_RED_MUSHROOM,
                new HugeMushroomFeatureConfig(
                        BlockStateProvider.of(FBBlocks.RED_GLOWSHROOM_BLOCK.getDefaultState().with(MushroomBlock.DOWN, Boolean.FALSE)),
                        BlockStateProvider.of(Blocks.MUSHROOM_STEM.getDefaultState().with(MushroomBlock.UP, Boolean.FALSE).with(MushroomBlock.DOWN, Boolean.FALSE)),
                        2));

        register(context, HUGE_YELLOW_GLOWSHROOM,
                Feature.HUGE_RED_MUSHROOM,
                new HugeMushroomFeatureConfig(
                        BlockStateProvider.of(FBBlocks.YELLOW_GLOWSHROOM_BLOCK.getDefaultState().with(MushroomBlock.DOWN, Boolean.FALSE)),
                        BlockStateProvider.of(Blocks.MUSHROOM_STEM.getDefaultState().with(MushroomBlock.UP, Boolean.FALSE).with(MushroomBlock.DOWN, Boolean.FALSE)),
                        2));

        register(context, HUGE_LIGHT_BLUE_GLOWSHROOM,
                Feature.HUGE_RED_MUSHROOM,
                new HugeMushroomFeatureConfig(
                        BlockStateProvider.of(FBBlocks.LIGHT_BLUE_GLOWSHROOM_BLOCK.getDefaultState().with(MushroomBlock.DOWN, Boolean.FALSE)),
                        BlockStateProvider.of(Blocks.MUSHROOM_STEM.getDefaultState().with(MushroomBlock.UP, Boolean.FALSE).with(MushroomBlock.DOWN, Boolean.FALSE)),
                        2));

        register(context, HUGE_PINK_GLOWSHROOM,
                Feature.HUGE_RED_MUSHROOM,
                new HugeMushroomFeatureConfig(
                        BlockStateProvider.of(FBBlocks.PINK_GLOWSHROOM_BLOCK.getDefaultState().with(MushroomBlock.DOWN, Boolean.FALSE)),
                        BlockStateProvider.of(Blocks.MUSHROOM_STEM.getDefaultState().with(MushroomBlock.UP, Boolean.FALSE).with(MushroomBlock.DOWN, Boolean.FALSE)),
                        2));

        register(context, HUGE_BLACK_GLOWSHROOM,
                Feature.HUGE_RED_MUSHROOM,
                new HugeMushroomFeatureConfig(
                        BlockStateProvider.of(FBBlocks.BLACK_GLOWSHROOM_BLOCK.getDefaultState().with(MushroomBlock.DOWN, Boolean.FALSE)),
                        BlockStateProvider.of(Blocks.MUSHROOM_STEM.getDefaultState().with(MushroomBlock.UP, Boolean.FALSE).with(MushroomBlock.DOWN, Boolean.FALSE)),
                        2));

        register(context, HUGE_CYAN_GLOWSHROOM,
                Feature.HUGE_RED_MUSHROOM,
                new HugeMushroomFeatureConfig(
                        BlockStateProvider.of(FBBlocks.CYAN_GLOWSHROOM_BLOCK.getDefaultState().with(MushroomBlock.DOWN, Boolean.FALSE)),
                        BlockStateProvider.of(Blocks.MUSHROOM_STEM.getDefaultState().with(MushroomBlock.UP, Boolean.FALSE).with(MushroomBlock.DOWN, Boolean.FALSE)),
                        2));

        register(context, HUGE_GREEN_GLOWSHROOM,
                Feature.HUGE_RED_MUSHROOM,
                new HugeMushroomFeatureConfig(
                        BlockStateProvider.of(FBBlocks.GREEN_GLOWSHROOM_BLOCK.getDefaultState().with(MushroomBlock.DOWN, Boolean.FALSE)),
                        BlockStateProvider.of(Blocks.MUSHROOM_STEM.getDefaultState().with(MushroomBlock.UP, Boolean.FALSE).with(MushroomBlock.DOWN, Boolean.FALSE)),
                        2));

        register(context, MAGENTA_AZALEA_TREE,
                Feature.TREE,
                new TreeFeatureConfig.Builder(
                        BlockStateProvider.of(Blocks.OAK_LOG),
                        new BendingTrunkPlacer(4, 2, 0, 3, UniformIntProvider.create(1, 2)),
                        new WeightedBlockStateProvider(Pool.<BlockState>builder().add(Blocks.AZALEA_LEAVES.getDefaultState(), 3).add(FBBlocks.MAGENTA_FLOWERING_AZALEA_LEAVES.getDefaultState(), 1)),
                        new RandomSpreadFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(0), ConstantIntProvider.create(2), 50),
                        new TwoLayersFeatureSize(1, 0, 1)).dirtProvider(BlockStateProvider.of(Blocks.ROOTED_DIRT)).forceDirt().build());

        register(context, BLUE_AZALEA_TREE,
                Feature.TREE,
                new TreeFeatureConfig.Builder(
                        BlockStateProvider.of(Blocks.OAK_LOG),
                        new BendingTrunkPlacer(4, 2, 0, 3, UniformIntProvider.create(1, 2)),
                        new WeightedBlockStateProvider(Pool.<BlockState>builder().add(Blocks.AZALEA_LEAVES.getDefaultState(), 3).add(FBBlocks.BLUE_FLOWERING_AZALEA_LEAVES.getDefaultState(), 1)),
                        new RandomSpreadFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(0), ConstantIntProvider.create(2), 50),
                        new TwoLayersFeatureSize(1, 0, 1)).dirtProvider(BlockStateProvider.of(Blocks.ROOTED_DIRT)).forceDirt().build());

        register(context, WHITE_AZALEA_TREE,
                Feature.TREE,
                new TreeFeatureConfig.Builder(
                        BlockStateProvider.of(Blocks.OAK_LOG),
                        new BendingTrunkPlacer(4, 2, 0, 3, UniformIntProvider.create(1, 2)),
                        new WeightedBlockStateProvider(Pool.<BlockState>builder().add(Blocks.AZALEA_LEAVES.getDefaultState(), 3).add(FBBlocks.WHITE_FLOWERING_AZALEA_LEAVES.getDefaultState(), 1)),
                        new RandomSpreadFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(0), ConstantIntProvider.create(2), 50),
                        new TwoLayersFeatureSize(1, 0, 1)).dirtProvider(BlockStateProvider.of(Blocks.ROOTED_DIRT)).forceDirt().build());

        register(context, ORANGE_AZALEA_TREE,
                Feature.TREE,
                new TreeFeatureConfig.Builder(
                        BlockStateProvider.of(Blocks.OAK_LOG),
                        new BendingTrunkPlacer(4, 2, 0, 3, UniformIntProvider.create(1, 2)),
                        new WeightedBlockStateProvider(Pool.<BlockState>builder().add(Blocks.AZALEA_LEAVES.getDefaultState(), 3).add(FBBlocks.ORANGE_FLOWERING_AZALEA_LEAVES.getDefaultState(), 1)),
                        new RandomSpreadFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(0), ConstantIntProvider.create(2), 50),
                        new TwoLayersFeatureSize(1, 0, 1)).dirtProvider(BlockStateProvider.of(Blocks.ROOTED_DIRT)).forceDirt().build());

        register(context, RED_AZALEA_TREE,
                Feature.TREE,
                new TreeFeatureConfig.Builder(
                        BlockStateProvider.of(Blocks.OAK_LOG),
                        new BendingTrunkPlacer(4, 2, 0, 3, UniformIntProvider.create(1, 2)),
                        new WeightedBlockStateProvider(Pool.<BlockState>builder().add(Blocks.AZALEA_LEAVES.getDefaultState(), 3).add(FBBlocks.RED_FLOWERING_AZALEA_LEAVES.getDefaultState(), 1)),
                        new RandomSpreadFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(0), ConstantIntProvider.create(2), 50),
                        new TwoLayersFeatureSize(1, 0, 1)).dirtProvider(BlockStateProvider.of(Blocks.ROOTED_DIRT)).forceDirt().build());

        register(context, YELLOW_AZALEA_TREE,
                Feature.TREE,
                new TreeFeatureConfig.Builder(
                        BlockStateProvider.of(Blocks.OAK_LOG),
                        new BendingTrunkPlacer(4, 2, 0, 3, UniformIntProvider.create(1, 2)),
                        new WeightedBlockStateProvider(Pool.<BlockState>builder().add(Blocks.AZALEA_LEAVES.getDefaultState(), 3).add(FBBlocks.YELLOW_FLOWERING_AZALEA_LEAVES.getDefaultState(), 1)),
                        new RandomSpreadFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(0), ConstantIntProvider.create(2), 50),
                        new TwoLayersFeatureSize(1, 0, 1)).dirtProvider(BlockStateProvider.of(Blocks.ROOTED_DIRT)).forceDirt().build());

        register(context, LIGHT_BLUE_AZALEA_TREE,
                Feature.TREE,
                new TreeFeatureConfig.Builder(
                        BlockStateProvider.of(Blocks.OAK_LOG),
                        new BendingTrunkPlacer(4, 2, 0, 3, UniformIntProvider.create(1, 2)),
                        new WeightedBlockStateProvider(Pool.<BlockState>builder().add(Blocks.AZALEA_LEAVES.getDefaultState(), 3).add(FBBlocks.LIGHT_BLUE_FLOWERING_AZALEA_LEAVES.getDefaultState(), 1)),
                        new RandomSpreadFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(0), ConstantIntProvider.create(2), 50),
                        new TwoLayersFeatureSize(1, 0, 1)).dirtProvider(BlockStateProvider.of(Blocks.ROOTED_DIRT)).forceDirt().build());

        register(context, BLACK_AZALEA_TREE,
                Feature.TREE,
                new TreeFeatureConfig.Builder(
                        BlockStateProvider.of(Blocks.OAK_LOG),
                        new BendingTrunkPlacer(4, 2, 0, 3, UniformIntProvider.create(1, 2)),
                        new WeightedBlockStateProvider(Pool.<BlockState>builder().add(Blocks.AZALEA_LEAVES.getDefaultState(), 3).add(FBBlocks.BLACK_FLOWERING_AZALEA_LEAVES.getDefaultState(), 1)),
                        new RandomSpreadFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(0), ConstantIntProvider.create(2), 50),
                        new TwoLayersFeatureSize(1, 0, 1)).dirtProvider(BlockStateProvider.of(Blocks.ROOTED_DIRT)).forceDirt().build());

        register(context, CYAN_AZALEA_TREE,
                Feature.TREE,
                new TreeFeatureConfig.Builder(
                        BlockStateProvider.of(Blocks.OAK_LOG),
                        new BendingTrunkPlacer(4, 2, 0, 3, UniformIntProvider.create(1, 2)),
                        new WeightedBlockStateProvider(Pool.<BlockState>builder().add(Blocks.AZALEA_LEAVES.getDefaultState(), 3).add(FBBlocks.CYAN_FLOWERING_AZALEA_LEAVES.getDefaultState(), 1)),
                        new RandomSpreadFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(0), ConstantIntProvider.create(2), 50),
                        new TwoLayersFeatureSize(1, 0, 1)).dirtProvider(BlockStateProvider.of(Blocks.ROOTED_DIRT)).forceDirt().build());
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(FlowerBreeding.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context, RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
