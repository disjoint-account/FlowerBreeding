package net.flowerbreeding;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.flowerbreeding.blockentities.flowerbed.FlowerbedBlockEntityRenderer;
import net.flowerbreeding.blockentities.planter.PlanterBlockEntityRenderer;
import net.flowerbreeding.blockentities.vase.VaseBlockEntityRenderer;
import net.flowerbreeding.botanytable.BotanyTableScreen;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.BlockRenderLayer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;

public class FlowerBreedingClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        HandledScreens.register(FBScreenHandlers.BOTANY_TABLE_SCREEN_HANDLER, BotanyTableScreen::new);
        BlockEntityRendererFactories.register(FBBlockEntities.VASE_BE, VaseBlockEntityRenderer::new);
        BlockEntityRendererFactories.register(FBBlockEntities.FLOWERBED_BE, FlowerbedBlockEntityRenderer::new);
        BlockEntityRendererFactories.register(FBBlockEntities.PLANTER_BE, PlanterBlockEntityRenderer::new);

        BlockRenderLayerMap.putBlock(FBBlocks.MAGENTA_CORNFLOWER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_MAGENTA_CORNFLOWER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.MAGENTA_DAISY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_MAGENTA_DAISY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.MAGENTA_TORCHFLOWER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_MAGENTA_TORCHFLOWER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.MAGENTA_TULIP, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_MAGENTA_TULIP, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.MAGENTA_AZURE_BLUET, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_MAGENTA_AZURE_BLUET, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.MAGENTA_DANDELION, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_MAGENTA_DANDELION, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.MAGENTA_ORCHID, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_MAGENTA_ORCHID, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.MAGENTA_LILY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_MAGENTA_LILY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.MAGENTA_POPPY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_MAGENTA_POPPY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.MAGENTA_WITHER_ROSE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_MAGENTA_WITHER_ROSE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.OPEN_MAGENTA_EYEBLOSSOM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.CLOSED_MAGENTA_EYEBLOSSOM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_OPEN_MAGENTA_EYEBLOSSOM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_CLOSED_MAGENTA_EYEBLOSSOM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.MAGENTA_LILAC, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.MAGENTA_PEONY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.MAGENTA_PITCHER_PLANT, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.MAGENTA_ROSE_BUSH, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.MAGENTA_SUNFLOWER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.MAGENTA_PETALS, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.MAGENTA_WILDFLOWERS, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.MAGENTA_CACTUS_FLOWER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.MAGENTA_SPORE_BLOSSOM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.MAGENTA_FLOWERING_AZALEA, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_MAGENTA_FLOWERING_AZALEA_BUSH, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.MAGENTA_FLOWERING_AZALEA_LEAVES, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(FBBlocks.BLUE_ALLIUM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_BLUE_ALLIUM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.BLUE_DAISY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_BLUE_DAISY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.BLUE_TORCHFLOWER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_BLUE_TORCHFLOWER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.BLUE_TULIP, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_BLUE_TULIP, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.BLUE_AZURE_BLUET, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_BLUE_AZURE_BLUET, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.BLUE_DANDELION, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_BLUE_DANDELION, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.BLUE_ORCHID, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_BLUE_ORCHID, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.BLUE_LILY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_BLUE_LILY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.BLUE_POPPY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_BLUE_POPPY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.BLUE_WITHER_ROSE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_BLUE_WITHER_ROSE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.OPEN_BLUE_EYEBLOSSOM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.CLOSED_BLUE_EYEBLOSSOM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_OPEN_BLUE_EYEBLOSSOM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_CLOSED_BLUE_EYEBLOSSOM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.BLUE_LILAC, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.BLUE_PEONY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.BLUE_PITCHER_PLANT, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.BLUE_ROSE_BUSH, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.BLUE_SUNFLOWER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.BLUE_PETALS, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.BLUE_WILDFLOWERS, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.BLUE_CACTUS_FLOWER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.BLUE_SPORE_BLOSSOM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.BLUE_FLOWERING_AZALEA, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_BLUE_FLOWERING_AZALEA_BUSH, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.BLUE_FLOWERING_AZALEA_LEAVES, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(FBBlocks.WHITE_ALLIUM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_WHITE_ALLIUM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.WHITE_CORNFLOWER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_WHITE_CORNFLOWER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.WHITE_TORCHFLOWER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_WHITE_TORCHFLOWER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.WHITE_DANDELION, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_WHITE_DANDELION, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.WHITE_ORCHID, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_WHITE_ORCHID, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.WHITE_POPPY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_WHITE_POPPY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.WHITE_WITHER_ROSE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_WHITE_WITHER_ROSE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.OPEN_WHITE_EYEBLOSSOM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.CLOSED_WHITE_EYEBLOSSOM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_OPEN_WHITE_EYEBLOSSOM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_CLOSED_WHITE_EYEBLOSSOM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.WHITE_LILAC, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.WHITE_PEONY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.WHITE_PITCHER_PLANT, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.WHITE_ROSE_BUSH, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.WHITE_SUNFLOWER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.WHITE_PETALS, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.WHITE_WILDFLOWERS, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.WHITE_CACTUS_FLOWER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.WHITE_SPORE_BLOSSOM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.WHITE_FLOWERING_AZALEA, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_WHITE_FLOWERING_AZALEA_BUSH, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.WHITE_FLOWERING_AZALEA_LEAVES, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(FBBlocks.ORANGE_ALLIUM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_ORANGE_ALLIUM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.ORANGE_CORNFLOWER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_ORANGE_CORNFLOWER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.ORANGE_DAISY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_ORANGE_DAISY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.ORANGE_AZURE_BLUET, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_ORANGE_AZURE_BLUET, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.ORANGE_DANDELION, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_ORANGE_DANDELION, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.ORANGE_ORCHID, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_ORANGE_ORCHID, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.ORANGE_LILY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_ORANGE_LILY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.ORANGE_POPPY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_ORANGE_POPPY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.ORANGE_WITHER_ROSE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_ORANGE_WITHER_ROSE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.ORANGE_LILAC, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.ORANGE_PEONY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.ORANGE_PITCHER_PLANT, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.ORANGE_ROSE_BUSH, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.ORANGE_SUNFLOWER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.ORANGE_PETALS, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.ORANGE_WILDFLOWERS, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.ORANGE_CACTUS_FLOWER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.ORANGE_SPORE_BLOSSOM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.ORANGE_FLOWERING_AZALEA, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_ORANGE_FLOWERING_AZALEA_BUSH, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.ORANGE_FLOWERING_AZALEA_LEAVES, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(FBBlocks.RED_ALLIUM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_RED_ALLIUM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.RED_CORNFLOWER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_RED_CORNFLOWER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.RED_DAISY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_RED_DAISY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.RED_TORCHFLOWER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_RED_TORCHFLOWER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.RED_AZURE_BLUET, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_RED_AZURE_BLUET, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.RED_DANDELION, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_RED_DANDELION, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.RED_ORCHID, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_RED_ORCHID, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.RED_LILY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_RED_LILY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.RED_WITHER_ROSE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_RED_WITHER_ROSE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.OPEN_RED_EYEBLOSSOM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.CLOSED_RED_EYEBLOSSOM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_OPEN_RED_EYEBLOSSOM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_CLOSED_RED_EYEBLOSSOM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.RED_LILAC, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.RED_PEONY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.RED_PITCHER_PLANT, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.RED_SUNFLOWER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.RED_PETALS, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.RED_WILDFLOWERS, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.RED_CACTUS_FLOWER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.RED_SPORE_BLOSSOM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.RED_FLOWERING_AZALEA, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_RED_FLOWERING_AZALEA_BUSH, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.RED_FLOWERING_AZALEA_LEAVES, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(FBBlocks.YELLOW_ALLIUM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_YELLOW_ALLIUM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.YELLOW_CORNFLOWER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_YELLOW_CORNFLOWER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.YELLOW_DAISY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_YELLOW_DAISY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.YELLOW_TORCHFLOWER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_YELLOW_TORCHFLOWER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.YELLOW_TULIP, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_YELLOW_TULIP, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.YELLOW_AZURE_BLUET, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_YELLOW_AZURE_BLUET, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.YELLOW_ORCHID, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_YELLOW_ORCHID, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.YELLOW_LILY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_YELLOW_LILY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.YELLOW_POPPY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_YELLOW_POPPY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.YELLOW_WITHER_ROSE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_YELLOW_WITHER_ROSE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.OPEN_YELLOW_EYEBLOSSOM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.CLOSED_YELLOW_EYEBLOSSOM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_OPEN_YELLOW_EYEBLOSSOM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_CLOSED_YELLOW_EYEBLOSSOM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.YELLOW_LILAC, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.YELLOW_PEONY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.YELLOW_PITCHER_PLANT, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.YELLOW_ROSE_BUSH, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.YELLOW_PETALS, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.YELLOW_CACTUS_FLOWER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.YELLOW_SPORE_BLOSSOM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.YELLOW_FLOWERING_AZALEA, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_YELLOW_FLOWERING_AZALEA_BUSH, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.YELLOW_FLOWERING_AZALEA_LEAVES, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(FBBlocks.LIGHT_BLUE_ALLIUM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_LIGHT_BLUE_ALLIUM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.LIGHT_BLUE_CORNFLOWER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_LIGHT_BLUE_CORNFLOWER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.LIGHT_BLUE_DAISY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_LIGHT_BLUE_DAISY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.LIGHT_BLUE_TORCHFLOWER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_LIGHT_BLUE_TORCHFLOWER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.LIGHT_BLUE_TULIP, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_LIGHT_BLUE_TULIP, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.LIGHT_BLUE_AZURE_BLUET, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_LIGHT_BLUE_AZURE_BLUET, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.LIGHT_BLUE_DANDELION, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_LIGHT_BLUE_DANDELION, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.LIGHT_BLUE_LILY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_LIGHT_BLUE_LILY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.LIGHT_BLUE_POPPY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_LIGHT_BLUE_POPPY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.LIGHT_BLUE_WITHER_ROSE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_LIGHT_BLUE_WITHER_ROSE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.OPEN_LIGHT_BLUE_EYEBLOSSOM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.CLOSED_LIGHT_BLUE_EYEBLOSSOM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_OPEN_LIGHT_BLUE_EYEBLOSSOM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_CLOSED_LIGHT_BLUE_EYEBLOSSOM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.LIGHT_BLUE_LILAC, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.LIGHT_BLUE_PEONY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.LIGHT_BLUE_PITCHER_PLANT, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.LIGHT_BLUE_ROSE_BUSH, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.LIGHT_BLUE_SUNFLOWER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.LIGHT_BLUE_PETALS, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.LIGHT_BLUE_WILDFLOWERS, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.LIGHT_BLUE_CACTUS_FLOWER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.LIGHT_BLUE_SPORE_BLOSSOM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.LIGHT_BLUE_FLOWERING_AZALEA, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_LIGHT_BLUE_FLOWERING_AZALEA_BUSH, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.LIGHT_BLUE_FLOWERING_AZALEA_LEAVES, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(FBBlocks.PINK_ALLIUM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_PINK_ALLIUM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.PINK_CORNFLOWER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_PINK_CORNFLOWER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.PINK_DAISY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_PINK_DAISY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.PINK_TORCHFLOWER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_PINK_TORCHFLOWER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.PINK_AZURE_BLUET, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_PINK_AZURE_BLUET, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.PINK_DANDELION, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_PINK_DANDELION, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.PINK_ORCHID, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_PINK_ORCHID, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.PINK_LILY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_PINK_LILY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.PINK_POPPY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_PINK_POPPY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.PINK_WITHER_ROSE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_PINK_WITHER_ROSE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.OPEN_PINK_EYEBLOSSOM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.CLOSED_PINK_EYEBLOSSOM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_OPEN_PINK_EYEBLOSSOM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_CLOSED_PINK_EYEBLOSSOM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.PINK_PITCHER_PLANT, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.PINK_WILDFLOWERS, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.PINK_ROSE_BUSH, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.PINK_SUNFLOWER, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(FBBlocks.BLACK_ALLIUM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_BLACK_ALLIUM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.BLACK_CORNFLOWER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_BLACK_CORNFLOWER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.BLACK_DAISY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_BLACK_DAISY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.BLACK_TORCHFLOWER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_BLACK_TORCHFLOWER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.BLACK_TULIP, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_BLACK_TULIP, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.BLACK_AZURE_BLUET, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_BLACK_AZURE_BLUET, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.BLACK_DANDELION, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_BLACK_DANDELION, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.BLACK_ORCHID, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_BLACK_ORCHID, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.BLACK_LILY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_BLACK_LILY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.BLACK_POPPY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_BLACK_POPPY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.OPEN_BLACK_EYEBLOSSOM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.CLOSED_BLACK_EYEBLOSSOM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_OPEN_BLACK_EYEBLOSSOM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_CLOSED_BLACK_EYEBLOSSOM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.BLACK_LILAC, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.BLACK_PEONY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.BLACK_PITCHER_PLANT, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.BLACK_ROSE_BUSH, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.BLACK_SUNFLOWER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.BLACK_PETALS, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.BLACK_WILDFLOWERS, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.BLACK_CACTUS_FLOWER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.BLACK_SPORE_BLOSSOM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.BLACK_FLOWERING_AZALEA, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_BLACK_FLOWERING_AZALEA_BUSH, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.BLACK_FLOWERING_AZALEA_LEAVES, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(FBBlocks.CYAN_ALLIUM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_CYAN_ALLIUM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.CYAN_CORNFLOWER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_CYAN_CORNFLOWER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.CYAN_DAISY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_CYAN_DAISY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.CYAN_TORCHFLOWER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_CYAN_TORCHFLOWER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.CYAN_TULIP, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_CYAN_TULIP, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.CYAN_AZURE_BLUET, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_CYAN_AZURE_BLUET, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.CYAN_DANDELION, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_CYAN_DANDELION, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.CYAN_ORCHID, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_CYAN_ORCHID, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.CYAN_LILY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_CYAN_LILY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.CYAN_POPPY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_CYAN_POPPY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.CYAN_WITHER_ROSE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_CYAN_WITHER_ROSE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.OPEN_CYAN_EYEBLOSSOM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.CLOSED_CYAN_EYEBLOSSOM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_OPEN_CYAN_EYEBLOSSOM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_CLOSED_CYAN_EYEBLOSSOM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.CYAN_LILAC, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.CYAN_PEONY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.CYAN_ROSE_BUSH, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.CYAN_SUNFLOWER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.CYAN_PETALS, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.CYAN_WILDFLOWERS, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.CYAN_CACTUS_FLOWER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.CYAN_SPORE_BLOSSOM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.CYAN_FLOWERING_AZALEA, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_CYAN_FLOWERING_AZALEA_BUSH, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.CYAN_FLOWERING_AZALEA_LEAVES, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(FBBlocks.MAGENTA_DAFFODIL, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_MAGENTA_DAFFODIL, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.BLUE_DAFFODIL, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_BLUE_DAFFODIL, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.WHITE_DAFFODIL, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_WHITE_DAFFODIL, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.ORANGE_DAFFODIL, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_ORANGE_DAFFODIL, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.RED_DAFFODIL, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_RED_DAFFODIL, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.YELLOW_DAFFODIL, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_YELLOW_DAFFODIL, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.LIGHT_BLUE_DAFFODIL, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_LIGHT_BLUE_DAFFODIL, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.PINK_DAFFODIL, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_PINK_DAFFODIL, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.BLACK_DAFFODIL, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_BLACK_DAFFODIL, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.CYAN_DAFFODIL, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_CYAN_DAFFODIL, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(FBBlocks.MAGENTA_FOXGLOVE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_MAGENTA_FOXGLOVE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.BLUE_FOXGLOVE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_BLUE_FOXGLOVE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.WHITE_FOXGLOVE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_WHITE_FOXGLOVE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.ORANGE_FOXGLOVE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_ORANGE_FOXGLOVE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.RED_FOXGLOVE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_RED_FOXGLOVE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.YELLOW_FOXGLOVE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_YELLOW_FOXGLOVE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.LIGHT_BLUE_FOXGLOVE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_LIGHT_BLUE_FOXGLOVE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.PINK_FOXGLOVE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_PINK_FOXGLOVE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.BLACK_FOXGLOVE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_BLACK_FOXGLOVE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.CYAN_FOXGLOVE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_CYAN_FOXGLOVE, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(FBBlocks.MAGENTA_HYACINTH, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_MAGENTA_HYACINTH, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.BLUE_HYACINTH, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_BLUE_HYACINTH, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.WHITE_HYACINTH, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_WHITE_HYACINTH, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.ORANGE_HYACINTH, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_ORANGE_HYACINTH, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.RED_HYACINTH, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_RED_HYACINTH, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.YELLOW_HYACINTH, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_YELLOW_HYACINTH, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.LIGHT_BLUE_HYACINTH, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_LIGHT_BLUE_HYACINTH, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.PINK_HYACINTH, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_PINK_HYACINTH, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.BLACK_HYACINTH, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_BLACK_HYACINTH, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.CYAN_HYACINTH, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_CYAN_HYACINTH, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(FBBlocks.MAGENTA_PHLOX, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_MAGENTA_PHLOX, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.BLUE_PHLOX, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_BLUE_PHLOX, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.WHITE_PHLOX, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_WHITE_PHLOX, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.ORANGE_PHLOX, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_ORANGE_PHLOX, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.RED_PHLOX, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_RED_PHLOX, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.YELLOW_PHLOX, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_YELLOW_PHLOX, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.LIGHT_BLUE_PHLOX, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_LIGHT_BLUE_PHLOX, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.PINK_PHLOX, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_PINK_PHLOX, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.BLACK_PHLOX, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_BLACK_PHLOX, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.CYAN_PHLOX, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_CYAN_PHLOX, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(FBBlocks.MAGENTA_LUPIN, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_MAGENTA_LUPIN, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.BLUE_LUPIN, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_BLUE_LUPIN, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.WHITE_LUPIN, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_WHITE_LUPIN, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.ORANGE_LUPIN, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_ORANGE_LUPIN, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.RED_LUPIN, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_RED_LUPIN, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.YELLOW_LUPIN, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_YELLOW_LUPIN, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.LIGHT_BLUE_LUPIN, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_LIGHT_BLUE_LUPIN, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.PINK_LUPIN, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_PINK_LUPIN, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.BLACK_LUPIN, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_BLACK_LUPIN, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.CYAN_LUPIN, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_CYAN_LUPIN, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(FBBlocks.MAGENTA_SMALL_ROSE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_MAGENTA_SMALL_ROSE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.BLUE_SMALL_ROSE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_BLUE_SMALL_ROSE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.WHITE_SMALL_ROSE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_WHITE_SMALL_ROSE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.ORANGE_SMALL_ROSE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_ORANGE_SMALL_ROSE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.RED_SMALL_ROSE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_RED_SMALL_ROSE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.YELLOW_SMALL_ROSE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_YELLOW_SMALL_ROSE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.LIGHT_BLUE_SMALL_ROSE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_LIGHT_BLUE_SMALL_ROSE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.PINK_SMALL_ROSE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_PINK_SMALL_ROSE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.BLACK_SMALL_ROSE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_BLACK_SMALL_ROSE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.CYAN_SMALL_ROSE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_CYAN_SMALL_ROSE, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(FBBlocks.MAGENTA_LAVENDER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.BLUE_LAVENDER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.WHITE_LAVENDER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.ORANGE_LAVENDER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.RED_LAVENDER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.YELLOW_LAVENDER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.LIGHT_BLUE_LAVENDER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.PINK_LAVENDER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.BLACK_LAVENDER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.CYAN_LAVENDER, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(FBBlocks.MAGENTA_HYDRANGEA, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.BLUE_HYDRANGEA, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.WHITE_HYDRANGEA, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.ORANGE_HYDRANGEA, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.RED_HYDRANGEA, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.YELLOW_HYDRANGEA, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.LIGHT_BLUE_HYDRANGEA, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.PINK_HYDRANGEA, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.BLACK_HYDRANGEA, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.CYAN_HYDRANGEA, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(FBBlocks.MAGENTA_LOTUS_FLOWER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.BLUE_LOTUS_FLOWER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.WHITE_LOTUS_FLOWER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.ORANGE_LOTUS_FLOWER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.RED_LOTUS_FLOWER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.YELLOW_LOTUS_FLOWER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.LIGHT_BLUE_LOTUS_FLOWER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.PINK_LOTUS_FLOWER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.BLACK_LOTUS_FLOWER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.CYAN_LOTUS_FLOWER, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(FBBlocks.MAGENTA_JASMINE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.BLUE_JASMINE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.WHITE_JASMINE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.ORANGE_JASMINE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.RED_JASMINE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.YELLOW_JASMINE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.LIGHT_BLUE_JASMINE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.PINK_JASMINE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.BLACK_JASMINE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.CYAN_JASMINE, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(FBBlocks.MAGENTA_CYPRUS_VINE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.BLUE_CYPRUS_VINE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.WHITE_CYPRUS_VINE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.ORANGE_CYPRUS_VINE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.RED_CYPRUS_VINE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.YELLOW_CYPRUS_VINE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.LIGHT_BLUE_CYPRUS_VINE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.PINK_CYPRUS_VINE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.BLACK_CYPRUS_VINE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.CYAN_CYPRUS_VINE, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(FBBlocks.MAGENTA_GLOWSHROOM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_MAGENTA_GLOWSHROOM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.BLUE_GLOWSHROOM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_BLUE_GLOWSHROOM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.WHITE_GLOWSHROOM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_WHITE_GLOWSHROOM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.ORANGE_GLOWSHROOM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_ORANGE_GLOWSHROOM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.RED_GLOWSHROOM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_RED_GLOWSHROOM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.YELLOW_GLOWSHROOM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_YELLOW_GLOWSHROOM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.LIGHT_BLUE_GLOWSHROOM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_LIGHT_BLUE_GLOWSHROOM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.PINK_GLOWSHROOM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_PINK_GLOWSHROOM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.BLACK_GLOWSHROOM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_BLACK_GLOWSHROOM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.CYAN_GLOWSHROOM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_CYAN_GLOWSHROOM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.GREEN_GLOWSHROOM, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_GREEN_GLOWSHROOM, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(FBBlocks.CLIMBING_IVY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.CATTAILS, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.SAGE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(FBBlocks.POTTED_SAGE, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(FBBlocks.GRASS_FLOWERBED, BlockRenderLayer.TRANSLUCENT);
    }

    static {
        {
            ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
                assert world != null;
                return BiomeColors.getGrassColor(world, pos);
            }, FBBlocks.GRASS_FLOWERBED);
        }
        {
            ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
                assert world != null;
                return BiomeColors.getGrassColor(world, pos);
            }, FBBlocks.MAGENTA_PETALS);
        }
        {
            ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
                assert world != null;
                return BiomeColors.getGrassColor(world, pos);
            }, FBBlocks.BLUE_PETALS);
        }
        {
            ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
                assert world != null;
                return BiomeColors.getGrassColor(world, pos);
            }, FBBlocks.WHITE_PETALS);
        }
        {
            ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
                assert world != null;
                return BiomeColors.getGrassColor(world, pos);
            }, FBBlocks.ORANGE_PETALS);
        }
        {
            ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
                assert world != null;
                return BiomeColors.getGrassColor(world, pos);
            }, FBBlocks.RED_PETALS);
        }
        {
            ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
                assert world != null;
                return BiomeColors.getGrassColor(world, pos);
            }, FBBlocks.YELLOW_PETALS);
        }
        {
            ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
                assert world != null;
                return BiomeColors.getGrassColor(world, pos);
            }, FBBlocks.LIGHT_BLUE_PETALS);
        }
        {
            ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
                assert world != null;
                return BiomeColors.getGrassColor(world, pos);
            }, FBBlocks.BLACK_PETALS);
        }
        {
            ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
                assert world != null;
                return BiomeColors.getGrassColor(world, pos);
            }, FBBlocks.CYAN_PETALS);
        }
        {
            ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
                assert world != null;
                return BiomeColors.getGrassColor(world, pos);
            }, FBBlocks.MAGENTA_WILDFLOWERS);
        }
        {
            ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
                assert world != null;
                return BiomeColors.getGrassColor(world, pos);
            }, FBBlocks.BLUE_WILDFLOWERS);
        }
        {
            ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
                assert world != null;
                return BiomeColors.getGrassColor(world, pos);
            }, FBBlocks.WHITE_WILDFLOWERS);
        }
        {
            ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
                assert world != null;
                return BiomeColors.getGrassColor(world, pos);
            }, FBBlocks.ORANGE_WILDFLOWERS);
        }
        {
            ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
                assert world != null;
                return BiomeColors.getGrassColor(world, pos);
            }, FBBlocks.RED_WILDFLOWERS);
        }
        {
            ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
                assert world != null;
                return BiomeColors.getGrassColor(world, pos);
            }, FBBlocks.LIGHT_BLUE_WILDFLOWERS);
        }
        {
            ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
                assert world != null;
                return BiomeColors.getGrassColor(world, pos);
            }, FBBlocks.PINK_WILDFLOWERS);
        }
        {
            ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
                assert world != null;
                return BiomeColors.getGrassColor(world, pos);
            }, FBBlocks.BLACK_WILDFLOWERS);
        }
        {
            ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
                assert world != null;
                return BiomeColors.getGrassColor(world, pos);
            }, FBBlocks.CYAN_WILDFLOWERS);
        }
    }
}