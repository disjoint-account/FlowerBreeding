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
public class LightBlueEyeblossomFlowerPotBlock extends FlowerPotBlock {

    public LightBlueEyeblossomFlowerPotBlock(Block content, Properties settings) {
        super(content, settings);
    }

    @Override
    protected boolean isRandomlyTicking(BlockState state) {
        return true;
    }

    @Override
    protected void randomTick(BlockState state, ServerLevel world, BlockPos pos, RandomSource random) {
        boolean bl = this.getPotted() == FBBlocks.OPEN_LIGHT_BLUE_EYEBLOSSOM;
        boolean bl2 = world.environmentAttributes().getValue(EnvironmentAttributes.EYEBLOSSOM_OPEN, pos).toBoolean(bl);
        if (bl != bl2) {
            world.setBlock(pos, this.opposite(state), 3);
            LightBlueEyeblossomBlock.LightBlueEyeblossomState lightBlueEyeblossomState = LightBlueEyeblossomBlock.LightBlueEyeblossomState.of(bl).getOpposite();
            lightBlueEyeblossomState.spawnTrailParticle(world, pos, random);
            world.playSound(null, pos, lightBlueEyeblossomState.getLongSound(), SoundSource.BLOCKS, 1.0F, 1.0F);
        }
    }

    @Override
    public BlockState opposite(BlockState state) {
        if (state.is(FBBlocks.POTTED_OPEN_LIGHT_BLUE_EYEBLOSSOM)) {
            return FBBlocks.POTTED_CLOSED_LIGHT_BLUE_EYEBLOSSOM.defaultBlockState();
        } else {
            return state.is(FBBlocks.POTTED_CLOSED_LIGHT_BLUE_EYEBLOSSOM) ? FBBlocks.POTTED_OPEN_LIGHT_BLUE_EYEBLOSSOM.defaultBlockState() : state;
        }
    }
}