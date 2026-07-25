package net.flowerbreeding.pigmentjars;

import net.flowerbreeding.FBItems;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.Container;

public class JarCounter {
    public static int countJars (Player player) {
        Container inventory = player.getInventory();
        int empty = inventory.countItem(FBItems.EMPTY_PIGMENT_JAR);
        int magenta = inventory.countItem(FBItems.MAGENTA_PIGMENT_JAR);
        int blue = inventory.countItem(FBItems.BLUE_PIGMENT_JAR);
        int white = inventory.countItem(FBItems.WHITE_PIGMENT_JAR);
        int orange = inventory.countItem(FBItems.ORANGE_PIGMENT_JAR);
        int red = inventory.countItem(FBItems.RED_PIGMENT_JAR);
        int yellow = inventory.countItem(FBItems.YELLOW_PIGMENT_JAR);
        int lightBlue = inventory.countItem(FBItems.LIGHT_BLUE_PIGMENT_JAR);
        int pink = inventory.countItem(FBItems.PINK_PIGMENT_JAR);
        int black = inventory.countItem(FBItems.BLACK_PIGMENT_JAR);
        int cyan = inventory.countItem(FBItems.CYAN_PIGMENT_JAR);
        return empty + magenta + blue + white + orange + red + yellow + lightBlue + pink + black + cyan;
    }
}
