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
import net.minecraft.util.math.random.Random;

@Environment(EnvType.CLIENT)
public class VaseBlockEntityRenderer implements BlockEntityRenderer<VaseBlockEntity> {
    private final BlockRenderManager blockRenderManager;

    public VaseBlockEntityRenderer(BlockEntityRendererFactory.Context context) {
        this.blockRenderManager = context.getRenderManager();
    }

    public void render(VaseBlockEntity entity, float tickDelta, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int light, int overlay) {
        matrixStack.push();
        matrixStack.scale(0.8f, 0.8f, 0.8f);
        this.renderFlower(entity, matrixStack, vertexConsumerProvider, 0, 0f, 0.8f, 0.05f, 15f, 0f, -15f);
        this.renderFlower(entity, matrixStack, vertexConsumerProvider, 1, -0.19f, -0.21f, 0f, 0f, 0f, 30f);
        this.renderFlower(entity, matrixStack, vertexConsumerProvider, 2, 0f, -0.23f, -0.16f, -30f, 0f, 0f);
        this.renderFlower(entity, matrixStack, vertexConsumerProvider, 3, -0.1f, 0.22f, 0.11f, 0f, 10f,-30f);
        matrixStack.pop();
    }

    private void renderFlower(VaseBlockEntity entity, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int slot, float x, float y, float z, float degX, float degY, float degZ) {
        if (!entity.getStack(slot).isEmpty()) {
            ItemStack itemStack = entity.getStack(slot);
            Block block = Block.getBlockFromItem(itemStack.getItem());
            matrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(degX));
            matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(degY));
            matrixStack.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(degZ));
            matrixStack.translate(block.getDefaultState().getModelOffset(entity.getPos()).negate());
            matrixStack.translate(x, y, z);
            blockRenderManager.renderBlock(block.getDefaultState(), entity.getPos(), entity.getWorld(), matrixStack, vertexConsumerProvider.getBuffer(RenderLayer.getCutout()), false, Random.create());
        }
    }
}