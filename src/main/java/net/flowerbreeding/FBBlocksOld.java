package net.flowerbreeding;

import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffects;

public class FBBlocksOld {
    //can just delete this if u dont need lol, was just in case i was misremembering what u said to do so heres the old list
    public static final Block BLACK_TULIP = registerBlock("black_tulip",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(RED_TULIP)));
    public static final Block POTTED_BLACK_TULIP = registerBlock("potted_black_tulip", false,
            new FlowerPotBlock(BLACK_TULIP, AbstractBlock.Settings.copy(Blocks.POTTED_RED_TULIP)));

    public static final Block BLUE_TULIP = registerBlock("blue_tulip",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(RED_TULIP)));
    public static final Block POTTED_BLUE_TULIP = registerBlock("potted_blue_tulip", false,
            new FlowerPotBlock(BLACK_TULIP, AbstractBlock.Settings.copy(Blocks.POTTED_RED_TULIP)));

    public static final Block CYAN_TULIP = registerBlock("cyan_tulip",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(RED_TULIP)));
    public static final Block POTTED_CYAN_TULIP = registerBlock("potted_cyan_tulip", false,
            new FlowerPotBlock(BLACK_TULIP, AbstractBlock.Settings.copy(Blocks.POTTED_RED_TULIP)));

    public static final Block LILAC_TULIP = registerBlock("lilac_tulip",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(RED_TULIP)));
    public static final Block POTTED_LILAC_TULIP = registerBlock("potted_lilac_tulip", false,
            new FlowerPotBlock(BLACK_TULIP, AbstractBlock.Settings.copy(Blocks.POTTED_RED_TULIP)));

    public static final Block MAGENTA_TULIP = registerBlock("magenta_tulip",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(RED_TULIP)));
    public static final Block POTTED_MAGENTA_TULIP = registerBlock("potted_magenta_tulip", false,
            new FlowerPotBlock(BLACK_TULIP, AbstractBlock.Settings.copy(Blocks.POTTED_RED_TULIP)));

    public static final Block ORANGE_TULIP = registerBlock("orange_tulip",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(RED_TULIP)));
    public static final Block POTTED_ORANGE_TULIP = registerBlock("potted_orange_tulip", false,
            new FlowerPotBlock(BLACK_TULIP, AbstractBlock.Settings.copy(Blocks.POTTED_RED_TULIP)));

    public static final Block PINK_TULIP = registerBlock("pink_tulip",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(RED_TULIP)));
    public static final Block POTTED_PINK_TULIP = registerBlock("potted_pink_tulip", false,
            new FlowerPotBlock(BLACK_TULIP, AbstractBlock.Settings.copy(Blocks.POTTED_RED_TULIP)));

    public static final Block RED_TULIP = registerBlock("red_tulip",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(RED_TULIP)));
    public static final Block POTTED_RED_TULIP = registerBlock("potted_red_tulip", false,
            new FlowerPotBlock(RED_TULIP, AbstractBlock.Settings.copy(Blocks.POTTED_RED_TULIP)));

    public static final Block WHITE_TULIP = registerBlock("white_tulip",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(RED_TULIP)));
    public static final Block POTTED_WHITE_TULIP = registerBlock("potted_white_tulip", false,
            new FlowerPotBlock(BLACK_TULIP, AbstractBlock.Settings.copy(Blocks.POTTED_RED_TULIP)));

    public static final Block YELLOW_TULIP = registerBlock("yellow_tulip",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(RED_TULIP)));
    public static final Block POTTED_YELLOW_TULIP = registerBlock("potted_yellow_tulip", false,
            new FlowerPotBlock(BLACK_TULIP, AbstractBlock.Settings.copy(Blocks.POTTED_RED_TULIP)));;


// wither rose

    public static final Block BLACK_WITHER_ROSE = registerBlock("black_wither_rose",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(BLACK_WITHER_ROSE)));
    public static final Block POTTED_BLACK_WITHER_ROSE = registerBlock("potted_black_wither_rose", false,
            new FlowerPotBlock(BLACK_WITHER_ROSE, AbstractBlock.Settings.copy(POTTED_BLACK_WITHER_ROSE)));

    public static final Block BLUE_WITHER_ROSE = registerBlock("blue_wither_rose",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(BLUE_WITHER_ROSE)));
    public static final Block POTTED_BLUE_WITHER_ROSE = registerBlock("potted_blue_wither_rose", false,
            new FlowerPotBlock(BLUE_WITHER_ROSE, AbstractBlock.Settings.copy(POTTED_BLUE_WITHER_ROSE)));

    public static final Block CYAN_WITHER_ROSE = registerBlock("cyan_wither_rose",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(CYAN_WITHER_ROSE)));
    public static final Block POTTED_CYAN_WITHER_ROSE = registerBlock("potted_cyan_wither_rose", false,
            new FlowerPotBlock(CYAN_WITHER_ROSE, AbstractBlock.Settings.copy(POTTED_CYAN_WITHER_ROSE)));

    public static final Block LILAC_WITHER_ROSE = registerBlock("lilac_wither_rose",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(LILAC_WITHER_ROSE)));
    public static final Block POTTED_LILAC_WITHER_ROSE = registerBlock("potted_lilac_wither_rose", false,
            new FlowerPotBlock(LILAC_WITHER_ROSE, AbstractBlock.Settings.copy(POTTED_LILAC_WITHER_ROSE)));

    public static final Block MAGENTA_WITHER_ROSE = registerBlock("magenta_wither_rose",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(MAGENTA_WITHER_ROSE)));
    public static final Block POTTED_MAGENTA_WITHER_ROSE = registerBlock("potted_magenta_wither_rose", false,
            new FlowerPotBlock(MAGENTA_WITHER_ROSE, AbstractBlock.Settings.copy(POTTED_MAGENTA_WITHER_ROSE)));

    public static final Block ORANGE_WITHER_ROSE = registerBlock("orange_wither_rose",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(ORANGE_WITHER_ROSE)));
    public static final Block POTTED_ORANGE_WITHER_ROSE = registerBlock("potted_orange_wither_rose", false,
            new FlowerPotBlock(ORANGE_WITHER_ROSE, AbstractBlock.Settings.copy(POTTED_ORANGE_WITHER_ROSE)));

    public static final Block PINK_WITHER_ROSE = registerBlock("pink_wither_rose",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(PINK_WITHER_ROSE)));
    public static final Block POTTED_PINK_WITHER_ROSE = registerBlock("potted_pink_wither_rose", false,
            new FlowerPotBlock(PINK_WITHER_ROSE, AbstractBlock.Settings.copy(POTTED_PINK_WITHER_ROSE)));

    public static final Block RED_WITHER_ROSE = registerBlock("red_wither_rose",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(RED_WITHER_ROSE)));
    public static final Block POTTED_RED_WITHER_ROSE = registerBlock("potted_red_wither_rose", false,
            new FlowerPotBlock(RED_WITHER_ROSE, AbstractBlock.Settings.copy(POTTED_RED_WITHER_ROSE)));

    public static final Block WHITE_WITHER_ROSE = registerBlock("white_wither_rose",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(WHITE_WITHER_ROSE)));
    public static final Block POTTED_WHITE_WITHER_ROSE = registerBlock("potted_white_wither_rose", false,
            new FlowerPotBlock(WHITE_WITHER_ROSE, AbstractBlock.Settings.copy(POTTED_WHITE_WITHER_ROSE)));

    public static final Block YELLOW_WITHER_ROSE = registerBlock("yellow_wither_rose",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(YELLOW_WITHER_ROSE)));
    public static final Block POTTED_YELLOW_WITHER_ROSE = registerBlock("potted_yellow_wither_rose", false,
            new FlowerPotBlock(YELLOW_WITHER_ROSE, AbstractBlock.Settings.copy(POTTED_YELLOW_WITHER_ROSE)));

