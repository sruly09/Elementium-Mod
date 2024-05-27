
package net.element.elementiummod.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.element.elementiummod.procedures.PoisonResistanceOnEffectActiveTickProcedure;

public class PoisonResistanceMobEffect extends MobEffect {
	public PoisonResistanceMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -16098018);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		PoisonResistanceOnEffectActiveTickProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
