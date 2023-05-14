
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.element.elementiummod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.element.elementiummod.block.FireEssenceOreBlock;
import net.element.elementiummod.block.ElementiumOreBlock;
import net.element.elementiummod.block.ElementiumBlockBlock;
import net.element.elementiummod.block.AirEssenceOreBlock;
import net.element.elementiummod.ElementiumModMod;

public class ElementiumModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ElementiumModMod.MODID);
	public static final RegistryObject<Block> ELEMENTIUM_BLOCK = REGISTRY.register("elementium_block", () -> new ElementiumBlockBlock());
	public static final RegistryObject<Block> ELEMENTIUM_ORE = REGISTRY.register("elementium_ore", () -> new ElementiumOreBlock());
	public static final RegistryObject<Block> FIRE_ESSENCE_ORE = REGISTRY.register("fire_essence_ore", () -> new FireEssenceOreBlock());
	public static final RegistryObject<Block> AIR_ESSENCE_ORE = REGISTRY.register("air_essence_ore", () -> new AirEssenceOreBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
			ElementiumBlockBlock.blockColorLoad(event);
		}

		@SubscribeEvent
		public static void itemColorLoad(RegisterColorHandlersEvent.Item event) {
			ElementiumBlockBlock.itemColorLoad(event);
		}
	}
}
