package net.bump.custom_ores.item;

import net.bump.custom_ores.CustomOres;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.item.Item;


public class ModItems {
    public static final Item MYTHRIL_INGOT = registerItem("mythril_ingot", new Item(new FabricItemSettings()
            .group(ModItemGroup.MYTHRIL)
    ));

    public static final Item MYTHRIL_NUGGET = registerItem("mythril_nugget", new Item(new FabricItemSettings()
            .group(ModItemGroup.MYTHRIL)
    ));

    public static final Item RAW_MYTHRIL = registerItem("raw_mythril", new Item(new FabricItemSettings()
            .group(ModItemGroup.MYTHRIL)
    ));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(CustomOres.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CustomOres.LOGGER.info("Registering Mod Items for " + CustomOres.MOD_ID);
    }

}
