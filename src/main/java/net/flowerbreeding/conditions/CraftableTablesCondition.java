package net.flowerbreeding.conditions;

import com.mojang.serialization.MapCodec;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceConditionType;
import net.flowerbreeding.FlowerBreeding;
import net.minecraft.registry.RegistryOps;
import net.minecraft.registry.RegistryWrapper;
import org.jetbrains.annotations.Nullable;

public class CraftableTablesCondition implements ResourceCondition {
    public static final MapCodec<CraftableTablesCondition> CODEC = MapCodec.unit(CraftableTablesCondition::new);

    @Override
    public ResourceConditionType<?> getType() {
        return FBResourceConditions.TABLES;
    }

    @Override
    public boolean test(RegistryOps.@Nullable RegistryInfoGetter registryInfoGetter) {
        return FlowerBreeding.CONFIG.craftableBotanyTables();
    }
}