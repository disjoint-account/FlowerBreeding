package net.flowerbreeding.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.flowerbreeding.FBBlocks;
import net.flowerbreeding.FBItems;
import net.flowerbreeding.FlowerBreeding;
import net.minecraft.client.data.*;
import net.minecraft.client.render.item.tint.GrassTintSource;
import net.minecraft.util.Identifier;

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
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.CLOSED_MAGENTA_EYEBLOSSOM, FBBlocks.POTTED_CLOSED_MAGENTA_EYEBLOSSOM, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlockAndItem(FBBlocks.MAGENTA_LILAC, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlockAndItem(FBBlocks.MAGENTA_PEONY, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlockAndItem(FBBlocks.MAGENTA_ROSE_BUSH, BlockStateModelGenerator.CrossType.NOT_TINTED);

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
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.CLOSED_BLUE_EYEBLOSSOM, FBBlocks.POTTED_CLOSED_BLUE_EYEBLOSSOM, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlockAndItem(FBBlocks.BLUE_LILAC, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlockAndItem(FBBlocks.BLUE_PEONY, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlockAndItem(FBBlocks.BLUE_ROSE_BUSH, BlockStateModelGenerator.CrossType.NOT_TINTED);

        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.WHITE_ALLIUM, FBBlocks.POTTED_WHITE_ALLIUM, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.WHITE_CORNFLOWER, FBBlocks.POTTED_WHITE_CORNFLOWER, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.WHITE_TORCHFLOWER, FBBlocks.POTTED_WHITE_TORCHFLOWER, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.WHITE_DANDELION, FBBlocks.POTTED_WHITE_DANDELION, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.WHITE_ORCHID, FBBlocks.POTTED_WHITE_ORCHID, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.WHITE_POPPY, FBBlocks.POTTED_WHITE_POPPY, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.WHITE_WITHER_ROSE, FBBlocks.POTTED_WHITE_WITHER_ROSE, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.CLOSED_WHITE_EYEBLOSSOM, FBBlocks.POTTED_CLOSED_WHITE_EYEBLOSSOM, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlockAndItem(FBBlocks.WHITE_LILAC, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlockAndItem(FBBlocks.WHITE_PEONY, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlockAndItem(FBBlocks.WHITE_ROSE_BUSH, BlockStateModelGenerator.CrossType.NOT_TINTED);

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
        blockStateModelGenerator.registerDoubleBlockAndItem(FBBlocks.ORANGE_ROSE_BUSH, BlockStateModelGenerator.CrossType.NOT_TINTED);

        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.RED_ALLIUM, FBBlocks.POTTED_RED_ALLIUM, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.RED_CORNFLOWER, FBBlocks.POTTED_RED_CORNFLOWER, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.RED_DAISY, FBBlocks.POTTED_RED_DAISY, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.RED_TORCHFLOWER, FBBlocks.POTTED_RED_TORCHFLOWER, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.RED_AZURE_BLUET, FBBlocks.POTTED_RED_AZURE_BLUET, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.RED_DANDELION, FBBlocks.POTTED_RED_DANDELION, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.RED_ORCHID, FBBlocks.POTTED_RED_ORCHID, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.RED_LILY, FBBlocks.POTTED_RED_LILY, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.RED_WITHER_ROSE, FBBlocks.POTTED_RED_WITHER_ROSE, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.CLOSED_RED_EYEBLOSSOM, FBBlocks.POTTED_CLOSED_RED_EYEBLOSSOM, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlockAndItem(FBBlocks.RED_LILAC, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlockAndItem(FBBlocks.RED_PEONY, BlockStateModelGenerator.CrossType.NOT_TINTED);

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
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.CLOSED_YELLOW_EYEBLOSSOM, FBBlocks.POTTED_CLOSED_YELLOW_EYEBLOSSOM, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlockAndItem(FBBlocks.YELLOW_LILAC, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlockAndItem(FBBlocks.YELLOW_PEONY, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlockAndItem(FBBlocks.YELLOW_ROSE_BUSH, BlockStateModelGenerator.CrossType.NOT_TINTED);

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
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.CLOSED_LIGHT_BLUE_EYEBLOSSOM, FBBlocks.POTTED_CLOSED_LIGHT_BLUE_EYEBLOSSOM, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlockAndItem(FBBlocks.LIGHT_BLUE_LILAC, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlockAndItem(FBBlocks.LIGHT_BLUE_PEONY, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlockAndItem(FBBlocks.LIGHT_BLUE_ROSE_BUSH, BlockStateModelGenerator.CrossType.NOT_TINTED);

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
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.CLOSED_PINK_EYEBLOSSOM, FBBlocks.POTTED_CLOSED_PINK_EYEBLOSSOM, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlockAndItem(FBBlocks.PINK_ROSE_BUSH, BlockStateModelGenerator.CrossType.NOT_TINTED);

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
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.CLOSED_BLACK_EYEBLOSSOM, FBBlocks.POTTED_CLOSED_BLACK_EYEBLOSSOM, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlockAndItem(FBBlocks.BLACK_LILAC, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlockAndItem(FBBlocks.BLACK_PEONY, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlockAndItem(FBBlocks.BLACK_ROSE_BUSH, BlockStateModelGenerator.CrossType.NOT_TINTED);

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
        blockStateModelGenerator.registerFlowerPotPlantAndItem(FBBlocks.CLOSED_CYAN_EYEBLOSSOM, FBBlocks.POTTED_CLOSED_CYAN_EYEBLOSSOM, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlockAndItem(FBBlocks.CYAN_LILAC, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlockAndItem(FBBlocks.CYAN_PEONY, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlockAndItem(FBBlocks.CYAN_ROSE_BUSH, BlockStateModelGenerator.CrossType.NOT_TINTED);

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

        blockStateModelGenerator.registerDoubleBlockAndItem(FBBlocks.MAGENTA_HYDRANGEA, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlockAndItem(FBBlocks.BLUE_HYDRANGEA, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlockAndItem(FBBlocks.WHITE_HYDRANGEA, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlockAndItem(FBBlocks.ORANGE_HYDRANGEA, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlockAndItem(FBBlocks.RED_HYDRANGEA, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlockAndItem(FBBlocks.YELLOW_HYDRANGEA, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlockAndItem(FBBlocks.LIGHT_BLUE_HYDRANGEA, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlockAndItem(FBBlocks.PINK_HYDRANGEA, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlockAndItem(FBBlocks.BLACK_HYDRANGEA, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlockAndItem(FBBlocks.CYAN_HYDRANGEA, BlockStateModelGenerator.CrossType.NOT_TINTED);

        blockStateModelGenerator.registerTintedItemModel(FBBlocks.GRASS_FLOWERBED, Identifier.of(FlowerBreeding.MOD_ID, "block/grass_flowerbed"), new GrassTintSource());
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
        itemModelGenerator.registerWithTextureSource(FBItems.LILY_PAD_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, Models.GENERATED);
        itemModelGenerator.registerWithTextureSource(FBItems.SWEET_BERRY_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, Models.GENERATED);
        itemModelGenerator.registerWithTextureSource(FBItems.VINE_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, Models.GENERATED);
        itemModelGenerator.registerWithTextureSource(FBItems.GLOW_VINE_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, Models.GENERATED);

        itemModelGenerator.uploadTwoLayers(FBBlocks.OPEN_MAGENTA_EYEBLOSSOM.asItem(), Identifier.ofVanilla("block/open_eyeblossom"), Identifier.of(FlowerBreeding.MOD_ID, "block/open_magenta_eyeblossom_emissive"));
        itemModelGenerator.register(FBBlocks.OPEN_MAGENTA_EYEBLOSSOM.asItem());
        itemModelGenerator.uploadTwoLayers(FBBlocks.OPEN_BLUE_EYEBLOSSOM.asItem(), Identifier.ofVanilla("block/open_eyeblossom"), Identifier.of(FlowerBreeding.MOD_ID, "block/open_blue_eyeblossom_emissive"));
        itemModelGenerator.register(FBBlocks.OPEN_BLUE_EYEBLOSSOM.asItem());
        itemModelGenerator.uploadTwoLayers(FBBlocks.OPEN_WHITE_EYEBLOSSOM.asItem(), Identifier.ofVanilla("block/open_eyeblossom"), Identifier.of(FlowerBreeding.MOD_ID, "block/open_white_eyeblossom_emissive"));
        itemModelGenerator.register(FBBlocks.OPEN_WHITE_EYEBLOSSOM.asItem());
        itemModelGenerator.uploadTwoLayers(FBBlocks.OPEN_RED_EYEBLOSSOM.asItem(), Identifier.ofVanilla("block/open_eyeblossom"), Identifier.of(FlowerBreeding.MOD_ID, "block/open_red_eyeblossom_emissive"));
        itemModelGenerator.register(FBBlocks.OPEN_RED_EYEBLOSSOM.asItem());
        itemModelGenerator.uploadTwoLayers(FBBlocks.OPEN_YELLOW_EYEBLOSSOM.asItem(), Identifier.ofVanilla("block/open_eyeblossom"), Identifier.of(FlowerBreeding.MOD_ID, "block/open_yellow_eyeblossom_emissive"));
        itemModelGenerator.register(FBBlocks.OPEN_YELLOW_EYEBLOSSOM.asItem());
        itemModelGenerator.uploadTwoLayers(FBBlocks.OPEN_LIGHT_BLUE_EYEBLOSSOM.asItem(), Identifier.ofVanilla("block/open_eyeblossom"), Identifier.of(FlowerBreeding.MOD_ID, "block/open_light_blue_eyeblossom_emissive"));
        itemModelGenerator.register(FBBlocks.OPEN_LIGHT_BLUE_EYEBLOSSOM.asItem());
        itemModelGenerator.uploadTwoLayers(FBBlocks.OPEN_PINK_EYEBLOSSOM.asItem(), Identifier.ofVanilla("block/open_eyeblossom"), Identifier.of(FlowerBreeding.MOD_ID, "block/open_pink_eyeblossom_emissive"));
        itemModelGenerator.register(FBBlocks.OPEN_PINK_EYEBLOSSOM.asItem());
        itemModelGenerator.uploadTwoLayers(FBBlocks.OPEN_BLACK_EYEBLOSSOM.asItem(), Identifier.ofVanilla("block/open_eyeblossom"), Identifier.of(FlowerBreeding.MOD_ID, "block/open_black_eyeblossom_emissive"));
        itemModelGenerator.register(FBBlocks.OPEN_BLACK_EYEBLOSSOM.asItem());
        itemModelGenerator.uploadTwoLayers(FBBlocks.OPEN_CYAN_EYEBLOSSOM.asItem(), Identifier.ofVanilla("block/open_eyeblossom"), Identifier.of(FlowerBreeding.MOD_ID, "block/open_cyan_eyeblossom_emissive"));
        itemModelGenerator.register(FBBlocks.OPEN_CYAN_EYEBLOSSOM.asItem());

        itemModelGenerator.register(FBBlocks.MAGENTA_PITCHER_PLANT.asItem(), Models.GENERATED);
        itemModelGenerator.register(FBBlocks.BLUE_PITCHER_PLANT.asItem(), Models.GENERATED);
        itemModelGenerator.register(FBBlocks.WHITE_PITCHER_PLANT.asItem(), Models.GENERATED);
        itemModelGenerator.register(FBBlocks.ORANGE_PITCHER_PLANT.asItem(), Models.GENERATED);
        itemModelGenerator.register(FBBlocks.RED_PITCHER_PLANT.asItem(), Models.GENERATED);
        itemModelGenerator.register(FBBlocks.YELLOW_PITCHER_PLANT.asItem(), Models.GENERATED);
        itemModelGenerator.register(FBBlocks.LIGHT_BLUE_PITCHER_PLANT.asItem(), Models.GENERATED);
        itemModelGenerator.register(FBBlocks.PINK_PITCHER_PLANT.asItem(), Models.GENERATED);
        itemModelGenerator.register(FBBlocks.BLACK_PITCHER_PLANT.asItem(), Models.GENERATED);

        itemModelGenerator.register(FBBlocks.MAGENTA_SUNFLOWER.asItem(), Models.GENERATED);
        itemModelGenerator.register(FBBlocks.BLUE_SUNFLOWER.asItem(), Models.GENERATED);
        itemModelGenerator.register(FBBlocks.WHITE_SUNFLOWER.asItem(), Models.GENERATED);
        itemModelGenerator.register(FBBlocks.ORANGE_SUNFLOWER.asItem(), Models.GENERATED);
        itemModelGenerator.register(FBBlocks.RED_SUNFLOWER.asItem(), Models.GENERATED);
        itemModelGenerator.register(FBBlocks.LIGHT_BLUE_SUNFLOWER.asItem(), Models.GENERATED);
        itemModelGenerator.register(FBBlocks.PINK_SUNFLOWER.asItem(), Models.GENERATED);
        itemModelGenerator.register(FBBlocks.BLACK_SUNFLOWER.asItem(), Models.GENERATED);
        itemModelGenerator.register(FBBlocks.CYAN_SUNFLOWER.asItem(), Models.GENERATED);

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

        itemModelGenerator.register(FBBlocks.MAGENTA_JASMINE.asItem(), Models.GENERATED);
        itemModelGenerator.register(FBBlocks.BLUE_JASMINE.asItem(), Models.GENERATED);
        itemModelGenerator.register(FBBlocks.WHITE_JASMINE.asItem(), Models.GENERATED);
        itemModelGenerator.register(FBBlocks.ORANGE_JASMINE.asItem(), Models.GENERATED);
        itemModelGenerator.register(FBBlocks.RED_JASMINE.asItem(), Models.GENERATED);
        itemModelGenerator.register(FBBlocks.YELLOW_JASMINE.asItem(), Models.GENERATED);
        itemModelGenerator.register(FBBlocks.LIGHT_BLUE_JASMINE.asItem(), Models.GENERATED);
        itemModelGenerator.register(FBBlocks.PINK_JASMINE.asItem(), Models.GENERATED);
        itemModelGenerator.register(FBBlocks.BLACK_JASMINE.asItem(), Models.GENERATED);
        itemModelGenerator.register(FBBlocks.CYAN_JASMINE.asItem(), Models.GENERATED);

        itemModelGenerator.register(FBBlocks.MAGENTA_CYPRUS_VINE.asItem(), Models.GENERATED);
        itemModelGenerator.register(FBBlocks.BLUE_CYPRUS_VINE.asItem(), Models.GENERATED);
        itemModelGenerator.register(FBBlocks.WHITE_CYPRUS_VINE.asItem(), Models.GENERATED);
        itemModelGenerator.register(FBBlocks.ORANGE_CYPRUS_VINE.asItem(), Models.GENERATED);
        itemModelGenerator.register(FBBlocks.RED_CYPRUS_VINE.asItem(), Models.GENERATED);
        itemModelGenerator.register(FBBlocks.YELLOW_CYPRUS_VINE.asItem(), Models.GENERATED);
        itemModelGenerator.register(FBBlocks.LIGHT_BLUE_CYPRUS_VINE.asItem(), Models.GENERATED);
        itemModelGenerator.register(FBBlocks.PINK_CYPRUS_VINE.asItem(), Models.GENERATED);
        itemModelGenerator.register(FBBlocks.BLACK_CYPRUS_VINE.asItem(), Models.GENERATED);
        itemModelGenerator.register(FBBlocks.CYAN_CYPRUS_VINE.asItem(), Models.GENERATED);

        itemModelGenerator.register(FBBlocks.CLIMBING_IVY.asItem(), Models.GENERATED);
        itemModelGenerator.register(FBBlocks.CATTAILS.asItem(), Models.GENERATED);

        itemModelGenerator.register(FBBlocks.PLANTER.asItem(), Models.GENERATED);

        itemModelGenerator.register(FBItems.TROWEL, Models.GENERATED);

        itemModelGenerator.register(FBItems.FLORAL_SMITHING_TEMPLATE, Models.GENERATED);
    }
}
