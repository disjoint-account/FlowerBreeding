package net.flowerbreeding.jasmine;

import com.mojang.serialization.MapCodec;
import net.flowerbreeding.FBBlocks;
import net.minecraft.block.AbstractPlantBlock;
import net.minecraft.block.AbstractPlantStemBlock;
import net.minecraft.block.Block;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;

public class BlackJasminePlantBlock extends AbstractPlantBlock {
    public static final MapCodec<BlackJasminePlantBlock> CODEC = createCodec(BlackJasminePlantBlock::new);
    public static final VoxelShape SHAPE = Block.createCuboidShape(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

    public MapCodec<BlackJasminePlantBlock> getCodec() {
        return CODEC;
    }

    public BlackJasminePlantBlock(Settings settings) {
        super(settings, Direction.DOWN, SHAPE, false);
    }

    protected AbstractPlantStemBlock getStem() {
        return (AbstractPlantStemBlock) FBBlocks.BLACK_JASMINE;
    }
}
