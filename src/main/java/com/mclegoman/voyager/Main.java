package com.mclegoman.voyager;

import com.mclegoman.voyager.enchantments.ModEnchantments;
import com.mclegoman.voyager.registry.ModBlocks;
import com.mclegoman.voyager.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main implements ModInitializer {
	public static final String MOD_ID = "voyager";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		//ModLootTableModifiers.modifyLootTables();
		ModEnchantments.registerModEnchantments();
	}
}