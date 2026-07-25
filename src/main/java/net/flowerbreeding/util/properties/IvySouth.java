package net.flowerbreeding.util.properties;

import net.minecraft.util.StringRepresentable;
import org.jspecify.annotations.NonNull;

public enum IvySouth implements StringRepresentable {
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

    public @NonNull String getSerializedName() {
        return this.name;
    }
}
