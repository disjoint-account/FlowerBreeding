package net.flowerbreeding.util.properties;

import net.minecraft.util.StringRepresentable;
import org.jspecify.annotations.NonNull;

public enum IvyWest implements StringRepresentable {
    NONE("none"),
    REGULAR("regular"),
    TIP("tip");

    private final String name;

    IvyWest(final String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name;
    }

    public @NonNull String getSerializedName() {
        return this.name;
    }
}
