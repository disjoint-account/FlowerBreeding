package net.flowerbreeding.blockentities;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.flowerbreeding.FlowerBreeding;
import net.minecraft.block.Block;
import net.minecraft.client.model.*;
import net.minecraft.client.render.*;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.util.SpriteIdentifier;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.world.LightType;
import net.minecraft.world.World;

@Environment(EnvType.CLIENT)
public class VaseBlockEntityRenderer implements BlockEntityRenderer<VaseBlockEntity> {
    private static final String FIRST_SLOT_0 = "first_slot_0";
    private static final String SECOND_SLOT_0 = "second_slot_0";
    private static final String FIRST_SLOT_1 = "first_slot_1";
    private static final String SECOND_SLOT_1 = "second_slot_1";
    private static final String FIRST_SLOT_2 = "first_slot_2";
    private static final String SECOND_SLOT_2 = "second_slot_2";
    private static final String FIRST_SLOT_3 = "first_slot_3";
    private static final String SECOND_SLOT_3 = "second_slot_3";
    private final ModelPart first_slot_0;
    private final ModelPart second_slot_0;
    private final ModelPart first_slot_1;
    private final ModelPart second_slot_1;
    private final ModelPart first_slot_2;
    private final ModelPart second_slot_2;
    private final ModelPart first_slot_3;
    private final ModelPart second_slot_3;

    public VaseBlockEntityRenderer(BlockEntityRendererFactory.Context context) {
        ModelPart modelPart = context.getLayerModelPart(VASE_FLOWERS);
        this.first_slot_0 = modelPart.getChild("first_slot_0");
        this.second_slot_0 = modelPart.getChild("second_slot_0");
        this.first_slot_1 = modelPart.getChild("first_slot_1");
        this.second_slot_1 = modelPart.getChild("second_slot_1");
        this.first_slot_2 = modelPart.getChild("first_slot_2");
        this.second_slot_2 = modelPart.getChild("second_slot_2");
        this.first_slot_3 = modelPart.getChild("first_slot_3");
        this.second_slot_3 = modelPart.getChild("second_slot_3");
    }

    public static final Identifier FLOWER_ATLAS_TEXTURE = Identifier.of("flowerbreeding:textures/atlas/flower.png");
    public static final EntityModelLayer VASE_FLOWERS = create();

