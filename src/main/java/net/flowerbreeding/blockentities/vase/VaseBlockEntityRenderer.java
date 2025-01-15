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
        this.renderFlower(entity, matrixStack, vertexConsumerProvider, 0, 0.2f, 0.75f, 0.25f, 15f, -15f);
        this.renderFlower(entity, matrixStack, vertexConsumerProvider, 1, -0.01f, -0.33f, -0.02f, 0f, 30f);
        this.renderFlower(entity, matrixStack, vertexConsumerProvider, 2, -0.02f, -0.31f, 0.01f, -30f, 0f);
        this.renderFlower(entity, matrixStack, vertexConsumerProvider, 3, 0.125f, 0.31f, -0.04f, 0f, -30f);
        matrixStack.pop();
    }

    private void renderFlower(VaseBlockEntity entity, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int slot, float x, float y, float z, float degX, float degZ) {
        if (!entity.getStack(slot).isEmpty()) {
            ItemStack itemStack = entity.getStack(slot);
            Block block = Block.getBlockFromItem(itemStack.getItem());
            matrixStack.translate(block.getDefaultState().getModelOffset(entity.getPos()).negate());
            matrixStack.translate(x, y, z);
            matrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(degX));
            matrixStack.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(degZ));
            blockRenderManager.renderBlock(block.getDefaultState(), entity.getPos(), entity.getWorld(), matrixStack, vertexConsumerProvider.getBuffer(RenderLayer.getCutout()), false, Random.create());
        }
    }
}