package com.mclegoman.voyager.util;

//import com.mclegoman.voyager.registry.ModItems;
//import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
//import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
//import net.minecraft.item.Items;
//import net.minecraft.loot.condition.RandomChanceLootCondition;
//import net.minecraft.loot.entry.ItemEntry;
//import net.minecraft.loot.function.LootFunction;
//import net.minecraft.loot.function.SetCountLootFunction;
//import net.minecraft.loot.function.SetEnchantmentsLootFunction;
//import net.minecraft.loot.function.SetNbtLootFunction;
//import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
//import net.minecraft.loot.provider.number.UniformLootNumberProvider;
//import net.minecraft.util.Identifier;

public class ModLootTableModifiers {

//    private static final Identifier STRONGHOLD_CORRIDOR_STRUCTURE_CHEST_ID
//            = new Identifier("minecraft", "chests/stronghold_corridor");

//    private static final Identifier STRONGHOLD_CROSSING_STRUCTURE_CHEST_ID
//            = new Identifier("minecraft", "chests/stronghold_crossing");

//    private static final Identifier STRONGHOLD_LIBRARY_STRUCTURE_CHEST_ID
//            = new Identifier("minecraft", "chests/stronghold_library");

//    public static void modifyLootTables() {
//        LootTableLoadingCallback.EVENT.register((resourceManager, manager, id, supplier, setter) -> {
//            if(STRONGHOLD_CORRIDOR_STRUCTURE_CHEST_ID.equals(id)) {
//                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
//                        .rolls(ConstantLootNumberProvider.create(1))
//                        .conditionally(RandomChanceLootCondition.builder(1.0f))
//                        .with(ItemEntry.builder(ModItems.INFUSED_GEM_SHARD))
//                        .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(6.0f, 9.0f)).build());
//                supplier.withPool(poolBuilder.build());
//            }
//            if(STRONGHOLD_CROSSING_STRUCTURE_CHEST_ID.equals(id)) {
//                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
//                        .rolls(ConstantLootNumberProvider.create(1))
//                        .conditionally(RandomChanceLootCondition.builder(1.0f))
//                        .with(ItemEntry.builder(ModItems.INFUSED_GEM_SHARD))
//                        .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(6.0f, 9.0f)).build());
//                supplier.withPool(poolBuilder.build());
//            }
//            if(STRONGHOLD_LIBRARY_STRUCTURE_CHEST_ID.equals(id)) {
//                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
//                        .rolls(ConstantLootNumberProvider.create(1))
//                        .conditionally(RandomChanceLootCondition.builder(1.0f))
//                        .with(ItemEntry.builder(Items.ENCHANTED_BOOK))
//                        .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
//                supplier.withPool(poolBuilder.build());
//            }
//        });
//    }
}