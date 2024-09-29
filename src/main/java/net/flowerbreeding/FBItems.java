package net.flowerbreeding;

import net.flowerbreeding.pollenjars.EmptyPollenJarItem;
import net.flowerbreeding.pollenjars.MagentaPollenJarItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class FBItems {

    public static final Item EMPTY_POLLEN_JAR = registerItem("empty_pollen_jar",
            new EmptyPollenJarItem(new Item.Settings().maxCount(1)));
    public static final Item RED_TULIP_POLLEN_JAR = registerItem("red_tulip_pollen_jar",
            new Item(new Item.Settings().maxCount(1)));
    public static final Item ALLIUM_POLLEN_JAR = registerItem("allium_pollen_jar",
            new MagentaPollenJarItem(new Item.Settings().maxCount(1)));
    public static final Item CORNFLOWER_POLLEN_JAR = registerItem("cornflower_pollen_jar",
            new Item(new Item.Settings().maxCount(1)));
    public static final Item TORCHFLOWER_POLLEN_JAR = registerItem("torchflower_pollen_jar",
            new Item(new Item.Settings().maxCount(1)));
    public static final Item OXEYE_DAISY_POLLEN_JAR = registerItem("oxeye_pollen_jar",
            new Item(new Item.Settings().maxCount(1)));
    public static final Item AZURE_BLUET_POLLEN_JAR = registerItem("azure_bluet_pollen_jar",
            new Item(new Item.Settings().maxCount(1)));
    public static final Item DANDELION_POLLEN_JAR = registerItem("dandelion_pollen_jar",
            new Item(new Item.Settings().maxCount(1)));
    public static final Item ORANGE_TULIP_POLLEN_JAR = registerItem("orange_tulip_pollen_jar",
            new Item(new Item.Settings().maxCount(1)));
    public static final Item WHITE_TULIP_POLLEN_JAR = registerItem("white_tulip_pollen_jar",
            new Item(new Item.Settings().maxCount(1)));
    public static final Item BLUE_ORCHID_POLLEN_JAR = registerItem("blue_orchid_pollen_jar",
            new Item(new Item.Settings().maxCount(1)));
    public static final Item LILY_OF_THE_VALLEY_POLLEN_JAR = registerItem("lily_of_the_valley_pollen_jar",
            new Item(new Item.Settings().maxCount(1)));
    public static final Item POPPY_POLLEN_JAR = registerItem("poppy_pollen_jar",
            new Item(new Item.Settings().maxCount(1)));
    public static final Item PINK_TULIP_POLLEN_JAR = registerItem("pink_tulip_pollen_jar",
            new Item(new Item.Settings().maxCount(1)));
    public static final Item WITHER_ROSE_POLLEN_JAR = registerItem("wither_rose_pollen_jar",
            new Item(new Item.Settings().maxCount(1)));
    public static final Item LILAC_POLLEN_JAR = registerItem("lilac_pollen_jar",
            new Item(new Item.Settings().maxCount(1)));
    public static final Item PEONY_POLLEN_JAR = registerItem("peony_pollen_jar",
            new Item(new Item.Settings().maxCount(1)));
    public static final Item PITCHER_PLANT_POLLEN_JAR = registerItem("pitcher_plant_pollen_jar",
            new Item(new Item.Settings().maxCount(1)));
    public static final Item ROSE_BUSH_POLLEN_JAR = registerItem("rose_bush_pollen_jar",
            new Item(new Item.Settings().maxCount(1)));
    public static final Item SUNFLOWER_POLLEN_JAR = registerItem("sunflower_pollen_jar",
            new Item(new Item.Settings().maxCount(1)));

    public static void registerModItems() {
        FlowerBreeding.LOGGER.info("Registering items for " + FlowerBreeding.MOD_ID);
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(FlowerBreeding.MOD_ID, name), item);
    }
}
