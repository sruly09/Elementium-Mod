package net.element.elementiummod.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.SimpleContainer;
import net.minecraft.core.BlockPos;

import net.element.elementiummod.init.ElementiumModModItems;

public class ElementfirePaxelBlockDestroyedWithToolProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean removeBlock = false;
		if (ElementiumModModItems.ELEMENTFIRE_PAXEL.get().isCorrectToolForDrops((world.getBlockState(new BlockPos(x, y, z)))) == true) {
			if (!(((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager()
					.getRecipeFor(RecipeType.SMELTING, new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y, z))).getBlock()))),
							_lvlSmeltResult)
					.isPresent())
							? _lvlSmeltResult.getRecipeManager()
									.getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y, z))).getBlock()))),
											_lvlSmeltResult)
									.get().getResultItem().copy()
							: ItemStack.EMPTY)
					.getItem() == Blocks.WEATHERED_COPPER.asItem())) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5),
							((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
									new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y, z))).getBlock()))), _lvlSmeltResult)
									.isPresent())
											? _lvlSmeltResult.getRecipeManager()
													.getRecipeFor(RecipeType.SMELTING,
															new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x, y, z))).getBlock()))),
															_lvlSmeltResult)
													.get().getResultItem().copy()
											: ItemStack.EMPTY));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
				removeBlock = false;
			} else {
				removeBlock = true;
				if (true) {
					world.destroyBlock(new BlockPos(x, y, z), false);
				} else {
					{
						BlockPos _pos = new BlockPos(x, y, z);
						Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
						world.destroyBlock(_pos, false);
					}
				}
			}
		}
	}
}