// sunflower

    public static final Block BLACK_SUNFLOWER = registerBlock("black_sunflower",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(BLACK_SUNFLOWER)));
    public static final Block POTTED_BLACK_SUNFLOWER = registerBlock("potted_black_sunflower", false,
            new FlowerPotBlock(BLACK_SUNFLOWER, AbstractBlock.Settings.copy(POTTED_BLACK_SUNFLOWER)));

    public static final Block BLUE_SUNFLOWER = registerBlock("blue_sunflower",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(BLUE_SUNFLOWER)));
    public static final Block POTTED_BLUE_SUNFLOWER = registerBlock("potted_blue_sunflower", false,
            new FlowerPotBlock(BLUE_SUNFLOWER, AbstractBlock.Settings.copy(POTTED_BLUE_SUNFLOWER)));

    public static final Block CYAN_SUNFLOWER = registerBlock("cyan_sunflower",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(CYAN_SUNFLOWER)));
    public static final Block POTTED_CYAN_SUNFLOWER = registerBlock("potted_cyan_sunflower", false,
            new FlowerPotBlock(CYAN_SUNFLOWER, AbstractBlock.Settings.copy(POTTED_CYAN_SUNFLOWER)));

    public static final Block LILAC_SUNFLOWER = registerBlock("lilac_sunflower",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(LILAC_SUNFLOWER)));
    public static final Block POTTED_LILAC_SUNFLOWER = registerBlock("potted_lilac_sunflower", false,
            new FlowerPotBlock(LILAC_SUNFLOWER, AbstractBlock.Settings.copy(POTTED_LILAC_SUNFLOWER)));

    public static final Block MAGENTA_SUNFLOWER = registerBlock("magenta_sunflower",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(MAGENTA_SUNFLOWER)));
    public static final Block POTTED_MAGENTA_SUNFLOWER = registerBlock("potted_magenta_sunflower", false,
            new FlowerPotBlock(MAGENTA_SUNFLOWER, AbstractBlock.Settings.copy(POTTED_MAGENTA_SUNFLOWER)));

    public static final Block ORANGE_SUNFLOWER = registerBlock("orange_sunflower",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(ORANGE_SUNFLOWER)));
    public static final Block POTTED_ORANGE_SUNFLOWER = registerBlock("potted_orange_sunflower", false,
            new FlowerPotBlock(ORANGE_SUNFLOWER, AbstractBlock.Settings.copy(POTTED_ORANGE_SUNFLOWER)));

    public static final Block PINK_SUNFLOWER = registerBlock("pink_sunflower",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(PINK_SUNFLOWER)));
    public static final Block POTTED_PINK_SUNFLOWER = registerBlock("potted_pink_sunflower", false,
            new FlowerPotBlock(PINK_SUNFLOWER, AbstractBlock.Settings.copy(POTTED_PINK_SUNFLOWER)));

    public static final Block RED_SUNFLOWER = registerBlock("red_sunflower",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(RED_SUNFLOWER)));
    public static final Block POTTED_RED_SUNFLOWER = registerBlock("potted_red_sunflower", false,
            new FlowerPotBlock(RED_SUNFLOWER, AbstractBlock.Settings.copy(POTTED_RED_SUNFLOWER)));

    public static final Block WHITE_SUNFLOWER = registerBlock("white_sunflower",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(WHITE_SUNFLOWER)));
    public static final Block POTTED_WHITE_SUNFLOWER = registerBlock("potted_white_sunflower", false,
            new FlowerPotBlock(WHITE_SUNFLOWER, AbstractBlock.Settings.copy(POTTED_WHITE_SUNFLOWER)));

    public static final Block YELLOW_SUNFLOWER = registerBlock("yellow_sunflower",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(YELLOW_SUNFLOWER)));
    public static final Block POTTED_YELLOW_SUNFLOWER = registerBlock("potted_yellow_sunflower", false,
            new FlowerPotBlock(YELLOW_SUNFLOWER, AbstractBlock.Settings.copy(POTTED_YELLOW_SUNFLOWER)));

// peony

    public static final Block BLACK_PEONY = registerBlock("black_peony",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(BLACK_PEONY)));
    public static final Block POTTED_BLACK_PEONY = registerBlock("potted_black_peony", false,
            new FlowerPotBlock(BLACK_PEONY, AbstractBlock.Settings.copy(POTTED_BLACK_PEONY)));

    public static final Block BLUE_PEONY = registerBlock("blue_peony",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(BLUE_PEONY)));
    public static final Block POTTED_BLUE_PEONY = registerBlock("potted_blue_peony", false,
            new FlowerPotBlock(BLUE_PEONY, AbstractBlock.Settings.copy(POTTED_BLUE_PEONY)));

    public static final Block CYAN_PEONY = registerBlock("cyan_peony",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(CYAN_PEONY)));
    public static final Block POTTED_CYAN_PEONY = registerBlock("potted_cyan_peony", false,
            new FlowerPotBlock(CYAN_PEONY, AbstractBlock.Settings.copy(POTTED_CYAN_PEONY)));

    public static final Block LILAC_PEONY = registerBlock("lilac_peony",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(LILAC_PEONY)));
    public static final Block POTTED_LILAC_PEONY = registerBlock("potted_lilac_peony", false,
            new FlowerPotBlock(LILAC_PEONY, AbstractBlock.Settings.copy(POTTED_LILAC_PEONY)));

    public static final Block MAGENTA_PEONY = registerBlock("magenta_peony",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(MAGENTA_PEONY)));
    public static final Block POTTED_MAGENTA_PEONY = registerBlock("potted_magenta_peony", false,
            new FlowerPotBlock(MAGENTA_PEONY, AbstractBlock.Settings.copy(POTTED_MAGENTA_PEONY)));

    public static final Block ORANGE_PEONY = registerBlock("orange_peony",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(ORANGE_PEONY)));
    public static final Block POTTED_ORANGE_PEONY = registerBlock("potted_orange_peony", false,
            new FlowerPotBlock(ORANGE_PEONY, AbstractBlock.Settings.copy(POTTED_ORANGE_PEONY)));

    public static final Block PINK_PEONY = registerBlock("pink_peony",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(PINK_PEONY)));
    public static final Block POTTED_PINK_PEONY = registerBlock("potted_pink_peony", false,
            new FlowerPotBlock(PINK_PEONY, AbstractBlock.Settings.copy(POTTED_PINK_PEONY)));

    public static final Block RED_PEONY = registerBlock("red_peony",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(RED_PEONY)));
    public static final Block POTTED_RED_PEONY = registerBlock("potted_red_peony", false,
            new FlowerPotBlock(RED_PEONY, AbstractBlock.Settings.copy(POTTED_RED_PEONY)));

    public static final Block WHITE_PEONY = registerBlock("white_peony",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(WHITE_PEONY)));
    public static final Block POTTED_WHITE_PEONY = registerBlock("potted_white_peony", false,
            new FlowerPotBlock(WHITE_PEONY, AbstractBlock.Settings.copy(POTTED_WHITE_PEONY)));

    public static final Block YELLOW_PEONY = registerBlock("yellow_peony",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(YELLOW_PEONY)));
    public static final Block POTTED_YELLOW_PEONY = registerBlock("potted_yellow_peony", false,
            new FlowerPotBlock(YELLOW_PEONY, AbstractBlock.Settings.copy(POTTED_YELLOW_PEONY)));