    public static TexturedModelData getFlowersTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartBuilder modelPartBuilder = ModelPartBuilder.create().uv(1, 1).cuboid(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 0.0F);
        modelPartData.addChild("first_slot_0", modelPartBuilder, ModelTransform.of(15.0F, 16.0F, 1.0F, 0.0F, 0.0F, 3.1415927F));
        modelPartData.addChild("second_slot_0", modelPartBuilder, ModelTransform.of(15.0F, 16.0F, 1.0F, 0.0F, 0.0F, 3.1415927F));
        modelPartData.addChild("first_slot_1", modelPartBuilder, ModelTransform.of(1.0F, 16.0F, 1.0F, 0.0F, -1.5707964F, 3.1415927F));
        modelPartData.addChild("second_slot_1", modelPartBuilder, ModelTransform.of(1.0F, 16.0F, 1.0F, 0.0F, -1.5707964F, 3.1415927F));
        modelPartData.addChild("first_slot_2", modelPartBuilder, ModelTransform.of(15.0F, 16.0F, 15.0F, 0.0F, 1.5707964F, 3.1415927F));
        modelPartData.addChild("second_slot_2", modelPartBuilder, ModelTransform.of(15.0F, 16.0F, 15.0F, 0.0F, 1.5707964F, 3.1415927F));
        modelPartData.addChild("first_slot_3", modelPartBuilder, ModelTransform.of(1.0F, 16.0F, 15.0F, 3.1415927F, 0.0F, 0.0F));
        modelPartData.addChild("second_slot_3", modelPartBuilder, ModelTransform.of(1.0F, 16.0F, 15.0F, 3.1415927F, 0.0F, 0.0F));
        return TexturedModelData.of(modelData, 16, 16);
    }

    public void render(VaseBlockEntity entity, float tickDelta, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int light, int overlay) {
        matrixStack.push();
        matrixStack.translate(0.5f, 1.15f, 0.5f);
        matrixStack.scale(0.5f, 0.5f, 0.5f);
        matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(0));

        this.renderFlowerPlane(entity, this.first_slot_0, matrixStack, vertexConsumerProvider, light, overlay, getFlowerTextureIdSlot0(entity), 0);
        this.renderFlowerPlane(entity, this.second_slot_0, matrixStack, vertexConsumerProvider, light, overlay, getFlowerTextureIdSlot0(entity), 0);
        this.renderFlowerPlane(entity, this.first_slot_1, matrixStack, vertexConsumerProvider, light, overlay, getFlowerTextureIdSlot1(entity), 1);
        this.renderFlowerPlane(entity, this.second_slot_1, matrixStack, vertexConsumerProvider, light, overlay, getFlowerTextureIdSlot1(entity), 1);
        this.renderFlowerPlane(entity, this.first_slot_2, matrixStack, vertexConsumerProvider, light, overlay, getFlowerTextureIdSlot2(entity), 2);
        this.renderFlowerPlane(entity, this.second_slot_2, matrixStack, vertexConsumerProvider, light, overlay, getFlowerTextureIdSlot2(entity), 2);
        this.renderFlowerPlane(entity, this.first_slot_3, matrixStack, vertexConsumerProvider, light, overlay, getFlowerTextureIdSlot3(entity), 3);
        this.renderFlowerPlane(entity, this.second_slot_3, matrixStack, vertexConsumerProvider, light, overlay, getFlowerTextureIdSlot3(entity), 3);
        matrixStack.pop();
    }

    private void renderFlowerPlane(VaseBlockEntity entity, ModelPart part, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay, SpriteIdentifier textureId, int slot) {
        if (!entity.getStack(slot).isEmpty()) {
            part.render(matrices, textureId.getVertexConsumer(vertexConsumers, RenderLayer::getEntitySolid), light, overlay);
        }
    }

    private static SpriteIdentifier getFlowerTextureIdSlot0(VaseBlockEntity entity) {
        Item item = entity.getStack(0).getItem();
        Block block = Block.getBlockFromItem(item);
        String string = block.getTranslationKey();
        if (string.contains("minecraft")) {
            String name = string.substring(14);
            return new SpriteIdentifier(FLOWER_ATLAS_TEXTURE, Identifier.of("minecraft:textures/block/" + name + ".png"));
        } else {
            String name = string.substring(21);
            return new SpriteIdentifier(FLOWER_ATLAS_TEXTURE, Identifier.of("flowerbreeding:textures/block/" + name + ".png"));
        }
    }
    private static SpriteIdentifier getFlowerTextureIdSlot1(VaseBlockEntity entity) {
        Item item = entity.getStack(1).getItem();
        Block block = Block.getBlockFromItem(item);
        String string = block.getTranslationKey();
        if (string.contains("minecraft")) {
            String name = string.substring(14);
            return new SpriteIdentifier(FLOWER_ATLAS_TEXTURE, Identifier.of("minecraft:textures/block/" + name + ".png"));
        } else {
            String name = string.substring(21);
            return new SpriteIdentifier(FLOWER_ATLAS_TEXTURE, Identifier.of("flowerbreeding:textures/block/" + name + ".png"));
        }
    }
    private static SpriteIdentifier getFlowerTextureIdSlot2(VaseBlockEntity entity) {
        Item item = entity.getStack(2).getItem();
        Block block = Block.getBlockFromItem(item);
        String string = block.getTranslationKey();
        if (string.contains("minecraft")) {
            String name = string.substring(14);
            return new SpriteIdentifier(FLOWER_ATLAS_TEXTURE, Identifier.of("minecraft:textures/block/" + name + ".png"));
        } else {
            String name = string.substring(21);
            return new SpriteIdentifier(FLOWER_ATLAS_TEXTURE, Identifier.of("flowerbreeding:textures/block/" + name + ".png"));
        }
    }
    private static SpriteIdentifier getFlowerTextureIdSlot3(VaseBlockEntity entity) {
        Item item = entity.getStack(3).getItem();
        Block block = Block.getBlockFromItem(item);
        String string = block.getTranslationKey();
        if (string.contains("minecraft")) {
            String name = string.substring(14);
            return new SpriteIdentifier(FLOWER_ATLAS_TEXTURE, Identifier.of("minecraft:textures/block/" + name + ".png"));
        } else {
            String name = string.substring(21);
            return new SpriteIdentifier(FLOWER_ATLAS_TEXTURE, Identifier.of("flowerbreeding:textures/block/" + name + ".png"));
        }
    }

    private int getLightLevel(World world, BlockPos pos) {
        int bLight = world.getLightLevel(LightType.BLOCK, pos);
        int sLight = world.getLightLevel(LightType.SKY, pos);
        return LightmapTextureManager.pack(bLight, sLight);
    }

    private static EntityModelLayer create() {
        return new EntityModelLayer(Identifier.of(FlowerBreeding.MOD_ID, "vase_flowers"), "main");
    }
}