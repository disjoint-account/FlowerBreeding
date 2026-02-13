package net.flowerbreeding.eyeblossoms;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.flowerbreeding.FBBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowerBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.passive.BeeEntity;
import net.minecraft.particle.TrailParticleEffect;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.Difficulty;
import net.minecraft.world.World;
import net.minecraft.world.attribute.EnvironmentAttributes;
import net.minecraft.world.event.GameEvent;

public class WhiteEyeblossomBlock extends FlowerBlock {
    public static final MapCodec<WhiteEyeblossomBlock> CODEC = RecordCodecBuilder.mapCodec((instance) -> instance.group(Codec.BOOL.fieldOf("open").forGetter((block) -> block.state.open), createSettingsCodec()).apply(instance, WhiteEyeblossomBlock::new));
    private static final int NOTIFY_RANGE_XZ = 3;
    private static final int NOTIFY_RANGE_Y = 2;
    private final WhiteEyeblossomBlock.WhiteEyeblossomState state;

    public WhiteEyeblossomBlock(Settings settings, WhiteEyeblossomState state) {
        super(state.stewEffect, state.effectLengthInSeconds, settings);
        this.state = state;
    }

    public MapCodec<? extends WhiteEyeblossomBlock> getCodec() {
        return CODEC;
    }

    public WhiteEyeblossomBlock(boolean open, Settings settings) {
        super(WhiteEyeblossomBlock.WhiteEyeblossomState.of(open).stewEffect, WhiteEyeblossomBlock.WhiteEyeblossomState.of(open).effectLengthInSeconds, settings);
        this.state = WhiteEyeblossomBlock.WhiteEyeblossomState.of(open);
    }

    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        if (this.state.isOpen() && random.nextInt(700) == 0) {
            BlockState blockState = world.getBlockState(pos.down());
            if (blockState.isOf(Blocks.PALE_MOSS_BLOCK)) {
                world.playSoundClient(pos.getX(), pos.getY(), pos.getZ(), SoundEvents.BLOCK_EYEBLOSSOM_IDLE, SoundCategory.AMBIENT, 1.0F, 1.0F, false);
            }
        }

    }

    protected void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (this.updateStateAndNotifyOthers(state, world, pos, random)) {
            world.playSound(null, pos, this.state.getOpposite().longSound, SoundCategory.BLOCKS, 1.0F, 1.0F);
        }

        super.randomTick(state, world, pos, random);
    }

    protected void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (this.updateStateAndNotifyOthers(state, world, pos, random)) {
            world.playSound(null, pos, this.state.getOpposite().sound, SoundCategory.BLOCKS, 1.0F, 1.0F);
        }

        super.scheduledTick(state, world, pos, random);
    }

    private boolean updateStateAndNotifyOthers(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        boolean bl = world.getEnvironmentAttributes().getAttributeValue(EnvironmentAttributes.EYEBLOSSOM_OPEN_GAMEPLAY, pos).asBoolean(this.state.open);
        if (bl == this.state.open) {
            return false;
        } else {
            WhiteEyeblossomBlock.WhiteEyeblossomState whiteEyeblossomState = this.state.getOpposite();
            world.setBlockState(pos, whiteEyeblossomState.getBlockState(), 3);
            world.emitGameEvent(GameEvent.BLOCK_CHANGE, pos, GameEvent.Emitter.of(state));
            whiteEyeblossomState.spawnTrailParticle(world, pos, random);
            BlockPos.iterate(pos.add(-3, -2, -3), pos.add(3, 2, 3)).forEach((otherPos) -> {
                BlockState blockState2 = world.getBlockState(otherPos);
                if (blockState2 == state) {
                    double d = Math.sqrt(pos.getSquaredDistance(otherPos));
                    int i = random.nextBetween((int)(d * (double)5.0F), (int)(d * (double)10.0F));
                    world.scheduleBlockTick(otherPos, state.getBlock(), i);
                }

            });
            return true;
        }
    }

    protected void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        if (!world.isClient() && world.getDifficulty() != Difficulty.PEACEFUL && entity instanceof BeeEntity beeEntity) {
            if (BeeEntity.isAttractive(state) && !beeEntity.hasStatusEffect(StatusEffects.POISON)) {
                beeEntity.addStatusEffect(this.getContactEffect());
            }
        }

    }

    public StatusEffectInstance getContactEffect() {
        return new StatusEffectInstance(StatusEffects.POISON, 25);
    }

    public enum WhiteEyeblossomState {
        OPEN(true, StatusEffects.BLINDNESS, 11.0F, SoundEvents.BLOCK_EYEBLOSSOM_OPEN_LONG, SoundEvents.BLOCK_EYEBLOSSOM_OPEN, 11128012),
        CLOSED(false, StatusEffects.NAUSEA, 7.0F, SoundEvents.BLOCK_EYEBLOSSOM_CLOSE_LONG, SoundEvents.BLOCK_EYEBLOSSOM_CLOSE, 6250335);

        final boolean open;
        final RegistryEntry<StatusEffect> stewEffect;
        final float effectLengthInSeconds;
        final SoundEvent longSound;
        final SoundEvent sound;
        private final int particleColor;

        WhiteEyeblossomState(final boolean open, final RegistryEntry<StatusEffect> stewEffect, final float effectLengthInSeconds, final SoundEvent longSound, final SoundEvent sound, final int particleColor) {
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
            return this.getBlock().getDefaultState();
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

        public void spawnTrailParticle(ServerWorld world, BlockPos pos, Random random) {
            Vec3d vec3d = pos.toCenterPos();
            double d = (double)0.5F + random.nextDouble();
            Vec3d vec3d2 = new Vec3d(random.nextDouble() - (double)0.5F, random.nextDouble() + (double)1.0F, random.nextDouble() - (double)0.5F);
            Vec3d vec3d3 = vec3d.add(vec3d2.multiply(d));
            TrailParticleEffect trailParticleEffect = new TrailParticleEffect(vec3d3, this.particleColor, (int)((double)20.0F * d));
            world.spawnParticles(trailParticleEffect, vec3d.x, vec3d.y, vec3d.z, 1, 0.0F, 0.0F, 0.0F, 0.0F);
        }

        public SoundEvent getLongSound() {
            return this.longSound;
        }
    }
}