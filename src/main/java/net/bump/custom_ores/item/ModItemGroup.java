package net.bump.custom_ores.item;

import net.bump.custom_ores.CustomOres;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup MYTHRIL = FabricItemGroupBuilder.build(new Identifier(CustomOres.MOD_ID, "mythril"),
            () -> new ItemStack(ModItems.MYTHRIL_INGOT));
}
