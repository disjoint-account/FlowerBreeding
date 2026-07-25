package net.flowerbreeding.util;

import net.flowerbreeding.util.properties.IvyEast;
import net.flowerbreeding.util.properties.IvyNorth;
import net.flowerbreeding.util.properties.IvySouth;
import net.flowerbreeding.util.properties.IvyWest;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;

public class FBProperties {
    public static final BooleanProperty TIP;
    public static final BooleanProperty JASMINE_FERTILE;
    public static final BooleanProperty IVY_FERTILE;
    public static final EnumProperty<IvyNorth> IVY_NORTH;
    public static final EnumProperty<IvyEast> IVY_EAST;
    public static final EnumProperty<IvySouth> IVY_SOUTH;
    public static final EnumProperty<IvyWest> IVY_WEST;

    public FBProperties(){
    }

    static {
        TIP = BooleanProperty.create("tip");
        JASMINE_FERTILE = BooleanProperty.create("jasmine_fertile");
        IVY_NORTH = EnumProperty.create("ivy_north", IvyNorth.class);
        IVY_EAST = EnumProperty.create("ivy_east", IvyEast.class);
        IVY_SOUTH = EnumProperty.create("ivy_south", IvySouth.class);
        IVY_WEST = EnumProperty.create("ivy_west", IvyWest.class);
        IVY_FERTILE = BooleanProperty.create("ivy_fertile");
    }
}
