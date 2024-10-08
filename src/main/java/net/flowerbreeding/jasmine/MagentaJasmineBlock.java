package net.flowerbreeding.jasmine;

import com.mojang.serialization.MapCodec;
import net.flowerbreeding.FBBlocks;
import net.minecraft.block.*;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;

public class MagentaJasmineBlock extends AbstractPlantStemBlock {
    public static final MapCodec<net.flowerbreeding.jasmine.MagentaJasmineBlock> CODEC = createCodec(net.flowerbreeding.jasmine.MagentaJasmineBlock::new);
    protected static final VoxelShape SHAPE = Block.createCuboidShape(4.0, 9.0, 4.0, 12.0, 16.0, 12.0);

    public MapCodec<net.flowerbreeding.jasmine.MagentaJasmineBlock> getCodec() {
        return CODEC;
    }

    public MagentaJasmineBlock(AbstractBlock.Settings settings) {
        super(settings, Direction.DOWN, SHAPE, false, 0.1);
    }

    protected int getGrowthLength(Random random) {
        return VineLogic.getGrowthLength(random);
    }

    protected Block getPlant() {
        return FBBlocks.MAGENTA_JASMINE_PLANT;
    }

    protected boolean chooseStemState(BlockState state) {
        return VineLogic.isValidForWeepingStem(state);
    }
}

