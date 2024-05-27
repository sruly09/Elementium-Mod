
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.element.elementiummod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.element.elementiummod.ElementiummodMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ElementiummodModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ElementiummodMod.MODID);
	public static final RegistryObject<CreativeModeTab> ELEMENTIUM_TAB = REGISTRY.register("elementium_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.elementiummod.elementium_tab")).icon(() -> new ItemStack(ElementiummodModItems.ELEMONDIUM.get())).displayItems((parameters, tabData) -> {
				tabData.accept(ElementiummodModBlocks.ELEMENTIUM_BLOCK.get().asItem());
				tabData.accept(ElementiummodModBlocks.ELEMONDIUM_INFUSED_OBSIDIAN.get().asItem());
				tabData.accept(ElementiummodModItems.ELEMENTIUM_DIMENSION.get());
				tabData.accept(ElementiummodModBlocks.ELEMENTIUM_ORE.get().asItem());
				tabData.accept(ElementiummodModBlocks.FIRE_ESSENCE_ORE.get().asItem());
				tabData.accept(ElementiummodModBlocks.AIR_ESSENCE_ORE.get().asItem());
				tabData.accept(ElementiummodModBlocks.WATER_ESSENCE_ORE.get().asItem());
				tabData.accept(ElementiummodModBlocks.EARTH_ESSENCE_ORE.get().asItem());
				tabData.accept(ElementiummodModItems.ELEMONDIUM.get());
				tabData.accept(ElementiummodModItems.FIRE_ESSENCE.get());
				tabData.accept(ElementiummodModItems.AIR_ESSENCE.get());
				tabData.accept(ElementiummodModItems.WATER_ESSENCE.get());
				tabData.accept(ElementiummodModItems.EARTH_ESSENCE.get());
				tabData.accept(ElementiummodModItems.VOID_ESSENCE.get());
				tabData.accept(ElementiummodModItems.LIGHTNING_ESSENCE.get());
				tabData.accept(ElementiummodModItems.ICE_ESSENCE.get());
				tabData.accept(ElementiummodModItems.NATURE_ESSENCE.get());
				tabData.accept(ElementiummodModItems.ELEMENTIUM_ARMOR_HELMET.get());
				tabData.accept(ElementiummodModItems.ELEMENTIUM_ARMOR_CHESTPLATE.get());
				tabData.accept(ElementiummodModItems.ELEMENTIUM_ARMOR_LEGGINGS.get());
				tabData.accept(ElementiummodModItems.ELEMENTIUM_ARMOR_BOOTS.get());
				tabData.accept(ElementiummodModItems.ELEMENTFIRE_ARMOR_HELMET.get());
				tabData.accept(ElementiummodModItems.ELEMENTFIRE_ARMOR_CHESTPLATE.get());
				tabData.accept(ElementiummodModItems.ELEMENTFIRE_ARMOR_LEGGINGS.get());
				tabData.accept(ElementiummodModItems.ELEMENTFIRE_ARMOR_BOOTS.get());
				tabData.accept(ElementiummodModItems.ELEMENTAIR_ARMOR_HELMET.get());
				tabData.accept(ElementiummodModItems.ELEMENTAIR_ARMOR_CHESTPLATE.get());
				tabData.accept(ElementiummodModItems.ELEMENTAIR_ARMOR_LEGGINGS.get());
				tabData.accept(ElementiummodModItems.ELEMENTAIR_ARMOR_BOOTS.get());
				tabData.accept(ElementiummodModItems.ELEMENTWATER_HELMET.get());
				tabData.accept(ElementiummodModItems.ELEMENTWATER_CHESTPLATE.get());
				tabData.accept(ElementiummodModItems.ELEMENTWATER_LEGGINGS.get());
				tabData.accept(ElementiummodModItems.ELEMENTWATER_BOOTS.get());
				tabData.accept(ElementiummodModItems.ELEMENTEARTH_ARMOR_HELMET.get());
				tabData.accept(ElementiummodModItems.ELEMENTEARTH_ARMOR_CHESTPLATE.get());
				tabData.accept(ElementiummodModItems.ELEMENTEARTH_ARMOR_LEGGINGS.get());
				tabData.accept(ElementiummodModItems.ELEMENTEARTH_ARMOR_BOOTS.get());
				tabData.accept(ElementiummodModItems.ELEMENTVOID_ARMOR_HELMET.get());
				tabData.accept(ElementiummodModItems.ELEMENTVOID_ARMOR_CHESTPLATE.get());
				tabData.accept(ElementiummodModItems.ELEMENTVOID_ARMOR_LEGGINGS.get());
				tabData.accept(ElementiummodModItems.ELEMENTVOID_ARMOR_BOOTS.get());
				tabData.accept(ElementiummodModItems.ELEMENTICE_ARMOR_HELMET.get());
				tabData.accept(ElementiummodModItems.ELEMENTICE_ARMOR_CHESTPLATE.get());
				tabData.accept(ElementiummodModItems.ELEMENTICE_ARMOR_LEGGINGS.get());
				tabData.accept(ElementiummodModItems.ELEMENTICE_ARMOR_BOOTS.get());
				tabData.accept(ElementiummodModItems.ELEMENTNATURE_ARMOR_HELMET.get());
				tabData.accept(ElementiummodModItems.ELEMENTNATURE_ARMOR_CHESTPLATE.get());
				tabData.accept(ElementiummodModItems.ELEMENTNATURE_ARMOR_LEGGINGS.get());
				tabData.accept(ElementiummodModItems.ELEMENTNATURE_ARMOR_BOOTS.get());
				tabData.accept(ElementiummodModItems.ELEMONDIUM_SWORD.get());
				tabData.accept(ElementiummodModItems.ELEMENTIUM_PICKAXE.get());
				tabData.accept(ElementiummodModItems.ELEMENTIUM_AXE.get());
				tabData.accept(ElementiummodModItems.ELEMENTIUM_SHOVEL.get());
				tabData.accept(ElementiummodModItems.ELEMENTFIRE_SWORD.get());
				tabData.accept(ElementiummodModItems.ELEMENTFIRE_PAXEL.get());
				tabData.accept(ElementiummodModItems.ELEMENTFIRE_PICKAXE.get());
				tabData.accept(ElementiummodModItems.ELEMENTFIRE_AXE.get());
				tabData.accept(ElementiummodModItems.ELEMENTFIRE_SHOVEL.get());
				tabData.accept(ElementiummodModItems.ELEMENTAIR_SWORD.get());
				tabData.accept(ElementiummodModItems.ELEMENTAIR_PAXEL.get());
				tabData.accept(ElementiummodModItems.ELEMENTAIR_PICKAXE.get());
				tabData.accept(ElementiummodModItems.ELEMENTAIR_AXE.get());
				tabData.accept(ElementiummodModItems.ELEMENTAIR_SHOVEL.get());
				tabData.accept(ElementiummodModItems.ELEMENTWATER_SWORD.get());
				tabData.accept(ElementiummodModItems.ELEMENTWATER_PAXEL.get());
				tabData.accept(ElementiummodModItems.ELEMENTWATER_PICKAXE.get());
				tabData.accept(ElementiummodModItems.ELEMENTWATER_AXE.get());
				tabData.accept(ElementiummodModItems.ELEMENTWATER_SHOVEL.get());
				tabData.accept(ElementiummodModItems.ELEMENTIUMLIGHTNING_SWORD.get());
				tabData.accept(ElementiummodModItems.ELEMENTLIGHTNING_PAXEL.get());
				tabData.accept(ElementiummodModItems.ELEMENTLIGHTNING_PICKAXE.get());
				tabData.accept(ElementiummodModItems.ELEMENTLIGHTNING_AXE.get());
				tabData.accept(ElementiummodModItems.ELEMENTLIGHTNING_SHOVEL.get());
				tabData.accept(ElementiummodModItems.ELEMENTICE_SWORD.get());
				tabData.accept(ElementiummodModItems.ELEMENTICE_PAXEL.get());
				tabData.accept(ElementiummodModItems.ELEMENTICE_PICKAXE.get());
				tabData.accept(ElementiummodModItems.ELEMENTICE_AXE.get());
				tabData.accept(ElementiummodModItems.ELEMENTICE_SHOVEL.get());
				tabData.accept(ElementiummodModItems.ELEMENTEARTH_SWORD.get());
				tabData.accept(ElementiummodModItems.ELEMENTEARTH_PAXEL.get());
				tabData.accept(ElementiummodModItems.ELEMENTEARTH_PICKAXE.get());
				tabData.accept(ElementiummodModItems.ELEMENTEARTH_AXE.get());
				tabData.accept(ElementiummodModItems.ELEMENTEARTH_SHOVEL.get());
				tabData.accept(ElementiummodModItems.ELEMENTNATURE_BLADE.get());
				tabData.accept(ElementiummodModItems.ELEMENTNATURE_PAXEL.get());
				tabData.accept(ElementiummodModItems.ELEMENTNATURE_PICKAXE.get());
				tabData.accept(ElementiummodModItems.ELEMENTNATURE_AXE.get());
				tabData.accept(ElementiummodModItems.ELEMENTNATURE_SHOVEL.get());
				tabData.accept(ElementiummodModItems.ELEMENTVOID_SWORD.get());
				tabData.accept(ElementiummodModItems.ELEMENTVOID_PAXEL.get());
				tabData.accept(ElementiummodModItems.ELEMENTVOID_PICKAXE.get());
				tabData.accept(ElementiummodModItems.ELEMENTVOID_AXE.get());
				tabData.accept(ElementiummodModItems.ELEMENTSHADOW_SHOVEL.get());
				tabData.accept(ElementiummodModBlocks.THE_BLAZING_GRASS_BLOCK.get().asItem());
				tabData.accept(ElementiummodModBlocks.BLAZING_DIRT.get().asItem());
				tabData.accept(ElementiummodModBlocks.BLAZING_LOG_WOOD.get().asItem());
				tabData.accept(ElementiummodModBlocks.BLAZING_LOG_LOG.get().asItem());
				tabData.accept(ElementiummodModBlocks.BLAZING_LOG_PLANKS.get().asItem());
				tabData.accept(ElementiummodModBlocks.BLAZING_LOG_STAIRS.get().asItem());
				tabData.accept(ElementiummodModBlocks.BLAZING_LOG_SLAB.get().asItem());
				tabData.accept(ElementiummodModBlocks.BLAZING_LOG_BUTTON.get().asItem());
				tabData.accept(ElementiummodModBlocks.BLAZING_WOOD.get().asItem());
				tabData.accept(ElementiummodModBlocks.BLAZING_LOG.get().asItem());
				tabData.accept(ElementiummodModBlocks.BLAZING_PLANKS.get().asItem());
				tabData.accept(ElementiummodModBlocks.BLAZING_STAIRS.get().asItem());
				tabData.accept(ElementiummodModBlocks.BLAZING_SLAB.get().asItem());
				tabData.accept(ElementiummodModBlocks.BLAZING_BUTTON.get().asItem());
				tabData.accept(ElementiummodModBlocks.THE_BLAZING_LOG.get().asItem());
				tabData.accept(ElementiummodModBlocks.THE_BLAZING_LEAVES.get().asItem());
				tabData.accept(ElementiummodModItems.ELEMENTLIGHTNING_BOW.get());
				tabData.accept(ElementiummodModItems.ELEMENTFIRE_BOW.get());
				tabData.accept(ElementiummodModItems.ELEMENTEARTH_BOW.get());
				tabData.accept(ElementiummodModItems.ELEMENTICE_BOW.get());
				tabData.accept(ElementiummodModItems.ELEMENTAIR_BOW.get());
				tabData.accept(ElementiummodModItems.ELEMENTWATER_BOW.get());
				tabData.accept(ElementiummodModItems.ELEMENTNATURE_BOW.get());
				tabData.accept(ElementiummodModItems.ELEMENTVOID_BOW.get());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(ElementiummodModBlocks.BLAZINGG_WOOD.get().asItem());
			tabData.accept(ElementiummodModBlocks.BLAZINGG_LOG.get().asItem());
			tabData.accept(ElementiummodModBlocks.BLAZINGG_PLANKS.get().asItem());
			tabData.accept(ElementiummodModBlocks.BLAZINGG_STAIRS.get().asItem());
			tabData.accept(ElementiummodModBlocks.BLAZINGG_SLAB.get().asItem());
			tabData.accept(ElementiummodModBlocks.BLAZINGG_FENCE.get().asItem());
			tabData.accept(ElementiummodModBlocks.BLAZINGG_FENCE_GATE.get().asItem());
			tabData.accept(ElementiummodModBlocks.BLAZINGG_PRESSURE_PLATE.get().asItem());
			tabData.accept(ElementiummodModBlocks.BLAZINGG_BUTTON.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {
			tabData.accept(ElementiummodModBlocks.BLAZING_LOG_FENCE_GATE.get().asItem());
			tabData.accept(ElementiummodModBlocks.BLAZING_LOG_PRESSURE_PLATE.get().asItem());
			tabData.accept(ElementiummodModBlocks.BLAZING_FENCE_GATE.get().asItem());
			tabData.accept(ElementiummodModBlocks.BLAZING_PRESSURE_PLATE.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(ElementiummodModBlocks.BLAZING_LOG_FENCE.get().asItem());
			tabData.accept(ElementiummodModBlocks.BLAZING_LEAVES.get().asItem());
			tabData.accept(ElementiummodModBlocks.BLAZING_FENCE.get().asItem());
			tabData.accept(ElementiummodModBlocks.BLAZINGG_LEAVES.get().asItem());
		}
	}
}
