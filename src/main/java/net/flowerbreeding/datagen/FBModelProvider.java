package net.flowerbreeding.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.flowerbreeding.FBBlocks;
import net.flowerbreeding.FBItems;
import net.flowerbreeding.FlowerBreeding;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.BlockModelGenerators.PlantType;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.client.data.models.model.ModelLocationUtils;
import net.minecraft.client.data.models.model.ModelTemplate;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.client.data.models.model.TexturedModel;
import net.minecraft.client.renderer.block.dispatch.Variant;
import net.minecraft.client.resources.model.sprite.Material;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.client.data.*;
import net.minecraft.client.color.item.GrassColorSource;
import net.minecraft.client.data.models.MultiVariant;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;

import java.util.Optional;

import static net.minecraft.client.data.models.BlockModelGenerators.*;

public class FBModelProvider extends FabricModelProvider {

    public FBModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {

        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.MAGENTA_CORNFLOWER, FBBlocks.POTTED_MAGENTA_CORNFLOWER, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.MAGENTA_DAISY, FBBlocks.POTTED_MAGENTA_DAISY, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.MAGENTA_TORCHFLOWER, FBBlocks.POTTED_MAGENTA_TORCHFLOWER, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.MAGENTA_TULIP, FBBlocks.POTTED_MAGENTA_TULIP, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.MAGENTA_AZURE_BLUET, FBBlocks.POTTED_MAGENTA_AZURE_BLUET, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.MAGENTA_DANDELION, FBBlocks.POTTED_MAGENTA_DANDELION, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.MAGENTA_ORCHID, FBBlocks.POTTED_MAGENTA_ORCHID, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.MAGENTA_LILY, FBBlocks.POTTED_MAGENTA_LILY, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.MAGENTA_POPPY, FBBlocks.POTTED_MAGENTA_POPPY, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.MAGENTA_WITHER_ROSE, FBBlocks.POTTED_MAGENTA_WITHER_ROSE, BlockModelGenerators.PlantType.NOT_TINTED);
        registerOpenEyeBlossomAndPot(blockStateModelGenerator, FBBlocks.OPEN_MAGENTA_EYEBLOSSOM, FBBlocks.POTTED_OPEN_MAGENTA_EYEBLOSSOM);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.CLOSED_MAGENTA_EYEBLOSSOM, FBBlocks.POTTED_CLOSED_MAGENTA_EYEBLOSSOM, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createDoublePlantWithDefaultItem(FBBlocks.MAGENTA_LILAC, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createDoublePlantWithDefaultItem(FBBlocks.MAGENTA_PEONY, BlockModelGenerators.PlantType.NOT_TINTED);
        registerPitcherPlant(blockStateModelGenerator, FBBlocks.MAGENTA_PITCHER_PLANT);
        blockStateModelGenerator.createDoublePlantWithDefaultItem(FBBlocks.MAGENTA_ROSE_BUSH, BlockModelGenerators.PlantType.NOT_TINTED);
        registerSunflower(blockStateModelGenerator, FBBlocks.MAGENTA_SUNFLOWER);
        blockStateModelGenerator.createFlowerBed(FBBlocks.MAGENTA_PETALS);
        blockStateModelGenerator.createFlowerBed(FBBlocks.MAGENTA_WILDFLOWERS);
        blockStateModelGenerator.createAzalea(FBBlocks.MAGENTA_FLOWERING_AZALEA);
        blockStateModelGenerator.createPottedAzalea(FBBlocks.POTTED_MAGENTA_FLOWERING_AZALEA_BUSH);
        blockStateModelGenerator.createTrivialBlock(FBBlocks.MAGENTA_FLOWERING_AZALEA_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.createCrossBlockWithDefaultItem(FBBlocks.MAGENTA_CACTUS_FLOWER, PlantType.NOT_TINTED);
        registerSporeBlossom(blockStateModelGenerator, FBBlocks.MAGENTA_SPORE_BLOSSOM);
        blockStateModelGenerator.createCrossBlockWithDefaultItem(FBBlocks.MAGENTA_SHRUB, PlantType.NOT_TINTED);

        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.BLUE_ALLIUM, FBBlocks.POTTED_BLUE_ALLIUM, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.BLUE_DAISY, FBBlocks.POTTED_BLUE_DAISY, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.BLUE_TORCHFLOWER, FBBlocks.POTTED_BLUE_TORCHFLOWER, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.BLUE_TULIP, FBBlocks.POTTED_BLUE_TULIP, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.BLUE_AZURE_BLUET, FBBlocks.POTTED_BLUE_AZURE_BLUET, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.BLUE_DANDELION, FBBlocks.POTTED_BLUE_DANDELION, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.BLUE_ORCHID, FBBlocks.POTTED_BLUE_ORCHID, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.BLUE_LILY, FBBlocks.POTTED_BLUE_LILY, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.BLUE_POPPY, FBBlocks.POTTED_BLUE_POPPY, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.BLUE_WITHER_ROSE, FBBlocks.POTTED_BLUE_WITHER_ROSE, BlockModelGenerators.PlantType.NOT_TINTED);
        registerOpenEyeBlossomAndPot(blockStateModelGenerator, FBBlocks.OPEN_BLUE_EYEBLOSSOM, FBBlocks.POTTED_OPEN_BLUE_EYEBLOSSOM);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.CLOSED_BLUE_EYEBLOSSOM, FBBlocks.POTTED_CLOSED_BLUE_EYEBLOSSOM, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createDoublePlantWithDefaultItem(FBBlocks.BLUE_LILAC, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createDoublePlantWithDefaultItem(FBBlocks.BLUE_PEONY, BlockModelGenerators.PlantType.NOT_TINTED);
        registerPitcherPlant(blockStateModelGenerator, FBBlocks.BLUE_PITCHER_PLANT);
        blockStateModelGenerator.createDoublePlantWithDefaultItem(FBBlocks.BLUE_ROSE_BUSH, BlockModelGenerators.PlantType.NOT_TINTED);
        registerSunflower(blockStateModelGenerator, FBBlocks.BLUE_SUNFLOWER);
        blockStateModelGenerator.createFlowerBed(FBBlocks.BLUE_PETALS);
        blockStateModelGenerator.createFlowerBed(FBBlocks.BLUE_WILDFLOWERS);
        blockStateModelGenerator.createAzalea(FBBlocks.BLUE_FLOWERING_AZALEA);
        blockStateModelGenerator.createPottedAzalea(FBBlocks.POTTED_BLUE_FLOWERING_AZALEA_BUSH);
        blockStateModelGenerator.createTrivialBlock(FBBlocks.BLUE_FLOWERING_AZALEA_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.createCrossBlockWithDefaultItem(FBBlocks.BLUE_CACTUS_FLOWER, PlantType.NOT_TINTED);
        registerSporeBlossom(blockStateModelGenerator, FBBlocks.BLUE_SPORE_BLOSSOM);
        blockStateModelGenerator.createCrossBlockWithDefaultItem(FBBlocks.BLUE_SHRUB, PlantType.NOT_TINTED);

        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.WHITE_ALLIUM, FBBlocks.POTTED_WHITE_ALLIUM, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.WHITE_CORNFLOWER, FBBlocks.POTTED_WHITE_CORNFLOWER, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.WHITE_TORCHFLOWER, FBBlocks.POTTED_WHITE_TORCHFLOWER, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.WHITE_DANDELION, FBBlocks.POTTED_WHITE_DANDELION, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.WHITE_ORCHID, FBBlocks.POTTED_WHITE_ORCHID, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.WHITE_POPPY, FBBlocks.POTTED_WHITE_POPPY, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.WHITE_WITHER_ROSE, FBBlocks.POTTED_WHITE_WITHER_ROSE, BlockModelGenerators.PlantType.NOT_TINTED);
        registerOpenEyeBlossomAndPot(blockStateModelGenerator, FBBlocks.OPEN_WHITE_EYEBLOSSOM, FBBlocks.POTTED_OPEN_WHITE_EYEBLOSSOM);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.CLOSED_WHITE_EYEBLOSSOM, FBBlocks.POTTED_CLOSED_WHITE_EYEBLOSSOM, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createDoublePlantWithDefaultItem(FBBlocks.WHITE_LILAC, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createDoublePlantWithDefaultItem(FBBlocks.WHITE_PEONY, BlockModelGenerators.PlantType.NOT_TINTED);
        registerPitcherPlant(blockStateModelGenerator, FBBlocks.WHITE_PITCHER_PLANT);
        blockStateModelGenerator.createDoublePlantWithDefaultItem(FBBlocks.WHITE_ROSE_BUSH, BlockModelGenerators.PlantType.NOT_TINTED);
        registerSunflower(blockStateModelGenerator, FBBlocks.WHITE_SUNFLOWER);
        blockStateModelGenerator.createFlowerBed(FBBlocks.WHITE_PETALS);
        blockStateModelGenerator.createFlowerBed(FBBlocks.WHITE_WILDFLOWERS);
        blockStateModelGenerator.createAzalea(FBBlocks.WHITE_FLOWERING_AZALEA);
        blockStateModelGenerator.createPottedAzalea(FBBlocks.POTTED_WHITE_FLOWERING_AZALEA_BUSH);
        blockStateModelGenerator.createTrivialBlock(FBBlocks.WHITE_FLOWERING_AZALEA_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.createCrossBlockWithDefaultItem(FBBlocks.WHITE_CACTUS_FLOWER, PlantType.NOT_TINTED);
        registerSporeBlossom(blockStateModelGenerator, FBBlocks.WHITE_SPORE_BLOSSOM);
        blockStateModelGenerator.createCrossBlockWithDefaultItem(FBBlocks.WHITE_SHRUB, PlantType.NOT_TINTED);

        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.ORANGE_ALLIUM, FBBlocks.POTTED_ORANGE_ALLIUM, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.ORANGE_CORNFLOWER, FBBlocks.POTTED_ORANGE_CORNFLOWER, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.ORANGE_DAISY, FBBlocks.POTTED_ORANGE_DAISY, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.ORANGE_AZURE_BLUET, FBBlocks.POTTED_ORANGE_AZURE_BLUET, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.ORANGE_DANDELION, FBBlocks.POTTED_ORANGE_DANDELION, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.ORANGE_ORCHID, FBBlocks.POTTED_ORANGE_ORCHID, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.ORANGE_LILY, FBBlocks.POTTED_ORANGE_LILY, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.ORANGE_POPPY, FBBlocks.POTTED_ORANGE_POPPY, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.ORANGE_WITHER_ROSE, FBBlocks.POTTED_ORANGE_WITHER_ROSE, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createDoublePlantWithDefaultItem(FBBlocks.ORANGE_LILAC, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createDoublePlantWithDefaultItem(FBBlocks.ORANGE_PEONY, BlockModelGenerators.PlantType.NOT_TINTED);
        registerPitcherPlant(blockStateModelGenerator, FBBlocks.ORANGE_PITCHER_PLANT);
        blockStateModelGenerator.createDoublePlantWithDefaultItem(FBBlocks.ORANGE_ROSE_BUSH, BlockModelGenerators.PlantType.NOT_TINTED);
        registerSunflower(blockStateModelGenerator, FBBlocks.ORANGE_SUNFLOWER);
        blockStateModelGenerator.createFlowerBed(FBBlocks.ORANGE_PETALS);
        blockStateModelGenerator.createFlowerBed(FBBlocks.ORANGE_WILDFLOWERS);
        blockStateModelGenerator.createAzalea(FBBlocks.ORANGE_FLOWERING_AZALEA);
        blockStateModelGenerator.createPottedAzalea(FBBlocks.POTTED_ORANGE_FLOWERING_AZALEA_BUSH);
        blockStateModelGenerator.createTrivialBlock(FBBlocks.ORANGE_FLOWERING_AZALEA_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.createCrossBlockWithDefaultItem(FBBlocks.ORANGE_CACTUS_FLOWER, PlantType.NOT_TINTED);
        registerSporeBlossom(blockStateModelGenerator, FBBlocks.ORANGE_SPORE_BLOSSOM);
        blockStateModelGenerator.createCrossBlockWithDefaultItem(FBBlocks.ORANGE_SHRUB, PlantType.NOT_TINTED);

        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.RED_ALLIUM, FBBlocks.POTTED_RED_ALLIUM, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.RED_CORNFLOWER, FBBlocks.POTTED_RED_CORNFLOWER, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.RED_DAISY, FBBlocks.POTTED_RED_DAISY, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.RED_TORCHFLOWER, FBBlocks.POTTED_RED_TORCHFLOWER, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.RED_AZURE_BLUET, FBBlocks.POTTED_RED_AZURE_BLUET, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.RED_DANDELION, FBBlocks.POTTED_RED_DANDELION, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.RED_ORCHID, FBBlocks.POTTED_RED_ORCHID, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.RED_LILY, FBBlocks.POTTED_RED_LILY, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.RED_WITHER_ROSE, FBBlocks.POTTED_RED_WITHER_ROSE, BlockModelGenerators.PlantType.NOT_TINTED);
        registerOpenEyeBlossomAndPot(blockStateModelGenerator, FBBlocks.OPEN_RED_EYEBLOSSOM, FBBlocks.POTTED_OPEN_RED_EYEBLOSSOM);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.CLOSED_RED_EYEBLOSSOM, FBBlocks.POTTED_CLOSED_RED_EYEBLOSSOM, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createDoublePlantWithDefaultItem(FBBlocks.RED_LILAC, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createDoublePlantWithDefaultItem(FBBlocks.RED_PEONY, BlockModelGenerators.PlantType.NOT_TINTED);
        registerPitcherPlant(blockStateModelGenerator, FBBlocks.RED_PITCHER_PLANT);
        registerSunflower(blockStateModelGenerator, FBBlocks.RED_SUNFLOWER);
        blockStateModelGenerator.createFlowerBed(FBBlocks.RED_PETALS);
        blockStateModelGenerator.createFlowerBed(FBBlocks.RED_WILDFLOWERS);
        blockStateModelGenerator.createAzalea(FBBlocks.RED_FLOWERING_AZALEA);
        blockStateModelGenerator.createPottedAzalea(FBBlocks.POTTED_RED_FLOWERING_AZALEA_BUSH);
        blockStateModelGenerator.createTrivialBlock(FBBlocks.RED_FLOWERING_AZALEA_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.createCrossBlockWithDefaultItem(FBBlocks.RED_CACTUS_FLOWER, PlantType.NOT_TINTED);
        registerSporeBlossom(blockStateModelGenerator, FBBlocks.RED_SPORE_BLOSSOM);

        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.YELLOW_ALLIUM, FBBlocks.POTTED_YELLOW_ALLIUM, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.YELLOW_CORNFLOWER, FBBlocks.POTTED_YELLOW_CORNFLOWER, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.YELLOW_DAISY, FBBlocks.POTTED_YELLOW_DAISY, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.YELLOW_TORCHFLOWER, FBBlocks.POTTED_YELLOW_TORCHFLOWER, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.YELLOW_TULIP, FBBlocks.POTTED_YELLOW_TULIP, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.YELLOW_AZURE_BLUET, FBBlocks.POTTED_YELLOW_AZURE_BLUET, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.YELLOW_ORCHID, FBBlocks.POTTED_YELLOW_ORCHID, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.YELLOW_LILY, FBBlocks.POTTED_YELLOW_LILY, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.YELLOW_POPPY, FBBlocks.POTTED_YELLOW_POPPY, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.YELLOW_WITHER_ROSE, FBBlocks.POTTED_YELLOW_WITHER_ROSE, BlockModelGenerators.PlantType.NOT_TINTED);
        registerOpenEyeBlossomAndPot(blockStateModelGenerator, FBBlocks.OPEN_YELLOW_EYEBLOSSOM, FBBlocks.POTTED_OPEN_YELLOW_EYEBLOSSOM);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.CLOSED_YELLOW_EYEBLOSSOM, FBBlocks.POTTED_CLOSED_YELLOW_EYEBLOSSOM, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createDoublePlantWithDefaultItem(FBBlocks.YELLOW_LILAC, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createDoublePlantWithDefaultItem(FBBlocks.YELLOW_PEONY, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createDoublePlantWithDefaultItem(FBBlocks.YELLOW_ROSE_BUSH, BlockModelGenerators.PlantType.NOT_TINTED);
        registerPitcherPlant(blockStateModelGenerator, FBBlocks.YELLOW_PITCHER_PLANT);
        blockStateModelGenerator.createFlowerBed(FBBlocks.YELLOW_PETALS);
        blockStateModelGenerator.createAzalea(FBBlocks.YELLOW_FLOWERING_AZALEA);
        blockStateModelGenerator.createPottedAzalea(FBBlocks.POTTED_YELLOW_FLOWERING_AZALEA_BUSH);
        blockStateModelGenerator.createTrivialBlock(FBBlocks.YELLOW_FLOWERING_AZALEA_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.createCrossBlockWithDefaultItem(FBBlocks.YELLOW_CACTUS_FLOWER, PlantType.NOT_TINTED);
        registerSporeBlossom(blockStateModelGenerator, FBBlocks.YELLOW_SPORE_BLOSSOM);
        blockStateModelGenerator.createCrossBlockWithDefaultItem(FBBlocks.YELLOW_SHRUB, PlantType.NOT_TINTED);

        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.LIGHT_BLUE_ALLIUM, FBBlocks.POTTED_LIGHT_BLUE_ALLIUM, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.LIGHT_BLUE_CORNFLOWER, FBBlocks.POTTED_LIGHT_BLUE_CORNFLOWER, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.LIGHT_BLUE_DAISY, FBBlocks.POTTED_LIGHT_BLUE_DAISY, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.LIGHT_BLUE_TORCHFLOWER, FBBlocks.POTTED_LIGHT_BLUE_TORCHFLOWER, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.LIGHT_BLUE_TULIP, FBBlocks.POTTED_LIGHT_BLUE_TULIP, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.LIGHT_BLUE_AZURE_BLUET, FBBlocks.POTTED_LIGHT_BLUE_AZURE_BLUET, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.LIGHT_BLUE_DANDELION, FBBlocks.POTTED_LIGHT_BLUE_DANDELION, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.LIGHT_BLUE_LILY, FBBlocks.POTTED_LIGHT_BLUE_LILY, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.LIGHT_BLUE_POPPY, FBBlocks.POTTED_LIGHT_BLUE_POPPY, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.LIGHT_BLUE_WITHER_ROSE, FBBlocks.POTTED_LIGHT_BLUE_WITHER_ROSE, BlockModelGenerators.PlantType.NOT_TINTED);
        registerOpenEyeBlossomAndPot(blockStateModelGenerator, FBBlocks.OPEN_LIGHT_BLUE_EYEBLOSSOM, FBBlocks.POTTED_OPEN_LIGHT_BLUE_EYEBLOSSOM);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.CLOSED_LIGHT_BLUE_EYEBLOSSOM, FBBlocks.POTTED_CLOSED_LIGHT_BLUE_EYEBLOSSOM, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createDoublePlantWithDefaultItem(FBBlocks.LIGHT_BLUE_LILAC, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createDoublePlantWithDefaultItem(FBBlocks.LIGHT_BLUE_PEONY, BlockModelGenerators.PlantType.NOT_TINTED);
        registerPitcherPlant(blockStateModelGenerator, FBBlocks.LIGHT_BLUE_PITCHER_PLANT);
        blockStateModelGenerator.createDoublePlantWithDefaultItem(FBBlocks.LIGHT_BLUE_ROSE_BUSH, BlockModelGenerators.PlantType.NOT_TINTED);
        registerSunflower(blockStateModelGenerator, FBBlocks.LIGHT_BLUE_SUNFLOWER);
        blockStateModelGenerator.createFlowerBed(FBBlocks.LIGHT_BLUE_PETALS);
        blockStateModelGenerator.createFlowerBed(FBBlocks.LIGHT_BLUE_WILDFLOWERS);
        blockStateModelGenerator.createAzalea(FBBlocks.LIGHT_BLUE_FLOWERING_AZALEA);
        blockStateModelGenerator.createPottedAzalea(FBBlocks.POTTED_LIGHT_BLUE_FLOWERING_AZALEA_BUSH);
        blockStateModelGenerator.createTrivialBlock(FBBlocks.LIGHT_BLUE_FLOWERING_AZALEA_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.createCrossBlockWithDefaultItem(FBBlocks.LIGHT_BLUE_CACTUS_FLOWER, PlantType.NOT_TINTED);
        registerSporeBlossom(blockStateModelGenerator, FBBlocks.LIGHT_BLUE_SPORE_BLOSSOM);
        blockStateModelGenerator.createCrossBlockWithDefaultItem(FBBlocks.LIGHT_BLUE_SHRUB, PlantType.NOT_TINTED);

        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.PINK_ALLIUM, FBBlocks.POTTED_PINK_ALLIUM, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.PINK_CORNFLOWER, FBBlocks.POTTED_PINK_CORNFLOWER, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.PINK_DAISY, FBBlocks.POTTED_PINK_DAISY, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.PINK_TORCHFLOWER, FBBlocks.POTTED_PINK_TORCHFLOWER, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.PINK_AZURE_BLUET, FBBlocks.POTTED_PINK_AZURE_BLUET, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.PINK_DANDELION, FBBlocks.POTTED_PINK_DANDELION, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.PINK_ORCHID, FBBlocks.POTTED_PINK_ORCHID, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.PINK_LILY, FBBlocks.POTTED_PINK_LILY, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.PINK_POPPY, FBBlocks.POTTED_PINK_POPPY, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.PINK_WITHER_ROSE, FBBlocks.POTTED_PINK_WITHER_ROSE, BlockModelGenerators.PlantType.NOT_TINTED);
        registerOpenEyeBlossomAndPot(blockStateModelGenerator, FBBlocks.OPEN_PINK_EYEBLOSSOM, FBBlocks.POTTED_OPEN_PINK_EYEBLOSSOM);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.CLOSED_PINK_EYEBLOSSOM, FBBlocks.POTTED_CLOSED_PINK_EYEBLOSSOM, BlockModelGenerators.PlantType.NOT_TINTED);
        registerPitcherPlant(blockStateModelGenerator, FBBlocks.PINK_PITCHER_PLANT);
        blockStateModelGenerator.createDoublePlantWithDefaultItem(FBBlocks.PINK_ROSE_BUSH, BlockModelGenerators.PlantType.NOT_TINTED);
        registerSunflower(blockStateModelGenerator, FBBlocks.PINK_SUNFLOWER);
        blockStateModelGenerator.createFlowerBed(FBBlocks.PINK_WILDFLOWERS);
        blockStateModelGenerator.createCrossBlockWithDefaultItem(FBBlocks.PINK_SHRUB, PlantType.NOT_TINTED);

        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.BLACK_ALLIUM, FBBlocks.POTTED_BLACK_ALLIUM, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.BLACK_CORNFLOWER, FBBlocks.POTTED_BLACK_CORNFLOWER, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.BLACK_DAISY, FBBlocks.POTTED_BLACK_DAISY, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.BLACK_TORCHFLOWER, FBBlocks.POTTED_BLACK_TORCHFLOWER, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.BLACK_TULIP, FBBlocks.POTTED_BLACK_TULIP, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.BLACK_AZURE_BLUET, FBBlocks.POTTED_BLACK_AZURE_BLUET, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.BLACK_DANDELION, FBBlocks.POTTED_BLACK_DANDELION, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.BLACK_ORCHID, FBBlocks.POTTED_BLACK_ORCHID, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.BLACK_LILY, FBBlocks.POTTED_BLACK_LILY, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.BLACK_POPPY, FBBlocks.POTTED_BLACK_POPPY, BlockModelGenerators.PlantType.NOT_TINTED);
        registerOpenEyeBlossomAndPot(blockStateModelGenerator, FBBlocks.OPEN_BLACK_EYEBLOSSOM, FBBlocks.POTTED_OPEN_BLACK_EYEBLOSSOM);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.CLOSED_BLACK_EYEBLOSSOM, FBBlocks.POTTED_CLOSED_BLACK_EYEBLOSSOM, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createDoublePlantWithDefaultItem(FBBlocks.BLACK_LILAC, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createDoublePlantWithDefaultItem(FBBlocks.BLACK_PEONY, BlockModelGenerators.PlantType.NOT_TINTED);
        registerPitcherPlant(blockStateModelGenerator, FBBlocks.BLACK_PITCHER_PLANT);
        blockStateModelGenerator.createDoublePlantWithDefaultItem(FBBlocks.BLACK_ROSE_BUSH, BlockModelGenerators.PlantType.NOT_TINTED);
        registerSunflower(blockStateModelGenerator, FBBlocks.BLACK_SUNFLOWER);
        blockStateModelGenerator.createFlowerBed(FBBlocks.BLACK_PETALS);
        blockStateModelGenerator.createFlowerBed(FBBlocks.BLACK_WILDFLOWERS);
        blockStateModelGenerator.createAzalea(FBBlocks.BLACK_FLOWERING_AZALEA);
        blockStateModelGenerator.createPottedAzalea(FBBlocks.POTTED_BLACK_FLOWERING_AZALEA_BUSH);
        blockStateModelGenerator.createTrivialBlock(FBBlocks.BLACK_FLOWERING_AZALEA_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.createCrossBlockWithDefaultItem(FBBlocks.BLACK_CACTUS_FLOWER, PlantType.NOT_TINTED);
        registerSporeBlossom(blockStateModelGenerator, FBBlocks.BLACK_SPORE_BLOSSOM);
        blockStateModelGenerator.createCrossBlockWithDefaultItem(FBBlocks.BLACK_SHRUB, PlantType.NOT_TINTED);

        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.CYAN_ALLIUM, FBBlocks.POTTED_CYAN_ALLIUM, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.CYAN_CORNFLOWER, FBBlocks.POTTED_CYAN_CORNFLOWER, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.CYAN_DAISY, FBBlocks.POTTED_CYAN_DAISY, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.CYAN_TORCHFLOWER, FBBlocks.POTTED_CYAN_TORCHFLOWER, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.CYAN_TULIP, FBBlocks.POTTED_CYAN_TULIP, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.CYAN_AZURE_BLUET, FBBlocks.POTTED_CYAN_AZURE_BLUET, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.CYAN_DANDELION, FBBlocks.POTTED_CYAN_DANDELION, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.CYAN_ORCHID, FBBlocks.POTTED_CYAN_ORCHID, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.CYAN_LILY, FBBlocks.POTTED_CYAN_LILY, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.CYAN_POPPY, FBBlocks.POTTED_CYAN_POPPY, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.CYAN_WITHER_ROSE, FBBlocks.POTTED_CYAN_WITHER_ROSE, BlockModelGenerators.PlantType.NOT_TINTED);
        registerOpenEyeBlossomAndPot(blockStateModelGenerator, FBBlocks.OPEN_CYAN_EYEBLOSSOM, FBBlocks.POTTED_OPEN_CYAN_EYEBLOSSOM);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.CLOSED_CYAN_EYEBLOSSOM, FBBlocks.POTTED_CLOSED_CYAN_EYEBLOSSOM, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createDoublePlantWithDefaultItem(FBBlocks.CYAN_LILAC, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createDoublePlantWithDefaultItem(FBBlocks.CYAN_PEONY, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createDoublePlantWithDefaultItem(FBBlocks.CYAN_ROSE_BUSH, BlockModelGenerators.PlantType.NOT_TINTED);
        registerSunflower(blockStateModelGenerator, FBBlocks.CYAN_SUNFLOWER);
        blockStateModelGenerator.createFlowerBed(FBBlocks.CYAN_PETALS);
        blockStateModelGenerator.createFlowerBed(FBBlocks.CYAN_WILDFLOWERS);
        blockStateModelGenerator.createAzalea(FBBlocks.CYAN_FLOWERING_AZALEA);
        blockStateModelGenerator.createPottedAzalea(FBBlocks.POTTED_CYAN_FLOWERING_AZALEA_BUSH);
        blockStateModelGenerator.createTrivialBlock(FBBlocks.CYAN_FLOWERING_AZALEA_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.createCrossBlockWithDefaultItem(FBBlocks.CYAN_CACTUS_FLOWER, PlantType.NOT_TINTED);
        registerSporeBlossom(blockStateModelGenerator, FBBlocks.CYAN_SPORE_BLOSSOM);
        blockStateModelGenerator.createCrossBlockWithDefaultItem(FBBlocks.CYAN_SHRUB, PlantType.NOT_TINTED);

        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.MAGENTA_DAFFODIL, FBBlocks.POTTED_MAGENTA_DAFFODIL, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.BLUE_DAFFODIL, FBBlocks.POTTED_BLUE_DAFFODIL, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.WHITE_DAFFODIL, FBBlocks.POTTED_WHITE_DAFFODIL, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.ORANGE_DAFFODIL, FBBlocks.POTTED_ORANGE_DAFFODIL, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.RED_DAFFODIL, FBBlocks.POTTED_RED_DAFFODIL, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.YELLOW_DAFFODIL, FBBlocks.POTTED_YELLOW_DAFFODIL, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.LIGHT_BLUE_DAFFODIL, FBBlocks.POTTED_LIGHT_BLUE_DAFFODIL, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.PINK_DAFFODIL, FBBlocks.POTTED_PINK_DAFFODIL, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.BLACK_DAFFODIL, FBBlocks.POTTED_BLACK_DAFFODIL, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.CYAN_DAFFODIL, FBBlocks.POTTED_CYAN_DAFFODIL, BlockModelGenerators.PlantType.NOT_TINTED);

        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.MAGENTA_FOXGLOVE, FBBlocks.POTTED_MAGENTA_FOXGLOVE, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.BLUE_FOXGLOVE, FBBlocks.POTTED_BLUE_FOXGLOVE, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.WHITE_FOXGLOVE, FBBlocks.POTTED_WHITE_FOXGLOVE, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.ORANGE_FOXGLOVE, FBBlocks.POTTED_ORANGE_FOXGLOVE, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.RED_FOXGLOVE, FBBlocks.POTTED_RED_FOXGLOVE, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.YELLOW_FOXGLOVE, FBBlocks.POTTED_YELLOW_FOXGLOVE, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.LIGHT_BLUE_FOXGLOVE, FBBlocks.POTTED_LIGHT_BLUE_FOXGLOVE, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.PINK_FOXGLOVE, FBBlocks.POTTED_PINK_FOXGLOVE, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.BLACK_FOXGLOVE, FBBlocks.POTTED_BLACK_FOXGLOVE, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.CYAN_FOXGLOVE, FBBlocks.POTTED_CYAN_FOXGLOVE, BlockModelGenerators.PlantType.NOT_TINTED);

        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.MAGENTA_HYACINTH, FBBlocks.POTTED_MAGENTA_HYACINTH, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.BLUE_HYACINTH, FBBlocks.POTTED_BLUE_HYACINTH, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.WHITE_HYACINTH, FBBlocks.POTTED_WHITE_HYACINTH, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.ORANGE_HYACINTH, FBBlocks.POTTED_ORANGE_HYACINTH, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.RED_HYACINTH, FBBlocks.POTTED_RED_HYACINTH, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.YELLOW_HYACINTH, FBBlocks.POTTED_YELLOW_HYACINTH, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.LIGHT_BLUE_HYACINTH, FBBlocks.POTTED_LIGHT_BLUE_HYACINTH, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.PINK_HYACINTH, FBBlocks.POTTED_PINK_HYACINTH, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.BLACK_HYACINTH, FBBlocks.POTTED_BLACK_HYACINTH, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.CYAN_HYACINTH, FBBlocks.POTTED_CYAN_HYACINTH, BlockModelGenerators.PlantType.NOT_TINTED);

        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.MAGENTA_PHLOX, FBBlocks.POTTED_MAGENTA_PHLOX, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.BLUE_PHLOX, FBBlocks.POTTED_BLUE_PHLOX, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.WHITE_PHLOX, FBBlocks.POTTED_WHITE_PHLOX, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.ORANGE_PHLOX, FBBlocks.POTTED_ORANGE_PHLOX, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.RED_PHLOX, FBBlocks.POTTED_RED_PHLOX, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.YELLOW_PHLOX, FBBlocks.POTTED_YELLOW_PHLOX, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.LIGHT_BLUE_PHLOX, FBBlocks.POTTED_LIGHT_BLUE_PHLOX, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.PINK_PHLOX, FBBlocks.POTTED_PINK_PHLOX, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.BLACK_PHLOX, FBBlocks.POTTED_BLACK_PHLOX, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.CYAN_PHLOX, FBBlocks.POTTED_CYAN_PHLOX, BlockModelGenerators.PlantType.NOT_TINTED);

        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.MAGENTA_LUPIN, FBBlocks.POTTED_MAGENTA_LUPIN, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.BLUE_LUPIN, FBBlocks.POTTED_BLUE_LUPIN, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.WHITE_LUPIN, FBBlocks.POTTED_WHITE_LUPIN, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.ORANGE_LUPIN, FBBlocks.POTTED_ORANGE_LUPIN, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.RED_LUPIN, FBBlocks.POTTED_RED_LUPIN, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.YELLOW_LUPIN, FBBlocks.POTTED_YELLOW_LUPIN, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.LIGHT_BLUE_LUPIN, FBBlocks.POTTED_LIGHT_BLUE_LUPIN, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.PINK_LUPIN, FBBlocks.POTTED_PINK_LUPIN, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.BLACK_LUPIN, FBBlocks.POTTED_BLACK_LUPIN, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.CYAN_LUPIN, FBBlocks.POTTED_CYAN_LUPIN, BlockModelGenerators.PlantType.NOT_TINTED);

        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.MAGENTA_SMALL_ROSE, FBBlocks.POTTED_MAGENTA_SMALL_ROSE, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.BLUE_SMALL_ROSE, FBBlocks.POTTED_BLUE_SMALL_ROSE, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.WHITE_SMALL_ROSE, FBBlocks.POTTED_WHITE_SMALL_ROSE, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.ORANGE_SMALL_ROSE, FBBlocks.POTTED_ORANGE_SMALL_ROSE, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.RED_SMALL_ROSE, FBBlocks.POTTED_RED_SMALL_ROSE, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.YELLOW_SMALL_ROSE, FBBlocks.POTTED_YELLOW_SMALL_ROSE, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.LIGHT_BLUE_SMALL_ROSE, FBBlocks.POTTED_LIGHT_BLUE_SMALL_ROSE, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.PINK_SMALL_ROSE, FBBlocks.POTTED_PINK_SMALL_ROSE, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.BLACK_SMALL_ROSE, FBBlocks.POTTED_BLACK_SMALL_ROSE, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.CYAN_SMALL_ROSE, FBBlocks.POTTED_CYAN_SMALL_ROSE, BlockModelGenerators.PlantType.NOT_TINTED);

        blockStateModelGenerator.createCrossBlockWithDefaultItem(FBBlocks.MAGENTA_HYDRANGEA, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createCrossBlockWithDefaultItem(FBBlocks.BLUE_HYDRANGEA, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createCrossBlockWithDefaultItem(FBBlocks.WHITE_HYDRANGEA, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createCrossBlockWithDefaultItem(FBBlocks.ORANGE_HYDRANGEA, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createCrossBlockWithDefaultItem(FBBlocks.RED_HYDRANGEA, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createCrossBlockWithDefaultItem(FBBlocks.YELLOW_HYDRANGEA, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createCrossBlockWithDefaultItem(FBBlocks.LIGHT_BLUE_HYDRANGEA, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createCrossBlockWithDefaultItem(FBBlocks.PINK_HYDRANGEA, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createCrossBlockWithDefaultItem(FBBlocks.BLACK_HYDRANGEA, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createCrossBlockWithDefaultItem(FBBlocks.CYAN_HYDRANGEA, BlockModelGenerators.PlantType.NOT_TINTED);

        blockStateModelGenerator.createDoublePlantWithDefaultItem(FBBlocks.MAGENTA_LAVENDER, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createDoublePlantWithDefaultItem(FBBlocks.BLUE_LAVENDER, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createDoublePlantWithDefaultItem(FBBlocks.WHITE_LAVENDER, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createDoublePlantWithDefaultItem(FBBlocks.ORANGE_LAVENDER, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createDoublePlantWithDefaultItem(FBBlocks.RED_LAVENDER, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createDoublePlantWithDefaultItem(FBBlocks.YELLOW_LAVENDER, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createDoublePlantWithDefaultItem(FBBlocks.LIGHT_BLUE_LAVENDER, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createDoublePlantWithDefaultItem(FBBlocks.PINK_LAVENDER, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createDoublePlantWithDefaultItem(FBBlocks.BLACK_LAVENDER, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createDoublePlantWithDefaultItem(FBBlocks.CYAN_LAVENDER, BlockModelGenerators.PlantType.NOT_TINTED);

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

        registerCypressVine(blockStateModelGenerator, FBBlocks.MAGENTA_CYPRESS_VINE);
        registerCypressVine(blockStateModelGenerator, FBBlocks.BLUE_CYPRESS_VINE);
        registerCypressVine(blockStateModelGenerator, FBBlocks.WHITE_CYPRESS_VINE);
        registerCypressVine(blockStateModelGenerator, FBBlocks.ORANGE_CYPRESS_VINE);
        registerCypressVine(blockStateModelGenerator, FBBlocks.RED_CYPRESS_VINE);
        registerCypressVine(blockStateModelGenerator, FBBlocks.YELLOW_CYPRESS_VINE);
        registerCypressVine(blockStateModelGenerator, FBBlocks.LIGHT_BLUE_CYPRESS_VINE);
        registerCypressVine(blockStateModelGenerator, FBBlocks.PINK_CYPRESS_VINE);
        registerCypressVine(blockStateModelGenerator, FBBlocks.BLACK_CYPRESS_VINE);
        registerCypressVine(blockStateModelGenerator, FBBlocks.CYAN_CYPRESS_VINE);

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

        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.MAGENTA_GLOWSHROOM, FBBlocks.POTTED_MAGENTA_GLOWSHROOM, BlockModelGenerators.PlantType.NOT_TINTED);
        FBBlockStateSuppliers.registerGlowshroomBlock(blockStateModelGenerator, FBBlocks.MAGENTA_GLOWSHROOM_BLOCK);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.BLUE_GLOWSHROOM, FBBlocks.POTTED_BLUE_GLOWSHROOM, BlockModelGenerators.PlantType.NOT_TINTED);
        FBBlockStateSuppliers.registerGlowshroomBlock(blockStateModelGenerator, FBBlocks.BLUE_GLOWSHROOM_BLOCK);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.WHITE_GLOWSHROOM, FBBlocks.POTTED_WHITE_GLOWSHROOM, BlockModelGenerators.PlantType.NOT_TINTED);
        FBBlockStateSuppliers.registerGlowshroomBlock(blockStateModelGenerator, FBBlocks.WHITE_GLOWSHROOM_BLOCK);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.ORANGE_GLOWSHROOM, FBBlocks.POTTED_ORANGE_GLOWSHROOM, BlockModelGenerators.PlantType.NOT_TINTED);
        FBBlockStateSuppliers.registerGlowshroomBlock(blockStateModelGenerator, FBBlocks.ORANGE_GLOWSHROOM_BLOCK);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.RED_GLOWSHROOM, FBBlocks.POTTED_RED_GLOWSHROOM, BlockModelGenerators.PlantType.NOT_TINTED);
        FBBlockStateSuppliers.registerGlowshroomBlock(blockStateModelGenerator, FBBlocks.RED_GLOWSHROOM_BLOCK);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.YELLOW_GLOWSHROOM, FBBlocks.POTTED_YELLOW_GLOWSHROOM, BlockModelGenerators.PlantType.NOT_TINTED);
        FBBlockStateSuppliers.registerGlowshroomBlock(blockStateModelGenerator, FBBlocks.YELLOW_GLOWSHROOM_BLOCK);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.LIGHT_BLUE_GLOWSHROOM, FBBlocks.POTTED_LIGHT_BLUE_GLOWSHROOM, BlockModelGenerators.PlantType.NOT_TINTED);
        FBBlockStateSuppliers.registerGlowshroomBlock(blockStateModelGenerator, FBBlocks.LIGHT_BLUE_GLOWSHROOM_BLOCK);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.PINK_GLOWSHROOM, FBBlocks.POTTED_PINK_GLOWSHROOM, BlockModelGenerators.PlantType.NOT_TINTED);
        FBBlockStateSuppliers.registerGlowshroomBlock(blockStateModelGenerator, FBBlocks.PINK_GLOWSHROOM_BLOCK);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.BLACK_GLOWSHROOM, FBBlocks.POTTED_BLACK_GLOWSHROOM, BlockModelGenerators.PlantType.NOT_TINTED);
        FBBlockStateSuppliers.registerGlowshroomBlock(blockStateModelGenerator, FBBlocks.BLACK_GLOWSHROOM_BLOCK);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.CYAN_GLOWSHROOM, FBBlocks.POTTED_CYAN_GLOWSHROOM, BlockModelGenerators.PlantType.NOT_TINTED);
        FBBlockStateSuppliers.registerGlowshroomBlock(blockStateModelGenerator, FBBlocks.CYAN_GLOWSHROOM_BLOCK);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.GREEN_GLOWSHROOM, FBBlocks.POTTED_GREEN_GLOWSHROOM, BlockModelGenerators.PlantType.NOT_TINTED);
        FBBlockStateSuppliers.registerGlowshroomBlock(blockStateModelGenerator, FBBlocks.GREEN_GLOWSHROOM_BLOCK);

        registerTipPlant(blockStateModelGenerator, FBBlocks.CATTAILS);
        blockStateModelGenerator.createPlantWithDefaultItem(FBBlocks.SAGE, FBBlocks.POTTED_SAGE, BlockModelGenerators.PlantType.NOT_TINTED);

        registerFlowerbedBlock(blockStateModelGenerator, FBBlocks.DIRT_FLOWERBED, getId(Blocks.DIRT), getId(Blocks.DIRT));
        registerFlowerbedBlock(blockStateModelGenerator, FBBlocks.FARMLAND_FLOWERBED, getId(Blocks.DIRT), getId(Blocks.DIRT));
        registerFlowerbedBlock(blockStateModelGenerator, FBBlocks.PODZOL_FLOWERBED, Identifier.parse(getId(Blocks.PODZOL) + "_side"), getId(Blocks.DIRT));
        registerFlowerbedBlock(blockStateModelGenerator, FBBlocks.MOSS_FLOWERBED, getId(Blocks.MOSS_BLOCK), getId(Blocks.MOSS_BLOCK));
        blockStateModelGenerator.registerSimpleTintedItemModel(FBBlocks.GRASS_FLOWERBED, Identifier.fromNamespaceAndPath(FlowerBreeding.MOD_ID, "block/grass_flowerbed"), new GrassColorSource());

        registerVase(blockStateModelGenerator, FBBlocks.WHITE_VASE, Blocks.DYED_TERRACOTTA.white());
        registerVase(blockStateModelGenerator, FBBlocks.LIGHT_GRAY_VASE, Blocks.DYED_TERRACOTTA.lightGray());
        registerVase(blockStateModelGenerator, FBBlocks.GRAY_VASE, Blocks.DYED_TERRACOTTA.gray());
        registerVase(blockStateModelGenerator, FBBlocks.BLACK_VASE, Blocks.DYED_TERRACOTTA.black());
        registerVase(blockStateModelGenerator, FBBlocks.BROWN_VASE, Blocks.DYED_TERRACOTTA.brown());
        registerVase(blockStateModelGenerator, FBBlocks.RED_VASE, Blocks.DYED_TERRACOTTA.red());
        registerVase(blockStateModelGenerator, FBBlocks.ORANGE_VASE, Blocks.DYED_TERRACOTTA.orange());
        registerVase(blockStateModelGenerator, FBBlocks.YELLOW_VASE, Blocks.DYED_TERRACOTTA.yellow());
        registerVase(blockStateModelGenerator, FBBlocks.LIME_VASE, Blocks.DYED_TERRACOTTA.lime());
        registerVase(blockStateModelGenerator, FBBlocks.GREEN_VASE, Blocks.DYED_TERRACOTTA.green());
        registerVase(blockStateModelGenerator, FBBlocks.CYAN_VASE, Blocks.DYED_TERRACOTTA.cyan());
        registerVase(blockStateModelGenerator, FBBlocks.LIGHT_BLUE_VASE, Blocks.DYED_TERRACOTTA.lightBlue());
        registerVase(blockStateModelGenerator, FBBlocks.BLUE_VASE, Blocks.DYED_TERRACOTTA.blue());
        registerVase(blockStateModelGenerator, FBBlocks.PURPLE_VASE, Blocks.DYED_TERRACOTTA.purple());
        registerVase(blockStateModelGenerator, FBBlocks.MAGENTA_VASE, Blocks.DYED_TERRACOTTA.magenta());
        registerVase(blockStateModelGenerator, FBBlocks.PINK_VASE, Blocks.DYED_TERRACOTTA.pink());
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {
        itemModelGenerator.declareCustomModelItem(FBBlocks.BOTANY_TABLE.asItem());

        itemModelGenerator.generateFlatItem(FBItems.EMPTY_PIGMENT_JAR, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(FBItems.MAGENTA_PIGMENT_JAR, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(FBItems.BLUE_PIGMENT_JAR, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(FBItems.WHITE_PIGMENT_JAR, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(FBItems.ORANGE_PIGMENT_JAR, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(FBItems.RED_PIGMENT_JAR, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(FBItems.YELLOW_PIGMENT_JAR, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(FBItems.LIGHT_BLUE_PIGMENT_JAR, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(FBItems.PINK_PIGMENT_JAR, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(FBItems.BLACK_PIGMENT_JAR, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(FBItems.CYAN_PIGMENT_JAR, ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateFlatItem(FBItems.EMPTY_POLLEN_VIAL, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(FBItems.ALLIUM_POLLEN_VIAL, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(FBItems.DAISY_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(FBItems.TULIP_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(FBItems.DANDELION_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(FBItems.ORCHID_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(FBItems.LILY_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(FBItems.POPPY_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(FBItems.WITHER_ROSE_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(FBItems.EYEBLOSSOM_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(FBItems.LILAC_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(FBItems.PEONY_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(FBItems.PITCHER_PLANT_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(FBItems.SUNFLOWER_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(FBItems.PETAL_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(FBItems.WILDFLOWER_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(FBItems.CACTUS_FLOWER_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(FBItems.SPORE_BLOSSOM_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(FBItems.FLOWERING_AZALEA_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(FBItems.FLOWERING_AZALEA_LEAVES_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(FBItems.SHRUB_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(FBItems.LILY_PAD_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(FBItems.BUSH_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(FBItems.SWEET_BERRY_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(FBItems.VINE_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(FBItems.GLOW_VINE_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(FBItems.MUSHROOM_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(FBItems.FROGLIGHT_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateFlatItem(FBBlocks.CLIMBING_IVY.asItem(), ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateFlatItem(FBBlocks.PLANTER.asItem(), ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateFlatItem(FBItems.FLORA_EXPLORER_MAP, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(FBItems.TROWEL, ModelTemplates.FLAT_ITEM);


        itemModelGenerator.generateFlatItem(FBItems.FLORAL_SMITHING_TEMPLATE, ModelTemplates.FLAT_ITEM);
    }

    private static void registerOpenEyeBlossomAndPot(BlockModelGenerators blockStateModelGenerator, Block eyeblossomBlock, Block potBlock) {
        TextureMapping mapping = new TextureMapping()
                .put(TextureSlot.CROSS_EMISSIVE, materialify(getId(eyeblossomBlock).withSuffix("_emissive")));

        MultiVariant eyeblossomId = BlockModelGenerators.plainVariant(create("block/" + "open_eyeblossom", TextureSlot.CROSS_EMISSIVE).create(eyeblossomBlock, mapping, blockStateModelGenerator.modelOutput));
        MultiVariant potId = BlockModelGenerators.plainVariant(create("block/" + "potted_open_eyeblossom", TextureSlot.CROSS_EMISSIVE).create(potBlock, mapping, blockStateModelGenerator.modelOutput));
        blockStateModelGenerator.blockStateOutput.accept(createSimpleBlock(eyeblossomBlock, eyeblossomId));
        blockStateModelGenerator.blockStateOutput.accept(createSimpleBlock(potBlock, potId));

        TextureMapping itemMapping = new TextureMapping()
                .put(TextureSlot.LAYER0, materialify(Identifier.withDefaultNamespace("block/" + "open_eyeblossom")))
                .put(TextureSlot.LAYER1, materialify(getId(eyeblossomBlock).withSuffix("_emissive")));
        Identifier model = ModelTemplates.TWO_LAYERED_ITEM.create(ModelLocationUtils.getModelLocation(eyeblossomBlock.asItem()), itemMapping, blockStateModelGenerator.modelOutput);
        blockStateModelGenerator.registerSimpleItemModel(eyeblossomBlock.asItem(), model);
    }

    private static void registerSunflower(BlockModelGenerators blockStateModelGenerator, Block block) {
        TextureMapping mapping = new TextureMapping()
                .put(TextureSlot.FRONT, materialify(getId(block).withSuffix("_front")));

        MultiVariant upperId = plainVariant(create("block/" + "sunflower_top", TextureSlot.FRONT).create(block, mapping, blockStateModelGenerator.modelOutput));
        MultiVariant lowerId = plainVariant(Identifier.withDefaultNamespace("block/" + "sunflower_bottom"));
        blockStateModelGenerator.blockStateOutput.accept(FBBlockStateSuppliers.createDoubleBlockState(block, lowerId, upperId));
        registerItemModelFromTextureSource(blockStateModelGenerator, block, getId(block).withSuffix("_front"));
    }

    private static void registerPitcherPlant(BlockModelGenerators blockStateModelGenerator, Block block) {
        TextureMapping bottomMapping = new TextureMapping()
                .put(TextureSlot.BOTTOM, materialify(getId(block).withSuffix("_bottom")));
        TextureMapping topMapping = new TextureMapping()
                .put(TextureSlot.TOP, materialify(getId(block).withSuffix("_top")));

        MultiVariant lowerId = plainVariant(create("block/" + "pitcher_plant_bottom", TextureSlot.BOTTOM).createWithSuffix(block, "_bottom", bottomMapping, blockStateModelGenerator.modelOutput));
        MultiVariant upperId = plainVariant(create("block/" + "pitcher_plant_top", TextureSlot.TOP).createWithSuffix(block, "_top", topMapping, blockStateModelGenerator.modelOutput));
        blockStateModelGenerator.blockStateOutput.accept(FBBlockStateSuppliers.createDoubleBlockState(block, lowerId, upperId));
        registerItemModelFromTextureSource(blockStateModelGenerator, block, getId(block).withSuffix("_top"));
    }

    private static void registerSporeBlossom(BlockModelGenerators blockStateModelGenerator, Block block) {
        TextureMapping mapping = new TextureMapping()
                .put(TextureSlot.PLANT, materialify(getId(block)));

        MultiVariant identifier = plainVariant(create("block/" + "spore_blossom", TextureSlot.PLANT).create(block, mapping, blockStateModelGenerator.modelOutput));
        blockStateModelGenerator.blockStateOutput.accept(createSimpleBlock(block, identifier));
    }

    private static void registerTipPlant(BlockModelGenerators blockStateModelGenerator, Block block) {
        TextureMapping regularMapping = new TextureMapping()
                .put(TextureSlot.CROSS, materialify(getId(block)));
        TextureMapping tipMapping = new TextureMapping()
                .put(TextureSlot.CROSS, materialify(getId(block).withSuffix("_tip")));

        MultiVariant regular = plainVariant(ModelTemplates.CROSS.create(block, regularMapping, blockStateModelGenerator.modelOutput));
        MultiVariant tip = plainVariant(ModelTemplates.CROSS.createWithSuffix(block, "_tip", tipMapping, blockStateModelGenerator.modelOutput));
        blockStateModelGenerator.blockStateOutput.accept(FBBlockStateSuppliers.createTipPlantState(block, regular, tip));
        registerItemModelFromTextureSource(blockStateModelGenerator, block, Identifier.parse(getId(block) + "_tip"));
    }

    private static void registerCypressVine(BlockModelGenerators blockStateModelGenerator, Block block) {
        TextureMapping mapping = new TextureMapping()
                .put(TextureSlot.PLANT, materialify(getId(block)));
        blockStateModelGenerator.createMultifaceBlockStates(block);
        plainVariant(create("block/" + "cypress_vine", TextureSlot.PLANT).create(block, mapping, blockStateModelGenerator.modelOutput));
        registerItemModelFromTextureSource(blockStateModelGenerator, block, getId(block));
    }

    private static void registerLotusFlower(BlockModelGenerators blockStateModelGenerator, Block block) {
        TextureMapping mapping = new TextureMapping()
                .put(TextureSlot.FAN, materialify(getId(block)));

        Variant identifier = plainModel(create("block/" + "lotus_flower", TextureSlot.FAN).create(block, mapping, blockStateModelGenerator.modelOutput));
        blockStateModelGenerator.blockStateOutput.accept(MultiVariantGenerator.dispatch(block, createRotatedVariants(identifier)));
        registerItemModelFromTextureSource(blockStateModelGenerator, block, getItemId(block));
    }

    private static void registerFlowerbedBlock(BlockModelGenerators blockStateModelGenerator, Block block, Identifier side, Identifier bottom) {
        TextureMapping mapping = new TextureMapping()
                .put(TextureSlot.TOP, materialify(getId(block).withSuffix("_top")))
                .put(TextureSlot.SIDE, materialify(side))
                .put(TextureSlot.BOTTOM, materialify(bottom));

        MultiVariant identifier = plainVariant(ModelTemplates.CUBE_BOTTOM_TOP.create(block, mapping, blockStateModelGenerator.modelOutput));
        blockStateModelGenerator.blockStateOutput.accept(createSimpleBlock(block, identifier));
    }

    private static void registerVase(BlockModelGenerators blockStateModelGenerator, Block block, Block textureSource) {
        TextureMapping mapping = new TextureMapping()
                .put(TextureSlot.SIDE, materialify(getId(textureSource)));

        MultiVariant identifier = plainVariant(create("block/" + "vase", TextureSlot.SIDE).create(block, mapping, blockStateModelGenerator.modelOutput));
        blockStateModelGenerator.blockStateOutput.accept(createSimpleBlock(block, identifier));
    }

    private static void registerItemModelFromTextureSource(BlockModelGenerators blockStateModelGenerator, Block block, Identifier textureSource) {
        Identifier identifier = ModelTemplates.FLAT_ITEM.create(block.asItem(), new TextureMapping().put(TextureSlot.LAYER0, materialify(textureSource)), blockStateModelGenerator.modelOutput);
        blockStateModelGenerator.registerSimpleItemModel(block.asItem(), identifier);
    }

    private static Material materialify(Identifier identifier) {
        return new Material(identifier);
    }

    private static ModelTemplate create(final String id, final TextureSlot... slots) {
        return new ModelTemplate(Optional.of(Identifier.fromNamespaceAndPath(FlowerBreeding.MOD_ID, id)), Optional.empty(), slots);
    }

    private static Identifier getId(Block block) {
        Identifier identifier = BuiltInRegistries.BLOCK.getKey(block);
        return identifier.withPrefix("block/");
    }

    private static Identifier getItemId(Block block) {
        Identifier identifier = BuiltInRegistries.ITEM.getKey(block.asItem());
        return identifier.withPrefix("item/");
    }
}
