package net.flowerbreeding;

import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import net.flowerbreeding.util.FBProperties;
import net.flowerbreeding.util.properties.*;
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
import static net.minecraft.util.math.Direction.DOWN;

public class IvyBlock extends Block implements Fertilizable {
    public static final EnumProperty<IvyNorth> IVY_NORTH;
    public static final EnumProperty<IvyEast> IVY_EAST;
    public static final EnumProperty<IvySouth> IVY_SOUTH;
    public static final EnumProperty<IvyWest> IVY_WEST;
    public static final BooleanProperty IVY_FERTILE;
    private static final BooleanProperty NORTH;
    private static final BooleanProperty EAST;
    private static final BooleanProperty SOUTH;
    private static final BooleanProperty WEST;
    public static final MapCodec<IvyBlock> CODEC = createCodec(IvyBlock::new);
    public static final Map<Direction, BooleanProperty> FACING_PROPERTIES;
    private static final VoxelShape EAST_SHAPE;
    private static final VoxelShape WEST_SHAPE;
    private static final VoxelShape SOUTH_SHAPE;
    private static final VoxelShape NORTH_SHAPE;
    private static final VoxelShape NORTH_EAST_SHAPE;
    private static final VoxelShape EAST_SOUTH_SHAPE;
    private static final VoxelShape SOUTH_WEST_SHAPE;
    private static final VoxelShape WEST_NORTH_SHAPE;
    private static final VoxelShape NORTH_SOUTH_SHAPE;
    private static final VoxelShape EAST_WEST_SHAPE;
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
        this.setDefaultState(this.stateManager.getDefaultState().with(IVY_NORTH, IvyNorth.REGULAR).with(IVY_EAST, IvyEast.NONE).with(IVY_SOUTH, IvySouth.NONE).with(IVY_WEST, IvyWest.NONE).with(IVY_FERTILE, true));
        this.shapesByState = ImmutableMap.copyOf((Map)this.stateManager.getStates().stream().collect(Collectors.toMap(Function.identity(), IvyBlock::getShapeForState)));
    }

    private static VoxelShape getShapeForState(BlockState state) {
        VoxelShape voxelShape = VoxelShapes.empty();
        boolean north = hasNorth(state);
        boolean east = hasEast(state);
        boolean south = hasSouth(state);
        boolean west = hasWest(state);
        if (north && !east && !south && !west) {
            voxelShape = VoxelShapes.union(voxelShape, SOUTH_SHAPE);
        }
        if (north && east && !south && !west) {
            voxelShape = VoxelShapes.union(voxelShape, SOUTH_WEST_SHAPE);
        }
        if (north && !east && south && !west) {
            voxelShape = VoxelShapes.union(voxelShape, NORTH_SOUTH_SHAPE);
        }
        if (north && east && !south && west) {
            voxelShape = VoxelShapes.union(voxelShape, EAST_SOUTH_WEST_SHAPE);
        }
        if (!north && east && !south && !west) {
            voxelShape = VoxelShapes.union(voxelShape, WEST_SHAPE);
        }
        if (!north && east && south && !west) {
            voxelShape = VoxelShapes.union(voxelShape, WEST_NORTH_SHAPE);
        }
        if (!north && east && !south && west) {
            voxelShape = VoxelShapes.union(voxelShape, EAST_WEST_SHAPE);
        }
        if (north && east && south && !west) {
            voxelShape = VoxelShapes.union(voxelShape, SOUTH_WEST_NORTH_SHAPE);
        }
        if (!north && !east && south && !west) {
            voxelShape = VoxelShapes.union(voxelShape, NORTH_SHAPE);
        }
        if (!north && !east && south && west) {
            voxelShape = VoxelShapes.union(voxelShape, NORTH_EAST_SHAPE);
        }
        if (!north && east && south && west) {
            voxelShape = VoxelShapes.union(voxelShape, WEST_NORTH_EAST_SHAPE);
        }
        if (!north && !east && !south && west) {
            voxelShape = VoxelShapes.union(voxelShape, EAST_SHAPE);
        }
        if (north && !east && !south && west) {
            voxelShape = VoxelShapes.union(voxelShape, EAST_SOUTH_SHAPE);
        }
        if (north && !east && south && west) {
            voxelShape = VoxelShapes.union(voxelShape, NORTH_EAST_SOUTH_SHAPE);
        }
        if (north && east && south && west) {
            voxelShape = VoxelShapes.union(voxelShape, ALL_SHAPE);
        }
        return voxelShape.isEmpty() ? VoxelShapes.fullCube() : voxelShape;
    }

    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return this.shapesByState.get(state);
    }

    protected boolean isTransparent(BlockState state) {
        return true;
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
                    return getUpdatedState(belowState, world, pos);
                }
                BooleanProperty booleanProperty = getFacingProperty(direction);
                boolean bl3 = bl && blockState.get(booleanProperty);
                if (!bl3 && this.canPlaceAt(blockState, ctx.getWorld(), ctx.getBlockPos())) {
                    if (booleanProperty == NORTH) {
                        return blockState1.with(IVY_NORTH, IvyNorth.TIP).with(IVY_EAST, IvyEast.NONE).with(IVY_SOUTH, IvySouth.NONE).with(IVY_WEST, IvyWest.NONE);
                    }
                    if (booleanProperty == EAST) {
                        return blockState1.with(IVY_NORTH, IvyNorth.NONE).with(IVY_EAST, IvyEast.TIP).with(IVY_SOUTH, IvySouth.NONE).with(IVY_WEST, IvyWest.NONE);
                    }
                    if (booleanProperty == SOUTH) {
                        return blockState1.with(IVY_NORTH, IvyNorth.NONE).with(IVY_EAST, IvyEast.NONE).with(IVY_SOUTH, IvySouth.TIP).with(IVY_WEST, IvyWest.NONE);
                    }
                    if (booleanProperty == WEST) {
                        return blockState1.with(IVY_NORTH, IvyNorth.NONE).with(IVY_EAST, IvyEast.NONE).with(IVY_SOUTH, IvySouth.NONE).with(IVY_WEST, IvyWest.TIP);
                    }
                }
            }
        }
        return null;
    }

    protected static boolean faceCheck(Direction direction, WorldView world, BlockPos pos) {
        BlockState state = world.getBlockState(pos.offset(direction));
        return (Block.isFaceFullSquare(state.getCollisionShape(world, pos.offset(direction)), direction.getOpposite()));
    }

    protected static boolean neighbourCheck(WorldView world, BlockPos pos) {
        BlockPos base = pos.offset(DOWN);
        BlockState baseBlock = world.getBlockState(base);
        if (baseBlock.isOf(FBBlocks.CLIMBING_IVY)) {
            boolean hasNorth = hasNorth(baseBlock);
            boolean hasEast = hasEast(baseBlock);
            boolean hasSouth = hasSouth(baseBlock);
            boolean hasWest = hasWest(baseBlock);
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

    protected BlockState getStateForNeighborUpdate(BlockState state, WorldView world, ScheduledTickView tickView, BlockPos pos, Direction direction, BlockPos neighborPos, BlockState neighborState, Random random) {
        boolean tipNorth = state.get(IVY_NORTH) == IvyNorth.TIP;
        boolean tipEast = state.get(IVY_EAST) == IvyEast.TIP;
        boolean tipSouth = state.get(IVY_SOUTH) == IvySouth.TIP;
        boolean tipWest = state.get(IVY_WEST) == IvyWest.TIP;
        int i = countIvyAbove(world, pos);
        BlockPos pos1 = pos.offset(Direction.UP, i);
        BlockPos pos2 = pos.offset(Direction.DOWN);
        BlockPos pos3 = pos.offset(Direction.UP);
        BlockState state1 = world.getBlockState(pos1);
        BlockState state2 = world.getBlockState(pos2);
        BlockState state3 = world.getBlockState(pos3);
        boolean bl1 = state.get(IVY_FERTILE);
        boolean bl2 = state1.get(IVY_FERTILE);
        if (bl1 != bl2) {
            tickView.scheduleBlockTick(pos, this, 1);
        }
        if (!state.canPlaceAt(world, pos)) {
            tickView.scheduleBlockTick(pos, this, 1);
        }
        if (!state3.isOf(FBBlocks.CLIMBING_IVY) ||
                ((hasNorth(state3) == tipNorth) ||
                        (hasEast(state3) == tipEast) ||
                        (hasSouth(state3) == tipSouth) ||
                        (hasWest(state3) == tipWest))) {
            tickView.scheduleBlockTick(pos, this, 1);
        }
        if ((hasNorth(state) && !faceCheck(Direction.NORTH, world, pos)) ||
                (hasEast(state) && !faceCheck(Direction.EAST, world, pos)) ||
                (hasSouth(state) && !faceCheck(Direction.SOUTH, world, pos)) ||
                (hasWest(state) && !faceCheck(Direction.WEST, world, pos))) {
            tickView.scheduleBlockTick(pos, this, 1);
        }
        if (state2.isOf(FBBlocks.CLIMBING_IVY)) {
            if ((hasNorth(state) && !hasNorth(state2)) ||
                    (hasEast(state) && !hasEast(state2)) ||
                    (hasSouth(state) && !hasSouth(state2)) ||
                    (hasWest(state) && !hasWest(state2))) {
                tickView.scheduleBlockTick(pos, this, 1);
            }
        }
        return super.getStateForNeighborUpdate(state, world, tickView, pos, direction, neighborPos, neighborState, random);
    }

    protected void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        boolean tipNorth = state.get(IVY_NORTH) == IvyNorth.TIP;
        boolean tipEast = state.get(IVY_EAST) == IvyEast.TIP;
        boolean tipSouth = state.get(IVY_SOUTH) == IvySouth.TIP;
        boolean tipWest = state.get(IVY_WEST) == IvyWest.TIP;
        int i = countIvyAbove(world, pos);
        BlockPos pos1 = pos.offset(Direction.UP, i);
        BlockPos pos2 = pos.offset(Direction.DOWN);
        BlockPos pos3 = pos.offset(Direction.UP);
        BlockState state1 = world.getBlockState(pos1);
        BlockState state2 = world.getBlockState(pos2);
        BlockState state3 = world.getBlockState(pos3);
        boolean bl1 = state.get(IVY_FERTILE);
        boolean bl2 = state1.get(IVY_FERTILE);
        if (!state.canPlaceAt(world, pos)) {
            world.breakBlock(pos, true);
        }
        else {
            if (!state3.isOf(FBBlocks.CLIMBING_IVY) ||
                    ((hasNorth(state3) == tipNorth) ||
                            (hasEast(state3) == tipEast) ||
                            (hasSouth(state3) == tipSouth) ||
                            (hasWest(state3) == tipWest))) {
                getType(state, world, pos);
            }
            if (bl1 != bl2) {
                getFertility(state, world, pos);
            }
            if ((hasNorth(state) && !faceCheck(Direction.NORTH, world, pos)) ||
                    (hasEast(state) && !faceCheck(Direction.EAST, world, pos)) ||
                    (hasSouth(state) && !faceCheck(Direction.SOUTH, world, pos)) ||
                    (hasWest(state) && !faceCheck(Direction.WEST, world, pos))) {
                if (!faceCheck(Direction.NORTH, world, pos) &&
                        !faceCheck(Direction.EAST, world, pos) &&
                        !faceCheck(Direction.SOUTH, world, pos) &&
                        !faceCheck(Direction.WEST, world, pos)) {
                    world.breakBlock(pos, true);
                } else {
                    world.setBlockState(pos, getUpdatedState(state, world, pos));
                    world.playSound(null, pos, SoundEvents.BLOCK_VINE_BREAK, SoundCategory.BLOCKS, 1.0F, 1.0F);
                }
            }
            if (state2.isOf(FBBlocks.CLIMBING_IVY)) {
                if ((hasNorth(state) && !hasNorth(state2)) ||
                        (hasEast(state) && !hasEast(state2)) ||
                        (hasSouth(state) && !hasSouth(state2)) ||
                        (hasWest(state) && !hasWest(state2))) {
                    world.setBlockState(pos, getUpdatedState(state2, world, pos));
                    world.playSound(null, pos, SoundEvents.BLOCK_VINE_BREAK, SoundCategory.BLOCKS, 1.0F, 1.0F);
                }
            }
        }
    }

    protected boolean hasRandomTicks(BlockState state) {
        return true;
    }

    protected void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (random.nextDouble() < 0.1) {
            BlockPos blockPos = pos.offset(Direction.UP);
            if (world.getBlockState(blockPos).isAir()) {
                    if ((ivyBlockPlaceable(world, blockPos)) && (state.get(IVY_FERTILE))) {
                        world.setBlockState(blockPos, getUpdatedState(state, world, blockPos));
                }
            }
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

    public boolean isFertilizable(WorldView world, BlockPos pos, BlockState state) {
        int i = (countIvyAbove(world, pos) + 1);
        if ((ivyBlockPlaceable(world, pos.offset(Direction.UP, i))) && (state.get(IVY_FERTILE))) {
            return world.getBlockState(pos.offset(Direction.UP, i)).isAir();
        }
        return false;
    }

    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        return state.get(IVY_FERTILE);
    }

    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        int i = (countIvyAbove(world, pos) + 1);
        BlockPos blockPos = pos.offset(Direction.UP, i);
        world.setBlockState(blockPos, getUpdatedState(state, world, blockPos));
    }

    public void getType(BlockState state, ServerWorld world, BlockPos pos) {
        world.setBlockState(pos, state.with(IVY_NORTH, fullTipCheckNorth(world, pos)).with(IVY_EAST, fullTipCheckEast(world, pos)).with(IVY_SOUTH, fullTipCheckSouth(world, pos)).with(IVY_WEST, fullTipCheckWest(world, pos)));
    }

    protected int countIvyAbove(BlockView world, BlockPos pos) {
        int i;
        for (i = 0; i < 383 && world.getBlockState(pos.up(i + 1)).isOf(FBBlocks.CLIMBING_IVY); ++i) {
        }
        return i;
    }

    protected ActionResult onUseWithItem(ItemStack stack, BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (stack.isOf(Items.SHEARS)) {
            if ((state.get(IVY_FERTILE)) && (countIvyAbove(world, pos) == 0)) {
                world.setBlockState(pos, state.with(IVY_FERTILE, false));
                world.playSound(null, pos, SoundEvents.BLOCK_PUMPKIN_CARVE, SoundCategory.BLOCKS, 1.0F, 1.0F);
                stack.damage(1, player);
            }
            return ActionResult.SUCCESS;
        }
        if (stack.isOf(Items.HONEY_BOTTLE)) {
            if ((!state.get(IVY_FERTILE)) && (countIvyAbove(world, pos) == 0)) {
                int qty = stack.getCount();
                world.setBlockState(pos, state.with(IVY_FERTILE, true));
                if ((qty > 1) && (!player.isInCreativeMode())) {
                    stack.decrement(1);
                    player.getInventory().offerOrDrop(new ItemStack(Items.GLASS_BOTTLE));
                }
                if ((qty == 1) && (!player.isInCreativeMode())) {
                    player.setStackInHand(hand, new ItemStack(Items.GLASS_BOTTLE));
                }
                world.playSound(null, pos, SoundEvents.BLOCK_BEEHIVE_DRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
            }
            return ActionResult.SUCCESS;
        }
        if ((stack.isOf(FBBlocks.CLIMBING_IVY.asItem()))) {
            BlockPos belowPos = pos.offset(DOWN);
            BlockState belowState = world.getBlockState(belowPos);
            boolean northFace = faceCheck(Direction.NORTH, world, pos);
            boolean eastFace = faceCheck(Direction.EAST, world, pos);
            boolean southFace = faceCheck(Direction.SOUTH, world, pos);
            boolean westFace = faceCheck(Direction.WEST, world, pos);
            boolean northBase = ((belowState.isOf(FBBlocks.CLIMBING_IVY) && hasNorth(belowState)) || !belowState.isOf(FBBlocks.CLIMBING_IVY));
            boolean eastBase = ((belowState.isOf(FBBlocks.CLIMBING_IVY) && hasEast(belowState)) || !belowState.isOf(FBBlocks.CLIMBING_IVY));
            boolean southBase = ((belowState.isOf(FBBlocks.CLIMBING_IVY) && hasSouth(belowState)) || !belowState.isOf(FBBlocks.CLIMBING_IVY));
            boolean westBase = ((belowState.isOf(FBBlocks.CLIMBING_IVY) && hasWest(belowState)) || !belowState.isOf(FBBlocks.CLIMBING_IVY));
            boolean northAvailable = (northFace && !hasNorth(state) && northBase);
            boolean eastAvailable = (eastFace && !hasEast(state) && eastBase);
            boolean southAvailable = (southFace && !hasSouth(state) && southBase);
            boolean westAvailable = (westFace && !hasWest(state) && westBase);
            if (!northAvailable && !eastAvailable && !southAvailable && !westAvailable) {
                return ActionResult.SUCCESS;
            } else {
                if (hasNorth(state) && !hasEast(state) && !hasSouth(state) && !hasWest(state)) {
                    if (eastAvailable) {
                        world.setBlockState(pos, state.with(IVY_EAST, tipCheckEast(world, pos)));
                    } else if (westAvailable) {
                        world.setBlockState(pos, state.with(IVY_WEST, tipCheckWest(world, pos)));
                    } else if (southAvailable) {
                        world.setBlockState(pos, state.with(IVY_SOUTH, tipCheckSouth(world, pos)));
                    }
                }
                if (!hasNorth(state) && hasEast(state) && !hasSouth(state) && !hasWest(state)) {
                    if (southAvailable) {
                        world.setBlockState(pos, state.with(IVY_SOUTH, tipCheckSouth(world, pos)));
                    } else if (northAvailable) {
                        world.setBlockState(pos, state.with(IVY_NORTH, tipCheckNorth(world, pos)));
                    } else if (westAvailable) {
                        world.setBlockState(pos, state.with(IVY_WEST, tipCheckWest(world, pos)));
                    }
                }
                if (!hasNorth(state) && !hasEast(state) && hasSouth(state) && !hasWest(state)) {
                    if (westAvailable) {
                        world.setBlockState(pos, state.with(IVY_WEST, tipCheckWest(world, pos)));
                    } else if (eastAvailable) {
                        world.setBlockState(pos, state.with(IVY_EAST, tipCheckEast(world, pos)));
                    } else if (northAvailable) {
                        world.setBlockState(pos, state.with(IVY_NORTH, tipCheckNorth(world, pos)));
                    }
                }
                if (!hasNorth(state) && !hasEast(state) && !hasSouth(state) && hasWest(state)) {
                    if (northAvailable) {
                        world.setBlockState(pos, state.with(IVY_NORTH, tipCheckNorth(world, pos)));
                    } else if (southAvailable) {
                        world.setBlockState(pos, state.with(IVY_SOUTH, tipCheckSouth(world, pos)));
                    } else if (eastAvailable) {
                        world.setBlockState(pos, state.with(IVY_EAST, tipCheckEast(world, pos)));
                    }
                }
                if (hasNorth(state) && hasEast(state) && !hasSouth(state) && !hasWest(state)) {
                    if (southAvailable) {
                        world.setBlockState(pos, state.with(IVY_SOUTH, tipCheckSouth(world, pos)));
                    } else if (westAvailable) {
                        world.setBlockState(pos, state.with(IVY_WEST, tipCheckWest(world, pos)));
                    }
                }
                if (!hasNorth(state) && hasEast(state) && hasSouth(state) && !hasWest(state)) {
                    if (westAvailable) {
                        world.setBlockState(pos, state.with(IVY_WEST, tipCheckWest(world, pos)));
                    } else if (northAvailable) {
                        world.setBlockState(pos, state.with(IVY_NORTH, tipCheckNorth(world, pos)));
                    }
                }
                if (!hasNorth(state) && !hasEast(state) && hasSouth(state) && hasWest(state)) {
                    if (northAvailable) {
                        world.setBlockState(pos, state.with(IVY_NORTH, tipCheckNorth(world, pos)));
                    } else if (eastAvailable) {
                        world.setBlockState(pos, state.with(IVY_EAST, tipCheckEast(world, pos)));
                    }
                }
                if (hasNorth(state) && !hasEast(state) && !hasSouth(state) && hasWest(state)) {
                    if (eastAvailable) {
                        world.setBlockState(pos, state.with(IVY_EAST, tipCheckEast(world, pos)));
                    } else if (southAvailable) {
                        world.setBlockState(pos, state.with(IVY_SOUTH, tipCheckSouth(world, pos)));
                    }
                }
                if (hasNorth(state) && !hasEast(state) && hasSouth(state) && !hasWest(state)) {
                    if (eastAvailable) {
                        world.setBlockState(pos, state.with(IVY_EAST, tipCheckEast(world, pos)));
                    } else if (westAvailable) {
                        world.setBlockState(pos, state.with(IVY_WEST, tipCheckWest(world, pos)));
                    }
                }
                if (!hasNorth(state) && hasEast(state) && !hasSouth(state) && hasWest(state)) {
                    if (southAvailable) {
                        world.setBlockState(pos, state.with(IVY_SOUTH, tipCheckSouth(world, pos)));
                    } else if (northAvailable) {
                        world.setBlockState(pos, state.with(IVY_NORTH, tipCheckNorth(world, pos)));
                    }
                }
                if ((hasNorth(state) && hasEast(state) && hasSouth(state) && !hasWest(state) && westAvailable) ||
                        (!hasNorth(state) && hasEast(state) && hasSouth(state) && hasWest(state) && northAvailable) ||
                        (hasNorth(state) && !hasEast(state) && hasSouth(state) && hasWest(state) && eastAvailable) ||
                        (hasNorth(state) && hasEast(state) && !hasSouth(state) && hasWest(state) && southAvailable)) {
                    world.setBlockState(pos, state.with(IVY_NORTH, tipCheckNorth(world, pos)).with(IVY_EAST, tipCheckEast(world, pos)).with(IVY_SOUTH, tipCheckSouth(world, pos)).with(IVY_WEST, tipCheckWest(world, pos)));
                }
                world.playSound(null, pos, SoundEvents.BLOCK_VINE_PLACE, SoundCategory.BLOCKS, 1.0F, 1.0F);
                return ActionResult.SUCCESS;
            }
        }
        return ActionResult.PASS_TO_DEFAULT_BLOCK_ACTION;
    }

    public BlockState getUpdatedState(BlockState state, World world, BlockPos pos) {
        boolean needsNorth = hasNorth(state);
        boolean needsEast = hasEast(state);
        boolean needsSouth = hasSouth(state);
        boolean needsWest = hasWest(state);
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
            return state.with(IVY_NORTH, tipCheckNorth(world, pos)).with(IVY_EAST, tipCheckEast(world, pos)).with(IVY_SOUTH, tipCheckSouth(world, pos)).with(IVY_WEST, IvyWest.NONE);
        }
        if (!northFlag && eastFlag && southFlag && westFlag) {
            return state.with(IVY_NORTH, IvyNorth.NONE).with(IVY_EAST, tipCheckEast(world, pos)).with(IVY_SOUTH, tipCheckSouth(world, pos)).with(IVY_WEST, tipCheckWest(world, pos));
        }
        if (northFlag && !eastFlag && southFlag && westFlag) {
            return state.with(IVY_NORTH, tipCheckNorth(world, pos)).with(IVY_EAST, IvyEast.NONE).with(IVY_SOUTH, tipCheckSouth(world, pos)).with(IVY_WEST, tipCheckWest(world, pos));
        }
        if (northFlag && eastFlag && westFlag) {
            return state.with(IVY_NORTH, tipCheckNorth(world, pos)).with(IVY_EAST, tipCheckEast(world, pos)).with(IVY_SOUTH, IvySouth.NONE).with(IVY_WEST, tipCheckWest(world, pos));
        }
        if (northFlag && eastFlag) {
            return state.with(IVY_NORTH, tipCheckNorth(world, pos)).with(IVY_EAST, tipCheckEast(world, pos)).with(IVY_SOUTH, IvySouth.NONE).with(IVY_WEST, IvyWest.NONE);
        }
        if (!northFlag && eastFlag && southFlag) {
            return state.with(IVY_NORTH, IvyNorth.NONE).with(IVY_EAST, tipCheckEast(world, pos)).with(IVY_SOUTH, tipCheckSouth(world, pos)).with(IVY_WEST, IvyWest.NONE);
        }
        if (!northFlag && !eastFlag && southFlag && westFlag) {
            return state.with(IVY_NORTH, IvyNorth.NONE).with(IVY_EAST, IvyEast.NONE).with(IVY_SOUTH, tipCheckSouth(world, pos)).with(IVY_WEST, tipCheckWest(world, pos));
        }
        if (northFlag && !southFlag && westFlag) {
            return state.with(IVY_NORTH, tipCheckNorth(world, pos)).with(IVY_EAST, IvyEast.NONE).with(IVY_SOUTH, IvySouth.NONE).with(IVY_WEST, tipCheckWest(world, pos));
        }
        if (northFlag && southFlag ) {
            return state.with(IVY_NORTH, tipCheckNorth(world, pos)).with(IVY_EAST, IvyEast.NONE).with(IVY_SOUTH, tipCheckSouth(world, pos)).with(IVY_WEST, IvyWest.NONE);
        }
        if (!northFlag && eastFlag && westFlag) {
            return state.with(IVY_NORTH, IvyNorth.NONE).with(IVY_EAST, tipCheckEast(world, pos)).with(IVY_SOUTH, IvySouth.NONE).with(IVY_WEST, tipCheckWest(world, pos));
        }
        if (northFlag) {
            return state.with(IVY_NORTH, tipCheckNorth(world, pos)).with(IVY_EAST, IvyEast.NONE).with(IVY_SOUTH, IvySouth.NONE).with(IVY_WEST, IvyWest.NONE);
        }
        if (eastFlag) {
            return state.with(IVY_NORTH, IvyNorth.NONE).with(IVY_EAST, tipCheckEast(world, pos)).with(IVY_SOUTH, IvySouth.NONE).with(IVY_WEST, IvyWest.NONE);
        }
        if (southFlag) {
            return state.with(IVY_NORTH, IvyNorth.NONE).with(IVY_EAST, IvyEast.NONE).with(IVY_SOUTH, tipCheckSouth(world, pos)).with(IVY_WEST, IvyWest.NONE);
        }
        if (westFlag) {
            return state.with(IVY_NORTH, IvyNorth.NONE).with(IVY_EAST, IvyEast.NONE).with(IVY_SOUTH, IvySouth.NONE).with(IVY_WEST, tipCheckWest(world, pos));
        }
        else return Blocks.AIR.getDefaultState();
    }

    protected BlockState rotate(BlockState state, BlockRotation rotation) {
        switch (rotation) {
            case CLOCKWISE_180 -> {
                return state.with(NORTH, state.get(SOUTH)).with(EAST, state.get(WEST)).with(SOUTH, state.get(NORTH)).with(WEST, state.get(EAST));
            }
            case COUNTERCLOCKWISE_90 -> {
                return state.with(NORTH, state.get(EAST)).with(EAST, state.get(SOUTH)).with(SOUTH, state.get(WEST)).with(WEST, state.get(NORTH));
            }
            case CLOCKWISE_90 -> {
                return state.with(NORTH, state.get(WEST)).with(EAST, state.get(NORTH)).with(SOUTH, state.get(EAST)).with(WEST, state.get(SOUTH));
            }
            default -> {
                return state;
            }
        }
    }

    protected BlockState mirror(BlockState state, BlockMirror mirror) {
        switch (mirror) {
            case LEFT_RIGHT -> {
                return state.with(NORTH, state.get(SOUTH)).with(SOUTH, state.get(NORTH));
            }
            case FRONT_BACK -> {
                return state.with(EAST, state.get(WEST)).with(WEST, state.get(EAST));
            }
            default -> {
                return super.mirror(state, mirror);
            }
        }
    }

    public static BooleanProperty getFacingProperty(Direction direction) {
        return FACING_PROPERTIES.get(direction);
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(IVY_NORTH, IVY_EAST, IVY_SOUTH, IVY_WEST, IVY_FERTILE);
    }

    private static boolean hasNorth(BlockState state) {
        return state.get(IVY_NORTH) == IvyNorth.REGULAR || state.get(IVY_NORTH) == IvyNorth.TIP;
    }

    private static boolean hasEast(BlockState state) {
        return state.get(IVY_EAST) == IvyEast.REGULAR || state.get(IVY_EAST) == IvyEast.TIP;
    }

    private static boolean hasSouth(BlockState state) {
        return state.get(IVY_SOUTH) == IvySouth.REGULAR || state.get(IVY_SOUTH) == IvySouth.TIP;
    }

    private static boolean hasWest(BlockState state) {
        return state.get(IVY_WEST) == IvyWest.REGULAR || state.get(IVY_WEST) == IvyWest.TIP;
    }

    private static IvyNorth tipCheckNorth(WorldView world, BlockPos pos) {
        BlockState aboveState = world.getBlockState(pos.up());
        if (aboveState.isOf(FBBlocks.CLIMBING_IVY) && hasNorth(aboveState)) {
            return IvyNorth.REGULAR;
        }
        else return IvyNorth.TIP;
    }

    private static IvyEast tipCheckEast(WorldView world, BlockPos pos) {
        BlockState aboveState = world.getBlockState(pos.up());
        if (aboveState.isOf(FBBlocks.CLIMBING_IVY) && hasEast(aboveState)) {
            return IvyEast.REGULAR;
            }
        else return IvyEast.TIP;
    }

    private static IvySouth tipCheckSouth(WorldView world, BlockPos pos) {
        BlockState aboveState = world.getBlockState(pos.up());
        if (aboveState.isOf(FBBlocks.CLIMBING_IVY) && hasSouth(aboveState)) {
            return IvySouth.REGULAR;
        }
        else return IvySouth.TIP;
    }

    private static IvyWest tipCheckWest(WorldView world, BlockPos pos) {
        BlockState aboveState = world.getBlockState(pos.up());
        if (aboveState.isOf(FBBlocks.CLIMBING_IVY) && hasWest(aboveState)) {
            return IvyWest.REGULAR;
        }
        else return IvyWest.TIP;
    }

    private static IvyNorth fullTipCheckNorth(WorldView world, BlockPos pos) {
        BlockState state = world.getBlockState(pos);
        BlockState aboveState = world.getBlockState(pos.up());
        if (!hasNorth(state)) {
            return IvyNorth.NONE;
        }
        else if (aboveState.isOf(FBBlocks.CLIMBING_IVY) && hasNorth(aboveState)) {
            return IvyNorth.REGULAR;
        }
        else return IvyNorth.TIP;
    }

    private static IvyEast fullTipCheckEast(WorldView world, BlockPos pos) {
        BlockState state = world.getBlockState(pos);
        BlockState aboveState = world.getBlockState(pos.up());
        if (!hasEast(state)) {
            return IvyEast.NONE;
        }
        else if (aboveState.isOf(FBBlocks.CLIMBING_IVY) && hasEast(aboveState)) {
            return IvyEast.REGULAR;
        }
        else return IvyEast.TIP;
    }

    private static IvySouth fullTipCheckSouth(WorldView world, BlockPos pos) {
        BlockState state = world.getBlockState(pos);
        BlockState aboveState = world.getBlockState(pos.up());
        if (!hasSouth(state)) {
            return IvySouth.NONE;
        }
        else if (aboveState.isOf(FBBlocks.CLIMBING_IVY) && hasSouth(aboveState)) {
            return IvySouth.REGULAR;
        }
        else return IvySouth.TIP;
    }

    private static IvyWest fullTipCheckWest(WorldView world, BlockPos pos) {
        BlockState state = world.getBlockState(pos);
        BlockState aboveState = world.getBlockState(pos.up());
        if (!hasWest(state)) {
            return IvyWest.NONE;
        }
        else if (aboveState.isOf(FBBlocks.CLIMBING_IVY) && hasWest(aboveState)) {
            return IvyWest.REGULAR;
        }
        else return IvyWest.TIP;
    }

    static {
        IVY_NORTH = FBProperties.IVY_NORTH;
        IVY_EAST = FBProperties.IVY_EAST;
        IVY_SOUTH = FBProperties.IVY_SOUTH;
        IVY_WEST = FBProperties.IVY_WEST;
        IVY_FERTILE = FBProperties.IVY_FERTILE;
        NORTH = ConnectingBlock.NORTH;
        EAST = ConnectingBlock.EAST;
        SOUTH = ConnectingBlock.SOUTH;
        WEST = ConnectingBlock.WEST;
        FACING_PROPERTIES = (Map)ConnectingBlock.FACING_PROPERTIES.entrySet().stream().filter((entry) -> entry.getKey() != Direction.DOWN).collect(Util.toMap());
        EAST_SHAPE = Block.createCuboidShape(0.0F, 0.0F, 0.0F, 1.0F, 16.0F, 16.0F);
        WEST_SHAPE = Block.createCuboidShape(15.0F, 0.0F, 0.0F, 16.0F, 16.0F, 16.0F);
        SOUTH_SHAPE = Block.createCuboidShape(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 1.0F);
        NORTH_SHAPE = Block.createCuboidShape(0.0F, 0.0F, 15.0F, 16.0F, 16.0F, 16.0F);
        NORTH_EAST_SHAPE = VoxelShapes.union(NORTH_SHAPE, EAST_SHAPE);
        EAST_SOUTH_SHAPE = VoxelShapes.union(EAST_SHAPE, SOUTH_SHAPE);
        SOUTH_WEST_SHAPE = VoxelShapes.union(SOUTH_SHAPE, WEST_SHAPE);
        WEST_NORTH_SHAPE = VoxelShapes.union(WEST_SHAPE, NORTH_SHAPE);
        NORTH_SOUTH_SHAPE = VoxelShapes.union(NORTH_SHAPE, SOUTH_SHAPE);
        EAST_WEST_SHAPE = VoxelShapes.union(EAST_SHAPE, WEST_SHAPE);
        NORTH_EAST_SOUTH_SHAPE = VoxelShapes.union(NORTH_SHAPE, EAST_SHAPE, SOUTH_SHAPE);
        EAST_SOUTH_WEST_SHAPE = VoxelShapes.union(EAST_SHAPE, SOUTH_SHAPE, WEST_SHAPE);
        SOUTH_WEST_NORTH_SHAPE = VoxelShapes.union(SOUTH_SHAPE, WEST_SHAPE, NORTH_SHAPE);
        WEST_NORTH_EAST_SHAPE = VoxelShapes.union(WEST_SHAPE, NORTH_SHAPE, EAST_SHAPE);
        ALL_SHAPE = VoxelShapes.union(NORTH_SHAPE, EAST_SHAPE, SOUTH_SHAPE, WEST_SHAPE);
    }
}