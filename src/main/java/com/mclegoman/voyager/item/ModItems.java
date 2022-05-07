package com.mclegoman.voyager.item;

import com.mclegoman.voyager.Main;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import static com.mclegoman.voyager.Main.MOD_ID;

public class ModItems {

    public static final Item INFUSED_GEM_SHARD = registerItem("infused_gem_shard",
            new GemItem(new FabricItemSettings().group(ModItemGroup.VOYAGER_ITEMS)));

    public static final Item INFUSED_GEM = registerItem("infused_gem",
            new GemItem(new FabricItemSettings().group(ModItemGroup.VOYAGER_ITEMS)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MOD_ID, name), item);
    }

    public static void registerModItems() {
        Main.LOGGER.info("Registering Items for Mod:", MOD_ID);
    }

}
