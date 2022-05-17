package net.bump.custom_ores.util;

import net.bump.custom_ores.CustomOres;
import net.bump.custom_ores.item.ModItems;
import net.fabricmc.fabric.api.registry.FuelRegistry;

public class ModRegistries {

    public static void registerModItems() {
        registerFuels();
    }

    private static void registerFuels() {
        CustomOres.LOGGER.info("Registering Fuels for " + CustomOres.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.LILAC_FLOWER_BULB, 200);

    }
}
