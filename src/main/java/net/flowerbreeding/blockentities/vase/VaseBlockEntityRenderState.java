package net.flowerbreeding.blockentities.vase;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.block.MovingBlockRenderState;
import net.minecraft.client.render.block.entity.state.BlockEntityRenderState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;

@Environment(EnvType.CLIENT)
public class VaseBlockEntityRenderState extends BlockEntityRenderState {
    public ItemStack flower1;
    public ItemStack flower2;
    public ItemStack flower3;
    public ItemStack flower4;
    public MovingBlockRenderState flower1State;
    public MovingBlockRenderState flower2State;
    public MovingBlockRenderState flower3State;
    public MovingBlockRenderState flower4State;

    public BlockPos pos;
}
