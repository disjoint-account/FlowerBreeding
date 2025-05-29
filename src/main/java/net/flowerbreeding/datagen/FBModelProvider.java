package net.flowerbreeding.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.flowerbreeding.FBBlocks;
import net.flowerbreeding.FBItems;
import net.flowerbreeding.FlowerBreeding;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.data.*;
import net.minecraft.client.render.item.tint.GrassTintSource;
import net.minecraft.client.render.model.json.ModelVariant;
import net.minecraft.client.render.model.json.WeightedVariant;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.Pool;

import java.util.Optional;

import static net.minecraft.client.data.BlockStateModelGenerator.*;

public class FBModelProvider extends FabricModelProvider {

    public FBModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.MAGENTA_CORNFLOWER, FBBlocks.POTTED_MAGENTA_CORNFLOWER, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.MAGENTA_DAISY, FBBlocks.POTTED_MAGENTA_DAISY, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.MAGENTA_TORCHFLOWER, FBBlocks.POTTED_MAGENTA_TORCHFLOWER, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.MAGENTA_TULIP, FBBlocks.POTTED_MAGENTA_TULIP, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.MAGENTA_AZURE_BLUET, FBBlocks.POTTED_MAGENTA_AZURE_BLUET, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.MAGENTA_DANDELION, FBBlocks.POTTED_MAGENTA_DANDELION, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.MAGENTA_ORCHID, FBBlocks.POTTED_MAGENTA_ORCHID, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.MAGENTA_LILY, FBBlocks.POTTED_MAGENTA_LILY, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.MAGENTA_POPPY, FBBlocks.POTTED_MAGENTA_POPPY, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.MAGENTA_WITHER_ROSE, FBBlocks.POTTED_MAGENTA_WITHER_ROSE, BlockStateModelGenerator.CrossType.NOT_TINTED);
        registerOpenEyeBlossomAndPot(blockStateModelGenerator, FBBlocks.OPEN_MAGENTA_EYEBLOSSOM, FBBlocks.POTTED_OPEN_MAGENTA_EYEBLOSSOM);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.CLOSED_MAGENTA_EYEBLOSSOM, FBBlocks.POTTED_CLOSED_MAGENTA_EYEBLOSSOM, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlockAndItem(FBBlocks.MAGENTA_LILAC, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlockAndItem(FBBlocks.MAGENTA_PEONY, BlockStateModelGenerator.CrossType.NOT_TINTED);
        registerPitcherPlant(blockStateModelGenerator, FBBlocks.MAGENTA_PITCHER_PLANT);
        blockStateModelGenerator.registerDoubleBlockAndItem(FBBlocks.MAGENTA_ROSE_BUSH, BlockStateModelGenerator.CrossType.NOT_TINTED);
        registerSunflower(blockStateModelGenerator, FBBlocks.MAGENTA_SUNFLOWER);
        blockStateModelGenerator.registerFlowerbed(FBBlocks.MAGENTA_PETALS);
        blockStateModelGenerator.registerAzalea(FBBlocks.MAGENTA_FLOWERING_AZALEA);
        blockStateModelGenerator.registerPottedAzaleaBush(FBBlocks.POTTED_MAGENTA_FLOWERING_AZALEA_BUSH);
        blockStateModelGenerator.registerSingleton(FBBlocks.MAGENTA_FLOWERING_AZALEA_LEAVES, TexturedModel.LEAVES);
        registerSporeBlossom(blockStateModelGenerator, FBBlocks.MAGENTA_SPORE_BLOSSOM);

        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.BLUE_ALLIUM, FBBlocks.POTTED_BLUE_ALLIUM, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.BLUE_DAISY, FBBlocks.POTTED_BLUE_DAISY, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.BLUE_TORCHFLOWER, FBBlocks.POTTED_BLUE_TORCHFLOWER, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.BLUE_TULIP, FBBlocks.POTTED_BLUE_TULIP, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.BLUE_AZURE_BLUET, FBBlocks.POTTED_BLUE_AZURE_BLUET, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.BLUE_DANDELION, FBBlocks.POTTED_BLUE_DANDELION, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.BLUE_ORCHID, FBBlocks.POTTED_BLUE_ORCHID, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.BLUE_LILY, FBBlocks.POTTED_BLUE_LILY, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.BLUE_POPPY, FBBlocks.POTTED_BLUE_POPPY, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.BLUE_WITHER_ROSE, FBBlocks.POTTED_BLUE_WITHER_ROSE, BlockStateModelGenerator.CrossType.NOT_TINTED);
        registerOpenEyeBlossomAndPot(blockStateModelGenerator, FBBlocks.OPEN_BLUE_EYEBLOSSOM, FBBlocks.POTTED_OPEN_BLUE_EYEBLOSSOM);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.CLOSED_BLUE_EYEBLOSSOM, FBBlocks.POTTED_CLOSED_BLUE_EYEBLOSSOM, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlockAndItem(FBBlocks.BLUE_LILAC, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlockAndItem(FBBlocks.BLUE_PEONY, BlockStateModelGenerator.CrossType.NOT_TINTED);
        registerPitcherPlant(blockStateModelGenerator, FBBlocks.BLUE_PITCHER_PLANT);
        blockStateModelGenerator.registerDoubleBlockAndItem(FBBlocks.BLUE_ROSE_BUSH, BlockStateModelGenerator.CrossType.NOT_TINTED);
        registerSunflower(blockStateModelGenerator, FBBlocks.BLUE_SUNFLOWER);
        blockStateModelGenerator.registerFlowerbed(FBBlocks.BLUE_PETALS);
        blockStateModelGenerator.registerAzalea(FBBlocks.BLUE_FLOWERING_AZALEA);
        blockStateModelGenerator.registerPottedAzaleaBush(FBBlocks.POTTED_BLUE_FLOWERING_AZALEA_BUSH);
        blockStateModelGenerator.registerSingleton(FBBlocks.BLUE_FLOWERING_AZALEA_LEAVES, TexturedModel.LEAVES);
        registerSporeBlossom(blockStateModelGenerator, FBBlocks.BLUE_SPORE_BLOSSOM);

        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.WHITE_ALLIUM, FBBlocks.POTTED_WHITE_ALLIUM, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.WHITE_CORNFLOWER, FBBlocks.POTTED_WHITE_CORNFLOWER, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.WHITE_TORCHFLOWER, FBBlocks.POTTED_WHITE_TORCHFLOWER, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.WHITE_DANDELION, FBBlocks.POTTED_WHITE_DANDELION, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.WHITE_ORCHID, FBBlocks.POTTED_WHITE_ORCHID, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.WHITE_POPPY, FBBlocks.POTTED_WHITE_POPPY, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.WHITE_WITHER_ROSE, FBBlocks.POTTED_WHITE_WITHER_ROSE, BlockStateModelGenerator.CrossType.NOT_TINTED);
        registerOpenEyeBlossomAndPot(blockStateModelGenerator, FBBlocks.OPEN_WHITE_EYEBLOSSOM, FBBlocks.POTTED_OPEN_WHITE_EYEBLOSSOM);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.CLOSED_WHITE_EYEBLOSSOM, FBBlocks.POTTED_CLOSED_WHITE_EYEBLOSSOM, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlockAndItem(FBBlocks.WHITE_LILAC, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlockAndItem(FBBlocks.WHITE_PEONY, BlockStateModelGenerator.CrossType.NOT_TINTED);
        registerPitcherPlant(blockStateModelGenerator, FBBlocks.WHITE_PITCHER_PLANT);
        blockStateModelGenerator.registerDoubleBlockAndItem(FBBlocks.WHITE_ROSE_BUSH, BlockStateModelGenerator.CrossType.NOT_TINTED);
        registerSunflower(blockStateModelGenerator, FBBlocks.WHITE_SUNFLOWER);
        blockStateModelGenerator.registerFlowerbed(FBBlocks.WHITE_PETALS);
        blockStateModelGenerator.registerAzalea(FBBlocks.WHITE_FLOWERING_AZALEA);
        blockStateModelGenerator.registerPottedAzaleaBush(FBBlocks.POTTED_WHITE_FLOWERING_AZALEA_BUSH);
        blockStateModelGenerator.registerSingleton(FBBlocks.WHITE_FLOWERING_AZALEA_LEAVES, TexturedModel.LEAVES);
        registerSporeBlossom(blockStateModelGenerator, FBBlocks.WHITE_SPORE_BLOSSOM);

        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.ORANGE_ALLIUM, FBBlocks.POTTED_ORANGE_ALLIUM, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.ORANGE_CORNFLOWER, FBBlocks.POTTED_ORANGE_CORNFLOWER, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.ORANGE_DAISY, FBBlocks.POTTED_ORANGE_DAISY, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.ORANGE_AZURE_BLUET, FBBlocks.POTTED_ORANGE_AZURE_BLUET, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.ORANGE_DANDELION, FBBlocks.POTTED_ORANGE_DANDELION, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.ORANGE_ORCHID, FBBlocks.POTTED_ORANGE_ORCHID, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.ORANGE_LILY, FBBlocks.POTTED_ORANGE_LILY, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.ORANGE_POPPY, FBBlocks.POTTED_ORANGE_POPPY, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.ORANGE_WITHER_ROSE, FBBlocks.POTTED_ORANGE_WITHER_ROSE, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlockAndItem(FBBlocks.ORANGE_LILAC, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlockAndItem(FBBlocks.ORANGE_PEONY, BlockStateModelGenerator.CrossType.NOT_TINTED);
        registerPitcherPlant(blockStateModelGenerator, FBBlocks.ORANGE_PITCHER_PLANT);
        blockStateModelGenerator.registerDoubleBlockAndItem(FBBlocks.ORANGE_ROSE_BUSH, BlockStateModelGenerator.CrossType.NOT_TINTED);
        registerSunflower(blockStateModelGenerator, FBBlocks.ORANGE_SUNFLOWER);
        blockStateModelGenerator.registerFlowerbed(FBBlocks.ORANGE_PETALS);
        blockStateModelGenerator.registerAzalea(FBBlocks.ORANGE_FLOWERING_AZALEA);
        blockStateModelGenerator.registerPottedAzaleaBush(FBBlocks.POTTED_ORANGE_FLOWERING_AZALEA_BUSH);
        blockStateModelGenerator.registerSingleton(FBBlocks.ORANGE_FLOWERING_AZALEA_LEAVES, TexturedModel.LEAVES);
        registerSporeBlossom(blockStateModelGenerator, FBBlocks.ORANGE_SPORE_BLOSSOM);

        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.RED_ALLIUM, FBBlocks.POTTED_RED_ALLIUM, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.RED_CORNFLOWER, FBBlocks.POTTED_RED_CORNFLOWER, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.RED_DAISY, FBBlocks.POTTED_RED_DAISY, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.RED_TORCHFLOWER, FBBlocks.POTTED_RED_TORCHFLOWER, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.RED_AZURE_BLUET, FBBlocks.POTTED_RED_AZURE_BLUET, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.RED_DANDELION, FBBlocks.POTTED_RED_DANDELION, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.RED_ORCHID, FBBlocks.POTTED_RED_ORCHID, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.RED_LILY, FBBlocks.POTTED_RED_LILY, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.RED_WITHER_ROSE, FBBlocks.POTTED_RED_WITHER_ROSE, BlockStateModelGenerator.CrossType.NOT_TINTED);
        registerOpenEyeBlossomAndPot(blockStateModelGenerator, FBBlocks.OPEN_RED_EYEBLOSSOM, FBBlocks.POTTED_OPEN_RED_EYEBLOSSOM);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.CLOSED_RED_EYEBLOSSOM, FBBlocks.POTTED_CLOSED_RED_EYEBLOSSOM, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlockAndItem(FBBlocks.RED_LILAC, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlockAndItem(FBBlocks.RED_PEONY, BlockStateModelGenerator.CrossType.NOT_TINTED);
        registerPitcherPlant(blockStateModelGenerator, FBBlocks.RED_PITCHER_PLANT);
        registerSunflower(blockStateModelGenerator, FBBlocks.RED_SUNFLOWER);
        blockStateModelGenerator.registerFlowerbed(FBBlocks.RED_PETALS);
        blockStateModelGenerator.registerAzalea(FBBlocks.RED_FLOWERING_AZALEA);
        blockStateModelGenerator.registerPottedAzaleaBush(FBBlocks.POTTED_RED_FLOWERING_AZALEA_BUSH);
        blockStateModelGenerator.registerSingleton(FBBlocks.RED_FLOWERING_AZALEA_LEAVES, TexturedModel.LEAVES);
        registerSporeBlossom(blockStateModelGenerator, FBBlocks.RED_SPORE_BLOSSOM);

        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.YELLOW_ALLIUM, FBBlocks.POTTED_YELLOW_ALLIUM, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.YELLOW_CORNFLOWER, FBBlocks.POTTED_YELLOW_CORNFLOWER, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.YELLOW_DAISY, FBBlocks.POTTED_YELLOW_DAISY, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.YELLOW_TORCHFLOWER, FBBlocks.POTTED_YELLOW_TORCHFLOWER, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.YELLOW_TULIP, FBBlocks.POTTED_YELLOW_TULIP, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.YELLOW_AZURE_BLUET, FBBlocks.POTTED_YELLOW_AZURE_BLUET, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.YELLOW_ORCHID, FBBlocks.POTTED_YELLOW_ORCHID, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.YELLOW_LILY, FBBlocks.POTTED_YELLOW_LILY, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.YELLOW_POPPY, FBBlocks.POTTED_YELLOW_POPPY, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.YELLOW_WITHER_ROSE, FBBlocks.POTTED_YELLOW_WITHER_ROSE, BlockStateModelGenerator.CrossType.NOT_TINTED);
        registerOpenEyeBlossomAndPot(blockStateModelGenerator, FBBlocks.OPEN_YELLOW_EYEBLOSSOM, FBBlocks.POTTED_OPEN_YELLOW_EYEBLOSSOM);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.CLOSED_YELLOW_EYEBLOSSOM, FBBlocks.POTTED_CLOSED_YELLOW_EYEBLOSSOM, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlockAndItem(FBBlocks.YELLOW_LILAC, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlockAndItem(FBBlocks.YELLOW_PEONY, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlockAndItem(FBBlocks.YELLOW_ROSE_BUSH, BlockStateModelGenerator.CrossType.NOT_TINTED);
        registerPitcherPlant(blockStateModelGenerator, FBBlocks.YELLOW_PITCHER_PLANT);
        blockStateModelGenerator.registerFlowerbed(FBBlocks.YELLOW_PETALS);
        blockStateModelGenerator.registerAzalea(FBBlocks.YELLOW_FLOWERING_AZALEA);
        blockStateModelGenerator.registerPottedAzaleaBush(FBBlocks.POTTED_YELLOW_FLOWERING_AZALEA_BUSH);
        blockStateModelGenerator.registerSingleton(FBBlocks.YELLOW_FLOWERING_AZALEA_LEAVES, TexturedModel.LEAVES);
        registerSporeBlossom(blockStateModelGenerator, FBBlocks.YELLOW_SPORE_BLOSSOM);

        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.LIGHT_BLUE_ALLIUM, FBBlocks.POTTED_LIGHT_BLUE_ALLIUM, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.LIGHT_BLUE_CORNFLOWER, FBBlocks.POTTED_LIGHT_BLUE_CORNFLOWER, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.LIGHT_BLUE_DAISY, FBBlocks.POTTED_LIGHT_BLUE_DAISY, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.LIGHT_BLUE_TORCHFLOWER, FBBlocks.POTTED_LIGHT_BLUE_TORCHFLOWER, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.LIGHT_BLUE_TULIP, FBBlocks.POTTED_LIGHT_BLUE_TULIP, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.LIGHT_BLUE_AZURE_BLUET, FBBlocks.POTTED_LIGHT_BLUE_AZURE_BLUET, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.LIGHT_BLUE_DANDELION, FBBlocks.POTTED_LIGHT_BLUE_DANDELION, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.LIGHT_BLUE_LILY, FBBlocks.POTTED_LIGHT_BLUE_LILY, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.LIGHT_BLUE_POPPY, FBBlocks.POTTED_LIGHT_BLUE_POPPY, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.LIGHT_BLUE_WITHER_ROSE, FBBlocks.POTTED_LIGHT_BLUE_WITHER_ROSE, BlockStateModelGenerator.CrossType.NOT_TINTED);
        registerOpenEyeBlossomAndPot(blockStateModelGenerator, FBBlocks.OPEN_LIGHT_BLUE_EYEBLOSSOM, FBBlocks.POTTED_OPEN_LIGHT_BLUE_EYEBLOSSOM);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.CLOSED_LIGHT_BLUE_EYEBLOSSOM, FBBlocks.POTTED_CLOSED_LIGHT_BLUE_EYEBLOSSOM, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlockAndItem(FBBlocks.LIGHT_BLUE_LILAC, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlockAndItem(FBBlocks.LIGHT_BLUE_PEONY, BlockStateModelGenerator.CrossType.NOT_TINTED);
        registerPitcherPlant(blockStateModelGenerator, FBBlocks.LIGHT_BLUE_PITCHER_PLANT);
        blockStateModelGenerator.registerDoubleBlockAndItem(FBBlocks.LIGHT_BLUE_ROSE_BUSH, BlockStateModelGenerator.CrossType.NOT_TINTED);
        registerSunflower(blockStateModelGenerator, FBBlocks.LIGHT_BLUE_SUNFLOWER);
        blockStateModelGenerator.registerFlowerbed(FBBlocks.LIGHT_BLUE_PETALS);
        blockStateModelGenerator.registerAzalea(FBBlocks.LIGHT_BLUE_FLOWERING_AZALEA);
        blockStateModelGenerator.registerPottedAzaleaBush(FBBlocks.POTTED_LIGHT_BLUE_FLOWERING_AZALEA_BUSH);
        blockStateModelGenerator.registerSingleton(FBBlocks.LIGHT_BLUE_FLOWERING_AZALEA_LEAVES, TexturedModel.LEAVES);
        registerSporeBlossom(blockStateModelGenerator, FBBlocks.LIGHT_BLUE_SPORE_BLOSSOM);

        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.PINK_ALLIUM, FBBlocks.POTTED_PINK_ALLIUM, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.PINK_CORNFLOWER, FBBlocks.POTTED_PINK_CORNFLOWER, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.PINK_DAISY, FBBlocks.POTTED_PINK_DAISY, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.PINK_TORCHFLOWER, FBBlocks.POTTED_PINK_TORCHFLOWER, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.PINK_AZURE_BLUET, FBBlocks.POTTED_PINK_AZURE_BLUET, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.PINK_DANDELION, FBBlocks.POTTED_PINK_DANDELION, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.PINK_ORCHID, FBBlocks.POTTED_PINK_ORCHID, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.PINK_LILY, FBBlocks.POTTED_PINK_LILY, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.PINK_POPPY, FBBlocks.POTTED_PINK_POPPY, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.PINK_WITHER_ROSE, FBBlocks.POTTED_PINK_WITHER_ROSE, BlockStateModelGenerator.CrossType.NOT_TINTED);
        registerOpenEyeBlossomAndPot(blockStateModelGenerator, FBBlocks.OPEN_PINK_EYEBLOSSOM, FBBlocks.POTTED_OPEN_PINK_EYEBLOSSOM);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.CLOSED_PINK_EYEBLOSSOM, FBBlocks.POTTED_CLOSED_PINK_EYEBLOSSOM, BlockStateModelGenerator.CrossType.NOT_TINTED);
        registerPitcherPlant(blockStateModelGenerator, FBBlocks.PINK_PITCHER_PLANT);
        blockStateModelGenerator.registerDoubleBlockAndItem(FBBlocks.PINK_ROSE_BUSH, BlockStateModelGenerator.CrossType.NOT_TINTED);
        registerSunflower(blockStateModelGenerator, FBBlocks.PINK_SUNFLOWER);

        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.BLACK_ALLIUM, FBBlocks.POTTED_BLACK_ALLIUM, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.BLACK_CORNFLOWER, FBBlocks.POTTED_BLACK_CORNFLOWER, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.BLACK_DAISY, FBBlocks.POTTED_BLACK_DAISY, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.BLACK_TORCHFLOWER, FBBlocks.POTTED_BLACK_TORCHFLOWER, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.BLACK_TULIP, FBBlocks.POTTED_BLACK_TULIP, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.BLACK_AZURE_BLUET, FBBlocks.POTTED_BLACK_AZURE_BLUET, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.BLACK_DANDELION, FBBlocks.POTTED_BLACK_DANDELION, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.BLACK_ORCHID, FBBlocks.POTTED_BLACK_ORCHID, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.BLACK_LILY, FBBlocks.POTTED_BLACK_LILY, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.BLACK_POPPY, FBBlocks.POTTED_BLACK_POPPY, BlockStateModelGenerator.CrossType.NOT_TINTED);
        registerOpenEyeBlossomAndPot(blockStateModelGenerator, FBBlocks.OPEN_BLACK_EYEBLOSSOM, FBBlocks.POTTED_OPEN_BLACK_EYEBLOSSOM);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.CLOSED_BLACK_EYEBLOSSOM, FBBlocks.POTTED_CLOSED_BLACK_EYEBLOSSOM, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlockAndItem(FBBlocks.BLACK_LILAC, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlockAndItem(FBBlocks.BLACK_PEONY, BlockStateModelGenerator.CrossType.NOT_TINTED);
        registerPitcherPlant(blockStateModelGenerator, FBBlocks.BLACK_PITCHER_PLANT);
        blockStateModelGenerator.registerDoubleBlockAndItem(FBBlocks.BLACK_ROSE_BUSH, BlockStateModelGenerator.CrossType.NOT_TINTED);
        registerSunflower(blockStateModelGenerator, FBBlocks.BLACK_SUNFLOWER);
        blockStateModelGenerator.registerFlowerbed(FBBlocks.BLACK_PETALS);
        blockStateModelGenerator.registerAzalea(FBBlocks.BLACK_FLOWERING_AZALEA);
        blockStateModelGenerator.registerPottedAzaleaBush(FBBlocks.POTTED_BLACK_FLOWERING_AZALEA_BUSH);
        blockStateModelGenerator.registerSingleton(FBBlocks.BLACK_FLOWERING_AZALEA_LEAVES, TexturedModel.LEAVES);
        registerSporeBlossom(blockStateModelGenerator, FBBlocks.BLACK_SPORE_BLOSSOM);

        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.CYAN_ALLIUM, FBBlocks.POTTED_CYAN_ALLIUM, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.CYAN_CORNFLOWER, FBBlocks.POTTED_CYAN_CORNFLOWER, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.CYAN_DAISY, FBBlocks.POTTED_CYAN_DAISY, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.CYAN_TORCHFLOWER, FBBlocks.POTTED_CYAN_TORCHFLOWER, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.CYAN_TULIP, FBBlocks.POTTED_CYAN_TULIP, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.CYAN_AZURE_BLUET, FBBlocks.POTTED_CYAN_AZURE_BLUET, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.CYAN_DANDELION, FBBlocks.POTTED_CYAN_DANDELION, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.CYAN_ORCHID, FBBlocks.POTTED_CYAN_ORCHID, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.CYAN_LILY, FBBlocks.POTTED_CYAN_LILY, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.CYAN_POPPY, FBBlocks.POTTED_CYAN_POPPY, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.CYAN_WITHER_ROSE, FBBlocks.POTTED_CYAN_WITHER_ROSE, BlockStateModelGenerator.CrossType.NOT_TINTED);
        registerOpenEyeBlossomAndPot(blockStateModelGenerator, FBBlocks.OPEN_CYAN_EYEBLOSSOM, FBBlocks.POTTED_OPEN_CYAN_EYEBLOSSOM);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.CLOSED_CYAN_EYEBLOSSOM, FBBlocks.POTTED_CLOSED_CYAN_EYEBLOSSOM, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlockAndItem(FBBlocks.CYAN_LILAC, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlockAndItem(FBBlocks.CYAN_PEONY, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlockAndItem(FBBlocks.CYAN_ROSE_BUSH, BlockStateModelGenerator.CrossType.NOT_TINTED);
        registerSunflower(blockStateModelGenerator, FBBlocks.CYAN_SUNFLOWER);
        blockStateModelGenerator.registerFlowerbed(FBBlocks.CYAN_PETALS);
        blockStateModelGenerator.registerAzalea(FBBlocks.CYAN_FLOWERING_AZALEA);
        blockStateModelGenerator.registerPottedAzaleaBush(FBBlocks.POTTED_CYAN_FLOWERING_AZALEA_BUSH);
        blockStateModelGenerator.registerSingleton(FBBlocks.CYAN_FLOWERING_AZALEA_LEAVES, TexturedModel.LEAVES);
        registerSporeBlossom(blockStateModelGenerator, FBBlocks.CYAN_SPORE_BLOSSOM);

        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.MAGENTA_DAFFODIL, FBBlocks.POTTED_MAGENTA_DAFFODIL, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.BLUE_DAFFODIL, FBBlocks.POTTED_BLUE_DAFFODIL, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.WHITE_DAFFODIL, FBBlocks.POTTED_WHITE_DAFFODIL, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.ORANGE_DAFFODIL, FBBlocks.POTTED_ORANGE_DAFFODIL, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.RED_DAFFODIL, FBBlocks.POTTED_RED_DAFFODIL, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.YELLOW_DAFFODIL, FBBlocks.POTTED_YELLOW_DAFFODIL, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.LIGHT_BLUE_DAFFODIL, FBBlocks.POTTED_LIGHT_BLUE_DAFFODIL, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.PINK_DAFFODIL, FBBlocks.POTTED_PINK_DAFFODIL, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.BLACK_DAFFODIL, FBBlocks.POTTED_BLACK_DAFFODIL, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.CYAN_DAFFODIL, FBBlocks.POTTED_CYAN_DAFFODIL, BlockStateModelGenerator.CrossType.NOT_TINTED);

        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.MAGENTA_FOXGLOVE, FBBlocks.POTTED_MAGENTA_FOXGLOVE, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.BLUE_FOXGLOVE, FBBlocks.POTTED_BLUE_FOXGLOVE, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.WHITE_FOXGLOVE, FBBlocks.POTTED_WHITE_FOXGLOVE, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.ORANGE_FOXGLOVE, FBBlocks.POTTED_ORANGE_FOXGLOVE, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.RED_FOXGLOVE, FBBlocks.POTTED_RED_FOXGLOVE, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.YELLOW_FOXGLOVE, FBBlocks.POTTED_YELLOW_FOXGLOVE, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.LIGHT_BLUE_FOXGLOVE, FBBlocks.POTTED_LIGHT_BLUE_FOXGLOVE, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.PINK_FOXGLOVE, FBBlocks.POTTED_PINK_FOXGLOVE, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.BLACK_FOXGLOVE, FBBlocks.POTTED_BLACK_FOXGLOVE, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.CYAN_FOXGLOVE, FBBlocks.POTTED_CYAN_FOXGLOVE, BlockStateModelGenerator.CrossType.NOT_TINTED);

        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.MAGENTA_HYACINTH, FBBlocks.POTTED_MAGENTA_HYACINTH, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.BLUE_HYACINTH, FBBlocks.POTTED_BLUE_HYACINTH, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.WHITE_HYACINTH, FBBlocks.POTTED_WHITE_HYACINTH, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.ORANGE_HYACINTH, FBBlocks.POTTED_ORANGE_HYACINTH, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.RED_HYACINTH, FBBlocks.POTTED_RED_HYACINTH, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.YELLOW_HYACINTH, FBBlocks.POTTED_YELLOW_HYACINTH, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.LIGHT_BLUE_HYACINTH, FBBlocks.POTTED_LIGHT_BLUE_HYACINTH, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.PINK_HYACINTH, FBBlocks.POTTED_PINK_HYACINTH, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.BLACK_HYACINTH, FBBlocks.POTTED_BLACK_HYACINTH, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.CYAN_HYACINTH, FBBlocks.POTTED_CYAN_HYACINTH, BlockStateModelGenerator.CrossType.NOT_TINTED);

        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.MAGENTA_PHLOX, FBBlocks.POTTED_MAGENTA_PHLOX, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.BLUE_PHLOX, FBBlocks.POTTED_BLUE_PHLOX, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.WHITE_PHLOX, FBBlocks.POTTED_WHITE_PHLOX, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.ORANGE_PHLOX, FBBlocks.POTTED_ORANGE_PHLOX, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.RED_PHLOX, FBBlocks.POTTED_RED_PHLOX, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.YELLOW_PHLOX, FBBlocks.POTTED_YELLOW_PHLOX, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.LIGHT_BLUE_PHLOX, FBBlocks.POTTED_LIGHT_BLUE_PHLOX, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.PINK_PHLOX, FBBlocks.POTTED_PINK_PHLOX, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.BLACK_PHLOX, FBBlocks.POTTED_BLACK_PHLOX, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.CYAN_PHLOX, FBBlocks.POTTED_CYAN_PHLOX, BlockStateModelGenerator.CrossType.NOT_TINTED);

        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.MAGENTA_LUPIN, FBBlocks.POTTED_MAGENTA_LUPIN, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.BLUE_LUPIN, FBBlocks.POTTED_BLUE_LUPIN, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.WHITE_LUPIN, FBBlocks.POTTED_WHITE_LUPIN, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.ORANGE_LUPIN, FBBlocks.POTTED_ORANGE_LUPIN, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.RED_LUPIN, FBBlocks.POTTED_RED_LUPIN, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.YELLOW_LUPIN, FBBlocks.POTTED_YELLOW_LUPIN, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.LIGHT_BLUE_LUPIN, FBBlocks.POTTED_LIGHT_BLUE_LUPIN, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.PINK_LUPIN, FBBlocks.POTTED_PINK_LUPIN, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.BLACK_LUPIN, FBBlocks.POTTED_BLACK_LUPIN, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.CYAN_LUPIN, FBBlocks.POTTED_CYAN_LUPIN, BlockStateModelGenerator.CrossType.NOT_TINTED);

        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.MAGENTA_SMALL_ROSE, FBBlocks.POTTED_MAGENTA_SMALL_ROSE, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.BLUE_SMALL_ROSE, FBBlocks.POTTED_BLUE_SMALL_ROSE, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.WHITE_SMALL_ROSE, FBBlocks.POTTED_WHITE_SMALL_ROSE, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.ORANGE_SMALL_ROSE, FBBlocks.POTTED_ORANGE_SMALL_ROSE, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.RED_SMALL_ROSE, FBBlocks.POTTED_RED_SMALL_ROSE, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.YELLOW_SMALL_ROSE, FBBlocks.POTTED_YELLOW_SMALL_ROSE, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.LIGHT_BLUE_SMALL_ROSE, FBBlocks.POTTED_LIGHT_BLUE_SMALL_ROSE, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.PINK_SMALL_ROSE, FBBlocks.POTTED_PINK_SMALL_ROSE, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.BLACK_SMALL_ROSE, FBBlocks.POTTED_BLACK_SMALL_ROSE, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.CYAN_SMALL_ROSE, FBBlocks.POTTED_CYAN_SMALL_ROSE, BlockStateModelGenerator.CrossType.NOT_TINTED);

        blockStateModelGenerator.registerTintableCross(FBBlocks.MAGENTA_HYDRANGEA, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(FBBlocks.BLUE_HYDRANGEA, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(FBBlocks.WHITE_HYDRANGEA, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(FBBlocks.ORANGE_HYDRANGEA, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(FBBlocks.RED_HYDRANGEA, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(FBBlocks.YELLOW_HYDRANGEA, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(FBBlocks.LIGHT_BLUE_HYDRANGEA, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(FBBlocks.PINK_HYDRANGEA, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(FBBlocks.BLACK_HYDRANGEA, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(FBBlocks.CYAN_HYDRANGEA, BlockStateModelGenerator.CrossType.NOT_TINTED);

        blockStateModelGenerator.registerDoubleBlockAndItem(FBBlocks.MAGENTA_LAVENDER, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlockAndItem(FBBlocks.BLUE_LAVENDER, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlockAndItem(FBBlocks.WHITE_LAVENDER, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlockAndItem(FBBlocks.ORANGE_LAVENDER, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlockAndItem(FBBlocks.RED_LAVENDER, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlockAndItem(FBBlocks.YELLOW_LAVENDER, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlockAndItem(FBBlocks.LIGHT_BLUE_LAVENDER, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlockAndItem(FBBlocks.PINK_LAVENDER, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlockAndItem(FBBlocks.BLACK_LAVENDER, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlockAndItem(FBBlocks.CYAN_LAVENDER, BlockStateModelGenerator.CrossType.NOT_TINTED);

        registerTipPlant(blockStateModelGenerator, FBBlocks.MAGENTA_JASMINE);
        registerTipPlant(blockStateModelGenerator, FBBlocks.BLUE_JASMINE);
        registerTipPlant(blockStateModelGenerator, FBBlocks.WHITE_JASMINE);
        registerTipPlant(blockStateModelGenerator, FBBlocks.ORANGE_JASMINE);
        registerTipPlant(blockStateModelGenerator, FBBlocks.RED_JASMINE);
        registerTipPlant(blockStateModelGenerator, FBBlocks.YELLOW_JASMINE);
        registerTipPlant(blockStateModelGenerator, FBBlocks.LIGHT_BLUE_JASMINE);
        registerTipPlant(blockStateModelGenerator, FBBlocks.PINK_JASMINE);
        registerTipPlant(blockStateModelGenerator, FBBlocks.BLACK_JASMINE);
        registerTipPlant(blockStateModelGenerator, FBBlocks.CYAN_JASMINE);

        registerCyprusVine(blockStateModelGenerator, FBBlocks.MAGENTA_CYPRUS_VINE);
        registerCyprusVine(blockStateModelGenerator, FBBlocks.BLUE_CYPRUS_VINE);
        registerCyprusVine(blockStateModelGenerator, FBBlocks.WHITE_CYPRUS_VINE);
        registerCyprusVine(blockStateModelGenerator, FBBlocks.ORANGE_CYPRUS_VINE);
        registerCyprusVine(blockStateModelGenerator, FBBlocks.RED_CYPRUS_VINE);
        registerCyprusVine(blockStateModelGenerator, FBBlocks.YELLOW_CYPRUS_VINE);
        registerCyprusVine(blockStateModelGenerator, FBBlocks.LIGHT_BLUE_CYPRUS_VINE);
        registerCyprusVine(blockStateModelGenerator, FBBlocks.PINK_CYPRUS_VINE);
        registerCyprusVine(blockStateModelGenerator, FBBlocks.BLACK_CYPRUS_VINE);
        registerCyprusVine(blockStateModelGenerator, FBBlocks.CYAN_CYPRUS_VINE);

        registerLotusFlower(blockStateModelGenerator, FBBlocks.MAGENTA_LOTUS_FLOWER);
        registerLotusFlower(blockStateModelGenerator, FBBlocks.BLUE_LOTUS_FLOWER);
        registerLotusFlower(blockStateModelGenerator, FBBlocks.WHITE_LOTUS_FLOWER);
        registerLotusFlower(blockStateModelGenerator, FBBlocks.ORANGE_LOTUS_FLOWER);
        registerLotusFlower(blockStateModelGenerator, FBBlocks.RED_LOTUS_FLOWER);
        registerLotusFlower(blockStateModelGenerator, FBBlocks.YELLOW_LOTUS_FLOWER);
        registerLotusFlower(blockStateModelGenerator, FBBlocks.LIGHT_BLUE_LOTUS_FLOWER);
        registerLotusFlower(blockStateModelGenerator, FBBlocks.PINK_LOTUS_FLOWER);
        registerLotusFlower(blockStateModelGenerator, FBBlocks.BLACK_LOTUS_FLOWER);
        registerLotusFlower(blockStateModelGenerator, FBBlocks.CYAN_LOTUS_FLOWER);

        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.MAGENTA_GLOWSHROOM, FBBlocks.POTTED_MAGENTA_GLOWSHROOM, BlockStateModelGenerator.CrossType.NOT_TINTED);
        FBBlockStateSuppliers.registerGlowshroomBlock(blockStateModelGenerator, FBBlocks.MAGENTA_GLOWSHROOM_BLOCK);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.BLUE_GLOWSHROOM, FBBlocks.POTTED_BLUE_GLOWSHROOM, BlockStateModelGenerator.CrossType.NOT_TINTED);
        FBBlockStateSuppliers.registerGlowshroomBlock(blockStateModelGenerator, FBBlocks.BLUE_GLOWSHROOM_BLOCK);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.WHITE_GLOWSHROOM, FBBlocks.POTTED_WHITE_GLOWSHROOM, BlockStateModelGenerator.CrossType.NOT_TINTED);
        FBBlockStateSuppliers.registerGlowshroomBlock(blockStateModelGenerator, FBBlocks.WHITE_GLOWSHROOM_BLOCK);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.ORANGE_GLOWSHROOM, FBBlocks.POTTED_ORANGE_GLOWSHROOM, BlockStateModelGenerator.CrossType.NOT_TINTED);
        FBBlockStateSuppliers.registerGlowshroomBlock(blockStateModelGenerator, FBBlocks.ORANGE_GLOWSHROOM_BLOCK);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.RED_GLOWSHROOM, FBBlocks.POTTED_RED_GLOWSHROOM, BlockStateModelGenerator.CrossType.NOT_TINTED);
        FBBlockStateSuppliers.registerGlowshroomBlock(blockStateModelGenerator, FBBlocks.RED_GLOWSHROOM_BLOCK);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.YELLOW_GLOWSHROOM, FBBlocks.POTTED_YELLOW_GLOWSHROOM, BlockStateModelGenerator.CrossType.NOT_TINTED);
        FBBlockStateSuppliers.registerGlowshroomBlock(blockStateModelGenerator, FBBlocks.YELLOW_GLOWSHROOM_BLOCK);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.LIGHT_BLUE_GLOWSHROOM, FBBlocks.POTTED_LIGHT_BLUE_GLOWSHROOM, BlockStateModelGenerator.CrossType.NOT_TINTED);
        FBBlockStateSuppliers.registerGlowshroomBlock(blockStateModelGenerator, FBBlocks.LIGHT_BLUE_GLOWSHROOM_BLOCK);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.PINK_GLOWSHROOM, FBBlocks.POTTED_PINK_GLOWSHROOM, BlockStateModelGenerator.CrossType.NOT_TINTED);
        FBBlockStateSuppliers.registerGlowshroomBlock(blockStateModelGenerator, FBBlocks.PINK_GLOWSHROOM_BLOCK);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.BLACK_GLOWSHROOM, FBBlocks.POTTED_BLACK_GLOWSHROOM, BlockStateModelGenerator.CrossType.NOT_TINTED);
        FBBlockStateSuppliers.registerGlowshroomBlock(blockStateModelGenerator, FBBlocks.BLACK_GLOWSHROOM_BLOCK);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.CYAN_GLOWSHROOM, FBBlocks.POTTED_CYAN_GLOWSHROOM, BlockStateModelGenerator.CrossType.NOT_TINTED);
        FBBlockStateSuppliers.registerGlowshroomBlock(blockStateModelGenerator, FBBlocks.CYAN_GLOWSHROOM_BLOCK);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.GREEN_GLOWSHROOM, FBBlocks.POTTED_GREEN_GLOWSHROOM, BlockStateModelGenerator.CrossType.NOT_TINTED);
        FBBlockStateSuppliers.registerGlowshroomBlock(blockStateModelGenerator, FBBlocks.GREEN_GLOWSHROOM_BLOCK);

        registerTipPlant(blockStateModelGenerator, FBBlocks.CATTAILS);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.SAGE, FBBlocks.POTTED_SAGE, BlockStateModelGenerator.CrossType.NOT_TINTED);

        registerFlowerbedBlock(blockStateModelGenerator, FBBlocks.DIRT_FLOWERBED, getId(Blocks.DIRT), getId(Blocks.DIRT));
        registerFlowerbedBlock(blockStateModelGenerator, FBBlocks.FARMLAND_FLOWERBED, getId(Blocks.DIRT), getId(Blocks.DIRT));
        registerFlowerbedBlock(blockStateModelGenerator, FBBlocks.PODZOL_FLOWERBED, Identifier.of(getId(Blocks.PODZOL) + "_side"), getId(Blocks.DIRT));
        registerFlowerbedBlock(blockStateModelGenerator, FBBlocks.MOSS_FLOWERBED, getId(Blocks.MOSS_BLOCK), getId(Blocks.MOSS_BLOCK));
        blockStateModelGenerator.registerTintedItemModel(FBBlocks.GRASS_FLOWERBED, Identifier.of(FlowerBreeding.MOD_ID, "block/grass_flowerbed"), new GrassTintSource());

        registerVase(blockStateModelGenerator, FBBlocks.WHITE_VASE, Blocks.WHITE_TERRACOTTA);
        registerVase(blockStateModelGenerator, FBBlocks.LIGHT_GRAY_VASE, Blocks.LIGHT_GRAY_TERRACOTTA);
        registerVase(blockStateModelGenerator, FBBlocks.GRAY_VASE, Blocks.GRAY_TERRACOTTA);
        registerVase(blockStateModelGenerator, FBBlocks.BLACK_VASE, Blocks.BLACK_TERRACOTTA);
        registerVase(blockStateModelGenerator, FBBlocks.BROWN_VASE, Blocks.BROWN_TERRACOTTA);
        registerVase(blockStateModelGenerator, FBBlocks.RED_VASE, Blocks.RED_TERRACOTTA);
        registerVase(blockStateModelGenerator, FBBlocks.ORANGE_VASE, Blocks.ORANGE_TERRACOTTA);
        registerVase(blockStateModelGenerator, FBBlocks.YELLOW_VASE, Blocks.YELLOW_TERRACOTTA);
        registerVase(blockStateModelGenerator, FBBlocks.LIME_VASE, Blocks.LIME_TERRACOTTA);
        registerVase(blockStateModelGenerator, FBBlocks.GREEN_VASE, Blocks.GREEN_TERRACOTTA);
        registerVase(blockStateModelGenerator, FBBlocks.CYAN_VASE, Blocks.CYAN_TERRACOTTA);
        registerVase(blockStateModelGenerator, FBBlocks.LIGHT_BLUE_VASE, Blocks.LIGHT_BLUE_TERRACOTTA);
        registerVase(blockStateModelGenerator, FBBlocks.BLUE_VASE, Blocks.BLUE_TERRACOTTA);
        registerVase(blockStateModelGenerator, FBBlocks.PURPLE_VASE, Blocks.PURPLE_TERRACOTTA);
        registerVase(blockStateModelGenerator, FBBlocks.MAGENTA_VASE, Blocks.MAGENTA_TERRACOTTA);
        registerVase(blockStateModelGenerator, FBBlocks.PINK_VASE, Blocks.PINK_TERRACOTTA);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(FBItems.EMPTY_PIGMENT_JAR, Models.GENERATED);
        itemModelGenerator.register(FBItems.MAGENTA_PIGMENT_JAR, Models.GENERATED);
        itemModelGenerator.register(FBItems.BLUE_PIGMENT_JAR, Models.GENERATED);
        itemModelGenerator.register(FBItems.WHITE_PIGMENT_JAR, Models.GENERATED);
        itemModelGenerator.register(FBItems.ORANGE_PIGMENT_JAR, Models.GENERATED);
        itemModelGenerator.register(FBItems.RED_PIGMENT_JAR, Models.GENERATED);
        itemModelGenerator.register(FBItems.YELLOW_PIGMENT_JAR, Models.GENERATED);
        itemModelGenerator.register(FBItems.LIGHT_BLUE_PIGMENT_JAR, Models.GENERATED);
        itemModelGenerator.register(FBItems.PINK_PIGMENT_JAR, Models.GENERATED);
        itemModelGenerator.register(FBItems.BLACK_PIGMENT_JAR, Models.GENERATED);
        itemModelGenerator.register(FBItems.CYAN_PIGMENT_JAR, Models.GENERATED);

        itemModelGenerator.register(FBItems.EMPTY_POLLEN_VIAL, Models.GENERATED);
        itemModelGenerator.register(FBItems.ALLIUM_POLLEN_VIAL, Models.GENERATED);
        itemModelGenerator.registerWithTextureSource(FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, Models.GENERATED);
        itemModelGenerator.registerWithTextureSource(FBItems.DAISY_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, Models.GENERATED);
        itemModelGenerator.registerWithTextureSource(FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, Models.GENERATED);
        itemModelGenerator.registerWithTextureSource(FBItems.TULIP_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, Models.GENERATED);
        itemModelGenerator.registerWithTextureSource(FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, Models.GENERATED);
        itemModelGenerator.registerWithTextureSource(FBItems.DANDELION_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, Models.GENERATED);
        itemModelGenerator.registerWithTextureSource(FBItems.ORCHID_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, Models.GENERATED);
        itemModelGenerator.registerWithTextureSource(FBItems.LILY_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, Models.GENERATED);
        itemModelGenerator.registerWithTextureSource(FBItems.POPPY_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, Models.GENERATED);
        itemModelGenerator.registerWithTextureSource(FBItems.WITHER_ROSE_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, Models.GENERATED);
        itemModelGenerator.registerWithTextureSource(FBItems.EYEBLOSSOM_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, Models.GENERATED);
        itemModelGenerator.registerWithTextureSource(FBItems.LILAC_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, Models.GENERATED);
        itemModelGenerator.registerWithTextureSource(FBItems.PEONY_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, Models.GENERATED);
        itemModelGenerator.registerWithTextureSource(FBItems.PITCHER_PLANT_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, Models.GENERATED);
        itemModelGenerator.registerWithTextureSource(FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, Models.GENERATED);
        itemModelGenerator.registerWithTextureSource(FBItems.SUNFLOWER_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, Models.GENERATED);
        itemModelGenerator.registerWithTextureSource(FBItems.PETAL_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, Models.GENERATED);
        itemModelGenerator.registerWithTextureSource(FBItems.SPORE_BLOSSOM_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, Models.GENERATED);
        itemModelGenerator.registerWithTextureSource(FBItems.FLOWERING_AZALEA_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, Models.GENERATED);
        itemModelGenerator.registerWithTextureSource(FBItems.FLOWERING_AZALEA_LEAVES_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, Models.GENERATED);
        itemModelGenerator.registerWithTextureSource(FBItems.LILY_PAD_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, Models.GENERATED);
        itemModelGenerator.registerWithTextureSource(FBItems.SWEET_BERRY_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, Models.GENERATED);
        itemModelGenerator.registerWithTextureSource(FBItems.VINE_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, Models.GENERATED);
        itemModelGenerator.registerWithTextureSource(FBItems.GLOW_VINE_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, Models.GENERATED);
        itemModelGenerator.registerWithTextureSource(FBItems.MUSHROOM_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, Models.GENERATED);
        itemModelGenerator.registerWithTextureSource(FBItems.FROGLIGHT_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, Models.GENERATED);

        itemModelGenerator.register(FBBlocks.CLIMBING_IVY.asItem(), Models.GENERATED);

        itemModelGenerator.register(FBBlocks.PLANTER.asItem(), Models.GENERATED);

        itemModelGenerator.register(FBItems.TROWEL, Models.GENERATED);

        itemModelGenerator.register(FBItems.FLORAL_SMITHING_TEMPLATE, Models.GENERATED);
    }

    private static void registerOpenEyeBlossomAndPot(BlockStateModelGenerator blockStateModelGenerator, Block eyeblossomBlock, Block potBlock) {
        Identifier emissive = Identifier.of(getId(eyeblossomBlock) + "_emissive");
        Identifier eyeblossomId = new Model(Optional.of(Identifier.of(FlowerBreeding.MOD_ID, "block/" + "open_eyeblossom")), Optional.empty(), TextureKey.CROSS_EMISSIVE).upload(eyeblossomBlock, new TextureMap().put(TextureKey.CROSS_EMISSIVE, emissive), blockStateModelGenerator.modelCollector);
        Identifier potId = new Model(Optional.of(Identifier.of(FlowerBreeding.MOD_ID, "block/" + "potted_open_eyeblossom")), Optional.empty(), TextureKey.CROSS_EMISSIVE).upload(potBlock, new TextureMap().put(TextureKey.CROSS_EMISSIVE, emissive), blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(createSingletonBlockState(eyeblossomBlock, createWeightedVariant(eyeblossomId)));
        blockStateModelGenerator.blockStateCollector.accept(createSingletonBlockState(potBlock, createWeightedVariant(potId)));
        Identifier model = Models.GENERATED_TWO_LAYERS.upload(ModelIds.getItemModelId(eyeblossomBlock.asItem()), TextureMap.layered(Identifier.ofVanilla("block/" + "open_eyeblossom"), emissive), blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.registerItemModel(eyeblossomBlock.asItem(), model);
    }

    private static void registerSunflower(BlockStateModelGenerator blockStateModelGenerator, Block block) {
        Identifier front = Identifier.of(getId(block) + "_front");
        Identifier lowerId = Identifier.ofVanilla("block/" + "sunflower_bottom");
        Identifier upperId = new Model(Optional.of(Identifier.of(FlowerBreeding.MOD_ID, "block/" + "sunflower_top")), Optional.empty(), TextureKey.FRONT).upload(block, "_front", new TextureMap().put(TextureKey.FRONT, front), blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(FBBlockStateSuppliers.createDoubleBlockState(block, createWeightedVariant(lowerId), createWeightedVariant(upperId)));
        registerItemModelFromTextureSource(blockStateModelGenerator, block, front);
    }

    private static void registerPitcherPlant(BlockStateModelGenerator blockStateModelGenerator, Block block) {
        Identifier bottom = Identifier.of(getId(block) + "_bottom");
        Identifier top = Identifier.of(getId(block) + "_top");
        Identifier lowerId = new Model(Optional.of(Identifier.of(FlowerBreeding.MOD_ID, "block/" + "pitcher_plant_bottom")), Optional.empty(), TextureKey.BOTTOM).upload(block, "_bottom", new TextureMap().put(TextureKey.BOTTOM, bottom), blockStateModelGenerator.modelCollector);
        Identifier upperId = new Model(Optional.of(Identifier.of(FlowerBreeding.MOD_ID, "block/" + "pitcher_plant_top")), Optional.empty(), TextureKey.TOP).upload(block, "_top", new TextureMap().put(TextureKey.TOP, top), blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(FBBlockStateSuppliers.createDoubleBlockState(block, createWeightedVariant(lowerId), createWeightedVariant(upperId)));
        registerItemModelFromTextureSource(blockStateModelGenerator, block, top);
    }

    private static void registerSporeBlossom(BlockStateModelGenerator blockStateModelGenerator, Block block) {
        Identifier identifier = new Model(Optional.of(Identifier.of(FlowerBreeding.MOD_ID, "block/" + "spore_blossom")), Optional.empty(), TextureKey.PLANT).upload(block, new TextureMap().put(TextureKey.PLANT, getId(block)), blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(createSingletonBlockState(block, createWeightedVariant(identifier)));
    }

    private static void registerTipPlant(BlockStateModelGenerator blockStateModelGenerator, Block block) {
        Identifier regular = new Model(Optional.of(Identifier.ofVanilla("block/" + "cross")), Optional.empty(), TextureKey.CROSS).upload(block, new TextureMap().put(TextureKey.CROSS, getId(block)), blockStateModelGenerator.modelCollector);
        Identifier tip = new Model(Optional.of(Identifier.ofVanilla("block/" + "cross")), Optional.empty(), TextureKey.CROSS).upload(block, "_tip", new TextureMap().put(TextureKey.CROSS, Identifier.of(getId(block) + "_tip")), blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(FBBlockStateSuppliers.createTipPlantState(block, createWeightedVariant(regular), createWeightedVariant(tip)));
        registerItemModelFromTextureSource(blockStateModelGenerator, block, Identifier.of(getId(block) + "_tip"));
    }

    private static void registerCyprusVine(BlockStateModelGenerator blockStateModelGenerator, Block block) {
        blockStateModelGenerator.registerMultifaceBlockModel(block);
        new Model(Optional.of(Identifier.of(FlowerBreeding.MOD_ID, "block/" + "cyprus_vine")), Optional.empty(), TextureKey.PLANT).upload(block, new TextureMap().put(TextureKey.PLANT, getId(block)), blockStateModelGenerator.modelCollector);
        registerItemModelFromTextureSource(blockStateModelGenerator, block, getId(block));
    }

    private static void registerLotusFlower(BlockStateModelGenerator blockStateModelGenerator, Block block) {
        Identifier identifier = new Model(Optional.of(Identifier.of(FlowerBreeding.MOD_ID, "block/" + "lotus_flower")), Optional.empty(), TextureKey.FAN).upload(block, new TextureMap().put(TextureKey.FAN, getId(block)), blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockModelDefinitionCreator.of(block, modelWithYRotation(createModelVariant(identifier))));
        registerItemModelFromTextureSource(blockStateModelGenerator, block, getItemId(block));
    }

    private static void registerFlowerbedBlock(BlockStateModelGenerator blockStateModelGenerator, Block block, Identifier side, Identifier bottom) {
        Identifier identifier = new Model(Optional.of(Identifier.ofVanilla("block/" + "cube_bottom_top")), Optional.empty(), TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE).upload(block,
                new TextureMap().put(TextureKey.TOP, Identifier.of(getId(block) + "_top")).put(TextureKey.SIDE, side).put(TextureKey.BOTTOM, bottom), blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(createSingletonBlockState(block, createWeightedVariant(identifier)));
    }

    private static void registerVase(BlockStateModelGenerator blockStateModelGenerator, Block block, Block textureSource) {
        Identifier identifier = new Model(Optional.of(Identifier.of(FlowerBreeding.MOD_ID, "block/" + "vase")), Optional.empty(), TextureKey.SIDE).upload(block, new TextureMap().put(TextureKey.SIDE, getId(textureSource)), blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(createSingletonBlockState(block, createWeightedVariant(identifier)));
    }

    private static void registerItemModelFromTextureSource(BlockStateModelGenerator blockStateModelGenerator, Block block, Identifier textureSource) {
        Identifier identifier = Models.GENERATED.upload(block.asItem(), new TextureMap().put(TextureKey.LAYER0, textureSource), blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.registerItemModel(block.asItem(), identifier);
    }

    public static ModelVariant createModelVariant(Identifier id) {
        return new ModelVariant(id);
    }

    public static WeightedVariant createWeightedVariant(ModelVariant variant) {
        return new WeightedVariant(Pool.of(variant));
    }

    public static WeightedVariant createWeightedVariant(Identifier id) {
        return createWeightedVariant(createModelVariant(id));
    }

    private static Identifier getId(Block block) {
        Identifier identifier = Registries.BLOCK.getId(block);
        return identifier.withPrefixedPath("block/");
    }

    private static Identifier getItemId(Block block) {
        Identifier identifier = Registries.ITEM.getId(block.asItem());
        return identifier.withPrefixedPath("item/");
    }
}
