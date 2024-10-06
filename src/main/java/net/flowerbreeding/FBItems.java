package net.flowerbreeding;

import net.flowerbreeding.pigmentjars.*;
import net.minecraft.item.Item;
import net.minecraft.item.PlaceableOnWaterItem;
import net.minecraft.item.SmithingTemplateItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.resource.featuretoggle.FeatureFlags;
import net.minecraft.util.Identifier;

public class FBItems {

    public static final Item EMPTY_PIGMENT_JAR = registerItem("empty_pigment_jar",
            new EmptyPigmentJarItem(new Item.Settings().maxCount(1)));
    public static final Item MAGENTA_PIGMENT_JAR = registerItem("magenta_pigment_jar",
            new MagentaPigmentJarItem(new Item.Settings().maxCount(1)));
    public static final Item BLUE_PIGMENT_JAR = registerItem("blue_pigment_jar",
            new BluePigmentJarItem(new Item.Settings().maxCount(1)));
    public static final Item WHITE_PIGMENT_JAR = registerItem("white_pigment_jar",
            new WhitePigmentJarItem(new Item.Settings().maxCount(1)));
    public static final Item ORANGE_PIGMENT_JAR = registerItem("orange_pigment_jar",
            new OrangePigmentJarItem(new Item.Settings().maxCount(1)));
    public static final Item RED_PIGMENT_JAR = registerItem("red_pigment_jar",
            new RedPigmentJarItem(new Item.Settings().maxCount(1)));
    public static final Item YELLOW_PIGMENT_JAR = registerItem("yellow_pigment_jar",
            new YellowPigmentJarItem(new Item.Settings().maxCount(1)));
    public static final Item LIGHT_BLUE_PIGMENT_JAR = registerItem("light_blue_pigment_jar",
            new LightBluePigmentJarItem(new Item.Settings().maxCount(1)));
    public static final Item PINK_PIGMENT_JAR = registerItem("pink_pigment_jar",
            new PinkPigmentJarItem(new Item.Settings().maxCount(1)));
    public static final Item BLACK_PIGMENT_JAR = registerItem("black_pigment_jar",
            new BlackPigmentJarItem(new Item.Settings().maxCount(1)));
    public static final Item CYAN_PIGMENT_JAR = registerItem("cyan_pigment_jar",
            new CyanPigmentJarItem(new Item.Settings().maxCount(1)));

    public static final Item EMPTY_POLLEN_VIAL = registerItem("empty_pollen_vial",
            new EmptyPollenVialItem(new Item.Settings().maxCount(1)));
    public static final Item ALLIUM_POLLEN_VIAL = registerItem("allium_pollen_vial",
            new FullPollenVialItem(new Item.Settings().maxCount(1)));
    public static final Item CORNFLOWER_POLLEN_VIAL = registerItem("cornflower_pollen_vial",
            new FullPollenVialItem(new Item.Settings().maxCount(1)));
    public static final Item DAISY_POLLEN_VIAL = registerItem("daisy_pollen_vial",
            new FullPollenVialItem(new Item.Settings().maxCount(1)));
    public static final Item TORCHFLOWER_POLLEN_VIAL = registerItem("torchflower_pollen_vial",
            new FullPollenVialItem(new Item.Settings().maxCount(1)));
    public static final Item TULIP_POLLEN_VIAL = registerItem("tulip_pollen_vial",
            new FullPollenVialItem(new Item.Settings().maxCount(1)));
    public static final Item AZURE_BLUET_POLLEN_VIAL = registerItem("azure_bluet_pollen_vial",
            new FullPollenVialItem(new Item.Settings().maxCount(1)));
    public static final Item DANDELION_POLLEN_VIAL = registerItem("dandelion_pollen_vial",
            new FullPollenVialItem(new Item.Settings().maxCount(1)));
    public static final Item ORCHID_POLLEN_VIAL = registerItem("orchid_pollen_vial",
            new FullPollenVialItem(new Item.Settings().maxCount(1)));
    public static final Item LILY_POLLEN_VIAL = registerItem("lily_pollen_vial",
            new FullPollenVialItem(new Item.Settings().maxCount(1)));
    public static final Item POPPY_POLLEN_VIAL = registerItem("poppy_pollen_vial",
            new FullPollenVialItem(new Item.Settings().maxCount(1)));
    public static final Item WITHER_ROSE_POLLEN_VIAL = registerItem("wither_rose_pollen_vial",
            new FullPollenVialItem(new Item.Settings().maxCount(1)));
    public static final Item LILAC_POLLEN_VIAL = registerItem("lilac_pollen_vial",
            new FullPollenVialItem(new Item.Settings().maxCount(1)));
    public static final Item PEONY_POLLEN_VIAL = registerItem("peony_pollen_vial",
            new FullPollenVialItem(new Item.Settings().maxCount(1)));
    public static final Item PITCHER_PLANT_POLLEN_VIAL = registerItem("pitcher_plant_pollen_vial",
            new FullPollenVialItem(new Item.Settings().maxCount(1)));
    public static final Item ROSE_BUSH_POLLEN_VIAL = registerItem("rose_bush_pollen_vial",
            new FullPollenVialItem(new Item.Settings().maxCount(1)));
    public static final Item SUNFLOWER_POLLEN_VIAL = registerItem("sunflower_pollen_vial",
            new FullPollenVialItem(new Item.Settings().maxCount(1)));
    public static final Item LILY_PAD_POLLEN_VIAL = registerItem("lily_pad_pollen_vial",
            new FullPollenVialItem(new Item.Settings().maxCount(1)));

