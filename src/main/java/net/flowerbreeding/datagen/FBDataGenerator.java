package net.flowerbreeding.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.flowerbreeding.datagen.villager.FBPOITagProvider;
import net.flowerbreeding.datagen.villager.FBTradeSets;
import net.flowerbreeding.datagen.villager.FBVillagerTradeTags;
import net.flowerbreeding.datagen.villager.FBVillagerTrades;
import net.flowerbreeding.trim.FBArmourTrims;
import net.flowerbreeding.world.feature.FBConfiguredFeatures;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;

public class FBDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
				FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(FBBlockTagProvider::new);
		pack.addProvider(FBItemTagProvider::new);
		pack.addProvider(FBModelProvider::new);
		pack.addProvider(FBLootTableGenerator::new);
		pack.addProvider(FBVillagerTradeTags::new);
		pack.addProvider(FBPOITagProvider::new);
		pack.addProvider(FBRecipeGenerator::new);
		pack.addProvider(FBRegistryDataGenerator::new);
	}

	@Override
	public void buildRegistry(RegistrySetBuilder registryBuilder) {
		registryBuilder.add(Registries.TRIM_PATTERN, FBArmourTrims::bootstrap);
		registryBuilder.add(Registries.CONFIGURED_FEATURE, FBConfiguredFeatures::bootstrap);
		registryBuilder.add(Registries.VILLAGER_TRADE, FBVillagerTrades::bootstrap);
		registryBuilder.add(Registries.TRADE_SET, FBTradeSets::bootstrap);
	}
}
