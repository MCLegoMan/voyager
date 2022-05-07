package com.mclegoman.voyager.sound;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.mclegoman.voyager.Main.MOD_ID;

public class ModSounds {

    public static SoundEvent UPGRADE = registerSoundEvent("upgrade");
    public static SoundEvent ABILITY = registerSoundEvent("ability");
    public static SoundEvent SHOOT = registerSoundEvent("shoot");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }
}
