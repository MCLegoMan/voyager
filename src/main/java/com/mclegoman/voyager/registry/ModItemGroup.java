package com.mclegoman.voyager.registry;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import static com.mclegoman.voyager.Main.MOD_ID;

public class ModItemGroup {

    public static final ItemGroup VOYAGER_ITEMS = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "voyager_items"),
            () -> new ItemStack(ModItems.INFUSED_GEM));

    public static final ItemGroup VOYAGER_BLOCKS = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "voyager_blocks"),
            () -> new ItemStack(ModBlocks.INFUSED_GEM_BLOCK));

}
