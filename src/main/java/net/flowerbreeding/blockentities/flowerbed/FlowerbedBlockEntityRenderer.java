package net.flowerbreeding.blockentities.flowerbed;

import com.mojang.blaze3d.vertex.PoseStack;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.block.MovingBlockRenderState;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.feature.ModelFeatureRenderer;
import net.minecraft.client.renderer.state.level.CameraRenderState;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import org.jspecify.annotations.NonNull;

@Environment(EnvType.CLIENT)
public class FlowerbedBlockEntityRenderer implements BlockEntityRenderer<FlowerbedBlockEntity, FlowerbedBlockEntityRenderState> {

    public FlowerbedBlockEntityRenderer(BlockEntityRendererProvider.Context ctx) {
        super();
    }

    public @NonNull FlowerbedBlockEntityRenderState createRenderState() {
        return new FlowerbedBlockEntityRenderState();
    }

    public void extractRenderState(FlowerbedBlockEntity flowerbedBlockEntity, FlowerbedBlockEntityRenderState flowerbedBlockEntityRenderState, float f, @NonNull Vec3 vec3d, ModelFeatureRenderer.CrumblingOverlay crumblingOverlayCommand) {
        flowerbedBlockEntityRenderState.flower1 = flowerbedBlockEntity.getItem(0);
        flowerbedBlockEntityRenderState.flower2 = flowerbedBlockEntity.getItem(1);
        flowerbedBlockEntityRenderState.flower3 = flowerbedBlockEntity.getItem(2);
        flowerbedBlockEntityRenderState.flower4 = flowerbedBlockEntity.getItem(3);

        if (flowerbedBlockEntityRenderState.flower1.getItem() instanceof BlockItem && flowerbedBlockEntity.getLevel() instanceof ClientLevel level) {
            assert flowerbedBlockEntity.getLevel() != null;
            flowerbedBlockEntityRenderState.flower1State = renderModel(flowerbedBlockEntity.getBlockPos(), ((BlockItem) flowerbedBlockEntity.getItem(0).getItem()).getBlock().defaultBlockState(),
                    flowerbedBlockEntity.getLevel().getBiome(flowerbedBlockEntity.getBlockPos()), level);
        }
        if (flowerbedBlockEntityRenderState.flower2.getItem() instanceof BlockItem && flowerbedBlockEntity.getLevel() instanceof ClientLevel level) {
            assert flowerbedBlockEntity.getLevel() != null;
            flowerbedBlockEntityRenderState.flower2State = renderModel(flowerbedBlockEntity.getBlockPos(), ((BlockItem) flowerbedBlockEntity.getItem(1).getItem()).getBlock().defaultBlockState(),
                    flowerbedBlockEntity.getLevel().getBiome(flowerbedBlockEntity.getBlockPos()), level);
        }
        if (flowerbedBlockEntityRenderState.flower3.getItem() instanceof BlockItem && flowerbedBlockEntity.getLevel() instanceof ClientLevel level) {
            assert flowerbedBlockEntity.getLevel() != null;
            flowerbedBlockEntityRenderState.flower3State = renderModel(flowerbedBlockEntity.getBlockPos(), ((BlockItem) flowerbedBlockEntity.getItem(2).getItem()).getBlock().defaultBlockState(),
                    flowerbedBlockEntity.getLevel().getBiome(flowerbedBlockEntity.getBlockPos()), level);
        }
        if (flowerbedBlockEntityRenderState.flower4.getItem() instanceof BlockItem && flowerbedBlockEntity.getLevel() instanceof ClientLevel level) {
            assert flowerbedBlockEntity.getLevel() != null;
            flowerbedBlockEntityRenderState.flower4State = renderModel(flowerbedBlockEntity.getBlockPos(), ((BlockItem) flowerbedBlockEntity.getItem(3).getItem()).getBlock().defaultBlockState(),
                    flowerbedBlockEntity.getLevel().getBiome(flowerbedBlockEntity.getBlockPos()), level);
        }

        flowerbedBlockEntityRenderState.pos = flowerbedBlockEntity.getBlockPos();

        BlockEntityRenderer.super.extractRenderState(flowerbedBlockEntity, flowerbedBlockEntityRenderState, f, vec3d, crumblingOverlayCommand);
    }

    public void submit(FlowerbedBlockEntityRenderState flowerbedBlockEntityRenderState, PoseStack matrixStack, @NonNull SubmitNodeCollector orderedRenderCommandQueue, @NonNull CameraRenderState cameraRenderState) {
        matrixStack.translate(0, 1, 0);
        if (flowerbedBlockEntityRenderState.flower1 != ItemStack.EMPTY) {
            this.renderFlower(flowerbedBlockEntityRenderState.flower1State, flowerbedBlockEntityRenderState.flower1, flowerbedBlockEntityRenderState.pos, matrixStack, orderedRenderCommandQueue, 0.23f, 0.27f);
        }
        if (flowerbedBlockEntityRenderState.flower2 != ItemStack.EMPTY) {
            this.renderFlower(flowerbedBlockEntityRenderState.flower2State, flowerbedBlockEntityRenderState.flower2, flowerbedBlockEntityRenderState.pos, matrixStack, orderedRenderCommandQueue, -0.27f, 0.23f);
        }
        if (flowerbedBlockEntityRenderState.flower3 != ItemStack.EMPTY) {
            this.renderFlower(flowerbedBlockEntityRenderState.flower3State, flowerbedBlockEntityRenderState.flower3, flowerbedBlockEntityRenderState.pos, matrixStack, orderedRenderCommandQueue, -0.23f, -0.27f);
        }
        if (flowerbedBlockEntityRenderState.flower4 != ItemStack.EMPTY) {
            this.renderFlower(flowerbedBlockEntityRenderState.flower4State, flowerbedBlockEntityRenderState.flower4, flowerbedBlockEntityRenderState.pos, matrixStack, orderedRenderCommandQueue, 0.27f, -0.23f);
        }
    }

    private void renderFlower(MovingBlockRenderState movingBlockRenderState, ItemStack itemStack, BlockPos pos, PoseStack matrixStack, SubmitNodeCollector orderedRenderCommandQueue, float x, float z) {
        matrixStack.pushPose();
        matrixStack.translate(x, 0, z);
        matrixStack.translate(((BlockItem) itemStack.getItem()).getBlock().defaultBlockState().getOffset(pos).reverse());
        orderedRenderCommandQueue.submitMovingBlock(matrixStack, movingBlockRenderState, 0);
        matrixStack.popPose();
    }

    private static MovingBlockRenderState renderModel(BlockPos pos, BlockState state, Holder<Biome> biome, ClientLevel world) {
        MovingBlockRenderState movingBlockRenderState = new MovingBlockRenderState();
        movingBlockRenderState.randomSeedPos = pos;
        movingBlockRenderState.blockPos = pos;
        movingBlockRenderState.blockState = state;
        movingBlockRenderState.biome = biome;
        movingBlockRenderState.cardinalLighting = world.cardinalLighting();
        movingBlockRenderState.lightEngine = world.getLightEngine();
        return movingBlockRenderState;
    }
}