package net.flowerbreeding.datagen;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.flowerbreeding.FlowerBreeding;
import net.flowerbreeding.util.FBProperties;
import net.minecraft.block.Block;
import net.minecraft.block.enums.DoubleBlockHalf;
import net.minecraft.client.data.*;
import net.minecraft.client.render.model.json.ModelVariant;
import net.minecraft.client.render.model.json.MultipartModelConditionBuilder;
import net.minecraft.client.render.model.json.WeightedVariant;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.Pool;

import static net.minecraft.client.data.BlockStateModelGenerator.*;

@Environment(EnvType.CLIENT)
public class FBBlockStateSuppliers {
    public static VariantsBlockModelDefinitionCreator createTipPlantState(Block block, WeightedVariant regularId, WeightedVariant tipId) {
        return VariantsBlockModelDefinitionCreator.of(block).with(BlockStateVariantMap.models(FBProperties.TIP)
                                .register(false, regularId)
                                .register(true, tipId));
    }

    public static VariantsBlockModelDefinitionCreator createDoubleBlockState(Block block, WeightedVariant lowerId, WeightedVariant upperId) {
        return VariantsBlockModelDefinitionCreator.of(block).with(BlockStateVariantMap.models(Properties.DOUBLE_BLOCK_HALF)
                                .register(DoubleBlockHalf.LOWER, lowerId)
                                .register(DoubleBlockHalf.UPPER, upperId));
    }

    public static void registerGlowshroomBlock(BlockStateModelGenerator blockStateModelGenerator, Block glowshroomBlock) {
        WeightedVariant weightedVariant = new WeightedVariant(Pool.of(new ModelVariant(Models.TEMPLATE_SINGLE_FACE.upload(glowshroomBlock, TextureMap.texture(glowshroomBlock), blockStateModelGenerator.modelCollector))));
        WeightedVariant weightedVariant1 = new WeightedVariant(Pool.of(new ModelVariant(Identifier.of(FlowerBreeding.MOD_ID, "block/" + "glowshroom_block_inside"))));
        blockStateModelGenerator.blockStateCollector.accept(
                MultipartBlockModelDefinitionCreator.create(glowshroomBlock)
                        .with(new MultipartModelConditionBuilder().put(Properties.NORTH, true), weightedVariant)
                        .with(new MultipartModelConditionBuilder().put(Properties.EAST, true), weightedVariant.apply(ROTATE_Y_90).apply(UV_LOCK))
                        .with(new MultipartModelConditionBuilder().put(Properties.SOUTH, true), weightedVariant.apply(ROTATE_Y_180).apply(UV_LOCK))
                        .with(new MultipartModelConditionBuilder().put(Properties.WEST, true), weightedVariant.apply(ROTATE_Y_270).apply(UV_LOCK))
                        .with(new MultipartModelConditionBuilder().put(Properties.UP, true), weightedVariant.apply(ROTATE_X_270).apply(UV_LOCK))
                        .with(new MultipartModelConditionBuilder().put(Properties.DOWN, true), weightedVariant.apply(ROTATE_X_90).apply(UV_LOCK))
                        .with(new MultipartModelConditionBuilder().put(Properties.NORTH, false), weightedVariant1)
                        .with(new MultipartModelConditionBuilder().put(Properties.EAST, false), weightedVariant1.apply(ROTATE_Y_90))
                        .with(new MultipartModelConditionBuilder().put(Properties.SOUTH, false), weightedVariant1.apply(ROTATE_Y_180))
                        .with(new MultipartModelConditionBuilder().put(Properties.WEST, false), weightedVariant1.apply(ROTATE_Y_270))
                        .with(new MultipartModelConditionBuilder().put(Properties.UP, false), weightedVariant1.apply(ROTATE_X_270))
                        .with(new MultipartModelConditionBuilder().put(Properties.DOWN, false), weightedVariant1.apply(ROTATE_X_90))
        );
        blockStateModelGenerator.registerParentedItemModel(glowshroomBlock, TexturedModel.CUBE_ALL.upload(glowshroomBlock, "_inventory", blockStateModelGenerator.modelCollector));
    }
}
