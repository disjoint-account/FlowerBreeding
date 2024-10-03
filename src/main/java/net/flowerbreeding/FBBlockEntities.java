package net.flowerbreeding;

import net.flowerbreeding.botanytable.BotanyTableBlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class FBBlockEntities {
        public static final BlockEntityType<BotanyTableBlockEntity> BOTANY_TABLE_ENTITY =
                Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(FlowerBreeding.MOD_ID, "botany_table_entity"),
                        BlockEntityType.Builder.create(BotanyTableBlockEntity::new, FBBlocks.BOTANY_TABLE).build(null));

        public static void registerBlockEntities () {
        FlowerBreeding.LOGGER.info("Registering Block Entities for " + FlowerBreeding.MOD_ID);
    }

}