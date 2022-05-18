package net.bump.custom_ores.item;

import net.bump.custom_ores.CustomOres;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup MOONSTONE = FabricItemGroupBuilder.build(new Identifier(CustomOres.MOD_ID, "moonstone"),
            () -> new ItemStack(ModItems.MOONSTONE_INGOT));

    public static final ItemGroup SUNSTONE = FabricItemGroupBuilder.build(new Identifier(CustomOres.MOD_ID, "sunstone"),
            () -> new ItemStack(ModItems.SUNSTONE_INGOT));
}
