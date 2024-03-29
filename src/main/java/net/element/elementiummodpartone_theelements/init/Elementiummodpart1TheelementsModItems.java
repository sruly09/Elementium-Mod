
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.element.elementiummodpartone_theelements.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.element.elementiummodpartone_theelements.item.WaterEssenceItem;
import net.element.elementiummodpartone_theelements.item.VoidEssenceItem;
import net.element.elementiummodpartone_theelements.item.NatureEssenceItem;
import net.element.elementiummodpartone_theelements.item.LightningEssenceItem;
import net.element.elementiummodpartone_theelements.item.IceEssenceItem;
import net.element.elementiummodpartone_theelements.item.FireEssenceItem;
import net.element.elementiummodpartone_theelements.item.ElemondiumItem;
import net.element.elementiummodpartone_theelements.item.ElementwaterSwordItem;
import net.element.elementiummodpartone_theelements.item.ElementwaterShovelItem;
import net.element.elementiummodpartone_theelements.item.ElementwaterPickaxeItem;
import net.element.elementiummodpartone_theelements.item.ElementwaterPaxelItem;
import net.element.elementiummodpartone_theelements.item.ElementwaterItem;
import net.element.elementiummodpartone_theelements.item.ElementwaterBowItem;
import net.element.elementiummodpartone_theelements.item.ElementwaterAxeItem;
import net.element.elementiummodpartone_theelements.item.ElementvoidSwordItem;
import net.element.elementiummodpartone_theelements.item.ElementvoidPickaxeItem;
import net.element.elementiummodpartone_theelements.item.ElementvoidPaxelItem;
import net.element.elementiummodpartone_theelements.item.ElementvoidBowItem;
import net.element.elementiummodpartone_theelements.item.ElementvoidAxeItem;
import net.element.elementiummodpartone_theelements.item.ElementvoidArmorItem;
import net.element.elementiummodpartone_theelements.item.ElementshadowShovelItem;
import net.element.elementiummodpartone_theelements.item.ElementnatureShovelItem;
import net.element.elementiummodpartone_theelements.item.ElementnaturePickaxeItem;
import net.element.elementiummodpartone_theelements.item.ElementnaturePaxelItem;
import net.element.elementiummodpartone_theelements.item.ElementnatureBowItem;
import net.element.elementiummodpartone_theelements.item.ElementnatureBladeItem;
import net.element.elementiummodpartone_theelements.item.ElementnatureAxeItem;
import net.element.elementiummodpartone_theelements.item.ElementnatureArmorItem;
import net.element.elementiummodpartone_theelements.item.ElementlightningShovelItem;
import net.element.elementiummodpartone_theelements.item.ElementlightningPickaxeItem;
import net.element.elementiummodpartone_theelements.item.ElementlightningPaxelItem;
import net.element.elementiummodpartone_theelements.item.ElementlightningBowItem;
import net.element.elementiummodpartone_theelements.item.ElementlightningAxeItem;
import net.element.elementiummodpartone_theelements.item.ElementiumlightningSwordItem;
import net.element.elementiummodpartone_theelements.item.ElementiumSwordItem;
import net.element.elementiummodpartone_theelements.item.ElementiumShovelItem;
import net.element.elementiummodpartone_theelements.item.ElementiumPickaxeItem;
import net.element.elementiummodpartone_theelements.item.ElementiumDimensionItem;
import net.element.elementiummodpartone_theelements.item.ElementiumAxeItem;
import net.element.elementiummodpartone_theelements.item.ElementiumArmorItem;
import net.element.elementiummodpartone_theelements.item.ElementiceSwordItem;
import net.element.elementiummodpartone_theelements.item.ElementiceShovelItem;
import net.element.elementiummodpartone_theelements.item.ElementicePickaxeItem;
import net.element.elementiummodpartone_theelements.item.ElementicePaxelItem;
import net.element.elementiummodpartone_theelements.item.ElementiceBowItem;
import net.element.elementiummodpartone_theelements.item.ElementiceAxeItem;
import net.element.elementiummodpartone_theelements.item.ElementiceArmorItem;
import net.element.elementiummodpartone_theelements.item.ElementfireSwordItem;
import net.element.elementiummodpartone_theelements.item.ElementfireShovelItem;
import net.element.elementiummodpartone_theelements.item.ElementfirePickaxeItem;
import net.element.elementiummodpartone_theelements.item.ElementfirePaxelItem;
import net.element.elementiummodpartone_theelements.item.ElementfireBowItem;
import net.element.elementiummodpartone_theelements.item.ElementfireAxeItem;
import net.element.elementiummodpartone_theelements.item.ElementfireArmorItem;
import net.element.elementiummodpartone_theelements.item.ElementearthSwordItem;
import net.element.elementiummodpartone_theelements.item.ElementearthShovelItem;
import net.element.elementiummodpartone_theelements.item.ElementearthPickaxeItem;
import net.element.elementiummodpartone_theelements.item.ElementearthPaxelItem;
import net.element.elementiummodpartone_theelements.item.ElementearthBowItem;
import net.element.elementiummodpartone_theelements.item.ElementearthAxeItem;
import net.element.elementiummodpartone_theelements.item.ElementearthArmorItem;
import net.element.elementiummodpartone_theelements.item.ElementairSwordItem;
import net.element.elementiummodpartone_theelements.item.ElementairShovelItem;
import net.element.elementiummodpartone_theelements.item.ElementairPickaxeItem;
import net.element.elementiummodpartone_theelements.item.ElementairPaxelItem;
import net.element.elementiummodpartone_theelements.item.ElementairBowItem;
import net.element.elementiummodpartone_theelements.item.ElementairAxeItem;
import net.element.elementiummodpartone_theelements.item.ElementairArmorItem;
import net.element.elementiummodpartone_theelements.item.EarthEssenceItem;
import net.element.elementiummodpartone_theelements.item.AirEssenceItem;
import net.element.elementiummodpartone_theelements.Elementiummodpart1TheelementsMod;

