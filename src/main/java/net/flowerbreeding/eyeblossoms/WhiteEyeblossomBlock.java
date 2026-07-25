package net.flowerbreeding.eyeblossoms;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.flowerbreeding.FBBlocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.animal.bee.Bee;
import net.minecraft.core.particles.TrailParticleOption;
import net.minecraft.core.Holder;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundSource;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.Vec3;
import net.minecraft.util.RandomSource;
import net.minecraft.world.Difficulty;
import net.minecraft.world.level.Level;
import net.minecraft.world.attribute.EnvironmentAttributes;
import net.minecraft.world.level.gameevent.GameEvent;
import org.jspecify.annotations.NullMarked;

@NullMarked
public class WhiteEyeblossomBlock extends FlowerBlock {
    public static final MapCodec<WhiteEyeblossomBlock> CODEC = RecordCodecBuilder.mapCodec((instance) -> instance.group(Codec.BOOL.fieldOf("open").forGetter((block) -> block.state.open), propertiesCodec()).apply(instance, WhiteEyeblossomBlock::new));
    private static final int NOTIFY_RANGE_XZ = 3;
    private static final int NOTIFY_RANGE_Y = 2;
    private final WhiteEyeblossomBlock.WhiteEyeblossomState state;

    public WhiteEyeblossomBlock(Properties settings, WhiteEyeblossomState state) {
        super(state.stewEffect, state.effectLengthInSeconds, settings);
        this.state = state;
    }

    public MapCodec<? extends WhiteEyeblossomBlock> codec() {
        return CODEC;
    }

    public WhiteEyeblossomBlock(boolean open, Properties settings) {
        super(WhiteEyeblossomBlock.WhiteEyeblossomState.of(open).stewEffect, WhiteEyeblossomBlock.WhiteEyeblossomState.of(open).effectLengthInSeconds, settings);
        this.state = WhiteEyeblossomBlock.WhiteEyeblossomState.of(open);
    }

    public void animateTick(BlockState state, Level world, BlockPos pos, RandomSource random) {
        if (this.state.isOpen() && random.nextInt(700) == 0) {
            BlockState blockState = world.getBlockState(pos.below());
            if (blockState.is(Blocks.PALE_MOSS_BLOCK)) {
                world.playLocalSound(pos.getX(), pos.getY(), pos.getZ(), SoundEvents.EYEBLOSSOM_IDLE, SoundSource.AMBIENT, 1.0F, 1.0F, false);
            }
        }

    }

    protected void randomTick(BlockState state, ServerLevel world, BlockPos pos, RandomSource random) {
        if (this.updateStateAndNotifyOthers(state, world, pos, random)) {
            world.playSound(null, pos, this.state.getOpposite().longSound, SoundSource.BLOCKS, 1.0F, 1.0F);
        }

        super.randomTick(state, world, pos, random);
    }

    protected void tick(BlockState state, ServerLevel world, BlockPos pos, RandomSource random) {
        if (this.updateStateAndNotifyOthers(state, world, pos, random)) {
            world.playSound(null, pos, this.state.getOpposite().sound, SoundSource.BLOCKS, 1.0F, 1.0F);
        }

        super.tick(state, world, pos, random);
    }

    private boolean updateStateAndNotifyOthers(BlockState state, ServerLevel world, BlockPos pos, RandomSource random) {
        boolean bl = world.environmentAttributes().getValue(EnvironmentAttributes.EYEBLOSSOM_OPEN, pos).toBoolean(this.state.open);
        if (bl == this.state.open) {
            return false;
        } else {
            WhiteEyeblossomBlock.WhiteEyeblossomState whiteEyeblossomState = this.state.getOpposite();
            world.setBlock(pos, whiteEyeblossomState.getBlockState(), 3);
            world.gameEvent(GameEvent.BLOCK_CHANGE, pos, GameEvent.Context.of(state));
            whiteEyeblossomState.spawnTrailParticle(world, pos, random);
            BlockPos.betweenClosed(pos.offset(-3, -2, -3), pos.offset(3, 2, 3)).forEach((otherPos) -> {
                BlockState blockState2 = world.getBlockState(otherPos);
                if (blockState2 == state) {
                    double d = Math.sqrt(pos.distSqr(otherPos));
                    int i = random.nextIntBetweenInclusive((int)(d * (double)5.0F), (int)(d * (double)10.0F));
                    world.scheduleTick(otherPos, state.getBlock(), i);
                }

            });
            return true;
        }
    }

    protected void onEntityCollision(BlockState state, Level world, BlockPos pos, Entity entity) {
        if (!world.isClientSide() && world.getDifficulty() != Difficulty.PEACEFUL && entity instanceof Bee beeEntity) {
            if (Bee.attractsBees(state) && !beeEntity.hasEffect(MobEffects.POISON)) {
                beeEntity.addEffect(this.getBeeInteractionEffect());
            }
        }

    }

    public MobEffectInstance getBeeInteractionEffect() {
        return new MobEffectInstance(MobEffects.POISON, 25);
    }

    public enum WhiteEyeblossomState {
        OPEN(true, MobEffects.BLINDNESS, 11.0F, SoundEvents.EYEBLOSSOM_OPEN_LONG, SoundEvents.EYEBLOSSOM_OPEN, 11128012),
        CLOSED(false, MobEffects.NAUSEA, 7.0F, SoundEvents.EYEBLOSSOM_CLOSE_LONG, SoundEvents.EYEBLOSSOM_CLOSE, 6250335);

        final boolean open;
        final Holder<MobEffect> stewEffect;
        final float effectLengthInSeconds;
        final SoundEvent longSound;
        final SoundEvent sound;
        private final int particleColor;

        WhiteEyeblossomState(final boolean open, final Holder<MobEffect> stewEffect, final float effectLengthInSeconds, final SoundEvent longSound, final SoundEvent sound, final int particleColor) {
            this.open = open;
            this.stewEffect = stewEffect;
            this.effectLengthInSeconds = effectLengthInSeconds;
            this.longSound = longSound;
            this.sound = sound;
            this.particleColor = particleColor;
        }

        public Block getBlock() {
            return this.open ? FBBlocks.OPEN_WHITE_EYEBLOSSOM : FBBlocks.CLOSED_WHITE_EYEBLOSSOM;
        }

        public BlockState getBlockState() {
            return this.getBlock().defaultBlockState();
        }

        public WhiteEyeblossomBlock.WhiteEyeblossomState getOpposite() {
            return of(!this.open);
        }

        public boolean isOpen() {
            return this.open;
        }

        public static WhiteEyeblossomBlock.WhiteEyeblossomState of(boolean open) {
            return open ? OPEN : CLOSED;
        }

        public void spawnTrailParticle(ServerLevel world, BlockPos pos, RandomSource random) {
            Vec3 vec3d = Vec3.atCenterOf(pos);
            double d = (double)0.5F + random.nextDouble();
            Vec3 vec3d2 = new Vec3(random.nextDouble() - (double)0.5F, random.nextDouble() + (double)1.0F, random.nextDouble() - (double)0.5F);
            Vec3 vec3d3 = vec3d.add(vec3d2.scale(d));
            TrailParticleOption trailParticleEffect = new TrailParticleOption(vec3d3, this.particleColor, (int)((double)20.0F * d));
            world.sendParticles(trailParticleEffect, vec3d.x, vec3d.y, vec3d.z, 1, 0.0F, 0.0F, 0.0F, 0.0F);
        }

        public SoundEvent getLongSound() {
            return this.longSound;
        }
    }
}