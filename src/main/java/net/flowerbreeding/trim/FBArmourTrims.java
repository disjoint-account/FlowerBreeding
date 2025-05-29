package net.flowerbreeding.trim;

import net.flowerbreeding.FlowerBreeding;
import net.minecraft.item.equipment.trim.ArmorTrimPattern;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

public class FBArmourTrims {
    public static final RegistryKey<ArmorTrimPattern> FLORAL = RegistryKey.of(RegistryKeys.TRIM_PATTERN, Identifier.of(FlowerBreeding.MOD_ID, "floral"));

    public static void bootstrap(Registerable<ArmorTrimPattern> context) {
        register(context, FLORAL);
    }

    private static void register(Registerable<ArmorTrimPattern> context, RegistryKey<ArmorTrimPattern> key) {
        ArmorTrimPattern trimPattern = new ArmorTrimPattern(key.getValue(),
                Text.translatable(Util.createTranslationKey("trim_pattern", key.getValue())), false);
        context.register(key, trimPattern);
    }
}