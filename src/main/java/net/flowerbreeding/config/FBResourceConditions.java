package net.flowerbreeding.config;

import net.fabricmc.fabric.api.resource.conditions.v1.ResourceConditionType;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceConditions;
import net.flowerbreeding.FlowerBreeding;
import net.minecraft.util.Identifier;

public class FBResourceConditions {
    private static final Identifier CRAFTABLE_TABLES = Identifier.of(FlowerBreeding.MOD_ID, "craftable_tables");
    public static final ResourceConditionType<CraftableTablesCondition> TABLES = ResourceConditionType.create(CRAFTABLE_TABLES, CraftableTablesCondition.CODEC);
    private static final Identifier CRAFTABLE_TROWELS = Identifier.of(FlowerBreeding.MOD_ID, "craftable_trowels");
    public static final ResourceConditionType<CraftableTrowelsCondition> TROWELS = ResourceConditionType.create(CRAFTABLE_TROWELS, CraftableTrowelsCondition.CODEC);
    private static final Identifier CRAFTABLE_JARS_AND_VIALS = Identifier.of(FlowerBreeding.MOD_ID, "craftable_jars_and_vials");
    public static final ResourceConditionType<CraftableJarsAndVialsCondition> JARS_AND_VIALS = ResourceConditionType.create(CRAFTABLE_JARS_AND_VIALS, CraftableJarsAndVialsCondition.CODEC);

    public static void init() {
        ResourceConditions.register(TABLES);
        ResourceConditions.register(TROWELS);
        ResourceConditions.register(JARS_AND_VIALS);
    }
}