package net.flowerbreeding;

import net.flowerbreeding.botanytable.BotanyTableScreenHandler;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.resources.Identifier;

public class FBScreenHandlers {
    public static final MenuType<BotanyTableScreenHandler> BOTANY_TABLE_SCREEN_HANDLER =
            Registry.register(BuiltInRegistries.MENU, Identifier.fromNamespaceAndPath(FlowerBreeding.MOD_ID, "botany_table_screen_handler"),
                    new MenuType<>(BotanyTableScreenHandler::new, FeatureFlags.VANILLA_SET));

    public static void registerScreenHandlers() {
        FlowerBreeding.LOGGER.info("Registering Screen Handlers for " + FlowerBreeding.MOD_ID);
    }
}