    public static final Item MAGENTA_LOTUS_FLOWER = registerItem("magenta_lotus_flower",
            new PlaceableOnWaterItem(FBBlocks.MAGENTA_LOTUS_FLOWER, new Item.Settings()));
    public static final Item BLUE_LOTUS_FLOWER = registerItem("blue_lotus_flower",
            new PlaceableOnWaterItem(FBBlocks.BLUE_LOTUS_FLOWER, new Item.Settings()));
    public static final Item WHITE_LOTUS_FLOWER = registerItem("white_lotus_flower",
            new PlaceableOnWaterItem(FBBlocks.WHITE_LOTUS_FLOWER, new Item.Settings()));
    public static final Item ORANGE_LOTUS_FLOWER = registerItem("orange_lotus_flower",
            new PlaceableOnWaterItem(FBBlocks.ORANGE_LOTUS_FLOWER, new Item.Settings()));
    public static final Item RED_LOTUS_FLOWER = registerItem("red_lotus_flower",
            new PlaceableOnWaterItem(FBBlocks.RED_LOTUS_FLOWER, new Item.Settings()));
    public static final Item YELLOW_LOTUS_FLOWER = registerItem("yellow_lotus_flower",
            new PlaceableOnWaterItem(FBBlocks.YELLOW_LOTUS_FLOWER, new Item.Settings()));
    public static final Item LIGHT_BLUE_LOTUS_FLOWER = registerItem("light_blue_lotus_flower",
            new PlaceableOnWaterItem(FBBlocks.LIGHT_BLUE_LOTUS_FLOWER, new Item.Settings()));
    public static final Item PINK_LOTUS_FLOWER = registerItem("pink_lotus_flower",
            new PlaceableOnWaterItem(FBBlocks.PINK_LOTUS_FLOWER, new Item.Settings()));
    public static final Item BLACK_LOTUS_FLOWER = registerItem("black_lotus_flower",
            new PlaceableOnWaterItem(FBBlocks.BLACK_LOTUS_FLOWER, new Item.Settings()));
    public static final Item CYAN_LOTUS_FLOWER = registerItem("cyan_lotus_flower",
            new PlaceableOnWaterItem(FBBlocks.CYAN_LOTUS_FLOWER, new Item.Settings()));

    public static final Item FLORAL_SMITHING_TEMPLATE = registerItem("floral_armor_trim_smithing_template",
            SmithingTemplateItem.of(Identifier.of(FlowerBreeding.MOD_ID, "floral"), FeatureFlags.VANILLA));

    public static void registerModItems() {
        FlowerBreeding.LOGGER.info("Registering items for " + FlowerBreeding.MOD_ID);
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(FlowerBreeding.MOD_ID, name), item);
    }
}
