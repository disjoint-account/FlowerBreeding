package net.flowerbreeding.blockentities.planter;

import com.mojang.blaze3d.vertex.PoseStack;
import net.flowerbreeding.util.FBTags;
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
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.phys.Vec3;
import org.jspecify.annotations.NonNull;

public class PlanterBlockEntityRenderer implements BlockEntityRenderer<PlanterBlockEntity, PlanterBlockEntityRenderState> {

    public PlanterBlockEntityRenderer(BlockEntityRendererProvider.Context context) {
        super();
    }

    public @NonNull PlanterBlockEntityRenderState createRenderState() {
        return new PlanterBlockEntityRenderState();
    }

    public void extractRenderState(PlanterBlockEntity planterBlockEntity, PlanterBlockEntityRenderState planterBlockEntityRenderState, float f, @NonNull Vec3 vec3d, ModelFeatureRenderer.CrumblingOverlay crumblingOverlayCommand) {
        planterBlockEntityRenderState.flower = planterBlockEntity.getItem(0);

        if (planterBlockEntity.getLevel() instanceof ClientLevel level) {
            if (!planterBlockEntityRenderState.flower.isEmpty()) {
                assert planterBlockEntity.getLevel() != null;

                if (!planterBlockEntityRenderState.flower.is(FBTags.Items.BUSHES)) {
                    planterBlockEntityRenderState.bottomFlowerState = renderModel(planterBlockEntity.getBlockPos(),
                            ((BlockItem) planterBlockEntity.getItem(0).getItem()).getBlock().defaultBlockState().setValue(BlockStateProperties.DOUBLE_BLOCK_HALF, DoubleBlockHalf.LOWER),
                            planterBlockEntity.getLevel().getBiome(planterBlockEntity.getBlockPos()), level);

                    planterBlockEntityRenderState.topFlowerState = renderModel(planterBlockEntity.getBlockPos(),
                            ((BlockItem) planterBlockEntity.getItem(0).getItem()).getBlock().defaultBlockState().setValue(BlockStateProperties.DOUBLE_BLOCK_HALF, DoubleBlockHalf.UPPER),
                            planterBlockEntity.getLevel().getBiome(planterBlockEntity.getBlockPos()), level);
                } else {
                    planterBlockEntityRenderState.bottomFlowerState = renderModel(planterBlockEntity.getBlockPos(),
                            ((BlockItem) planterBlockEntity.getItem(0).getItem()).getBlock().defaultBlockState(),
                            planterBlockEntity.getLevel().getBiome(planterBlockEntity.getBlockPos()), level);
                }
            }
        }

        planterBlockEntityRenderState.pos = planterBlockEntity.getBlockPos();

        BlockEntityRenderer.super.extractRenderState(planterBlockEntity, planterBlockEntityRenderState, f, vec3d, crumblingOverlayCommand);
    }

    public void submit(PlanterBlockEntityRenderState planterBlockEntityRenderState, @NonNull PoseStack matrixStack, @NonNull SubmitNodeCollector orderedRenderCommandQueue, @NonNull CameraRenderState cameraRenderState) {
        if (planterBlockEntityRenderState.flower != ItemStack.EMPTY) {
            this.renderBottomFlower(planterBlockEntityRenderState.bottomFlowerState, planterBlockEntityRenderState.flower, planterBlockEntityRenderState.pos, matrixStack, orderedRenderCommandQueue);

            if (!planterBlockEntityRenderState.flower.is(FBTags.Items.BUSHES)) {
                this.renderTopFlower(planterBlockEntityRenderState.topFlowerState, planterBlockEntityRenderState.flower, planterBlockEntityRenderState.pos, matrixStack, orderedRenderCommandQueue);
            }
        }
    }

    private void renderBottomFlower(MovingBlockRenderState movingBlockRenderState, ItemStack itemStack, BlockPos pos, PoseStack matrixStack, SubmitNodeCollector orderedRenderCommandQueue) {
        matrixStack.pushPose();
        matrixStack.translate(0, 0.4375, 0);
        matrixStack.translate(((BlockItem) itemStack.getItem()).getBlock().defaultBlockState().getOffset(pos).reverse());
        orderedRenderCommandQueue.submitMovingBlock(matrixStack, movingBlockRenderState, 0);
        matrixStack.popPose();
    }

    private void renderTopFlower(MovingBlockRenderState movingBlockRenderState, ItemStack itemStack, BlockPos pos, PoseStack matrixStack, SubmitNodeCollector orderedRenderCommandQueue) {
        matrixStack.pushPose();
        matrixStack.translate(0, 1.4375, 0);
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