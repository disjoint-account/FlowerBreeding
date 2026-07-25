package net.flowerbreeding;

import net.flowerbreeding.pigmentjars.*;
import net.flowerbreeding.pollenvials.EmptyPollenVialItem;
import net.flowerbreeding.pollenvials.FullPollenVialItem;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.component.Tool;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PlaceOnWaterBlockItem;
import net.minecraft.world.item.SmithingTemplateItem;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Rarity;

import java.util.List;
import java.util.function.Function;

public class FBItems {

    public static final Item EMPTY_PIGMENT_JAR = registerItem("empty_pigment_jar", settings -> new EmptyPigmentJarItem(settings.stacksTo(64)));
    public static final Item MAGENTA_PIGMENT_JAR = registerItem("magenta_pigment_jar", settings ->  new MagentaPigmentJarItem(settings.stacksTo(64)));
    public static final Item BLUE_PIGMENT_JAR = registerItem("blue_pigment_jar", settings ->  new BluePigmentJarItem(settings.stacksTo(64)));
    public static final Item WHITE_PIGMENT_JAR = registerItem("white_pigment_jar", settings ->  new WhitePigmentJarItem(settings.stacksTo(64)));
    public static final Item ORANGE_PIGMENT_JAR = registerItem("orange_pigment_jar", settings ->  new OrangePigmentJarItem(settings.stacksTo(64)));
    public static final Item RED_PIGMENT_JAR = registerItem("red_pigment_jar", settings ->  new RedPigmentJarItem(settings.stacksTo(64)));
    public static final Item YELLOW_PIGMENT_JAR = registerItem("yellow_pigment_jar", settings ->  new YellowPigmentJarItem(settings.stacksTo(64)));
    public static final Item LIGHT_BLUE_PIGMENT_JAR = registerItem("light_blue_pigment_jar", settings ->  new LightBluePigmentJarItem(settings.stacksTo(64)));
    public static final Item PINK_PIGMENT_JAR = registerItem("pink_pigment_jar", settings ->  new PinkPigmentJarItem(settings.stacksTo(64)));
    public static final Item BLACK_PIGMENT_JAR = registerItem("black_pigment_jar", settings ->  new BlackPigmentJarItem(settings.stacksTo(64)));
    public static final Item CYAN_PIGMENT_JAR = registerItem("cyan_pigment_jar", settings ->  new CyanPigmentJarItem(settings.stacksTo(64)));