public class Elementiummodpart1TheelementsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, Elementiummodpart1TheelementsMod.MODID);
	public static final RegistryObject<Item> ELEMENTIUM_BLOCK = block(Elementiummodpart1TheelementsModBlocks.ELEMENTIUM_BLOCK, Elementiummodpart1TheelementsModTabs.TAB_ELEMENTIUM_TAB);
	public static final RegistryObject<Item> ELEMONDIUM_INFUSED_OBSIDIAN = block(Elementiummodpart1TheelementsModBlocks.ELEMONDIUM_INFUSED_OBSIDIAN, Elementiummodpart1TheelementsModTabs.TAB_ELEMENTIUM_TAB);
	public static final RegistryObject<Item> ELEMENTIUM_DIMENSION = REGISTRY.register("elementium_dimension", () -> new ElementiumDimensionItem());
	public static final RegistryObject<Item> ELEMENTIUM_ORE = block(Elementiummodpart1TheelementsModBlocks.ELEMENTIUM_ORE, Elementiummodpart1TheelementsModTabs.TAB_ELEMENTIUM_TAB);
	public static final RegistryObject<Item> FIRE_ESSENCE_ORE = block(Elementiummodpart1TheelementsModBlocks.FIRE_ESSENCE_ORE, Elementiummodpart1TheelementsModTabs.TAB_ELEMENTIUM_TAB);
	public static final RegistryObject<Item> AIR_ESSENCE_ORE = block(Elementiummodpart1TheelementsModBlocks.AIR_ESSENCE_ORE, Elementiummodpart1TheelementsModTabs.TAB_ELEMENTIUM_TAB);
	public static final RegistryObject<Item> WATER_ESSENCE_ORE = block(Elementiummodpart1TheelementsModBlocks.WATER_ESSENCE_ORE, Elementiummodpart1TheelementsModTabs.TAB_ELEMENTIUM_TAB);
	public static final RegistryObject<Item> EARTH_ESSENCE_ORE = block(Elementiummodpart1TheelementsModBlocks.EARTH_ESSENCE_ORE, Elementiummodpart1TheelementsModTabs.TAB_ELEMENTIUM_TAB);
	public static final RegistryObject<Item> ELEMONDIUM = REGISTRY.register("elemondium", () -> new ElemondiumItem());
	public static final RegistryObject<Item> FIRE_ESSENCE = REGISTRY.register("fire_essence", () -> new FireEssenceItem());
	public static final RegistryObject<Item> AIR_ESSENCE = REGISTRY.register("air_essence", () -> new AirEssenceItem());
	public static final RegistryObject<Item> WATER_ESSENCE = REGISTRY.register("water_essence", () -> new WaterEssenceItem());
	public static final RegistryObject<Item> EARTH_ESSENCE = REGISTRY.register("earth_essence", () -> new EarthEssenceItem());
	public static final RegistryObject<Item> VOID_ESSENCE = REGISTRY.register("void_essence", () -> new VoidEssenceItem());
	public static final RegistryObject<Item> LIGHTNING_ESSENCE = REGISTRY.register("lightning_essence", () -> new LightningEssenceItem());
	public static final RegistryObject<Item> ICE_ESSENCE = REGISTRY.register("ice_essence", () -> new IceEssenceItem());
	public static final RegistryObject<Item> NATURE_ESSENCE = REGISTRY.register("nature_essence", () -> new NatureEssenceItem());
	public static final RegistryObject<Item> ELEMENTIUM_ARMOR_HELMET = REGISTRY.register("elementium_armor_helmet", () -> new ElementiumArmorItem.Helmet());
	public static final RegistryObject<Item> ELEMENTIUM_ARMOR_CHESTPLATE = REGISTRY.register("elementium_armor_chestplate", () -> new ElementiumArmorItem.Chestplate());
	public static final RegistryObject<Item> ELEMENTIUM_ARMOR_LEGGINGS = REGISTRY.register("elementium_armor_leggings", () -> new ElementiumArmorItem.Leggings());
	public static final RegistryObject<Item> ELEMENTIUM_ARMOR_BOOTS = REGISTRY.register("elementium_armor_boots", () -> new ElementiumArmorItem.Boots());
	public static final RegistryObject<Item> ELEMENTFIRE_ARMOR_HELMET = REGISTRY.register("elementfire_armor_helmet", () -> new ElementfireArmorItem.Helmet());
	public static final RegistryObject<Item> ELEMENTFIRE_ARMOR_CHESTPLATE = REGISTRY.register("elementfire_armor_chestplate", () -> new ElementfireArmorItem.Chestplate());
	public static final RegistryObject<Item> ELEMENTFIRE_ARMOR_LEGGINGS = REGISTRY.register("elementfire_armor_leggings", () -> new ElementfireArmorItem.Leggings());
	public static final RegistryObject<Item> ELEMENTFIRE_ARMOR_BOOTS = REGISTRY.register("elementfire_armor_boots", () -> new ElementfireArmorItem.Boots());
	public static final RegistryObject<Item> ELEMENTAIR_ARMOR_HELMET = REGISTRY.register("elementair_armor_helmet", () -> new ElementairArmorItem.Helmet());
	public static final RegistryObject<Item> ELEMENTAIR_ARMOR_CHESTPLATE = REGISTRY.register("elementair_armor_chestplate", () -> new ElementairArmorItem.Chestplate());
	public static final RegistryObject<Item> ELEMENTAIR_ARMOR_LEGGINGS = REGISTRY.register("elementair_armor_leggings", () -> new ElementairArmorItem.Leggings());
	public static final RegistryObject<Item> ELEMENTAIR_ARMOR_BOOTS = REGISTRY.register("elementair_armor_boots", () -> new ElementairArmorItem.Boots());
	public static final RegistryObject<Item> ELEMENTWATER_HELMET = REGISTRY.register("elementwater_helmet", () -> new ElementwaterItem.Helmet());
	public static final RegistryObject<Item> ELEMENTWATER_CHESTPLATE = REGISTRY.register("elementwater_chestplate", () -> new ElementwaterItem.Chestplate());
	public static final RegistryObject<Item> ELEMENTWATER_LEGGINGS = REGISTRY.register("elementwater_leggings", () -> new ElementwaterItem.Leggings());
	public static final RegistryObject<Item> ELEMENTWATER_BOOTS = REGISTRY.register("elementwater_boots", () -> new ElementwaterItem.Boots());
	public static final RegistryObject<Item> ELEMENTEARTH_ARMOR_HELMET = REGISTRY.register("elementearth_armor_helmet", () -> new ElementearthArmorItem.Helmet());
	public static final RegistryObject<Item> ELEMENTEARTH_ARMOR_CHESTPLATE = REGISTRY.register("elementearth_armor_chestplate", () -> new ElementearthArmorItem.Chestplate());
	public static final RegistryObject<Item> ELEMENTEARTH_ARMOR_LEGGINGS = REGISTRY.register("elementearth_armor_leggings", () -> new ElementearthArmorItem.Leggings());
	public static final RegistryObject<Item> ELEMENTEARTH_ARMOR_BOOTS = REGISTRY.register("elementearth_armor_boots", () -> new ElementearthArmorItem.Boots());
	public static final RegistryObject<Item> ELEMENTVOID_ARMOR_HELMET = REGISTRY.register("elementvoid_armor_helmet", () -> new ElementvoidArmorItem.Helmet());
	public static final RegistryObject<Item> ELEMENTVOID_ARMOR_CHESTPLATE = REGISTRY.register("elementvoid_armor_chestplate", () -> new ElementvoidArmorItem.Chestplate());
	public static final RegistryObject<Item> ELEMENTVOID_ARMOR_LEGGINGS = REGISTRY.register("elementvoid_armor_leggings", () -> new ElementvoidArmorItem.Leggings());
	public static final RegistryObject<Item> ELEMENTVOID_ARMOR_BOOTS = REGISTRY.register("elementvoid_armor_boots", () -> new ElementvoidArmorItem.Boots());
	public static final RegistryObject<Item> ELEMENTICE_ARMOR_HELMET = REGISTRY.register("elementice_armor_helmet", () -> new ElementiceArmorItem.Helmet());
	public static final RegistryObject<Item> ELEMENTICE_ARMOR_CHESTPLATE = REGISTRY.register("elementice_armor_chestplate", () -> new ElementiceArmorItem.Chestplate());
	public static final RegistryObject<Item> ELEMENTICE_ARMOR_LEGGINGS = REGISTRY.register("elementice_armor_leggings", () -> new ElementiceArmorItem.Leggings());
	public static final RegistryObject<Item> ELEMENTICE_ARMOR_BOOTS = REGISTRY.register("elementice_armor_boots", () -> new ElementiceArmorItem.Boots());
	public static final RegistryObject<Item> ELEMENTNATURE_ARMOR_HELMET = REGISTRY.register("elementnature_armor_helmet", () -> new ElementnatureArmorItem.Helmet());
	public static final RegistryObject<Item> ELEMENTNATURE_ARMOR_CHESTPLATE = REGISTRY.register("elementnature_armor_chestplate", () -> new ElementnatureArmorItem.Chestplate());
	public static final RegistryObject<Item> ELEMENTNATURE_ARMOR_LEGGINGS = REGISTRY.register("elementnature_armor_leggings", () -> new ElementnatureArmorItem.Leggings());
	public static final RegistryObject<Item> ELEMENTNATURE_ARMOR_BOOTS = REGISTRY.register("elementnature_armor_boots", () -> new ElementnatureArmorItem.Boots());
	public static final RegistryObject<Item> ELEMONDIUM_SWORD = REGISTRY.register("elemondium_sword", () -> new ElementiumSwordItem());
	public static final RegistryObject<Item> ELEMENTIUM_PICKAXE = REGISTRY.register("elementium_pickaxe", () -> new ElementiumPickaxeItem());
	public static final RegistryObject<Item> ELEMENTIUM_AXE = REGISTRY.register("elementium_axe", () -> new ElementiumAxeItem());
	public static final RegistryObject<Item> ELEMENTIUM_SHOVEL = REGISTRY.register("elementium_shovel", () -> new ElementiumShovelItem());
	public static final RegistryObject<Item> ELEMENTFIRE_SWORD = REGISTRY.register("elementfire_sword", () -> new ElementfireSwordItem());
	public static final RegistryObject<Item> ELEMENTFIRE_BOW = REGISTRY.register("elementfire_bow", () -> new ElementfireBowItem());
	public static final RegistryObject<Item> ELEMENTFIRE_PAXEL = REGISTRY.register("elementfire_paxel", () -> new ElementfirePaxelItem());
	public static final RegistryObject<Item> ELEMENTFIRE_PICKAXE = REGISTRY.register("elementfire_pickaxe", () -> new ElementfirePickaxeItem());
	public static final RegistryObject<Item> ELEMENTFIRE_AXE = REGISTRY.register("elementfire_axe", () -> new ElementfireAxeItem());
	public static final RegistryObject<Item> ELEMENTFIRE_SHOVEL = REGISTRY.register("elementfire_shovel", () -> new ElementfireShovelItem());
	public static final RegistryObject<Item> ELEMENTAIR_SWORD = REGISTRY.register("elementair_sword", () -> new ElementairSwordItem());
	public static final RegistryObject<Item> ELEMENTAIR_BOW = REGISTRY.register("elementair_bow", () -> new ElementairBowItem());
	public static final RegistryObject<Item> ELEMENTAIR_PAXEL = REGISTRY.register("elementair_paxel", () -> new ElementairPaxelItem());
	public static final RegistryObject<Item> ELEMENTAIR_PICKAXE = REGISTRY.register("elementair_pickaxe", () -> new ElementairPickaxeItem());
	public static final RegistryObject<Item> ELEMENTAIR_AXE = REGISTRY.register("elementair_axe", () -> new ElementairAxeItem());
	public static final RegistryObject<Item> ELEMENTAIR_SHOVEL = REGISTRY.register("elementair_shovel", () -> new ElementairShovelItem());
	public static final RegistryObject<Item> ELEMENTWATER_SWORD = REGISTRY.register("elementwater_sword", () -> new ElementwaterSwordItem());
	public static final RegistryObject<Item> ELEMENTWATER_BOW = REGISTRY.register("elementwater_bow", () -> new ElementwaterBowItem());
	public static final RegistryObject<Item> ELEMENTWATER_PAXEL = REGISTRY.register("elementwater_paxel", () -> new ElementwaterPaxelItem());
	public static final RegistryObject<Item> ELEMENTWATER_PICKAXE = REGISTRY.register("elementwater_pickaxe", () -> new ElementwaterPickaxeItem());
	public static final RegistryObject<Item> ELEMENTWATER_AXE = REGISTRY.register("elementwater_axe", () -> new ElementwaterAxeItem());
	public static final RegistryObject<Item> ELEMENTWATER_SHOVEL = REGISTRY.register("elementwater_shovel", () -> new ElementwaterShovelItem());
	public static final RegistryObject<Item> ELEMENTIUMLIGHTNING_SWORD = REGISTRY.register("elementiumlightning_sword", () -> new ElementiumlightningSwordItem());
	public static final RegistryObject<Item> ELEMENTLIGHTNING_BOW = REGISTRY.register("elementlightning_bow", () -> new ElementlightningBowItem());
	public static final RegistryObject<Item> ELEMENTLIGHTNING_PAXEL = REGISTRY.register("elementlightning_paxel", () -> new ElementlightningPaxelItem());
	public static final RegistryObject<Item> ELEMENTLIGHTNING_PICKAXE = REGISTRY.register("elementlightning_pickaxe", () -> new ElementlightningPickaxeItem());
	public static final RegistryObject<Item> ELEMENTLIGHTNING_AXE = REGISTRY.register("elementlightning_axe", () -> new ElementlightningAxeItem());
	public static final RegistryObject<Item> ELEMENTLIGHTNING_SHOVEL = REGISTRY.register("elementlightning_shovel", () -> new ElementlightningShovelItem());
	public static final RegistryObject<Item> ELEMENTICE_SWORD = REGISTRY.register("elementice_sword", () -> new ElementiceSwordItem());
	public static final RegistryObject<Item> ELEMENTICE_BOW = REGISTRY.register("elementice_bow", () -> new ElementiceBowItem());
	public static final RegistryObject<Item> ELEMENTICE_PAXEL = REGISTRY.register("elementice_paxel", () -> new ElementicePaxelItem());
	public static final RegistryObject<Item> ELEMENTICE_PICKAXE = REGISTRY.register("elementice_pickaxe", () -> new ElementicePickaxeItem());
	public static final RegistryObject<Item> ELEMENTICE_AXE = REGISTRY.register("elementice_axe", () -> new ElementiceAxeItem());
	public static final RegistryObject<Item> ELEMENTICE_SHOVEL = REGISTRY.register("elementice_shovel", () -> new ElementiceShovelItem());
	public static final RegistryObject<Item> ELEMENTEARTH_SWORD = REGISTRY.register("elementearth_sword", () -> new ElementearthSwordItem());
	public static final RegistryObject<Item> ELEMENTEARTH_BOW = REGISTRY.register("elementearth_bow", () -> new ElementearthBowItem());
	public static final RegistryObject<Item> ELEMENTEARTH_PAXEL = REGISTRY.register("elementearth_paxel", () -> new ElementearthPaxelItem());
	public static final RegistryObject<Item> ELEMENTEARTH_PICKAXE = REGISTRY.register("elementearth_pickaxe", () -> new ElementearthPickaxeItem());
	public static final RegistryObject<Item> ELEMENTEARTH_AXE = REGISTRY.register("elementearth_axe", () -> new ElementearthAxeItem());
	public static final RegistryObject<Item> ELEMENTEARTH_SHOVEL = REGISTRY.register("elementearth_shovel", () -> new ElementearthShovelItem());
	public static final RegistryObject<Item> ELEMENTNATURE_BLADE = REGISTRY.register("elementnature_blade", () -> new ElementnatureBladeItem());
	public static final RegistryObject<Item> ELEMENTNATURE_BOW = REGISTRY.register("elementnature_bow", () -> new ElementnatureBowItem());
	public static final RegistryObject<Item> ELEMENTNATURE_PAXEL = REGISTRY.register("elementnature_paxel", () -> new ElementnaturePaxelItem());
	public static final RegistryObject<Item> ELEMENTNATURE_PICKAXE = REGISTRY.register("elementnature_pickaxe", () -> new ElementnaturePickaxeItem());
	public static final RegistryObject<Item> ELEMENTNATURE_AXE = REGISTRY.register("elementnature_axe", () -> new ElementnatureAxeItem());
	public static final RegistryObject<Item> ELEMENTNATURE_SHOVEL = REGISTRY.register("elementnature_shovel", () -> new ElementnatureShovelItem());
	public static final RegistryObject<Item> ELEMENTVOID_SWORD = REGISTRY.register("elementvoid_sword", () -> new ElementvoidSwordItem());
	public static final RegistryObject<Item> ELEMENTVOID_BOW = REGISTRY.register("elementvoid_bow", () -> new ElementvoidBowItem());
	public static final RegistryObject<Item> ELEMENTVOID_PAXEL = REGISTRY.register("elementvoid_paxel", () -> new ElementvoidPaxelItem());
	public static final RegistryObject<Item> ELEMENTVOID_PICKAXE = REGISTRY.register("elementvoid_pickaxe", () -> new ElementvoidPickaxeItem());
	public static final RegistryObject<Item> ELEMENTVOID_AXE = REGISTRY.register("elementvoid_axe", () -> new ElementvoidAxeItem());
	public static final RegistryObject<Item> ELEMENTSHADOW_SHOVEL = REGISTRY.register("elementshadow_shovel", () -> new ElementshadowShovelItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
