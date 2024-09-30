package net.flowerbreeding.util;

import net.flowerbreeding.FlowerBreeding;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class FBTags {

    public static class Blocks {
        public static final TagKey<Block> FBFLOWERS = createTag("fbflowers");
        public static final TagKey<Block> MAGENTA_FLOWERS = createTag("magenta_flowers");
        public static final TagKey<Block> BLUE_FLOWERS = createTag("blue_flowers");
        public static final TagKey<Block> WHITE_FLOWERS = createTag("white_flowers");
        public static final TagKey<Block> ORANGE_FLOWERS = createTag("orange_flowers");
        public static final TagKey<Block> RED_FLOWERS = createTag("red_flowers");
        public static final TagKey<Block> YELLOW_FLOWERS = createTag("yellow_flowers");
        public static final TagKey<Block> CYAN_FLOWERS = createTag("cyan_flowers");
        public static final TagKey<Block> PINK_FLOWERS = createTag("pink_flowers");
        public static final TagKey<Block> BLACK_FLOWERS = createTag("black_flowers");
        public static final TagKey<Block> LILAC_FLOWERS = createTag("lilac_flowers");
        public static final TagKey<Block> ALLIUMS = createTag("alliums");
        public static final TagKey<Block> CORNFLOWERS = createTag("cornflowers");
        public static final TagKey<Block> DAISIES = createTag("daisies");
        public static final TagKey<Block> TORCHFLOWERS = createTag("torchflowers");
        public static final TagKey<Block> TULIPS = createTag("tulips");
        public static final TagKey<Block> AZURE_BLUETS = createTag("azure_bluets");
        public static final TagKey<Block> DANDELIONS = createTag("dandelions");
        public static final TagKey<Block> ORCHIDS = createTag("orchids");
        public static final TagKey<Block> LILIES = createTag("lilies");
        public static final TagKey<Block> POPPIES = createTag("poppies");
        public static final TagKey<Block> WITHER_ROSES = createTag("wither_roses");
        public static final TagKey<Block> LILACS = createTag("lilacs");
        public static final TagKey<Block> PEONIES = createTag("peonies");
        public static final TagKey<Block> PITCHER_PLANTS = createTag("pitcher_plants");
        public static final TagKey<Block> ROSE_BUSHES = createTag("rose_bushes");
        public static final TagKey<Block> SUNFLOWERS = createTag("sunflowers");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(FlowerBreeding.MOD_ID, name));
        }
    }
    public static class Items {
        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(FlowerBreeding.MOD_ID, name));
        }
    }
}
