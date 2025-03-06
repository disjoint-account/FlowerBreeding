package net.flowerbreeding.blockentities.planter;

import net.flowerbreeding.util.FBTags;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SweetBerryBushBlock;
import net.minecraft.block.enums.DoubleBlockHalf;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.BlockRenderManager;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.random.Random;

public class PlanterBlockEntityRenderer implements BlockEntityRenderer<PlanterBlockEntity> {
    private final BlockRenderManager blockRenderManager;

    public PlanterBlockEntityRenderer(BlockEntityRendererFactory.Context context) {
        this.blockRenderManager = context.getRenderManager();
    }

    public void render(PlanterBlockEntity entity, float tickDelta, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int light, int overlay) {
        matrixStack.push();
        this.renderBottomFlower(entity, matrixStack, vertexConsumerProvider);
        if (!entity.getStack(0).isIn(FBTags.Items.BUSHES)) {
            this.renderTopFlower(entity, matrixStack, vertexConsumerProvider);
        }
        matrixStack.pop();
    }

    private void renderBottomFlower(PlanterBlockEntity entity, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider) {
        ItemStack itemStack = entity.getStack(0);
        Block block = Block.getBlockFromItem(itemStack.getItem());
        matrixStack.translate(block.getDefaultState().getModelOffset(entity.getPos()).negate());
        matrixStack.translate(0, 0.4375, 0);
        BlockState state;
        if (itemStack.isOf(Items.SWEET_BERRIES)) {
            state = block.getDefaultState().with(SweetBerryBushBlock.AGE, 3);
        }
        else state = block.getDefaultState();
        blockRenderManager.renderBlock(state, entity.getPos(), entity.getWorld(), matrixStack, vertexConsumerProvider.getBuffer(RenderLayer.getCutout()), false, Random.create());
    }

    private void renderTopFlower(PlanterBlockEntity entity, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider) {
        ItemStack itemStack = entity.getStack(0);
        Block block = Block.getBlockFromItem(itemStack.getItem());
        matrixStack.translate(block.getDefaultState().getModelOffset(entity.getPos()).negate());
        matrixStack.translate(0, 1, 0);
        if (!block.getDefaultState().isOf(Blocks.AIR)) {
            blockRenderManager.renderBlock(block.getDefaultState().with(Properties.DOUBLE_BLOCK_HALF, DoubleBlockHalf.UPPER), entity.getPos(), entity.getWorld(), matrixStack, vertexConsumerProvider.getBuffer(RenderLayer.getCutout()), false, Random.create());
        }
    }
}