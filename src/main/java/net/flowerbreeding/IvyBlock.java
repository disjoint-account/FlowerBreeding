package net.flowerbreeding;

import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import net.flowerbreeding.util.FBProperties;
import net.flowerbreeding.util.properties.IvyConfiguration;
import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Property;
import net.minecraft.util.*;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import net.minecraft.world.tick.ScheduledTickView;
import org.jetbrains.annotations.Nullable;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import static net.flowerbreeding.util.properties.IvyConfiguration.*;
import static net.minecraft.util.math.Direction.DOWN;
import static net.minecraft.util.math.Direction.UP;

public class IvyBlock extends Block implements Fertilizable {
    public static final BooleanProperty IVY_TIP_NORTH;
    public static final BooleanProperty IVY_TIP_EAST;
    public static final BooleanProperty IVY_TIP_SOUTH;
    public static final BooleanProperty IVY_TIP_WEST;
    public static final BooleanProperty IVY_FERTILE;
    public static final EnumProperty<IvyConfiguration> IVY_CONFIGURATION;
    public static final MapCodec<IvyBlock> CODEC = createCodec(IvyBlock::new);
    public static final BooleanProperty NORTH;
    public static final BooleanProperty EAST;
    public static final BooleanProperty SOUTH;
    public static final BooleanProperty WEST;
    public static final Map<Direction, BooleanProperty> FACING_PROPERTIES;
    private static final VoxelShape EAST_SHAPE;
    private static final VoxelShape WEST_SHAPE;
    private static final VoxelShape SOUTH_SHAPE;
    private static final VoxelShape NORTH_SHAPE;
    private static final VoxelShape NORTH_EAST_SHAPE;
    private static final VoxelShape EAST_SOUTH_SHAPE;
    private static final VoxelShape SOUTH_WEST_SHAPE;
    private static final VoxelShape WEST_NORTH_SHAPE;
    private static final VoxelShape NORTH_EAST_SOUTH_SHAPE;
    private static final VoxelShape EAST_SOUTH_WEST_SHAPE;
    private static final VoxelShape SOUTH_WEST_NORTH_SHAPE;
    private static final VoxelShape WEST_NORTH_EAST_SHAPE;
    private static final VoxelShape ALL_SHAPE;
    private final Map<BlockState, VoxelShape> shapesByState;

    public MapCodec<IvyBlock> getCodec() {
        return CODEC;
    }

    public IvyBlock(AbstractBlock.Settings settings) {
        super(settings);
        this.setDefaultState(((BlockState)((BlockState)((BlockState)((BlockState)((BlockState)((BlockState)((BlockState)((BlockState)((BlockState)((BlockState)((BlockState)this.stateManager.getDefaultState()).with(NORTH, false)).with(EAST, false)).with(SOUTH, false)).with(WEST, false)).with(IVY_TIP_NORTH, true)).with(IVY_TIP_EAST, true)).with(IVY_TIP_SOUTH, true)).with(IVY_TIP_WEST, true)).with(IVY_FERTILE, true)).with(IVY_CONFIGURATION, NORTH_SINGLE)));
        this.shapesByState = ImmutableMap.copyOf((Map)this.stateManager.getStates().stream().collect(Collectors.toMap(Function.identity(), IvyBlock::getShapeForState)));
    }

