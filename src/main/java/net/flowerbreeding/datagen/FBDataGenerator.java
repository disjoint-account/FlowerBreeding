package net.flowerbreeding.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.flowerbreeding.trim.FBArmourTrims;
import net.flowerbreeding.world.feature.FBConfiguredFeatures;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class FBDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
				FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(FBBlockTagProvider::new);
		pack.addProvider(FBItemTagProvider::new);
		pack.addProvider(FBModelProvider::new);
		pack.addProvider(FBLootTableGenerator::new);
		pack.addProvider(FBPOITagProvider::new);
		pack.addProvider(FBRecipeGenerator::new);
		pack.addProvider(FBRegistryDataGenerator::new);
		pack.addProvider(FBWorldGenerator::new);
	}

	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {
		registryBuilder.addRegistry(RegistryKeys.TRIM_PATTERN, FBArmourTrims::bootstrap);
		registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, FBConfiguredFeatures::bootstrap);
	}
}
