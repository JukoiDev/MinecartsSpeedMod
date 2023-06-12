package me.awli.mixin;

import net.minecraft.entity.vehicle.AbstractMinecartEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(AbstractMinecartEntity.class)
public class MinecartMixin {
	@Inject(at = @At("HEAD"), method = "getMaxSpeed()D", cancellable = true)
	private void getMaxSpeed(CallbackInfoReturnable<Double> info) {
		info.setReturnValue(64000.0 / 20.0); // Default max speed while on land is 8.0 / 20.0
	}
}