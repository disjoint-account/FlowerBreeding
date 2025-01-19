package net.flowerbreeding.util;

import net.flowerbreeding.util.properties.IvyEast;
import net.flowerbreeding.util.properties.IvyNorth;
import net.flowerbreeding.util.properties.IvySouth;
import net.flowerbreeding.util.properties.IvyWest;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.EnumProperty;

public class FBProperties {
    public static final BooleanProperty JASMINE_TIP;
    public static final BooleanProperty JASMINE_FERTILE;
    public static final BooleanProperty IVY_TIP_NORTH;
    public static final BooleanProperty IVY_TIP_SOUTH;
    public static final BooleanProperty IVY_TIP_EAST;
    public static final BooleanProperty IVY_TIP_WEST;
    public static final BooleanProperty IVY_FERTILE;
    public static final EnumProperty<IvyNorth> IVY_NORTH;
    public static final EnumProperty<IvyEast> IVY_EAST;
    public static final EnumProperty<IvySouth> IVY_SOUTH;
    public static final EnumProperty<IvyWest> IVY_WEST;
    public static final BooleanProperty CATTAIL_TIP;

    public FBProperties(){
    }

    static {
        JASMINE_TIP = BooleanProperty.of("jasmine_tip");
        JASMINE_FERTILE = BooleanProperty.of("jasmine_fertile");
        IVY_TIP_NORTH = BooleanProperty.of("ivy_tip_north");
        IVY_TIP_EAST = BooleanProperty.of("ivy_tip_east");
        IVY_TIP_SOUTH = BooleanProperty.of("ivy_tip_south");
        IVY_TIP_WEST = BooleanProperty.of("ivy_tip_west");
        IVY_NORTH = EnumProperty.of("ivy_north", IvyNorth.class);
        IVY_EAST = EnumProperty.of("ivy_east", IvyEast.class);
        IVY_SOUTH = EnumProperty.of("ivy_south", IvySouth.class);
        IVY_WEST = EnumProperty.of("ivy_west", IvyWest.class);
        IVY_FERTILE = BooleanProperty.of("ivy_fertile");
        CATTAIL_TIP = BooleanProperty.of("cattail_tip");
    }
}
