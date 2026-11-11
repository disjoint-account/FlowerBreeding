package net.flowerbreeding.world.feature;

import net.flowerbreeding.FBBlocks;
import net.flowerbreeding.FlowerBreeding;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.random.WeightedList;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.HugeMushroomBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.HugeRedMushroomFeature;
import net.minecraft.world.level.levelgen.feature.SimpleBlockFeature;
import net.minecraft.world.level.levelgen.feature.TreeFeature;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.RandomSpreadFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.WeightedStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.BendingTrunkPlacer;

public class FBConfiguredFeatures {

    public static final ResourceKey<Feature> SAGE_KEY = registerKey("sage");
    public static final ResourceKey<Feature> HUGE_MAGENTA_GLOWSHROOM = registerKey("huge_magenta_glowshroom");
    public static final ResourceKey<Feature> HUGE_BLUE_GLOWSHROOM = registerKey("huge_blue_glowshroom");
    public static final ResourceKey<Feature> HUGE_WHITE_GLOWSHROOM = registerKey("huge_white_glowshroom");
    public static final ResourceKey<Feature> HUGE_ORANGE_GLOWSHROOM = registerKey("huge_orange_glowshroom");
    public static final ResourceKey<Feature> HUGE_RED_GLOWSHROOM = registerKey("huge_red_glowshroom");
    public static final ResourceKey<Feature> HUGE_YELLOW_GLOWSHROOM = registerKey("huge_yellow_glowshroom");
    public static final ResourceKey<Feature> HUGE_LIGHT_BLUE_GLOWSHROOM = registerKey("huge_light_blue_glowshroom");
    public static final ResourceKey<Feature> HUGE_PINK_GLOWSHROOM = registerKey("huge_pink_glowshroom");
    public static final ResourceKey<Feature> HUGE_BLACK_GLOWSHROOM = registerKey("huge_black_glowshroom");
    public static final ResourceKey<Feature> HUGE_CYAN_GLOWSHROOM = registerKey("huge_cyan_glowshroom");
    public static final ResourceKey<Feature> HUGE_GREEN_GLOWSHROOM = registerKey("huge_green_glowshroom");
    public static final ResourceKey<Feature> MAGENTA_AZALEA_TREE = registerKey("magenta_azalea_tree");
    public static final ResourceKey<Feature> BLUE_AZALEA_TREE = registerKey("blue_azalea_tree");
    public static final ResourceKey<Feature> WHITE_AZALEA_TREE = registerKey("white_azalea_tree");
    public static final ResourceKey<Feature> ORANGE_AZALEA_TREE = registerKey("orange_azalea_tree");
    public static final ResourceKey<Feature> RED_AZALEA_TREE = registerKey("red_azalea_tree");
    public static final ResourceKey<Feature> YELLOW_AZALEA_TREE = registerKey("yellow_azalea_tree");
    public static final ResourceKey<Feature> LIGHT_BLUE_AZALEA_TREE = registerKey("light_blue_azalea_tree");
    public static final ResourceKey<Feature> BLACK_AZALEA_TREE = registerKey("black_azalea_tree");
    public static final ResourceKey<Feature> CYAN_AZALEA_TREE = registerKey("cyan_azalea_tree");


