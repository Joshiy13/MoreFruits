package dev.joshiy13;

import dev.joshiy13.block.ModBlocks;
import dev.joshiy13.item.ModItemGroups;
import dev.joshiy13.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreFruits implements ModInitializer {
	public static final String MOD_ID = "morefruits";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}