package com.mclegoman.voyager.registry;

import com.mclegoman.voyager.Main;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.Waterloggable;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.mclegoman.voyager.Main.MOD_ID;

public class ModBlocks implements Waterloggable {
    public static final Block INFUSED_GEM_BLOCK = registerBlock("infused_gem_block",
            new Block(FabricBlockSettings.of(Material.DECORATION).strength(20.0f).sounds(BlockSoundGroup.STONE).luminance(7)), ModItemGroup.VOYAGER_BLOCKS);


    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        Main.LOGGER.info("Registering Blocks for Mod:", MOD_ID);
    }
}
