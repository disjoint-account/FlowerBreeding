package net.flowerbreeding;

import net.flowerbreeding.blockentities.flowerbed.FBFlowerbedBlock;
import net.flowerbreeding.blockentities.planter.PlanterBlock;
import net.flowerbreeding.blockentities.vase.VaseBlock;
import net.flowerbreeding.botanytable.BotanyTableBlock;
import net.flowerbreeding.eyeblossoms.*;
import net.flowerbreeding.world.feature.FBConfiguredFeatures;
import net.flowerbreeding.world.feature.tree.FBSaplingGenerators;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.core.particles.ColorParticleOption;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.Holder;
import net.minecraft.world.item.DyeColor;
import net.minecraft.resources.Identifier;

import java.util.function.Function;

import static net.minecraft.world.level.block.Blocks.*;

public class FBBlocks {

    public static final Block BOTANY_TABLE = registerBlock("botany_table", BotanyTableBlock::new, BlockBehaviour.Properties.ofFullCopy(CRAFTING_TABLE));

    // magenta flowers

    public static final Block MAGENTA_TULIP = registerFlowerBlock("magenta_tulip", MobEffects.WEAKNESS, 7, RED_TULIP);
    public static final Block POTTED_MAGENTA_TULIP = registerFlowerPotBlock("potted_magenta_tulip", MAGENTA_TULIP, Blocks.POTTED_RED_TULIP);
    public static final Block MAGENTA_WITHER_ROSE = registerWitherRoseBlock("magenta_wither_rose");
    public static final Block POTTED_MAGENTA_WITHER_ROSE = registerFlowerPotBlock("potted_magenta_wither_rose", MAGENTA_WITHER_ROSE, Blocks.POTTED_WITHER_ROSE);
    public static final Block MAGENTA_SUNFLOWER = registerBlock("magenta_sunflower", TallFlowerBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.SUNFLOWER));
    public static final Block MAGENTA_PEONY = registerBlock("magenta_peony", TallFlowerBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.PEONY));
    public static final Block MAGENTA_LILAC = registerBlock("magenta_lilac", TallFlowerBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.LILAC));
    public static final Block MAGENTA_ROSE_BUSH = registerBlock("magenta_rose_bush", TallFlowerBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.ROSE_BUSH));
    public static final Block MAGENTA_POPPY = registerFlowerBlock("magenta_poppy", MobEffects.NIGHT_VISION, 5, Blocks.POPPY);
    public static final Block POTTED_MAGENTA_POPPY = registerFlowerPotBlock("potted_magenta_poppy", MAGENTA_POPPY, Blocks.POTTED_POPPY);
    public static final Block MAGENTA_ORCHID = registerFlowerBlock("magenta_orchid", MobEffects.SATURATION, 0.35f, Blocks.BLUE_ORCHID);
    public static final Block POTTED_MAGENTA_ORCHID = registerFlowerPotBlock("potted_magenta_orchid", MAGENTA_ORCHID, Blocks.POTTED_BLUE_ORCHID);
    public static final Block MAGENTA_LILY = registerFlowerBlock("magenta_lily", MobEffects.POISON, 11, LILY_OF_THE_VALLEY);
    public static final Block POTTED_MAGENTA_LILY = registerFlowerPotBlock("potted_magenta_lily", MAGENTA_LILY, POTTED_LILY_OF_THE_VALLEY);
    public static final Block MAGENTA_DANDELION = registerFlowerBlock("magenta_dandelion", MobEffects.WEAKNESS, 7, Blocks.DANDELION);
    public static final Block POTTED_MAGENTA_DANDELION = registerFlowerPotBlock("potted_magenta_dandelion", MAGENTA_DANDELION, Blocks.POTTED_DANDELION);
    public static final Block MAGENTA_DAISY = registerFlowerBlock("magenta_daisy", MobEffects.REGENERATION, 7, OXEYE_DAISY);
    public static final Block POTTED_MAGENTA_DAISY = registerFlowerPotBlock("potted_magenta_daisy", MAGENTA_DAISY, POTTED_OXEYE_DAISY);
    public static final Block MAGENTA_CORNFLOWER = registerFlowerBlock("magenta_cornflower", MobEffects.JUMP_BOOST, 5, Blocks.CORNFLOWER);
    public static final Block POTTED_MAGENTA_CORNFLOWER = registerFlowerPotBlock("potted_magenta_cornflower", MAGENTA_CORNFLOWER, Blocks.POTTED_CORNFLOWER);
    public static final Block OPEN_MAGENTA_EYEBLOSSOM = registerBlock("open_magenta_eyeblossom", (settings) -> new MagentaEyeblossomBlock(settings, MagentaEyeblossomBlock.MagentaEyeblossomState.OPEN), BlockBehaviour.Properties.ofFullCopy(OPEN_EYEBLOSSOM).mapColor(DyeColor.MAGENTA));
    public static final Block CLOSED_MAGENTA_EYEBLOSSOM = registerBlock("closed_magenta_eyeblossom", (settings) -> new MagentaEyeblossomBlock(settings, MagentaEyeblossomBlock.MagentaEyeblossomState.CLOSED), BlockBehaviour.Properties.ofFullCopy(CLOSED_EYEBLOSSOM));
    public static final Block POTTED_OPEN_MAGENTA_EYEBLOSSOM = registerMagentaEyeblossomFlowerPotBlock("potted_open_magenta_eyeblossom", OPEN_MAGENTA_EYEBLOSSOM, POTTED_OPEN_EYEBLOSSOM);
    public static final Block POTTED_CLOSED_MAGENTA_EYEBLOSSOM = registerMagentaEyeblossomFlowerPotBlock("potted_closed_magenta_eyeblossom", CLOSED_MAGENTA_EYEBLOSSOM, POTTED_CLOSED_EYEBLOSSOM);
    public static final Block MAGENTA_AZURE_BLUET = registerFlowerBlock("magenta_azure_bluet", MobEffects.BLINDNESS, 11, Blocks.AZURE_BLUET);
    public static final Block POTTED_MAGENTA_AZURE_BLUET = registerFlowerPotBlock("potted_magenta_azure_bluet", MAGENTA_AZURE_BLUET, Blocks.POTTED_AZURE_BLUET);
    public static final Block MAGENTA_TORCHFLOWER = registerFlowerBlock("magenta_torchflower", MobEffects.NIGHT_VISION, 5, Blocks.TORCHFLOWER);
    public static final Block POTTED_MAGENTA_TORCHFLOWER = registerFlowerPotBlock("potted_magenta_torchflower", MAGENTA_TORCHFLOWER, Blocks.POTTED_TORCHFLOWER);
    public static final Block MAGENTA_PITCHER_PLANT = registerBlock("magenta_pitcher_plant", TallFlowerBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.PITCHER_PLANT));
    public static final Block MAGENTA_PETALS = registerBlock("magenta_petals", FlowerBedBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_PETALS).mapColor(DyeColor.MAGENTA));
    public static final Block MAGENTA_WILDFLOWERS = registerBlock("magenta_wildflowers", FlowerBedBlock::new, BlockBehaviour.Properties.ofFullCopy(WILDFLOWERS).mapColor(DyeColor.MAGENTA));
    public static final Block MAGENTA_CACTUS_FLOWER = registerBlock("magenta_cactus_flower", CactusFlowerBlock::new, BlockBehaviour.Properties.ofFullCopy(CACTUS_FLOWER).mapColor(DyeColor.MAGENTA));
    public static final Block MAGENTA_SPORE_BLOSSOM = registerBlock("magenta_spore_blossom", SporeBlossomBlock::new, BlockBehaviour.Properties.ofFullCopy(SPORE_BLOSSOM).mapColor(DyeColor.MAGENTA));
    public static final Block MAGENTA_FLOWERING_AZALEA = registerBlock("magenta_flowering_azalea", (settings) -> new FBAzaleaBlock(FBSaplingGenerators.MAGENTA_AZALEA, settings), BlockBehaviour.Properties.ofFullCopy(FLOWERING_AZALEA));
    public static final Block POTTED_MAGENTA_FLOWERING_AZALEA_BUSH = registerFlowerPotBlock("potted_magenta_flowering_azalea_bush", MAGENTA_FLOWERING_AZALEA, POTTED_FLOWERING_AZALEA);
    public static final Block MAGENTA_FLOWERING_AZALEA_LEAVES = registerBlock("magenta_flowering_azalea_leaves", settings -> new UntintedParticleLeavesBlock(0.01F, ColorParticleOption.create(ParticleTypes.TINTED_LEAVES, -9399763), settings), BlockBehaviour.Properties.ofFullCopy(FLOWERING_AZALEA_LEAVES));

    // blue flowers

    public static final Block BLUE_ALLIUM = registerFlowerBlock("blue_allium", MobEffects.FIRE_RESISTANCE, 3, ALLIUM);
    public static final Block POTTED_BLUE_ALLIUM = registerFlowerPotBlock("potted_blue_allium", BLUE_ALLIUM, Blocks.POTTED_ALLIUM);
    public static final Block BLUE_TULIP = registerFlowerBlock("blue_tulip", MobEffects.WEAKNESS, 7, RED_TULIP);
    public static final Block POTTED_BLUE_TULIP = registerFlowerPotBlock("potted_blue_tulip", BLUE_TULIP, Blocks.POTTED_RED_TULIP);
    public static final Block BLUE_WITHER_ROSE = registerWitherRoseBlock("blue_wither_rose");
    public static final Block POTTED_BLUE_WITHER_ROSE = registerFlowerPotBlock("potted_blue_wither_rose", BLUE_WITHER_ROSE, Blocks.POTTED_WITHER_ROSE);
    public static final Block BLUE_SUNFLOWER = registerBlock("blue_sunflower", TallFlowerBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.SUNFLOWER));
    public static final Block BLUE_PEONY = registerBlock("blue_peony", TallFlowerBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.PEONY));
    public static final Block BLUE_LILAC = registerBlock("blue_lilac", TallFlowerBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.LILAC));
    public static final Block BLUE_ROSE_BUSH = registerBlock("blue_rose_bush", TallFlowerBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.ROSE_BUSH));
    public static final Block BLUE_POPPY = registerFlowerBlock("blue_poppy", MobEffects.NIGHT_VISION, 5, Blocks.POPPY);
    public static final Block POTTED_BLUE_POPPY = registerFlowerPotBlock("potted_blue_poppy", BLUE_POPPY, Blocks.POTTED_POPPY);
    public static final Block BLUE_ORCHID = registerFlowerBlock("blue_orchid", MobEffects.SATURATION, 0.35f, Blocks.BLUE_ORCHID);
    public static final Block POTTED_BLUE_ORCHID = registerFlowerPotBlock("potted_blue_orchid", BLUE_ORCHID, Blocks.POTTED_BLUE_ORCHID);
    public static final Block BLUE_LILY = registerFlowerBlock("blue_lily", MobEffects.POISON, 11, LILY_OF_THE_VALLEY);
    public static final Block POTTED_BLUE_LILY = registerFlowerPotBlock("potted_blue_lily", BLUE_LILY, POTTED_LILY_OF_THE_VALLEY);
    public static final Block BLUE_DANDELION = registerFlowerBlock("blue_dandelion", MobEffects.WEAKNESS, 7, Blocks.DANDELION);
    public static final Block POTTED_BLUE_DANDELION = registerFlowerPotBlock("potted_blue_dandelion", BLUE_DANDELION, Blocks.POTTED_DANDELION);
    public static final Block BLUE_DAISY = registerFlowerBlock("blue_daisy", MobEffects.REGENERATION, 7, OXEYE_DAISY);
    public static final Block POTTED_BLUE_DAISY = registerFlowerPotBlock("potted_blue_daisy", BLUE_DAISY, POTTED_OXEYE_DAISY);
    public static final Block OPEN_BLUE_EYEBLOSSOM = registerBlock("open_blue_eyeblossom", (settings) -> new BlueEyeblossomBlock(settings, BlueEyeblossomBlock.BlueEyeblossomState.OPEN), BlockBehaviour.Properties.ofFullCopy(OPEN_EYEBLOSSOM).mapColor(DyeColor.BLUE));
    public static final Block CLOSED_BLUE_EYEBLOSSOM = registerBlock("closed_blue_eyeblossom", (settings) -> new BlueEyeblossomBlock(settings, BlueEyeblossomBlock.BlueEyeblossomState.CLOSED), BlockBehaviour.Properties.ofFullCopy(CLOSED_EYEBLOSSOM));
    public static final Block POTTED_OPEN_BLUE_EYEBLOSSOM = registerBlueEyeblossomFlowerPotBlock("potted_open_blue_eyeblossom", OPEN_BLUE_EYEBLOSSOM, POTTED_OPEN_EYEBLOSSOM);
    public static final Block POTTED_CLOSED_BLUE_EYEBLOSSOM = registerBlueEyeblossomFlowerPotBlock("potted_closed_blue_eyeblossom", CLOSED_BLUE_EYEBLOSSOM, POTTED_CLOSED_EYEBLOSSOM);
    public static final Block BLUE_AZURE_BLUET = registerFlowerBlock("blue_azure_bluet", MobEffects.BLINDNESS, 11, Blocks.AZURE_BLUET);
    public static final Block POTTED_BLUE_AZURE_BLUET = registerFlowerPotBlock("potted_blue_azure_bluet", BLUE_AZURE_BLUET, Blocks.POTTED_AZURE_BLUET);
    public static final Block BLUE_TORCHFLOWER = registerFlowerBlock("blue_torchflower", MobEffects.NIGHT_VISION, 5, Blocks.TORCHFLOWER);
    public static final Block POTTED_BLUE_TORCHFLOWER = registerFlowerPotBlock("potted_blue_torchflower", BLUE_TORCHFLOWER, Blocks.POTTED_TORCHFLOWER);
    public static final Block BLUE_PITCHER_PLANT = registerBlock("blue_pitcher_plant", TallFlowerBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.PITCHER_PLANT));
    public static final Block BLUE_PETALS = registerBlock("blue_petals", FlowerBedBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_PETALS).mapColor(DyeColor.BLUE));
    public static final Block BLUE_WILDFLOWERS = registerBlock("blue_wildflowers", FlowerBedBlock::new, BlockBehaviour.Properties.ofFullCopy(WILDFLOWERS).mapColor(DyeColor.BLUE));
    public static final Block BLUE_CACTUS_FLOWER = registerBlock("blue_cactus_flower", CactusFlowerBlock::new, BlockBehaviour.Properties.ofFullCopy(CACTUS_FLOWER).mapColor(DyeColor.BLUE));
    public static final Block BLUE_SPORE_BLOSSOM = registerBlock("blue_spore_blossom", SporeBlossomBlock::new, BlockBehaviour.Properties.ofFullCopy(SPORE_BLOSSOM).mapColor(DyeColor.BLUE));
    public static final Block BLUE_FLOWERING_AZALEA = registerBlock("blue_flowering_azalea", (settings) -> new FBAzaleaBlock(FBSaplingGenerators.BLUE_AZALEA, settings), BlockBehaviour.Properties.ofFullCopy(FLOWERING_AZALEA));
    public static final Block POTTED_BLUE_FLOWERING_AZALEA_BUSH = registerFlowerPotBlock("potted_blue_flowering_azalea_bush", BLUE_FLOWERING_AZALEA, POTTED_FLOWERING_AZALEA);
    public static final Block BLUE_FLOWERING_AZALEA_LEAVES = registerBlock("blue_flowering_azalea_leaves", settings -> new UntintedParticleLeavesBlock(0.01F, ColorParticleOption.create(ParticleTypes.TINTED_LEAVES, -9399763), settings), BlockBehaviour.Properties.ofFullCopy(FLOWERING_AZALEA_LEAVES));

    // white flowers

    public static final Block WHITE_ALLIUM = registerFlowerBlock("white_allium", MobEffects.FIRE_RESISTANCE, 3, ALLIUM);
    public static final Block POTTED_WHITE_ALLIUM = registerFlowerPotBlock("potted_white_allium", WHITE_ALLIUM, Blocks.POTTED_ALLIUM);
    public static final Block WHITE_WITHER_ROSE = registerWitherRoseBlock("white_wither_rose");
    public static final Block POTTED_WHITE_WITHER_ROSE = registerFlowerPotBlock("potted_white_wither_rose", WHITE_WITHER_ROSE, Blocks.POTTED_WITHER_ROSE);
    public static final Block WHITE_SUNFLOWER = registerBlock("white_sunflower", TallFlowerBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.SUNFLOWER));
    public static final Block WHITE_PEONY = registerBlock("white_peony", TallFlowerBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.PEONY));
    public static final Block WHITE_LILAC = registerBlock("white_lilac", TallFlowerBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.LILAC));
    public static final Block WHITE_ROSE_BUSH = registerBlock("white_rose_bush", TallFlowerBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.ROSE_BUSH));
    public static final Block WHITE_POPPY = registerFlowerBlock("white_poppy", MobEffects.NIGHT_VISION, 5, Blocks.POPPY);
    public static final Block POTTED_WHITE_POPPY = registerFlowerPotBlock("potted_white_poppy", WHITE_POPPY, Blocks.POTTED_POPPY);
    public static final Block WHITE_ORCHID = registerFlowerBlock("white_orchid", MobEffects.SATURATION, 0.35f, Blocks.BLUE_ORCHID);
    public static final Block POTTED_WHITE_ORCHID = registerFlowerPotBlock("potted_white_orchid", WHITE_ORCHID, Blocks.POTTED_BLUE_ORCHID);
    public static final Block WHITE_DANDELION = registerFlowerBlock("white_dandelion", MobEffects.WEAKNESS, 7, Blocks.DANDELION);
    public static final Block POTTED_WHITE_DANDELION = registerFlowerPotBlock("potted_white_dandelion", WHITE_DANDELION, Blocks.POTTED_DANDELION);
    public static final Block WHITE_CORNFLOWER = registerFlowerBlock("white_cornflower", MobEffects.JUMP_BOOST, 5, Blocks.CORNFLOWER);
    public static final Block OPEN_WHITE_EYEBLOSSOM = registerBlock("open_white_eyeblossom", (settings) -> new WhiteEyeblossomBlock(settings, WhiteEyeblossomBlock.WhiteEyeblossomState.OPEN), BlockBehaviour.Properties.ofFullCopy(OPEN_EYEBLOSSOM).mapColor(DyeColor.WHITE));
    public static final Block CLOSED_WHITE_EYEBLOSSOM = registerBlock("closed_white_eyeblossom", (settings) -> new WhiteEyeblossomBlock(settings, WhiteEyeblossomBlock.WhiteEyeblossomState.CLOSED), BlockBehaviour.Properties.ofFullCopy(CLOSED_EYEBLOSSOM));
    public static final Block POTTED_OPEN_WHITE_EYEBLOSSOM = registerWhiteEyeblossomFlowerPotBlock("potted_open_white_eyeblossom", OPEN_WHITE_EYEBLOSSOM, POTTED_OPEN_EYEBLOSSOM);
    public static final Block POTTED_CLOSED_WHITE_EYEBLOSSOM = registerWhiteEyeblossomFlowerPotBlock("potted_closed_white_eyeblossom", CLOSED_WHITE_EYEBLOSSOM, POTTED_CLOSED_EYEBLOSSOM);
    public static final Block POTTED_WHITE_CORNFLOWER = registerFlowerPotBlock("potted_white_cornflower", WHITE_CORNFLOWER, Blocks.POTTED_CORNFLOWER);
    public static final Block WHITE_TORCHFLOWER = registerFlowerBlock("white_torchflower", MobEffects.NIGHT_VISION, 5, Blocks.TORCHFLOWER);
    public static final Block POTTED_WHITE_TORCHFLOWER = registerFlowerPotBlock("potted_white_torchflower", WHITE_TORCHFLOWER, Blocks.POTTED_TORCHFLOWER);
    public static final Block WHITE_PITCHER_PLANT = registerBlock("white_pitcher_plant", TallFlowerBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.PITCHER_PLANT));
    public static final Block WHITE_PETALS = registerBlock("white_petals", FlowerBedBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_PETALS).mapColor(DyeColor.WHITE));
    public static final Block WHITE_WILDFLOWERS = registerBlock("white_wildflowers", FlowerBedBlock::new, BlockBehaviour.Properties.ofFullCopy(WILDFLOWERS).mapColor(DyeColor.WHITE));
    public static final Block WHITE_CACTUS_FLOWER = registerBlock("white_cactus_flower", CactusFlowerBlock::new, BlockBehaviour.Properties.ofFullCopy(CACTUS_FLOWER).mapColor(DyeColor.WHITE));
    public static final Block WHITE_SPORE_BLOSSOM = registerBlock("white_spore_blossom", SporeBlossomBlock::new, BlockBehaviour.Properties.ofFullCopy(SPORE_BLOSSOM).mapColor(DyeColor.WHITE));
    public static final Block WHITE_FLOWERING_AZALEA = registerBlock("white_flowering_azalea", (settings) -> new FBAzaleaBlock(FBSaplingGenerators.WHITE_AZALEA, settings), BlockBehaviour.Properties.ofFullCopy(FLOWERING_AZALEA));
    public static final Block POTTED_WHITE_FLOWERING_AZALEA_BUSH = registerFlowerPotBlock("potted_white_flowering_azalea_bush", WHITE_FLOWERING_AZALEA, POTTED_FLOWERING_AZALEA);
    public static final Block WHITE_FLOWERING_AZALEA_LEAVES = registerBlock("white_flowering_azalea_leaves", settings -> new UntintedParticleLeavesBlock(0.01F, ColorParticleOption.create(ParticleTypes.TINTED_LEAVES, -9399763), settings), BlockBehaviour.Properties.ofFullCopy(FLOWERING_AZALEA_LEAVES));

    // orange flowers

    public static final Block ORANGE_ALLIUM = registerFlowerBlock("orange_allium", MobEffects.FIRE_RESISTANCE, 3, ALLIUM);
    public static final Block POTTED_ORANGE_ALLIUM = registerFlowerPotBlock("potted_orange_allium", ORANGE_ALLIUM, Blocks.POTTED_ALLIUM);
    public static final Block ORANGE_WITHER_ROSE = registerWitherRoseBlock("orange_wither_rose");
    public static final Block POTTED_ORANGE_WITHER_ROSE = registerFlowerPotBlock("potted_orange_wither_rose", ORANGE_WITHER_ROSE, Blocks.POTTED_WITHER_ROSE);
    public static final Block ORANGE_SUNFLOWER = registerBlock("orange_sunflower", TallFlowerBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.SUNFLOWER));
    public static final Block ORANGE_PEONY = registerBlock("orange_peony", TallFlowerBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.PEONY));
    public static final Block ORANGE_LILAC = registerBlock("orange_lilac", TallFlowerBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.LILAC));
    public static final Block ORANGE_ROSE_BUSH = registerBlock("orange_rose_bush", TallFlowerBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.ROSE_BUSH));
    public static final Block ORANGE_POPPY = registerFlowerBlock("orange_poppy", MobEffects.NIGHT_VISION, 5, Blocks.POPPY);
    public static final Block POTTED_ORANGE_POPPY = registerFlowerPotBlock("potted_orange_poppy", ORANGE_POPPY, Blocks.POTTED_POPPY);
    public static final Block ORANGE_ORCHID = registerFlowerBlock("orange_orchid", MobEffects.SATURATION, 0.35f, Blocks.BLUE_ORCHID);
    public static final Block POTTED_ORANGE_ORCHID = registerFlowerPotBlock("potted_orange_orchid", ORANGE_ORCHID, Blocks.POTTED_BLUE_ORCHID);
    public static final Block ORANGE_LILY = registerFlowerBlock("orange_lily", MobEffects.POISON, 11, LILY_OF_THE_VALLEY);
    public static final Block POTTED_ORANGE_LILY = registerFlowerPotBlock("potted_orange_lily", ORANGE_LILY, POTTED_LILY_OF_THE_VALLEY);
    public static final Block ORANGE_DANDELION = registerFlowerBlock("orange_dandelion", MobEffects.WEAKNESS, 7, Blocks.DANDELION);
    public static final Block POTTED_ORANGE_DANDELION = registerFlowerPotBlock("potted_orange_dandelion", ORANGE_DANDELION, Blocks.POTTED_DANDELION);
    public static final Block ORANGE_DAISY = registerFlowerBlock("orange_daisy", MobEffects.REGENERATION, 7, OXEYE_DAISY);
    public static final Block POTTED_ORANGE_DAISY = registerFlowerPotBlock("potted_orange_daisy", ORANGE_DAISY, POTTED_OXEYE_DAISY);
    public static final Block ORANGE_CORNFLOWER = registerFlowerBlock("orange_cornflower", MobEffects.JUMP_BOOST, 5, Blocks.CORNFLOWER);
    public static final Block POTTED_ORANGE_CORNFLOWER = registerFlowerPotBlock("potted_orange_cornflower", ORANGE_CORNFLOWER, Blocks.POTTED_CORNFLOWER);
    public static final Block ORANGE_AZURE_BLUET = registerFlowerBlock("orange_azure_bluet", MobEffects.BLINDNESS, 11, Blocks.AZURE_BLUET);
    public static final Block POTTED_ORANGE_AZURE_BLUET = registerFlowerPotBlock("potted_orange_azure_bluet", ORANGE_AZURE_BLUET, Blocks.POTTED_AZURE_BLUET);
    public static final Block ORANGE_PITCHER_PLANT = registerBlock("orange_pitcher_plant", TallFlowerBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.PITCHER_PLANT));
    public static final Block ORANGE_PETALS = registerBlock("orange_petals", FlowerBedBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_PETALS).mapColor(DyeColor.ORANGE));
    public static final Block ORANGE_WILDFLOWERS = registerBlock("orange_wildflowers", FlowerBedBlock::new, BlockBehaviour.Properties.ofFullCopy(WILDFLOWERS).mapColor(DyeColor.ORANGE));
    public static final Block ORANGE_CACTUS_FLOWER = registerBlock("orange_cactus_flower", CactusFlowerBlock::new, BlockBehaviour.Properties.ofFullCopy(CACTUS_FLOWER).mapColor(DyeColor.ORANGE));
    public static final Block ORANGE_SPORE_BLOSSOM = registerBlock("orange_spore_blossom", SporeBlossomBlock::new, BlockBehaviour.Properties.ofFullCopy(SPORE_BLOSSOM).mapColor(DyeColor.ORANGE));
    public static final Block ORANGE_FLOWERING_AZALEA = registerBlock("orange_flowering_azalea", (settings) -> new FBAzaleaBlock(FBSaplingGenerators.ORANGE_AZALEA, settings), BlockBehaviour.Properties.ofFullCopy(FLOWERING_AZALEA));
    public static final Block POTTED_ORANGE_FLOWERING_AZALEA_BUSH = registerFlowerPotBlock("potted_orange_flowering_azalea_bush", ORANGE_FLOWERING_AZALEA, POTTED_FLOWERING_AZALEA);
    public static final Block ORANGE_FLOWERING_AZALEA_LEAVES = registerBlock("orange_flowering_azalea_leaves", settings -> new UntintedParticleLeavesBlock(0.01F, ColorParticleOption.create(ParticleTypes.TINTED_LEAVES, -9399763), settings), BlockBehaviour.Properties.ofFullCopy(FLOWERING_AZALEA_LEAVES));

    // red flowers

    public static final Block RED_ALLIUM = registerFlowerBlock("red_allium", MobEffects.FIRE_RESISTANCE, 3, ALLIUM);
    public static final Block POTTED_RED_ALLIUM = registerFlowerPotBlock("potted_red_allium", RED_ALLIUM, Blocks.POTTED_ALLIUM);
    public static final Block RED_WITHER_ROSE = registerWitherRoseBlock("red_wither_rose");
    public static final Block POTTED_RED_WITHER_ROSE = registerFlowerPotBlock("potted_red_wither_rose", RED_WITHER_ROSE, Blocks.POTTED_WITHER_ROSE);
    public static final Block RED_SUNFLOWER = registerBlock("red_sunflower", TallFlowerBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.SUNFLOWER));
    public static final Block RED_PEONY = registerBlock("red_peony", TallFlowerBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.PEONY));
    public static final Block RED_LILAC = registerBlock("red_lilac", TallFlowerBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.LILAC));
    public static final Block RED_ORCHID = registerFlowerBlock("red_orchid", MobEffects.SATURATION, 0.35f, Blocks.BLUE_ORCHID);
    public static final Block POTTED_RED_ORCHID = registerFlowerPotBlock("potted_red_orchid", RED_ORCHID, Blocks.POTTED_BLUE_ORCHID);
    public static final Block RED_LILY = registerFlowerBlock("red_lily", MobEffects.POISON, 11, LILY_OF_THE_VALLEY);
    public static final Block POTTED_RED_LILY = registerFlowerPotBlock("potted_red_lily", RED_LILY, POTTED_LILY_OF_THE_VALLEY);
    public static final Block RED_DANDELION = registerFlowerBlock("red_dandelion", MobEffects.WEAKNESS, 7, Blocks.DANDELION);
    public static final Block POTTED_RED_DANDELION = registerFlowerPotBlock("potted_red_dandelion", RED_DANDELION, Blocks.POTTED_DANDELION);
    public static final Block RED_DAISY = registerFlowerBlock("red_daisy", MobEffects.REGENERATION, 7, OXEYE_DAISY);
    public static final Block POTTED_RED_DAISY = registerFlowerPotBlock("potted_red_daisy", RED_DAISY, POTTED_OXEYE_DAISY);
    public static final Block RED_CORNFLOWER = registerFlowerBlock("red_cornflower", MobEffects.JUMP_BOOST, 5, Blocks.CORNFLOWER);
    public static final Block POTTED_RED_CORNFLOWER = registerFlowerPotBlock("potted_red_cornflower", RED_CORNFLOWER, Blocks.POTTED_CORNFLOWER);
    public static final Block OPEN_RED_EYEBLOSSOM = registerBlock("open_red_eyeblossom", (settings) -> new RedEyeblossomBlock(settings, RedEyeblossomBlock.RedEyeblossomState.OPEN), BlockBehaviour.Properties.ofFullCopy(OPEN_EYEBLOSSOM).mapColor(DyeColor.RED));
    public static final Block CLOSED_RED_EYEBLOSSOM = registerBlock("closed_red_eyeblossom", (settings) -> new RedEyeblossomBlock(settings, RedEyeblossomBlock.RedEyeblossomState.CLOSED), BlockBehaviour.Properties.ofFullCopy(CLOSED_EYEBLOSSOM));
    public static final Block POTTED_OPEN_RED_EYEBLOSSOM = registerRedEyeblossomFlowerPotBlock("potted_open_red_eyeblossom", OPEN_RED_EYEBLOSSOM, POTTED_OPEN_EYEBLOSSOM);
    public static final Block POTTED_CLOSED_RED_EYEBLOSSOM = registerRedEyeblossomFlowerPotBlock("potted_closed_red_eyeblossom", CLOSED_RED_EYEBLOSSOM, POTTED_CLOSED_EYEBLOSSOM);
    public static final Block RED_AZURE_BLUET = registerFlowerBlock("red_azure_bluet", MobEffects.BLINDNESS, 11, Blocks.AZURE_BLUET);
    public static final Block POTTED_RED_AZURE_BLUET = registerFlowerPotBlock("potted_red_azure_bluet", RED_AZURE_BLUET, Blocks.POTTED_AZURE_BLUET);
    public static final Block RED_TORCHFLOWER = registerFlowerBlock("red_torchflower", MobEffects.NIGHT_VISION, 5, Blocks.TORCHFLOWER);
    public static final Block POTTED_RED_TORCHFLOWER = registerFlowerPotBlock("potted_red_torchflower", RED_TORCHFLOWER, Blocks.POTTED_TORCHFLOWER);
    public static final Block RED_PITCHER_PLANT = registerBlock("red_pitcher_plant", TallFlowerBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.PITCHER_PLANT));
    public static final Block RED_PETALS = registerBlock("red_petals", FlowerBedBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_PETALS).mapColor(DyeColor.RED));
    public static final Block RED_WILDFLOWERS = registerBlock("red_wildflowers", FlowerBedBlock::new, BlockBehaviour.Properties.ofFullCopy(WILDFLOWERS).mapColor(DyeColor.RED));
    public static final Block RED_CACTUS_FLOWER = registerBlock("red_cactus_flower", CactusFlowerBlock::new, BlockBehaviour.Properties.ofFullCopy(CACTUS_FLOWER).mapColor(DyeColor.RED));
    public static final Block RED_SPORE_BLOSSOM = registerBlock("red_spore_blossom", SporeBlossomBlock::new, BlockBehaviour.Properties.ofFullCopy(SPORE_BLOSSOM).mapColor(DyeColor.RED));
    public static final Block RED_FLOWERING_AZALEA = registerBlock("red_flowering_azalea", (settings) -> new FBAzaleaBlock(FBSaplingGenerators.RED_AZALEA, settings), BlockBehaviour.Properties.ofFullCopy(FLOWERING_AZALEA));
    public static final Block POTTED_RED_FLOWERING_AZALEA_BUSH = registerFlowerPotBlock("potted_red_flowering_azalea_bush", RED_FLOWERING_AZALEA, POTTED_FLOWERING_AZALEA);
    public static final Block RED_FLOWERING_AZALEA_LEAVES = registerBlock("red_flowering_azalea_leaves", settings -> new UntintedParticleLeavesBlock(0.01F, ColorParticleOption.create(ParticleTypes.TINTED_LEAVES, -9399763), settings), BlockBehaviour.Properties.ofFullCopy(FLOWERING_AZALEA_LEAVES));

    // yellow flowers

    public static final Block YELLOW_ALLIUM = registerFlowerBlock("yellow_allium", MobEffects.FIRE_RESISTANCE, 3, ALLIUM);
    public static final Block POTTED_YELLOW_ALLIUM = registerFlowerPotBlock("potted_yellow_allium", YELLOW_ALLIUM, Blocks.POTTED_ALLIUM);
    public static final Block YELLOW_TULIP = registerFlowerBlock("yellow_tulip", MobEffects.WEAKNESS, 7, RED_TULIP);
    public static final Block POTTED_YELLOW_TULIP = registerFlowerPotBlock("potted_yellow_tulip", YELLOW_TULIP, Blocks.POTTED_RED_TULIP);
    public static final Block YELLOW_WITHER_ROSE = registerWitherRoseBlock("yellow_wither_rose");
    public static final Block POTTED_YELLOW_WITHER_ROSE = registerFlowerPotBlock("potted_yellow_wither_rose", YELLOW_WITHER_ROSE, Blocks.POTTED_WITHER_ROSE);
    public static final Block YELLOW_PEONY = registerBlock("yellow_peony", TallFlowerBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.PEONY));
    public static final Block YELLOW_LILAC = registerBlock("yellow_lilac", TallFlowerBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.LILAC));
    public static final Block YELLOW_ROSE_BUSH = registerBlock("yellow_rose_bush", TallFlowerBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.ROSE_BUSH));
    public static final Block YELLOW_POPPY = registerFlowerBlock("yellow_poppy", MobEffects.NIGHT_VISION, 5, Blocks.POPPY);
    public static final Block POTTED_YELLOW_POPPY = registerFlowerPotBlock("potted_yellow_poppy", YELLOW_POPPY, Blocks.POTTED_POPPY);
    public static final Block YELLOW_ORCHID = registerFlowerBlock("yellow_orchid", MobEffects.SATURATION, 0.35f, Blocks.BLUE_ORCHID);
    public static final Block POTTED_YELLOW_ORCHID = registerFlowerPotBlock("potted_yellow_orchid", YELLOW_ORCHID, Blocks.POTTED_BLUE_ORCHID);
    public static final Block YELLOW_LILY = registerFlowerBlock("yellow_lily", MobEffects.POISON, 11, LILY_OF_THE_VALLEY);
    public static final Block POTTED_YELLOW_LILY = registerFlowerPotBlock("potted_yellow_lily", YELLOW_LILY, POTTED_LILY_OF_THE_VALLEY);
    public static final Block YELLOW_DAISY = registerFlowerBlock("yellow_daisy", MobEffects.REGENERATION, 7, OXEYE_DAISY);
    public static final Block POTTED_YELLOW_DAISY = registerFlowerPotBlock("potted_yellow_daisy", YELLOW_DAISY, POTTED_OXEYE_DAISY);
    public static final Block YELLOW_CORNFLOWER = registerFlowerBlock("yellow_cornflower", MobEffects.JUMP_BOOST, 5, Blocks.CORNFLOWER);
    public static final Block POTTED_YELLOW_CORNFLOWER = registerFlowerPotBlock("potted_yellow_cornflower", YELLOW_CORNFLOWER, Blocks.POTTED_CORNFLOWER);
    public static final Block OPEN_YELLOW_EYEBLOSSOM = registerBlock("open_yellow_eyeblossom", (settings) -> new YellowEyeblossomBlock(settings, YellowEyeblossomBlock.YellowEyeblossomState.OPEN), BlockBehaviour.Properties.ofFullCopy(OPEN_EYEBLOSSOM).mapColor(DyeColor.YELLOW));
    public static final Block CLOSED_YELLOW_EYEBLOSSOM = registerBlock("closed_yellow_eyeblossom", (settings) -> new YellowEyeblossomBlock(settings, YellowEyeblossomBlock.YellowEyeblossomState.CLOSED), BlockBehaviour.Properties.ofFullCopy(CLOSED_EYEBLOSSOM));
    public static final Block POTTED_OPEN_YELLOW_EYEBLOSSOM = registerYellowEyeblossomFlowerPotBlock("potted_open_yellow_eyeblossom", OPEN_YELLOW_EYEBLOSSOM, POTTED_OPEN_EYEBLOSSOM);
    public static final Block POTTED_CLOSED_YELLOW_EYEBLOSSOM = registerYellowEyeblossomFlowerPotBlock("potted_closed_yellow_eyeblossom", CLOSED_YELLOW_EYEBLOSSOM, POTTED_CLOSED_EYEBLOSSOM);
    public static final Block YELLOW_AZURE_BLUET = registerFlowerBlock("yellow_azure_bluet", MobEffects.BLINDNESS, 11, Blocks.AZURE_BLUET);
    public static final Block POTTED_YELLOW_AZURE_BLUET = registerFlowerPotBlock("potted_yellow_azure_bluet", YELLOW_AZURE_BLUET, Blocks.POTTED_AZURE_BLUET);
    public static final Block YELLOW_TORCHFLOWER = registerFlowerBlock("yellow_torchflower", MobEffects.NIGHT_VISION, 5, Blocks.TORCHFLOWER);
    public static final Block POTTED_YELLOW_TORCHFLOWER = registerFlowerPotBlock("potted_yellow_torchflower", YELLOW_TORCHFLOWER, Blocks.POTTED_TORCHFLOWER);
    public static final Block YELLOW_PITCHER_PLANT = registerBlock("yellow_pitcher_plant", TallFlowerBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.PITCHER_PLANT));
    public static final Block YELLOW_PETALS = registerBlock("yellow_petals", FlowerBedBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_PETALS).mapColor(DyeColor.YELLOW));
    public static final Block YELLOW_CACTUS_FLOWER = registerBlock("yellow_cactus_flower", CactusFlowerBlock::new, BlockBehaviour.Properties.ofFullCopy(CACTUS_FLOWER).mapColor(DyeColor.YELLOW));
    public static final Block YELLOW_SPORE_BLOSSOM = registerBlock("yellow_spore_blossom", SporeBlossomBlock::new, BlockBehaviour.Properties.ofFullCopy(SPORE_BLOSSOM).mapColor(DyeColor.YELLOW));
    public static final Block YELLOW_FLOWERING_AZALEA = registerBlock("yellow_flowering_azalea", (settings) -> new FBAzaleaBlock(FBSaplingGenerators.YELLOW_AZALEA, settings), BlockBehaviour.Properties.ofFullCopy(FLOWERING_AZALEA));
    public static final Block POTTED_YELLOW_FLOWERING_AZALEA_BUSH = registerFlowerPotBlock("potted_yellow_flowering_azalea_bush", YELLOW_FLOWERING_AZALEA, POTTED_FLOWERING_AZALEA);
    public static final Block YELLOW_FLOWERING_AZALEA_LEAVES = registerBlock("yellow_flowering_azalea_leaves", settings -> new UntintedParticleLeavesBlock(0.01F, ColorParticleOption.create(ParticleTypes.TINTED_LEAVES, -9399763), settings), BlockBehaviour.Properties.ofFullCopy(FLOWERING_AZALEA_LEAVES));

    // light blue flowers

    public static final Block LIGHT_BLUE_ALLIUM = registerFlowerBlock("light_blue_allium", MobEffects.FIRE_RESISTANCE, 3, ALLIUM);
    public static final Block POTTED_LIGHT_BLUE_ALLIUM = registerFlowerPotBlock("potted_light_blue_allium", LIGHT_BLUE_ALLIUM, Blocks.POTTED_ALLIUM);
    public static final Block LIGHT_BLUE_TULIP = registerFlowerBlock("light_blue_tulip", MobEffects.WEAKNESS, 7, RED_TULIP);
    public static final Block POTTED_LIGHT_BLUE_TULIP = registerFlowerPotBlock("potted_light_blue_tulip", LIGHT_BLUE_TULIP, Blocks.POTTED_RED_TULIP);
    public static final Block LIGHT_BLUE_WITHER_ROSE = registerWitherRoseBlock("light_blue_wither_rose");
    public static final Block POTTED_LIGHT_BLUE_WITHER_ROSE = registerFlowerPotBlock("potted_light_blue_wither_rose", LIGHT_BLUE_WITHER_ROSE, Blocks.POTTED_WITHER_ROSE);
    public static final Block LIGHT_BLUE_SUNFLOWER = registerBlock("light_blue_sunflower", TallFlowerBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.SUNFLOWER));
    public static final Block LIGHT_BLUE_PEONY = registerBlock("light_blue_peony", TallFlowerBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.PEONY));
    public static final Block LIGHT_BLUE_LILAC = registerBlock("light_blue_lilac", TallFlowerBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.LILAC));
    public static final Block LIGHT_BLUE_ROSE_BUSH = registerBlock("light_blue_rose_bush", TallFlowerBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.ROSE_BUSH));
    public static final Block LIGHT_BLUE_POPPY = registerFlowerBlock("light_blue_poppy", MobEffects.NIGHT_VISION, 5, Blocks.POPPY);
    public static final Block POTTED_LIGHT_BLUE_POPPY = registerFlowerPotBlock("potted_light_blue_poppy", LIGHT_BLUE_POPPY, Blocks.POTTED_POPPY);
    public static final Block LIGHT_BLUE_LILY = registerFlowerBlock("light_blue_lily", MobEffects.POISON, 11, LILY_OF_THE_VALLEY);
    public static final Block POTTED_LIGHT_BLUE_LILY = registerFlowerPotBlock("potted_light_blue_lily", LIGHT_BLUE_LILY, POTTED_LILY_OF_THE_VALLEY);
    public static final Block LIGHT_BLUE_DANDELION = registerFlowerBlock("light_blue_dandelion", MobEffects.WEAKNESS, 7, Blocks.DANDELION);
    public static final Block POTTED_LIGHT_BLUE_DANDELION = registerFlowerPotBlock("potted_light_blue_dandelion", LIGHT_BLUE_DANDELION, Blocks.POTTED_DANDELION);
    public static final Block LIGHT_BLUE_DAISY = registerFlowerBlock("light_blue_daisy", MobEffects.REGENERATION, 7, OXEYE_DAISY);
    public static final Block POTTED_LIGHT_BLUE_DAISY = registerFlowerPotBlock("potted_light_blue_daisy", LIGHT_BLUE_DAISY, POTTED_OXEYE_DAISY);
    public static final Block LIGHT_BLUE_CORNFLOWER = registerFlowerBlock("light_blue_cornflower", MobEffects.JUMP_BOOST, 5, Blocks.CORNFLOWER);
    public static final Block POTTED_LIGHT_BLUE_CORNFLOWER = registerFlowerPotBlock("potted_light_blue_cornflower", LIGHT_BLUE_CORNFLOWER, Blocks.POTTED_CORNFLOWER);
    public static final Block OPEN_LIGHT_BLUE_EYEBLOSSOM = registerBlock("open_light_blue_eyeblossom", (settings) -> new LightBlueEyeblossomBlock(settings, LightBlueEyeblossomBlock.LightBlueEyeblossomState.OPEN), BlockBehaviour.Properties.ofFullCopy(OPEN_EYEBLOSSOM).mapColor(DyeColor.LIGHT_BLUE));
    public static final Block CLOSED_LIGHT_BLUE_EYEBLOSSOM = registerBlock("closed_light_blue_eyeblossom", (settings) -> new LightBlueEyeblossomBlock(settings, LightBlueEyeblossomBlock.LightBlueEyeblossomState.CLOSED), BlockBehaviour.Properties.ofFullCopy(CLOSED_EYEBLOSSOM));
    public static final Block POTTED_OPEN_LIGHT_BLUE_EYEBLOSSOM = registerLightBlueEyeblossomFlowerPotBlock("potted_open_light_blue_eyeblossom", OPEN_LIGHT_BLUE_EYEBLOSSOM, POTTED_OPEN_EYEBLOSSOM);
    public static final Block POTTED_CLOSED_LIGHT_BLUE_EYEBLOSSOM = registerLightBlueEyeblossomFlowerPotBlock("potted_closed_light_blue_eyeblossom", CLOSED_LIGHT_BLUE_EYEBLOSSOM, POTTED_CLOSED_EYEBLOSSOM);
    public static final Block LIGHT_BLUE_AZURE_BLUET = registerFlowerBlock("light_blue_azure_bluet", MobEffects.BLINDNESS, 11, Blocks.AZURE_BLUET);
    public static final Block POTTED_LIGHT_BLUE_AZURE_BLUET = registerFlowerPotBlock("potted_light_blue_azure_bluet", LIGHT_BLUE_AZURE_BLUET, Blocks.POTTED_AZURE_BLUET);
    public static final Block LIGHT_BLUE_TORCHFLOWER = registerFlowerBlock("light_blue_torchflower", MobEffects.NIGHT_VISION, 5, Blocks.TORCHFLOWER);
    public static final Block POTTED_LIGHT_BLUE_TORCHFLOWER = registerFlowerPotBlock("potted_light_blue_torchflower", LIGHT_BLUE_TORCHFLOWER, Blocks.POTTED_TORCHFLOWER);
    public static final Block LIGHT_BLUE_PITCHER_PLANT = registerBlock("light_blue_pitcher_plant", TallFlowerBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.PITCHER_PLANT));
    public static final Block LIGHT_BLUE_PETALS = registerBlock("light_blue_petals", FlowerBedBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_PETALS).mapColor(DyeColor.LIGHT_BLUE));
    public static final Block LIGHT_BLUE_WILDFLOWERS = registerBlock("light_blue_wildflowers", FlowerBedBlock::new, BlockBehaviour.Properties.ofFullCopy(WILDFLOWERS).mapColor(DyeColor.LIGHT_BLUE));
    public static final Block LIGHT_BLUE_CACTUS_FLOWER = registerBlock("light_blue_cactus_flower", CactusFlowerBlock::new, BlockBehaviour.Properties.ofFullCopy(CACTUS_FLOWER).mapColor(DyeColor.LIGHT_BLUE));
    public static final Block LIGHT_BLUE_SPORE_BLOSSOM = registerBlock("light_blue_spore_blossom", SporeBlossomBlock::new, BlockBehaviour.Properties.ofFullCopy(SPORE_BLOSSOM).mapColor(DyeColor.LIGHT_BLUE));
    public static final Block LIGHT_BLUE_FLOWERING_AZALEA = registerBlock("light_blue_flowering_azalea", (settings) -> new FBAzaleaBlock(FBSaplingGenerators.LIGHT_BLUE_AZALEA, settings), BlockBehaviour.Properties.ofFullCopy(FLOWERING_AZALEA));
    public static final Block POTTED_LIGHT_BLUE_FLOWERING_AZALEA_BUSH = registerFlowerPotBlock("potted_light_blue_flowering_azalea_bush", LIGHT_BLUE_FLOWERING_AZALEA, POTTED_FLOWERING_AZALEA);
    public static final Block LIGHT_BLUE_FLOWERING_AZALEA_LEAVES = registerBlock("light_blue_flowering_azalea_leaves", settings -> new UntintedParticleLeavesBlock(0.01F, ColorParticleOption.create(ParticleTypes.TINTED_LEAVES, -9399763), settings), BlockBehaviour.Properties.ofFullCopy(FLOWERING_AZALEA_LEAVES));

    // pink flowers

    public static final Block PINK_ALLIUM = registerFlowerBlock("pink_allium", MobEffects.FIRE_RESISTANCE, 3, ALLIUM);
    public static final Block POTTED_PINK_ALLIUM = registerFlowerPotBlock("potted_pink_allium", PINK_ALLIUM, Blocks.POTTED_ALLIUM);
    public static final Block PINK_WITHER_ROSE = registerWitherRoseBlock("pink_wither_rose");
    public static final Block POTTED_PINK_WITHER_ROSE = registerFlowerPotBlock("potted_pink_wither_rose", PINK_WITHER_ROSE, Blocks.POTTED_WITHER_ROSE);
    public static final Block PINK_SUNFLOWER = registerBlock("pink_sunflower", TallFlowerBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.SUNFLOWER));
    public static final Block PINK_ROSE_BUSH = registerBlock("pink_rose_bush", TallFlowerBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.ROSE_BUSH));
    public static final Block PINK_POPPY = registerFlowerBlock("pink_poppy", MobEffects.NIGHT_VISION, 5, Blocks.POPPY);
    public static final Block POTTED_PINK_POPPY = registerFlowerPotBlock("potted_pink_poppy", PINK_POPPY, Blocks.POTTED_POPPY);
    public static final Block PINK_ORCHID = registerFlowerBlock("pink_orchid", MobEffects.SATURATION, 0.35f, Blocks.BLUE_ORCHID);
    public static final Block POTTED_PINK_ORCHID = registerFlowerPotBlock("potted_pink_orchid", PINK_ORCHID, Blocks.POTTED_BLUE_ORCHID);
    public static final Block PINK_LILY = registerFlowerBlock("pink_lily", MobEffects.POISON, 11, LILY_OF_THE_VALLEY);
    public static final Block POTTED_PINK_LILY = registerFlowerPotBlock("potted_pink_lily", PINK_LILY, POTTED_LILY_OF_THE_VALLEY);
    public static final Block PINK_DANDELION = registerFlowerBlock("pink_dandelion", MobEffects.WEAKNESS, 7, Blocks.DANDELION);
    public static final Block POTTED_PINK_DANDELION = registerFlowerPotBlock("potted_pink_dandelion", PINK_DANDELION, Blocks.POTTED_DANDELION);
    public static final Block PINK_DAISY = registerFlowerBlock("pink_daisy", MobEffects.REGENERATION, 7, OXEYE_DAISY);
    public static final Block POTTED_PINK_DAISY = registerFlowerPotBlock("potted_pink_daisy", PINK_DAISY, POTTED_OXEYE_DAISY);
    public static final Block PINK_CORNFLOWER = registerFlowerBlock("pink_cornflower", MobEffects.JUMP_BOOST, 5, Blocks.CORNFLOWER);
    public static final Block POTTED_PINK_CORNFLOWER = registerFlowerPotBlock("potted_pink_cornflower", PINK_CORNFLOWER, Blocks.POTTED_CORNFLOWER);
    public static final Block OPEN_PINK_EYEBLOSSOM = registerBlock("open_pink_eyeblossom", (settings) -> new PinkEyeblossomBlock(settings, PinkEyeblossomBlock.PinkEyeblossomState.OPEN), BlockBehaviour.Properties.ofFullCopy(OPEN_EYEBLOSSOM).mapColor(DyeColor.PINK));
    public static final Block CLOSED_PINK_EYEBLOSSOM = registerBlock("closed_pink_eyeblossom", (settings) -> new PinkEyeblossomBlock(settings, PinkEyeblossomBlock.PinkEyeblossomState.CLOSED), BlockBehaviour.Properties.ofFullCopy(CLOSED_EYEBLOSSOM));
    public static final Block POTTED_OPEN_PINK_EYEBLOSSOM = registerPinkEyeblossomFlowerPotBlock("potted_open_pink_eyeblossom", OPEN_PINK_EYEBLOSSOM, POTTED_OPEN_EYEBLOSSOM);
    public static final Block POTTED_CLOSED_PINK_EYEBLOSSOM = registerPinkEyeblossomFlowerPotBlock("potted_closed_pink_eyeblossom", CLOSED_PINK_EYEBLOSSOM, POTTED_CLOSED_EYEBLOSSOM);
    public static final Block PINK_AZURE_BLUET = registerFlowerBlock("pink_azure_bluet", MobEffects.BLINDNESS, 11, Blocks.AZURE_BLUET);
    public static final Block POTTED_PINK_AZURE_BLUET = registerFlowerPotBlock("potted_pink_azure_bluet", PINK_AZURE_BLUET, Blocks.POTTED_AZURE_BLUET);
    public static final Block PINK_TORCHFLOWER = registerFlowerBlock("pink_torchflower", MobEffects.NIGHT_VISION, 5, Blocks.TORCHFLOWER);
    public static final Block POTTED_PINK_TORCHFLOWER = registerFlowerPotBlock("potted_pink_torchflower", PINK_TORCHFLOWER, Blocks.POTTED_TORCHFLOWER);
    public static final Block PINK_PITCHER_PLANT = registerBlock("pink_pitcher_plant", TallFlowerBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.PITCHER_PLANT));
    public static final Block PINK_WILDFLOWERS = registerBlock("pink_wildflowers", FlowerBedBlock::new, BlockBehaviour.Properties.ofFullCopy(WILDFLOWERS).mapColor(DyeColor.PINK));

    // black flowers

    public static final Block BLACK_ALLIUM = registerFlowerBlock("black_allium", MobEffects.FIRE_RESISTANCE, 3, ALLIUM);
    public static final Block POTTED_BLACK_ALLIUM = registerFlowerPotBlock("potted_black_allium", BLACK_ALLIUM, Blocks.POTTED_ALLIUM);
    public static final Block BLACK_TULIP = registerFlowerBlock("black_tulip", MobEffects.WEAKNESS, 7, RED_TULIP);
    public static final Block POTTED_BLACK_TULIP = registerFlowerPotBlock("potted_black_tulip", BLACK_TULIP, Blocks.POTTED_RED_TULIP);
    public static final Block BLACK_SUNFLOWER = registerBlock("black_sunflower", TallFlowerBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.SUNFLOWER));
    public static final Block BLACK_PEONY = registerBlock("black_peony", TallFlowerBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.PEONY));
    public static final Block BLACK_LILAC = registerBlock("black_lilac", TallFlowerBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.LILAC));
    public static final Block BLACK_ROSE_BUSH = registerBlock("black_rose_bush", TallFlowerBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.ROSE_BUSH));
    public static final Block BLACK_POPPY = registerFlowerBlock("black_poppy", MobEffects.NIGHT_VISION, 5, Blocks.POPPY);
    public static final Block POTTED_BLACK_POPPY = registerFlowerPotBlock("potted_black_poppy", BLACK_POPPY, Blocks.POTTED_POPPY);
    public static final Block BLACK_ORCHID = registerFlowerBlock("black_orchid", MobEffects.SATURATION, 0.35f, Blocks.BLUE_ORCHID);
    public static final Block POTTED_BLACK_ORCHID = registerFlowerPotBlock("potted_black_orchid", BLACK_ORCHID, Blocks.POTTED_BLUE_ORCHID);
    public static final Block BLACK_LILY = registerFlowerBlock("black_lily", MobEffects.POISON, 11, LILY_OF_THE_VALLEY);
    public static final Block POTTED_BLACK_LILY = registerFlowerPotBlock("potted_black_lily", BLACK_LILY, POTTED_LILY_OF_THE_VALLEY);
    public static final Block BLACK_DANDELION = registerFlowerBlock("black_dandelion", MobEffects.WEAKNESS, 7, Blocks.DANDELION);
    public static final Block POTTED_BLACK_DANDELION = registerFlowerPotBlock("potted_black_dandelion", BLACK_DANDELION, Blocks.POTTED_DANDELION);
    public static final Block BLACK_DAISY = registerFlowerBlock("black_daisy", MobEffects.REGENERATION, 7, OXEYE_DAISY);
    public static final Block POTTED_BLACK_DAISY = registerFlowerPotBlock("potted_black_daisy", BLACK_DAISY, POTTED_OXEYE_DAISY);
    public static final Block BLACK_CORNFLOWER = registerFlowerBlock("black_cornflower", MobEffects.JUMP_BOOST, 5, Blocks.CORNFLOWER);
    public static final Block POTTED_BLACK_CORNFLOWER = registerFlowerPotBlock("potted_black_cornflower", BLACK_CORNFLOWER, Blocks.POTTED_CORNFLOWER);
    public static final Block OPEN_BLACK_EYEBLOSSOM = registerBlock("open_black_eyeblossom", (settings) -> new BlackEyeblossomBlock(settings, BlackEyeblossomBlock.BlackEyeblossomState.OPEN), BlockBehaviour.Properties.ofFullCopy(OPEN_EYEBLOSSOM).mapColor(DyeColor.BLACK));
    public static final Block CLOSED_BLACK_EYEBLOSSOM = registerBlock("closed_black_eyeblossom", (settings) -> new BlackEyeblossomBlock(settings, BlackEyeblossomBlock.BlackEyeblossomState.CLOSED), BlockBehaviour.Properties.ofFullCopy(CLOSED_EYEBLOSSOM));
    public static final Block POTTED_OPEN_BLACK_EYEBLOSSOM = registerBlackEyeblossomFlowerPotBlock("potted_open_black_eyeblossom", OPEN_BLACK_EYEBLOSSOM, POTTED_OPEN_EYEBLOSSOM);
    public static final Block POTTED_CLOSED_BLACK_EYEBLOSSOM = registerBlackEyeblossomFlowerPotBlock("potted_closed_black_eyeblossom", CLOSED_BLACK_EYEBLOSSOM, POTTED_CLOSED_EYEBLOSSOM);
    public static final Block BLACK_AZURE_BLUET = registerFlowerBlock("black_azure_bluet", MobEffects.BLINDNESS, 11, Blocks.AZURE_BLUET);
    public static final Block POTTED_BLACK_AZURE_BLUET = registerFlowerPotBlock("potted_black_azure_bluet", BLACK_AZURE_BLUET, Blocks.POTTED_AZURE_BLUET);
    public static final Block BLACK_TORCHFLOWER = registerFlowerBlock("black_torchflower", MobEffects.NIGHT_VISION, 5, Blocks.TORCHFLOWER);
    public static final Block POTTED_BLACK_TORCHFLOWER = registerFlowerPotBlock("potted_black_torchflower", BLACK_TORCHFLOWER, Blocks.POTTED_TORCHFLOWER);
    public static final Block BLACK_PITCHER_PLANT = registerBlock("black_pitcher_plant", TallFlowerBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.PITCHER_PLANT));
    public static final Block BLACK_PETALS = registerBlock("black_petals", FlowerBedBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_PETALS).mapColor(DyeColor.BLACK));
    public static final Block BLACK_WILDFLOWERS = registerBlock("black_wildflowers", FlowerBedBlock::new, BlockBehaviour.Properties.ofFullCopy(WILDFLOWERS).mapColor(DyeColor.BLACK));
    public static final Block BLACK_CACTUS_FLOWER = registerBlock("black_cactus_flower", CactusFlowerBlock::new, BlockBehaviour.Properties.ofFullCopy(CACTUS_FLOWER).mapColor(DyeColor.BLACK));
    public static final Block BLACK_SPORE_BLOSSOM = registerBlock("black_spore_blossom", SporeBlossomBlock::new, BlockBehaviour.Properties.ofFullCopy(SPORE_BLOSSOM).mapColor(DyeColor.BLACK));
    public static final Block BLACK_FLOWERING_AZALEA = registerBlock("black_flowering_azalea", (settings) -> new FBAzaleaBlock(FBSaplingGenerators.BLACK_AZALEA, settings), BlockBehaviour.Properties.ofFullCopy(FLOWERING_AZALEA));
    public static final Block POTTED_BLACK_FLOWERING_AZALEA_BUSH = registerFlowerPotBlock("potted_black_flowering_azalea_bush", BLACK_FLOWERING_AZALEA, POTTED_FLOWERING_AZALEA);
    public static final Block BLACK_FLOWERING_AZALEA_LEAVES = registerBlock("black_flowering_azalea_leaves", settings -> new UntintedParticleLeavesBlock(0.01F, ColorParticleOption.create(ParticleTypes.TINTED_LEAVES, -9399763), settings), BlockBehaviour.Properties.ofFullCopy(FLOWERING_AZALEA_LEAVES));

    // cyan flowers

    public static final Block CYAN_ALLIUM = registerFlowerBlock("cyan_allium", MobEffects.FIRE_RESISTANCE, 3, ALLIUM);
    public static final Block POTTED_CYAN_ALLIUM = registerFlowerPotBlock("potted_cyan_allium", CYAN_ALLIUM, Blocks.POTTED_ALLIUM);
    public static final Block CYAN_TULIP = registerFlowerBlock("cyan_tulip", MobEffects.WEAKNESS, 7, RED_TULIP);
    public static final Block POTTED_CYAN_TULIP = registerFlowerPotBlock("potted_cyan_tulip", CYAN_TULIP, Blocks.POTTED_RED_TULIP);
    public static final Block CYAN_WITHER_ROSE = registerWitherRoseBlock("cyan_wither_rose");
    public static final Block POTTED_CYAN_WITHER_ROSE = registerFlowerPotBlock("potted_cyan_wither_rose", CYAN_WITHER_ROSE, Blocks.POTTED_WITHER_ROSE);
    public static final Block CYAN_SUNFLOWER = registerBlock("cyan_sunflower", TallFlowerBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.SUNFLOWER));
    public static final Block CYAN_PEONY = registerBlock("cyan_peony", TallFlowerBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.PEONY));
    public static final Block CYAN_LILAC = registerBlock("cyan_lilac", TallFlowerBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.LILAC));
    public static final Block CYAN_ROSE_BUSH = registerBlock("cyan_rose_bush", TallFlowerBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.ROSE_BUSH));
    public static final Block CYAN_POPPY = registerFlowerBlock("cyan_poppy", MobEffects.NIGHT_VISION, 5, Blocks.POPPY);
    public static final Block POTTED_CYAN_POPPY = registerFlowerPotBlock("potted_cyan_poppy", CYAN_POPPY, Blocks.POTTED_POPPY);
    public static final Block CYAN_ORCHID = registerFlowerBlock("cyan_orchid", MobEffects.SATURATION, 0.35f, Blocks.BLUE_ORCHID);
    public static final Block POTTED_CYAN_ORCHID = registerFlowerPotBlock("potted_cyan_orchid", CYAN_ORCHID, Blocks.POTTED_BLUE_ORCHID);
    public static final Block CYAN_LILY = registerFlowerBlock("cyan_lily", MobEffects.POISON, 11, LILY_OF_THE_VALLEY);
    public static final Block POTTED_CYAN_LILY = registerFlowerPotBlock("potted_cyan_lily", CYAN_LILY, POTTED_LILY_OF_THE_VALLEY);
    public static final Block CYAN_DANDELION = registerFlowerBlock("cyan_dandelion", MobEffects.WEAKNESS, 7, Blocks.DANDELION);
    public static final Block POTTED_CYAN_DANDELION = registerFlowerPotBlock("potted_cyan_dandelion", CYAN_DANDELION, Blocks.POTTED_DANDELION);
    public static final Block CYAN_DAISY = registerFlowerBlock("cyan_daisy", MobEffects.REGENERATION, 7, OXEYE_DAISY);
    public static final Block POTTED_CYAN_DAISY = registerFlowerPotBlock("potted_cyan_daisy", CYAN_DAISY, POTTED_OXEYE_DAISY);
    public static final Block CYAN_CORNFLOWER = registerFlowerBlock("cyan_cornflower", MobEffects.JUMP_BOOST, 5, Blocks.CORNFLOWER);
    public static final Block POTTED_CYAN_CORNFLOWER = registerFlowerPotBlock("potted_cyan_cornflower", CYAN_CORNFLOWER, Blocks.POTTED_CORNFLOWER);
    public static final Block OPEN_CYAN_EYEBLOSSOM = registerBlock("open_cyan_eyeblossom", (settings) -> new CyanEyeblossomBlock(settings, CyanEyeblossomBlock.CyanEyeblossomState.OPEN), BlockBehaviour.Properties.ofFullCopy(OPEN_EYEBLOSSOM).mapColor(DyeColor.CYAN));
    public static final Block CLOSED_CYAN_EYEBLOSSOM = registerBlock("closed_cyan_eyeblossom", (settings) -> new CyanEyeblossomBlock(settings, CyanEyeblossomBlock.CyanEyeblossomState.CLOSED), BlockBehaviour.Properties.ofFullCopy(CLOSED_EYEBLOSSOM));
    public static final Block POTTED_OPEN_CYAN_EYEBLOSSOM = registerCyanEyeblossomFlowerPotBlock("potted_open_cyan_eyeblossom", OPEN_CYAN_EYEBLOSSOM, POTTED_OPEN_EYEBLOSSOM);
    public static final Block POTTED_CLOSED_CYAN_EYEBLOSSOM = registerCyanEyeblossomFlowerPotBlock("potted_closed_cyan_eyeblossom", CLOSED_CYAN_EYEBLOSSOM, POTTED_CLOSED_EYEBLOSSOM);
    public static final Block CYAN_AZURE_BLUET = registerFlowerBlock("cyan_azure_bluet", MobEffects.BLINDNESS, 11, Blocks.AZURE_BLUET);
    public static final Block POTTED_CYAN_AZURE_BLUET = registerFlowerPotBlock("potted_cyan_azure_bluet", CYAN_AZURE_BLUET, Blocks.POTTED_AZURE_BLUET);
    public static final Block CYAN_TORCHFLOWER = registerFlowerBlock("cyan_torchflower", MobEffects.NIGHT_VISION, 5, Blocks.TORCHFLOWER);
    public static final Block POTTED_CYAN_TORCHFLOWER = registerFlowerPotBlock("potted_cyan_torchflower", CYAN_TORCHFLOWER, Blocks.POTTED_TORCHFLOWER);
    public static final Block CYAN_PETALS = registerBlock("cyan_petals", FlowerBedBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_PETALS).mapColor(DyeColor.CYAN));
    public static final Block CYAN_WILDFLOWERS = registerBlock("cyan_wildflowers", FlowerBedBlock::new, BlockBehaviour.Properties.ofFullCopy(WILDFLOWERS).mapColor(DyeColor.CYAN));
    public static final Block CYAN_CACTUS_FLOWER = registerBlock("cyan_cactus_flower", CactusFlowerBlock::new, BlockBehaviour.Properties.ofFullCopy(CACTUS_FLOWER).mapColor(DyeColor.CYAN));
    public static final Block CYAN_SPORE_BLOSSOM = registerBlock("cyan_spore_blossom", SporeBlossomBlock::new, BlockBehaviour.Properties.ofFullCopy(SPORE_BLOSSOM).mapColor(DyeColor.CYAN));
    public static final Block CYAN_FLOWERING_AZALEA = registerBlock("cyan_flowering_azalea", (settings) -> new FBAzaleaBlock(FBSaplingGenerators.CYAN_AZALEA, settings), BlockBehaviour.Properties.ofFullCopy(FLOWERING_AZALEA));
    public static final Block POTTED_CYAN_FLOWERING_AZALEA_BUSH = registerFlowerPotBlock("potted_cyan_flowering_azalea_bush", CYAN_FLOWERING_AZALEA, POTTED_FLOWERING_AZALEA);
    public static final Block CYAN_FLOWERING_AZALEA_LEAVES = registerBlock("cyan_flowering_azalea_leaves", settings -> new UntintedParticleLeavesBlock(0.01F, ColorParticleOption.create(ParticleTypes.TINTED_LEAVES, -9399763), settings), BlockBehaviour.Properties.ofFullCopy(FLOWERING_AZALEA_LEAVES));

    //daffodils

    public static final Block MAGENTA_DAFFODIL = registerFlowerBlock("magenta_daffodil", MobEffects.SLOW_FALLING, 6, DANDELION);
    public static final Block POTTED_MAGENTA_DAFFODIL = registerFlowerPotBlock("potted_magenta_daffodil", MAGENTA_DAFFODIL, POTTED_DANDELION);
    public static final Block BLUE_DAFFODIL = registerFlowerBlock("blue_daffodil", MobEffects.SLOW_FALLING, 6, DANDELION);
    public static final Block POTTED_BLUE_DAFFODIL = registerFlowerPotBlock("potted_blue_daffodil", BLUE_DAFFODIL, POTTED_DANDELION);
    public static final Block WHITE_DAFFODIL = registerFlowerBlock("white_daffodil", MobEffects.SLOW_FALLING, 6, DANDELION);
    public static final Block POTTED_WHITE_DAFFODIL = registerFlowerPotBlock("potted_white_daffodil", WHITE_DAFFODIL, POTTED_DANDELION);
    public static final Block ORANGE_DAFFODIL = registerFlowerBlock("orange_daffodil", MobEffects.SLOW_FALLING, 6, DANDELION);
    public static final Block POTTED_ORANGE_DAFFODIL = registerFlowerPotBlock("potted_orange_daffodil", ORANGE_DAFFODIL, POTTED_DANDELION);
    public static final Block RED_DAFFODIL = registerFlowerBlock("red_daffodil", MobEffects.SLOW_FALLING, 6, DANDELION);
    public static final Block POTTED_RED_DAFFODIL = registerFlowerPotBlock("potted_red_daffodil", RED_DAFFODIL, POTTED_DANDELION);
    public static final Block YELLOW_DAFFODIL = registerFlowerBlock("yellow_daffodil", MobEffects.SLOW_FALLING, 6, DANDELION);
    public static final Block POTTED_YELLOW_DAFFODIL = registerFlowerPotBlock("potted_yellow_daffodil", YELLOW_DAFFODIL, POTTED_DANDELION);
    public static final Block LIGHT_BLUE_DAFFODIL = registerFlowerBlock("light_blue_daffodil", MobEffects.SLOW_FALLING, 6, DANDELION);
    public static final Block POTTED_LIGHT_BLUE_DAFFODIL = registerFlowerPotBlock("potted_light_blue_daffodil", LIGHT_BLUE_DAFFODIL, POTTED_DANDELION);
    public static final Block PINK_DAFFODIL = registerFlowerBlock("pink_daffodil", MobEffects.SLOW_FALLING, 6, DANDELION);
    public static final Block POTTED_PINK_DAFFODIL = registerFlowerPotBlock("potted_pink_daffodil", PINK_DAFFODIL, POTTED_DANDELION);
    public static final Block BLACK_DAFFODIL = registerFlowerBlock("black_daffodil", MobEffects.SLOW_FALLING, 6, DANDELION);
    public static final Block POTTED_BLACK_DAFFODIL = registerFlowerPotBlock("potted_black_daffodil", BLACK_DAFFODIL, POTTED_DANDELION);
    public static final Block CYAN_DAFFODIL = registerFlowerBlock("cyan_daffodil", MobEffects.SLOW_FALLING, 6, DANDELION);
    public static final Block POTTED_CYAN_DAFFODIL = registerFlowerPotBlock("potted_cyan_daffodil", CYAN_DAFFODIL, POTTED_DANDELION);

    //foxgloves

    public static final Block MAGENTA_FOXGLOVE = registerFlowerBlock("magenta_foxglove", MobEffects.INVISIBILITY, 10, DANDELION);
    public static final Block POTTED_MAGENTA_FOXGLOVE = registerFlowerPotBlock("potted_magenta_foxglove", MAGENTA_FOXGLOVE, POTTED_DANDELION);
    public static final Block BLUE_FOXGLOVE = registerFlowerBlock("blue_foxglove", MobEffects.INVISIBILITY, 10, DANDELION);
    public static final Block POTTED_BLUE_FOXGLOVE = registerFlowerPotBlock("potted_blue_foxglove", BLUE_FOXGLOVE, POTTED_DANDELION);
    public static final Block WHITE_FOXGLOVE = registerFlowerBlock("white_foxglove", MobEffects.INVISIBILITY, 10, DANDELION);
    public static final Block POTTED_WHITE_FOXGLOVE = registerFlowerPotBlock("potted_white_foxglove", WHITE_FOXGLOVE, POTTED_DANDELION);
    public static final Block ORANGE_FOXGLOVE = registerFlowerBlock("orange_foxglove", MobEffects.INVISIBILITY, 10, DANDELION);
    public static final Block POTTED_ORANGE_FOXGLOVE = registerFlowerPotBlock("potted_orange_foxglove", ORANGE_FOXGLOVE, POTTED_DANDELION);
    public static final Block RED_FOXGLOVE = registerFlowerBlock("red_foxglove", MobEffects.INVISIBILITY, 10, DANDELION);
    public static final Block POTTED_RED_FOXGLOVE = registerFlowerPotBlock("potted_red_foxglove", RED_FOXGLOVE, POTTED_DANDELION);
    public static final Block YELLOW_FOXGLOVE = registerFlowerBlock("yellow_foxglove", MobEffects.INVISIBILITY, 10, DANDELION);
    public static final Block POTTED_YELLOW_FOXGLOVE = registerFlowerPotBlock("potted_yellow_foxglove", YELLOW_FOXGLOVE, POTTED_DANDELION);
    public static final Block LIGHT_BLUE_FOXGLOVE = registerFlowerBlock("light_blue_foxglove", MobEffects.INVISIBILITY, 10, DANDELION);
    public static final Block POTTED_LIGHT_BLUE_FOXGLOVE = registerFlowerPotBlock("potted_light_blue_foxglove", LIGHT_BLUE_FOXGLOVE, POTTED_DANDELION);
    public static final Block PINK_FOXGLOVE = registerFlowerBlock("pink_foxglove", MobEffects.INVISIBILITY, 10, DANDELION);
    public static final Block POTTED_PINK_FOXGLOVE = registerFlowerPotBlock("potted_pink_foxglove", PINK_FOXGLOVE, POTTED_DANDELION);
    public static final Block BLACK_FOXGLOVE = registerFlowerBlock("black_foxglove", MobEffects.INVISIBILITY, 10, DANDELION);
    public static final Block POTTED_BLACK_FOXGLOVE = registerFlowerPotBlock("potted_black_foxglove", BLACK_FOXGLOVE, POTTED_DANDELION);
    public static final Block CYAN_FOXGLOVE = registerFlowerBlock("cyan_foxglove", MobEffects.INVISIBILITY, 10, DANDELION);
    public static final Block POTTED_CYAN_FOXGLOVE = registerFlowerPotBlock("potted_cyan_foxglove", CYAN_FOXGLOVE, POTTED_DANDELION);

    //hyacinths

    public static final Block MAGENTA_HYACINTH = registerFlowerBlock("magenta_hyacinth", MobEffects.JUMP_BOOST, 7, DANDELION);
    public static final Block POTTED_MAGENTA_HYACINTH = registerFlowerPotBlock("potted_magenta_hyacinth", MAGENTA_HYACINTH, POTTED_DANDELION);
    public static final Block BLUE_HYACINTH = registerFlowerBlock("blue_hyacinth", MobEffects.JUMP_BOOST, 7, DANDELION);
    public static final Block POTTED_BLUE_HYACINTH = registerFlowerPotBlock("potted_blue_hyacinth", BLUE_HYACINTH, POTTED_DANDELION);
    public static final Block WHITE_HYACINTH = registerFlowerBlock("white_hyacinth", MobEffects.JUMP_BOOST, 7, DANDELION);
    public static final Block POTTED_WHITE_HYACINTH = registerFlowerPotBlock("potted_white_hyacinth", WHITE_HYACINTH, POTTED_DANDELION);
    public static final Block ORANGE_HYACINTH = registerFlowerBlock("orange_hyacinth", MobEffects.JUMP_BOOST, 7, DANDELION);
    public static final Block POTTED_ORANGE_HYACINTH = registerFlowerPotBlock("potted_orange_hyacinth", ORANGE_HYACINTH, POTTED_DANDELION);
    public static final Block RED_HYACINTH = registerFlowerBlock("red_hyacinth", MobEffects.JUMP_BOOST, 7, DANDELION);
    public static final Block POTTED_RED_HYACINTH = registerFlowerPotBlock("potted_red_hyacinth", RED_HYACINTH, POTTED_DANDELION);
    public static final Block YELLOW_HYACINTH = registerFlowerBlock("yellow_hyacinth", MobEffects.JUMP_BOOST, 7, DANDELION);
    public static final Block POTTED_YELLOW_HYACINTH = registerFlowerPotBlock("potted_yellow_hyacinth", YELLOW_HYACINTH, POTTED_DANDELION);
    public static final Block LIGHT_BLUE_HYACINTH = registerFlowerBlock("light_blue_hyacinth", MobEffects.JUMP_BOOST, 7, DANDELION);
    public static final Block POTTED_LIGHT_BLUE_HYACINTH = registerFlowerPotBlock("potted_light_blue_hyacinth", LIGHT_BLUE_HYACINTH, POTTED_DANDELION);
    public static final Block PINK_HYACINTH = registerFlowerBlock("pink_hyacinth", MobEffects.JUMP_BOOST, 7, DANDELION);
    public static final Block POTTED_PINK_HYACINTH = registerFlowerPotBlock("potted_pink_hyacinth", PINK_HYACINTH, POTTED_DANDELION);
    public static final Block BLACK_HYACINTH = registerFlowerBlock("black_hyacinth", MobEffects.JUMP_BOOST, 7, DANDELION);
    public static final Block POTTED_BLACK_HYACINTH = registerFlowerPotBlock("potted_black_hyacinth", BLACK_HYACINTH, POTTED_DANDELION);
    public static final Block CYAN_HYACINTH = registerFlowerBlock("cyan_hyacinth", MobEffects.JUMP_BOOST, 7, DANDELION);
    public static final Block POTTED_CYAN_HYACINTH = registerFlowerPotBlock("potted_cyan_hyacinth", CYAN_HYACINTH, POTTED_DANDELION);

    //phloxes

    public static final Block MAGENTA_PHLOX = registerFlowerBlock("magenta_phlox", MobEffects.BLINDNESS, 4, DANDELION);
    public static final Block POTTED_MAGENTA_PHLOX = registerFlowerPotBlock("potted_magenta_phlox", MAGENTA_PHLOX, POTTED_DANDELION);
    public static final Block BLUE_PHLOX = registerFlowerBlock("blue_phlox", MobEffects.BLINDNESS, 4, DANDELION);
    public static final Block POTTED_BLUE_PHLOX = registerFlowerPotBlock("potted_blue_phlox", BLUE_PHLOX, POTTED_DANDELION);
    public static final Block WHITE_PHLOX = registerFlowerBlock("white_phlox", MobEffects.BLINDNESS, 4, DANDELION);
    public static final Block POTTED_WHITE_PHLOX = registerFlowerPotBlock("potted_white_phlox", WHITE_PHLOX, POTTED_DANDELION);
    public static final Block ORANGE_PHLOX = registerFlowerBlock("orange_phlox", MobEffects.BLINDNESS, 4, DANDELION);
    public static final Block POTTED_ORANGE_PHLOX = registerFlowerPotBlock("potted_orange_phlox", ORANGE_PHLOX, POTTED_DANDELION);
    public static final Block RED_PHLOX = registerFlowerBlock("red_phlox", MobEffects.BLINDNESS, 4, DANDELION);
    public static final Block POTTED_RED_PHLOX = registerFlowerPotBlock("potted_red_phlox", RED_PHLOX, POTTED_DANDELION);
    public static final Block YELLOW_PHLOX = registerFlowerBlock("yellow_phlox", MobEffects.BLINDNESS, 4, DANDELION);
    public static final Block POTTED_YELLOW_PHLOX = registerFlowerPotBlock("potted_yellow_phlox", YELLOW_PHLOX, POTTED_DANDELION);
    public static final Block LIGHT_BLUE_PHLOX = registerFlowerBlock("light_blue_phlox", MobEffects.BLINDNESS, 4, DANDELION);
    public static final Block POTTED_LIGHT_BLUE_PHLOX = registerFlowerPotBlock("potted_light_blue_phlox", LIGHT_BLUE_PHLOX, POTTED_DANDELION);
    public static final Block PINK_PHLOX = registerFlowerBlock("pink_phlox", MobEffects.BLINDNESS, 4, DANDELION);
    public static final Block POTTED_PINK_PHLOX = registerFlowerPotBlock("potted_pink_phlox", PINK_PHLOX, POTTED_DANDELION);
    public static final Block BLACK_PHLOX = registerFlowerBlock("black_phlox", MobEffects.BLINDNESS, 4, DANDELION);
    public static final Block POTTED_BLACK_PHLOX = registerFlowerPotBlock("potted_black_phlox", BLACK_PHLOX, POTTED_DANDELION);
    public static final Block CYAN_PHLOX = registerFlowerBlock("cyan_phlox", MobEffects.BLINDNESS, 4, DANDELION);
    public static final Block POTTED_CYAN_PHLOX = registerFlowerPotBlock("potted_cyan_phlox", CYAN_PHLOX, POTTED_DANDELION);
    
    //lupins

    public static final Block MAGENTA_LUPIN = registerFlowerBlock("magenta_lupin", MobEffects.SPEED, 11, DANDELION);
    public static final Block POTTED_MAGENTA_LUPIN = registerFlowerPotBlock("potted_magenta_lupin", MAGENTA_LUPIN, POTTED_DANDELION);
    public static final Block BLUE_LUPIN = registerFlowerBlock("blue_lupin", MobEffects.SPEED, 11, DANDELION);
    public static final Block POTTED_BLUE_LUPIN = registerFlowerPotBlock("potted_blue_lupin", BLUE_LUPIN, POTTED_DANDELION);
    public static final Block WHITE_LUPIN = registerFlowerBlock("white_lupin", MobEffects.SPEED, 11, DANDELION);
    public static final Block POTTED_WHITE_LUPIN = registerFlowerPotBlock("potted_white_lupin", WHITE_LUPIN, POTTED_DANDELION);
    public static final Block ORANGE_LUPIN = registerFlowerBlock("orange_lupin", MobEffects.SPEED, 11, DANDELION);
    public static final Block POTTED_ORANGE_LUPIN = registerFlowerPotBlock("potted_orange_lupin", ORANGE_LUPIN, POTTED_DANDELION);
    public static final Block RED_LUPIN = registerFlowerBlock("red_lupin", MobEffects.SPEED, 11, DANDELION);
    public static final Block POTTED_RED_LUPIN = registerFlowerPotBlock("potted_red_lupin", RED_LUPIN, POTTED_DANDELION);
    public static final Block YELLOW_LUPIN = registerFlowerBlock("yellow_lupin", MobEffects.SPEED, 11, DANDELION);
    public static final Block POTTED_YELLOW_LUPIN = registerFlowerPotBlock("potted_yellow_lupin", YELLOW_LUPIN, POTTED_DANDELION);
    public static final Block LIGHT_BLUE_LUPIN = registerFlowerBlock("light_blue_lupin", MobEffects.SPEED, 11, DANDELION);
    public static final Block POTTED_LIGHT_BLUE_LUPIN = registerFlowerPotBlock("potted_light_blue_lupin", LIGHT_BLUE_LUPIN, POTTED_DANDELION);
    public static final Block PINK_LUPIN = registerFlowerBlock("pink_lupin", MobEffects.SPEED, 11, DANDELION);
    public static final Block POTTED_PINK_LUPIN = registerFlowerPotBlock("potted_pink_lupin", PINK_LUPIN, POTTED_DANDELION);
    public static final Block BLACK_LUPIN = registerFlowerBlock("black_lupin", MobEffects.SPEED, 11, DANDELION);
    public static final Block POTTED_BLACK_LUPIN = registerFlowerPotBlock("potted_black_lupin", BLACK_LUPIN, POTTED_DANDELION);
    public static final Block CYAN_LUPIN = registerFlowerBlock("cyan_lupin", MobEffects.SPEED, 11, DANDELION);
    public static final Block POTTED_CYAN_LUPIN = registerFlowerPotBlock("potted_cyan_lupin", CYAN_LUPIN, POTTED_DANDELION);

    //small_roses

    public static final Block MAGENTA_SMALL_ROSE = registerFlowerBlock("magenta_small_rose", MobEffects.STRENGTH, 6, DANDELION);
    public static final Block POTTED_MAGENTA_SMALL_ROSE = registerFlowerPotBlock("potted_magenta_small_rose", MAGENTA_SMALL_ROSE, POTTED_DANDELION);
    public static final Block BLUE_SMALL_ROSE = registerFlowerBlock("blue_small_rose", MobEffects.STRENGTH, 6, DANDELION);
    public static final Block POTTED_BLUE_SMALL_ROSE = registerFlowerPotBlock("potted_blue_small_rose", BLUE_SMALL_ROSE, POTTED_DANDELION);
    public static final Block WHITE_SMALL_ROSE = registerFlowerBlock("white_small_rose", MobEffects.STRENGTH, 6, DANDELION);
    public static final Block POTTED_WHITE_SMALL_ROSE = registerFlowerPotBlock("potted_white_small_rose", WHITE_SMALL_ROSE, POTTED_DANDELION);
    public static final Block ORANGE_SMALL_ROSE = registerFlowerBlock("orange_small_rose", MobEffects.STRENGTH, 6, DANDELION);
    public static final Block POTTED_ORANGE_SMALL_ROSE = registerFlowerPotBlock("potted_orange_small_rose", ORANGE_SMALL_ROSE, POTTED_DANDELION);
    public static final Block RED_SMALL_ROSE = registerFlowerBlock("red_small_rose", MobEffects.STRENGTH, 6, DANDELION);
    public static final Block POTTED_RED_SMALL_ROSE = registerFlowerPotBlock("potted_red_small_rose", RED_SMALL_ROSE, POTTED_DANDELION);
    public static final Block YELLOW_SMALL_ROSE = registerFlowerBlock("yellow_small_rose", MobEffects.STRENGTH, 6, DANDELION);
    public static final Block POTTED_YELLOW_SMALL_ROSE = registerFlowerPotBlock("potted_yellow_small_rose", YELLOW_SMALL_ROSE, POTTED_DANDELION);
    public static final Block LIGHT_BLUE_SMALL_ROSE = registerFlowerBlock("light_blue_small_rose", MobEffects.STRENGTH, 6, DANDELION);
    public static final Block POTTED_LIGHT_BLUE_SMALL_ROSE = registerFlowerPotBlock("potted_light_blue_small_rose", LIGHT_BLUE_SMALL_ROSE, POTTED_DANDELION);
    public static final Block PINK_SMALL_ROSE = registerFlowerBlock("pink_small_rose", MobEffects.STRENGTH, 6, DANDELION);
    public static final Block POTTED_PINK_SMALL_ROSE = registerFlowerPotBlock("potted_pink_small_rose", PINK_SMALL_ROSE, POTTED_DANDELION);
    public static final Block BLACK_SMALL_ROSE = registerFlowerBlock("black_small_rose", MobEffects.STRENGTH, 6, DANDELION);
    public static final Block POTTED_BLACK_SMALL_ROSE = registerFlowerPotBlock("potted_black_small_rose", BLACK_SMALL_ROSE, POTTED_DANDELION);
    public static final Block CYAN_SMALL_ROSE = registerFlowerBlock("cyan_small_rose", MobEffects.STRENGTH, 6, DANDELION);
    public static final Block POTTED_CYAN_SMALL_ROSE = registerFlowerPotBlock("potted_cyan_small_rose", CYAN_SMALL_ROSE, POTTED_DANDELION);

    //lavenders

    public static final Block MAGENTA_LAVENDER = registerBlock("magenta_lavender", TallFlowerBlock::new, BlockBehaviour.Properties.ofFullCopy(ROSE_BUSH));
    public static final Block BLUE_LAVENDER = registerBlock("blue_lavender", TallFlowerBlock::new, BlockBehaviour.Properties.ofFullCopy(ROSE_BUSH));
    public static final Block WHITE_LAVENDER = registerBlock("white_lavender", TallFlowerBlock::new, BlockBehaviour.Properties.ofFullCopy(ROSE_BUSH));
    public static final Block ORANGE_LAVENDER = registerBlock("orange_lavender", TallFlowerBlock::new, BlockBehaviour.Properties.ofFullCopy(ROSE_BUSH));
    public static final Block RED_LAVENDER = registerBlock("red_lavender", TallFlowerBlock::new, BlockBehaviour.Properties.ofFullCopy(ROSE_BUSH));
    public static final Block YELLOW_LAVENDER = registerBlock("yellow_lavender", TallFlowerBlock::new, BlockBehaviour.Properties.ofFullCopy(ROSE_BUSH));
    public static final Block LIGHT_BLUE_LAVENDER = registerBlock("light_blue_lavender", TallFlowerBlock::new, BlockBehaviour.Properties.ofFullCopy(ROSE_BUSH));
    public static final Block PINK_LAVENDER = registerBlock("pink_lavender", TallFlowerBlock::new, BlockBehaviour.Properties.ofFullCopy(ROSE_BUSH));
    public static final Block BLACK_LAVENDER = registerBlock("black_lavender", TallFlowerBlock::new, BlockBehaviour.Properties.ofFullCopy(ROSE_BUSH));
    public static final Block CYAN_LAVENDER = registerBlock("cyan_lavender", TallFlowerBlock::new, BlockBehaviour.Properties.ofFullCopy(ROSE_BUSH));

    //hydrangeas

    public static final Block MAGENTA_HYDRANGEA = registerFlowerBlock("magenta_hydrangea", MobEffects.JUMP_BOOST, 12, LILAC);
    public static final Block BLUE_HYDRANGEA = registerFlowerBlock("blue_hydrangea", MobEffects.JUMP_BOOST, 12, LILAC);
    public static final Block WHITE_HYDRANGEA = registerFlowerBlock("white_hydrangea", MobEffects.JUMP_BOOST, 12, LILAC);
    public static final Block ORANGE_HYDRANGEA = registerFlowerBlock("orange_hydrangea", MobEffects.JUMP_BOOST, 12, LILAC);
    public static final Block RED_HYDRANGEA = registerFlowerBlock("red_hydrangea", MobEffects.JUMP_BOOST, 12, LILAC);
    public static final Block YELLOW_HYDRANGEA = registerFlowerBlock("yellow_hydrangea", MobEffects.JUMP_BOOST, 12, LILAC);
    public static final Block LIGHT_BLUE_HYDRANGEA = registerFlowerBlock("light_blue_hydrangea", MobEffects.JUMP_BOOST, 12, LILAC);
    public static final Block PINK_HYDRANGEA = registerFlowerBlock("pink_hydrangea", MobEffects.JUMP_BOOST, 12, LILAC);
    public static final Block BLACK_HYDRANGEA = registerFlowerBlock("black_hydrangea", MobEffects.JUMP_BOOST, 12, LILAC);
    public static final Block CYAN_HYDRANGEA = registerFlowerBlock("cyan_hydrangea", MobEffects.JUMP_BOOST, 12, LILAC);

    //lotus flowers

    public static final Block MAGENTA_LOTUS_FLOWER = registerBlock("magenta_lotus_flower", false, LilyPadBlock::new, BlockBehaviour.Properties.ofFullCopy(LILY_PAD).mapColor(DyeColor.MAGENTA));
    public static final Block BLUE_LOTUS_FLOWER = registerBlock("blue_lotus_flower", false, LilyPadBlock::new, BlockBehaviour.Properties.ofFullCopy(LILY_PAD).mapColor(DyeColor.BLUE));
    public static final Block WHITE_LOTUS_FLOWER = registerBlock("white_lotus_flower", false, LilyPadBlock::new, BlockBehaviour.Properties.ofFullCopy(LILY_PAD).mapColor(DyeColor.WHITE));
    public static final Block ORANGE_LOTUS_FLOWER = registerBlock("orange_lotus_flower", false, LilyPadBlock::new, BlockBehaviour.Properties.ofFullCopy(LILY_PAD).mapColor(DyeColor.ORANGE));
    public static final Block RED_LOTUS_FLOWER = registerBlock("red_lotus_flower", false, LilyPadBlock::new, BlockBehaviour.Properties.ofFullCopy(LILY_PAD).mapColor(DyeColor.RED));
    public static final Block YELLOW_LOTUS_FLOWER = registerBlock("yellow_lotus_flower", false, LilyPadBlock::new, BlockBehaviour.Properties.ofFullCopy(LILY_PAD).mapColor(DyeColor.YELLOW));
    public static final Block LIGHT_BLUE_LOTUS_FLOWER = registerBlock("light_blue_lotus_flower", false, LilyPadBlock::new, BlockBehaviour.Properties.ofFullCopy(LILY_PAD).mapColor(DyeColor.LIGHT_BLUE));
    public static final Block PINK_LOTUS_FLOWER = registerBlock("pink_lotus_flower", false, LilyPadBlock::new, BlockBehaviour.Properties.ofFullCopy(LILY_PAD).mapColor(DyeColor.PINK));
    public static final Block BLACK_LOTUS_FLOWER = registerBlock("black_lotus_flower", false, LilyPadBlock::new, BlockBehaviour.Properties.ofFullCopy(LILY_PAD).mapColor(DyeColor.BLACK));
    public static final Block CYAN_LOTUS_FLOWER = registerBlock("cyan_lotus_flower", false, LilyPadBlock::new, BlockBehaviour.Properties.ofFullCopy(LILY_PAD).mapColor(DyeColor.CYAN));

    //jasmine

    public static final Block MAGENTA_JASMINE = registerBlock("magenta_jasmine", JasmineBlock::new, BlockBehaviour.Properties.ofFullCopy(WEEPING_VINES).sound(SoundType.CAVE_VINES));
    public static final Block BLUE_JASMINE = registerBlock("blue_jasmine", JasmineBlock::new, BlockBehaviour.Properties.ofFullCopy(WEEPING_VINES).sound(SoundType.CAVE_VINES));
    public static final Block WHITE_JASMINE = registerBlock("white_jasmine", JasmineBlock::new, BlockBehaviour.Properties.ofFullCopy(WEEPING_VINES).sound(SoundType.CAVE_VINES));
    public static final Block ORANGE_JASMINE = registerBlock("orange_jasmine", JasmineBlock::new, BlockBehaviour.Properties.ofFullCopy(WEEPING_VINES).sound(SoundType.CAVE_VINES));
    public static final Block RED_JASMINE = registerBlock("red_jasmine", JasmineBlock::new, BlockBehaviour.Properties.ofFullCopy(WEEPING_VINES).sound(SoundType.CAVE_VINES));
    public static final Block YELLOW_JASMINE = registerBlock("yellow_jasmine", JasmineBlock::new, BlockBehaviour.Properties.ofFullCopy(WEEPING_VINES).sound(SoundType.CAVE_VINES));
    public static final Block LIGHT_BLUE_JASMINE = registerBlock("light_blue_jasmine", JasmineBlock::new, BlockBehaviour.Properties.ofFullCopy(WEEPING_VINES).sound(SoundType.CAVE_VINES));
    public static final Block PINK_JASMINE = registerBlock("pink_jasmine", JasmineBlock::new, BlockBehaviour.Properties.ofFullCopy(WEEPING_VINES).sound(SoundType.CAVE_VINES));
    public static final Block BLACK_JASMINE = registerBlock("black_jasmine", JasmineBlock::new, BlockBehaviour.Properties.ofFullCopy(WEEPING_VINES).sound(SoundType.CAVE_VINES));
    public static final Block CYAN_JASMINE = registerBlock("cyan_jasmine", JasmineBlock::new, BlockBehaviour.Properties.ofFullCopy(WEEPING_VINES).sound(SoundType.CAVE_VINES));

    //cypress vines

    public static final Block MAGENTA_CYPRESS_VINE = registerBlock("magenta_cypress_vine", VineBlock::new, BlockBehaviour.Properties.ofFullCopy(VINE));
    public static final Block BLUE_CYPRESS_VINE = registerBlock("blue_cypress_vine", VineBlock::new, BlockBehaviour.Properties.ofFullCopy(VINE));
    public static final Block WHITE_CYPRESS_VINE = registerBlock("white_cypress_vine", VineBlock::new, BlockBehaviour.Properties.ofFullCopy(VINE));
    public static final Block ORANGE_CYPRESS_VINE = registerBlock("orange_cypress_vine", VineBlock::new, BlockBehaviour.Properties.ofFullCopy(VINE));
    public static final Block RED_CYPRESS_VINE = registerBlock("red_cypress_vine", VineBlock::new, BlockBehaviour.Properties.ofFullCopy(VINE));
    public static final Block YELLOW_CYPRESS_VINE = registerBlock("yellow_cypress_vine", VineBlock::new, BlockBehaviour.Properties.ofFullCopy(VINE));
    public static final Block LIGHT_BLUE_CYPRESS_VINE = registerBlock("light_blue_cypress_vine", VineBlock::new, BlockBehaviour.Properties.ofFullCopy(VINE));
    public static final Block PINK_CYPRESS_VINE = registerBlock("pink_cypress_vine", VineBlock::new, BlockBehaviour.Properties.ofFullCopy(VINE));
    public static final Block BLACK_CYPRESS_VINE = registerBlock("black_cypress_vine", VineBlock::new, BlockBehaviour.Properties.ofFullCopy(VINE));
    public static final Block CYAN_CYPRESS_VINE = registerBlock("cyan_cypress_vine", VineBlock::new, BlockBehaviour.Properties.ofFullCopy(VINE));

    //glowshrooms

    public static final Block MAGENTA_GLOWSHROOM = registerBlock("magenta_glowshroom", settings -> new GlowshroomPlantBlock(FBConfiguredFeatures.HUGE_MAGENTA_GLOWSHROOM, settings), BlockBehaviour.Properties.ofFullCopy(BROWN_MUSHROOM).lightLevel(state -> 10));
    public static final Block POTTED_MAGENTA_GLOWSHROOM = registerGlowshroomFlowerPotBlock("potted_magenta_glowshroom", MAGENTA_GLOWSHROOM, POTTED_BROWN_MUSHROOM);
    public static final Block MAGENTA_GLOWSHROOM_BLOCK = registerBlock("magenta_glowshroom_block", HugeMushroomBlock::new, BlockBehaviour.Properties.ofFullCopy(BROWN_MUSHROOM_BLOCK).mapColor(DyeColor.MAGENTA).lightLevel(state -> 15));
    public static final Block BLUE_GLOWSHROOM = registerBlock("blue_glowshroom", settings -> new GlowshroomPlantBlock(FBConfiguredFeatures.HUGE_BLUE_GLOWSHROOM, settings), BlockBehaviour.Properties.ofFullCopy(BROWN_MUSHROOM).lightLevel(state -> 10));
    public static final Block POTTED_BLUE_GLOWSHROOM = registerGlowshroomFlowerPotBlock("potted_blue_glowshroom", BLUE_GLOWSHROOM, POTTED_BROWN_MUSHROOM);
    public static final Block BLUE_GLOWSHROOM_BLOCK = registerBlock("blue_glowshroom_block", HugeMushroomBlock::new, BlockBehaviour.Properties.ofFullCopy(BROWN_MUSHROOM_BLOCK).mapColor(DyeColor.BLUE).lightLevel(state -> 15));
    public static final Block WHITE_GLOWSHROOM = registerBlock("white_glowshroom", settings -> new GlowshroomPlantBlock(FBConfiguredFeatures.HUGE_WHITE_GLOWSHROOM, settings), BlockBehaviour.Properties.ofFullCopy(BROWN_MUSHROOM).lightLevel(state -> 10));
    public static final Block POTTED_WHITE_GLOWSHROOM = registerGlowshroomFlowerPotBlock("potted_white_glowshroom", WHITE_GLOWSHROOM, POTTED_BROWN_MUSHROOM);
    public static final Block WHITE_GLOWSHROOM_BLOCK = registerBlock("white_glowshroom_block", HugeMushroomBlock::new, BlockBehaviour.Properties.ofFullCopy(BROWN_MUSHROOM_BLOCK).mapColor(DyeColor.WHITE).lightLevel(state -> 15));
    public static final Block ORANGE_GLOWSHROOM = registerBlock("orange_glowshroom", settings -> new GlowshroomPlantBlock(FBConfiguredFeatures.HUGE_ORANGE_GLOWSHROOM, settings), BlockBehaviour.Properties.ofFullCopy(BROWN_MUSHROOM).lightLevel(state -> 10));
    public static final Block POTTED_ORANGE_GLOWSHROOM = registerGlowshroomFlowerPotBlock("potted_orange_glowshroom", ORANGE_GLOWSHROOM, POTTED_BROWN_MUSHROOM);
    public static final Block ORANGE_GLOWSHROOM_BLOCK = registerBlock("orange_glowshroom_block", HugeMushroomBlock::new, BlockBehaviour.Properties.ofFullCopy(BROWN_MUSHROOM_BLOCK).mapColor(DyeColor.ORANGE).lightLevel(state -> 15));
    public static final Block RED_GLOWSHROOM = registerBlock("red_glowshroom", settings -> new GlowshroomPlantBlock(FBConfiguredFeatures.HUGE_RED_GLOWSHROOM, settings), BlockBehaviour.Properties.ofFullCopy(BROWN_MUSHROOM).lightLevel(state -> 10));
    public static final Block POTTED_RED_GLOWSHROOM = registerGlowshroomFlowerPotBlock("potted_red_glowshroom", RED_GLOWSHROOM, POTTED_BROWN_MUSHROOM);
    public static final Block RED_GLOWSHROOM_BLOCK = registerBlock("red_glowshroom_block", HugeMushroomBlock::new, BlockBehaviour.Properties.ofFullCopy(BROWN_MUSHROOM_BLOCK).mapColor(DyeColor.RED).lightLevel(state -> 15));
    public static final Block YELLOW_GLOWSHROOM = registerBlock("yellow_glowshroom", settings -> new GlowshroomPlantBlock(FBConfiguredFeatures.HUGE_YELLOW_GLOWSHROOM, settings), BlockBehaviour.Properties.ofFullCopy(BROWN_MUSHROOM).lightLevel(state -> 10));
    public static final Block POTTED_YELLOW_GLOWSHROOM = registerGlowshroomFlowerPotBlock("potted_yellow_glowshroom", YELLOW_GLOWSHROOM, POTTED_BROWN_MUSHROOM);
    public static final Block YELLOW_GLOWSHROOM_BLOCK = registerBlock("yellow_glowshroom_block", HugeMushroomBlock::new, BlockBehaviour.Properties.ofFullCopy(BROWN_MUSHROOM_BLOCK).mapColor(DyeColor.YELLOW).lightLevel(state -> 15));
    public static final Block LIGHT_BLUE_GLOWSHROOM = registerBlock("light_blue_glowshroom", settings -> new GlowshroomPlantBlock(FBConfiguredFeatures.HUGE_LIGHT_BLUE_GLOWSHROOM, settings), BlockBehaviour.Properties.ofFullCopy(BROWN_MUSHROOM).lightLevel(state -> 10));
    public static final Block POTTED_LIGHT_BLUE_GLOWSHROOM = registerGlowshroomFlowerPotBlock("potted_light_blue_glowshroom", LIGHT_BLUE_GLOWSHROOM, POTTED_BROWN_MUSHROOM);
    public static final Block LIGHT_BLUE_GLOWSHROOM_BLOCK = registerBlock("light_blue_glowshroom_block", HugeMushroomBlock::new, BlockBehaviour.Properties.ofFullCopy(BROWN_MUSHROOM_BLOCK).mapColor(DyeColor.LIGHT_BLUE).lightLevel(state -> 15));
    public static final Block PINK_GLOWSHROOM = registerBlock("pink_glowshroom", settings -> new GlowshroomPlantBlock(FBConfiguredFeatures.HUGE_PINK_GLOWSHROOM, settings), BlockBehaviour.Properties.ofFullCopy(BROWN_MUSHROOM).lightLevel(state -> 10));
    public static final Block POTTED_PINK_GLOWSHROOM = registerGlowshroomFlowerPotBlock("potted_pink_glowshroom", PINK_GLOWSHROOM, POTTED_BROWN_MUSHROOM);
    public static final Block PINK_GLOWSHROOM_BLOCK = registerBlock("pink_glowshroom_block", HugeMushroomBlock::new, BlockBehaviour.Properties.ofFullCopy(BROWN_MUSHROOM_BLOCK).mapColor(DyeColor.PINK).lightLevel(state -> 15));
    public static final Block BLACK_GLOWSHROOM = registerBlock("black_glowshroom", settings -> new GlowshroomPlantBlock(FBConfiguredFeatures.HUGE_BLACK_GLOWSHROOM, settings), BlockBehaviour.Properties.ofFullCopy(BROWN_MUSHROOM).lightLevel(state -> 10));
    public static final Block POTTED_BLACK_GLOWSHROOM = registerGlowshroomFlowerPotBlock("potted_black_glowshroom", BLACK_GLOWSHROOM, POTTED_BROWN_MUSHROOM);
    public static final Block BLACK_GLOWSHROOM_BLOCK = registerBlock("black_glowshroom_block", HugeMushroomBlock::new, BlockBehaviour.Properties.ofFullCopy(BROWN_MUSHROOM_BLOCK).mapColor(DyeColor.BLACK).lightLevel(state -> 15));
    public static final Block CYAN_GLOWSHROOM = registerBlock("cyan_glowshroom", settings -> new GlowshroomPlantBlock(FBConfiguredFeatures.HUGE_CYAN_GLOWSHROOM, settings), BlockBehaviour.Properties.ofFullCopy(BROWN_MUSHROOM).lightLevel(state -> 10));
    public static final Block POTTED_CYAN_GLOWSHROOM = registerGlowshroomFlowerPotBlock("potted_cyan_glowshroom", CYAN_GLOWSHROOM, POTTED_BROWN_MUSHROOM);
    public static final Block CYAN_GLOWSHROOM_BLOCK = registerBlock("cyan_glowshroom_block", HugeMushroomBlock::new, BlockBehaviour.Properties.ofFullCopy(BROWN_MUSHROOM_BLOCK).mapColor(DyeColor.CYAN).lightLevel(state -> 15));
    public static final Block GREEN_GLOWSHROOM = registerBlock("green_glowshroom", settings -> new GlowshroomPlantBlock(FBConfiguredFeatures.HUGE_GREEN_GLOWSHROOM, settings), BlockBehaviour.Properties.ofFullCopy(BROWN_MUSHROOM).lightLevel(state -> 10));
    public static final Block POTTED_GREEN_GLOWSHROOM = registerGlowshroomFlowerPotBlock("potted_green_glowshroom", GREEN_GLOWSHROOM, POTTED_BROWN_MUSHROOM);
    public static final Block GREEN_GLOWSHROOM_BLOCK = registerBlock("green_glowshroom_block", HugeMushroomBlock::new, BlockBehaviour.Properties.ofFullCopy(BROWN_MUSHROOM_BLOCK).mapColor(DyeColor.LIME).lightLevel(state -> 15));

    //other plants

    public static final Block CLIMBING_IVY = registerBlock("climbing_ivy", IvyBlock::new, BlockBehaviour.Properties.ofFullCopy(VINE));
    public static final Block CATTAILS = registerBlock("cattails", CattailsBlock::new, BlockBehaviour.Properties.ofFullCopy(SUGAR_CANE));
    public static final Block SAGE = registerBlock("sage", settings -> new SageBlock(FBConfiguredFeatures.SAGE_KEY, settings), BlockBehaviour.Properties.ofFullCopy(FERN));
    public static final Block POTTED_SAGE = registerFlowerPotBlock("potted_sage", SAGE, POTTED_FERN);

    //other stuff

    public static final Block PLANTER = registerBlock("planter",
            PlanterBlock::new, BlockBehaviour.Properties.of().strength(1F, 3.5F).noOcclusion().pushReaction(PushReaction.DESTROY));

    public static final Block GRASS_FLOWERBED = registerBlock("grass_flowerbed",
            FBFlowerbedBlock::new, BlockBehaviour.Properties.ofFullCopy(GRASS_BLOCK).pushReaction(PushReaction.DESTROY).noOcclusion());
    public static final Block DIRT_FLOWERBED = registerBlock("dirt_flowerbed",
            FBFlowerbedBlock::new, BlockBehaviour.Properties.ofFullCopy(DIRT).pushReaction(PushReaction.DESTROY).noOcclusion());
    public static final Block FARMLAND_FLOWERBED = registerBlock("farmland_flowerbed",
            FBFlowerbedBlock::new, BlockBehaviour.Properties.ofFullCopy(FARMLAND).pushReaction(PushReaction.DESTROY).noOcclusion());
    public static final Block MOSS_FLOWERBED = registerBlock("moss_flowerbed",
            FBFlowerbedBlock::new, BlockBehaviour.Properties.ofFullCopy(MOSS_BLOCK).pushReaction(PushReaction.DESTROY).noOcclusion());
    public static final Block PODZOL_FLOWERBED = registerBlock("podzol_flowerbed",
            FBFlowerbedBlock::new, BlockBehaviour.Properties.ofFullCopy(MOSS_BLOCK).pushReaction(PushReaction.DESTROY).noOcclusion());

    public static final Block WHITE_VASE = registerBlock("white_vase",
            VaseBlock::new, BlockBehaviour.Properties.ofFullCopy(FLOWER_POT).sound(SoundType.DECORATED_POT));
    public static final Block LIGHT_GRAY_VASE = registerBlock("light_gray_vase",
            VaseBlock::new, BlockBehaviour.Properties.ofFullCopy(FLOWER_POT).sound(SoundType.DECORATED_POT));
    public static final Block GRAY_VASE = registerBlock("gray_vase",
            VaseBlock::new, BlockBehaviour.Properties.ofFullCopy(FLOWER_POT).sound(SoundType.DECORATED_POT));
    public static final Block BLACK_VASE = registerBlock("black_vase",
            VaseBlock::new, BlockBehaviour.Properties.ofFullCopy(FLOWER_POT).sound(SoundType.DECORATED_POT));
    public static final Block BROWN_VASE = registerBlock("brown_vase",
            VaseBlock::new, BlockBehaviour.Properties.ofFullCopy(FLOWER_POT).sound(SoundType.DECORATED_POT));
    public static final Block RED_VASE = registerBlock("red_vase",
            VaseBlock::new, BlockBehaviour.Properties.ofFullCopy(FLOWER_POT).sound(SoundType.DECORATED_POT));
    public static final Block ORANGE_VASE = registerBlock("orange_vase",
            VaseBlock::new, BlockBehaviour.Properties.ofFullCopy(FLOWER_POT).sound(SoundType.DECORATED_POT));
    public static final Block YELLOW_VASE = registerBlock("yellow_vase",
            VaseBlock::new, BlockBehaviour.Properties.ofFullCopy(FLOWER_POT).sound(SoundType.DECORATED_POT));
    public static final Block LIME_VASE = registerBlock("lime_vase",
            VaseBlock::new, BlockBehaviour.Properties.ofFullCopy(FLOWER_POT).sound(SoundType.DECORATED_POT));
    public static final Block GREEN_VASE = registerBlock("green_vase",
            VaseBlock::new, BlockBehaviour.Properties.ofFullCopy(FLOWER_POT).sound(SoundType.DECORATED_POT));
    public static final Block CYAN_VASE = registerBlock("cyan_vase",
            VaseBlock::new, BlockBehaviour.Properties.ofFullCopy(FLOWER_POT).sound(SoundType.DECORATED_POT));
    public static final Block LIGHT_BLUE_VASE = registerBlock("light_blue_vase",
            VaseBlock::new, BlockBehaviour.Properties.ofFullCopy(FLOWER_POT).sound(SoundType.DECORATED_POT));
    public static final Block BLUE_VASE = registerBlock("blue_vase",
            VaseBlock::new, BlockBehaviour.Properties.ofFullCopy(FLOWER_POT).sound(SoundType.DECORATED_POT));
    public static final Block PURPLE_VASE = registerBlock("purple_vase",
            VaseBlock::new, BlockBehaviour.Properties.ofFullCopy(FLOWER_POT).sound(SoundType.DECORATED_POT));
    public static final Block MAGENTA_VASE = registerBlock("magenta_vase",
            VaseBlock::new, BlockBehaviour.Properties.ofFullCopy(FLOWER_POT).sound(SoundType.DECORATED_POT));
    public static final Block PINK_VASE = registerBlock("pink_vase",
            VaseBlock::new, BlockBehaviour.Properties.ofFullCopy(FLOWER_POT).sound(SoundType.DECORATED_POT));

    // makin the thangz

    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> factory, BlockBehaviour.Properties settings) {
        return registerBlock(name, true, factory, settings);
    }
    private static Block registerBlock(String name, boolean createItem, Function<BlockBehaviour.Properties, Block> factory, BlockBehaviour.Properties settings) {
        Block block = Blocks.register(keyOf(name), factory, settings);
        if (createItem) { registerBlockItem(name, block); }
        return block;
    }
    private static ResourceKey<Block> keyOf(String name) {
        return ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(FlowerBreeding.MOD_ID, name));
    }
    private static Block registerFlowerBlock(String name, Holder<MobEffect> effect, float length, Block base) {
        return registerBlock(name, true, settings -> new FlowerBlock(effect, length, settings), BlockBehaviour.Properties.ofFullCopy(base));
    }
    private static Block registerWitherRoseBlock(String name) {
        return registerBlock(name, true, settings -> new WitherRoseBlock(MobEffects.WITHER, 7, settings), BlockBehaviour.Properties.ofFullCopy(Blocks.WITHER_ROSE));
    }
    private static Block registerMagentaEyeblossomFlowerPotBlock(String name, Block content, Block base) {
        return registerBlock(name, false, settings -> new MagentaEyeblossomFlowerPotBlock(content, settings), BlockBehaviour.Properties.ofFullCopy(base));
    }
    private static Block registerBlueEyeblossomFlowerPotBlock(String name, Block content, Block base) {
        return registerBlock(name, false, settings -> new BlueEyeblossomFlowerPotBlock(content, settings), BlockBehaviour.Properties.ofFullCopy(base));
    }
    private static Block registerWhiteEyeblossomFlowerPotBlock(String name, Block content, Block base) {
        return registerBlock(name, false, settings -> new WhiteEyeblossomFlowerPotBlock(content, settings), BlockBehaviour.Properties.ofFullCopy(base));
    }
    private static Block registerRedEyeblossomFlowerPotBlock(String name, Block content, Block base) {
        return registerBlock(name, false, settings -> new RedEyeblossomFlowerPotBlock(content, settings), BlockBehaviour.Properties.ofFullCopy(base));
    }
    private static Block registerYellowEyeblossomFlowerPotBlock(String name, Block content, Block base) {
        return registerBlock(name, false, settings -> new YellowEyeblossomFlowerPotBlock(content, settings), BlockBehaviour.Properties.ofFullCopy(base));
    }
    private static Block registerLightBlueEyeblossomFlowerPotBlock(String name, Block content, Block base) {
        return registerBlock(name, false, settings -> new LightBlueEyeblossomFlowerPotBlock(content, settings), BlockBehaviour.Properties.ofFullCopy(base));
    }
    private static Block registerPinkEyeblossomFlowerPotBlock(String name, Block content, Block base) {
        return registerBlock(name, false, settings -> new PinkEyeblossomFlowerPotBlock(content, settings), BlockBehaviour.Properties.ofFullCopy(base));
    }
    private static Block registerBlackEyeblossomFlowerPotBlock(String name, Block content, Block base) {
        return registerBlock(name, false, settings -> new BlackEyeblossomFlowerPotBlock(content, settings), BlockBehaviour.Properties.ofFullCopy(base));
    }
    private static Block registerCyanEyeblossomFlowerPotBlock(String name, Block content, Block base) {
        return registerBlock(name, false, settings -> new CyanEyeblossomFlowerPotBlock(content, settings), BlockBehaviour.Properties.ofFullCopy(base));
    }
    private static Block registerGlowshroomFlowerPotBlock(String name, Block content, Block base) {
        return registerBlock(name, false, settings -> new FlowerPotBlock(content, settings), BlockBehaviour.Properties.ofFullCopy(base).lightLevel(state -> 10));
    }
    private static Block registerFlowerPotBlock(String name, Block content, Block base) {
        return registerBlock(name, false, settings -> new FlowerPotBlock(content, settings), BlockBehaviour.Properties.ofFullCopy(base));
    }
    private static void registerBlockItem(String name, Block block) {
        Identifier id = Identifier.fromNamespaceAndPath(FlowerBreeding.MOD_ID, name);
        ResourceKey<Item> key = ResourceKey.create(Registries.ITEM, id);
        Registry.register(BuiltInRegistries.ITEM, key, new BlockItem(block, new net.minecraft.world.item.Item.Properties().useBlockDescriptionPrefix().setId(key)));
    }

    public static ResourceKey<Block> getResourceKey(Block block) {
        return BuiltInRegistries.BLOCK.getResourceKey(block).get();
    }

    public static void registerModBlocks() {
        FlowerBreeding.LOGGER.info("Registering blocks for " + FlowerBreeding.MOD_ID);
    }
}
