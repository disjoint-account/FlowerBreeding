package net.flowerbreeding;

import com.mojang.serialization.MapCodec;
import net.flowerbreeding.util.FBProperties;
import net.flowerbreeding.util.properties.*;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundSource;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.PipeBlock;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.util.*;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.ScheduledTickAccess;
import org.jetbrains.annotations.Nullable;
import org.jspecify.annotations.NullMarked;

import java.util.Map;
import static net.minecraft.core.Direction.DOWN;
@NullMarked
public class IvyBlock extends Block implements BonemealableBlock {
    public static final EnumProperty<IvyNorth> IVY_NORTH;
    public static final EnumProperty<IvyEast> IVY_EAST;
    public static final EnumProperty<IvySouth> IVY_SOUTH;
    public static final EnumProperty<IvyWest> IVY_WEST;
    public static final BooleanProperty IVY_FERTILE;
    private static final BooleanProperty NORTH;
    private static final BooleanProperty EAST;
    private static final BooleanProperty SOUTH;
    private static final BooleanProperty WEST;
    public static final MapCodec<IvyBlock> CODEC = simpleCodec(IvyBlock::new);
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

    public MapCodec<IvyBlock> codec() {
        return CODEC;
    }

    public IvyBlock(BlockBehaviour.Properties settings) {
        super(settings);
        this.registerDefaultState(this.stateDefinition.any().setValue(IVY_NORTH, IvyNorth.REGULAR).setValue(IVY_EAST, IvyEast.NONE).setValue(IVY_SOUTH, IvySouth.NONE).setValue(IVY_WEST, IvyWest.NONE).setValue(IVY_FERTILE, true));
    }

    private static VoxelShape getShapeForState(BlockState state) {
        VoxelShape voxelShape = Shapes.empty();
        boolean north = hasNorth(state);
        boolean east = hasEast(state);
        boolean south = hasSouth(state);
        boolean west = hasWest(state);
        if (north && !east && !south && !west) {
            voxelShape = Shapes.or(voxelShape, SOUTH_SHAPE);
        }
        if (north && east && !south && !west) {
            voxelShape = Shapes.or(voxelShape, SOUTH_WEST_SHAPE);
        }
        if (north && !east && south && !west) {
            voxelShape = Shapes.or(voxelShape, NORTH_SOUTH_SHAPE);
        }
        if (north && east && !south && west) {
            voxelShape = Shapes.or(voxelShape, EAST_SOUTH_WEST_SHAPE);
        }
        if (!north && east && !south && !west) {
            voxelShape = Shapes.or(voxelShape, WEST_SHAPE);
        }
        if (!north && east && south && !west) {
            voxelShape = Shapes.or(voxelShape, WEST_NORTH_SHAPE);
        }
        if (!north && east && !south && west) {
            voxelShape = Shapes.or(voxelShape, EAST_WEST_SHAPE);
        }
        if (north && east && south && !west) {
            voxelShape = Shapes.or(voxelShape, SOUTH_WEST_NORTH_SHAPE);
        }
        if (!north && !east && south && !west) {
            voxelShape = Shapes.or(voxelShape, NORTH_SHAPE);
        }
        if (!north && !east && south && west) {
            voxelShape = Shapes.or(voxelShape, NORTH_EAST_SHAPE);
        }
        if (!north && east && south && west) {
            voxelShape = Shapes.or(voxelShape, WEST_NORTH_EAST_SHAPE);
        }
        if (!north && !east && !south && west) {
            voxelShape = Shapes.or(voxelShape, EAST_SHAPE);
        }
        if (north && !east && !south && west) {
            voxelShape = Shapes.or(voxelShape, EAST_SOUTH_SHAPE);
        }
        if (north && !east && south && west) {
            voxelShape = Shapes.or(voxelShape, NORTH_EAST_SOUTH_SHAPE);
        }
        if (north && east && south && west) {
            voxelShape = Shapes.or(voxelShape, ALL_SHAPE);
        }
        return voxelShape.isEmpty() ? Shapes.block() : voxelShape;
    }

