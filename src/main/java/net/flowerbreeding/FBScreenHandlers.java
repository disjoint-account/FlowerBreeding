package net.flowerbreeding;

import net.flowerbreeding.botanytable.BotanyTableScreenHandler;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.resource.featuretoggle.FeatureFlags;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class FBScreenHandlers {
    public static final ScreenHandlerType<BotanyTableScreenHandler> BOTANY_TABLE_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(FlowerBreeding.MOD_ID, "botany_table_screen_handler"),
                    new ScreenHandlerType<>(BotanyTableScreenHandler::new, FeatureFlags.VANILLA_FEATURES));

    public static void registerScreenHandlers() {
        FlowerBreeding.LOGGER.info("Registering Screen Handlers for " + FlowerBreeding.MOD_ID);
    }
}

