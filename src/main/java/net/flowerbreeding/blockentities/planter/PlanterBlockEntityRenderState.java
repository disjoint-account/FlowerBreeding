package net.flowerbreeding.blockentities.planter;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.block.MovingBlockRenderState;
import net.minecraft.client.render.block.entity.state.BlockEntityRenderState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;

@Environment(EnvType.CLIENT)
public class PlanterBlockEntityRenderState extends BlockEntityRenderState {
    public ItemStack flower;
    public MovingBlockRenderState topFlowerState;
    public MovingBlockRenderState bottomFlowerState;

    public BlockPos pos;
}
