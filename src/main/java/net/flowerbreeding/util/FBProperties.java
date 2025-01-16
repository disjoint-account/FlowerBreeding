package net.flowerbreeding.util;

import net.flowerbreeding.util.properties.*;
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
    public static final EnumProperty<IvyConfiguration> IVY_CONFIGURATION;
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
        IVY_FERTILE = BooleanProperty.of("ivy_fertile");
        IVY_CONFIGURATION = EnumProperty.of("ivy_configuration", IvyConfiguration.class);
        CATTAIL_TIP = BooleanProperty.of("cattail_tip");
    }
}
