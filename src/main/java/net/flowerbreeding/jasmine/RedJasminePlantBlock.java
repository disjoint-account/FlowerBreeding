package net.flowerbreeding.jasmine;

import com.mojang.serialization.MapCodec;
import net.flowerbreeding.FBBlocks;
import net.minecraft.block.AbstractPlantBlock;
import net.minecraft.block.AbstractPlantStemBlock;
import net.minecraft.block.Block;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;

public class RedJasminePlantBlock extends AbstractPlantBlock {
    public static final MapCodec<RedJasminePlantBlock> CODEC = createCodec(RedJasminePlantBlock::new);
    public static final VoxelShape SHAPE = Block.createCuboidShape(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

    public MapCodec<RedJasminePlantBlock> getCodec() {
        return CODEC;
    }

    public RedJasminePlantBlock(Settings settings) {
        super(settings, Direction.DOWN, SHAPE, false);
    }

    protected AbstractPlantStemBlock getStem() {
        return (AbstractPlantStemBlock) FBBlocks.RED_JASMINE;
    }
}
