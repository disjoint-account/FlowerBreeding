package net.flowerbreeding.eyeblossoms;

import net.flowerbreeding.FBBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.attribute.EnvironmentAttributes;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.jspecify.annotations.NullMarked;

@NullMarked
public class PinkEyeblossomFlowerPotBlock extends FlowerPotBlock {

    public PinkEyeblossomFlowerPotBlock(Block content, Properties settings) {
        super(content, settings);
    }

    @Override
    protected boolean isRandomlyTicking(BlockState state) {
        return true;
    }

    @Override
    protected void randomTick(BlockState state, ServerLevel world, BlockPos pos, RandomSource random) {
        boolean bl = this.getPotted() == FBBlocks.OPEN_PINK_EYEBLOSSOM;
        boolean bl2 = world.environmentAttributes().getValue(EnvironmentAttributes.EYEBLOSSOM_OPEN, pos).toBoolean(bl);
        if (bl != bl2) {
            world.setBlock(pos, this.opposite(state), 3);
            PinkEyeblossomBlock.PinkEyeblossomState pinkEyeblossomState = PinkEyeblossomBlock.PinkEyeblossomState.of(bl).getOpposite();
            pinkEyeblossomState.spawnTrailParticle(world, pos, random);
            world.playSound(null, pos, pinkEyeblossomState.getLongSound(), SoundSource.BLOCKS, 1.0F, 1.0F);
        }
    }

    @Override
    public BlockState opposite(BlockState state) {
        if (state.is(FBBlocks.POTTED_OPEN_PINK_EYEBLOSSOM)) {
            return FBBlocks.POTTED_CLOSED_PINK_EYEBLOSSOM.defaultBlockState();
        } else {
            return state.is(FBBlocks.POTTED_CLOSED_PINK_EYEBLOSSOM) ? FBBlocks.POTTED_OPEN_PINK_EYEBLOSSOM.defaultBlockState() : state;
        }
    }
}