package net.flowerbreeding;

import net.flowerbreeding.botanytable.BotanyTableBlock;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static net.minecraft.block.Blocks.*;

public class FBBlocks {

    public static final Block BOTANY_TABLE = registerBlock("botany_table",
            new BotanyTableBlock(AbstractBlock.Settings.copy(CRAFTING_TABLE)));

    // magenta flowers

    public static final Block MAGENTA_TULIP = registerBlock("magenta_tulip",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(RED_TULIP)));
    public static final Block POTTED_MAGENTA_TULIP = registerBlock("potted_magenta_tulip", false,
            new FlowerPotBlock(MAGENTA_TULIP, AbstractBlock.Settings.copy(Blocks.POTTED_RED_TULIP)));
    public static final Block MAGENTA_WITHER_ROSE = registerBlock("magenta_wither_rose",
            new WitherRoseBlock(StatusEffects.WITHER, 8, AbstractBlock.Settings.copy(Blocks.WITHER_ROSE)));
    public static final Block POTTED_MAGENTA_WITHER_ROSE = registerBlock("potted_magenta_wither_rose", false,
            new FlowerPotBlock(MAGENTA_WITHER_ROSE, AbstractBlock.Settings.copy(Blocks.POTTED_WITHER_ROSE)));
    public static final Block MAGENTA_SUNFLOWER = registerBlock("magenta_sunflower",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.SUNFLOWER)));
    public static final Block MAGENTA_PEONY = registerBlock("magenta_peony",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.PEONY)));
    public static final Block MAGENTA_ROSE_BUSH = registerBlock("magenta_rose_bush",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.ROSE_BUSH)));
    public static final Block MAGENTA_POPPY = registerBlock("magenta_poppy",
            new FlowerBlock(StatusEffects.NIGHT_VISION, 5, AbstractBlock.Settings.copy(Blocks.POPPY)));
    public static final Block POTTED_MAGENTA_POPPY = registerBlock("potted_magenta_poppy", false,
            new FlowerPotBlock(MAGENTA_POPPY, AbstractBlock.Settings.copy(Blocks.POTTED_POPPY)));
    public static final Block MAGENTA_ORCHID = registerBlock("magenta_orchid",
            new FlowerBlock(StatusEffects.SATURATION, 0.35f, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_MAGENTA_ORCHID = registerBlock("potted_magenta_orchid", false,
            new FlowerPotBlock(MAGENTA_ORCHID, AbstractBlock.Settings.copy(Blocks.POTTED_BLUE_ORCHID)));
    public static final Block MAGENTA_LILY = registerBlock("magenta_lily",
            new FlowerBlock(StatusEffects.POISON, 12, AbstractBlock.Settings.copy(LILY_OF_THE_VALLEY)));
    public static final Block POTTED_MAGENTA_LILY = registerBlock("potted_magenta_lily", false,
            new FlowerPotBlock(MAGENTA_LILY, AbstractBlock.Settings.copy(POTTED_LILY_OF_THE_VALLEY)));
    public static final Block MAGENTA_DANDELION = registerBlock("magenta_dandelion",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(Blocks.DANDELION)));
    public static final Block POTTED_MAGENTA_DANDELION = registerBlock("potted_magenta_dandelion", false,
            new FlowerPotBlock(MAGENTA_DANDELION, AbstractBlock.Settings.copy(Blocks.POTTED_DANDELION)));
    public static final Block MAGENTA_DAISY = registerBlock("magenta_daisy",
            new FlowerBlock(StatusEffects.REGENERATION, 8, AbstractBlock.Settings.copy(OXEYE_DAISY)));
    public static final Block POTTED_MAGENTA_DAISY = registerBlock("potted_magenta_daisy", false,
            new FlowerPotBlock(MAGENTA_DAISY, AbstractBlock.Settings.copy(POTTED_OXEYE_DAISY)));
    public static final Block MAGENTA_CORNFLOWER = registerBlock("magenta_cornflower",
            new FlowerBlock(StatusEffects.JUMP_BOOST, 6, AbstractBlock.Settings.copy(Blocks.CORNFLOWER)));
    public static final Block POTTED_MAGENTA_CORNFLOWER = registerBlock("potted_magenta_cornflower", false,
            new FlowerPotBlock(MAGENTA_CORNFLOWER, AbstractBlock.Settings.copy(Blocks.POTTED_CORNFLOWER)));
    public static final Block MAGENTA_AZURE_BLUET = registerBlock("magenta_azure_bluet",
            new FlowerBlock(StatusEffects.BLINDNESS, 8, AbstractBlock.Settings.copy(Blocks.AZURE_BLUET)));
    public static final Block POTTED_MAGENTA_AZURE_BLUET = registerBlock("potted_magenta_azure_bluet", false,
            new FlowerPotBlock(MAGENTA_AZURE_BLUET, AbstractBlock.Settings.copy(Blocks.POTTED_AZURE_BLUET)));
    public static final Block MAGENTA_TORCHFLOWER = registerBlock("magenta_torchflower",
            new FlowerBlock(StatusEffects.NIGHT_VISION, 5, AbstractBlock.Settings.copy(Blocks.TORCHFLOWER)));
    public static final Block POTTED_MAGENTA_TORCHFLOWER = registerBlock("potted_magenta_torchflower", false,
            new FlowerPotBlock(MAGENTA_TORCHFLOWER, AbstractBlock.Settings.copy(Blocks.POTTED_TORCHFLOWER)));
    public static final Block MAGENTA_PITCHER_PLANT = registerBlock("magenta_pitcher_plant",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.PITCHER_PLANT)));

    // blue flowers

    public static final Block BLUE_ALLIUM = registerBlock("blue_allium",
            new FlowerBlock(StatusEffects.FIRE_RESISTANCE, 4, AbstractBlock.Settings.copy(ALLIUM)));
    public static final Block POTTED_BLUE_ALLIUM = registerBlock("potted_blue_allium", false,
            new FlowerPotBlock(BLUE_ALLIUM, AbstractBlock.Settings.copy(Blocks.POTTED_ALLIUM)));
    public static final Block BLUE_TULIP = registerBlock("blue_tulip",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(RED_TULIP)));
    public static final Block POTTED_BLUE_TULIP = registerBlock("potted_blue_tulip", false,
            new FlowerPotBlock(BLUE_TULIP, AbstractBlock.Settings.copy(Blocks.POTTED_RED_TULIP)));
    public static final Block BLUE_WITHER_ROSE = registerBlock("blue_wither_rose",
            new WitherRoseBlock(StatusEffects.WITHER, 8, AbstractBlock.Settings.copy(Blocks.WITHER_ROSE)));
    public static final Block POTTED_BLUE_WITHER_ROSE = registerBlock("potted_blue_wither_rose", false,
            new FlowerPotBlock(BLUE_WITHER_ROSE, AbstractBlock.Settings.copy(Blocks.POTTED_WITHER_ROSE)));
    public static final Block BLUE_SUNFLOWER = registerBlock("blue_sunflower",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.SUNFLOWER)));
    public static final Block BLUE_PEONY = registerBlock("blue_peony",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.PEONY)));
    public static final Block BLUE_LILAC = registerBlock("blue_lilac",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.LILAC)));
    public static final Block BLUE_ROSE_BUSH = registerBlock("blue_rose_bush",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.ROSE_BUSH)));
    public static final Block BLUE_POPPY = registerBlock("blue_poppy",
            new FlowerBlock(StatusEffects.NIGHT_VISION, 5, AbstractBlock.Settings.copy(Blocks.POPPY)));
    public static final Block POTTED_BLUE_POPPY = registerBlock("potted_blue_poppy", false,
            new FlowerPotBlock(BLUE_POPPY, AbstractBlock.Settings.copy(Blocks.POTTED_POPPY)));
    public static final Block BLUE_ORCHID = registerBlock("blue_orchid",
            new FlowerBlock(StatusEffects.SATURATION, 0.35f, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_BLUE_ORCHID = registerBlock("potted_blue_orchid", false,
            new FlowerPotBlock(BLUE_ORCHID, AbstractBlock.Settings.copy(Blocks.POTTED_BLUE_ORCHID)));
    public static final Block BLUE_LILY = registerBlock("blue_lily",
            new FlowerBlock(StatusEffects.POISON, 12, AbstractBlock.Settings.copy(LILY_OF_THE_VALLEY)));
    public static final Block POTTED_BLUE_LILY = registerBlock("potted_blue_lily", false,
            new FlowerPotBlock(BLUE_LILY, AbstractBlock.Settings.copy(POTTED_LILY_OF_THE_VALLEY)));
    public static final Block BLUE_DANDELION = registerBlock("blue_dandelion",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(Blocks.DANDELION)));
    public static final Block POTTED_BLUE_DANDELION = registerBlock("potted_blue_dandelion", false,
            new FlowerPotBlock(BLUE_DANDELION, AbstractBlock.Settings.copy(Blocks.POTTED_DANDELION)));
    public static final Block BLUE_DAISY = registerBlock("blue_daisy",
            new FlowerBlock(StatusEffects.REGENERATION, 8, AbstractBlock.Settings.copy(OXEYE_DAISY)));
    public static final Block POTTED_BLUE_DAISY = registerBlock("potted_blue_daisy", false,
            new FlowerPotBlock(BLUE_DAISY, AbstractBlock.Settings.copy(POTTED_OXEYE_DAISY)));
    public static final Block BLUE_AZURE_BLUET = registerBlock("blue_azure_bluet",
            new FlowerBlock(StatusEffects.BLINDNESS, 8, AbstractBlock.Settings.copy(Blocks.AZURE_BLUET)));
    public static final Block POTTED_BLUE_AZURE_BLUET = registerBlock("potted_blue_azure_bluet", false,
            new FlowerPotBlock(BLUE_AZURE_BLUET, AbstractBlock.Settings.copy(Blocks.POTTED_AZURE_BLUET)));
    public static final Block BLUE_TORCHFLOWER = registerBlock("blue_torchflower",
            new FlowerBlock(StatusEffects.NIGHT_VISION, 5, AbstractBlock.Settings.copy(Blocks.TORCHFLOWER)));
    public static final Block POTTED_BLUE_TORCHFLOWER = registerBlock("potted_blue_torchflower", false,
            new FlowerPotBlock(BLUE_TORCHFLOWER, AbstractBlock.Settings.copy(Blocks.POTTED_TORCHFLOWER)));
    public static final Block BLUE_PITCHER_PLANT = registerBlock("blue_pitcher_plant",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.PITCHER_PLANT)));

    // white flowers

    public static final Block WHITE_ALLIUM = registerBlock("white_allium",
            new FlowerBlock(StatusEffects.FIRE_RESISTANCE, 4, AbstractBlock.Settings.copy(ALLIUM)));
    public static final Block POTTED_WHITE_ALLIUM = registerBlock("potted_white_allium", false,
            new FlowerPotBlock(WHITE_ALLIUM, AbstractBlock.Settings.copy(Blocks.POTTED_ALLIUM)));
    public static final Block WHITE_WITHER_ROSE = registerBlock("white_wither_rose",
            new WitherRoseBlock(StatusEffects.WITHER, 8, AbstractBlock.Settings.copy(Blocks.WITHER_ROSE)));
    public static final Block POTTED_WHITE_WITHER_ROSE = registerBlock("potted_white_wither_rose", false,
            new FlowerPotBlock(WHITE_WITHER_ROSE, AbstractBlock.Settings.copy(Blocks.POTTED_WITHER_ROSE)));
    public static final Block WHITE_SUNFLOWER = registerBlock("white_sunflower",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.SUNFLOWER)));
    public static final Block WHITE_PEONY = registerBlock("white_peony",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.PEONY)));
    public static final Block WHITE_LILAC = registerBlock("white_lilac",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.LILAC)));
    public static final Block WHITE_ROSE_BUSH = registerBlock("white_rose_bush",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.ROSE_BUSH)));
    public static final Block WHITE_POPPY = registerBlock("white_poppy",
            new FlowerBlock(StatusEffects.NIGHT_VISION, 5, AbstractBlock.Settings.copy(Blocks.POPPY)));
    public static final Block POTTED_WHITE_POPPY = registerBlock("potted_white_poppy", false,
            new FlowerPotBlock(WHITE_POPPY, AbstractBlock.Settings.copy(Blocks.POTTED_POPPY)));
    public static final Block WHITE_ORCHID = registerBlock("white_orchid",
            new FlowerBlock(StatusEffects.SATURATION, 0.35f, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_WHITE_ORCHID = registerBlock("potted_white_orchid", false,
            new FlowerPotBlock(WHITE_ORCHID, AbstractBlock.Settings.copy(Blocks.POTTED_BLUE_ORCHID)));
    public static final Block WHITE_DANDELION = registerBlock("white_dandelion",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(Blocks.DANDELION)));
    public static final Block POTTED_WHITE_DANDELION = registerBlock("potted_white_dandelion", false,
            new FlowerPotBlock(WHITE_DANDELION, AbstractBlock.Settings.copy(Blocks.POTTED_DANDELION)));
    public static final Block WHITE_CORNFLOWER = registerBlock("white_cornflower",
            new FlowerBlock(StatusEffects.JUMP_BOOST, 6, AbstractBlock.Settings.copy(Blocks.CORNFLOWER)));
    public static final Block POTTED_WHITE_CORNFLOWER = registerBlock("potted_white_cornflower", false,
            new FlowerPotBlock(WHITE_CORNFLOWER, AbstractBlock.Settings.copy(Blocks.POTTED_CORNFLOWER)));
    public static final Block WHITE_TORCHFLOWER = registerBlock("white_torchflower",
            new FlowerBlock(StatusEffects.NIGHT_VISION, 5, AbstractBlock.Settings.copy(Blocks.TORCHFLOWER)));
    public static final Block POTTED_WHITE_TORCHFLOWER = registerBlock("potted_white_torchflower", false,
            new FlowerPotBlock(WHITE_TORCHFLOWER, AbstractBlock.Settings.copy(Blocks.POTTED_TORCHFLOWER)));
    public static final Block WHITE_PITCHER_PLANT = registerBlock("white_pitcher_plant",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.PITCHER_PLANT)));

    // orange flowers

    public static final Block ORANGE_ALLIUM = registerBlock("orange_allium",
            new FlowerBlock(StatusEffects.FIRE_RESISTANCE, 4, AbstractBlock.Settings.copy(ALLIUM)));
    public static final Block POTTED_ORANGE_ALLIUM = registerBlock("potted_orange_allium", false,
            new FlowerPotBlock(ORANGE_ALLIUM, AbstractBlock.Settings.copy(Blocks.POTTED_ALLIUM)));
    public static final Block ORANGE_WITHER_ROSE = registerBlock("orange_wither_rose",
            new WitherRoseBlock(StatusEffects.WITHER, 8, AbstractBlock.Settings.copy(Blocks.WITHER_ROSE)));
    public static final Block POTTED_ORANGE_WITHER_ROSE = registerBlock("potted_orange_wither_rose", false,
            new FlowerPotBlock(ORANGE_WITHER_ROSE, AbstractBlock.Settings.copy(Blocks.POTTED_WITHER_ROSE)));
    public static final Block ORANGE_SUNFLOWER = registerBlock("orange_sunflower",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.SUNFLOWER)));
    public static final Block ORANGE_PEONY = registerBlock("orange_peony",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.PEONY)));
    public static final Block ORANGE_LILAC = registerBlock("orange_lilac",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.LILAC)));
    public static final Block ORANGE_ROSE_BUSH = registerBlock("orange_rose_bush",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.ROSE_BUSH)));
    public static final Block ORANGE_POPPY = registerBlock("orange_poppy",
            new FlowerBlock(StatusEffects.NIGHT_VISION, 5, AbstractBlock.Settings.copy(Blocks.POPPY)));
    public static final Block POTTED_ORANGE_POPPY = registerBlock("potted_orange_poppy", false,
            new FlowerPotBlock(ORANGE_POPPY, AbstractBlock.Settings.copy(Blocks.POTTED_POPPY)));
    public static final Block ORANGE_ORCHID = registerBlock("orange_orchid",
            new FlowerBlock(StatusEffects.SATURATION, 0.35f, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_ORANGE_ORCHID = registerBlock("potted_orange_orchid", false,
            new FlowerPotBlock(ORANGE_ORCHID, AbstractBlock.Settings.copy(Blocks.POTTED_BLUE_ORCHID)));
    public static final Block ORANGE_LILY = registerBlock("orange_lily",
            new FlowerBlock(StatusEffects.POISON, 12, AbstractBlock.Settings.copy(LILY_OF_THE_VALLEY)));
    public static final Block POTTED_ORANGE_LILY = registerBlock("potted_orange_lily", false,
            new FlowerPotBlock(ORANGE_LILY, AbstractBlock.Settings.copy(POTTED_LILY_OF_THE_VALLEY)));
    public static final Block ORANGE_DANDELION = registerBlock("orange_dandelion",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(Blocks.DANDELION)));
    public static final Block POTTED_ORANGE_DANDELION = registerBlock("potted_orange_dandelion", false,
            new FlowerPotBlock(ORANGE_DANDELION, AbstractBlock.Settings.copy(Blocks.POTTED_DANDELION)));
    public static final Block ORANGE_DAISY = registerBlock("orange_daisy",
            new FlowerBlock(StatusEffects.REGENERATION, 8, AbstractBlock.Settings.copy(OXEYE_DAISY)));
    public static final Block POTTED_ORANGE_DAISY = registerBlock("potted_orange_daisy", false,
            new FlowerPotBlock(ORANGE_DAISY, AbstractBlock.Settings.copy(POTTED_OXEYE_DAISY)));
    public static final Block ORANGE_CORNFLOWER = registerBlock("orange_cornflower",
            new FlowerBlock(StatusEffects.JUMP_BOOST, 6, AbstractBlock.Settings.copy(Blocks.CORNFLOWER)));
    public static final Block POTTED_ORANGE_CORNFLOWER = registerBlock("potted_orange_cornflower", false,
            new FlowerPotBlock(ORANGE_CORNFLOWER, AbstractBlock.Settings.copy(Blocks.POTTED_CORNFLOWER)));
    public static final Block ORANGE_AZURE_BLUET = registerBlock("orange_azure_bluet",
            new FlowerBlock(StatusEffects.BLINDNESS, 8, AbstractBlock.Settings.copy(Blocks.AZURE_BLUET)));
    public static final Block POTTED_ORANGE_AZURE_BLUET = registerBlock("potted_orange_azure_bluet", false,
            new FlowerPotBlock(ORANGE_AZURE_BLUET, AbstractBlock.Settings.copy(Blocks.POTTED_AZURE_BLUET)));
    public static final Block ORANGE_PITCHER_PLANT = registerBlock("orange_pitcher_plant",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.PITCHER_PLANT)));

    // red flowers

    public static final Block RED_ALLIUM = registerBlock("red_allium",
            new FlowerBlock(StatusEffects.FIRE_RESISTANCE, 4, AbstractBlock.Settings.copy(ALLIUM)));
    public static final Block POTTED_RED_ALLIUM = registerBlock("potted_red_allium", false,
            new FlowerPotBlock(RED_ALLIUM, AbstractBlock.Settings.copy(Blocks.POTTED_ALLIUM)));
    public static final Block RED_WITHER_ROSE = registerBlock("red_wither_rose",
            new WitherRoseBlock(StatusEffects.WITHER, 8, AbstractBlock.Settings.copy(Blocks.WITHER_ROSE)));
    public static final Block POTTED_RED_WITHER_ROSE = registerBlock("potted_red_wither_rose", false,
            new FlowerPotBlock(RED_WITHER_ROSE, AbstractBlock.Settings.copy(Blocks.POTTED_WITHER_ROSE)));
    public static final Block RED_SUNFLOWER = registerBlock("red_sunflower",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.SUNFLOWER)));
    public static final Block RED_PEONY = registerBlock("red_peony",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.PEONY)));
    public static final Block RED_LILAC = registerBlock("red_lilac",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.LILAC)));
    public static final Block RED_ORCHID = registerBlock("red_orchid",
            new FlowerBlock(StatusEffects.SATURATION, 0.35f, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_RED_ORCHID = registerBlock("potted_red_orchid", false,
            new FlowerPotBlock(RED_ORCHID, AbstractBlock.Settings.copy(Blocks.POTTED_BLUE_ORCHID)));
    public static final Block RED_LILY = registerBlock("red_lily",
            new FlowerBlock(StatusEffects.POISON, 12, AbstractBlock.Settings.copy(LILY_OF_THE_VALLEY)));
    public static final Block POTTED_RED_LILY = registerBlock("potted_red_lily", false,
            new FlowerPotBlock(RED_LILY, AbstractBlock.Settings.copy(POTTED_LILY_OF_THE_VALLEY)));
    public static final Block RED_DANDELION = registerBlock("red_dandelion",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(Blocks.DANDELION)));
    public static final Block POTTED_RED_DANDELION = registerBlock("potted_red_dandelion", false,
            new FlowerPotBlock(RED_DANDELION, AbstractBlock.Settings.copy(Blocks.POTTED_DANDELION)));
    public static final Block RED_DAISY = registerBlock("red_daisy",
            new FlowerBlock(StatusEffects.REGENERATION, 8, AbstractBlock.Settings.copy(OXEYE_DAISY)));
    public static final Block POTTED_RED_DAISY = registerBlock("potted_red_daisy", false,
            new FlowerPotBlock(RED_DAISY, AbstractBlock.Settings.copy(POTTED_OXEYE_DAISY)));
    public static final Block RED_CORNFLOWER = registerBlock("red_cornflower",
            new FlowerBlock(StatusEffects.JUMP_BOOST, 6, AbstractBlock.Settings.copy(Blocks.CORNFLOWER)));
    public static final Block POTTED_RED_CORNFLOWER = registerBlock("potted_red_cornflower", false,
            new FlowerPotBlock(RED_CORNFLOWER, AbstractBlock.Settings.copy(Blocks.POTTED_CORNFLOWER)));
    public static final Block RED_AZURE_BLUET = registerBlock("red_azure_bluet",
            new FlowerBlock(StatusEffects.BLINDNESS, 8, AbstractBlock.Settings.copy(Blocks.AZURE_BLUET)));
    public static final Block POTTED_RED_AZURE_BLUET = registerBlock("potted_red_azure_bluet", false,
            new FlowerPotBlock(RED_AZURE_BLUET, AbstractBlock.Settings.copy(Blocks.POTTED_AZURE_BLUET)));
    public static final Block RED_TORCHFLOWER = registerBlock("red_torchflower",
            new FlowerBlock(StatusEffects.NIGHT_VISION, 5, AbstractBlock.Settings.copy(Blocks.TORCHFLOWER)));
    public static final Block POTTED_RED_TORCHFLOWER = registerBlock("potted_red_torchflower", false,
            new FlowerPotBlock(RED_TORCHFLOWER, AbstractBlock.Settings.copy(Blocks.POTTED_TORCHFLOWER)));
    public static final Block RED_PITCHER_PLANT = registerBlock("red_pitcher_plant",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.PITCHER_PLANT)));

    // yellow flowers

    public static final Block YELLOW_ALLIUM = registerBlock("yellow_allium",
            new FlowerBlock(StatusEffects.FIRE_RESISTANCE, 4, AbstractBlock.Settings.copy(ALLIUM)));
    public static final Block POTTED_YELLOW_ALLIUM = registerBlock("potted_yellow_allium", false,
            new FlowerPotBlock(YELLOW_ALLIUM, AbstractBlock.Settings.copy(Blocks.POTTED_ALLIUM)));
    public static final Block YELLOW_TULIP = registerBlock("yellow_tulip",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(RED_TULIP)));
    public static final Block POTTED_YELLOW_TULIP = registerBlock("potted_yellow_tulip", false,
            new FlowerPotBlock(YELLOW_TULIP, AbstractBlock.Settings.copy(Blocks.POTTED_RED_TULIP)));
    public static final Block YELLOW_WITHER_ROSE = registerBlock("yellow_wither_rose",
            new WitherRoseBlock(StatusEffects.WITHER, 8, AbstractBlock.Settings.copy(Blocks.WITHER_ROSE)));
    public static final Block POTTED_YELLOW_WITHER_ROSE = registerBlock("potted_yellow_wither_rose", false,
            new FlowerPotBlock(YELLOW_WITHER_ROSE, AbstractBlock.Settings.copy(Blocks.POTTED_WITHER_ROSE)));
    public static final Block YELLOW_PEONY = registerBlock("yellow_peony",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.PEONY)));
    public static final Block YELLOW_LILAC = registerBlock("yellow_lilac",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.LILAC)));
    public static final Block YELLOW_ROSE_BUSH = registerBlock("yellow_rose_bush",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.ROSE_BUSH)));
    public static final Block YELLOW_POPPY = registerBlock("yellow_poppy",
            new FlowerBlock(StatusEffects.NIGHT_VISION, 5, AbstractBlock.Settings.copy(Blocks.POPPY)));
    public static final Block POTTED_YELLOW_POPPY = registerBlock("potted_yellow_poppy", false,
            new FlowerPotBlock(YELLOW_POPPY, AbstractBlock.Settings.copy(Blocks.POTTED_POPPY)));
    public static final Block YELLOW_ORCHID = registerBlock("yellow_orchid",
            new FlowerBlock(StatusEffects.SATURATION, 0.35f, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_YELLOW_ORCHID = registerBlock("potted_yellow_orchid", false,
            new FlowerPotBlock(YELLOW_ORCHID, AbstractBlock.Settings.copy(Blocks.POTTED_BLUE_ORCHID)));
    public static final Block YELLOW_LILY = registerBlock("yellow_lily",
            new FlowerBlock(StatusEffects.POISON, 12, AbstractBlock.Settings.copy(LILY_OF_THE_VALLEY)));
    public static final Block POTTED_YELLOW_LILY = registerBlock("potted_yellow_lily", false,
            new FlowerPotBlock(YELLOW_LILY, AbstractBlock.Settings.copy(POTTED_LILY_OF_THE_VALLEY)));
    public static final Block YELLOW_DAISY = registerBlock("yellow_daisy",
            new FlowerBlock(StatusEffects.REGENERATION, 8, AbstractBlock.Settings.copy(OXEYE_DAISY)));
    public static final Block POTTED_YELLOW_DAISY = registerBlock("potted_yellow_daisy", false,
            new FlowerPotBlock(YELLOW_DAISY, AbstractBlock.Settings.copy(POTTED_OXEYE_DAISY)));
    public static final Block YELLOW_CORNFLOWER = registerBlock("yellow_cornflower",
            new FlowerBlock(StatusEffects.JUMP_BOOST, 6, AbstractBlock.Settings.copy(Blocks.CORNFLOWER)));
    public static final Block POTTED_YELLOW_CORNFLOWER = registerBlock("potted_yellow_cornflower", false,
            new FlowerPotBlock(YELLOW_CORNFLOWER, AbstractBlock.Settings.copy(Blocks.POTTED_CORNFLOWER)));
    public static final Block YELLOW_AZURE_BLUET = registerBlock("yellow_azure_bluet",
            new FlowerBlock(StatusEffects.BLINDNESS, 8, AbstractBlock.Settings.copy(Blocks.AZURE_BLUET)));
    public static final Block POTTED_YELLOW_AZURE_BLUET = registerBlock("potted_yellow_azure_bluet", false,
            new FlowerPotBlock(YELLOW_AZURE_BLUET, AbstractBlock.Settings.copy(Blocks.POTTED_AZURE_BLUET)));
    public static final Block YELLOW_TORCHFLOWER = registerBlock("yellow_torchflower",
            new FlowerBlock(StatusEffects.NIGHT_VISION, 5, AbstractBlock.Settings.copy(Blocks.TORCHFLOWER)));
    public static final Block POTTED_YELLOW_TORCHFLOWER = registerBlock("potted_yellow_torchflower", false,
            new FlowerPotBlock(YELLOW_TORCHFLOWER, AbstractBlock.Settings.copy(Blocks.POTTED_TORCHFLOWER)));
    public static final Block YELLOW_PITCHER_PLANT = registerBlock("yellow_pitcher_plant",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.PITCHER_PLANT)));

    // light blue flowers

    public static final Block LIGHT_BLUE_ALLIUM = registerBlock("light_blue_allium",
            new FlowerBlock(StatusEffects.FIRE_RESISTANCE, 4, AbstractBlock.Settings.copy(ALLIUM)));
    public static final Block POTTED_LIGHT_BLUE_ALLIUM = registerBlock("potted_light_blue_allium", false,
            new FlowerPotBlock(LIGHT_BLUE_ALLIUM, AbstractBlock.Settings.copy(Blocks.POTTED_ALLIUM)));
    public static final Block LIGHT_BLUE_TULIP = registerBlock("light_blue_tulip",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(RED_TULIP)));
    public static final Block POTTED_LIGHT_BLUE_TULIP = registerBlock("potted_light_blue_tulip", false,
            new FlowerPotBlock(LIGHT_BLUE_TULIP, AbstractBlock.Settings.copy(Blocks.POTTED_RED_TULIP)));
    public static final Block LIGHT_BLUE_WITHER_ROSE = registerBlock("light_blue_wither_rose",
            new WitherRoseBlock(StatusEffects.WITHER, 8, AbstractBlock.Settings.copy(Blocks.WITHER_ROSE)));
    public static final Block POTTED_LIGHT_BLUE_WITHER_ROSE = registerBlock("potted_light_blue_wither_rose", false,
            new FlowerPotBlock(LIGHT_BLUE_WITHER_ROSE, AbstractBlock.Settings.copy(Blocks.POTTED_WITHER_ROSE)));
    public static final Block LIGHT_BLUE_SUNFLOWER = registerBlock("light_blue_sunflower",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.SUNFLOWER)));
    public static final Block LIGHT_BLUE_PEONY = registerBlock("light_blue_peony",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.PEONY)));
    public static final Block LIGHT_BLUE_LILAC = registerBlock("light_blue_lilac",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.LILAC)));
    public static final Block LIGHT_BLUE_ROSE_BUSH = registerBlock("light_blue_rose_bush",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.ROSE_BUSH)));
    public static final Block LIGHT_BLUE_POPPY = registerBlock("light_blue_poppy",
            new FlowerBlock(StatusEffects.NIGHT_VISION, 5, AbstractBlock.Settings.copy(Blocks.POPPY)));
    public static final Block POTTED_LIGHT_BLUE_POPPY = registerBlock("potted_light_blue_poppy", false,
            new FlowerPotBlock(LIGHT_BLUE_POPPY, AbstractBlock.Settings.copy(Blocks.POTTED_POPPY)));
    public static final Block LIGHT_BLUE_LILY = registerBlock("light_blue_lily",
            new FlowerBlock(StatusEffects.POISON, 12, AbstractBlock.Settings.copy(LILY_OF_THE_VALLEY)));
    public static final Block POTTED_LIGHT_BLUE_LILY = registerBlock("potted_light_blue_lily", false,
            new FlowerPotBlock(LIGHT_BLUE_LILY, AbstractBlock.Settings.copy(POTTED_LILY_OF_THE_VALLEY)));
    public static final Block LIGHT_BLUE_DANDELION = registerBlock("light_blue_dandelion",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(Blocks.DANDELION)));
    public static final Block POTTED_LIGHT_BLUE_DANDELION = registerBlock("potted_light_blue_dandelion", false,
            new FlowerPotBlock(LIGHT_BLUE_DANDELION, AbstractBlock.Settings.copy(Blocks.POTTED_DANDELION)));
    public static final Block LIGHT_BLUE_DAISY = registerBlock("light_blue_daisy",
            new FlowerBlock(StatusEffects.REGENERATION, 8, AbstractBlock.Settings.copy(OXEYE_DAISY)));
    public static final Block POTTED_LIGHT_BLUE_DAISY = registerBlock("potted_light_blue_daisy", false,
            new FlowerPotBlock(LIGHT_BLUE_DAISY, AbstractBlock.Settings.copy(POTTED_OXEYE_DAISY)));
    public static final Block LIGHT_BLUE_CORNFLOWER = registerBlock("light_blue_cornflower",
            new FlowerBlock(StatusEffects.JUMP_BOOST, 6, AbstractBlock.Settings.copy(Blocks.CORNFLOWER)));
    public static final Block POTTED_LIGHT_BLUE_CORNFLOWER = registerBlock("potted_light_blue_cornflower", false,
            new FlowerPotBlock(LIGHT_BLUE_CORNFLOWER, AbstractBlock.Settings.copy(Blocks.POTTED_CORNFLOWER)));
    public static final Block LIGHT_BLUE_AZURE_BLUET = registerBlock("light_blue_azure_bluet",
            new FlowerBlock(StatusEffects.BLINDNESS, 8, AbstractBlock.Settings.copy(Blocks.AZURE_BLUET)));
    public static final Block POTTED_LIGHT_BLUE_AZURE_BLUET = registerBlock("potted_light_blue_azure_bluet", false,
            new FlowerPotBlock(LIGHT_BLUE_AZURE_BLUET, AbstractBlock.Settings.copy(Blocks.POTTED_AZURE_BLUET)));
    public static final Block LIGHT_BLUE_TORCHFLOWER = registerBlock("light_blue_torchflower",
            new FlowerBlock(StatusEffects.NIGHT_VISION, 5, AbstractBlock.Settings.copy(Blocks.TORCHFLOWER)));
    public static final Block POTTED_LIGHT_BLUE_TORCHFLOWER = registerBlock("potted_light_blue_torchflower", false,
            new FlowerPotBlock(LIGHT_BLUE_TORCHFLOWER, AbstractBlock.Settings.copy(Blocks.POTTED_TORCHFLOWER)));
    public static final Block LIGHT_BLUE_PITCHER_PLANT = registerBlock("light_blue_pitcher_plant",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.PITCHER_PLANT)));

    // pink flowers

    public static final Block PINK_ALLIUM = registerBlock("pink_allium",
            new FlowerBlock(StatusEffects.FIRE_RESISTANCE, 4, AbstractBlock.Settings.copy(ALLIUM)));
    public static final Block POTTED_PINK_ALLIUM = registerBlock("potted_pink_allium", false,
            new FlowerPotBlock(PINK_ALLIUM, AbstractBlock.Settings.copy(Blocks.POTTED_ALLIUM)));
    public static final Block PINK_WITHER_ROSE = registerBlock("pink_wither_rose",
            new WitherRoseBlock(StatusEffects.WITHER, 8, AbstractBlock.Settings.copy(Blocks.WITHER_ROSE)));
    public static final Block POTTED_PINK_WITHER_ROSE = registerBlock("potted_pink_wither_rose", false,
            new FlowerPotBlock(PINK_WITHER_ROSE, AbstractBlock.Settings.copy(Blocks.POTTED_WITHER_ROSE)));
    public static final Block PINK_SUNFLOWER = registerBlock("pink_sunflower",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.SUNFLOWER)));
    public static final Block PINK_LILAC = registerBlock("pink_lilac",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.LILAC)));
    public static final Block PINK_ROSE_BUSH = registerBlock("pink_rose_bush",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.ROSE_BUSH)));
    public static final Block PINK_POPPY = registerBlock("pink_poppy",
            new FlowerBlock(StatusEffects.NIGHT_VISION, 5, AbstractBlock.Settings.copy(Blocks.POPPY)));
    public static final Block POTTED_PINK_POPPY = registerBlock("potted_pink_poppy", false,
            new FlowerPotBlock(PINK_POPPY, AbstractBlock.Settings.copy(Blocks.POTTED_POPPY)));
    public static final Block PINK_ORCHID = registerBlock("pink_orchid",
            new FlowerBlock(StatusEffects.SATURATION, 0.35f, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_PINK_ORCHID = registerBlock("potted_pink_orchid", false,
            new FlowerPotBlock(PINK_ORCHID, AbstractBlock.Settings.copy(Blocks.POTTED_BLUE_ORCHID)));
    public static final Block PINK_LILY = registerBlock("pink_lily",
            new FlowerBlock(StatusEffects.POISON, 12, AbstractBlock.Settings.copy(LILY_OF_THE_VALLEY)));
    public static final Block POTTED_PINK_LILY = registerBlock("potted_pink_lily", false,
            new FlowerPotBlock(PINK_LILY, AbstractBlock.Settings.copy(POTTED_LILY_OF_THE_VALLEY)));
    public static final Block PINK_DANDELION = registerBlock("pink_dandelion",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(Blocks.DANDELION)));
    public static final Block POTTED_PINK_DANDELION = registerBlock("potted_pink_dandelion", false,
            new FlowerPotBlock(PINK_DANDELION, AbstractBlock.Settings.copy(Blocks.POTTED_DANDELION)));
    public static final Block PINK_DAISY = registerBlock("pink_daisy",
            new FlowerBlock(StatusEffects.REGENERATION, 8, AbstractBlock.Settings.copy(OXEYE_DAISY)));
    public static final Block POTTED_PINK_DAISY = registerBlock("potted_pink_daisy", false,
            new FlowerPotBlock(PINK_DAISY, AbstractBlock.Settings.copy(POTTED_OXEYE_DAISY)));
    public static final Block PINK_CORNFLOWER = registerBlock("pink_cornflower",
            new FlowerBlock(StatusEffects.JUMP_BOOST, 6, AbstractBlock.Settings.copy(Blocks.CORNFLOWER)));
    public static final Block POTTED_PINK_CORNFLOWER = registerBlock("potted_pink_cornflower", false,
            new FlowerPotBlock(PINK_CORNFLOWER, AbstractBlock.Settings.copy(Blocks.POTTED_CORNFLOWER)));
    public static final Block PINK_AZURE_BLUET = registerBlock("pink_azure_bluet",
            new FlowerBlock(StatusEffects.BLINDNESS, 8, AbstractBlock.Settings.copy(Blocks.AZURE_BLUET)));
    public static final Block POTTED_PINK_AZURE_BLUET = registerBlock("potted_pink_azure_bluet", false,
            new FlowerPotBlock(PINK_AZURE_BLUET, AbstractBlock.Settings.copy(Blocks.POTTED_AZURE_BLUET)));
    public static final Block PINK_TORCHFLOWER = registerBlock("pink_torchflower",
            new FlowerBlock(StatusEffects.NIGHT_VISION, 5, AbstractBlock.Settings.copy(Blocks.TORCHFLOWER)));
    public static final Block POTTED_PINK_TORCHFLOWER = registerBlock("potted_pink_torchflower", false,
            new FlowerPotBlock(PINK_TORCHFLOWER, AbstractBlock.Settings.copy(Blocks.POTTED_TORCHFLOWER)));
    public static final Block PINK_PITCHER_PLANT = registerBlock("pink_pitcher_plant",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.PITCHER_PLANT)));

    // black flowers

    public static final Block BLACK_ALLIUM = registerBlock("black_allium",
            new FlowerBlock(StatusEffects.FIRE_RESISTANCE, 4, AbstractBlock.Settings.copy(ALLIUM)));
    public static final Block POTTED_BLACK_ALLIUM = registerBlock("potted_black_allium", false,
            new FlowerPotBlock(BLACK_ALLIUM, AbstractBlock.Settings.copy(Blocks.POTTED_ALLIUM)));
    public static final Block BLACK_TULIP = registerBlock("black_tulip",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(RED_TULIP)));
    public static final Block POTTED_BLACK_TULIP = registerBlock("potted_black_tulip", false,
            new FlowerPotBlock(BLACK_TULIP, AbstractBlock.Settings.copy(Blocks.POTTED_RED_TULIP)));
    public static final Block BLACK_SUNFLOWER = registerBlock("black_sunflower",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.SUNFLOWER)));
    public static final Block BLACK_PEONY = registerBlock("black_peony",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.PEONY)));
    public static final Block BLACK_LILAC = registerBlock("black_lilac",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.LILAC)));
    public static final Block BLACK_ROSE_BUSH = registerBlock("black_rose_bush",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.ROSE_BUSH)));
    public static final Block BLACK_POPPY = registerBlock("black_poppy",
            new FlowerBlock(StatusEffects.NIGHT_VISION, 5, AbstractBlock.Settings.copy(Blocks.POPPY)));
    public static final Block POTTED_BLACK_POPPY = registerBlock("potted_black_poppy", false,
            new FlowerPotBlock(BLACK_POPPY, AbstractBlock.Settings.copy(Blocks.POTTED_POPPY)));
    public static final Block BLACK_ORCHID = registerBlock("black_orchid",
            new FlowerBlock(StatusEffects.SATURATION, 0.35f, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_BLACK_ORCHID = registerBlock("potted_black_orchid", false,
            new FlowerPotBlock(BLACK_ORCHID, AbstractBlock.Settings.copy(Blocks.POTTED_BLUE_ORCHID)));
    public static final Block BLACK_LILY = registerBlock("black_lily",
            new FlowerBlock(StatusEffects.POISON, 12, AbstractBlock.Settings.copy(LILY_OF_THE_VALLEY)));
    public static final Block POTTED_BLACK_LILY = registerBlock("potted_black_lily", false,
            new FlowerPotBlock(BLACK_LILY, AbstractBlock.Settings.copy(POTTED_LILY_OF_THE_VALLEY)));
    public static final Block BLACK_DANDELION = registerBlock("black_dandelion",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(Blocks.DANDELION)));
    public static final Block POTTED_BLACK_DANDELION = registerBlock("potted_black_dandelion", false,
            new FlowerPotBlock(BLACK_DANDELION, AbstractBlock.Settings.copy(Blocks.POTTED_DANDELION)));
    public static final Block BLACK_DAISY = registerBlock("black_daisy",
            new FlowerBlock(StatusEffects.REGENERATION, 8, AbstractBlock.Settings.copy(OXEYE_DAISY)));
    public static final Block POTTED_BLACK_DAISY = registerBlock("potted_black_daisy", false,
            new FlowerPotBlock(BLACK_DAISY, AbstractBlock.Settings.copy(POTTED_OXEYE_DAISY)));
    public static final Block BLACK_CORNFLOWER = registerBlock("black_cornflower",
            new FlowerBlock(StatusEffects.JUMP_BOOST, 6, AbstractBlock.Settings.copy(Blocks.CORNFLOWER)));
    public static final Block POTTED_BLACK_CORNFLOWER = registerBlock("potted_black_cornflower", false,
            new FlowerPotBlock(BLACK_CORNFLOWER, AbstractBlock.Settings.copy(Blocks.POTTED_CORNFLOWER)));
    public static final Block BLACK_AZURE_BLUET = registerBlock("black_azure_bluet",
            new FlowerBlock(StatusEffects.BLINDNESS, 8, AbstractBlock.Settings.copy(Blocks.AZURE_BLUET)));
    public static final Block POTTED_BLACK_AZURE_BLUET = registerBlock("potted_black_azure_bluet", false,
            new FlowerPotBlock(BLACK_AZURE_BLUET, AbstractBlock.Settings.copy(Blocks.POTTED_AZURE_BLUET)));
    public static final Block BLACK_TORCHFLOWER = registerBlock("black_torchflower",
            new FlowerBlock(StatusEffects.NIGHT_VISION, 5, AbstractBlock.Settings.copy(Blocks.TORCHFLOWER)));
    public static final Block POTTED_BLACK_TORCHFLOWER = registerBlock("potted_black_torchflower", false,
            new FlowerPotBlock(BLACK_TORCHFLOWER, AbstractBlock.Settings.copy(Blocks.POTTED_TORCHFLOWER)));
    public static final Block BLACK_PITCHER_PLANT = registerBlock("black_pitcher_plant",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.PITCHER_PLANT)));

    // cyan flowers

    public static final Block CYAN_ALLIUM = registerBlock("cyan_allium",
            new FlowerBlock(StatusEffects.FIRE_RESISTANCE, 4, AbstractBlock.Settings.copy(ALLIUM)));
    public static final Block POTTED_CYAN_ALLIUM = registerBlock("potted_cyan_allium", false,
            new FlowerPotBlock(CYAN_ALLIUM, AbstractBlock.Settings.copy(Blocks.POTTED_ALLIUM)));
    public static final Block CYAN_TULIP = registerBlock("cyan_tulip",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(RED_TULIP)));
    public static final Block POTTED_CYAN_TULIP = registerBlock("potted_cyan_tulip", false,
            new FlowerPotBlock(CYAN_TULIP, AbstractBlock.Settings.copy(Blocks.POTTED_RED_TULIP)));
    public static final Block CYAN_WITHER_ROSE = registerBlock("cyan_wither_rose",
            new WitherRoseBlock(StatusEffects.WITHER, 8, AbstractBlock.Settings.copy(Blocks.WITHER_ROSE)));
    public static final Block POTTED_CYAN_WITHER_ROSE = registerBlock("potted_cyan_wither_rose", false,
            new FlowerPotBlock(CYAN_WITHER_ROSE, AbstractBlock.Settings.copy(Blocks.POTTED_WITHER_ROSE)));
    public static final Block CYAN_SUNFLOWER = registerBlock("cyan_sunflower",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.SUNFLOWER)));
    public static final Block CYAN_PEONY = registerBlock("cyan_peony",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.PEONY)));
    public static final Block CYAN_LILAC = registerBlock("cyan_lilac",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.LILAC)));
    public static final Block CYAN_ROSE_BUSH = registerBlock("cyan_rose_bush",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.ROSE_BUSH)));
    public static final Block CYAN_POPPY = registerBlock("cyan_poppy",
            new FlowerBlock(StatusEffects.NIGHT_VISION, 5, AbstractBlock.Settings.copy(Blocks.POPPY)));
    public static final Block POTTED_CYAN_POPPY = registerBlock("potted_cyan_poppy", false,
            new FlowerPotBlock(CYAN_POPPY, AbstractBlock.Settings.copy(Blocks.POTTED_POPPY)));
    public static final Block CYAN_ORCHID = registerBlock("cyan_orchid",
            new FlowerBlock(StatusEffects.SATURATION, 0.35f, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_CYAN_ORCHID = registerBlock("potted_cyan_orchid", false,
            new FlowerPotBlock(CYAN_ORCHID, AbstractBlock.Settings.copy(Blocks.POTTED_BLUE_ORCHID)));
    public static final Block CYAN_LILY = registerBlock("cyan_lily",
            new FlowerBlock(StatusEffects.POISON, 12, AbstractBlock.Settings.copy(LILY_OF_THE_VALLEY)));
    public static final Block POTTED_CYAN_LILY = registerBlock("potted_cyan_lily", false,
            new FlowerPotBlock(CYAN_LILY, AbstractBlock.Settings.copy(POTTED_LILY_OF_THE_VALLEY)));
    public static final Block CYAN_DANDELION = registerBlock("cyan_dandelion",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(Blocks.DANDELION)));
    public static final Block POTTED_CYAN_DANDELION = registerBlock("potted_cyan_dandelion", false,
            new FlowerPotBlock(CYAN_DANDELION, AbstractBlock.Settings.copy(Blocks.POTTED_DANDELION)));
    public static final Block CYAN_DAISY = registerBlock("cyan_daisy",
            new FlowerBlock(StatusEffects.REGENERATION, 8, AbstractBlock.Settings.copy(OXEYE_DAISY)));
    public static final Block POTTED_CYAN_DAISY = registerBlock("potted_cyan_daisy", false,
            new FlowerPotBlock(CYAN_DAISY, AbstractBlock.Settings.copy(POTTED_OXEYE_DAISY)));
    public static final Block CYAN_CORNFLOWER = registerBlock("cyan_cornflower",
            new FlowerBlock(StatusEffects.JUMP_BOOST, 6, AbstractBlock.Settings.copy(Blocks.CORNFLOWER)));
    public static final Block POTTED_CYAN_CORNFLOWER = registerBlock("potted_cyan_cornflower", false,
            new FlowerPotBlock(CYAN_CORNFLOWER, AbstractBlock.Settings.copy(Blocks.POTTED_CORNFLOWER)));
    public static final Block CYAN_AZURE_BLUET = registerBlock("cyan_azure_bluet",
            new FlowerBlock(StatusEffects.BLINDNESS, 8, AbstractBlock.Settings.copy(Blocks.AZURE_BLUET)));
    public static final Block POTTED_CYAN_AZURE_BLUET = registerBlock("potted_cyan_azure_bluet", false,
            new FlowerPotBlock(CYAN_AZURE_BLUET, AbstractBlock.Settings.copy(Blocks.POTTED_AZURE_BLUET)));
    public static final Block CYAN_TORCHFLOWER = registerBlock("cyan_torchflower",
            new FlowerBlock(StatusEffects.NIGHT_VISION, 5, AbstractBlock.Settings.copy(Blocks.TORCHFLOWER)));
    public static final Block POTTED_CYAN_TORCHFLOWER = registerBlock("potted_cyan_torchflower", false,
            new FlowerPotBlock(CYAN_TORCHFLOWER, AbstractBlock.Settings.copy(Blocks.POTTED_TORCHFLOWER)));

    public static final Block LOTUS_FLOWER = registerBlock("lotus_flower", false,
            new LilyPadBlock(AbstractBlock.Settings.copy(LILY_PAD)));

    //daffodils

    public static final Block MAGENTA_DAFFODIL = registerBlock("magenta_daffodil",
            new FlowerBlock(StatusEffects.SLOW_FALLING, 6, AbstractBlock.Settings.copy(DANDELION)));
    public static final Block POTTED_MAGENTA_DAFFODIL = registerBlock("potted_magenta_daffodil", false,
            new FlowerPotBlock(MAGENTA_DAFFODIL, AbstractBlock.Settings.copy(POTTED_DANDELION)));
    public static final Block BLUE_DAFFODIL = registerBlock("blue_daffodil",
            new FlowerBlock(StatusEffects.SLOW_FALLING, 6, AbstractBlock.Settings.copy(DANDELION)));
    public static final Block POTTED_BLUE_DAFFODIL = registerBlock("potted_blue_daffodil", false,
            new FlowerPotBlock(BLUE_DAFFODIL, AbstractBlock.Settings.copy(POTTED_DANDELION)));
    public static final Block WHITE_DAFFODIL = registerBlock("white_daffodil",
            new FlowerBlock(StatusEffects.SLOW_FALLING, 6, AbstractBlock.Settings.copy(DANDELION)));
    public static final Block POTTED_WHITE_DAFFODIL = registerBlock("potted_white_daffodil", false,
            new FlowerPotBlock(WHITE_DAFFODIL, AbstractBlock.Settings.copy(POTTED_DANDELION)));
    public static final Block ORANGE_DAFFODIL = registerBlock("orange_daffodil",
            new FlowerBlock(StatusEffects.SLOW_FALLING, 6, AbstractBlock.Settings.copy(DANDELION)));
    public static final Block POTTED_ORANGE_DAFFODIL = registerBlock("potted_orange_daffodil", false,
            new FlowerPotBlock(ORANGE_DAFFODIL, AbstractBlock.Settings.copy(POTTED_DANDELION)));
    public static final Block RED_DAFFODIL = registerBlock("red_daffodil",
            new FlowerBlock(StatusEffects.SLOW_FALLING, 6, AbstractBlock.Settings.copy(DANDELION)));
    public static final Block POTTED_RED_DAFFODIL = registerBlock("potted_red_daffodil", false,
            new FlowerPotBlock(RED_DAFFODIL, AbstractBlock.Settings.copy(POTTED_DANDELION)));
    public static final Block YELLOW_DAFFODIL = registerBlock("yellow_daffodil",
            new FlowerBlock(StatusEffects.SLOW_FALLING, 6, AbstractBlock.Settings.copy(DANDELION)));
    public static final Block POTTED_YELLOW_DAFFODIL = registerBlock("potted_yellow_daffodil", false,
            new FlowerPotBlock(YELLOW_DAFFODIL, AbstractBlock.Settings.copy(POTTED_DANDELION)));
    public static final Block LIGHT_BLUE_DAFFODIL = registerBlock("light_blue_daffodil",
            new FlowerBlock(StatusEffects.SLOW_FALLING, 6, AbstractBlock.Settings.copy(DANDELION)));
    public static final Block POTTED_LIGHT_BLUE_DAFFODIL = registerBlock("potted_light_blue_daffodil", false,
            new FlowerPotBlock(LIGHT_BLUE_DAFFODIL, AbstractBlock.Settings.copy(POTTED_DANDELION)));
    public static final Block PINK_DAFFODIL = registerBlock("pink_daffodil",
            new FlowerBlock(StatusEffects.SLOW_FALLING, 6, AbstractBlock.Settings.copy(DANDELION)));
    public static final Block POTTED_PINK_DAFFODIL = registerBlock("potted_pink_daffodil", false,
            new FlowerPotBlock(PINK_DAFFODIL, AbstractBlock.Settings.copy(POTTED_DANDELION)));
    public static final Block BLACK_DAFFODIL = registerBlock("black_daffodil",
            new FlowerBlock(StatusEffects.SLOW_FALLING, 6, AbstractBlock.Settings.copy(DANDELION)));
    public static final Block POTTED_BLACK_DAFFODIL = registerBlock("potted_black_daffodil", false,
            new FlowerPotBlock(BLACK_DAFFODIL, AbstractBlock.Settings.copy(POTTED_DANDELION)));
    public static final Block CYAN_DAFFODIL = registerBlock("cyan_daffodil",
            new FlowerBlock(StatusEffects.SLOW_FALLING, 6, AbstractBlock.Settings.copy(DANDELION)));
    public static final Block POTTED_CYAN_DAFFODIL = registerBlock("potted_cyan_daffodil", false,
            new FlowerPotBlock(CYAN_DAFFODIL, AbstractBlock.Settings.copy(POTTED_DANDELION)));


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
