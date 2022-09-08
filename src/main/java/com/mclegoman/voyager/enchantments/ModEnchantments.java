package com.mclegoman.voyager.enchantments;

import com.mclegoman.voyager.Main;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.mclegoman.voyager.Main.MOD_ID;

public class ModEnchantments {
    public static Enchantment TOUCH_OF_INABILITY = register("touch_of_inability",
            new TouchOfInabilityEnchantment(Enchantment.Rarity.RARE,
                    EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));

    private static Enchantment register(String name, Enchantment enchantment) {
        return Registry.register(Registry.ENCHANTMENT, new Identifier(MOD_ID, name), enchantment);
    }

    public static void registerModEnchantments() {
        Main.LOGGER.info("Registering Enchantments for Mod:", MOD_ID);
    }

}
