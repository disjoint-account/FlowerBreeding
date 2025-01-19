package net.flowerbreeding.util.properties;

import net.minecraft.util.StringIdentifiable;

public enum IvyEast implements StringIdentifiable {
    NONE("none"),
    REGULAR("regular"),
    TIP("tip");

    private final String name;

    IvyEast(final String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name;
    }

    public String asString() {
        return this.name;
    }
}