// lilac

    public static final Block BLACK_LILAC = registerBlock("black_lilac",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(BLACK_LILAC)));
    public static final Block POTTED_BLACK_LILAC = registerBlock("potted_black_lilac", false,
            new FlowerPotBlock(BLACK_LILAC, AbstractBlock.Settings.copy(POTTED_BLACK_LILAC)));

    public static final Block BLUE_LILAC = registerBlock("blue_lilac",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(BLUE_LILAC)));
    public static final Block POTTED_BLUE_LILAC = registerBlock("potted_blue_lilac", false,
            new FlowerPotBlock(BLUE_LILAC, AbstractBlock.Settings.copy(POTTED_BLUE_LILAC)));

    public static final Block CYAN_LILAC = registerBlock("cyan_lilac",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(CYAN_LILAC)));
    public static final Block POTTED_CYAN_LILAC = registerBlock("potted_cyan_lilac", false,
            new FlowerPotBlock(CYAN_LILAC, AbstractBlock.Settings.copy(POTTED_CYAN_LILAC)));

    public static final Block LILAC_LILAC = registerBlock("lilac_lilac",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(LILAC_LILAC)));
    public static final Block POTTED_LILAC_LILAC = registerBlock("potted_lilac_lilac", false,
            new FlowerPotBlock(LILAC_LILAC, AbstractBlock.Settings.copy(POTTED_LILAC_LILAC)));

    public static final Block MAGENTA_LILAC = registerBlock("magenta_lilac",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(MAGENTA_LILAC)));
    public static final Block POTTED_MAGENTA_LILAC = registerBlock("potted_magenta_lilac", false,
            new FlowerPotBlock(MAGENTA_LILAC, AbstractBlock.Settings.copy(POTTED_MAGENTA_LILAC)));

    public static final Block ORANGE_LILAC = registerBlock("orange_lilac",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(ORANGE_LILAC)));
    public static final Block POTTED_ORANGE_LILAC = registerBlock("potted_orange_lilac", false,
            new FlowerPotBlock(ORANGE_LILAC, AbstractBlock.Settings.copy(POTTED_ORANGE_LILAC)));

    public static final Block PINK_LILAC = registerBlock("pink_lilac",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(PINK_LILAC)));
    public static final Block POTTED_PINK_LILAC = registerBlock("potted_pink_lilac", false,
            new FlowerPotBlock(PINK_LILAC, AbstractBlock.Settings.copy(POTTED_PINK_LILAC)));

    public static final Block RED_LILAC = registerBlock("red_lilac",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(RED_LILAC)));
    public static final Block POTTED_RED_LILAC = registerBlock("potted_red_lilac", false,
            new FlowerPotBlock(RED_LILAC, AbstractBlock.Settings.copy(POTTED_RED_LILAC)));

    public static final Block WHITE_LILAC = registerBlock("white_lilac",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(WHITE_LILAC)));
    public static final Block POTTED_WHITE_LILAC = registerBlock("potted_white_lilac", false,
            new FlowerPotBlock(WHITE_LILAC, AbstractBlock.Settings.copy(POTTED_WHITE_LILAC)));

    public static final Block YELLOW_LILAC = registerBlock("yellow_lilac",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(YELLOW_LILAC)));
    public static final Block POTTED_YELLOW_LILAC = registerBlock("potted_yellow_lilac", false,
            new FlowerPotBlock(YELLOW_LILAC, AbstractBlock.Settings.copy(POTTED_YELLOW_LILAC)));

// rose

    public static final Block BLACK_ROSE = registerBlock("black_rose",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(BLACK_ROSE)));
    public static final Block POTTED_BLACK_ROSE = registerBlock("potted_black_rose", false,
            new FlowerPotBlock(BLACK_ROSE, AbstractBlock.Settings.copy(POTTED_BLACK_ROSE)));

    public static final Block BLUE_ROSE = registerBlock("blue_rose",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(BLUE_ROSE)));
    public static final Block POTTED_BLUE_ROSE = registerBlock("potted_blue_rose", false,
            new FlowerPotBlock(BLUE_ROSE, AbstractBlock.Settings.copy(POTTED_BLUE_ROSE)));

    public static final Block CYAN_ROSE = registerBlock("cyan_rose",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(CYAN_ROSE)));
    public static final Block POTTED_CYAN_ROSE = registerBlock("potted_cyan_rose", false,
            new FlowerPotBlock(CYAN_ROSE, AbstractBlock.Settings.copy(POTTED_CYAN_ROSE)));

    public static final Block LILAC_ROSE = registerBlock("lilac_rose",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(LILAC_ROSE)));
    public static final Block POTTED_LILAC_ROSE = registerBlock("potted_lilac_rose", false,
            new FlowerPotBlock(LILAC_ROSE, AbstractBlock.Settings.copy(POTTED_LILAC_ROSE)));

    public static final Block MAGENTA_ROSE = registerBlock("magenta_rose",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(MAGENTA_ROSE)));
    public static final Block POTTED_MAGENTA_ROSE = registerBlock("potted_magenta_rose", false,
            new FlowerPotBlock(MAGENTA_ROSE, AbstractBlock.Settings.copy(POTTED_MAGENTA_ROSE)));

    public static final Block ORANGE_ROSE = registerBlock("orange_rose",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(ORANGE_ROSE)));
    public static final Block POTTED_ORANGE_ROSE = registerBlock("potted_orange_rose", false,
            new FlowerPotBlock(ORANGE_ROSE, AbstractBlock.Settings.copy(POTTED_ORANGE_ROSE)));

    public static final Block PINK_ROSE = registerBlock("pink_rose",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(PINK_ROSE)));
    public static final Block POTTED_PINK_ROSE = registerBlock("potted_pink_rose", false,
            new FlowerPotBlock(PINK_ROSE, AbstractBlock.Settings.copy(POTTED_PINK_ROSE)));

    public static final Block RED_ROSE = registerBlock("red_rose",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(RED_ROSE)));
    public static final Block POTTED_RED_ROSE = registerBlock("potted_red_rose", false,
            new FlowerPotBlock(RED_ROSE, AbstractBlock.Settings.copy(POTTED_RED_ROSE)));

    public static final Block WHITE_ROSE = registerBlock("white_rose",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(WHITE_ROSE)));
    public static final Block POTTED_WHITE_ROSE = registerBlock("potted_white_rose", false,
            new FlowerPotBlock(WHITE_ROSE, AbstractBlock.Settings.copy(POTTED_WHITE_ROSE)));

    public static final Block YELLOW_ROSE = registerBlock("yellow_rose",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(YELLOW_ROSE)));
    public static final Block POTTED_YELLOW_ROSE = registerBlock("potted_yellow_rose", false,
            new FlowerPotBlock(YELLOW_ROSE, AbstractBlock.Settings.copy(POTTED_YELLOW_ROSE)));