    public static void bootstrap(BootstrapContext<Feature> context) {
                
        context.register(SAGE_KEY, new SimpleBlockFeature(BlockStateProvider.of(FBBlocks.SAGE)));

        context.register(HUGE_MAGENTA_GLOWSHROOM,
                new HugeRedMushroomFeature(
                        BlockStateProvider.holderOf(FBBlocks.MAGENTA_GLOWSHROOM_BLOCK.defaultBlockState().setValue(HugeMushroomBlock.DOWN, Boolean.FALSE)),
                        BlockStateProvider.holderOf(Blocks.MUSHROOM_STEM.defaultBlockState().setValue(HugeMushroomBlock.UP, Boolean.FALSE).setValue(HugeMushroomBlock.DOWN, Boolean.FALSE)),
                        2,
                        BlockPredicate.allOf(BlockPredicate.matchesTag(BlockTags.HUGE_RED_MUSHROOM_CAN_PLACE_ON), BlockPredicate.matchesBlocks(Blocks.PODZOL,
                        Blocks.DIRT,
                        Blocks.MYCELIUM,
                        Blocks.GRASS_BLOCK,
                        Blocks.MOSS_BLOCK,
                        Blocks.COARSE_DIRT))));

        context.register(HUGE_BLUE_GLOWSHROOM,
                new HugeRedMushroomFeature(
                        BlockStateProvider.holderOf(FBBlocks.BLUE_GLOWSHROOM_BLOCK.defaultBlockState().setValue(HugeMushroomBlock.DOWN, Boolean.FALSE)),
                        BlockStateProvider.holderOf(Blocks.MUSHROOM_STEM.defaultBlockState().setValue(HugeMushroomBlock.UP, Boolean.FALSE).setValue(HugeMushroomBlock.DOWN, Boolean.FALSE)),
                        2,
                        BlockPredicate.allOf(BlockPredicate.matchesTag(BlockTags.HUGE_RED_MUSHROOM_CAN_PLACE_ON), BlockPredicate.matchesBlocks(Blocks.PODZOL,
                                Blocks.DIRT,
                                Blocks.MYCELIUM,
                                Blocks.GRASS_BLOCK,
                                Blocks.MOSS_BLOCK,
                                Blocks.COARSE_DIRT))));

        context.register(HUGE_WHITE_GLOWSHROOM,
                new HugeRedMushroomFeature(
                        BlockStateProvider.holderOf(FBBlocks.WHITE_GLOWSHROOM_BLOCK.defaultBlockState().setValue(HugeMushroomBlock.DOWN, Boolean.FALSE)),
                        BlockStateProvider.holderOf(Blocks.MUSHROOM_STEM.defaultBlockState().setValue(HugeMushroomBlock.UP, Boolean.FALSE).setValue(HugeMushroomBlock.DOWN, Boolean.FALSE)),
                        2,
                        BlockPredicate.allOf(BlockPredicate.matchesTag(BlockTags.HUGE_RED_MUSHROOM_CAN_PLACE_ON), BlockPredicate.matchesBlocks(Blocks.PODZOL,
                                Blocks.DIRT,
                                Blocks.MYCELIUM,
                                Blocks.GRASS_BLOCK,
                                Blocks.MOSS_BLOCK,
                                Blocks.COARSE_DIRT))));

        context.register(HUGE_ORANGE_GLOWSHROOM,
                new HugeRedMushroomFeature(
                        BlockStateProvider.holderOf(FBBlocks.ORANGE_GLOWSHROOM_BLOCK.defaultBlockState().setValue(HugeMushroomBlock.DOWN, Boolean.FALSE)),
                        BlockStateProvider.holderOf(Blocks.MUSHROOM_STEM.defaultBlockState().setValue(HugeMushroomBlock.UP, Boolean.FALSE).setValue(HugeMushroomBlock.DOWN, Boolean.FALSE)),
                        2,
                        BlockPredicate.allOf(BlockPredicate.matchesTag(BlockTags.HUGE_RED_MUSHROOM_CAN_PLACE_ON), BlockPredicate.matchesBlocks(Blocks.PODZOL,
                                Blocks.DIRT,
                                Blocks.MYCELIUM,
                                Blocks.GRASS_BLOCK,
                                Blocks.MOSS_BLOCK,
                                Blocks.COARSE_DIRT))));

        context.register(HUGE_RED_GLOWSHROOM,
                new HugeRedMushroomFeature(
                        BlockStateProvider.holderOf(FBBlocks.RED_GLOWSHROOM_BLOCK.defaultBlockState().setValue(HugeMushroomBlock.DOWN, Boolean.FALSE)),
                        BlockStateProvider.holderOf(Blocks.MUSHROOM_STEM.defaultBlockState().setValue(HugeMushroomBlock.UP, Boolean.FALSE).setValue(HugeMushroomBlock.DOWN, Boolean.FALSE)),
                        2,
                        BlockPredicate.allOf(BlockPredicate.matchesTag(BlockTags.HUGE_RED_MUSHROOM_CAN_PLACE_ON), BlockPredicate.matchesBlocks(Blocks.PODZOL,
                                Blocks.DIRT,
                                Blocks.MYCELIUM,
                                Blocks.GRASS_BLOCK,
                                Blocks.MOSS_BLOCK,
                                Blocks.COARSE_DIRT))));

        context.register(HUGE_YELLOW_GLOWSHROOM,
                new HugeRedMushroomFeature(
                        BlockStateProvider.holderOf(FBBlocks.YELLOW_GLOWSHROOM_BLOCK.defaultBlockState().setValue(HugeMushroomBlock.DOWN, Boolean.FALSE)),
                        BlockStateProvider.holderOf(Blocks.MUSHROOM_STEM.defaultBlockState().setValue(HugeMushroomBlock.UP, Boolean.FALSE).setValue(HugeMushroomBlock.DOWN, Boolean.FALSE)),
                        2,
                        BlockPredicate.allOf(BlockPredicate.matchesTag(BlockTags.HUGE_RED_MUSHROOM_CAN_PLACE_ON), BlockPredicate.matchesBlocks(Blocks.PODZOL,
                                Blocks.DIRT,
                                Blocks.MYCELIUM,
                                Blocks.GRASS_BLOCK,
                                Blocks.MOSS_BLOCK,
                                Blocks.COARSE_DIRT))));

        context.register(HUGE_LIGHT_BLUE_GLOWSHROOM,
                new HugeRedMushroomFeature(
                        BlockStateProvider.holderOf(FBBlocks.LIGHT_BLUE_GLOWSHROOM_BLOCK.defaultBlockState().setValue(HugeMushroomBlock.DOWN, Boolean.FALSE)),
                        BlockStateProvider.holderOf(Blocks.MUSHROOM_STEM.defaultBlockState().setValue(HugeMushroomBlock.UP, Boolean.FALSE).setValue(HugeMushroomBlock.DOWN, Boolean.FALSE)),
                        2,
                        BlockPredicate.allOf(BlockPredicate.matchesTag(BlockTags.HUGE_RED_MUSHROOM_CAN_PLACE_ON), BlockPredicate.matchesBlocks(Blocks.PODZOL,
                                Blocks.DIRT,
                                Blocks.MYCELIUM,
                                Blocks.GRASS_BLOCK,
                                Blocks.MOSS_BLOCK,
                                Blocks.COARSE_DIRT))));

        context.register(HUGE_PINK_GLOWSHROOM,
                new HugeRedMushroomFeature(
                        BlockStateProvider.holderOf(FBBlocks.PINK_GLOWSHROOM_BLOCK.defaultBlockState().setValue(HugeMushroomBlock.DOWN, Boolean.FALSE)),
                        BlockStateProvider.holderOf(Blocks.MUSHROOM_STEM.defaultBlockState().setValue(HugeMushroomBlock.UP, Boolean.FALSE).setValue(HugeMushroomBlock.DOWN, Boolean.FALSE)),
                        2,
                        BlockPredicate.allOf(BlockPredicate.matchesTag(BlockTags.HUGE_RED_MUSHROOM_CAN_PLACE_ON), BlockPredicate.matchesBlocks(Blocks.PODZOL,
                                Blocks.DIRT,
                                Blocks.MYCELIUM,
                                Blocks.GRASS_BLOCK,
                                Blocks.MOSS_BLOCK,
                                Blocks.COARSE_DIRT))));

        context.register(HUGE_BLACK_GLOWSHROOM,
                new HugeRedMushroomFeature(
                        BlockStateProvider.holderOf(FBBlocks.BLACK_GLOWSHROOM_BLOCK.defaultBlockState().setValue(HugeMushroomBlock.DOWN, Boolean.FALSE)),
                        BlockStateProvider.holderOf(Blocks.MUSHROOM_STEM.defaultBlockState().setValue(HugeMushroomBlock.UP, Boolean.FALSE).setValue(HugeMushroomBlock.DOWN, Boolean.FALSE)),
                        2,
                        BlockPredicate.allOf(BlockPredicate.matchesTag(BlockTags.HUGE_RED_MUSHROOM_CAN_PLACE_ON), BlockPredicate.matchesBlocks(Blocks.PODZOL,
                                Blocks.DIRT,
                                Blocks.MYCELIUM,
                                Blocks.GRASS_BLOCK,
                                Blocks.MOSS_BLOCK,
                                Blocks.COARSE_DIRT))));

        context.register(HUGE_CYAN_GLOWSHROOM,
                new HugeRedMushroomFeature(
                        BlockStateProvider.holderOf(FBBlocks.CYAN_GLOWSHROOM_BLOCK.defaultBlockState().setValue(HugeMushroomBlock.DOWN, Boolean.FALSE)),
                        BlockStateProvider.holderOf(Blocks.MUSHROOM_STEM.defaultBlockState().setValue(HugeMushroomBlock.UP, Boolean.FALSE).setValue(HugeMushroomBlock.DOWN, Boolean.FALSE)),
                        2,
                        BlockPredicate.allOf(BlockPredicate.matchesTag(BlockTags.HUGE_RED_MUSHROOM_CAN_PLACE_ON), BlockPredicate.matchesBlocks(Blocks.PODZOL,
                                Blocks.DIRT,
                                Blocks.MYCELIUM,
                                Blocks.GRASS_BLOCK,
                                Blocks.MOSS_BLOCK,
                                Blocks.COARSE_DIRT))));
        
        context.register(HUGE_GREEN_GLOWSHROOM,
                new HugeRedMushroomFeature(
                        BlockStateProvider.holderOf(FBBlocks.GREEN_GLOWSHROOM_BLOCK.defaultBlockState().setValue(HugeMushroomBlock.DOWN, Boolean.FALSE)),
                        BlockStateProvider.holderOf(Blocks.MUSHROOM_STEM.defaultBlockState().setValue(HugeMushroomBlock.UP, Boolean.FALSE).setValue(HugeMushroomBlock.DOWN, Boolean.FALSE)),
                        2,
                        BlockPredicate.allOf(BlockPredicate.matchesTag(BlockTags.HUGE_RED_MUSHROOM_CAN_PLACE_ON), BlockPredicate.matchesBlocks(Blocks.PODZOL,
                                Blocks.DIRT,
                                Blocks.MYCELIUM,
                                Blocks.GRASS_BLOCK,
                                Blocks.MOSS_BLOCK,
                                Blocks.COARSE_DIRT))));

        context.register(MAGENTA_AZALEA_TREE,
                new TreeFeature.Builder(
                        BlockStateProvider.of(Blocks.OAK_LOG),
                        new BendingTrunkPlacer(4, 2, 0, 3, UniformInt.of(1, 2)),
                        new WeightedStateProvider(WeightedList.<BlockState>builder().add(Blocks.AZALEA_LEAVES.defaultBlockState(), 3).add(FBBlocks.MAGENTA_FLOWERING_AZALEA_LEAVES.defaultBlockState(), 1)),
                        new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 50),
                        new TwoLayersFeatureSize(1, 0, 1),
                        BlockStateProvider.holderOf(Blocks.ROOTED_DIRT)).build());

