package net.flowerbreeding.datagen;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.flowerbreeding.FlowerBreeding;
import net.flowerbreeding.util.FBProperties;
import net.minecraft.block.Block;
import net.minecraft.block.enums.DoubleBlockHalf;
import net.minecraft.client.data.*;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class FBBlockStateSuppliers {
    public static BlockStateSupplier createTipPlantState(Block block, Identifier regularId, Identifier tipId) {
        return VariantsBlockStateSupplier.create(block)
                .coordinate(
                        BlockStateVariantMap.create(FBProperties.TIP)
                                .register(false,
                                        BlockStateVariant.create().put(VariantSettings.MODEL, regularId))
                                .register(true,
                                        BlockStateVariant.create().put(VariantSettings.MODEL, tipId))
                );
    }

    public static BlockStateSupplier createDoubleBlockState(Block block, Identifier lowerId, Identifier upperId) {
        return VariantsBlockStateSupplier.create(block)
                .coordinate(
                        BlockStateVariantMap.create(Properties.DOUBLE_BLOCK_HALF)
                                .register(DoubleBlockHalf.LOWER,
                                        BlockStateVariant.create().put(VariantSettings.MODEL, lowerId))
                                .register(DoubleBlockHalf.UPPER,
                                        BlockStateVariant.create().put(VariantSettings.MODEL, upperId))
                );
    }

    public static void registerGlowshroomBlock(BlockStateModelGenerator blockStateModelGenerator, Block glowshroomBlock) {
        Identifier identifier = Models.TEMPLATE_SINGLE_FACE.upload(glowshroomBlock, TextureMap.texture(glowshroomBlock), blockStateModelGenerator.modelCollector);
        Identifier identifier1 = Identifier.of(FlowerBreeding.MOD_ID, "block/" + "glowshroom_block_inside");
        blockStateModelGenerator.blockStateCollector.accept(MultipartBlockStateSupplier.create(glowshroomBlock)
                                .with(When.create().set(Properties.NORTH, true), BlockStateVariant.create().put(VariantSettings.MODEL, identifier))
                                .with(
                                        When.create().set(Properties.EAST, true),
                                        BlockStateVariant.create().put(VariantSettings.MODEL, identifier).put(VariantSettings.Y, VariantSettings.Rotation.R90).put(VariantSettings.UVLOCK, true)
                                )
                                .with(
                                        When.create().set(Properties.SOUTH, true),
                                        BlockStateVariant.create().put(VariantSettings.MODEL, identifier).put(VariantSettings.Y, VariantSettings.Rotation.R180).put(VariantSettings.UVLOCK, true)
                                )
                                .with(
                                        When.create().set(Properties.WEST, true),
                                        BlockStateVariant.create().put(VariantSettings.MODEL, identifier).put(VariantSettings.Y, VariantSettings.Rotation.R270).put(VariantSettings.UVLOCK, true)
                                )
                                .with(
                                        When.create().set(Properties.UP, true),
                                        BlockStateVariant.create().put(VariantSettings.MODEL, identifier).put(VariantSettings.X, VariantSettings.Rotation.R270).put(VariantSettings.UVLOCK, true)
                                )
                                .with(
                                        When.create().set(Properties.DOWN, true),
                                        BlockStateVariant.create().put(VariantSettings.MODEL, identifier).put(VariantSettings.X, VariantSettings.Rotation.R90).put(VariantSettings.UVLOCK, true)
                                )
                                .with(When.create().set(Properties.NORTH, false), BlockStateVariant.create().put(VariantSettings.MODEL, identifier1))
                                .with(
                                        When.create().set(Properties.EAST, false),
                                        BlockStateVariant.create()
                                                .put(VariantSettings.MODEL, identifier1)
                                                .put(VariantSettings.Y, VariantSettings.Rotation.R90)
                                                .put(VariantSettings.UVLOCK, false)
                                )
                                .with(
                                        When.create().set(Properties.SOUTH, false),
                                        BlockStateVariant.create()
                                                .put(VariantSettings.MODEL, identifier1)
                                                .put(VariantSettings.Y, VariantSettings.Rotation.R180)
                                                .put(VariantSettings.UVLOCK, false)
                                )
                                .with(
                                        When.create().set(Properties.WEST, false),
                                        BlockStateVariant.create()
                                                .put(VariantSettings.MODEL, identifier1)
                                                .put(VariantSettings.Y, VariantSettings.Rotation.R270)
                                                .put(VariantSettings.UVLOCK, false)
                                )
                                .with(
                                        When.create().set(Properties.UP, false),
                                        BlockStateVariant.create()
                                                .put(VariantSettings.MODEL, identifier1)
                                                .put(VariantSettings.X, VariantSettings.Rotation.R270)
                                                .put(VariantSettings.UVLOCK, false)
                                )
                                .with(
                                        When.create().set(Properties.DOWN, false),
                                        BlockStateVariant.create()
                                                .put(VariantSettings.MODEL, identifier1)
                                                .put(VariantSettings.X, VariantSettings.Rotation.R90)
                                                .put(VariantSettings.UVLOCK, false)
                                )
                );
        blockStateModelGenerator.registerParentedItemModel(glowshroomBlock, TexturedModel.CUBE_ALL.upload(glowshroomBlock, "_inventory", blockStateModelGenerator.modelCollector));
    }
}
