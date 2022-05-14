package net.bump.custom_ores;

import net.bump.custom_ores.block.ModBlocks;
import net.bump.custom_ores.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomOres implements ModInitializer {
	public static final  String MOD_ID = "custom_ores";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
