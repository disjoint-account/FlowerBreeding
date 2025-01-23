package net.flowerbreeding;

import net.minecraft.block.AzaleaBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.SaplingGenerator;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;

public class FBAzaleaBlock extends AzaleaBlock {
    private final SaplingGenerator saplingGenerator;
    public FBAzaleaBlock(SaplingGenerator saplingGenerator, Settings settings) {
        super(settings);
        this.saplingGenerator = saplingGenerator;
    }

    @Override
    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        saplingGenerator.generate(world, world.getChunkManager().getChunkGenerator(), pos, state, random);
    }
}
