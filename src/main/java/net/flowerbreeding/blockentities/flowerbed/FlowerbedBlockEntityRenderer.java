package net.flowerbreeding.blockentities.flowerbed;

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
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;

@Environment(EnvType.CLIENT)
public class FlowerbedBlockEntityRenderer implements BlockEntityRenderer<FlowerbedBlockEntity, FlowerbedBlockEntityRenderState> {

    public FlowerbedBlockEntityRenderer(BlockEntityRendererFactory.Context ctx) {
        super();
    }

    public FlowerbedBlockEntityRenderState createRenderState() {
        return new FlowerbedBlockEntityRenderState();
    }

    public void updateRenderState(FlowerbedBlockEntity flowerbedBlockEntity, FlowerbedBlockEntityRenderState flowerbedBlockEntityRenderState, float f, Vec3d vec3d, ModelCommandRenderer.CrumblingOverlayCommand crumblingOverlayCommand) {
        flowerbedBlockEntityRenderState.flower1 = flowerbedBlockEntity.getStack(0);
        flowerbedBlockEntityRenderState.flower2 = flowerbedBlockEntity.getStack(1);
        flowerbedBlockEntityRenderState.flower3 = flowerbedBlockEntity.getStack(2);
        flowerbedBlockEntityRenderState.flower4 = flowerbedBlockEntity.getStack(3);

        if (flowerbedBlockEntityRenderState.flower1.getItem() instanceof BlockItem) {
            assert flowerbedBlockEntity.getWorld() != null;
            flowerbedBlockEntityRenderState.flower1State = renderModel(flowerbedBlockEntity.getPos(), ((BlockItem) flowerbedBlockEntity.getStack(0).getItem()).getBlock().getDefaultState(),
                    flowerbedBlockEntity.getWorld().getBiome(flowerbedBlockEntity.getPos()), flowerbedBlockEntity.getWorld());
        }
        if (flowerbedBlockEntityRenderState.flower2.getItem() instanceof BlockItem) {
            assert flowerbedBlockEntity.getWorld() != null;
            flowerbedBlockEntityRenderState.flower2State = renderModel(flowerbedBlockEntity.getPos(), ((BlockItem) flowerbedBlockEntity.getStack(1).getItem()).getBlock().getDefaultState(),
                    flowerbedBlockEntity.getWorld().getBiome(flowerbedBlockEntity.getPos()), flowerbedBlockEntity.getWorld());
        }
        if (flowerbedBlockEntityRenderState.flower3.getItem() instanceof BlockItem) {
            assert flowerbedBlockEntity.getWorld() != null;
            flowerbedBlockEntityRenderState.flower3State = renderModel(flowerbedBlockEntity.getPos(), ((BlockItem) flowerbedBlockEntity.getStack(2).getItem()).getBlock().getDefaultState(),
                    flowerbedBlockEntity.getWorld().getBiome(flowerbedBlockEntity.getPos()), flowerbedBlockEntity.getWorld());
        }
        if (flowerbedBlockEntityRenderState.flower4.getItem() instanceof BlockItem) {
            assert flowerbedBlockEntity.getWorld() != null;
            flowerbedBlockEntityRenderState.flower4State = renderModel(flowerbedBlockEntity.getPos(), ((BlockItem) flowerbedBlockEntity.getStack(3).getItem()).getBlock().getDefaultState(),
                    flowerbedBlockEntity.getWorld().getBiome(flowerbedBlockEntity.getPos()), flowerbedBlockEntity.getWorld());
        }

        flowerbedBlockEntityRenderState.pos = flowerbedBlockEntity.getPos();

        BlockEntityRenderer.super.updateRenderState(flowerbedBlockEntity, flowerbedBlockEntityRenderState, f, vec3d, crumblingOverlayCommand);
    }

    public void render(FlowerbedBlockEntityRenderState flowerbedBlockEntityRenderState, MatrixStack matrixStack, OrderedRenderCommandQueue orderedRenderCommandQueue, CameraRenderState cameraRenderState) {
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

    private void renderFlower(MovingBlockRenderState movingBlockRenderState, ItemStack itemStack, BlockPos pos, MatrixStack matrixStack, OrderedRenderCommandQueue orderedRenderCommandQueue, float x, float z) {
        matrixStack.push();
        matrixStack.translate(x, 0, z);
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