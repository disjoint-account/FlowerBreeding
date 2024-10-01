package net.flowerbreeding;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FlowerBreeding implements ModInitializer {
	public static final String MOD_ID = "flowerbreeding";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		FBItemGroup.registerItemGroups();
		FBBlocks.registerModBlocks();
		FBItems.registerModItems();
		Instance.init();
	}
}