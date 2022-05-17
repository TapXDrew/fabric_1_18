package net.bump.custom_ores;

import net.bump.custom_ores.block.ModBlocks;
import net.bump.custom_ores.item.ModItems;
import net.bump.custom_ores.util.ModRegistries;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.AutoInvokingEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomOres implements ModInitializer {
	public static final  String MOD_ID = "custom_ores";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModRegistries.registerModItems();
	}

	public static String fString(String s, Map<String, Object> data){
		Matcher matcher = Pattern.compile("\\{(.*?)\\}").matcher(s);

		while(matcher.find()){
			Object value = data.get(matcher.group(1));
			if(value != null) {
				s = s.replace(matcher.group(0), value.toString());
			}
		}
		return s;
	}
}
