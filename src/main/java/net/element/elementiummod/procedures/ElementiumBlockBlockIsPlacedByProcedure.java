package net.element.elementiummod.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.element.elementiummod.init.ElementiummodModBlocks;

public class ElementiumBlockBlockIsPlacedByProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR) {
			world.setBlock(BlockPos.containing(x, y, z), ElementiummodModBlocks.ELEMENTIUM_BLOCK.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.OAK_LOG) {
			world.setBlock(BlockPos.containing(x, y, z), ElementiummodModBlocks.ELEMENTIUM_BLOCK.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.SUNFLOWER) {
			world.setBlock(BlockPos.containing(x, y, z), ElementiummodModBlocks.ELEMENTIUM_BLOCK.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.OAK_LEAVES) {
			world.setBlock(BlockPos.containing(x, y, z), ElementiummodModBlocks.ELEMENTIUM_BLOCK.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.FERN) {
			world.setBlock(BlockPos.containing(x, y, z), ElementiummodModBlocks.ELEMENTIUM_BLOCK.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.GRASS) {
			world.setBlock(BlockPos.containing(x, y, z), ElementiummodModBlocks.ELEMENTIUM_BLOCK.get().defaultBlockState(), 3);
		} else {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y, z), Blocks.DIRT.defaultBlockState(), 3);
		}
		if (Math.random() >= 0.33) {
			if (Math.random() >= 0.5) {
				if (!((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.AIR)) {
					if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.GRASS_BLOCK) {
						world.setBlock(BlockPos.containing(x + 1, y, z), ElementiummodModBlocks.ELEMENTIUM_BLOCK.get().defaultBlockState(), 3);
					}
				}
			}
			if (Math.random() >= 0.5) {
				if (!((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.AIR)) {
					if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.GRASS_BLOCK) {
						world.setBlock(BlockPos.containing(x - 1, y, z), ElementiummodModBlocks.ELEMENTIUM_BLOCK.get().defaultBlockState(), 3);
					}
				}
			}
			if (Math.random() >= 0.5) {
				if (!((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.AIR)) {
					if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.GRASS_BLOCK) {
						world.setBlock(BlockPos.containing(x, y, z + 1), ElementiummodModBlocks.ELEMENTIUM_BLOCK.get().defaultBlockState(), 3);
					}
				}
			}
			if (Math.random() >= 0.5) {
				if (!((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.AIR)) {
					if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.GRASS_BLOCK) {
						world.setBlock(BlockPos.containing(x, y, z - 1), ElementiummodModBlocks.ELEMENTIUM_BLOCK.get().defaultBlockState(), 3);
					}
				}
			}
			if (Math.random() >= 0.5) {
				if (!((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR)) {
					if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.GRASS_BLOCK) {
						world.setBlock(BlockPos.containing(x, y + 1, z), ElementiummodModBlocks.ELEMENTIUM_BLOCK.get().defaultBlockState(), 3);
					}
				}
			}
			if (Math.random() >= 0.5) {
				if (!((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.AIR)) {
					if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.GRASS_BLOCK) {
						world.setBlock(BlockPos.containing(x, y - 1, z), ElementiummodModBlocks.ELEMENTIUM_BLOCK.get().defaultBlockState(), 3);
					}
				}
			}
			if (Math.random() >= 0.5) {
				if (!((world.getBlockState(BlockPos.containing(x + 1, y + 1, z))).getBlock() == Blocks.AIR)) {
					if ((world.getBlockState(BlockPos.containing(x + 1, y + 1, z))).getBlock() == Blocks.GRASS_BLOCK) {
						world.setBlock(BlockPos.containing(x + 1, y + 1, z), ElementiummodModBlocks.ELEMENTIUM_BLOCK.get().defaultBlockState(), 3);
					}
				}
			}
			if (Math.random() >= 0.5) {
				if (!((world.getBlockState(BlockPos.containing(x - 1, y + 1, z))).getBlock() == Blocks.AIR)) {
					if ((world.getBlockState(BlockPos.containing(x - 1, y + 1, z))).getBlock() == Blocks.GRASS_BLOCK) {
						world.setBlock(BlockPos.containing(x - 1, y + 1, z), ElementiummodModBlocks.ELEMENTIUM_BLOCK.get().defaultBlockState(), 3);
					}
				}
			}
			if (Math.random() >= 0.5) {
				if (!((world.getBlockState(BlockPos.containing(x, y + 1, z + 1))).getBlock() == Blocks.AIR)) {
					if ((world.getBlockState(BlockPos.containing(x, y + 1, z + 1))).getBlock() == Blocks.GRASS_BLOCK) {
						world.setBlock(BlockPos.containing(x, y + 1, z + 1), ElementiummodModBlocks.ELEMENTIUM_BLOCK.get().defaultBlockState(), 3);
					}
				}
			}
			if (Math.random() >= 0.5) {
				if (!((world.getBlockState(BlockPos.containing(x, y + 1, z - 1))).getBlock() == Blocks.AIR)) {
					if ((world.getBlockState(BlockPos.containing(x, y + 1, z - 1))).getBlock() == Blocks.GRASS_BLOCK) {
						world.setBlock(BlockPos.containing(x, y + 1, z - 1), ElementiummodModBlocks.ELEMENTIUM_BLOCK.get().defaultBlockState(), 3);
					}
				}
			}
			if (Math.random() >= 0.5) {
				if (!((world.getBlockState(BlockPos.containing(x + 1, y - 1, z))).getBlock() == Blocks.AIR)) {
					if ((world.getBlockState(BlockPos.containing(x + 1, y - 1, z))).getBlock() == Blocks.GRASS_BLOCK) {
						world.setBlock(BlockPos.containing(x + 1, y - 1, z), ElementiummodModBlocks.ELEMENTIUM_BLOCK.get().defaultBlockState(), 3);
					}
				}
			}
			if (Math.random() >= 0.5) {
				if (!((world.getBlockState(BlockPos.containing(x - 1, y - 1, z))).getBlock() == Blocks.AIR)) {
					if ((world.getBlockState(BlockPos.containing(x - 1, y - 1, z))).getBlock() == Blocks.GRASS_BLOCK) {
						world.setBlock(BlockPos.containing(x - 1, y - 1, z), ElementiummodModBlocks.ELEMENTIUM_BLOCK.get().defaultBlockState(), 3);
					}
				}
			}
			if (Math.random() >= 0.5) {
				if (!((world.getBlockState(BlockPos.containing(x, y - 1, z + 1))).getBlock() == Blocks.AIR)) {
					if ((world.getBlockState(BlockPos.containing(x, y - 1, z + 1))).getBlock() == Blocks.GRASS_BLOCK) {
						world.setBlock(BlockPos.containing(x, y - 1, z + 1), ElementiummodModBlocks.ELEMENTIUM_BLOCK.get().defaultBlockState(), 3);
					}
				}
			}
			if (Math.random() >= 0.5) {
				if (!((world.getBlockState(BlockPos.containing(x, y - 1, z - 1))).getBlock() == Blocks.AIR)) {
					if ((world.getBlockState(BlockPos.containing(x, y - 1, z - 1))).getBlock() == Blocks.GRASS_BLOCK) {
						world.setBlock(BlockPos.containing(x, y - 1, z - 1), ElementiummodModBlocks.ELEMENTIUM_BLOCK.get().defaultBlockState(), 3);
					}
				}
			}
		} else {
			world.setBlock(BlockPos.containing(x, y, z), ElementiummodModBlocks.ELEMENTIUM_BLOCK.get().defaultBlockState(), 3);
		}
	}
}
