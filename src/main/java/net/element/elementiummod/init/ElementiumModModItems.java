
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.element.elementiummod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.element.elementiummod.item.LightningEssenceItem;
import net.element.elementiummod.item.FireEssenceItem;
import net.element.elementiummod.item.ElementlightningShovelItem;
import net.element.elementiummod.item.ElementlightningPickaxeItem;
import net.element.elementiummod.item.ElementlightningAxeItem;
import net.element.elementiummod.item.ElementiumlightningSwordItem;
import net.element.elementiummod.item.ElementiumSwordItem;
import net.element.elementiummod.item.ElementiumPickaxeItem;
import net.element.elementiummod.item.ElementiumDiamondItem;
import net.element.elementiummod.item.ElementfireSwordItem;
import net.element.elementiummod.item.ElementfireShovelItem;
import net.element.elementiummod.item.ElementfirePickaxeItem;
import net.element.elementiummod.item.ElementfirePaxelItem;
import net.element.elementiummod.item.ElementfireBowItem;
import net.element.elementiummod.item.ElementfireAxeItem;
import net.element.elementiummod.item.EarthEssenceItem;
import net.element.elementiummod.ElementiumModMod;

public class ElementiumModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ElementiumModMod.MODID);
	public static final RegistryObject<Item> ELEMENTIUM_DIAMOND = REGISTRY.register("elementium_diamond", () -> new ElementiumDiamondItem());
	public static final RegistryObject<Item> ELEMENTIUM_BLOCK = block(ElementiumModModBlocks.ELEMENTIUM_BLOCK,
			ElementiumModModTabs.TAB_ELEMENTIUM_TAB);
	public static final RegistryObject<Item> ELEMENTIUM_ORE = block(ElementiumModModBlocks.ELEMENTIUM_ORE, ElementiumModModTabs.TAB_ELEMENTIUM_TAB);
	public static final RegistryObject<Item> FIRE_ESSENCE = REGISTRY.register("fire_essence", () -> new FireEssenceItem());
	public static final RegistryObject<Item> LIGHTNING_ESSENCE = REGISTRY.register("lightning_essence", () -> new LightningEssenceItem());
	public static final RegistryObject<Item> EARTH_ESSENCE = REGISTRY.register("earth_essence", () -> new EarthEssenceItem());
	public static final RegistryObject<Item> ELEMENTFIRE_SWORD = REGISTRY.register("elementfire_sword", () -> new ElementfireSwordItem());
	public static final RegistryObject<Item> ELEMENTFIRE_PICKAXE = REGISTRY.register("elementfire_pickaxe", () -> new ElementfirePickaxeItem());
	public static final RegistryObject<Item> ELEMENTFIRE_BOW = REGISTRY.register("elementfire_bow", () -> new ElementfireBowItem());
	public static final RegistryObject<Item> ELEMENTFIRE_PAXEL = REGISTRY.register("elementfire_paxel", () -> new ElementfirePaxelItem());
	public static final RegistryObject<Item> ELEMENTFIRE_AXE = REGISTRY.register("elementfire_axe", () -> new ElementfireAxeItem());
	public static final RegistryObject<Item> ELEMENTFIRE_SHOVEL = REGISTRY.register("elementfire_shovel", () -> new ElementfireShovelItem());
	public static final RegistryObject<Item> ELEMENTIUMLIGHTNING_SWORD = REGISTRY.register("elementiumlightning_sword",
			() -> new ElementiumlightningSwordItem());
	public static final RegistryObject<Item> ELEMENTIUM_SWORD = REGISTRY.register("elementium_sword", () -> new ElementiumSwordItem());
	public static final RegistryObject<Item> ELEMENTIUM_PICKAXE = REGISTRY.register("elementium_pickaxe", () -> new ElementiumPickaxeItem());
	public static final RegistryObject<Item> ELEMENTLIGHTNING_PICKAXE = REGISTRY.register("elementlightning_pickaxe",
			() -> new ElementlightningPickaxeItem());
	public static final RegistryObject<Item> ELEMENTLIGHTNING_AXE = REGISTRY.register("elementlightning_axe", () -> new ElementlightningAxeItem());
	public static final RegistryObject<Item> ELEMENTLIGHTNING_SHOVEL = REGISTRY.register("elementlightning_shovel",
			() -> new ElementlightningShovelItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