    private static VoxelShape getShapeForState(BlockState state) {
        VoxelShape voxelShape = VoxelShapes.empty();
        IvyConfiguration ivyConfig = state.get(IVY_CONFIGURATION);
        if (ivyConfig == NORTH_SINGLE) {
            voxelShape = VoxelShapes.union(voxelShape, SOUTH_SHAPE);
        }
        if (ivyConfig == NORTH_EAST) {
            voxelShape = VoxelShapes.union(voxelShape, SOUTH_WEST_SHAPE);
        }
        if (ivyConfig == WEST_NORTH_EAST) {
            voxelShape = VoxelShapes.union(voxelShape, EAST_SOUTH_WEST_SHAPE);
        }
        if (ivyConfig == EAST_SINGLE) {
            voxelShape = VoxelShapes.union(voxelShape, WEST_SHAPE);
        }
        if (ivyConfig == EAST_SOUTH) {
            voxelShape = VoxelShapes.union(voxelShape, WEST_NORTH_SHAPE);
        }
        if (ivyConfig == NORTH_EAST_SOUTH) {
            voxelShape = VoxelShapes.union(voxelShape, SOUTH_WEST_NORTH_SHAPE);
        }
        if (ivyConfig == SOUTH_SINGLE) {
            voxelShape = VoxelShapes.union(voxelShape, NORTH_SHAPE);
        }
        if (ivyConfig == SOUTH_WEST) {
            voxelShape = VoxelShapes.union(voxelShape, NORTH_EAST_SHAPE);
        }
        if (ivyConfig == EAST_SOUTH_WEST) {
            voxelShape = VoxelShapes.union(voxelShape, WEST_NORTH_EAST_SHAPE);
        }
        if (ivyConfig == WEST_SINGLE) {
            voxelShape = VoxelShapes.union(voxelShape, EAST_SHAPE);
        }
        if (ivyConfig == WEST_NORTH) {
            voxelShape = VoxelShapes.union(voxelShape, EAST_SOUTH_SHAPE);
        }
        if (ivyConfig == SOUTH_WEST_NORTH) {
            voxelShape = VoxelShapes.union(voxelShape, NORTH_EAST_SOUTH_SHAPE);
        }
        if (ivyConfig == ALL) {
            voxelShape = VoxelShapes.union(voxelShape, ALL_SHAPE);
        }
        return voxelShape.isEmpty() ? VoxelShapes.fullCube() : voxelShape;
    }

    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return (VoxelShape)this.shapesByState.get(state);
    }

    protected boolean isTransparent(BlockState state) {
        return true;
    }

    public static Direction getDirection (BlockState state) {
        if ((Boolean) state.get(NORTH)) {
            return Direction.NORTH;
        }
        else if ((Boolean) state.get(SOUTH)) {
            return Direction.SOUTH;
        }
        else if ((Boolean) state.get(EAST)) {
            return Direction.EAST;
        }
        else return Direction.WEST;
    }

    protected static boolean faceCheck(Direction direction, WorldView world, BlockPos pos) {
        BlockState state = world.getBlockState(pos.offset(direction));
        return (Block.isFaceFullSquare(state.getCollisionShape(world, pos.offset(direction)), direction.getOpposite()));
    }

    protected static boolean neighbourCheck(WorldView world, BlockPos pos) {
        BlockPos base = pos.offset(DOWN);
        BlockState baseBlock = world.getBlockState(base);
        if (baseBlock.isOf(FBBlocks.CLIMBING_IVY)) {
            IvyConfiguration ivyConfig = baseBlock.get(IVY_CONFIGURATION);
            boolean hasNorth = ivyConfig.hasNorth();
            boolean hasEast = ivyConfig.hasEast();
            boolean hasSouth = ivyConfig.hasSouth();
            boolean hasWest = ivyConfig.hasWest();
            return (((faceCheck(Direction.NORTH, world, pos)) && (hasNorth)) ||
                    ((faceCheck(Direction.EAST, world, pos)) && (hasEast)) ||
                    ((faceCheck(Direction.SOUTH, world, pos)) && (hasSouth)) ||
                    ((faceCheck(Direction.WEST, world, pos)) && (hasWest)));
        }
        else return ((faceCheck(Direction.NORTH, world, pos)) ||
                (faceCheck(Direction.EAST, world, pos)) ||
                (faceCheck(Direction.SOUTH, world, pos)) ||
                (faceCheck(Direction.WEST, world, pos)));
    }

    protected boolean ivyBlockPlaceable(WorldView world, BlockPos pos) {
        boolean validNeighbour = neighbourCheck(world, pos);
        BlockPos pos1 = pos.offset(DOWN);
        BlockState state1 = world.getBlockState(pos1);
        return (((state1.isIn(BlockTags.DIRT)) || (state1.isOf(FBBlocks.CLIMBING_IVY))) && (validNeighbour));
    }

    protected boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
            return ivyBlockPlaceable(world, pos);
    }

    private BlockState getPlacementShape(BlockState state, WorldView world, BlockPos pos) {
        BlockPos blockPos = pos.up();
        BlockState blockState = null;
        for (Direction direction : Direction.Type.HORIZONTAL) {
            BooleanProperty booleanProperty = getFacingProperty(direction);
            if ((Boolean)state.get(booleanProperty)) {
                boolean bl = this.canPlaceAt(state, world, pos);
                if (!bl) {
                    if (blockState == null) {
                        blockState = world.getBlockState(blockPos);
                    }
                    bl = blockState.isOf(this) && (Boolean)blockState.get(booleanProperty);
                }
                state = (BlockState)state.with(booleanProperty, bl);
            }
        }
        return state;
    }

    protected BlockState getStateForNeighborUpdate(BlockState state, WorldView world, ScheduledTickView tickView, BlockPos pos, Direction direction, BlockPos neighborPos, BlockState neighborState, Random random) {
        boolean tipNorth = state.get(IVY_TIP_NORTH);
        boolean tipEast = state.get(IVY_TIP_EAST);
        boolean tipSouth = state.get(IVY_TIP_SOUTH);
        boolean tipWest = state.get(IVY_TIP_WEST);
        int i = countIvyAbove(world, pos);
        BlockPos pos1 = pos.offset(Direction.UP, i);
        BlockPos pos2 = pos.offset(Direction.DOWN);
        BlockPos pos3 = pos.offset(Direction.UP);
        BlockState state1 = world.getBlockState(pos1);
        BlockState state2 = world.getBlockState(pos2);
        BlockState state3 = world.getBlockState(pos3);
        boolean bl1 = state.get(IVY_FERTILE);
        boolean bl2 = state1.get(IVY_FERTILE);
        IvyConfiguration ivyConfig = state.get(IVY_CONFIGURATION);
        if (bl1 != bl2) {
            tickView.scheduleBlockTick(pos, this, 1);
        }
        if (!state.canPlaceAt(world, pos)) {
            tickView.scheduleBlockTick(pos, this, 1);
        }
        if (!state3.isOf(FBBlocks.CLIMBING_IVY) ||
                ((state3.get(IVY_CONFIGURATION).hasNorth() == tipNorth) ||
                        (state3.get(IVY_CONFIGURATION).hasEast() == tipEast) ||
                        (state3.get(IVY_CONFIGURATION).hasSouth() == tipSouth) ||
                        (state3.get(IVY_CONFIGURATION).hasWest() == tipWest))) {
            tickView.scheduleBlockTick(pos, this, 1);
        }
        if ((ivyConfig.hasNorth() && !faceCheck(Direction.NORTH, world, pos)) ||
                (ivyConfig.hasEast() && !faceCheck(Direction.EAST, world, pos)) ||
                (ivyConfig.hasSouth() && !faceCheck(Direction.SOUTH, world, pos)) ||
                (ivyConfig.hasWest() && !faceCheck(Direction.WEST, world, pos))) {
            tickView.scheduleBlockTick(pos, this, 1);
        }
        if (state2.isOf(FBBlocks.CLIMBING_IVY)) {
            IvyConfiguration ivyConfig1 = state2.get(IVY_CONFIGURATION);
            if ((ivyConfig.hasNorth() && !ivyConfig1.hasNorth()) ||
                    (ivyConfig.hasEast() && !ivyConfig1.hasEast()) ||
                    (ivyConfig.hasSouth() && !ivyConfig1.hasSouth()) ||
                    (ivyConfig.hasWest() && !ivyConfig1.hasWest())) {
                tickView.scheduleBlockTick(pos, this, 1);
            }
        }
        return super.getStateForNeighborUpdate(state, world, tickView, pos, direction, neighborPos, neighborState, random);
    }

    protected boolean hasRandomTicks(BlockState state) {
        return true;
    }

    protected void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        boolean tipNorth = state.get(IVY_TIP_NORTH);
        boolean tipEast = state.get(IVY_TIP_EAST);
        boolean tipSouth = state.get(IVY_TIP_SOUTH);
        boolean tipWest = state.get(IVY_TIP_WEST);
        int i = countIvyAbove(world, pos);
        BlockPos pos1 = pos.offset(Direction.UP, i);
        BlockPos pos2 = pos.offset(Direction.DOWN);
        BlockPos pos3 = pos.offset(Direction.UP);
        BlockState state1 = world.getBlockState(pos1);
        BlockState state2 = world.getBlockState(pos2);
        BlockState state3 = world.getBlockState(pos3);
        boolean bl1 = state.get(IVY_FERTILE);
        boolean bl2 = state1.get(IVY_FERTILE);
        IvyConfiguration ivyConfig = state.get(IVY_CONFIGURATION);
        if (!state.canPlaceAt(world, pos)) {
            world.breakBlock(pos, true);
        }
        else {
            if (!state3.isOf(FBBlocks.CLIMBING_IVY) ||
                    ((state3.get(IVY_CONFIGURATION).hasNorth() == tipNorth) ||
                            (state3.get(IVY_CONFIGURATION).hasEast() == tipEast) ||
                            (state3.get(IVY_CONFIGURATION).hasSouth() == tipSouth) ||
                            (state3.get(IVY_CONFIGURATION).hasWest() == tipWest))) {
                getType(state, world, pos);
            }
            if (bl1 != bl2) {
                getFertility(state, world, pos);
            }
            if ((ivyConfig.hasNorth() && !faceCheck(Direction.NORTH, world, pos)) ||
                    (ivyConfig.hasEast() && !faceCheck(Direction.EAST, world, pos)) ||
                    (ivyConfig.hasSouth() && !faceCheck(Direction.SOUTH, world, pos)) ||
                    (ivyConfig.hasWest() && !faceCheck(Direction.WEST, world, pos))) {
                if (!faceCheck(Direction.NORTH, world, pos) &&
                        !faceCheck(Direction.EAST, world, pos) &&
                        !faceCheck(Direction.SOUTH, world, pos) &&
                        !faceCheck(Direction.WEST, world, pos)) {
                    world.breakBlock(pos, true);
                } else {
                    world.setBlockState(pos, getNewFromConfig(state, world, pos));
                    world.playSound((PlayerEntity) null, pos, SoundEvents.BLOCK_VINE_BREAK, SoundCategory.BLOCKS, 1.0F, 1.0F);
                }
            }
            if (state2.isOf(FBBlocks.CLIMBING_IVY)) {
                IvyConfiguration ivyConfig1 = state2.get(IVY_CONFIGURATION);
                if ((ivyConfig.hasNorth() && !ivyConfig1.hasNorth()) ||
                        (ivyConfig.hasEast() && !ivyConfig1.hasEast()) ||
                        (ivyConfig.hasSouth() && !ivyConfig1.hasSouth()) ||
                        (ivyConfig.hasWest() && !ivyConfig1.hasWest())) {
                    world.setBlockState(pos, getNewFromConfig(state2, world, pos));
                    world.playSound((PlayerEntity) null, pos, SoundEvents.BLOCK_VINE_BREAK, SoundCategory.BLOCKS, 1.0F, 1.0F);
                }
            }
        }
    }

    protected void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (random.nextDouble() < 0.1) {
            BlockPos blockPos = pos.offset(Direction.UP);
            if (isValid(world.getBlockState(blockPos))) {
                    if ((ivyBlockPlaceable(world, blockPos)) && (state.get(IVY_FERTILE))) {
                        world.setBlockState(blockPos, getNewFromConfig(state, world, blockPos));
                }
            }
        }
    }

    @Nullable
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        World world = ctx.getWorld();
        BlockPos pos = ctx.getBlockPos();
        BlockState blockState = world.getBlockState(pos);
        boolean bl = blockState.isOf(this);
        BlockState blockState1 = bl ? blockState : this.getDefaultState();
        BlockPos belowPos = pos.offset(DOWN);
        BlockState belowState = world.getBlockState(belowPos);
        for (Direction direction : ctx.getPlacementDirections()) {
            if ((direction == DOWN) || (direction == Direction.UP) || !faceCheck(direction, world, pos)) {
                return null;
            } else {
                if (belowState.isOf(FBBlocks.CLIMBING_IVY)) {
                        return getNewFromConfig(belowState, world, pos);
                }
                    BooleanProperty booleanProperty = getFacingProperty(direction);
                    boolean bl3 = bl && (Boolean) blockState.get(booleanProperty);
                    if (!bl3 && this.canPlaceAt(blockState, ctx.getWorld(), ctx.getBlockPos())) {
                        if (booleanProperty == NORTH) {
                            return (BlockState) blockState1.with(booleanProperty, true).with(IVY_CONFIGURATION, NORTH_SINGLE);
                        }
                        if (booleanProperty == EAST) {
                            return (BlockState) blockState1.with(booleanProperty, true).with(IVY_CONFIGURATION, EAST_SINGLE);
                        }
                        if (booleanProperty == SOUTH) {
                            return (BlockState) blockState1.with(booleanProperty, true).with(IVY_CONFIGURATION, SOUTH_SINGLE);
                        }
                        if (booleanProperty == WEST) {
                            return (BlockState) blockState1.with(booleanProperty, true).with(IVY_CONFIGURATION, WEST_SINGLE);
                        }
                    }
            }
        }
        return null;
    }

    public void getType(BlockState state, ServerWorld world, BlockPos pos) {
        BlockState aboveState = world.getBlockState(pos.offset(UP));
            if (aboveState.isOf(FBBlocks.CLIMBING_IVY)) {
                IvyConfiguration aboveConfig = aboveState.get(IVY_CONFIGURATION);
                boolean aboveNorth = aboveConfig.hasNorth();
                boolean aboveEast = aboveConfig.hasEast();
                boolean aboveSouth = aboveConfig.hasSouth();
                boolean aboveWest = aboveConfig.hasWest();

                world.setBlockState(pos, state.with(IVY_TIP_NORTH, !aboveNorth).with(IVY_TIP_EAST, !aboveEast).with(IVY_TIP_SOUTH, !aboveSouth).with(IVY_TIP_WEST, !aboveWest));
            }
            else {
                world.setBlockState(pos, state.with(IVY_TIP_NORTH, true).with(IVY_TIP_EAST, true).with(IVY_TIP_SOUTH, true).with(IVY_TIP_WEST, true));
            }
    }

    public void getFertility(BlockState state, ServerWorld world, BlockPos pos) {
        int i = countIvyAbove(world, pos);
        BlockPos pos1 = pos.offset(Direction.UP, i);
        BlockState state1 = world.getBlockState(pos1);
        boolean bl = state1.get(IVY_FERTILE);
        if ((i != 0) && state.get(IVY_FERTILE) != bl) {
            world.setBlockState(pos, state.with(IVY_FERTILE, bl));
        }
    }

    protected int countIvyAbove(BlockView world, BlockPos pos) {
        int i;
        for (i = 0; i < 383 && world.getBlockState(pos.up(i + 1)).isOf(FBBlocks.CLIMBING_IVY); ++i) {
        }
        return i;
    }

    protected ActionResult onUseWithItem(ItemStack stack, BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        ItemStack itemStack = player.getStackInHand(hand);
        if ((itemStack.isOf(Items.SHEARS)) && (countIvyAbove(world, pos) == 0)) {
            world.setBlockState(pos, state.with(IVY_FERTILE, false));
            world.playSound(null, pos, SoundEvents.BLOCK_PUMPKIN_CARVE, SoundCategory.BLOCKS, 1.0F, 1.0F);
            return ActionResult.SUCCESS;
        }
        if ((itemStack.isOf(Items.HONEY_BOTTLE)) && (countIvyAbove(world, pos) == 0)) {
            int qty = itemStack.getCount();
            world.setBlockState(pos, state.with(IVY_FERTILE, true));
            if ((qty > 1) && (!player.isInCreativeMode())) {
                itemStack.decrement(1);
                player.getInventory().offerOrDrop(new ItemStack(Items.GLASS_BOTTLE));
            }
            if ((qty == 1) && (!player.isInCreativeMode())) {
                player.setStackInHand(hand, new ItemStack(Items.GLASS_BOTTLE));
            }
            world.playSound(null, pos, SoundEvents.BLOCK_BEEHIVE_DRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
            return ActionResult.SUCCESS;
        }
        if ((itemStack.isOf(FBBlocks.CLIMBING_IVY.asItem()))) {
            IvyConfiguration ivyConfig = state.get(IVY_CONFIGURATION);
            BlockPos belowPos = pos.offset(DOWN);
            BlockState belowState = world.getBlockState(belowPos);
            boolean northFace = faceCheck(Direction.NORTH, world, pos);
            boolean eastFace = faceCheck(Direction.EAST, world, pos);
            boolean southFace = faceCheck(Direction.SOUTH, world, pos);
            boolean westFace = faceCheck(Direction.WEST, world, pos);
            boolean northBase = ((belowState.isOf(FBBlocks.CLIMBING_IVY) && belowState.get(IVY_CONFIGURATION).hasNorth()) || !belowState.isOf(FBBlocks.CLIMBING_IVY));
            boolean eastBase = ((belowState.isOf(FBBlocks.CLIMBING_IVY) && belowState.get(IVY_CONFIGURATION).hasEast()) || !belowState.isOf(FBBlocks.CLIMBING_IVY));
            boolean southBase = ((belowState.isOf(FBBlocks.CLIMBING_IVY) && belowState.get(IVY_CONFIGURATION).hasSouth()) || !belowState.isOf(FBBlocks.CLIMBING_IVY));
            boolean westBase = ((belowState.isOf(FBBlocks.CLIMBING_IVY) && belowState.get(IVY_CONFIGURATION).hasWest()) || !belowState.isOf(FBBlocks.CLIMBING_IVY));
            boolean northAvailable = (northFace && !ivyConfig.hasNorth() && northBase);
            boolean eastAvailable = (eastFace && !ivyConfig.hasEast() && eastBase);
            boolean southAvailable = (southFace && !ivyConfig.hasSouth() && southBase);
            boolean westAvailable = (westFace && !ivyConfig.hasWest() && westBase);
            if (ivyConfig == NORTH_SINGLE) {
                if (eastAvailable) {
                    world.setBlockState(pos, state.with(IVY_CONFIGURATION, NORTH_EAST));
                    world.playSound((PlayerEntity) null, pos, SoundEvents.BLOCK_VINE_PLACE, SoundCategory.BLOCKS, 1.0F, 1.0F);
                    return ActionResult.SUCCESS;
                }
                else if (westAvailable) {
                    world.setBlockState(pos, state.with(IVY_CONFIGURATION, WEST_NORTH));
                    world.playSound((PlayerEntity) null, pos, SoundEvents.BLOCK_VINE_PLACE, SoundCategory.BLOCKS, 1.0F, 1.0F);
                    return ActionResult.SUCCESS;
                }
            }
            if (ivyConfig == EAST_SINGLE) {
                if (southAvailable) {
                    world.setBlockState(pos, state.with(IVY_CONFIGURATION, EAST_SOUTH));
                    world.playSound((PlayerEntity) null, pos, SoundEvents.BLOCK_VINE_PLACE, SoundCategory.BLOCKS, 1.0F, 1.0F);
                    return ActionResult.SUCCESS;
                }
                else if (northAvailable) {
                    world.setBlockState(pos, state.with(IVY_CONFIGURATION, NORTH_EAST));
                    world.playSound((PlayerEntity) null, pos, SoundEvents.BLOCK_VINE_PLACE, SoundCategory.BLOCKS, 1.0F, 1.0F);
                    return ActionResult.SUCCESS;
                }
            }
            if (ivyConfig == SOUTH_SINGLE) {
                if (westAvailable) {
                    world.setBlockState(pos, state.with(IVY_CONFIGURATION, SOUTH_WEST));
                    world.playSound((PlayerEntity) null, pos, SoundEvents.BLOCK_VINE_PLACE, SoundCategory.BLOCKS, 1.0F, 1.0F);
                    return ActionResult.SUCCESS;
                }
                else if (eastAvailable) {
                    world.setBlockState(pos, state.with(IVY_CONFIGURATION, EAST_SOUTH));
                    world.playSound((PlayerEntity) null, pos, SoundEvents.BLOCK_VINE_PLACE, SoundCategory.BLOCKS, 1.0F, 1.0F);
                    return ActionResult.SUCCESS;
                }
            }
            if (ivyConfig == WEST_SINGLE) {
                if (northAvailable) {
                    world.setBlockState(pos, state.with(IVY_CONFIGURATION, WEST_NORTH));
                    world.playSound((PlayerEntity) null, pos, SoundEvents.BLOCK_VINE_PLACE, SoundCategory.BLOCKS, 1.0F, 1.0F);
                    return ActionResult.SUCCESS;
                }
                else if (southAvailable) {
                    world.setBlockState(pos, state.with(IVY_CONFIGURATION, SOUTH_WEST));
                    world.playSound((PlayerEntity) null, pos, SoundEvents.BLOCK_VINE_PLACE, SoundCategory.BLOCKS, 1.0F, 1.0F);
                    return ActionResult.SUCCESS;
                }
            }
            if (ivyConfig == NORTH_EAST) {
                if (southAvailable) {
                    world.setBlockState(pos, state.with(IVY_CONFIGURATION, NORTH_EAST_SOUTH));
                    world.playSound((PlayerEntity) null, pos, SoundEvents.BLOCK_VINE_PLACE, SoundCategory.BLOCKS, 1.0F, 1.0F);
                    return ActionResult.SUCCESS;
                }
                else if (westAvailable) {
                    world.setBlockState(pos, state.with(IVY_CONFIGURATION, WEST_NORTH_EAST));
                    world.playSound((PlayerEntity) null, pos, SoundEvents.BLOCK_VINE_PLACE, SoundCategory.BLOCKS, 1.0F, 1.0F);
                    return ActionResult.SUCCESS;
                }
            }
            if (ivyConfig == EAST_SOUTH) {
                if (westAvailable) {
                    world.setBlockState(pos, state.with(IVY_CONFIGURATION, EAST_SOUTH_WEST));
                    world.playSound((PlayerEntity) null, pos, SoundEvents.BLOCK_VINE_PLACE, SoundCategory.BLOCKS, 1.0F, 1.0F);
                    return ActionResult.SUCCESS;
                }
                else if (northAvailable) {
                    world.setBlockState(pos, state.with(IVY_CONFIGURATION, NORTH_EAST_SOUTH));
                    world.playSound((PlayerEntity) null, pos, SoundEvents.BLOCK_VINE_PLACE, SoundCategory.BLOCKS, 1.0F, 1.0F);
                    return ActionResult.SUCCESS;
                }
            }
            if (ivyConfig == SOUTH_WEST) {
                if (northAvailable) {
                    world.setBlockState(pos, state.with(IVY_CONFIGURATION, SOUTH_WEST_NORTH));
                    world.playSound((PlayerEntity) null, pos, SoundEvents.BLOCK_VINE_PLACE, SoundCategory.BLOCKS, 1.0F, 1.0F);
                    return ActionResult.SUCCESS;
                }
                else if (eastAvailable) {
                    world.setBlockState(pos, state.with(IVY_CONFIGURATION, EAST_SOUTH_WEST));
                    world.playSound((PlayerEntity) null, pos, SoundEvents.BLOCK_VINE_PLACE, SoundCategory.BLOCKS, 1.0F, 1.0F);
                    return ActionResult.SUCCESS;
                }
            }
            if (ivyConfig == WEST_NORTH) {
                if (eastAvailable) {
                    world.setBlockState(pos, state.with(IVY_CONFIGURATION, WEST_NORTH_EAST));
                    world.playSound((PlayerEntity) null, pos, SoundEvents.BLOCK_VINE_PLACE, SoundCategory.BLOCKS, 1.0F, 1.0F);
                    return ActionResult.SUCCESS;
                }
                else if (southAvailable) {
                    world.setBlockState(pos, state.with(IVY_CONFIGURATION, SOUTH_WEST_NORTH));
                    world.playSound((PlayerEntity) null, pos, SoundEvents.BLOCK_VINE_PLACE, SoundCategory.BLOCKS, 1.0F, 1.0F);
                    return ActionResult.SUCCESS;
                }
            }
            if ((ivyConfig == NORTH_EAST_SOUTH && westAvailable) || (ivyConfig == EAST_SOUTH_WEST && northAvailable) || (ivyConfig == SOUTH_WEST_NORTH && eastAvailable) || (ivyConfig==WEST_NORTH_EAST && southAvailable)) {
                    world.setBlockState(pos, state.with(IVY_CONFIGURATION, ALL));
                    world.playSound((PlayerEntity) null, pos, SoundEvents.BLOCK_VINE_PLACE, SoundCategory.BLOCKS, 1.0F, 1.0F);
                    return ActionResult.SUCCESS;
            }
        }
        return ActionResult.PASS_TO_DEFAULT_BLOCK_ACTION;
    }

    public boolean isFertilizable(WorldView world, BlockPos pos, BlockState state) {
        int i = (countIvyAbove(world, pos) + 1);
            if ((ivyBlockPlaceable(world, pos.offset(Direction.UP, i))) && (state.get(IVY_FERTILE))) {
                return isValid(world.getBlockState(pos.offset(Direction.UP, i)));
        }
        return false;
    }

    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        return state.get(IVY_FERTILE);
    }

    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        int i = (countIvyAbove(world, pos) + 1);
        BlockPos blockPos = pos.offset(Direction.UP, i);
        world.setBlockState(blockPos, getNewFromConfig(state, world, blockPos));
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{NORTH, EAST, SOUTH, WEST, IVY_TIP_NORTH, IVY_TIP_EAST, IVY_TIP_SOUTH, IVY_TIP_WEST, IVY_FERTILE, IVY_CONFIGURATION});
    }

    protected BlockState rotate(BlockState state, BlockRotation rotation) {
        switch (rotation) {
            case CLOCKWISE_180 -> {
                return (BlockState)((BlockState)((BlockState)((BlockState)state.with(NORTH, (Boolean)state.get(SOUTH))).with(EAST, (Boolean)state.get(WEST))).with(SOUTH, (Boolean)state.get(NORTH))).with(WEST, (Boolean)state.get(EAST));
            }
            case COUNTERCLOCKWISE_90 -> {
                return (BlockState)((BlockState)((BlockState)((BlockState)state.with(NORTH, (Boolean)state.get(EAST))).with(EAST, (Boolean)state.get(SOUTH))).with(SOUTH, (Boolean)state.get(WEST))).with(WEST, (Boolean)state.get(NORTH));
            }
            case CLOCKWISE_90 -> {
                return (BlockState)((BlockState)((BlockState)((BlockState)state.with(NORTH, (Boolean)state.get(WEST))).with(EAST, (Boolean)state.get(NORTH))).with(SOUTH, (Boolean)state.get(EAST))).with(WEST, (Boolean)state.get(SOUTH));
            }
            default -> {
                return state;
            }
        }
    }

    protected BlockState mirror(BlockState state, BlockMirror mirror) {
        switch (mirror) {
            case LEFT_RIGHT -> {
                return (BlockState)((BlockState)state.with(NORTH, (Boolean)state.get(SOUTH))).with(SOUTH, (Boolean)state.get(NORTH));
            }
            case FRONT_BACK -> {
                return (BlockState)((BlockState)state.with(EAST, (Boolean)state.get(WEST))).with(WEST, (Boolean)state.get(EAST));
            }
            default -> {
                return super.mirror(state, mirror);
            }
        }
    }

    public static BooleanProperty getFacingProperty(Direction direction) {
        return (BooleanProperty)FACING_PROPERTIES.get(direction);
    }

    private static boolean isValid(BlockState state) {
        return state.isAir();
    }

    public BlockState getNewFromConfig (BlockState state, World world, BlockPos pos) {
        IvyConfiguration baseConfig = state.get(IVY_CONFIGURATION);
        boolean needsNorth = baseConfig.hasNorth();
        boolean needsEast = baseConfig.hasEast();
        boolean needsSouth = baseConfig.hasSouth();
        boolean needsWest = baseConfig.hasWest();
        boolean northFace = faceCheck(Direction.NORTH, world, pos);
        boolean eastFace = faceCheck(Direction.EAST, world, pos);
        boolean southFace = faceCheck(Direction.SOUTH, world, pos);
        boolean westFace = faceCheck(Direction.WEST, world, pos);
        boolean northWorks = !needsNorth || northFace;
        boolean eastWorks = !needsEast || eastFace;
        boolean southWorks = !needsSouth || southFace;
        boolean westWorks = !needsWest || westFace;
        boolean northFlag = needsNorth && northFace;
        boolean eastFlag = needsEast && eastFace;
        boolean southFlag = needsSouth && southFace;
        boolean westFlag = needsWest && westFace;
        if ((northWorks) && (eastWorks) && (southWorks) && (westWorks)) {
            return (state);
        }
        if (northFlag && eastFlag && southFlag) {
            return state.with(IVY_CONFIGURATION, NORTH_EAST_SOUTH);
        }
        if (!northFlag && eastFlag && southFlag && westFlag) {
            return state.with(IVY_CONFIGURATION, EAST_SOUTH_WEST);
        }
        if (northFlag && !eastFlag && southFlag && westFlag) {
            return state.with(IVY_CONFIGURATION, SOUTH_WEST_NORTH);
        }
        if (northFlag && eastFlag && westFlag) {
            return state.with(IVY_CONFIGURATION, WEST_NORTH_EAST);
        }
        if (northFlag && eastFlag) {
            return state.with(IVY_CONFIGURATION, NORTH_EAST);
        }
        if (!northFlag && eastFlag && southFlag) {
            return state.with(IVY_CONFIGURATION, EAST_SOUTH);
        }
        if (!northFlag && !eastFlag && southFlag && westFlag) {
            return state.with(IVY_CONFIGURATION, SOUTH_WEST);
        }
        if (northFlag && !southFlag && westFlag) {
            return state.with(IVY_CONFIGURATION, WEST_NORTH);
        }
        if (northFlag && !southFlag) {
            return state.with(IVY_CONFIGURATION, NORTH_SINGLE);
        }
        if (!northFlag && eastFlag && !westFlag) {
            return state.with(IVY_CONFIGURATION, EAST_SINGLE);
        }
        if (!northFlag && !eastFlag && southFlag) {
            return state.with(IVY_CONFIGURATION, SOUTH_SINGLE);
        }
        if (!northFlag && !eastFlag && westFlag) {
            return state.with(IVY_CONFIGURATION, WEST_SINGLE);
        }
        else return Blocks.AIR.getDefaultState();
    }

    static {
        IVY_TIP_NORTH = FBProperties.IVY_TIP_NORTH;
        IVY_TIP_EAST = FBProperties.IVY_TIP_EAST;
        IVY_TIP_SOUTH = FBProperties.IVY_TIP_SOUTH;
        IVY_TIP_WEST = FBProperties.IVY_TIP_WEST;
        IVY_FERTILE = FBProperties.IVY_FERTILE;
        IVY_CONFIGURATION = FBProperties.IVY_CONFIGURATION;
        NORTH = ConnectingBlock.NORTH;
        EAST = ConnectingBlock.EAST;
        SOUTH = ConnectingBlock.SOUTH;
        WEST = ConnectingBlock.WEST;
        FACING_PROPERTIES = (Map)ConnectingBlock.FACING_PROPERTIES.entrySet().stream().filter((entry) -> entry.getKey() != Direction.DOWN).collect(Util.toMap());
        EAST_SHAPE = Block.createCuboidShape((double)0.0F, (double)0.0F, (double)0.0F, (double)1.0F, (double)16.0F, (double)16.0F);
        WEST_SHAPE = Block.createCuboidShape((double)15.0F, (double)0.0F, (double)0.0F, (double)16.0F, (double)16.0F, (double)16.0F);
        SOUTH_SHAPE = Block.createCuboidShape((double)0.0F, (double)0.0F, (double)0.0F, (double)16.0F, (double)16.0F, (double)1.0F);
        NORTH_SHAPE = Block.createCuboidShape((double)0.0F, (double)0.0F, (double)15.0F, (double)16.0F, (double)16.0F, (double)16.0F);
        NORTH_EAST_SHAPE = VoxelShapes.union(NORTH_SHAPE, EAST_SHAPE);
        EAST_SOUTH_SHAPE = VoxelShapes.union(EAST_SHAPE, SOUTH_SHAPE);
        SOUTH_WEST_SHAPE = VoxelShapes.union(SOUTH_SHAPE, WEST_SHAPE);
        WEST_NORTH_SHAPE = VoxelShapes.union(WEST_SHAPE, NORTH_SHAPE);
        NORTH_EAST_SOUTH_SHAPE = VoxelShapes.union(NORTH_SHAPE, EAST_SHAPE, SOUTH_SHAPE);
        EAST_SOUTH_WEST_SHAPE = VoxelShapes.union(EAST_SHAPE, SOUTH_SHAPE, WEST_SHAPE);
        SOUTH_WEST_NORTH_SHAPE = VoxelShapes.union(SOUTH_SHAPE, WEST_SHAPE, NORTH_SHAPE);
        WEST_NORTH_EAST_SHAPE = VoxelShapes.union(WEST_SHAPE, NORTH_SHAPE, EAST_SHAPE);
        ALL_SHAPE = VoxelShapes.union(NORTH_SHAPE, EAST_SHAPE, SOUTH_SHAPE, WEST_SHAPE);
    }
}