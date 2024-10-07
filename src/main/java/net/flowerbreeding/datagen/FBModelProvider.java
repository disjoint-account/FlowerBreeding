package net.flowerbreeding.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.flowerbreeding.FBBlocks;
import net.flowerbreeding.FBItems;
import net.minecraft.data.client.*;

public class FBModelProvider extends FabricModelProvider {

    public FBModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.MAGENTA_CORNFLOWER, FBBlocks.POTTED_MAGENTA_CORNFLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.MAGENTA_DAISY, FBBlocks.POTTED_MAGENTA_DAISY, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.MAGENTA_TORCHFLOWER, FBBlocks.POTTED_MAGENTA_TORCHFLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.MAGENTA_TULIP, FBBlocks.POTTED_MAGENTA_TULIP, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.MAGENTA_AZURE_BLUET, FBBlocks.POTTED_MAGENTA_AZURE_BLUET, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.MAGENTA_DANDELION, FBBlocks.POTTED_MAGENTA_DANDELION, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.MAGENTA_ORCHID, FBBlocks.POTTED_MAGENTA_ORCHID, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.MAGENTA_LILY, FBBlocks.POTTED_MAGENTA_LILY, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.MAGENTA_POPPY, FBBlocks.POTTED_MAGENTA_POPPY, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.MAGENTA_WITHER_ROSE, FBBlocks.POTTED_MAGENTA_WITHER_ROSE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(FBBlocks.MAGENTA_LILAC, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(FBBlocks.MAGENTA_PEONY, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(FBBlocks.MAGENTA_ROSE_BUSH, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.BLUE_ALLIUM, FBBlocks.POTTED_BLUE_ALLIUM, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.BLUE_DAISY, FBBlocks.POTTED_BLUE_DAISY, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.BLUE_TORCHFLOWER, FBBlocks.POTTED_BLUE_TORCHFLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.BLUE_TULIP, FBBlocks.POTTED_BLUE_TULIP, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.BLUE_AZURE_BLUET, FBBlocks.POTTED_BLUE_AZURE_BLUET, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.BLUE_DANDELION, FBBlocks.POTTED_BLUE_DANDELION, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.BLUE_ORCHID, FBBlocks.POTTED_BLUE_ORCHID, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.BLUE_LILY, FBBlocks.POTTED_BLUE_LILY, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.BLUE_POPPY, FBBlocks.POTTED_BLUE_POPPY, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.BLUE_WITHER_ROSE, FBBlocks.POTTED_BLUE_WITHER_ROSE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(FBBlocks.BLUE_LILAC, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(FBBlocks.BLUE_PEONY, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(FBBlocks.BLUE_ROSE_BUSH, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.WHITE_ALLIUM, FBBlocks.POTTED_WHITE_ALLIUM, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.WHITE_CORNFLOWER, FBBlocks.POTTED_WHITE_CORNFLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.WHITE_TORCHFLOWER, FBBlocks.POTTED_WHITE_TORCHFLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.WHITE_DANDELION, FBBlocks.POTTED_WHITE_DANDELION, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.WHITE_ORCHID, FBBlocks.POTTED_WHITE_ORCHID, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.WHITE_POPPY, FBBlocks.POTTED_WHITE_POPPY, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.WHITE_WITHER_ROSE, FBBlocks.POTTED_WHITE_WITHER_ROSE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(FBBlocks.WHITE_LILAC, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(FBBlocks.WHITE_PEONY, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(FBBlocks.WHITE_ROSE_BUSH, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.ORANGE_ALLIUM, FBBlocks.POTTED_ORANGE_ALLIUM, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.ORANGE_CORNFLOWER, FBBlocks.POTTED_ORANGE_CORNFLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.ORANGE_DAISY, FBBlocks.POTTED_ORANGE_DAISY, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.ORANGE_AZURE_BLUET, FBBlocks.POTTED_ORANGE_AZURE_BLUET, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.ORANGE_DANDELION, FBBlocks.POTTED_ORANGE_DANDELION, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.ORANGE_ORCHID, FBBlocks.POTTED_ORANGE_ORCHID, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.ORANGE_LILY, FBBlocks.POTTED_ORANGE_LILY, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.ORANGE_POPPY, FBBlocks.POTTED_ORANGE_POPPY, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.ORANGE_WITHER_ROSE, FBBlocks.POTTED_ORANGE_WITHER_ROSE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(FBBlocks.ORANGE_LILAC, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(FBBlocks.ORANGE_PEONY, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(FBBlocks.ORANGE_ROSE_BUSH, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.RED_ALLIUM, FBBlocks.POTTED_RED_ALLIUM, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.RED_CORNFLOWER, FBBlocks.POTTED_RED_CORNFLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.RED_DAISY, FBBlocks.POTTED_RED_DAISY, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.RED_TORCHFLOWER, FBBlocks.POTTED_RED_TORCHFLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.RED_AZURE_BLUET, FBBlocks.POTTED_RED_AZURE_BLUET, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.RED_DANDELION, FBBlocks.POTTED_RED_DANDELION, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.RED_ORCHID, FBBlocks.POTTED_RED_ORCHID, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.RED_LILY, FBBlocks.POTTED_RED_LILY, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.RED_WITHER_ROSE, FBBlocks.POTTED_RED_WITHER_ROSE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(FBBlocks.RED_LILAC, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(FBBlocks.RED_PEONY, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.YELLOW_ALLIUM, FBBlocks.POTTED_YELLOW_ALLIUM, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.YELLOW_CORNFLOWER, FBBlocks.POTTED_YELLOW_CORNFLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.YELLOW_DAISY, FBBlocks.POTTED_YELLOW_DAISY, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.YELLOW_TORCHFLOWER, FBBlocks.POTTED_YELLOW_TORCHFLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.YELLOW_TULIP, FBBlocks.POTTED_YELLOW_TULIP, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.YELLOW_AZURE_BLUET, FBBlocks.POTTED_YELLOW_AZURE_BLUET, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.YELLOW_ORCHID, FBBlocks.POTTED_YELLOW_ORCHID, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.YELLOW_LILY, FBBlocks.POTTED_YELLOW_LILY, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.YELLOW_POPPY, FBBlocks.POTTED_YELLOW_POPPY, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.YELLOW_WITHER_ROSE, FBBlocks.POTTED_YELLOW_WITHER_ROSE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(FBBlocks.YELLOW_LILAC, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(FBBlocks.YELLOW_PEONY, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(FBBlocks.YELLOW_ROSE_BUSH, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.LIGHT_BLUE_ALLIUM, FBBlocks.POTTED_LIGHT_BLUE_ALLIUM, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.LIGHT_BLUE_CORNFLOWER, FBBlocks.POTTED_LIGHT_BLUE_CORNFLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.LIGHT_BLUE_DAISY, FBBlocks.POTTED_LIGHT_BLUE_DAISY, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.LIGHT_BLUE_TORCHFLOWER, FBBlocks.POTTED_LIGHT_BLUE_TORCHFLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.LIGHT_BLUE_TULIP, FBBlocks.POTTED_LIGHT_BLUE_TULIP, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.LIGHT_BLUE_AZURE_BLUET, FBBlocks.POTTED_LIGHT_BLUE_AZURE_BLUET, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.LIGHT_BLUE_DANDELION, FBBlocks.POTTED_LIGHT_BLUE_DANDELION, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.LIGHT_BLUE_LILY, FBBlocks.POTTED_LIGHT_BLUE_LILY, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.LIGHT_BLUE_POPPY, FBBlocks.POTTED_LIGHT_BLUE_POPPY, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.LIGHT_BLUE_WITHER_ROSE, FBBlocks.POTTED_LIGHT_BLUE_WITHER_ROSE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(FBBlocks.LIGHT_BLUE_LILAC, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(FBBlocks.LIGHT_BLUE_PEONY, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(FBBlocks.LIGHT_BLUE_ROSE_BUSH, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.PINK_ALLIUM, FBBlocks.POTTED_PINK_ALLIUM, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.PINK_CORNFLOWER, FBBlocks.POTTED_PINK_CORNFLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.PINK_DAISY, FBBlocks.POTTED_PINK_DAISY, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.PINK_TORCHFLOWER, FBBlocks.POTTED_PINK_TORCHFLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.PINK_AZURE_BLUET, FBBlocks.POTTED_PINK_AZURE_BLUET, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.PINK_DANDELION, FBBlocks.POTTED_PINK_DANDELION, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.PINK_ORCHID, FBBlocks.POTTED_PINK_ORCHID, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.PINK_LILY, FBBlocks.POTTED_PINK_LILY, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.PINK_POPPY, FBBlocks.POTTED_PINK_POPPY, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.PINK_WITHER_ROSE, FBBlocks.POTTED_PINK_WITHER_ROSE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(FBBlocks.PINK_ROSE_BUSH, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.BLACK_ALLIUM, FBBlocks.POTTED_BLACK_ALLIUM, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.BLACK_CORNFLOWER, FBBlocks.POTTED_BLACK_CORNFLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.BLACK_DAISY, FBBlocks.POTTED_BLACK_DAISY, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.BLACK_TORCHFLOWER, FBBlocks.POTTED_BLACK_TORCHFLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.BLACK_TULIP, FBBlocks.POTTED_BLACK_TULIP, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.BLACK_AZURE_BLUET, FBBlocks.POTTED_BLACK_AZURE_BLUET, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.BLACK_DANDELION, FBBlocks.POTTED_BLACK_DANDELION, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.BLACK_ORCHID, FBBlocks.POTTED_BLACK_ORCHID, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.BLACK_LILY, FBBlocks.POTTED_BLACK_LILY, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.BLACK_POPPY, FBBlocks.POTTED_BLACK_POPPY, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(FBBlocks.BLACK_LILAC, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(FBBlocks.BLACK_PEONY, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(FBBlocks.BLACK_ROSE_BUSH, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.CYAN_ALLIUM, FBBlocks.POTTED_CYAN_ALLIUM, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.CYAN_CORNFLOWER, FBBlocks.POTTED_CYAN_CORNFLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.CYAN_DAISY, FBBlocks.POTTED_CYAN_DAISY, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.CYAN_TORCHFLOWER, FBBlocks.POTTED_CYAN_TORCHFLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.CYAN_TULIP, FBBlocks.POTTED_CYAN_TULIP, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.CYAN_AZURE_BLUET, FBBlocks.POTTED_CYAN_AZURE_BLUET, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.CYAN_DANDELION, FBBlocks.POTTED_CYAN_DANDELION, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.CYAN_ORCHID, FBBlocks.POTTED_CYAN_ORCHID, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.CYAN_LILY, FBBlocks.POTTED_CYAN_LILY, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.CYAN_POPPY, FBBlocks.POTTED_CYAN_POPPY, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.CYAN_WITHER_ROSE, FBBlocks.POTTED_CYAN_WITHER_ROSE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(FBBlocks.CYAN_LILAC, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(FBBlocks.CYAN_PEONY, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(FBBlocks.CYAN_ROSE_BUSH, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.MAGENTA_DAFFODIL, FBBlocks.POTTED_MAGENTA_DAFFODIL, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.BLUE_DAFFODIL, FBBlocks.POTTED_BLUE_DAFFODIL, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.WHITE_DAFFODIL, FBBlocks.POTTED_WHITE_DAFFODIL, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.ORANGE_DAFFODIL, FBBlocks.POTTED_ORANGE_DAFFODIL, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.RED_DAFFODIL, FBBlocks.POTTED_RED_DAFFODIL, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.YELLOW_DAFFODIL, FBBlocks.POTTED_YELLOW_DAFFODIL, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.LIGHT_BLUE_DAFFODIL, FBBlocks.POTTED_LIGHT_BLUE_DAFFODIL, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.PINK_DAFFODIL, FBBlocks.POTTED_PINK_DAFFODIL, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.BLACK_DAFFODIL, FBBlocks.POTTED_BLACK_DAFFODIL, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.CYAN_DAFFODIL, FBBlocks.POTTED_CYAN_DAFFODIL, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.MAGENTA_FOXGLOVE, FBBlocks.POTTED_MAGENTA_FOXGLOVE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.BLUE_FOXGLOVE, FBBlocks.POTTED_BLUE_FOXGLOVE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.WHITE_FOXGLOVE, FBBlocks.POTTED_WHITE_FOXGLOVE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.ORANGE_FOXGLOVE, FBBlocks.POTTED_ORANGE_FOXGLOVE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.RED_FOXGLOVE, FBBlocks.POTTED_RED_FOXGLOVE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.YELLOW_FOXGLOVE, FBBlocks.POTTED_YELLOW_FOXGLOVE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.LIGHT_BLUE_FOXGLOVE, FBBlocks.POTTED_LIGHT_BLUE_FOXGLOVE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.PINK_FOXGLOVE, FBBlocks.POTTED_PINK_FOXGLOVE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.BLACK_FOXGLOVE, FBBlocks.POTTED_BLACK_FOXGLOVE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.CYAN_FOXGLOVE, FBBlocks.POTTED_CYAN_FOXGLOVE, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.MAGENTA_HYACINTH, FBBlocks.POTTED_MAGENTA_HYACINTH, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.BLUE_HYACINTH, FBBlocks.POTTED_BLUE_HYACINTH, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.WHITE_HYACINTH, FBBlocks.POTTED_WHITE_HYACINTH, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.ORANGE_HYACINTH, FBBlocks.POTTED_ORANGE_HYACINTH, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.RED_HYACINTH, FBBlocks.POTTED_RED_HYACINTH, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.YELLOW_HYACINTH, FBBlocks.POTTED_YELLOW_HYACINTH, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.LIGHT_BLUE_HYACINTH, FBBlocks.POTTED_LIGHT_BLUE_HYACINTH, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.PINK_HYACINTH, FBBlocks.POTTED_PINK_HYACINTH, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.BLACK_HYACINTH, FBBlocks.POTTED_BLACK_HYACINTH, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.CYAN_HYACINTH, FBBlocks.POTTED_CYAN_HYACINTH, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.MAGENTA_PHLOX, FBBlocks.POTTED_MAGENTA_PHLOX, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.BLUE_PHLOX, FBBlocks.POTTED_BLUE_PHLOX, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.WHITE_PHLOX, FBBlocks.POTTED_WHITE_PHLOX, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.ORANGE_PHLOX, FBBlocks.POTTED_ORANGE_PHLOX, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.RED_PHLOX, FBBlocks.POTTED_RED_PHLOX, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.YELLOW_PHLOX, FBBlocks.POTTED_YELLOW_PHLOX, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.LIGHT_BLUE_PHLOX, FBBlocks.POTTED_LIGHT_BLUE_PHLOX, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.PINK_PHLOX, FBBlocks.POTTED_PINK_PHLOX, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.BLACK_PHLOX, FBBlocks.POTTED_BLACK_PHLOX, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.CYAN_PHLOX, FBBlocks.POTTED_CYAN_PHLOX, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.MAGENTA_SMALL_ROSE, FBBlocks.POTTED_MAGENTA_SMALL_ROSE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.BLUE_SMALL_ROSE, FBBlocks.POTTED_BLUE_SMALL_ROSE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.WHITE_SMALL_ROSE, FBBlocks.POTTED_WHITE_SMALL_ROSE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.ORANGE_SMALL_ROSE, FBBlocks.POTTED_ORANGE_SMALL_ROSE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.RED_SMALL_ROSE, FBBlocks.POTTED_RED_SMALL_ROSE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.YELLOW_SMALL_ROSE, FBBlocks.POTTED_YELLOW_SMALL_ROSE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.LIGHT_BLUE_SMALL_ROSE, FBBlocks.POTTED_LIGHT_BLUE_SMALL_ROSE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.PINK_SMALL_ROSE, FBBlocks.POTTED_PINK_SMALL_ROSE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.BLACK_SMALL_ROSE, FBBlocks.POTTED_BLACK_SMALL_ROSE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FBBlocks.CYAN_SMALL_ROSE, FBBlocks.POTTED_CYAN_SMALL_ROSE, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerDoubleBlock(FBBlocks.MAGENTA_LAVENDER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(FBBlocks.BLUE_LAVENDER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(FBBlocks.WHITE_LAVENDER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(FBBlocks.ORANGE_LAVENDER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(FBBlocks.RED_LAVENDER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(FBBlocks.YELLOW_LAVENDER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(FBBlocks.LIGHT_BLUE_LAVENDER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(FBBlocks.PINK_LAVENDER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(FBBlocks.BLACK_LAVENDER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(FBBlocks.CYAN_LAVENDER, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerDoubleBlock(FBBlocks.MAGENTA_HONEYSUCKLE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(FBBlocks.BLUE_HONEYSUCKLE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(FBBlocks.WHITE_HONEYSUCKLE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(FBBlocks.ORANGE_HONEYSUCKLE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(FBBlocks.RED_HONEYSUCKLE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(FBBlocks.YELLOW_HONEYSUCKLE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(FBBlocks.LIGHT_BLUE_HONEYSUCKLE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(FBBlocks.PINK_HONEYSUCKLE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(FBBlocks.BLACK_HONEYSUCKLE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(FBBlocks.CYAN_HONEYSUCKLE, BlockStateModelGenerator.TintType.NOT_TINTED);
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
        itemModelGenerator.register(FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, Models.GENERATED);
        itemModelGenerator.register(FBItems.DAISY_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, Models.GENERATED);
        itemModelGenerator.register(FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, Models.GENERATED);
        itemModelGenerator.register(FBItems.TULIP_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, Models.GENERATED);
        itemModelGenerator.register(FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, Models.GENERATED);
        itemModelGenerator.register(FBItems.DANDELION_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, Models.GENERATED);
        itemModelGenerator.register(FBItems.ORCHID_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, Models.GENERATED);
        itemModelGenerator.register(FBItems.LILY_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, Models.GENERATED);
        itemModelGenerator.register(FBItems.POPPY_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, Models.GENERATED);
        itemModelGenerator.register(FBItems.WITHER_ROSE_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, Models.GENERATED);
        itemModelGenerator.register(FBItems.LILAC_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, Models.GENERATED);
        itemModelGenerator.register(FBItems.PEONY_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, Models.GENERATED);
        itemModelGenerator.register(FBItems.PITCHER_PLANT_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, Models.GENERATED);
        itemModelGenerator.register(FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, Models.GENERATED);
        itemModelGenerator.register(FBItems.SUNFLOWER_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, Models.GENERATED);
        itemModelGenerator.register(FBItems.LILY_PAD_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, Models.GENERATED);
        itemModelGenerator.register(FBItems.SWEET_BERRY_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, Models.GENERATED);
        itemModelGenerator.register(FBItems.VINE_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, Models.GENERATED);
        itemModelGenerator.register(FBItems.GLOW_VINE_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, Models.GENERATED);

        itemModelGenerator.register(FBItems.MAGENTA_LOTUS_FLOWER, Models.GENERATED);
        itemModelGenerator.register(FBItems.BLUE_LOTUS_FLOWER, Models.GENERATED);
        itemModelGenerator.register(FBItems.WHITE_LOTUS_FLOWER, Models.GENERATED);
        itemModelGenerator.register(FBItems.ORANGE_LOTUS_FLOWER, Models.GENERATED);
        itemModelGenerator.register(FBItems.RED_LOTUS_FLOWER, Models.GENERATED);
        itemModelGenerator.register(FBItems.YELLOW_LOTUS_FLOWER, Models.GENERATED);
        itemModelGenerator.register(FBItems.LIGHT_BLUE_LOTUS_FLOWER, Models.GENERATED);
        itemModelGenerator.register(FBItems.PINK_LOTUS_FLOWER, Models.GENERATED);
        itemModelGenerator.register(FBItems.BLACK_LOTUS_FLOWER, Models.GENERATED);
        itemModelGenerator.register(FBItems.CYAN_LOTUS_FLOWER, Models.GENERATED);

        itemModelGenerator.register(FBItems.FLORAL_SMITHING_TEMPLATE, Models.GENERATED);
    }
}