// poppy

    public static final Block BLACK_POPPY = registerBlock("black_poppy",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(BLACK_POPPY)));
    public static final Block POTTED_BLACK_POPPY = registerBlock("potted_black_poppy", false,
            new FlowerPotBlock(BLACK_POPPY, AbstractBlock.Settings.copy(POTTED_BLACK_POPPY)));

    public static final Block BLUE_POPPY = registerBlock("blue_poppy",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(BLUE_POPPY)));
    public static final Block POTTED_BLUE_POPPY = registerBlock("potted_blue_poppy", false,
            new FlowerPotBlock(BLUE_POPPY, AbstractBlock.Settings.copy(POTTED_BLUE_POPPY)));

    public static final Block CYAN_POPPY = registerBlock("cyan_poppy",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(CYAN_POPPY)));
    public static final Block POTTED_CYAN_POPPY = registerBlock("potted_cyan_poppy", false,
            new FlowerPotBlock(CYAN_POPPY, AbstractBlock.Settings.copy(POTTED_CYAN_POPPY)));

    public static final Block LILAC_POPPY = registerBlock("lilac_poppy",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(LILAC_POPPY)));
    public static final Block POTTED_LILAC_POPPY = registerBlock("potted_lilac_poppy", false,
            new FlowerPotBlock(LILAC_POPPY, AbstractBlock.Settings.copy(POTTED_LILAC_POPPY)));

    public static final Block MAGENTA_POPPY = registerBlock("magenta_poppy",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(MAGENTA_POPPY)));
    public static final Block POTTED_MAGENTA_POPPY = registerBlock("potted_magenta_poppy", false,
            new FlowerPotBlock(MAGENTA_POPPY, AbstractBlock.Settings.copy(POTTED_MAGENTA_POPPY)));

    public static final Block ORANGE_POPPY = registerBlock("orange_poppy",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(ORANGE_POPPY)));
    public static final Block POTTED_ORANGE_POPPY = registerBlock("potted_orange_poppy", false,
            new FlowerPotBlock(ORANGE_POPPY, AbstractBlock.Settings.copy(POTTED_ORANGE_POPPY)));

    public static final Block PINK_POPPY = registerBlock("pink_poppy",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(PINK_POPPY)));
    public static final Block POTTED_PINK_POPPY = registerBlock("potted_pink_poppy", false,
            new FlowerPotBlock(PINK_POPPY, AbstractBlock.Settings.copy(POTTED_PINK_POPPY)));

    public static final Block RED_POPPY = registerBlock("red_poppy",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(RED_POPPY)));
    public static final Block POTTED_RED_POPPY = registerBlock("potted_red_poppy", false,
            new FlowerPotBlock(RED_POPPY, AbstractBlock.Settings.copy(POTTED_RED_POPPY)));

    public static final Block WHITE_POPPY = registerBlock("white_poppy",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(WHITE_POPPY)));
    public static final Block POTTED_WHITE_POPPY = registerBlock("potted_white_poppy", false,
            new FlowerPotBlock(WHITE_POPPY, AbstractBlock.Settings.copy(POTTED_WHITE_POPPY)));

    public static final Block YELLOW_POPPY = registerBlock("yellow_poppy",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(YELLOW_POPPY)));
    public static final Block POTTED_YELLOW_POPPY = registerBlock("potted_yellow_poppy", false,
            new FlowerPotBlock(YELLOW_POPPY, AbstractBlock.Settings.copy(POTTED_YELLOW_POPPY)));

// orchid

    public static final Block BLACK_ORCHID = registerBlock("black_orchid",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(BLACK_ORCHID)));
    public static final Block POTTED_BLACK_ORCHID = registerBlock("potted_black_orchid", false,
            new FlowerPotBlock(BLACK_ORCHID, AbstractBlock.Settings.copy(POTTED_BLACK_ORCHID)));

    public static final Block BLUE_ORCHID = registerBlock("blue_orchid",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(BLUE_ORCHID)));
    public static final Block POTTED_BLUE_ORCHID = registerBlock("potted_blue_orchid", false,
            new FlowerPotBlock(BLUE_ORCHID, AbstractBlock.Settings.copy(POTTED_BLUE_ORCHID)));

    public static final Block CYAN_ORCHID = registerBlock("cyan_orchid",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(CYAN_ORCHID)));
    public static final Block POTTED_CYAN_ORCHID = registerBlock("potted_cyan_orchid", false,
            new FlowerPotBlock(CYAN_ORCHID, AbstractBlock.Settings.copy(POTTED_CYAN_ORCHID)));

    public static final Block LILAC_ORCHID = registerBlock("lilac_orchid",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(LILAC_ORCHID)));
    public static final Block POTTED_LILAC_ORCHID = registerBlock("potted_lilac_orchid", false,
            new FlowerPotBlock(LILAC_ORCHID, AbstractBlock.Settings.copy(POTTED_LILAC_ORCHID)));

    public static final Block MAGENTA_ORCHID = registerBlock("magenta_orchid",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(MAGENTA_ORCHID)));
    public static final Block POTTED_MAGENTA_ORCHID = registerBlock("potted_magenta_orchid", false,
            new FlowerPotBlock(MAGENTA_ORCHID, AbstractBlock.Settings.copy(POTTED_MAGENTA_ORCHID)));

    public static final Block ORANGE_ORCHID = registerBlock("orange_orchid",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(ORANGE_ORCHID)));
    public static final Block POTTED_ORANGE_ORCHID = registerBlock("potted_orange_orchid", false,
            new FlowerPotBlock(ORANGE_ORCHID, AbstractBlock.Settings.copy(POTTED_ORANGE_ORCHID)));

    public static final Block PINK_ORCHID = registerBlock("pink_orchid",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(PINK_ORCHID)));
    public static final Block POTTED_PINK_ORCHID = registerBlock("potted_pink_orchid", false,
            new FlowerPotBlock(PINK_ORCHID, AbstractBlock.Settings.copy(POTTED_PINK_ORCHID)));

    public static final Block RED_ORCHID = registerBlock("red_orchid",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(RED_ORCHID)));
    public static final Block POTTED_RED_ORCHID = registerBlock("potted_red_orchid", false,
            new FlowerPotBlock(RED_ORCHID, AbstractBlock.Settings.copy(POTTED_RED_ORCHID)));

    public static final Block WHITE_ORCHID = registerBlock("white_orchid",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(WHITE_ORCHID)));
    public static final Block POTTED_WHITE_ORCHID = registerBlock("potted_white_orchid", false,
            new FlowerPotBlock(WHITE_ORCHID, AbstractBlock.Settings.copy(POTTED_WHITE_ORCHID)));

    public static final Block YELLOW_ORCHID = registerBlock("yellow_orchid",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(YELLOW_ORCHID)));
    public static final Block POTTED_YELLOW_ORCHID = registerBlock("potted_yellow_orchid", false,
            new FlowerPotBlock(YELLOW_ORCHID, AbstractBlock.Settings.copy(POTTED_YELLOW_ORCHID)));