        context.register(BLUE_AZALEA_TREE,
                new TreeFeature.Builder(
                        BlockStateProvider.of(Blocks.OAK_LOG),
                        new BendingTrunkPlacer(4, 2, 0, 3, UniformInt.of(1, 2)),
                        new WeightedStateProvider(WeightedList.<BlockState>builder().add(Blocks.AZALEA_LEAVES.defaultBlockState(), 3).add(FBBlocks.BLUE_FLOWERING_AZALEA_LEAVES.defaultBlockState(), 1)),
                        new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 50),
                        new TwoLayersFeatureSize(1, 0, 1),
                        BlockStateProvider.holderOf(Blocks.ROOTED_DIRT)).build());

        context.register(WHITE_AZALEA_TREE,
                new TreeFeature.Builder(
                        BlockStateProvider.of(Blocks.OAK_LOG),
                        new BendingTrunkPlacer(4, 2, 0, 3, UniformInt.of(1, 2)),
                        new WeightedStateProvider(WeightedList.<BlockState>builder().add(Blocks.AZALEA_LEAVES.defaultBlockState(), 3).add(FBBlocks.WHITE_FLOWERING_AZALEA_LEAVES.defaultBlockState(), 1)),
                        new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 50),
                        new TwoLayersFeatureSize(1, 0, 1),
                        BlockStateProvider.holderOf(Blocks.ROOTED_DIRT)).build());

        context.register(ORANGE_AZALEA_TREE,
                new TreeFeature.Builder(
                        BlockStateProvider.of(Blocks.OAK_LOG),
                        new BendingTrunkPlacer(4, 2, 0, 3, UniformInt.of(1, 2)),
                        new WeightedStateProvider(WeightedList.<BlockState>builder().add(Blocks.AZALEA_LEAVES.defaultBlockState(), 3).add(FBBlocks.ORANGE_FLOWERING_AZALEA_LEAVES.defaultBlockState(), 1)),
                        new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 50),
                        new TwoLayersFeatureSize(1, 0, 1),
                        BlockStateProvider.holderOf(Blocks.ROOTED_DIRT)).build());

        context.register(RED_AZALEA_TREE,
                new TreeFeature.Builder(
                        BlockStateProvider.of(Blocks.OAK_LOG),
                        new BendingTrunkPlacer(4, 2, 0, 3, UniformInt.of(1, 2)),
                        new WeightedStateProvider(WeightedList.<BlockState>builder().add(Blocks.AZALEA_LEAVES.defaultBlockState(), 3).add(FBBlocks.RED_FLOWERING_AZALEA_LEAVES.defaultBlockState(), 1)),
                        new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 50),
                        new TwoLayersFeatureSize(1, 0, 1),
                        BlockStateProvider.holderOf(Blocks.ROOTED_DIRT)).build());

        context.register(YELLOW_AZALEA_TREE,
                new TreeFeature.Builder(
                        BlockStateProvider.of(Blocks.OAK_LOG),
                        new BendingTrunkPlacer(4, 2, 0, 3, UniformInt.of(1, 2)),
                        new WeightedStateProvider(WeightedList.<BlockState>builder().add(Blocks.AZALEA_LEAVES.defaultBlockState(), 3).add(FBBlocks.YELLOW_FLOWERING_AZALEA_LEAVES.defaultBlockState(), 1)),
                        new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 50),
                        new TwoLayersFeatureSize(1, 0, 1),
                        BlockStateProvider.holderOf(Blocks.ROOTED_DIRT)).build());

        context.register(LIGHT_BLUE_AZALEA_TREE,
                new TreeFeature.Builder(
                        BlockStateProvider.of(Blocks.OAK_LOG),
                        new BendingTrunkPlacer(4, 2, 0, 3, UniformInt.of(1, 2)),
                        new WeightedStateProvider(WeightedList.<BlockState>builder().add(Blocks.AZALEA_LEAVES.defaultBlockState(), 3).add(FBBlocks.LIGHT_BLUE_FLOWERING_AZALEA_LEAVES.defaultBlockState(), 1)),
                        new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 50),
                        new TwoLayersFeatureSize(1, 0, 1),
                        BlockStateProvider.holderOf(Blocks.ROOTED_DIRT)).build());

        context.register(BLACK_AZALEA_TREE, new TreeFeature.Builder(
                        BlockStateProvider.of(Blocks.OAK_LOG),
                        new BendingTrunkPlacer(4, 2, 0, 3, UniformInt.of(1, 2)),
                        new WeightedStateProvider(WeightedList.<BlockState>builder().add(Blocks.AZALEA_LEAVES.defaultBlockState(), 3).add(FBBlocks.BLACK_FLOWERING_AZALEA_LEAVES.defaultBlockState(), 1)),
                        new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 50),
                        new TwoLayersFeatureSize(1, 0, 1),
                        BlockStateProvider.holderOf(Blocks.ROOTED_DIRT)).build());

        context.register(CYAN_AZALEA_TREE,
                new TreeFeature.Builder(
                        BlockStateProvider.of(Blocks.OAK_LOG),
                        new BendingTrunkPlacer(4, 2, 0, 3, UniformInt.of(1, 2)),
                        new WeightedStateProvider(WeightedList.<BlockState>builder().add(Blocks.AZALEA_LEAVES.defaultBlockState(), 3).add(FBBlocks.CYAN_FLOWERING_AZALEA_LEAVES.defaultBlockState(), 1)),
                        new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 50),
                        new TwoLayersFeatureSize(1, 0, 1),
                        BlockStateProvider.holderOf(Blocks.ROOTED_DIRT)).build());
    }

    public static ResourceKey<Feature> registerKey(String name) {
        return ResourceKey.create(Registries.FEATURE, Identifier.fromNamespaceAndPath(FlowerBreeding.MOD_ID, name));
    }
}
