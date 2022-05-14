package net.bump.custom_ores.block;

import net.bump.custom_ores.CustomOres;
import net.bump.custom_ores.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block SHDAOWSTONE_BLOCK = registerBlock("shadowstone_block",
            new Block(FabricBlockSettings.of(Material.METAL)
                    .strength(6f)
                    .requiresTool()
            ), ModItemGroup.shadowstone);
    public static final Block RAW_SHDAOWSTONE_BLOCK = registerBlock("raw_shadowstone_block",
            new Block(FabricBlockSettings.of(Material.METAL)
                    .strength(6f)
                    .requiresTool()
            ), ModItemGroup.shadowstone);

    public static final Block SHDAOWSTONE_ORE = registerBlock("shadowstone_ore",
            new Block(FabricBlockSettings.of(Material.STONE)
                    .strength(4.5f)
                    .requiresTool()
            ), ModItemGroup.shadowstone);
    public static final Block DEEPSLATE_SHDAOWSTONE_ORE = registerBlock("deepslate_shadowstone_ore",
            new Block(FabricBlockSettings.of(Material.STONE)
                    .strength(5f)
                    .requiresTool()
            ), ModItemGroup.shadowstone);
    public static final Block NETHERRACK_SHDAOWSTONE_ORE = registerBlock("netherrack_shadowstone_ore",
            new Block(FabricBlockSettings.of(Material.STONE)
                    .strength(5f)
                    .requiresTool()
            ), ModItemGroup.shadowstone);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(CustomOres.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(CustomOres.MOD_ID, name), new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        CustomOres.LOGGER.info("Registering Mod Blocks for " + CustomOres.MOD_ID);
    }

}
