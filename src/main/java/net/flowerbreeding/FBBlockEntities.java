package net.flowerbreeding;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.flowerbreeding.blockentities.vase.VaseBlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class FBBlockEntities {
    public static final BlockEntityType<VaseBlockEntity> VASE_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(FlowerBreeding.MOD_ID, "vase_be"),
                    FabricBlockEntityTypeBuilder.create(VaseBlockEntity::new,
                            FBBlocks.WHITE_VASE,
                            FBBlocks.LIGHT_GRAY_VASE,
                            FBBlocks.GRAY_VASE,
                            FBBlocks.BLACK_VASE,
                            FBBlocks.BROWN_VASE,
                            FBBlocks.RED_VASE,
                            FBBlocks.ORANGE_VASE,
                            FBBlocks.YELLOW_VASE,
                            FBBlocks.LIME_VASE,
                            FBBlocks.GREEN_VASE,
                            FBBlocks.CYAN_VASE,
                            FBBlocks.LIGHT_BLUE_VASE,
                            FBBlocks.BLUE_VASE,
                            FBBlocks.PURPLE_VASE,
                            FBBlocks.MAGENTA_VASE,
                            FBBlocks.PINK_VASE
                            ).build(null)
            );

    public static void registerBlockEntities() {
        FlowerBreeding.LOGGER.info("Registering Block Entities for " + FlowerBreeding.MOD_ID);
    }
}