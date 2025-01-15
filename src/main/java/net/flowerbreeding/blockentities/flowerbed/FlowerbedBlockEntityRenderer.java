package net.flowerbreeding.blockentities.flowerbed;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.Block;
import net.minecraft.client.render.*;
import net.minecraft.client.render.block.BlockRenderManager;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.random.Random;

@Environment(EnvType.CLIENT)
public class FlowerbedBlockEntityRenderer implements BlockEntityRenderer<FlowerbedBlockEntity> {
    private final BlockRenderManager blockRenderManager;

    public FlowerbedBlockEntityRenderer(BlockEntityRendererFactory.Context context) {
        this.blockRenderManager = context.getRenderManager();
    }

    public void render(FlowerbedBlockEntity entity, float tickDelta, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int light, int overlay) {
        matrixStack.push();
        matrixStack.translate(0, 1, 0);
        this.renderFlower(entity, matrixStack, vertexConsumerProvider, 0, 0.3f, 0.25f);
        this.renderFlower(entity, matrixStack, vertexConsumerProvider, 1, -0.5f, 0.05f);
        this.renderFlower(entity, matrixStack, vertexConsumerProvider, 2, -0.05f, -0.5f);
        this.renderFlower(entity, matrixStack, vertexConsumerProvider, 3, 0.5f, -0.1f);
        matrixStack.pop();
    }

    private void renderFlower(FlowerbedBlockEntity entity, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int slot, float x, float z) {
            ItemStack itemStack = entity.getStack(slot);
            Block block = Block.getBlockFromItem(itemStack.getItem());
            matrixStack.translate(block.getDefaultState().getModelOffset(entity.getPos()).negate());
            matrixStack.translate(x, 0, z);
            blockRenderManager.renderBlock(block.getDefaultState(), entity.getPos(), entity.getWorld(), matrixStack, vertexConsumerProvider.getBuffer(RenderLayer.getCutout()), false, Random.create());
    }
}