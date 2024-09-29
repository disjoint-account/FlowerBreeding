package net.flowerbreeding;

import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import static net.minecraft.block.Blocks.*;

public class FBBlocks {

    // tulips //test


    public static final Block MAGENTA_TULIP = registerBlock("magenta_tulip",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(RED_TULIP)));
    public static final Block POTTED_MAGENTA_TULIP = registerBlock("potted_magenta_tulip", false,
            new FlowerPotBlock(MAGENTA_TULIP, AbstractBlock.Settings.copy(Blocks.POTTED_RED_TULIP)));

    // wither rose


    public static final Block MAGENTA_WITHER_ROSE = registerBlock("magenta_wither_rose",
            new FlowerBlock(StatusEffects.WITHER, 8, AbstractBlock.Settings.copy(Blocks.WITHER_ROSE)));
    public static final Block POTTED_MAGENTA_WITHER_ROSE = registerBlock("potted_magenta_wither_rose", false,
            new FlowerPotBlock(MAGENTA_WITHER_ROSE, AbstractBlock.Settings.copy(Blocks.POTTED_WITHER_ROSE)));

    // sunflower


    public static final Block MAGENTA_SUNFLOWER = registerBlock("magenta_sunflower",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.SUNFLOWER)));

    // peony


    public static final Block MAGENTA_PEONY = registerBlock("magenta_peony",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.PEONY)));

    // lilac


    public static final Block MAGENTA_LILAC = registerBlock("magenta_lilac",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.LILAC)));

    // rose


    public static final Block MAGENTA_ROSE = registerBlock("magenta_rose",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.ROSE_BUSH)));

    // poppy


    public static final Block MAGENTA_POPPY = registerBlock("magenta_poppy",
            new FlowerBlock(StatusEffects.NIGHT_VISION, 5, AbstractBlock.Settings.copy(Blocks.POPPY)));
    public static final Block POTTED_MAGENTA_POPPY = registerBlock("potted_magenta_poppy", false,
            new FlowerPotBlock(MAGENTA_POPPY, AbstractBlock.Settings.copy(Blocks.POTTED_POPPY)));

    // orchid


    public static final Block MAGENTA_ORCHID = registerBlock("magenta_orchid",
            new FlowerBlock(StatusEffects.SATURATION, 0.35f, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_MAGENTA_ORCHID = registerBlock("potted_magenta_orchid", false,
            new FlowerPotBlock(MAGENTA_ORCHID, AbstractBlock.Settings.copy(Blocks.POTTED_BLUE_ORCHID)));

    // lily


    public static final Block MAGENTA_LILY = registerBlock("magenta_lily",
            new FlowerBlock(StatusEffects.POISON, 12, AbstractBlock.Settings.copy(LILY_OF_THE_VALLEY)));
    public static final Block POTTED_MAGENTA_LILY = registerBlock("potted_magenta_lily", false,
            new FlowerPotBlock(MAGENTA_LILY, AbstractBlock.Settings.copy(POTTED_LILY_OF_THE_VALLEY)));

    // dandelion


    public static final Block MAGENTA_DANDELION = registerBlock("magenta_dandelion",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(Blocks.DANDELION)));
    public static final Block POTTED_MAGENTA_DANDELION = registerBlock("potted_magenta_dandelion", false,
            new FlowerPotBlock(MAGENTA_DANDELION, AbstractBlock.Settings.copy(Blocks.POTTED_DANDELION)));

    // daisy


    public static final Block MAGENTA_DAISY = registerBlock("magenta_daisy",
            new FlowerBlock(StatusEffects.REGENERATION, 8, AbstractBlock.Settings.copy(OXEYE_DAISY)));
    public static final Block POTTED_MAGENTA_DAISY = registerBlock("potted_magenta_daisy", false,
            new FlowerPotBlock(MAGENTA_DAISY, AbstractBlock.Settings.copy(POTTED_OXEYE_DAISY)));

    // cornflower


    public static final Block MAGENTA_CORNFLOWER = registerBlock("magenta_cornflower",
            new FlowerBlock(StatusEffects.JUMP_BOOST, 6, AbstractBlock.Settings.copy(Blocks.CORNFLOWER)));
    public static final Block POTTED_MAGENTA_CORNFLOWER = registerBlock("potted_magenta_cornflower", false,
            new FlowerPotBlock(MAGENTA_CORNFLOWER, AbstractBlock.Settings.copy(Blocks.POTTED_CORNFLOWER)));

    // azure bluet


    public static final Block MAGENTA_AZURE_BLUET = registerBlock("magenta_azure_bluet",
            new FlowerBlock(StatusEffects.BLINDNESS, 8, AbstractBlock.Settings.copy(Blocks.AZURE_BLUET)));
    public static final Block POTTED_MAGENTA_AZURE_BLUET = registerBlock("potted_magenta_azure_bluet", false,
            new FlowerPotBlock(MAGENTA_AZURE_BLUET, AbstractBlock.Settings.copy(Blocks.POTTED_AZURE_BLUET)));

    // allium


    public static final Block MAGENTA_ALLIUM = registerBlock("magenta_allium",
            new FlowerBlock(StatusEffects.FIRE_RESISTANCE, 4, AbstractBlock.Settings.copy(Blocks.ALLIUM)));
    public static final Block POTTED_MAGENTA_ALLIUM = registerBlock("potted_magenta_allium", false,
            new FlowerPotBlock(MAGENTA_ALLIUM, AbstractBlock.Settings.copy(Blocks.POTTED_ALLIUM)));

    // torchflower


    public static final Block MAGENTA_TORCHFLOWER = registerBlock("magenta_torchflower",
            new FlowerBlock(StatusEffects.NIGHT_VISION, 5, AbstractBlock.Settings.copy(Blocks.TORCHFLOWER)));
    public static final Block POTTED_MAGENTA_TORCHFLOWER = registerBlock("potted_magenta_torchflower", false,
            new FlowerPotBlock(MAGENTA_TORCHFLOWER, AbstractBlock.Settings.copy(Blocks.POTTED_TORCHFLOWER)));

    // pitcher plant


    public static final Block MAGENTA_PITCHER_PLANT = registerBlock("magenta_pitcher_plant",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.PITCHER_PLANT)));


    // makin the thangz

    private static Block registerBlock(String name, Block block) {
        return registerBlock(name, true, block);
    }

    private static Block registerBlock(String name, boolean createItem, Block block) {
        if (createItem) {
            registerBlockItem(name, block);
        }
        return Registry.register(Registries.BLOCK, Identifier.of(FlowerBreeding.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(FlowerBreeding.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        FlowerBreeding.LOGGER.info("Registering blocks for " + FlowerBreeding.MOD_ID);
    }
}
