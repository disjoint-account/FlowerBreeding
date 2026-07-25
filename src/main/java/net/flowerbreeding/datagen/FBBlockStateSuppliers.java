package net.flowerbreeding.datagen;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.flowerbreeding.FlowerBreeding;
import net.flowerbreeding.util.FBProperties;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.MultiVariant;
import net.minecraft.client.data.models.blockstates.ConditionBuilder;
import net.minecraft.client.data.models.blockstates.MultiPartGenerator;
import net.minecraft.client.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.client.data.models.blockstates.PropertyDispatch;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.client.data.models.model.TexturedModel;
import net.minecraft.client.resources.model.sprite.Material;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;

import static net.minecraft.client.data.models.BlockModelGenerators.*;

@Environment(EnvType.CLIENT)
public class FBBlockStateSuppliers {
    public static MultiVariantGenerator createTipPlantState(Block block, MultiVariant regularId, MultiVariant tipId) {
        return MultiVariantGenerator.dispatch(block).with(PropertyDispatch.initial(FBProperties.TIP)
                                .select(false, regularId)
                                .select(true, tipId));
    }

    public static MultiVariantGenerator createDoubleBlockState(Block block, MultiVariant lowerId, MultiVariant upperId) {
        return MultiVariantGenerator.dispatch(block).with(PropertyDispatch.initial(BlockStateProperties.DOUBLE_BLOCK_HALF)
                                .select(DoubleBlockHalf.LOWER, lowerId)
                                .select(DoubleBlockHalf.UPPER, upperId));
    }

    public static void registerGlowshroomBlock(BlockModelGenerators blockStateModelGenerator, Block glowshroomBlock) {
        TextureMapping regularMapping =  new TextureMapping()
                .put(TextureSlot.TEXTURE, new Material(BuiltInRegistries.BLOCK.getKey(glowshroomBlock).withPrefix("block/")));
        MultiVariant weightedVariant = BlockModelGenerators.plainVariant(ModelTemplates.SINGLE_FACE.create(glowshroomBlock, regularMapping, blockStateModelGenerator.modelOutput));
        MultiVariant weightedVariant1 = plainVariant(Identifier.fromNamespaceAndPath(FlowerBreeding.MOD_ID, "block/" + "glowshroom_block_inside"));

        blockStateModelGenerator.blockStateOutput.accept(
                MultiPartGenerator.multiPart(glowshroomBlock)
                        .with(new ConditionBuilder().term(BlockStateProperties.NORTH, true), weightedVariant)
                        .with(new ConditionBuilder().term(BlockStateProperties.EAST, true), weightedVariant.with(Y_ROT_90).with(UV_LOCK))
                        .with(new ConditionBuilder().term(BlockStateProperties.SOUTH, true), weightedVariant.with(Y_ROT_180).with(UV_LOCK))
                        .with(new ConditionBuilder().term(BlockStateProperties.WEST, true), weightedVariant.with(Y_ROT_270).with(UV_LOCK))
                        .with(new ConditionBuilder().term(BlockStateProperties.UP, true), weightedVariant.with(X_ROT_270).with(UV_LOCK))
                        .with(new ConditionBuilder().term(BlockStateProperties.DOWN, true), weightedVariant.with(X_ROT_90).with(UV_LOCK))
                        .with(new ConditionBuilder().term(BlockStateProperties.NORTH, false), weightedVariant1)
                        .with(new ConditionBuilder().term(BlockStateProperties.EAST, false), weightedVariant1.with(Y_ROT_90))
                        .with(new ConditionBuilder().term(BlockStateProperties.SOUTH, false), weightedVariant1.with(Y_ROT_180))
                        .with(new ConditionBuilder().term(BlockStateProperties.WEST, false), weightedVariant1.with(Y_ROT_270))
                        .with(new ConditionBuilder().term(BlockStateProperties.UP, false), weightedVariant1.with(X_ROT_270))
                        .with(new ConditionBuilder().term(BlockStateProperties.DOWN, false), weightedVariant1.with(X_ROT_90))
        );
        blockStateModelGenerator.registerSimpleItemModel(glowshroomBlock, TexturedModel.CUBE.createWithSuffix(glowshroomBlock, "_inventory", blockStateModelGenerator.modelOutput));
    }
}
