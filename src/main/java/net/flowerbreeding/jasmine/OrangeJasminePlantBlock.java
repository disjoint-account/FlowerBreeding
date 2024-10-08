package net.flowerbreeding.jasmine;

import com.mojang.serialization.MapCodec;
import net.flowerbreeding.FBBlocks;
import net.minecraft.block.AbstractPlantBlock;
import net.minecraft.block.AbstractPlantStemBlock;
import net.minecraft.block.Block;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;

public class OrangeJasminePlantBlock extends AbstractPlantBlock {
    public static final MapCodec<OrangeJasminePlantBlock> CODEC = createCodec(OrangeJasminePlantBlock::new);
    public static final VoxelShape SHAPE = Block.createCuboidShape(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

    public MapCodec<OrangeJasminePlantBlock> getCodec() {
        return CODEC;
    }

    public OrangeJasminePlantBlock(Settings settings) {
        super(settings, Direction.DOWN, SHAPE, false);
    }

    protected AbstractPlantStemBlock getStem() {
        return (AbstractPlantStemBlock) FBBlocks.ORANGE_JASMINE;
    }
}
