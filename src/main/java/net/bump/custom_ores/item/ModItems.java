package net.bump.custom_ores.item;

import net.bump.custom_ores.CustomOres;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.item.Item;


public class ModItems {
    public static final Item SHDAOWSTONE_INGOT = registerItem("shadowstone_ingot", new Item(new FabricItemSettings()
            .group(ModItemGroup.shadowstone)
    ));

    public static final Item SHDAOWSTONE_NUGGET = registerItem("shadowstone_nugget", new Item(new FabricItemSettings()
            .group(ModItemGroup.shadowstone)
    ));

    public static final Item RAW_SHDAOWSTONE = registerItem("raw_shadowstone", new Item(new FabricItemSettings()
            .group(ModItemGroup.shadowstone)
    ));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(CustomOres.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CustomOres.LOGGER.info("Registering Mod Items for " + CustomOres.MOD_ID);
    }

}