    public static final Item EMPTY_POLLEN_VIAL = registerItem("empty_pollen_vial", settings ->  new EmptyPollenVialItem(settings.stacksTo(64)));
    public static final Item ALLIUM_POLLEN_VIAL = registerItem("allium_pollen_vial", settings -> new FullPollenVialItem(settings.stacksTo(64)));
    public static final Item CORNFLOWER_POLLEN_VIAL = registerItem("cornflower_pollen_vial", settings -> new FullPollenVialItem(settings.stacksTo(64)));
    public static final Item DAISY_POLLEN_VIAL = registerItem("daisy_pollen_vial", settings -> new FullPollenVialItem(settings.stacksTo(64)));
    public static final Item TORCHFLOWER_POLLEN_VIAL = registerItem("torchflower_pollen_vial", settings -> new FullPollenVialItem(settings.stacksTo(64)));
    public static final Item TULIP_POLLEN_VIAL = registerItem("tulip_pollen_vial", settings -> new FullPollenVialItem(settings.stacksTo(64)));
    public static final Item AZURE_BLUET_POLLEN_VIAL = registerItem("azure_bluet_pollen_vial", settings -> new FullPollenVialItem(settings.stacksTo(64)));
    public static final Item DANDELION_POLLEN_VIAL = registerItem("dandelion_pollen_vial", settings -> new FullPollenVialItem(settings.stacksTo(64)));
    public static final Item ORCHID_POLLEN_VIAL = registerItem("orchid_pollen_vial", settings -> new FullPollenVialItem(settings.stacksTo(64)));
    public static final Item LILY_POLLEN_VIAL = registerItem("lily_pollen_vial", settings -> new FullPollenVialItem(settings.stacksTo(64)));
    public static final Item POPPY_POLLEN_VIAL = registerItem("poppy_pollen_vial", settings -> new FullPollenVialItem(settings.stacksTo(64)));
    public static final Item WITHER_ROSE_POLLEN_VIAL = registerItem("wither_rose_pollen_vial", settings -> new FullPollenVialItem(settings.stacksTo(64)));
    public static final Item EYEBLOSSOM_POLLEN_VIAL = registerItem("eyeblossom_pollen_vial", settings -> new FullPollenVialItem(settings.stacksTo(64)));
    public static final Item LILAC_POLLEN_VIAL = registerItem("lilac_pollen_vial", settings -> new FullPollenVialItem(settings.stacksTo(64)));
    public static final Item PEONY_POLLEN_VIAL = registerItem("peony_pollen_vial", settings -> new FullPollenVialItem(settings.stacksTo(64)));
    public static final Item PITCHER_PLANT_POLLEN_VIAL = registerItem("pitcher_plant_pollen_vial", settings -> new FullPollenVialItem(settings.stacksTo(64)));
    public static final Item ROSE_BUSH_POLLEN_VIAL = registerItem("rose_bush_pollen_vial", settings -> new FullPollenVialItem(settings.stacksTo(64)));
    public static final Item SUNFLOWER_POLLEN_VIAL = registerItem("sunflower_pollen_vial", settings -> new FullPollenVialItem(settings.stacksTo(64)));
    public static final Item PETAL_POLLEN_VIAL = registerItem("petal_pollen_vial", settings -> new FullPollenVialItem(settings.stacksTo(64)));
    public static final Item WILDFLOWER_POLLEN_VIAL = registerItem("wildflower_pollen_vial", settings -> new FullPollenVialItem(settings.stacksTo(64)));
    public static final Item CACTUS_FLOWER_POLLEN_VIAL = registerItem("cactus_flower_pollen_vial", settings -> new FullPollenVialItem(settings.stacksTo(64)));
    public static final Item SPORE_BLOSSOM_POLLEN_VIAL = registerItem("spore_blossom_pollen_vial", settings -> new FullPollenVialItem(settings.stacksTo(64)));
    public static final Item FLOWERING_AZALEA_POLLEN_VIAL = registerItem("flowering_azalea_pollen_vial", settings -> new FullPollenVialItem(settings.stacksTo(64)));
    public static final Item FLOWERING_AZALEA_LEAVES_POLLEN_VIAL = registerItem("flowering_azalea_leaves_pollen_vial", settings -> new FullPollenVialItem(settings.stacksTo(64)));
    public static final Item BUSH_POLLEN_VIAL = registerItem("bush_pollen_vial", settings -> new FullPollenVialItem(settings.stacksTo(64)));
    public static final Item SWEET_BERRY_POLLEN_VIAL = registerItem("sweet_berry_pollen_vial", settings -> new FullPollenVialItem(settings.stacksTo(64)));
    public static final Item GLOW_VINE_POLLEN_VIAL = registerItem("glow_vine_pollen_vial", settings -> new FullPollenVialItem(settings.stacksTo(64)));
    public static final Item VINE_POLLEN_VIAL = registerItem("vine_pollen_vial", settings -> new FullPollenVialItem(settings.stacksTo(64)));
    public static final Item LILY_PAD_POLLEN_VIAL = registerItem("lily_pad_pollen_vial", settings -> new FullPollenVialItem(settings.stacksTo(64)));
    public static final Item FROGLIGHT_POLLEN_VIAL = registerItem("froglight_pollen_vial", settings -> new FullPollenVialItem(settings.stacksTo(64)));
    public static final Item MUSHROOM_POLLEN_VIAL = registerItem("mushroom_pollen_vial", settings -> new FullPollenVialItem(settings.stacksTo(64)));

