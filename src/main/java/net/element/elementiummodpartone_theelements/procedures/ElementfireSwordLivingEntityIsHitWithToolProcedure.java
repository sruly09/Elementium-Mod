package net.element.elementiummodpartone_theelements.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

public class ElementfireSwordLivingEntityIsHitWithToolProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		ItemStack ElementFireSword = ItemStack.EMPTY;
		entity.setSecondsOnFire(15);
	}
}