// lily

    public static final Block BLACK_LILY = registerBlock("black_lily",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(BLACK_LILY)));
    public static final Block POTTED_BLACK_LILY = registerBlock("potted_black_lily", false,
            new FlowerPotBlock(BLACK_LILY, AbstractBlock.Settings.copy(POTTED_BLACK_LILY)));

    public static final Block BLUE_LILY = registerBlock("blue_lily",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(BLUE_LILY)));
    public static final Block POTTED_BLUE_LILY = registerBlock("potted_blue_lily", false,
            new FlowerPotBlock(BLUE_LILY, AbstractBlock.Settings.copy(POTTED_BLUE_LILY)));

    public static final Block CYAN_LILY = registerBlock("cyan_lily",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(CYAN_LILY)));
    public static final Block POTTED_CYAN_LILY = registerBlock("potted_cyan_lily", false,
            new FlowerPotBlock(CYAN_LILY, AbstractBlock.Settings.copy(POTTED_CYAN_LILY)));

    public static final Block LILAC_LILY = registerBlock("lilac_lily",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(LILAC_LILY)));
    public static final Block POTTED_LILAC_LILY = registerBlock("potted_lilac_lily", false,
            new FlowerPotBlock(LILAC_LILY, AbstractBlock.Settings.copy(POTTED_LILAC_LILY)));

    public static final Block MAGENTA_LILY = registerBlock("magenta_lily",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(MAGENTA_LILY)));
    public static final Block POTTED_MAGENTA_LILY = registerBlock("potted_magenta_lily", false,
            new FlowerPotBlock(MAGENTA_LILY, AbstractBlock.Settings.copy(POTTED_MAGENTA_LILY)));

    public static final Block ORANGE_LILY = registerBlock("orange_lily",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(ORANGE_LILY)));
    public static final Block POTTED_ORANGE_LILY = registerBlock("potted_orange_lily", false,
            new FlowerPotBlock(ORANGE_LILY, AbstractBlock.Settings.copy(POTTED_ORANGE_LILY)));

    public static final Block PINK_LILY = registerBlock("pink_lily",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(PINK_LILY)));
    public static final Block POTTED_PINK_LILY = registerBlock("potted_pink_lily", false,
            new FlowerPotBlock(PINK_LILY, AbstractBlock.Settings.copy(POTTED_PINK_LILY)));

    public static final Block RED_LILY = registerBlock("red_lily",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(RED_LILY)));
    public static final Block POTTED_RED_LILY = registerBlock("potted_red_lily", false,
            new FlowerPotBlock(RED_LILY, AbstractBlock.Settings.copy(POTTED_RED_LILY)));

    public static final Block WHITE_LILY = registerBlock("white_lily",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(WHITE_LILY)));
    public static final Block POTTED_WHITE_LILY = registerBlock("potted_white_lily", false,
            new FlowerPotBlock(WHITE_LILY, AbstractBlock.Settings.copy(POTTED_WHITE_LILY)));

    public static final Block YELLOW_LILY = registerBlock("yellow_lily",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(YELLOW_LILY)));
    public static final Block POTTED_YELLOW_LILY = registerBlock("potted_yellow_lily", false,
            new FlowerPotBlock(YELLOW_LILY, AbstractBlock.Settings.copy(POTTED_YELLOW_LILY)));

// dandelion

    public static final Block BLACK_DANDELION = registerBlock("black_dandelion",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(BLACK_DANDELION)));
    public static final Block POTTED_BLACK_DANDELION = registerBlock("potted_black_dandelion", false,
            new FlowerPotBlock(BLACK_DANDELION, AbstractBlock.Settings.copy(POTTED_BLACK_DANDELION)));

    public static final Block BLUE_DANDELION = registerBlock("blue_dandelion",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(BLUE_DANDELION)));
    public static final Block POTTED_BLUE_DANDELION = registerBlock("potted_blue_dandelion", false,
            new FlowerPotBlock(BLUE_DANDELION, AbstractBlock.Settings.copy(POTTED_BLUE_DANDELION)));

    public static final Block CYAN_DANDELION = registerBlock("cyan_dandelion",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(CYAN_DANDELION)));
    public static final Block POTTED_CYAN_DANDELION = registerBlock("potted_cyan_dandelion", false,
            new FlowerPotBlock(CYAN_DANDELION, AbstractBlock.Settings.copy(POTTED_CYAN_DANDELION)));

    public static final Block LILAC_DANDELION = registerBlock("lilac_dandelion",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(LILAC_DANDELION)));
    public static final Block POTTED_LILAC_DANDELION = registerBlock("potted_lilac_dandelion", false,
            new FlowerPotBlock(LILAC_DANDELION, AbstractBlock.Settings.copy(POTTED_LILAC_DANDELION)));

    public static final Block MAGENTA_DANDELION = registerBlock("magenta_dandelion",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(MAGENTA_DANDELION)));
    public static final Block POTTED_MAGENTA_DANDELION = registerBlock("potted_magenta_dandelion", false,
            new FlowerPotBlock(MAGENTA_DANDELION, AbstractBlock.Settings.copy(POTTED_MAGENTA_DANDELION)));

    public static final Block ORANGE_DANDELION = registerBlock("orange_dandelion",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(ORANGE_DANDELION)));
    public static final Block POTTED_ORANGE_DANDELION = registerBlock("potted_orange_dandelion", false,
            new FlowerPotBlock(ORANGE_DANDELION, AbstractBlock.Settings.copy(POTTED_ORANGE_DANDELION)));

    public static final Block PINK_DANDELION = registerBlock("pink_dandelion",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(PINK_DANDELION)));
    public static final Block POTTED_PINK_DANDELION = registerBlock("potted_pink_dandelion", false,
            new FlowerPotBlock(PINK_DANDELION, AbstractBlock.Settings.copy(POTTED_PINK_DANDELION)));

    public static final Block RED_DANDELION = registerBlock("red_dandelion",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(RED_DANDELION)));
    public static final Block POTTED_RED_DANDELION = registerBlock("potted_red_dandelion", false,
            new FlowerPotBlock(RED_DANDELION, AbstractBlock.Settings.copy(POTTED_RED_DANDELION)));

    public static final Block WHITE_DANDELION = registerBlock("white_dandelion",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(WHITE_DANDELION)));
    public static final Block POTTED_WHITE_DANDELION = registerBlock("potted_white_dandelion", false,
            new FlowerPotBlock(WHITE_DANDELION, AbstractBlock.Settings.copy(POTTED_WHITE_DANDELION)));

    public static final Block YELLOW_DANDELION = registerBlock("yellow_dandelion",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(YELLOW_DANDELION)));
    public static final Block POTTED_YELLOW_DANDELION = registerBlock("potted_yellow_dandelion", false,
            new FlowerPotBlock(YELLOW_DANDELION, AbstractBlock.Settings.copy(POTTED_YELLOW_DANDELION)));

