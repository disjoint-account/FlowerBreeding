package net.flowerbreeding.blockentities.vase;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
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
public class VaseBlockEntityRenderer implements BlockEntityRenderer<VaseBlockEntity, VaseBlockEntityRenderState> {

    public VaseBlockEntityRenderer(BlockEntityRendererProvider.Context context) {
        super();
    }

    public VaseBlockEntityRenderState createRenderState() {
        return new VaseBlockEntityRenderState();
    }

    public void extractRenderState(VaseBlockEntity vaseBlockEntity, VaseBlockEntityRenderState vaseBlockEntityRenderState, float f, @NonNull Vec3 vec3d, ModelFeatureRenderer.CrumblingOverlay crumblingOverlayCommand) {
        vaseBlockEntityRenderState.flower1 = vaseBlockEntity.getItem(0);
        vaseBlockEntityRenderState.flower2 = vaseBlockEntity.getItem(1);
        vaseBlockEntityRenderState.flower3 = vaseBlockEntity.getItem(2);
        vaseBlockEntityRenderState.flower4 = vaseBlockEntity.getItem(3);

        if (vaseBlockEntityRenderState.flower1.getItem() instanceof BlockItem && vaseBlockEntity.getLevel() instanceof ClientLevel level) {
            assert vaseBlockEntity.getLevel() != null;
            vaseBlockEntityRenderState.flower1State = renderModel(vaseBlockEntity.getBlockPos(), ((BlockItem) vaseBlockEntity.getItem(0).getItem()).getBlock().defaultBlockState(),
                    vaseBlockEntity.getLevel().getBiome(vaseBlockEntity.getBlockPos()), level);
        }
        if (vaseBlockEntityRenderState.flower2.getItem() instanceof BlockItem && vaseBlockEntity.getLevel() instanceof ClientLevel level) {
            assert vaseBlockEntity.getLevel() != null;
            vaseBlockEntityRenderState.flower2State = renderModel(vaseBlockEntity.getBlockPos(), ((BlockItem) vaseBlockEntity.getItem(1).getItem()).getBlock().defaultBlockState(),
                    vaseBlockEntity.getLevel().getBiome(vaseBlockEntity.getBlockPos()), level);
        }
        if (vaseBlockEntityRenderState.flower3.getItem() instanceof BlockItem && vaseBlockEntity.getLevel() instanceof ClientLevel level) {
            assert vaseBlockEntity.getLevel() != null;
            vaseBlockEntityRenderState.flower3State = renderModel(vaseBlockEntity.getBlockPos(), ((BlockItem) vaseBlockEntity.getItem(2).getItem()).getBlock().defaultBlockState(),
                    vaseBlockEntity.getLevel().getBiome(vaseBlockEntity.getBlockPos()), level);
        }
        if (vaseBlockEntityRenderState.flower4.getItem() instanceof BlockItem && vaseBlockEntity.getLevel() instanceof ClientLevel level) {
            assert vaseBlockEntity.getLevel() != null;
            vaseBlockEntityRenderState.flower4State = renderModel(vaseBlockEntity.getBlockPos(), ((BlockItem) vaseBlockEntity.getItem(3).getItem()).getBlock().defaultBlockState(),
                    vaseBlockEntity.getLevel().getBiome(vaseBlockEntity.getBlockPos()), level);
        }

        vaseBlockEntityRenderState.pos = vaseBlockEntity.getBlockPos();

        BlockEntityRenderer.super.extractRenderState(vaseBlockEntity, vaseBlockEntityRenderState, f, vec3d, crumblingOverlayCommand);
    }

    public void submit(VaseBlockEntityRenderState vaseBlockEntityRenderState, PoseStack matrixStack, @NonNull SubmitNodeCollector orderedRenderCommandQueue, @NonNull CameraRenderState cameraRenderState) {
        matrixStack.translate(0.094f, 0.313f, 0.094f);
        matrixStack.scale(0.8f, 0.8f, 0.8f);
        if (vaseBlockEntityRenderState.flower1 != ItemStack.EMPTY) {
            this.renderFlower(vaseBlockEntityRenderState.flower1State, vaseBlockEntityRenderState.flower1, vaseBlockEntityRenderState.pos, matrixStack, orderedRenderCommandQueue, 0.1f, 0.25f, 0.14f, 15f, -15f);
        }
        if (vaseBlockEntityRenderState.flower2 != ItemStack.EMPTY) {
            this.renderFlower(vaseBlockEntityRenderState.flower2State, vaseBlockEntityRenderState.flower2, vaseBlockEntityRenderState.pos, matrixStack, orderedRenderCommandQueue, -0.05f, 0f, 0.075f, 15f, 15f);
        }
        if (vaseBlockEntityRenderState.flower3 != ItemStack.EMPTY) {
            this.renderFlower(vaseBlockEntityRenderState.flower3State, vaseBlockEntityRenderState.flower3, vaseBlockEntityRenderState.pos, matrixStack, orderedRenderCommandQueue, -0.05f, -0.25f, -0.02f, -15f, 15f);
        }
        if (vaseBlockEntityRenderState.flower4 != ItemStack.EMPTY) {
            this.renderFlower(vaseBlockEntityRenderState.flower4State, vaseBlockEntityRenderState.flower4, vaseBlockEntityRenderState.pos, matrixStack, orderedRenderCommandQueue, 0.1f, 0f, -0.1f, -15f, -15f);
        }
    }

    private void renderFlower(MovingBlockRenderState movingBlockRenderState, ItemStack itemStack, BlockPos pos, PoseStack matrixStack, SubmitNodeCollector orderedRenderCommandQueue, float x, float y, float z, float degX, float degZ) {
        matrixStack.pushPose();
        matrixStack.translate(x, y, z);
        matrixStack.mulPose(Axis.XP.rotationDegrees(degX));
        matrixStack.mulPose(Axis.ZP.rotationDegrees(degZ));
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