    public static final Item MAGENTA_LOTUS_FLOWER = registerItem("magenta_lotus_flower", settings -> new PlaceOnWaterBlockItem(FBBlocks.MAGENTA_LOTUS_FLOWER, settings));
    public static final Item BLUE_LOTUS_FLOWER = registerItem("blue_lotus_flower", settings -> new PlaceOnWaterBlockItem(FBBlocks.BLUE_LOTUS_FLOWER, settings));
    public static final Item WHITE_LOTUS_FLOWER = registerItem("white_lotus_flower", settings -> new PlaceOnWaterBlockItem(FBBlocks.WHITE_LOTUS_FLOWER, settings));
    public static final Item ORANGE_LOTUS_FLOWER = registerItem("orange_lotus_flower", settings -> new PlaceOnWaterBlockItem(FBBlocks.ORANGE_LOTUS_FLOWER, settings));
    public static final Item RED_LOTUS_FLOWER = registerItem("red_lotus_flower", settings -> new PlaceOnWaterBlockItem(FBBlocks.RED_LOTUS_FLOWER, settings));
    public static final Item YELLOW_LOTUS_FLOWER = registerItem("yellow_lotus_flower", settings -> new PlaceOnWaterBlockItem(FBBlocks.YELLOW_LOTUS_FLOWER, settings));
    public static final Item LIGHT_BLUE_LOTUS_FLOWER = registerItem("light_blue_lotus_flower", settings -> new PlaceOnWaterBlockItem(FBBlocks.LIGHT_BLUE_LOTUS_FLOWER, settings));
    public static final Item PINK_LOTUS_FLOWER = registerItem("pink_lotus_flower", settings -> new PlaceOnWaterBlockItem(FBBlocks.PINK_LOTUS_FLOWER, settings));
    public static final Item BLACK_LOTUS_FLOWER = registerItem("black_lotus_flower", settings -> new PlaceOnWaterBlockItem(FBBlocks.BLACK_LOTUS_FLOWER, settings));
    public static final Item CYAN_LOTUS_FLOWER = registerItem("cyan_lotus_flower", settings -> new PlaceOnWaterBlockItem(FBBlocks.CYAN_LOTUS_FLOWER, settings));

    public static final Item TROWEL = registerItem("trowel", settings -> new TrowelItem(settings.durability(238).component(DataComponents.TOOL,
            new Tool(
                    List.of(
                            Tool.Rule.deniesDrops(BuiltInRegistries.acquireBootstrapRegistrationLookup(BuiltInRegistries.BLOCK).getOrThrow(BlockTags.INCORRECT_FOR_IRON_TOOL)),
                            Tool.Rule.minesAndDrops(BuiltInRegistries.acquireBootstrapRegistrationLookup(BuiltInRegistries.BLOCK).getOrThrow(BlockTags.MINEABLE_WITH_SHOVEL), 2.0f)
                    ),
                    1.0F,
                    1,
                    true
            )
    )));

    public static final Item FLORAL_SMITHING_TEMPLATE = registerSmithingTemplate("floral_armor_trim_smithing_template", SmithingTemplateItem.createArmorTrimTemplate(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(FlowerBreeding.MOD_ID, "floral_armor_trim_smithing_template"))).rarity(Rarity.UNCOMMON)));

    public static void registerModItems() {
        FlowerBreeding.LOGGER.info("Registering items for " + FlowerBreeding.MOD_ID);
    }
    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(FlowerBreeding.MOD_ID, name), function.apply(new Item.Properties().setId(keyOfItem(name))));
    }
    private static ResourceKey<Item> keyOfItem(String name) {
        return ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(FlowerBreeding.MOD_ID, name));
    }
    private static Item registerSmithingTemplate(String name, Item item) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(FlowerBreeding.MOD_ID, name), item);
    }
    public static ResourceKey<Item> getResourceKey(Item item) {
        return BuiltInRegistries.ITEM.getResourceKey(item).get();
    }
}
