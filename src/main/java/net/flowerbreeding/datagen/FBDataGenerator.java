package net.flowerbreeding.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class FBDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
				FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(FBBlockTagProvider::new);
		pack.addProvider(FBItemTagProvider::new);
		pack.addProvider(FBModelProvider::new);
		pack.addProvider(FBLootTableGenerator::new);
		pack.addProvider(FBPOITagProvider::new);

	}
}
