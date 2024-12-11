package net.flowerbreeding.conditions;

import net.fabricmc.fabric.api.resource.conditions.v1.ResourceConditionType;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceConditions;
import net.flowerbreeding.FlowerBreeding;
import net.minecraft.util.Identifier;

public class FBResourceConditions {
    private static final Identifier CRAFTABLE_TABLES = Identifier.of(FlowerBreeding.MOD_ID, "craftable_tables");
    //public static final ResourceConditionType<CraftableTablesCondition> TABLES = ResourceConditionType.create(CRAFTABLE_TABLES, CraftableTablesCondition.CODEC);

    //public static void init() {
        //ResourceConditions.register(TABLES);
    //}
}