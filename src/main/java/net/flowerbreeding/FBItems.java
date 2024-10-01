package net.flowerbreeding;

import net.flowerbreeding.pigmentjars.*;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
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

    public static void registerModItems() {
        FlowerBreeding.LOGGER.info("Registering items for " + FlowerBreeding.MOD_ID);
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(FlowerBreeding.MOD_ID, name), item);
    }
}
