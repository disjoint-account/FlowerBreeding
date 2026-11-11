package net.flowerbreeding;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.ScheduledTickAccess;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BonemealSource;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jspecify.annotations.NullMarked;

@NullMarked
public class SageBlock extends Block implements BonemealableBlock {
    private final ResourceKey<PlacedFeature> feature;
    public static final VoxelShape SHAPE = Block.box(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

    public SageBlock(ResourceKey<PlacedFeature> feature, Properties settings) {
        super(settings);
        this.feature = feature;
    }

    protected VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }

    protected boolean propagatesSkylightDown(BlockState state) {
        return true;
    }

    protected boolean canSurvive(BlockState state, LevelReader world, BlockPos pos) {
        BlockPos pos1 = pos.relative(Direction.DOWN);
        BlockState state1 = world.getBlockState(pos1);
        return state1.is(BlockTags.SUBSTRATE_OVERWORLD);
    }

    protected BlockState updateShape(BlockState state, LevelReader world, ScheduledTickAccess tickView, BlockPos pos, Direction direction, BlockPos neighborPos, BlockState neighborState, RandomSource random) {
        if (!canSurvive(state, world, pos)) {
            tickView.scheduleTick(pos, this, 1);
        }
        return super.updateShape(state, world, tickView, pos, direction, neighborPos, neighborState, random);
    }

    protected void tick(BlockState state, ServerLevel world, BlockPos pos, RandomSource random) {
        if (!canSurvive(state, world, pos)) {
            world.destroyBlock(pos, true);
        }
    }

    @Override
    public boolean isValidBonemealTarget(LevelReader world, BlockPos pos, BlockState state, BonemealSource source) {
        return true;
    }

    @Override
    public boolean isBonemealSuccess(Level world, RandomSource random, BlockPos pos, BlockState state, BonemealSource source) {
        return isValidBonemealTarget(world, pos, state, source);
    }

    @Override
    public void performBonemeal(ServerLevel world, RandomSource random, BlockPos pos, BlockState state, BonemealSource source) {
        world.registryAccess()
                .lookup(Registries.PLACED_FEATURE)
                .flatMap(registry -> registry.get(this.feature))
                .ifPresent(entry -> entry.value().place(world, world.getChunkSource().getGenerator(), random, pos.above()));
    }

    @Override
    public BonemealableBlock.Type getType() {
        return Type.NEIGHBOR_SPREADER;
    }
}

