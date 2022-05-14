package net.bump.custom_ores.item;

import net.bump.custom_ores.CustomOres;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup shadowstone = FabricItemGroupBuilder.build(new Identifier(CustomOres.MOD_ID, "shadowstone"),
            () -> new ItemStack(ModItems.SHDAOWSTONE_INGOT));
}
