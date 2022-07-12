package net.element.elementiummod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.world.BlockEvent;

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

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ElementfireAxeBlockDestroyedWithToolProcedure {
	@SubscribeEvent
	public static void onBlockBreak(BlockEvent.BreakEvent event) {
		execute(event, event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ());
	}

	public static void execute(LevelAccessor world, double x, double y, double z) {
		execute(null, world, x, y, z);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z) {
		boolean removeBlock = false;
		if (ElementiumModModItems.ELEMENTFIRE_AXE.get().isCorrectToolForDrops((world.getBlockState(new BlockPos(x, y, z)))) == true) {
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
					.getItem() == Blocks.AIR.asItem())) {
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
				removeBlock = true;
			} else {
				removeBlock = false;
				if (removeBlock == true) {
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
