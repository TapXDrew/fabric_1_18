package net.bump.custom_ores.item;

import net.bump.custom_ores.CustomOres;
import net.bump.custom_ores.item.custom.MetalDetectorItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.item.Item;


public class ModItems {
    public static final Item SHDAOWSTONE_INGOT = registerItem("moonstone_ingot", new Item(new FabricItemSettings()
            .group(ModItemGroup.MOONSTONE)
    ));

    public static final Item SHDAOWSTONE_NUGGET = registerItem("moonstone_nugget", new Item(new FabricItemSettings()
            .group(ModItemGroup.MOONSTONE)
    ));

    public static final Item RAW_SHDAOWSTONE = registerItem("raw_moonstone", new Item(new FabricItemSettings()
            .group(ModItemGroup.MOONSTONE)
    ));

    public static final Item METAL_DETECTOR = registerItem("metal_detector", new MetalDetectorItem(new FabricItemSettings()
            .group(ModItemGroup.MOONSTONE)
            .maxDamage(16)
    ));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(CustomOres.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CustomOres.LOGGER.info("Registering Mod Items for " + CustomOres.MOD_ID);
    }

}
