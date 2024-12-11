package net.flowerbreeding;

import net.fabricmc.api.ModInitializer;
import net.flowerbreeding.conditions.FBResourceConditions;
import net.flowerbreeding.villagers.FBVillagers;
import net.flowerbreeding.villagers.FBVillagerTrades;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FlowerBreeding implements ModInitializer {
	public static final String MOD_ID = "flowerbreeding";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	//public static final net.flowerbreeding.FBConfig CONFIG = net.flowerbreeding.FBConfig.createAndLoad();


	@Override
	public void onInitialize() {
		FBItemGroup.registerItemGroups();
		FBBlocks.registerModBlocks();
		FBItems.registerModItems();
		FBBlockEntities.registerBlockEntities();
		FBScreenHandlers.registerScreenHandlers();
		FBRecipes.registerRecipes();
		FBVillagers.registerVillagers();
		FBVillagerTrades.registerTrades();
		//FBResourceConditions.init();
		Instance.init();
	}
}