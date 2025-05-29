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

public class BlueEyeblossomFlowerPotBlock extends FlowerPotBlock {

    public BlueEyeblossomFlowerPotBlock(Block content, Settings settings) {
        super(content, settings);
    }

    @Override
    protected boolean hasRandomTicks(BlockState state) {
        return true;
    }

    @Override
    protected void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (world.getDimension().natural()) {
            boolean bl = this.getContent() == FBBlocks.OPEN_BLUE_EYEBLOSSOM;
            boolean bl2 = CreakingHeartBlock.isNightAndNatural(world);
            if (bl != bl2) {
                world.setBlockState(pos, this.getToggledState(state), 3);
                BlueEyeblossomBlock.BlueEyeblossomState blueEyeblossomState = BlueEyeblossomBlock.BlueEyeblossomState.of(bl).getOpposite();
                blueEyeblossomState.spawnTrailParticle(world, pos, random);
                world.playSound(null, pos, blueEyeblossomState.getLongSound(), SoundCategory.BLOCKS, 1.0F, 1.0F);
            }
        }
    }

    @Override
    public BlockState getToggledState(BlockState state) {
        if (state.isOf(FBBlocks.POTTED_OPEN_BLUE_EYEBLOSSOM)) {
            return FBBlocks.POTTED_CLOSED_BLUE_EYEBLOSSOM.getDefaultState();
        } else {
            return state.isOf(FBBlocks.POTTED_CLOSED_BLUE_EYEBLOSSOM) ? FBBlocks.POTTED_OPEN_BLUE_EYEBLOSSOM.getDefaultState() : state;
        }
    }
}