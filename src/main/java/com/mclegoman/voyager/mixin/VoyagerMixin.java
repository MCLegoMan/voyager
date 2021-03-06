package com.mclegoman.voyager.mixin;

import com.mclegoman.voyager.Main;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static com.mclegoman.voyager.Main.MOD_ID;

@Mixin(TitleScreen.class)
public class VoyagerMixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		Main.LOGGER.info("Registering Mixin for MOD:", MOD_ID);
	}
}
