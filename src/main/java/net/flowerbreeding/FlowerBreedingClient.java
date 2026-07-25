package net.flowerbreeding;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockColorRegistry;
import net.flowerbreeding.blockentities.flowerbed.FlowerbedBlockEntityRenderer;
import net.flowerbreeding.blockentities.planter.PlanterBlockEntityRenderer;
import net.flowerbreeding.blockentities.vase.VaseBlockEntityRenderer;
import net.flowerbreeding.botanytable.BotanyTableScreen;
import net.minecraft.client.color.block.BlockTintSources;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;

import java.util.List;

public class FlowerBreedingClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        MenuScreens.register(FBScreenHandlers.BOTANY_TABLE_SCREEN_HANDLER, BotanyTableScreen::new);

        BlockEntityRenderers.register(FBBlockEntities.FLOWERBED_BE, FlowerbedBlockEntityRenderer::new);
        BlockEntityRenderers.register(FBBlockEntities.VASE_BE, VaseBlockEntityRenderer::new);
        BlockEntityRenderers.register(FBBlockEntities.PLANTER_BE, PlanterBlockEntityRenderer::new);

        BlockColorRegistry.register(List.of(BlockTintSources.constant(-1), BlockTintSources.grassBlock()),
                FBBlocks.MAGENTA_PETALS,
                FBBlocks.BLUE_PETALS,
                FBBlocks.WHITE_PETALS,
                FBBlocks.ORANGE_PETALS,
                FBBlocks.RED_PETALS,
                FBBlocks.YELLOW_PETALS,
                FBBlocks.LIGHT_BLUE_PETALS,
                FBBlocks.BLACK_PETALS,
                FBBlocks.CYAN_PETALS,
                FBBlocks.MAGENTA_WILDFLOWERS,
                FBBlocks.BLUE_WILDFLOWERS,
                FBBlocks.WHITE_WILDFLOWERS,
                FBBlocks.ORANGE_WILDFLOWERS,
                FBBlocks.RED_WILDFLOWERS,
                FBBlocks.LIGHT_BLUE_WILDFLOWERS,
                FBBlocks.PINK_WILDFLOWERS,
                FBBlocks.BLACK_WILDFLOWERS,
                FBBlocks.CYAN_WILDFLOWERS
        );

        BlockColorRegistry.register(List.of(BlockTintSources.grassBlock()),
                FBBlocks.GRASS_FLOWERBED
        );
    }
}