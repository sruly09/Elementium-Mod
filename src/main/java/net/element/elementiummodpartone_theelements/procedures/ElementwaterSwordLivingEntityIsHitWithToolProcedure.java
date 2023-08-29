package net.element.elementiummodpartone_theelements.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

public class ElementwaterSwordLivingEntityIsHitWithToolProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("minecraft:blaze,ghast,thoglin,magmacube,piglin,piglin brute,strider,witherskeleton,zoglin,zombifiedpiglin")))) {
			entity.hurt(DamageSource.HOT_FLOOR, 5);
		}
	}
}
