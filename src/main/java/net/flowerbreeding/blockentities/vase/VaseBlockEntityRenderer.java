package net.flowerbreeding.blockentities.vase;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.Block;
import net.minecraft.client.render.*;
import net.minecraft.client.render.block.BlockRenderManager;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.RotationAxis;

@Environment(EnvType.CLIENT)
public class VaseBlockEntityRenderer implements BlockEntityRenderer<VaseBlockEntity> {
    private final BlockRenderManager blockRenderManager;

    public VaseBlockEntityRenderer(BlockEntityRendererFactory.Context context) {
        this.blockRenderManager = context.getRenderManager();
    }

    public void render(VaseBlockEntity entity, float tickDelta, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int light, int overlay) {
        matrixStack.push();
        matrixStack.scale(0.8f, 0.8f, 0.8f);
        this.renderFlower(entity, matrixStack, vertexConsumerProvider, light, 0, 0.2f, 0.7f, 0.25f, 15f, -15f);
        this.renderFlower(entity, matrixStack, vertexConsumerProvider, light, 1, -0.05f, -0.275f, 0f, 0f, 30f);
        this.renderFlower(entity, matrixStack, vertexConsumerProvider, light, 2, 0f, -0.275f, -0.0125f, -30f, 0f);
        this.renderFlower(entity, matrixStack, vertexConsumerProvider, light, 3, 0.125f, 0.25f, -0.1f, 0f, -30f);
        matrixStack.pop();
    }

    private void renderFlower(VaseBlockEntity entity, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int light, int slot, float x, float y, float z, float degX, float degZ) {
        if (!entity.getStack(slot).isEmpty()) {
            ItemStack itemStack = entity.getStack(slot);
            Block block = Block.getBlockFromItem(itemStack.getItem());
            matrixStack.translate(x, y, z);
            matrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(degX));
            matrixStack.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(degZ));
            blockRenderManager.renderBlockAsEntity(block.getDefaultState(), matrixStack, vertexConsumerProvider, light, OverlayTexture.DEFAULT_UV);
        }
    }
}