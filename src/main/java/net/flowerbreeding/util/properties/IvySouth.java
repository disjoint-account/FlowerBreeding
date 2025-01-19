package net.flowerbreeding.util.properties;

import net.minecraft.util.StringIdentifiable;

public enum IvySouth implements StringIdentifiable {
    NONE("none"),
    REGULAR("regular"),
    TIP("tip");

    private final String name;

    IvySouth(final String name) {
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
