package net.element.elementiummodpartone_theelements.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.element.elementiummodpartone_theelements.init.Elementiummodpart1TheelementsModMobEffects;

public class ElementnatureArmorBodyTickEventProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(Elementiummodpart1TheelementsModMobEffects.POISON_RESISTANCE.get(), 10, 2, (false), (false)));
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.LUCK, 10, 1, (false), (false)));
	}
}
