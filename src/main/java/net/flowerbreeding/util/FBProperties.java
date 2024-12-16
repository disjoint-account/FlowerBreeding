package net.flowerbreeding.util;

import net.flowerbreeding.util.properties.IvyConfiguration;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.EnumProperty;

public class FBProperties {
    public static final BooleanProperty IVY_TIP;
    public static final BooleanProperty IVY_FERTILE;
    public static final EnumProperty<IvyConfiguration> IVY_CONFIGURATION;

    public FBProperties(){
    }

    static {
        IVY_TIP = BooleanProperty.of("ivy_tip");
        IVY_FERTILE = BooleanProperty.of("ivy_fertile");
        IVY_CONFIGURATION = EnumProperty.of("ivy_configuration", IvyConfiguration.class);
    }
}
