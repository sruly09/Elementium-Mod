package net.element.elementiummodpartone_theelements.procedures;

import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;

public class TheBlazingLeavesBlockDestroyedByPlayerProcedure {
	public static void execute(LevelAccessor world) {
		if (!world.isClientSide() && world.getServer() != null) {
			for (ItemStack itemstackiterator : world.getServer().getLootTables().get(new ResourceLocation("minecraft:blocks/the_flaming_leaves")).getRandomItems(new LootContext.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
			}
		}
	}
}
