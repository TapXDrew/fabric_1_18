package net.bump.custom_ores.block;

import net.bump.custom_ores.CustomOres;
import net.bump.custom_ores.block.custom.ModPressurePlateBlock;
import net.bump.custom_ores.block.custom.ModStoneButtonBlock;
import net.bump.custom_ores.block.custom.MoonstoneBlock;
import net.bump.custom_ores.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ModBlocks {
    public static final Block MOONSTONE_BLOCK = registerBlock("moonstone_block",
            new MoonstoneBlock(FabricBlockSettings.of(Material.METAL)
                    .strength(6f)
                    .requiresTool()
            ), ModItemGroup.MOONSTONE);
    public static final Block RAW_MOONSTONE_BLOCK = registerBlock("raw_moonstone_block",
            new Block(FabricBlockSettings.of(Material.METAL)
                    .strength(6f)
                    .requiresTool()
            ), ModItemGroup.MOONSTONE);
    public static final Block MOONSTONE_ORE = registerBlock("moonstone_ore",
            new Block(FabricBlockSettings.of(Material.STONE)
                    .strength(4.5f)
                    .requiresTool()
            ), ModItemGroup.MOONSTONE);
    public static final Block DEEPSLATE_MOONSTONE_ORE = registerBlock("deepslate_moonstone_ore",
            new Block(FabricBlockSettings.of(Material.STONE)
                    .strength(5f)
                    .requiresTool()
            ), ModItemGroup.MOONSTONE);
    public static final Block NETHERRACK_MOONSTONE_ORE = registerBlock("netherrack_moonstone_ore",
            new Block(FabricBlockSettings.of(Material.STONE)
                    .strength(5f)
                    .requiresTool()
            ), ModItemGroup.MOONSTONE);
    public static final Block MOONSTONE_BUTTON = registerBlock("moonstone_button",
            new ModStoneButtonBlock(FabricBlockSettings.of(Material.METAL)
                    .strength(4f)
                    .requiresTool()
                    .noCollision()
            ), ModItemGroup.MOONSTONE);
    public static final Block MOONSTONE_PRESSURE_PLATE = registerBlock("moonstone_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.of(Material.METAL)
                    .strength(4f)
                    .requiresTool()
            ), ModItemGroup.MOONSTONE);
    public static final Block MOONSTONE_FENCE = registerBlock("moonstone_fence",
            new FenceBlock(FabricBlockSettings.of(Material.METAL)
                    .strength(4f)
                    .requiresTool()
            ), ModItemGroup.MOONSTONE);
    public static final Block MOONSTONE_FENCE_GATE = registerBlock("moonstone_fence_gate",
            new FenceGateBlock(FabricBlockSettings.of(Material.METAL)
                    .strength(4f)
                    .requiresTool()
            ), ModItemGroup.MOONSTONE);
    public static final Block MOONSTONE_WALL = registerBlock("moonstone_wall",
            new WallBlock(FabricBlockSettings.of(Material.METAL)
                    .strength(4f)
                    .requiresTool()
            ), ModItemGroup.MOONSTONE);


    public static final Block SUNSTONE_BLOCK = registerBlock("sunstone_block",
            new MoonstoneBlock(FabricBlockSettings.of(Material.METAL)
                    .strength(6f)
                    .requiresTool()
            ), ModItemGroup.SUNSTONE);
    public static final Block RAW_SUNSTONE_BLOCK = registerBlock("raw_sunstone_block",
            new Block(FabricBlockSettings.of(Material.METAL)
                    .strength(6f)
                    .requiresTool()
            ), ModItemGroup.SUNSTONE);
    public static final Block SUNSTONE_ORE = registerBlock("sunstone_ore",
            new Block(FabricBlockSettings.of(Material.STONE)
                    .strength(4.5f)
                    .requiresTool()
            ), ModItemGroup.SUNSTONE);
    public static final Block DEEPSLATE_SUNSTONE_ORE = registerBlock("deepslate_sunstone_ore",
            new Block(FabricBlockSettings.of(Material.STONE)
                    .strength(5f)
                    .requiresTool()
            ), ModItemGroup.SUNSTONE);
    public static final Block NETHERRACK_SUNSTONE_ORE = registerBlock("netherrack_sunstone_ore",
            new Block(FabricBlockSettings.of(Material.STONE)
                    .strength(5f)
                    .requiresTool()
            ), ModItemGroup.SUNSTONE);
    public static final Block SUNSTONE_BUTTON = registerBlock("sunstone_button",
            new ModStoneButtonBlock(FabricBlockSettings.of(Material.METAL)
                    .strength(4f)
                    .requiresTool()
                    .noCollision()
            ), ModItemGroup.SUNSTONE);
    public static final Block SUNSTONE_PRESSURE_PLATE = registerBlock("sunstone_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.of(Material.METAL)
                    .strength(4f)
                    .requiresTool()
            ), ModItemGroup.SUNSTONE);
    public static final Block SUNSTONE_FENCE = registerBlock("sunstone_fence",
            new FenceBlock(FabricBlockSettings.of(Material.METAL)
                    .strength(4f)
                    .requiresTool()
            ), ModItemGroup.SUNSTONE);
    public static final Block SUNSTONE_FENCE_GATE = registerBlock("sunstone_fence_gate",
            new FenceGateBlock(FabricBlockSettings.of(Material.METAL)
                    .strength(4f)
                    .requiresTool()
            ), ModItemGroup.SUNSTONE);
    public static final Block SUNSTONE_WALL = registerBlock("sunstone_wall",
            new WallBlock(FabricBlockSettings.of(Material.METAL)
                    .strength(4f)
                    .requiresTool()
            ), ModItemGroup.SUNSTONE);


    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(CustomOres.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block, ItemGroup group) {
        Registry.register(Registry.ITEM, new Identifier(CustomOres.MOD_ID, name), new BlockItem(block, new FabricItemSettings().group(group)));
    }

    private static Block registerBlock(String name, Block block, ItemGroup group, String tooltipkey) {
        registerBlockItem(name, block, group, tooltipkey);
        return Registry.register(Registry.BLOCK, new Identifier(CustomOres.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block, ItemGroup group, String tooltipkey) {
        Registry.register(Registry.ITEM, new Identifier(CustomOres.MOD_ID, name),
            new BlockItem(block, new FabricItemSettings().group(group)){
                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText(tooltipkey));
                }
            });
    }

    public static void registerModBlocks() {
        CustomOres.LOGGER.info("Registering Mod Blocks for " + CustomOres.MOD_ID);
    }

}
