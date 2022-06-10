package com.mclegoman.voyager.effects;

import com.mclegoman.voyager.Main;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.mclegoman.voyager.Main.MOD_ID;

public class ModEffects {
    public static StatusEffect INABILITY;
    public static StatusEffect UPGRADING;
    public static StatusEffect POWERED;

    public static StatusEffect registerInabilityEffect(String name) {
        return Registry.register(Registry.STATUS_EFFECT, new Identifier(MOD_ID, name),
                new BlankEffect(StatusEffectCategory.HARMFUL, 0xFA113D));
    }

    public static StatusEffect registerUpgradingEffect(String name) {
        return Registry.register(Registry.STATUS_EFFECT, new Identifier(MOD_ID, name),
                new BlankEffect(StatusEffectCategory.BENEFICIAL, 0x4BB543));
    }

    public static StatusEffect registerPoweredEffect(String name) {
        return Registry.register(Registry.STATUS_EFFECT, new Identifier(MOD_ID, name),
                new BlankEffect(StatusEffectCategory.NEUTRAL, 0x310047));
    }

    public static void registerEffects() {
        Main.LOGGER.info("Registering Effects for Mod:", MOD_ID);
        INABILITY = registerInabilityEffect("inability");
        UPGRADING = registerUpgradingEffect("upgrading");
        POWERED = registerUpgradingEffect("powered");
    }
}
