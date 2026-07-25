package net.flowerbreeding;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.AzaleaBlock;
import net.minecraft.world.level.block.grower.TreeGrower;
import net.minecraft.world.level.block.state.BlockState;
import org.jspecify.annotations.NullMarked;

@NullMarked
public class FBAzaleaBlock extends AzaleaBlock {
    private final TreeGrower saplingGenerator;
    public FBAzaleaBlock(TreeGrower saplingGenerator, Properties settings) {
        super(settings);
        this.saplingGenerator = saplingGenerator;
    }

    @Override
    public void performBonemeal(ServerLevel world, RandomSource random, BlockPos pos, BlockState state) {
        saplingGenerator.growTree(world, world.getChunkSource().getGenerator(), pos, state, random);
    }
}
