package net.flowerbreeding.pigmentjars;

import net.flowerbreeding.FBItems;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.Inventory;

public class JarCounter {
    public static int countJars (PlayerEntity player) {
        Inventory inventory = player.getInventory();
        int empty = inventory.count(FBItems.EMPTY_PIGMENT_JAR);
        int magenta = inventory.count(FBItems.MAGENTA_PIGMENT_JAR);
        int blue = inventory.count(FBItems.BLUE_PIGMENT_JAR);
        int white = inventory.count(FBItems.WHITE_PIGMENT_JAR);
        int orange = inventory.count(FBItems.ORANGE_PIGMENT_JAR);
        int red = inventory.count(FBItems.RED_PIGMENT_JAR);
        int yellow = inventory.count(FBItems.YELLOW_PIGMENT_JAR);
        int lightBlue = inventory.count(FBItems.LIGHT_BLUE_PIGMENT_JAR);
        int pink = inventory.count(FBItems.PINK_PIGMENT_JAR);
        int black = inventory.count(FBItems.BLACK_PIGMENT_JAR);
        int cyan = inventory.count(FBItems.CYAN_PIGMENT_JAR);
        return empty + magenta + blue + white + orange + red + yellow + lightBlue + pink + black + cyan;
    }
}