// daisy

    public static final Block BLACK_DAISY = registerBlock("black_daisy",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(BLACK_DAISY)));
    public static final Block POTTED_BLACK_DAISY = registerBlock("potted_black_daisy", false,
            new FlowerPotBlock(BLACK_DAISY, AbstractBlock.Settings.copy(POTTED_BLACK_DAISY)));

    public static final Block BLUE_DAISY = registerBlock("blue_daisy",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(BLUE_DAISY)));
    public static final Block POTTED_BLUE_DAISY = registerBlock("potted_blue_daisy", false,
            new FlowerPotBlock(BLUE_DAISY, AbstractBlock.Settings.copy(POTTED_BLUE_DAISY)));

    public static final Block CYAN_DAISY = registerBlock("cyan_daisy",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(CYAN_DAISY)));
    public static final Block POTTED_CYAN_DAISY = registerBlock("potted_cyan_daisy", false,
            new FlowerPotBlock(CYAN_DAISY, AbstractBlock.Settings.copy(POTTED_CYAN_DAISY)));

    public static final Block LILAC_DAISY = registerBlock("lilac_daisy",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(LILAC_DAISY)));
    public static final Block POTTED_LILAC_DAISY = registerBlock("potted_lilac_daisy", false,
            new FlowerPotBlock(LILAC_DAISY, AbstractBlock.Settings.copy(POTTED_LILAC_DAISY)));

    public static final Block MAGENTA_DAISY = registerBlock("magenta_daisy",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(MAGENTA_DAISY)));
    public static final Block POTTED_MAGENTA_DAISY = registerBlock("potted_magenta_daisy", false,
            new FlowerPotBlock(MAGENTA_DAISY, AbstractBlock.Settings.copy(POTTED_MAGENTA_DAISY)));

    public static final Block ORANGE_DAISY = registerBlock("orange_daisy",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(ORANGE_DAISY)));
    public static final Block POTTED_ORANGE_DAISY = registerBlock("potted_orange_daisy", false,
            new FlowerPotBlock(ORANGE_DAISY, AbstractBlock.Settings.copy(POTTED_ORANGE_DAISY)));

    public static final Block PINK_DAISY = registerBlock("pink_daisy",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(PINK_DAISY)));
    public static final Block POTTED_PINK_DAISY = registerBlock("potted_pink_daisy", false,
            new FlowerPotBlock(PINK_DAISY, AbstractBlock.Settings.copy(POTTED_PINK_DAISY)));

    public static final Block RED_DAISY = registerBlock("red_daisy",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(RED_DAISY)));
    public static final Block POTTED_RED_DAISY = registerBlock("potted_red_daisy", false,
            new FlowerPotBlock(RED_DAISY, AbstractBlock.Settings.copy(POTTED_RED_DAISY)));

    public static final Block WHITE_DAISY = registerBlock("white_daisy",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(WHITE_DAISY)));
    public static final Block POTTED_WHITE_DAISY = registerBlock("potted_white_daisy", false,
            new FlowerPotBlock(WHITE_DAISY, AbstractBlock.Settings.copy(POTTED_WHITE_DAISY)));

    public static final Block YELLOW_DAISY = registerBlock("yellow_daisy",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(YELLOW_DAISY)));
    public static final Block POTTED_YELLOW_DAISY = registerBlock("potted_yellow_daisy", false,
            new FlowerPotBlock(YELLOW_DAISY, AbstractBlock.Settings.copy(POTTED_YELLOW_DAISY)));

// cornflower

    public static final Block BLACK_CORNFLOWER = registerBlock("black_cornflower",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(BLACK_CORNFLOWER)));
    public static final Block POTTED_BLACK_CORNFLOWER = registerBlock("potted_black_cornflower", false,
            new FlowerPotBlock(BLACK_CORNFLOWER, AbstractBlock.Settings.copy(POTTED_BLACK_CORNFLOWER)));

    public static final Block BLUE_CORNFLOWER = registerBlock("blue_cornflower",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(BLUE_CORNFLOWER)));
    public static final Block POTTED_BLUE_CORNFLOWER = registerBlock("potted_blue_cornflower", false,
            new FlowerPotBlock(BLUE_CORNFLOWER, AbstractBlock.Settings.copy(POTTED_BLUE_CORNFLOWER)));

    public static final Block CYAN_CORNFLOWER = registerBlock("cyan_cornflower",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(CYAN_CORNFLOWER)));
    public static final Block POTTED_CYAN_CORNFLOWER = registerBlock("potted_cyan_cornflower", false,
            new FlowerPotBlock(CYAN_CORNFLOWER, AbstractBlock.Settings.copy(POTTED_CYAN_CORNFLOWER)));

    public static final Block LILAC_CORNFLOWER = registerBlock("lilac_cornflower",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(LILAC_CORNFLOWER)));
    public static final Block POTTED_LILAC_CORNFLOWER = registerBlock("potted_lilac_cornflower", false,
            new FlowerPotBlock(LILAC_CORNFLOWER, AbstractBlock.Settings.copy(POTTED_LILAC_CORNFLOWER)));

    public static final Block MAGENTA_CORNFLOWER = registerBlock("magenta_cornflower",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(MAGENTA_CORNFLOWER)));
    public static final Block POTTED_MAGENTA_CORNFLOWER = registerBlock("potted_magenta_cornflower", false,
            new FlowerPotBlock(MAGENTA_CORNFLOWER, AbstractBlock.Settings.copy(POTTED_MAGENTA_CORNFLOWER)));

    public static final Block ORANGE_CORNFLOWER = registerBlock("orange_cornflower",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(ORANGE_CORNFLOWER)));
    public static final Block POTTED_ORANGE_CORNFLOWER = registerBlock("potted_orange_cornflower", false,
            new FlowerPotBlock(ORANGE_CORNFLOWER, AbstractBlock.Settings.copy(POTTED_ORANGE_CORNFLOWER)));

    public static final Block PINK_CORNFLOWER = registerBlock("pink_cornflower",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(PINK_CORNFLOWER)));
    public static final Block POTTED_PINK_CORNFLOWER = registerBlock("potted_pink_cornflower", false,
            new FlowerPotBlock(PINK_CORNFLOWER, AbstractBlock.Settings.copy(POTTED_PINK_CORNFLOWER)));

    public static final Block RED_CORNFLOWER = registerBlock("red_cornflower",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(RED_CORNFLOWER)));
    public static final Block POTTED_RED_CORNFLOWER = registerBlock("potted_red_cornflower", false,
            new FlowerPotBlock(RED_CORNFLOWER, AbstractBlock.Settings.copy(POTTED_RED_CORNFLOWER)));

    public static final Block WHITE_CORNFLOWER = registerBlock("white_cornflower",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(WHITE_CORNFLOWER)));
    public static final Block POTTED_WHITE_CORNFLOWER = registerBlock("potted_white_cornflower", false,
            new FlowerPotBlock(WHITE_CORNFLOWER, AbstractBlock.Settings.copy(POTTED_WHITE_CORNFLOWER)));

    public static final Block YELLOW_CORNFLOWER = registerBlock("yellow_cornflower",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(YELLOW_CORNFLOWER)));
    public static final Block POTTED_YELLOW_CORNFLOWER = registerBlock("potted_yellow_cornflower", false,
            new FlowerPotBlock(YELLOW_CORNFLOWER, AbstractBlock.Settings.copy(POTTED_YELLOW_CORNFLOWER)));

