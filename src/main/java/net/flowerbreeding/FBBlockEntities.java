package net.flowerbreeding;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.flowerbreeding.blockentities.VaseBlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class FBBlockEntities {
    public static final BlockEntityType<VaseBlockEntity> VASE_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(FlowerBreeding.MOD_ID, "vase_be"),
                    FabricBlockEntityTypeBuilder.create(VaseBlockEntity::new, FBBlocks.VASE).build(null));

    public static void registerBlockEntities() {
        FlowerBreeding.LOGGER.info("Registering Block Entities for " + FlowerBreeding.MOD_ID);
    }
}