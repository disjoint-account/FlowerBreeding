package net.flowerbreeding.jasmine;

import com.mojang.serialization.MapCodec;
import net.flowerbreeding.FBBlocks;
import net.minecraft.block.*;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;

public class MagentaJasminePlantBlock extends AbstractPlantBlock {
    public static final MapCodec<net.flowerbreeding.jasmine.MagentaJasminePlantBlock> CODEC = createCodec(net.flowerbreeding.jasmine.MagentaJasminePlantBlock::new);
    public static final VoxelShape SHAPE = Block.createCuboidShape(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

    public MapCodec<net.flowerbreeding.jasmine.MagentaJasminePlantBlock> getCodec() {
        return CODEC;
    }

    public MagentaJasminePlantBlock(AbstractBlock.Settings settings) {
        super(settings, Direction.DOWN, SHAPE, false);
    }

    protected AbstractPlantStemBlock getStem() {
        return (AbstractPlantStemBlock) FBBlocks.MAGENTA_JASMINE;
    }
}
