package net.flowerbreeding.blockentities.planter;

import net.flowerbreeding.util.FBTags;
import net.minecraft.block.BlockState;
import net.minecraft.block.enums.DoubleBlockHalf;
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
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;

public class PlanterBlockEntityRenderer implements BlockEntityRenderer<PlanterBlockEntity, PlanterBlockEntityRenderState> {

    public PlanterBlockEntityRenderer(BlockEntityRendererFactory.Context context) {
        super();
    }

    public PlanterBlockEntityRenderState createRenderState() {
        return new PlanterBlockEntityRenderState();
    }

    public void updateRenderState(PlanterBlockEntity planterBlockEntity, PlanterBlockEntityRenderState planterBlockEntityRenderState, float f, Vec3d vec3d, ModelCommandRenderer.CrumblingOverlayCommand crumblingOverlayCommand) {
        planterBlockEntityRenderState.flower = planterBlockEntity.getStack(0);

        if (planterBlockEntityRenderState.flower.getItem() instanceof BlockItem) {
            assert planterBlockEntity.getWorld() != null;

            if (!planterBlockEntityRenderState.flower.isIn(FBTags.Items.BUSHES)) {
                planterBlockEntityRenderState.bottomFlowerState = renderModel(planterBlockEntity.getPos(),
                        ((BlockItem) planterBlockEntity.getStack(0).getItem()).getBlock().getDefaultState().with(Properties.DOUBLE_BLOCK_HALF, DoubleBlockHalf.LOWER),
                        planterBlockEntity.getWorld().getBiome(planterBlockEntity.getPos()), planterBlockEntity.getWorld());

                planterBlockEntityRenderState.topFlowerState = renderModel(planterBlockEntity.getPos(),
                        ((BlockItem) planterBlockEntity.getStack(0).getItem()).getBlock().getDefaultState().with(Properties.DOUBLE_BLOCK_HALF, DoubleBlockHalf.UPPER),
                        planterBlockEntity.getWorld().getBiome(planterBlockEntity.getPos()), planterBlockEntity.getWorld());
            }
            else {
                planterBlockEntityRenderState.bottomFlowerState = renderModel(planterBlockEntity.getPos(),
                        ((BlockItem) planterBlockEntity.getStack(0).getItem()).getBlock().getDefaultState(),
                        planterBlockEntity.getWorld().getBiome(planterBlockEntity.getPos()), planterBlockEntity.getWorld());
            }
        }

        planterBlockEntityRenderState.pos = planterBlockEntity.getPos();

        BlockEntityRenderer.super.updateRenderState(planterBlockEntity, planterBlockEntityRenderState, f, vec3d, crumblingOverlayCommand);
    }

    public void render(PlanterBlockEntityRenderState planterBlockEntityRenderState, MatrixStack matrixStack, OrderedRenderCommandQueue orderedRenderCommandQueue, CameraRenderState cameraRenderState) {
        if (planterBlockEntityRenderState.flower != ItemStack.EMPTY) {
            this.renderBottomFlower(planterBlockEntityRenderState.bottomFlowerState, planterBlockEntityRenderState.flower, planterBlockEntityRenderState.pos, matrixStack, orderedRenderCommandQueue);

            if (!planterBlockEntityRenderState.flower.isIn(FBTags.Items.BUSHES)) {
                this.renderTopFlower(planterBlockEntityRenderState.topFlowerState, planterBlockEntityRenderState.flower, planterBlockEntityRenderState.pos, matrixStack, orderedRenderCommandQueue);
            }
        }
    }

    private void renderBottomFlower(MovingBlockRenderState movingBlockRenderState, ItemStack itemStack, BlockPos pos, MatrixStack matrixStack, OrderedRenderCommandQueue orderedRenderCommandQueue) {
        matrixStack.push();
        matrixStack.translate(0, 0.4375, 0);
        matrixStack.translate(((BlockItem) itemStack.getItem()).getBlock().getDefaultState().getModelOffset(pos).negate());
        orderedRenderCommandQueue.submitMovingBlock(matrixStack, movingBlockRenderState);
        matrixStack.pop();
    }

    private void renderTopFlower(MovingBlockRenderState movingBlockRenderState, ItemStack itemStack, BlockPos pos, MatrixStack matrixStack, OrderedRenderCommandQueue orderedRenderCommandQueue) {
        matrixStack.push();
        matrixStack.translate(0, 1.4735, 0);
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