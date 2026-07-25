package net.flowerbreeding;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.flowerbreeding.blockentities.planter.PlanterBlockEntity;
import net.flowerbreeding.blockentities.vase.VaseBlockEntity;
import net.flowerbreeding.blockentities.flowerbed.FlowerbedBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.resources.Identifier;

public class FBBlockEntities {
    public static final BlockEntityType<VaseBlockEntity> VASE_BE =
            Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, Identifier.fromNamespaceAndPath(FlowerBreeding.MOD_ID, "vase_be"),
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

    public static final BlockEntityType<FlowerbedBlockEntity> FLOWERBED_BE =
            Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, Identifier.fromNamespaceAndPath(FlowerBreeding.MOD_ID, "flowerbed_be"),
                    FabricBlockEntityTypeBuilder.create(FlowerbedBlockEntity::new,
                            FBBlocks.GRASS_FLOWERBED,
                            FBBlocks.DIRT_FLOWERBED,
                            FBBlocks.PODZOL_FLOWERBED,
                            FBBlocks.FARMLAND_FLOWERBED,
                            FBBlocks.MOSS_FLOWERBED
                    ).build(null)
            );

    public static final BlockEntityType<PlanterBlockEntity> PLANTER_BE =
            Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, Identifier.fromNamespaceAndPath(FlowerBreeding.MOD_ID, "planter_be"),
                    FabricBlockEntityTypeBuilder.create(PlanterBlockEntity::new,
                            FBBlocks.PLANTER
                    ).build(null)
            );

    public static void registerBlockEntities() {
        FlowerBreeding.LOGGER.info("Registering Block Entities for " + FlowerBreeding.MOD_ID);
    }
}