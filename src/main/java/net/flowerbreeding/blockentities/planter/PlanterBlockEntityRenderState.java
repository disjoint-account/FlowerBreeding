package net.flowerbreeding.blockentities.planter;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.renderer.block.MovingBlockRenderState;
import net.minecraft.client.renderer.blockentity.state.BlockEntityRenderState;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

@Environment(EnvType.CLIENT)
public class PlanterBlockEntityRenderState extends BlockEntityRenderState {
    public ItemStack flower;
    public MovingBlockRenderState topFlowerState;
    public MovingBlockRenderState bottomFlowerState;

    public BlockPos pos;
}
