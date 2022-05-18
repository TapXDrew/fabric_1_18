package net.bump.custom_ores.item;

import net.bump.custom_ores.CustomOres;
import net.bump.custom_ores.item.custom.MetalDetectorItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.item.Item;


public class ModItems {
    public static final Item MOONSTONE_INGOT = registerItem("moonstone_ingot", new Item(new FabricItemSettings()
            .group(ModItemGroup.MOONSTONE)
    ));

    public static final Item MOONSTONE_NUGGET = registerItem("moonstone_nugget", new Item(new FabricItemSettings()
            .group(ModItemGroup.MOONSTONE)
    ));

    public static final Item RAW_MOONSTONE = registerItem("raw_moonstone", new Item(new FabricItemSettings()
            .group(ModItemGroup.MOONSTONE)
    ));

    public static final Item SUNSTONE_INGOT = registerItem("sunstone_ingot", new Item(new FabricItemSettings()
            .group(ModItemGroup.SUNSTONE)
    ));

    public static final Item SUNSTONE_NUGGET = registerItem("sunstone_nugget", new Item(new FabricItemSettings()
            .group(ModItemGroup.SUNSTONE)
    ));

    public static final Item RAW_SUNSTONE = registerItem("raw_sunstone", new Item(new FabricItemSettings()
            .group(ModItemGroup.SUNSTONE)
    ));

    public static final Item METAL_DETECTOR = registerItem("metal_detector", new MetalDetectorItem(new FabricItemSettings()
            .group(ModItemGroup.MOONSTONE)
            .maxDamage(16)
    ));

    public static final Item LILAC_FLOWER_BULB = registerItem("lilac_flower_bulb", new Item(new FabricItemSettings()
            .group(ModItemGroup.MOONSTONE)
    ));

    public static final Item GRAPE = registerItem("grape", new Item(new FabricItemSettings()
            .group(ModItemGroup.MOONSTONE)
            .food(ModFoodComponents.GRAPE)
    ));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(CustomOres.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CustomOres.LOGGER.info("Registering Mod Items for " + CustomOres.MOD_ID);
    }

}
