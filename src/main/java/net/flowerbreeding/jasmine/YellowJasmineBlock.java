package net.flowerbreeding.jasmine;

import com.mojang.serialization.MapCodec;
import net.flowerbreeding.FBBlocks;
import net.minecraft.block.AbstractPlantStemBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.VineLogic;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;

public class YellowJasmineBlock extends AbstractPlantStemBlock {
    public static final MapCodec<YellowJasmineBlock> CODEC = createCodec(YellowJasmineBlock::new);
    protected static final VoxelShape SHAPE = Block.createCuboidShape(4.0, 9.0, 4.0, 12.0, 16.0, 12.0);

    public MapCodec<YellowJasmineBlock> getCodec() {
        return CODEC;
    }

    public YellowJasmineBlock(Settings settings) {
        super(settings, Direction.DOWN, SHAPE, false, 0.1);
    }

    protected int getGrowthLength(Random random) {
        return VineLogic.getGrowthLength(random);
    }

    protected Block getPlant() {
        return FBBlocks.YELLOW_JASMINE_PLANT;
    }

    protected boolean chooseStemState(BlockState state) {
        return VineLogic.isValidForWeepingStem(state);
    }
}

