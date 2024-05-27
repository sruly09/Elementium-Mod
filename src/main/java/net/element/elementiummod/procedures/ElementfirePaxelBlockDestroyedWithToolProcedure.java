package net.element.elementiummod.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.SimpleContainer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.element.elementiummod.init.ElementiummodModItems;

public class ElementfirePaxelBlockDestroyedWithToolProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean removeBlock = false;
		if (ElementiummodModItems.ELEMENTFIRE_PAXEL.get().isCorrectToolForDrops((world.getBlockState(BlockPos.containing(x, y, z)))) == true) {
			if (!((world instanceof Level _lvlSmeltResult
					? _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING, new SimpleContainer((new ItemStack((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()))), _lvlSmeltResult)
							.map(recipe -> recipe.getResultItem(_lvlSmeltResult.registryAccess()).copy()).orElse(ItemStack.EMPTY)
					: ItemStack.EMPTY).getItem() == Blocks.WEATHERED_COPPER.asItem())) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5),
							(world instanceof Level _lvlSmeltResult
									? _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING, new SimpleContainer((new ItemStack((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()))), _lvlSmeltResult)
											.map(recipe -> recipe.getResultItem(_lvlSmeltResult.registryAccess()).copy()).orElse(ItemStack.EMPTY)
									: ItemStack.EMPTY));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
				removeBlock = false;
			} else {
				removeBlock = true;
				if (true) {
					world.destroyBlock(BlockPos.containing(x, y, z), false);
				} else {
					{
						BlockPos _pos = BlockPos.containing(x, y, z);
						Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
						world.destroyBlock(_pos, false);
					}
				}
			}
		}
	}
}