// azure bluet

    public static final Block BLACK_AZURE_BLUET = registerBlock("black_azure_bluet",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(BLACK_AZURE_BLUET)));
    public static final Block POTTED_BLACK_AZURE_BLUET = registerBlock("potted_black_azure_bluet", false,
            new FlowerPotBlock(BLACK_AZURE_BLUET, AbstractBlock.Settings.copy(POTTED_BLACK_AZURE_BLUET)));

    public static final Block BLUE_AZURE_BLUET = registerBlock("blue_azure_bluet",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(BLUE_AZURE_BLUET)));
    public static final Block POTTED_BLUE_AZURE_BLUET = registerBlock("potted_blue_azure_bluet", false,
            new FlowerPotBlock(BLUE_AZURE_BLUET, AbstractBlock.Settings.copy(POTTED_BLUE_AZURE_BLUET)));

    public static final Block CYAN_AZURE_BLUET = registerBlock("cyan_azure_bluet",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(CYAN_AZURE_BLUET)));
    public static final Block POTTED_CYAN_AZURE_BLUET = registerBlock("potted_cyan_azure_bluet", false,
            new FlowerPotBlock(CYAN_AZURE_BLUET, AbstractBlock.Settings.copy(POTTED_CYAN_AZURE_BLUET)));

    public static final Block LILAC_AZURE_BLUET = registerBlock("lilac_azure_bluet",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(LILAC_AZURE_BLUET)));
    public static final Block POTTED_LILAC_AZURE_BLUET = registerBlock("potted_lilac_azure_bluet", false,
            new FlowerPotBlock(LILAC_AZURE_BLUET, AbstractBlock.Settings.copy(POTTED_LILAC_AZURE_BLUET)));

    public static final Block MAGENTA_AZURE_BLUET = registerBlock("magenta_azure_bluet",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(MAGENTA_AZURE_BLUET)));
    public static final Block POTTED_MAGENTA_AZURE_BLUET = registerBlock("potted_magenta_azure_bluet", false,
            new FlowerPotBlock(MAGENTA_AZURE_BLUET, AbstractBlock.Settings.copy(POTTED_MAGENTA_AZURE_BLUET)));

    public static final Block ORANGE_AZURE_BLUET = registerBlock("orange_azure_bluet",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(ORANGE_AZURE_BLUET)));
    public static final Block POTTED_ORANGE_AZURE_BLUET = registerBlock("potted_orange_azure_bluet", false,
            new FlowerPotBlock(ORANGE_AZURE_BLUET, AbstractBlock.Settings.copy(POTTED_ORANGE_AZURE_BLUET)));

    public static final Block PINK_AZURE_BLUET = registerBlock("pink_azure_bluet",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(PINK_AZURE_BLUET)));
    public static final Block POTTED_PINK_AZURE_BLUET = registerBlock("potted_pink_azure_bluet", false,
            new FlowerPotBlock(PINK_AZURE_BLUET, AbstractBlock.Settings.copy(POTTED_PINK_AZURE_BLUET)));

    public static final Block RED_AZURE_BLUET = registerBlock("red_azure_bluet",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(RED_AZURE_BLUET)));
    public static final Block POTTED_RED_AZURE_BLUET = registerBlock("potted_red_azure_bluet", false,
            new FlowerPotBlock(RED_AZURE_BLUET, AbstractBlock.Settings.copy(POTTED_RED_AZURE_BLUET)));

    public static final Block WHITE_AZURE_BLUET = registerBlock("white_azure_bluet",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(WHITE_AZURE_BLUET)));
    public static final Block POTTED_WHITE_AZURE_BLUET = registerBlock("potted_white_azure_bluet", false,
            new FlowerPotBlock(WHITE_AZURE_BLUET, AbstractBlock.Settings.copy(POTTED_WHITE_AZURE_BLUET)));

    public static final Block YELLOW_AZURE_BLUET = registerBlock("yellow_azure_bluet",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(YELLOW_AZURE_BLUET)));
    public static final Block POTTED_YELLOW_AZURE_BLUET = registerBlock("potted_yellow_azure_bluet", false,
            new FlowerPotBlock(YELLOW_AZURE_BLUET, AbstractBlock.Settings.copy(POTTED_YELLOW_AZURE_BLUET)));

// allium

    public static final Block BLACK_ALLIUM = registerBlock("black_allium",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(BLACK_ALLIUM)));
    public static final Block POTTED_BLACK_ALLIUM = registerBlock("potted_black_allium", false,
            new FlowerPotBlock(BLACK_ALLIUM, AbstractBlock.Settings.copy(POTTED_BLACK_ALLIUM)));

    public static final Block BLUE_ALLIUM = registerBlock("blue_allium",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(BLUE_ALLIUM)));
    public static final Block POTTED_BLUE_ALLIUM = registerBlock("potted_blue_allium", false,
            new FlowerPotBlock(BLUE_ALLIUM, AbstractBlock.Settings.copy(POTTED_BLUE_ALLIUM)));

    public static final Block CYAN_ALLIUM = registerBlock("cyan_allium",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(CYAN_ALLIUM)));
    public static final Block POTTED_CYAN_ALLIUM = registerBlock("potted_cyan_allium", false,
            new FlowerPotBlock(CYAN_ALLIUM, AbstractBlock.Settings.copy(POTTED_CYAN_ALLIUM)));

    public static final Block LILAC_ALLIUM = registerBlock("lilac_allium",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(LILAC_ALLIUM)));
    public static final Block POTTED_LILAC_ALLIUM = registerBlock("potted_lilac_allium", false,
            new FlowerPotBlock(LILAC_ALLIUM, AbstractBlock.Settings.copy(POTTED_LILAC_ALLIUM)));

    public static final Block MAGENTA_ALLIUM = registerBlock("magenta_allium",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(MAGENTA_ALLIUM)));
    public static final Block POTTED_MAGENTA_ALLIUM = registerBlock("potted_magenta_allium", false,
            new FlowerPotBlock(MAGENTA_ALLIUM, AbstractBlock.Settings.copy(POTTED_MAGENTA_ALLIUM)));

    public static final Block ORANGE_ALLIUM = registerBlock("orange_allium",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(ORANGE_ALLIUM)));
    public static final Block POTTED_ORANGE_ALLIUM = registerBlock("potted_orange_allium", false,
            new FlowerPotBlock(ORANGE_ALLIUM, AbstractBlock.Settings.copy(POTTED_ORANGE_ALLIUM)));

    public static final Block PINK_ALLIUM = registerBlock("pink_allium",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(PINK_ALLIUM)));
    public static final Block POTTED_PINK_ALLIUM = registerBlock("potted_pink_allium", false,
            new FlowerPotBlock(PINK_ALLIUM, AbstractBlock.Settings.copy(POTTED_PINK_ALLIUM)));

    public static final Block RED_ALLIUM = registerBlock("red_allium",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(RED_ALLIUM)));
    public static final Block POTTED_RED_ALLIUM = registerBlock("potted_red_allium", false,
            new FlowerPotBlock(RED_ALLIUM, AbstractBlock.Settings.copy(POTTED_RED_ALLIUM)));

    public static final Block WHITE_ALLIUM = registerBlock("white_allium",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(WHITE_ALLIUM)));
    public static final Block POTTED_WHITE_ALLIUM = registerBlock("potted_white_allium", false,
            new FlowerPotBlock(WHITE_ALLIUM, AbstractBlock.Settings.copy(POTTED_WHITE_ALLIUM)));

    public static final Block YELLOW_ALLIUM = registerBlock("yellow_allium",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(YELLOW_ALLIUM)));
    public static final Block POTTED_YELLOW_ALLIUM = registerBlock("potted_yellow_allium", false,
            new FlowerPotBlock(YELLOW_ALLIUM, AbstractBlock.Settings.copy(POTTED_YELLOW_ALLIUM)));

