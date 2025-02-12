package net.flowerbreeding.util;

import net.flowerbreeding.FlowerBreeding;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.structure.Structure;

public class FBTags {

    public static class Blocks {
        public static final TagKey<Block> FBFLOWERS = createTag("fbflowers");
        public static final TagKey<Block> POLLEN_PLANTS = createTag("pollen_plants");
        public static final TagKey<Block> COLOUR_FLOWERS = createTag("colour_flowers");
        public static final TagKey<Block> TALL_FLOWERS = createTag("tall_flowers");
        public static final TagKey<Block> MAGENTA_FLOWERS = createTag("magenta_flowers");
        public static final TagKey<Block> BLUE_FLOWERS = createTag("blue_flowers");
        public static final TagKey<Block> WHITE_FLOWERS = createTag("white_flowers");
        public static final TagKey<Block> ORANGE_FLOWERS = createTag("orange_flowers");
        public static final TagKey<Block> RED_FLOWERS = createTag("red_flowers");
        public static final TagKey<Block> YELLOW_FLOWERS = createTag("yellow_flowers");
        public static final TagKey<Block> LIGHT_BLUE_FLOWERS = createTag("light_blue_flowers");
        public static final TagKey<Block> PINK_FLOWERS = createTag("pink_flowers");
        public static final TagKey<Block> BLACK_FLOWERS = createTag("black_flowers");
        public static final TagKey<Block> CYAN_FLOWERS = createTag("cyan_flowers");
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
        public static final TagKey<Block> OPEN_EYEBLOSSOMS = createTag("open_eyeblossoms");
        public static final TagKey<Block> CLOSED_EYEBLOSSOMS = createTag("closed_eyeblossoms");
        public static final TagKey<Block> LILACS = createTag("lilacs");
        public static final TagKey<Block> PEONIES = createTag("peonies");
        public static final TagKey<Block> PITCHER_PLANTS = createTag("pitcher_plants");
        public static final TagKey<Block> ROSE_BUSHES = createTag("rose_bushes");
        public static final TagKey<Block> SUNFLOWERS = createTag("sunflowers");
        public static final TagKey<Block> PETALS = createTag("petals");
        public static final TagKey<Block> SPORE_BLOSSOMS = createTag("spore_blossoms");
        public static final TagKey<Block> FLOWERING_AZALEAS = createTag("flowering_azaleas");
        public static final TagKey<Block> FLOWERING_AZALEA_LEAVES = createTag("flowering_azalea_leaves");
        public static final TagKey<Block> DAFFODILS = createTag("daffodils");
        public static final TagKey<Block> FOXGLOVES = createTag("foxgloves");
        public static final TagKey<Block> HYACINTHS = createTag("hyacinths");
        public static final TagKey<Block> LAVENDERS = createTag("lavenders");
        public static final TagKey<Block> PHLOXES = createTag("phloxes");
        public static final TagKey<Block> LUPINS = createTag("lupins");
        public static final TagKey<Block> SMALL_ROSES = createTag("small_roses");
        public static final TagKey<Block> JASMINES = createTag("jasmines");
        public static final TagKey<Block> HYDRANGEAS = createTag("hydrangeas");
        public static final TagKey<Block> CYPRUS_VINES = createTag("cyprus_vines");
        public static final TagKey<Block> LOTUS_FLOWERS = createTag("lotus_flowers");
        public static final TagKey<Block> GLOWSHROOMS = createTag("glowshrooms");
        public static final TagKey<Block> MUSHROOMS = createTag("mushrooms");
        public static final TagKey<Block> FROGLIGHTS = createTag("froglights");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(FlowerBreeding.MOD_ID, name));
        }
    }
    public static class Items {
        public static final TagKey<Item> SMALL_FLOWERS = createTag("small_flowers");
        public static final TagKey<Item> TALL_FLOWERS = createTag("tall_flowers");
        public static final TagKey<Item> MAGENTA_FLOWERS = createTag("magenta_flowers");
        public static final TagKey<Item> SMALL_MAGENTA_FLOWERS = createTag("small_magenta_flowers");
        public static final TagKey<Item> TALL_MAGENTA_FLOWERS = createTag("tall_magenta_flowers");
        public static final TagKey<Item> BLUE_FLOWERS = createTag("blue_flowers");
        public static final TagKey<Item> SMALL_BLUE_FLOWERS = createTag("small_blue_flowers");
        public static final TagKey<Item> TALL_BLUE_FLOWERS = createTag("tall_blue_flowers");
        public static final TagKey<Item> WHITE_FLOWERS = createTag("white_flowers");
        public static final TagKey<Item> SMALL_WHITE_FLOWERS = createTag("small_white_flowers");
        public static final TagKey<Item> TALL_WHITE_FLOWERS = createTag("tall_white_flowers");
        public static final TagKey<Item> ORANGE_FLOWERS = createTag("orange_flowers");
        public static final TagKey<Item> SMALL_ORANGE_FLOWERS = createTag("small_orange_flowers");
        public static final TagKey<Item> TALL_ORANGE_FLOWERS = createTag("tall_orange_flowers");
        public static final TagKey<Item> RED_FLOWERS = createTag("red_flowers");
        public static final TagKey<Item> SMALL_RED_FLOWERS = createTag("small_red_flowers");
        public static final TagKey<Item> TALL_RED_FLOWERS = createTag("tall_red_flowers");
        public static final TagKey<Item> YELLOW_FLOWERS = createTag("yellow_flowers");
        public static final TagKey<Item> SMALL_YELLOW_FLOWERS = createTag("small_yellow_flowers");
        public static final TagKey<Item> TALL_YELLOW_FLOWERS = createTag("tall_yellow_flowers");
        public static final TagKey<Item> LIGHT_BLUE_FLOWERS = createTag("light_blue_flowers");
        public static final TagKey<Item> SMALL_LIGHT_BLUE_FLOWERS = createTag("small_light_blue_flowers");
        public static final TagKey<Item> TALL_LIGHT_BLUE_FLOWERS = createTag("tall_light_blue_flowers");
        public static final TagKey<Item> PINK_FLOWERS = createTag("pink_flowers");
        public static final TagKey<Item> SMALL_PINK_FLOWERS = createTag("small_pink_flowers");
        public static final TagKey<Item> TALL_PINK_FLOWERS = createTag("tall_pink_flowers");
        public static final TagKey<Item> BLACK_FLOWERS = createTag("black_flowers");
        public static final TagKey<Item> SMALL_BLACK_FLOWERS = createTag("small_black_flowers");
        public static final TagKey<Item> TALL_BLACK_FLOWERS = createTag("tall_black_flowers");
        public static final TagKey<Item> CYAN_FLOWERS = createTag("cyan_flowers");
        public static final TagKey<Item> SMALL_CYAN_FLOWERS = createTag("small_cyan_flowers");
        public static final TagKey<Item> TALL_CYAN_FLOWERS = createTag("tall_cyan_flowers");
        public static final TagKey<Item> LIGHT_GREY_DYE_SMALL_FLOWERS = createTag("light_grey_dye_small_flowers");
        public static final TagKey<Item> ORANGE_DYE_SMALL_FLOWERS = createTag("orange_dye_small_flowers");
        public static final TagKey<Item> RED_DYE_SMALL_FLOWERS = createTag("red_dye_small_flowers");
        public static final TagKey<Item> STEW_TULIPS = createTag("stew_tulips");
        public static final TagKey<Item> ALLIUMS = createTag("alliums");
        public static final TagKey<Item> CORNFLOWERS = createTag("cornflowers");
        public static final TagKey<Item> DAISIES = createTag("daisies");
        public static final TagKey<Item> TORCHFLOWERS = createTag("torchflowers");
        public static final TagKey<Item> TULIPS = createTag("tulips");
        public static final TagKey<Item> AZURE_BLUETS = createTag("azure_bluets");
        public static final TagKey<Item> DANDELIONS = createTag("dandelions");
        public static final TagKey<Item> ORCHIDS = createTag("orchids");
        public static final TagKey<Item> LILIES = createTag("lilies");
        public static final TagKey<Item> POPPIES = createTag("poppies");
        public static final TagKey<Item> WITHER_ROSES = createTag("wither_roses");
        public static final TagKey<Item> OPEN_EYEBLOSSOMS = createTag("open_eyeblossoms");
        public static final TagKey<Item> CLOSED_EYEBLOSSOMS = createTag("closed_eyeblossoms");
        public static final TagKey<Item> DAFFODILS = createTag("daffodils");
        public static final TagKey<Item> FOXGLOVES = createTag("foxgloves");
        public static final TagKey<Item> HYACINTHS = createTag("hyacinths");
        public static final TagKey<Item> PHLOXES = createTag("phloxes");
        public static final TagKey<Item> LUPINS = createTag("lupins");
        public static final TagKey<Item> SMALL_ROSES = createTag("small_roses");
        public static final TagKey<Item> GLOWSHROOMS = createTag("glowshrooms");
        public static final TagKey<Item> VASE_FLOWERS = createTag("vase_flowers");
        public static final TagKey<Item> PLANTER_PLANTS = createTag("planter_plants");
        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(FlowerBreeding.MOD_ID, name));
        }
    }
    public static class Structures {
        public static final TagKey<Structure> ON_FLORA_EXPLORER_MAPS = createTag("on_flora_explorer_maps");
        private static TagKey<Structure> createTag(String name) {
            return TagKey.of(RegistryKeys.STRUCTURE, Identifier.of(FlowerBreeding.MOD_ID, name));
        }
    }
}
