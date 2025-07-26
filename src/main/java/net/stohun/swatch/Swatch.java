package net.stohun.swatch;

import net.fabricmc.api.ModInitializer;

import net.stohun.swatch.block.ModBlocks;
import net.stohun.swatch.item.ModItemGroups;
import net.stohun.swatch.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Swatch implements ModInitializer {
	public static final String MOD_ID = "swatch";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}