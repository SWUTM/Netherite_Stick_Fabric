package net.swutm.netheritestick;

import net.fabricmc.api.ModInitializer;
import net.swutm.netheritestick.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class netheritestick implements ModInitializer {
	public static final String MOD_ID = "netheritestick";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();

	}
}
