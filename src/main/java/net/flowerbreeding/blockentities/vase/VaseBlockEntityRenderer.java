package net.flowerbreeding.blockentities.vase;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.BlockState;
import net.minecraft.client.render.block.MovingBlockRenderState;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.render.command.ModelCommandRenderer;
import net.minecraft.client.render.command.OrderedRenderCommandQueue;
import net.minecraft.client.render.state.CameraRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;

@Environment(EnvType.CLIENT)
public class VaseBlockEntityRenderer implements BlockEntityRenderer<VaseBlockEntity, VaseBlockEntityRenderState> {

    public VaseBlockEntityRenderer(BlockEntityRendererFactory.Context context) {
        super();
    }

    public VaseBlockEntityRenderState createRenderState() {
        return new VaseBlockEntityRenderState();
    }

    public void updateRenderState(VaseBlockEntity vaseBlockEntity, VaseBlockEntityRenderState vaseBlockEntityRenderState, float f, Vec3d vec3d, ModelCommandRenderer.CrumblingOverlayCommand crumblingOverlayCommand) {
        vaseBlockEntityRenderState.flower1 = vaseBlockEntity.getStack(0);
        vaseBlockEntityRenderState.flower2 = vaseBlockEntity.getStack(1);
        vaseBlockEntityRenderState.flower3 = vaseBlockEntity.getStack(2);
        vaseBlockEntityRenderState.flower4 = vaseBlockEntity.getStack(3);

        if (vaseBlockEntityRenderState.flower1.getItem() instanceof BlockItem) {
            assert vaseBlockEntity.getWorld() != null;
            vaseBlockEntityRenderState.flower1State = renderModel(vaseBlockEntity.getPos(), ((BlockItem) vaseBlockEntity.getStack(0).getItem()).getBlock().getDefaultState(),
                    vaseBlockEntity.getWorld().getBiome(vaseBlockEntity.getPos()), vaseBlockEntity.getWorld());
        }
        if (vaseBlockEntityRenderState.flower2.getItem() instanceof BlockItem) {
            assert vaseBlockEntity.getWorld() != null;
            vaseBlockEntityRenderState.flower2State = renderModel(vaseBlockEntity.getPos(), ((BlockItem) vaseBlockEntity.getStack(1).getItem()).getBlock().getDefaultState(),
                    vaseBlockEntity.getWorld().getBiome(vaseBlockEntity.getPos()), vaseBlockEntity.getWorld());
        }
        if (vaseBlockEntityRenderState.flower3.getItem() instanceof BlockItem) {
            assert vaseBlockEntity.getWorld() != null;
            vaseBlockEntityRenderState.flower3State = renderModel(vaseBlockEntity.getPos(), ((BlockItem) vaseBlockEntity.getStack(2).getItem()).getBlock().getDefaultState(),
                    vaseBlockEntity.getWorld().getBiome(vaseBlockEntity.getPos()), vaseBlockEntity.getWorld());
        }
        if (vaseBlockEntityRenderState.flower4.getItem() instanceof BlockItem) {
            assert vaseBlockEntity.getWorld() != null;
            vaseBlockEntityRenderState.flower4State = renderModel(vaseBlockEntity.getPos(), ((BlockItem) vaseBlockEntity.getStack(3).getItem()).getBlock().getDefaultState(),
                    vaseBlockEntity.getWorld().getBiome(vaseBlockEntity.getPos()), vaseBlockEntity.getWorld());
        }

        vaseBlockEntityRenderState.pos = vaseBlockEntity.getPos();

        BlockEntityRenderer.super.updateRenderState(vaseBlockEntity, vaseBlockEntityRenderState, f, vec3d, crumblingOverlayCommand);
    }

    public void render(VaseBlockEntityRenderState vaseBlockEntityRenderState, MatrixStack matrixStack, OrderedRenderCommandQueue orderedRenderCommandQueue, CameraRenderState cameraRenderState) {
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

    private void renderFlower(MovingBlockRenderState movingBlockRenderState, ItemStack itemStack, BlockPos pos, MatrixStack matrixStack, OrderedRenderCommandQueue orderedRenderCommandQueue, float x, float y, float z, float degX, float degZ) {
        matrixStack.push();
        matrixStack.translate(x, y, z);
        matrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(degX));
        matrixStack.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(degZ));
        matrixStack.translate(((BlockItem) itemStack.getItem()).getBlock().getDefaultState().getModelOffset(pos).negate());
        orderedRenderCommandQueue.submitMovingBlock(matrixStack, movingBlockRenderState);
        matrixStack.pop();
    }

    private static MovingBlockRenderState renderModel(BlockPos pos, BlockState state, RegistryEntry<Biome> biome, World world) {
        MovingBlockRenderState movingBlockRenderState = new MovingBlockRenderState();
        movingBlockRenderState.fallingBlockPos = pos;
        movingBlockRenderState.entityBlockPos = pos;
        movingBlockRenderState.blockState = state;
        movingBlockRenderState.biome = biome;
        movingBlockRenderState.world = world;
        return movingBlockRenderState;
    }
}