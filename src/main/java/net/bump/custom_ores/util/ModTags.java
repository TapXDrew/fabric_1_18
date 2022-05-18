package net.bump.custom_ores.util;

import net.bump.custom_ores.CustomOres;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.Tag;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> METAL_DETECTOR_DETECTABLE_BLOCKS = createTag("metal_detector_detectable_blocks");
        private static TagKey<Block> createTag (String name) {
            return TagKey.of(Registry.BLOCK_KEY, new Identifier(CustomOres.MOD_ID, name));
        }

        private static TagKey<Block> createCommonTag (String name) {
            return TagKey.of(Registry.BLOCK_KEY, new Identifier("c", name));
        }
    }


    public static class Items {
        public static final TagKey<Item> MOONSTONE_BLOCK = createCommonTag("moonstone_blocks");
        public static final TagKey<Item> RAW_MOONSTONE_BLOCK = createCommonTag("raw_moonstone_blocks");
        public static final TagKey<Item> MOONSTONE_INGOT = createCommonTag("moonstone_ingots");
        public static final TagKey<Item> MOONSTONE_NUGGET = createCommonTag("moonstone_nuggets");
        public static final TagKey<Item> RAW_MOONSTONE = createCommonTag("raw_moonstones");

        public static final TagKey<Item> SUNSTONE_BLOCK = createCommonTag("sunstone_blocks");
        public static final TagKey<Item> RAW_SUNSTONE_BLOCK = createCommonTag("raw_sunstone_blocks");
        public static final TagKey<Item> SUNSTONE_INGOT = createCommonTag("sunstone_ingots");
        public static final TagKey<Item> SUNSTONE_NUGGET = createCommonTag("sunstone_nuggets");
        public static final TagKey<Item> RAW_SUNSTONE = createCommonTag("raw_sunstones");

        private static TagKey<Item> createTag (String name) {
            return TagKey.of(Registry.ITEM_KEY, new Identifier(CustomOres.MOD_ID, name));
        }

        private static TagKey<Item> createCommonTag (String name) {
            return TagKey.of(Registry.ITEM_KEY, new Identifier("c", name));
        }
    }

}
