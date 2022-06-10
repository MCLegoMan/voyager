package com.mclegoman.voyager;

import com.mclegoman.voyager.effects.ModEffects;
import com.mclegoman.voyager.enchantments.ModEnchantments;
import com.mclegoman.voyager.item.ModItems;
import com.mclegoman.voyager.util.ModLootTableModifiers;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main implements ModInitializer {
	public static final String MOD_ID = "voyager";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModLootTableModifiers.modifyLootTables();
		ModEnchantments.registerModEnchantments();
		ModEffects.registerEffects();
	}
}
