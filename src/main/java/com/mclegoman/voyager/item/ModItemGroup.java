package com.mclegoman.voyager.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import static com.mclegoman.voyager.Main.MOD_ID;

public class ModItemGroup {
    public static final ItemGroup VOYAGER_ITEMS = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "voyager_items"),
            () -> new ItemStack(ModItems.INFUSED_GEM));
}
