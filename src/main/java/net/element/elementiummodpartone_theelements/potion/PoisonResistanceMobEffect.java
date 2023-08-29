
package net.element.elementiummodpartone_theelements.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.element.elementiummodpartone_theelements.procedures.PoisonResistanceOnEffectActiveTickProcedure;

public class PoisonResistanceMobEffect extends MobEffect {
	public PoisonResistanceMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -16098018);
	}

	@Override
	public String getDescriptionId() {
		return "effect.elementiummodpart1_theelements.poison_resistance";
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
