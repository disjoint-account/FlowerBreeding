package net.flowerbreeding.eyeblossoms;

import net.flowerbreeding.FBBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CreakingHeartBlock;
import net.minecraft.block.FlowerPotBlock;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;

public class PinkEyeblossomFlowerPotBlock extends FlowerPotBlock {

    public PinkEyeblossomFlowerPotBlock(Block content, Settings settings) {
        super(content, settings);
    }

    @Override
    protected boolean hasRandomTicks(BlockState state) {
        return true;
    }

    @Override
    protected void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (world.getDimension().natural()) {
            boolean bl = this.getContent() == FBBlocks.OPEN_PINK_EYEBLOSSOM;
            boolean bl2 = CreakingHeartBlock.isNightAndNatural(world);
            if (bl != bl2) {
                world.setBlockState(pos, this.getToggledState(state), 3);
                PinkEyeblossomBlock.PinkEyeblossomState pinkEyeblossomState = PinkEyeblossomBlock.PinkEyeblossomState.of(bl).getOpposite();
                pinkEyeblossomState.spawnTrailParticle(world, pos, random);
                world.playSound(null, pos, pinkEyeblossomState.getLongSound(), SoundCategory.BLOCKS, 1.0F, 1.0F);
            }
        }
    }

    @Override
    public BlockState getToggledState(BlockState state) {
        if (state.isOf(FBBlocks.POTTED_OPEN_PINK_EYEBLOSSOM)) {
            return FBBlocks.POTTED_CLOSED_PINK_EYEBLOSSOM.getDefaultState();
        } else {
            return state.isOf(FBBlocks.POTTED_CLOSED_PINK_EYEBLOSSOM) ? FBBlocks.POTTED_OPEN_PINK_EYEBLOSSOM.getDefaultState() : state;
        }
    }
}