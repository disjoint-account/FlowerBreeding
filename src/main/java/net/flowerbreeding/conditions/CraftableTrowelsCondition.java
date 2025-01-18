package net.flowerbreeding.conditions;

import com.mojang.serialization.MapCodec;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceConditionType;
import net.flowerbreeding.FlowerBreeding;
import net.minecraft.registry.RegistryOps;
import org.jetbrains.annotations.Nullable;

public class CraftableTrowelsCondition implements ResourceCondition {
    public static final MapCodec<CraftableTrowelsCondition> CODEC = MapCodec.unit(CraftableTrowelsCondition::new);

    @Override
    public ResourceConditionType<?> getType() {
        return FBResourceConditions.TROWELS;
    }

    @Override
    public boolean test(RegistryOps.@Nullable RegistryInfoGetter registryInfoGetter) {
        return FlowerBreeding.CONFIG.craftableTrowels();
    }
}