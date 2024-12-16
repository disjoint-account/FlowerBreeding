package net.flowerbreeding.util.properties;

import com.google.common.collect.Iterators;
import net.minecraft.util.StringIdentifiable;
import net.minecraft.util.Util;
import net.minecraft.util.math.random.Random;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public enum IvyConfiguration implements StringIdentifiable {
    NORTH_SINGLE("north_single"),
    EAST_SINGLE("east_single"),
    SOUTH_SINGLE("south_single"),
    WEST_SINGLE("west_single"),
    NORTH_EAST("north_east"),
    EAST_SOUTH("east_south"),
    SOUTH_WEST("south_west"),
    WEST_NORTH("west_north"),
    WEST_NORTH_EAST("west_north_east"),
    NORTH_EAST_SOUTH("north_east_south"),
    EAST_SOUTH_WEST("east_south_west"),
    SOUTH_WEST_NORTH("west_south_north"),
    ALL("all");

    private final String name;

    private IvyConfiguration(final String name) {
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

    public boolean isSingle() {
        return ((this == NORTH_SINGLE) || this == (EAST_SINGLE) || this == (SOUTH_SINGLE) || this == (WEST_SINGLE));
    }

    public boolean hasNorth() {
        return ((this == NORTH_SINGLE) || this == (NORTH_EAST) || this == (WEST_NORTH) || this == (NORTH_EAST_SOUTH)|| this == (SOUTH_WEST_NORTH)|| this == (WEST_NORTH_EAST)|| this == (ALL));
    }

    public boolean hasEast() {
        return ((this == EAST_SINGLE) || this == (EAST_SOUTH) || this == (NORTH_EAST) || this == (EAST_SOUTH_WEST)|| this == (WEST_NORTH_EAST)|| this == (NORTH_EAST_SOUTH)|| this == (ALL));
    }

    public boolean hasSouth() {
        return ((this == SOUTH_SINGLE) || this == (SOUTH_WEST) || this == (EAST_SOUTH) || this == (SOUTH_WEST_NORTH)|| this == (NORTH_EAST_SOUTH)|| this == (EAST_SOUTH_WEST)|| this == (ALL));
    }

    public boolean hasWest() {
        return ((this == WEST_SINGLE) || this == (WEST_NORTH) || this == (SOUTH_WEST) || this == (WEST_NORTH_EAST)|| this == (EAST_SOUTH_WEST)|| this == (SOUTH_WEST_NORTH)|| this == (ALL));
    }

    public static enum Type implements Iterable<IvyConfiguration>, Predicate<IvyConfiguration> {
        SINGLE(new IvyConfiguration[]{NORTH_SINGLE, EAST_SINGLE, SOUTH_SINGLE, WEST_SINGLE}),
        HAS_NORTH(new IvyConfiguration[]{NORTH_SINGLE, NORTH_EAST, WEST_NORTH, NORTH_EAST_SOUTH, SOUTH_WEST_NORTH, WEST_NORTH_EAST, ALL}),
        HAS_EAST(new IvyConfiguration[]{EAST_SINGLE, EAST_SOUTH, NORTH_EAST, EAST_SOUTH_WEST, WEST_NORTH_EAST, NORTH_EAST_SOUTH, ALL}),
        HAS_SOUTH(new IvyConfiguration[]{SOUTH_SINGLE, SOUTH_WEST, EAST_SOUTH, SOUTH_WEST_NORTH, NORTH_EAST_SOUTH, EAST_SOUTH_WEST, ALL}),
        HAS_WEST(new IvyConfiguration[]{WEST_SINGLE, WEST_NORTH, SOUTH_WEST, WEST_NORTH_EAST, EAST_SOUTH_WEST, SOUTH_WEST_NORTH, ALL});

        private final IvyConfiguration[] facingArray;

        private Type(final IvyConfiguration[] facingArray) {
            this.facingArray = facingArray;
        }

        public boolean test(@Nullable IvyConfiguration ivyConfiguration) {
            return ivyConfiguration != null;
        }

        public Iterator<IvyConfiguration> iterator() {
            return Iterators.forArray(this.facingArray);
        }

        public Stream<IvyConfiguration> stream() {
            return Arrays.stream(this.facingArray);
        }

        public List<IvyConfiguration> getShuffled(Random random) {
            return Util.copyShuffled(this.facingArray, random);
        }
    }
}