// torchflower

    public static final Block BLACK_TORCHFLOWER = registerBlock("black_torchflower",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(BLACK_TORCHFLOWER)));
    public static final Block POTTED_BLACK_TORCHFLOWER = registerBlock("potted_black_torchflower", false,
            new FlowerPotBlock(BLACK_TORCHFLOWER, AbstractBlock.Settings.copy(POTTED_BLACK_TORCHFLOWER)));

    public static final Block BLUE_TORCHFLOWER = registerBlock("blue_torchflower",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(BLUE_TORCHFLOWER)));
    public static final Block POTTED_BLUE_TORCHFLOWER = registerBlock("potted_blue_torchflower", false,
            new FlowerPotBlock(BLUE_TORCHFLOWER, AbstractBlock.Settings.copy(POTTED_BLUE_TORCHFLOWER)));

    public static final Block CYAN_TORCHFLOWER = registerBlock("cyan_torchflower",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(CYAN_TORCHFLOWER)));
    public static final Block POTTED_CYAN_TORCHFLOWER = registerBlock("potted_cyan_torchflower", false,
            new FlowerPotBlock(CYAN_TORCHFLOWER, AbstractBlock.Settings.copy(POTTED_CYAN_TORCHFLOWER)));

    public static final Block LILAC_TORCHFLOWER = registerBlock("lilac_torchflower",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(LILAC_TORCHFLOWER)));
    public static final Block POTTED_LILAC_TORCHFLOWER = registerBlock("potted_lilac_torchflower", false,
            new FlowerPotBlock(LILAC_TORCHFLOWER, AbstractBlock.Settings.copy(POTTED_LILAC_TORCHFLOWER)));

    public static final Block MAGENTA_TORCHFLOWER = registerBlock("magenta_torchflower",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(MAGENTA_TORCHFLOWER)));
    public static final Block POTTED_MAGENTA_TORCHFLOWER = registerBlock("potted_magenta_torchflower", false,
            new FlowerPotBlock(MAGENTA_TORCHFLOWER, AbstractBlock.Settings.copy(POTTED_MAGENTA_TORCHFLOWER)));

    public static final Block ORANGE_TORCHFLOWER = registerBlock("orange_torchflower",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(ORANGE_TORCHFLOWER)));
    public static final Block POTTED_ORANGE_TORCHFLOWER = registerBlock("potted_orange_torchflower", false,
            new FlowerPotBlock(ORANGE_TORCHFLOWER, AbstractBlock.Settings.copy(POTTED_ORANGE_TORCHFLOWER)));

    public static final Block PINK_TORCHFLOWER = registerBlock("pink_torchflower",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(PINK_TORCHFLOWER)));
    public static final Block POTTED_PINK_TORCHFLOWER = registerBlock("potted_pink_torchflower", false,
            new FlowerPotBlock(PINK_TORCHFLOWER, AbstractBlock.Settings.copy(POTTED_PINK_TORCHFLOWER)));

    public static final Block RED_TORCHFLOWER = registerBlock("red_torchflower",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(RED_TORCHFLOWER)));
    public static final Block POTTED_RED_TORCHFLOWER = registerBlock("potted_red_torchflower", false,
            new FlowerPotBlock(RED_TORCHFLOWER, AbstractBlock.Settings.copy(POTTED_RED_TORCHFLOWER)));

    public static final Block WHITE_TORCHFLOWER = registerBlock("white_torchflower",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(WHITE_TORCHFLOWER)));
    public static final Block POTTED_WHITE_TORCHFLOWER = registerBlock("potted_white_torchflower", false,
            new FlowerPotBlock(WHITE_TORCHFLOWER, AbstractBlock.Settings.copy(POTTED_WHITE_TORCHFLOWER)));

    public static final Block YELLOW_TORCHFLOWER = registerBlock("yellow_torchflower",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(YELLOW_TORCHFLOWER)));
    public static final Block POTTED_YELLOW_TORCHFLOWER = registerBlock("potted_yellow_torchflower", false,
            new FlowerPotBlock(YELLOW_TORCHFLOWER, AbstractBlock.Settings.copy(POTTED_YELLOW_TORCHFLOWER)));


// pitcher plant

    public static final Block BLACK_PITCHER_PLANT = registerBlock("black_pitcher_plant",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(BLACK_PITCHER_PLANT)));
    public static final Block POTTED_BLACK_PITCHER_PLANT = registerBlock("potted_black_pitcher_plant", false,
            new FlowerPotBlock(BLACK_PITCHER_PLANT, AbstractBlock.Settings.copy(POTTED_BLACK_PITCHER_PLANT)));

    public static final Block BLUE_PITCHER_PLANT = registerBlock("blue_pitcher_plant",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(BLUE_PITCHER_PLANT)));
    public static final Block POTTED_BLUE_PITCHER_PLANT = registerBlock("potted_blue_pitcher_plant", false,
            new FlowerPotBlock(BLUE_PITCHER_PLANT, AbstractBlock.Settings.copy(POTTED_BLUE_PITCHER_PLANT)));

    public static final Block CYAN_PITCHER_PLANT = registerBlock("cyan_pitcher_plant",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(CYAN_PITCHER_PLANT)));
    public static final Block POTTED_CYAN_PITCHER_PLANT = registerBlock("potted_cyan_pitcher_plant", false,
            new FlowerPotBlock(CYAN_PITCHER_PLANT, AbstractBlock.Settings.copy(POTTED_CYAN_PITCHER_PLANT)));

    public static final Block LILAC_PITCHER_PLANT = registerBlock("lilac_pitcher_plant",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(LILAC_PITCHER_PLANT)));
    public static final Block POTTED_LILAC_PITCHER_PLANT = registerBlock("potted_lilac_pitcher_plant", false,
            new FlowerPotBlock(LILAC_PITCHER_PLANT, AbstractBlock.Settings.copy(POTTED_LILAC_PITCHER_PLANT)));

    public static final Block MAGENTA_PITCHER_PLANT = registerBlock("magenta_pitcher_plant",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(MAGENTA_PITCHER_PLANT)));
    public static final Block POTTED_MAGENTA_PITCHER_PLANT = registerBlock("potted_magenta_pitcher_plant", false,
            new FlowerPotBlock(MAGENTA_PITCHER_PLANT, AbstractBlock.Settings.copy(POTTED_MAGENTA_PITCHER_PLANT)));

    public static final Block ORANGE_PITCHER_PLANT = registerBlock("orange_pitcher_plant",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(ORANGE_PITCHER_PLANT)));
    public static final Block POTTED_ORANGE_PITCHER_PLANT = registerBlock("potted_orange_pitcher_plant", false,
            new FlowerPotBlock(ORANGE_PITCHER_PLANT, AbstractBlock.Settings.copy(POTTED_ORANGE_PITCHER_PLANT)));

    public static final Block PINK_PITCHER_PLANT = registerBlock("pink_pitcher_plant",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(PINK_PITCHER_PLANT)));
    public static final Block POTTED_PINK_PITCHER_PLANT = registerBlock("potted_pink_pitcher_plant", false,
            new FlowerPotBlock(PINK_PITCHER_PLANT, AbstractBlock.Settings.copy(POTTED_PINK_PITCHER_PLANT)));

    public static final Block RED_PITCHER_PLANT = registerBlock("red_pitcher_plant",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(RED_PITCHER_PLANT)));
    public static final Block POTTED_RED_PITCHER_PLANT = registerBlock("potted_red_pitcher_plant", false,
            new FlowerPotBlock(RED_PITCHER_PLANT, AbstractBlock.Settings.copy(POTTED_RED_PITCHER_PLANT)));

    public static final Block WHITE_PITCHER_PLANT = registerBlock("white_pitcher_plant",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(WHITE_PITCHER_PLANT)));
    public static final Block POTTED_WHITE_PITCHER_PLANT = registerBlock("potted_white_pitcher_plant", false,
            new FlowerPotBlock(WHITE_PITCHER_PLANT, AbstractBlock.Settings.copy(POTTED_WHITE_PITCHER_PLANT)));

    public static final Block YELLOW_PITCHER_PLANT = registerBlock("yellow_pitcher_plant",
            new FlowerBlock(StatusEffects.WEAKNESS, 9, AbstractBlock.Settings.copy(YELLOW_PITCHER_PLANT)));
    public static final Block POTTED_YELLOW_PITCHER_PLANT = registerBlock("potted_yellow_pitcher_plant", false,
            new FlowerPotBlock(YELLOW_PITCHER_PLANT, AbstractBlock.Settings.copy(POTTED_YELLOW_PITCHER_PLANT)));
}