    protected VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return getShapeForState(state);
    }

    protected boolean propagatesSkylightDown(BlockState state) {
        return true;
    }

    protected boolean canSurvive(BlockState state, LevelReader world, BlockPos pos) {
        boolean validNeighbour = neighbourCheck(world, pos);
        BlockPos pos1 = pos.relative(DOWN);
        BlockState state1 = world.getBlockState(pos1);
        return (((state1.is(BlockTags.SUBSTRATE_OVERWORLD)) || (state1.is(FBBlocks.CLIMBING_IVY))) && (validNeighbour));
    }

    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext ctx) {
        Level world = ctx.getLevel();
        BlockPos pos = ctx.getClickedPos();
        BlockState blockState = world.getBlockState(pos);
        boolean bl = blockState.is(this);
        BlockState blockState1 = bl ? blockState : this.defaultBlockState();
        BlockPos belowPos = pos.relative(DOWN);
        BlockState belowState = world.getBlockState(belowPos);
        for (Direction direction : ctx.getNearestLookingDirections()) {
            if ((direction == DOWN) || (direction == Direction.UP) || !faceCheck(direction, world, pos)) {
                return null;
            } else {
                if (belowState.is(FBBlocks.CLIMBING_IVY)) {
                    return getUpdatedState(belowState, world, pos);
                }
                BooleanProperty booleanProperty = getFacingProperty(direction);
                boolean bl3 = bl && blockState.getValue(booleanProperty);
                if (!bl3 && this.canSurvive(blockState, ctx.getLevel(), ctx.getClickedPos())) {
                    if (booleanProperty == NORTH) {
                        return blockState1.setValue(IVY_NORTH, IvyNorth.TIP).setValue(IVY_EAST, IvyEast.NONE).setValue(IVY_SOUTH, IvySouth.NONE).setValue(IVY_WEST, IvyWest.NONE);
                    }
                    if (booleanProperty == EAST) {
                        return blockState1.setValue(IVY_NORTH, IvyNorth.NONE).setValue(IVY_EAST, IvyEast.TIP).setValue(IVY_SOUTH, IvySouth.NONE).setValue(IVY_WEST, IvyWest.NONE);
                    }
                    if (booleanProperty == SOUTH) {
                        return blockState1.setValue(IVY_NORTH, IvyNorth.NONE).setValue(IVY_EAST, IvyEast.NONE).setValue(IVY_SOUTH, IvySouth.TIP).setValue(IVY_WEST, IvyWest.NONE);
                    }
                    if (booleanProperty == WEST) {
                        return blockState1.setValue(IVY_NORTH, IvyNorth.NONE).setValue(IVY_EAST, IvyEast.NONE).setValue(IVY_SOUTH, IvySouth.NONE).setValue(IVY_WEST, IvyWest.TIP);
                    }
                }
            }
        }
        return null;
    }

    protected static boolean faceCheck(Direction direction, LevelReader world, BlockPos pos) {
        BlockState state = world.getBlockState(pos.relative(direction));
        return (Block.isFaceFull(state.getCollisionShape(world, pos.relative(direction)), direction.getOpposite()));
    }

    protected static boolean neighbourCheck(LevelReader world, BlockPos pos) {
        BlockPos base = pos.relative(DOWN);
        BlockState baseBlock = world.getBlockState(base);
        if (baseBlock.is(FBBlocks.CLIMBING_IVY)) {
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

    protected BlockState updateShape(BlockState state, LevelReader world, ScheduledTickAccess tickView, BlockPos pos, Direction direction, BlockPos neighborPos, BlockState neighborState, RandomSource random) {
        boolean tipNorth = state.getValue(IVY_NORTH) == IvyNorth.TIP;
        boolean tipEast = state.getValue(IVY_EAST) == IvyEast.TIP;
        boolean tipSouth = state.getValue(IVY_SOUTH) == IvySouth.TIP;
        boolean tipWest = state.getValue(IVY_WEST) == IvyWest.TIP;
        int i = countIvyAbove(world, pos);
        BlockPos pos1 = pos.relative(Direction.UP, i);
        BlockPos pos2 = pos.relative(Direction.DOWN);
        BlockPos pos3 = pos.relative(Direction.UP);
        BlockState state1 = world.getBlockState(pos1);
        BlockState state2 = world.getBlockState(pos2);
        BlockState state3 = world.getBlockState(pos3);
        boolean bl1 = state.getValue(IVY_FERTILE);
        boolean bl2 = state1.getValue(IVY_FERTILE);
        if (bl1 != bl2) {
            tickView.scheduleTick(pos, this, 1);
        }
        if (!state.canSurvive(world, pos)) {
            tickView.scheduleTick(pos, this, 1);
        }
        if (!state3.is(FBBlocks.CLIMBING_IVY) ||
                ((hasNorth(state3) == tipNorth) ||
                        (hasEast(state3) == tipEast) ||
                        (hasSouth(state3) == tipSouth) ||
                        (hasWest(state3) == tipWest))) {
            tickView.scheduleTick(pos, this, 1);
        }
        if ((hasNorth(state) && !faceCheck(Direction.NORTH, world, pos)) ||
                (hasEast(state) && !faceCheck(Direction.EAST, world, pos)) ||
                (hasSouth(state) && !faceCheck(Direction.SOUTH, world, pos)) ||
                (hasWest(state) && !faceCheck(Direction.WEST, world, pos))) {
            tickView.scheduleTick(pos, this, 1);
        }
        if (state2.is(FBBlocks.CLIMBING_IVY)) {
            if ((hasNorth(state) && !hasNorth(state2)) ||
                    (hasEast(state) && !hasEast(state2)) ||
                    (hasSouth(state) && !hasSouth(state2)) ||
                    (hasWest(state) && !hasWest(state2))) {
                tickView.scheduleTick(pos, this, 1);
            }
        }
        return super.updateShape(state, world, tickView, pos, direction, neighborPos, neighborState, random);
    }

    protected void tick(BlockState state, ServerLevel world, BlockPos pos, RandomSource random) {
        boolean tipNorth = state.getValue(IVY_NORTH) == IvyNorth.TIP;
        boolean tipEast = state.getValue(IVY_EAST) == IvyEast.TIP;
        boolean tipSouth = state.getValue(IVY_SOUTH) == IvySouth.TIP;
        boolean tipWest = state.getValue(IVY_WEST) == IvyWest.TIP;
        int i = countIvyAbove(world, pos);
        BlockPos pos1 = pos.relative(Direction.UP, i);
        BlockPos pos2 = pos.relative(Direction.DOWN);
        BlockPos pos3 = pos.relative(Direction.UP);
        BlockState state1 = world.getBlockState(pos1);
        BlockState state2 = world.getBlockState(pos2);
        BlockState state3 = world.getBlockState(pos3);
        boolean bl1 = state.getValue(IVY_FERTILE);
        boolean bl2 = state1.getValue(IVY_FERTILE);
        if (!state.canSurvive(world, pos)) {
            world.destroyBlock(pos, true);
        }
        else {
            if (!state3.is(FBBlocks.CLIMBING_IVY) ||
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
                    world.destroyBlock(pos, true);
                } else {
                    world.setBlockAndUpdate(pos, getUpdatedState(state, world, pos));
                    world.playSound(null, pos, SoundEvents.VINE_BREAK, SoundSource.BLOCKS, 1.0F, 1.0F);
                }
            }
            if (state2.is(FBBlocks.CLIMBING_IVY)) {
                if ((hasNorth(state) && !hasNorth(state2)) ||
                        (hasEast(state) && !hasEast(state2)) ||
                        (hasSouth(state) && !hasSouth(state2)) ||
                        (hasWest(state) && !hasWest(state2))) {
                    world.setBlockAndUpdate(pos, getUpdatedState(state2, world, pos));
                    world.playSound(null, pos, SoundEvents.VINE_BREAK, SoundSource.BLOCKS, 1.0F, 1.0F);
                }
            }
        }
    }

    protected boolean isRandomlyTicking(BlockState state) {
        return true;
    }

    protected void randomTick(BlockState state, ServerLevel world, BlockPos pos, RandomSource random) {
        if (random.nextDouble() < 0.1) {
            BlockPos blockPos = pos.relative(Direction.UP);
            if (world.getBlockState(blockPos).isAir()) {
                    if ((canSurvive(state, world, blockPos)) && (state.getValue(IVY_FERTILE))) {
                        world.setBlockAndUpdate(blockPos, getUpdatedState(state, world, blockPos));
                }
            }
        }
    }

    public void getFertility(BlockState state, ServerLevel world, BlockPos pos) {
        int i = countIvyAbove(world, pos);
        BlockPos pos1 = pos.relative(Direction.UP, i);
        BlockState state1 = world.getBlockState(pos1);
        boolean bl = state1.getValue(IVY_FERTILE);
        if ((i != 0) && state.getValue(IVY_FERTILE) != bl) {
            world.setBlockAndUpdate(pos, state.setValue(IVY_FERTILE, bl));
        }
    }

    public boolean isValidBonemealTarget(LevelReader world, BlockPos pos, BlockState state) {
        int i = (countIvyAbove(world, pos) + 1);
        if ((canSurvive(state, world, pos.relative(Direction.UP, i))) && (state.getValue(IVY_FERTILE))) {
            return world.getBlockState(pos.relative(Direction.UP, i)).isAir();
        }
        return false;
    }

    public boolean isBonemealSuccess(Level world, RandomSource random, BlockPos pos, BlockState state) {
        return state.getValue(IVY_FERTILE);
    }

    public void performBonemeal(ServerLevel world, RandomSource random, BlockPos pos, BlockState state) {
        int i = (countIvyAbove(world, pos) + 1);
        BlockPos blockPos = pos.relative(Direction.UP, i);
        world.setBlockAndUpdate(blockPos, getUpdatedState(state, world, blockPos));
    }

    public void getType(BlockState state, ServerLevel world, BlockPos pos) {
        world.setBlockAndUpdate(pos, state.setValue(IVY_NORTH, fullTipCheckNorth(world, pos)).setValue(IVY_EAST, fullTipCheckEast(world, pos)).setValue(IVY_SOUTH, fullTipCheckSouth(world, pos)).setValue(IVY_WEST, fullTipCheckWest(world, pos)));
    }

    protected int countIvyAbove(BlockGetter world, BlockPos pos) {
        int i;
        for (i = 0; i < 383 && world.getBlockState(pos.above(i + 1)).is(FBBlocks.CLIMBING_IVY); ++i) {
        }
        return i;
    }

    protected InteractionResult useItemOn(ItemStack stack, BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        if (stack.is(Items.SHEARS)) {
            if ((state.getValue(IVY_FERTILE)) && (countIvyAbove(world, pos) == 0)) {
                world.setBlockAndUpdate(pos, state.setValue(IVY_FERTILE, false));
                world.playSound(null, pos, SoundEvents.PUMPKIN_CARVE, SoundSource.BLOCKS, 1.0F, 1.0F);
                stack.hurtWithoutBreaking(1, player);
            }
            return InteractionResult.SUCCESS;
        }
        if (stack.is(Items.HONEY_BOTTLE)) {
            if ((!state.getValue(IVY_FERTILE)) && (countIvyAbove(world, pos) == 0)) {
                int qty = stack.getCount();
                world.setBlockAndUpdate(pos, state.setValue(IVY_FERTILE, true));
                if ((qty > 1) && (!player.hasInfiniteMaterials())) {
                    stack.shrink(1);
                    player.getInventory().placeItemBackInInventory(new ItemStack(Items.GLASS_BOTTLE));
                }
                if ((qty == 1) && (!player.hasInfiniteMaterials())) {
                    player.setItemInHand(hand, new ItemStack(Items.GLASS_BOTTLE));
                }
                world.playSound(null, pos, SoundEvents.BEEHIVE_DRIP, SoundSource.BLOCKS, 1.0F, 1.0F);
            }
            return InteractionResult.SUCCESS;
        }
        if ((stack.is(FBBlocks.CLIMBING_IVY.asItem()))) {
            BlockPos belowPos = pos.relative(DOWN);
            BlockState belowState = world.getBlockState(belowPos);
            boolean northFace = faceCheck(Direction.NORTH, world, pos);
            boolean eastFace = faceCheck(Direction.EAST, world, pos);
            boolean southFace = faceCheck(Direction.SOUTH, world, pos);
            boolean westFace = faceCheck(Direction.WEST, world, pos);
            boolean northBase = ((belowState.is(FBBlocks.CLIMBING_IVY) && hasNorth(belowState)) || !belowState.is(FBBlocks.CLIMBING_IVY));
            boolean eastBase = ((belowState.is(FBBlocks.CLIMBING_IVY) && hasEast(belowState)) || !belowState.is(FBBlocks.CLIMBING_IVY));
            boolean southBase = ((belowState.is(FBBlocks.CLIMBING_IVY) && hasSouth(belowState)) || !belowState.is(FBBlocks.CLIMBING_IVY));
            boolean westBase = ((belowState.is(FBBlocks.CLIMBING_IVY) && hasWest(belowState)) || !belowState.is(FBBlocks.CLIMBING_IVY));
            boolean northAvailable = (northFace && !hasNorth(state) && northBase);
            boolean eastAvailable = (eastFace && !hasEast(state) && eastBase);
            boolean southAvailable = (southFace && !hasSouth(state) && southBase);
            boolean westAvailable = (westFace && !hasWest(state) && westBase);
            if (northAvailable || eastAvailable || southAvailable || westAvailable) {
                if (hasNorth(state) && !hasEast(state) && !hasSouth(state) && !hasWest(state)) {
                    if (eastAvailable) {
                        world.setBlockAndUpdate(pos, state.setValue(IVY_EAST, tipCheckEast(world, pos)));
                    } else if (westAvailable) {
                        world.setBlockAndUpdate(pos, state.setValue(IVY_WEST, tipCheckWest(world, pos)));
                    } else if (southAvailable) {
                        world.setBlockAndUpdate(pos, state.setValue(IVY_SOUTH, tipCheckSouth(world, pos)));
                    }
                }
                if (!hasNorth(state) && hasEast(state) && !hasSouth(state) && !hasWest(state)) {
                    if (southAvailable) {
                        world.setBlockAndUpdate(pos, state.setValue(IVY_SOUTH, tipCheckSouth(world, pos)));
                    } else if (northAvailable) {
                        world.setBlockAndUpdate(pos, state.setValue(IVY_NORTH, tipCheckNorth(world, pos)));
                    } else if (westAvailable) {
                        world.setBlockAndUpdate(pos, state.setValue(IVY_WEST, tipCheckWest(world, pos)));
                    }
                }
                if (!hasNorth(state) && !hasEast(state) && hasSouth(state) && !hasWest(state)) {
                    if (westAvailable) {
                        world.setBlockAndUpdate(pos, state.setValue(IVY_WEST, tipCheckWest(world, pos)));
                    } else if (eastAvailable) {
                        world.setBlockAndUpdate(pos, state.setValue(IVY_EAST, tipCheckEast(world, pos)));
                    } else if (northAvailable) {
                        world.setBlockAndUpdate(pos, state.setValue(IVY_NORTH, tipCheckNorth(world, pos)));
                    }
                }
                if (!hasNorth(state) && !hasEast(state) && !hasSouth(state) && hasWest(state)) {
                    if (northAvailable) {
                        world.setBlockAndUpdate(pos, state.setValue(IVY_NORTH, tipCheckNorth(world, pos)));
                    } else if (southAvailable) {
                        world.setBlockAndUpdate(pos, state.setValue(IVY_SOUTH, tipCheckSouth(world, pos)));
                    } else if (eastAvailable) {
                        world.setBlockAndUpdate(pos, state.setValue(IVY_EAST, tipCheckEast(world, pos)));
                    }
                }
                if (hasNorth(state) && hasEast(state) && !hasSouth(state) && !hasWest(state)) {
                    if (southAvailable) {
                        world.setBlockAndUpdate(pos, state.setValue(IVY_SOUTH, tipCheckSouth(world, pos)));
                    } else if (westAvailable) {
                        world.setBlockAndUpdate(pos, state.setValue(IVY_WEST, tipCheckWest(world, pos)));
                    }
                }
                if (!hasNorth(state) && hasEast(state) && hasSouth(state) && !hasWest(state)) {
                    if (westAvailable) {
                        world.setBlockAndUpdate(pos, state.setValue(IVY_WEST, tipCheckWest(world, pos)));
                    } else if (northAvailable) {
                        world.setBlockAndUpdate(pos, state.setValue(IVY_NORTH, tipCheckNorth(world, pos)));
                    }
                }
                if (!hasNorth(state) && !hasEast(state) && hasSouth(state) && hasWest(state)) {
                    if (northAvailable) {
                        world.setBlockAndUpdate(pos, state.setValue(IVY_NORTH, tipCheckNorth(world, pos)));
                    } else if (eastAvailable) {
                        world.setBlockAndUpdate(pos, state.setValue(IVY_EAST, tipCheckEast(world, pos)));
                    }
                }
                if (hasNorth(state) && !hasEast(state) && !hasSouth(state) && hasWest(state)) {
                    if (eastAvailable) {
                        world.setBlockAndUpdate(pos, state.setValue(IVY_EAST, tipCheckEast(world, pos)));
                    } else if (southAvailable) {
                        world.setBlockAndUpdate(pos, state.setValue(IVY_SOUTH, tipCheckSouth(world, pos)));
                    }
                }
                if (hasNorth(state) && !hasEast(state) && hasSouth(state) && !hasWest(state)) {
                    if (eastAvailable) {
                        world.setBlockAndUpdate(pos, state.setValue(IVY_EAST, tipCheckEast(world, pos)));
                    } else if (westAvailable) {
                        world.setBlockAndUpdate(pos, state.setValue(IVY_WEST, tipCheckWest(world, pos)));
                    }
                }
                if (!hasNorth(state) && hasEast(state) && !hasSouth(state) && hasWest(state)) {
                    if (southAvailable) {
                        world.setBlockAndUpdate(pos, state.setValue(IVY_SOUTH, tipCheckSouth(world, pos)));
                    } else if (northAvailable) {
                        world.setBlockAndUpdate(pos, state.setValue(IVY_NORTH, tipCheckNorth(world, pos)));
                    }
                }
                if ((hasNorth(state) && hasEast(state) && hasSouth(state) && !hasWest(state) && westAvailable) ||
                        (!hasNorth(state) && hasEast(state) && hasSouth(state) && hasWest(state) && northAvailable) ||
                        (hasNorth(state) && !hasEast(state) && hasSouth(state) && hasWest(state) && eastAvailable) ||
                        (hasNorth(state) && hasEast(state) && !hasSouth(state) && hasWest(state) && southAvailable)) {
                    world.setBlockAndUpdate(pos, state.setValue(IVY_NORTH, tipCheckNorth(world, pos)).setValue(IVY_EAST, tipCheckEast(world, pos)).setValue(IVY_SOUTH, tipCheckSouth(world, pos)).setValue(IVY_WEST, tipCheckWest(world, pos)));
                }
                world.playSound(null, pos, SoundEvents.VINE_PLACE, SoundSource.BLOCKS, 1.0F, 1.0F);
            }
            return InteractionResult.SUCCESS;
        }
        return InteractionResult.TRY_WITH_EMPTY_HAND;
    }

    public BlockState getUpdatedState(BlockState state, Level world, BlockPos pos) {
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
            return state.setValue(IVY_NORTH, tipCheckNorth(world, pos)).setValue(IVY_EAST, tipCheckEast(world, pos)).setValue(IVY_SOUTH, tipCheckSouth(world, pos)).setValue(IVY_WEST, IvyWest.NONE);
        }
        if (!northFlag && eastFlag && southFlag && westFlag) {
            return state.setValue(IVY_NORTH, IvyNorth.NONE).setValue(IVY_EAST, tipCheckEast(world, pos)).setValue(IVY_SOUTH, tipCheckSouth(world, pos)).setValue(IVY_WEST, tipCheckWest(world, pos));
        }
        if (northFlag && !eastFlag && southFlag && westFlag) {
            return state.setValue(IVY_NORTH, tipCheckNorth(world, pos)).setValue(IVY_EAST, IvyEast.NONE).setValue(IVY_SOUTH, tipCheckSouth(world, pos)).setValue(IVY_WEST, tipCheckWest(world, pos));
        }
        if (northFlag && eastFlag && westFlag) {
            return state.setValue(IVY_NORTH, tipCheckNorth(world, pos)).setValue(IVY_EAST, tipCheckEast(world, pos)).setValue(IVY_SOUTH, IvySouth.NONE).setValue(IVY_WEST, tipCheckWest(world, pos));
        }
        if (northFlag && eastFlag) {
            return state.setValue(IVY_NORTH, tipCheckNorth(world, pos)).setValue(IVY_EAST, tipCheckEast(world, pos)).setValue(IVY_SOUTH, IvySouth.NONE).setValue(IVY_WEST, IvyWest.NONE);
        }
        if (!northFlag && eastFlag && southFlag) {
            return state.setValue(IVY_NORTH, IvyNorth.NONE).setValue(IVY_EAST, tipCheckEast(world, pos)).setValue(IVY_SOUTH, tipCheckSouth(world, pos)).setValue(IVY_WEST, IvyWest.NONE);
        }
        if (!northFlag && !eastFlag && southFlag && westFlag) {
            return state.setValue(IVY_NORTH, IvyNorth.NONE).setValue(IVY_EAST, IvyEast.NONE).setValue(IVY_SOUTH, tipCheckSouth(world, pos)).setValue(IVY_WEST, tipCheckWest(world, pos));
        }
        if (northFlag && !southFlag && westFlag) {
            return state.setValue(IVY_NORTH, tipCheckNorth(world, pos)).setValue(IVY_EAST, IvyEast.NONE).setValue(IVY_SOUTH, IvySouth.NONE).setValue(IVY_WEST, tipCheckWest(world, pos));
        }
        if (northFlag && southFlag ) {
            return state.setValue(IVY_NORTH, tipCheckNorth(world, pos)).setValue(IVY_EAST, IvyEast.NONE).setValue(IVY_SOUTH, tipCheckSouth(world, pos)).setValue(IVY_WEST, IvyWest.NONE);
        }
        if (!northFlag && eastFlag && westFlag) {
            return state.setValue(IVY_NORTH, IvyNorth.NONE).setValue(IVY_EAST, tipCheckEast(world, pos)).setValue(IVY_SOUTH, IvySouth.NONE).setValue(IVY_WEST, tipCheckWest(world, pos));
        }
        if (northFlag) {
            return state.setValue(IVY_NORTH, tipCheckNorth(world, pos)).setValue(IVY_EAST, IvyEast.NONE).setValue(IVY_SOUTH, IvySouth.NONE).setValue(IVY_WEST, IvyWest.NONE);
        }
        if (eastFlag) {
            return state.setValue(IVY_NORTH, IvyNorth.NONE).setValue(IVY_EAST, tipCheckEast(world, pos)).setValue(IVY_SOUTH, IvySouth.NONE).setValue(IVY_WEST, IvyWest.NONE);
        }
        if (southFlag) {
            return state.setValue(IVY_NORTH, IvyNorth.NONE).setValue(IVY_EAST, IvyEast.NONE).setValue(IVY_SOUTH, tipCheckSouth(world, pos)).setValue(IVY_WEST, IvyWest.NONE);
        }
        if (westFlag) {
            return state.setValue(IVY_NORTH, IvyNorth.NONE).setValue(IVY_EAST, IvyEast.NONE).setValue(IVY_SOUTH, IvySouth.NONE).setValue(IVY_WEST, tipCheckWest(world, pos));
        }
        else return Blocks.AIR.defaultBlockState();
    }

    protected BlockState rotate(BlockState state, Rotation rotation) {
        switch (rotation) {
            case CLOCKWISE_180 -> {
                return state.setValue(NORTH, state.getValue(SOUTH)).setValue(EAST, state.getValue(WEST)).setValue(SOUTH, state.getValue(NORTH)).setValue(WEST, state.getValue(EAST));
            }
            case COUNTERCLOCKWISE_90 -> {
                return state.setValue(NORTH, state.getValue(EAST)).setValue(EAST, state.getValue(SOUTH)).setValue(SOUTH, state.getValue(WEST)).setValue(WEST, state.getValue(NORTH));
            }
            case CLOCKWISE_90 -> {
                return state.setValue(NORTH, state.getValue(WEST)).setValue(EAST, state.getValue(NORTH)).setValue(SOUTH, state.getValue(EAST)).setValue(WEST, state.getValue(SOUTH));
            }
            default -> {
                return state;
            }
        }
    }

    protected BlockState mirror(BlockState state, Mirror mirror) {
        switch (mirror) {
            case LEFT_RIGHT -> {
                return state.setValue(NORTH, state.getValue(SOUTH)).setValue(SOUTH, state.getValue(NORTH));
            }
            case FRONT_BACK -> {
                return state.setValue(EAST, state.getValue(WEST)).setValue(WEST, state.getValue(EAST));
            }
            default -> {
                return super.mirror(state, mirror);
            }
        }
    }

    public static BooleanProperty getFacingProperty(Direction direction) {
        return FACING_PROPERTIES.get(direction);
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(IVY_NORTH, IVY_EAST, IVY_SOUTH, IVY_WEST, IVY_FERTILE);
    }

    private static boolean hasNorth(BlockState state) {
        return state.getValue(IVY_NORTH) == IvyNorth.REGULAR || state.getValue(IVY_NORTH) == IvyNorth.TIP;
    }

    private static boolean hasEast(BlockState state) {
        return state.getValue(IVY_EAST) == IvyEast.REGULAR || state.getValue(IVY_EAST) == IvyEast.TIP;
    }

    private static boolean hasSouth(BlockState state) {
        return state.getValue(IVY_SOUTH) == IvySouth.REGULAR || state.getValue(IVY_SOUTH) == IvySouth.TIP;
    }

    private static boolean hasWest(BlockState state) {
        return state.getValue(IVY_WEST) == IvyWest.REGULAR || state.getValue(IVY_WEST) == IvyWest.TIP;
    }

    private static IvyNorth tipCheckNorth(LevelReader world, BlockPos pos) {
        BlockState aboveState = world.getBlockState(pos.above());
        if (aboveState.is(FBBlocks.CLIMBING_IVY) && hasNorth(aboveState)) {
            return IvyNorth.REGULAR;
        }
        else return IvyNorth.TIP;
    }

    private static IvyEast tipCheckEast(LevelReader world, BlockPos pos) {
        BlockState aboveState = world.getBlockState(pos.above());
        if (aboveState.is(FBBlocks.CLIMBING_IVY) && hasEast(aboveState)) {
            return IvyEast.REGULAR;
            }
        else return IvyEast.TIP;
    }

    private static IvySouth tipCheckSouth(LevelReader world, BlockPos pos) {
        BlockState aboveState = world.getBlockState(pos.above());
        if (aboveState.is(FBBlocks.CLIMBING_IVY) && hasSouth(aboveState)) {
            return IvySouth.REGULAR;
        }
        else return IvySouth.TIP;
    }

    private static IvyWest tipCheckWest(LevelReader world, BlockPos pos) {
        BlockState aboveState = world.getBlockState(pos.above());
        if (aboveState.is(FBBlocks.CLIMBING_IVY) && hasWest(aboveState)) {
            return IvyWest.REGULAR;
        }
        else return IvyWest.TIP;
    }

    private static IvyNorth fullTipCheckNorth(LevelReader world, BlockPos pos) {
        BlockState state = world.getBlockState(pos);
        BlockState aboveState = world.getBlockState(pos.above());
        if (!hasNorth(state)) {
            return IvyNorth.NONE;
        }
        else if (aboveState.is(FBBlocks.CLIMBING_IVY) && hasNorth(aboveState)) {
            return IvyNorth.REGULAR;
        }
        else return IvyNorth.TIP;
    }

    private static IvyEast fullTipCheckEast(LevelReader world, BlockPos pos) {
        BlockState state = world.getBlockState(pos);
        BlockState aboveState = world.getBlockState(pos.above());
        if (!hasEast(state)) {
            return IvyEast.NONE;
        }
        else if (aboveState.is(FBBlocks.CLIMBING_IVY) && hasEast(aboveState)) {
            return IvyEast.REGULAR;
        }
        else return IvyEast.TIP;
    }

    private static IvySouth fullTipCheckSouth(LevelReader world, BlockPos pos) {
        BlockState state = world.getBlockState(pos);
        BlockState aboveState = world.getBlockState(pos.above());
        if (!hasSouth(state)) {
            return IvySouth.NONE;
        }
        else if (aboveState.is(FBBlocks.CLIMBING_IVY) && hasSouth(aboveState)) {
            return IvySouth.REGULAR;
        }
        else return IvySouth.TIP;
    }

    private static IvyWest fullTipCheckWest(LevelReader world, BlockPos pos) {
        BlockState state = world.getBlockState(pos);
        BlockState aboveState = world.getBlockState(pos.above());
        if (!hasWest(state)) {
            return IvyWest.NONE;
        }
        else if (aboveState.is(FBBlocks.CLIMBING_IVY) && hasWest(aboveState)) {
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
        NORTH = PipeBlock.NORTH;
        EAST = PipeBlock.EAST;
        SOUTH = PipeBlock.SOUTH;
        WEST = PipeBlock.WEST;
        FACING_PROPERTIES = PipeBlock.PROPERTY_BY_DIRECTION.entrySet().stream().filter((entry) -> entry.getKey() != Direction.DOWN).collect(Util.toMap());
        EAST_SHAPE = Block.box(0.0F, 0.0F, 0.0F, 1.0F, 16.0F, 16.0F);
        WEST_SHAPE = Block.box(15.0F, 0.0F, 0.0F, 16.0F, 16.0F, 16.0F);
        SOUTH_SHAPE = Block.box(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 1.0F);
        NORTH_SHAPE = Block.box(0.0F, 0.0F, 15.0F, 16.0F, 16.0F, 16.0F);
        NORTH_EAST_SHAPE = Shapes.or(NORTH_SHAPE, EAST_SHAPE);
        EAST_SOUTH_SHAPE = Shapes.or(EAST_SHAPE, SOUTH_SHAPE);
        SOUTH_WEST_SHAPE = Shapes.or(SOUTH_SHAPE, WEST_SHAPE);
        WEST_NORTH_SHAPE = Shapes.or(WEST_SHAPE, NORTH_SHAPE);
        NORTH_SOUTH_SHAPE = Shapes.or(NORTH_SHAPE, SOUTH_SHAPE);
        EAST_WEST_SHAPE = Shapes.or(EAST_SHAPE, WEST_SHAPE);
        NORTH_EAST_SOUTH_SHAPE = Shapes.or(NORTH_SHAPE, EAST_SHAPE, SOUTH_SHAPE);
        EAST_SOUTH_WEST_SHAPE = Shapes.or(EAST_SHAPE, SOUTH_SHAPE, WEST_SHAPE);
        SOUTH_WEST_NORTH_SHAPE = Shapes.or(SOUTH_SHAPE, WEST_SHAPE, NORTH_SHAPE);
        WEST_NORTH_EAST_SHAPE = Shapes.or(WEST_SHAPE, NORTH_SHAPE, EAST_SHAPE);
        ALL_SHAPE = Shapes.or(NORTH_SHAPE, EAST_SHAPE, SOUTH_SHAPE, WEST_SHAPE);
    }
}