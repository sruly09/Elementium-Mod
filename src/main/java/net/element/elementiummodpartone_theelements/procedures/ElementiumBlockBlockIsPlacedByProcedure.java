package net.element.elementiummodpartone_theelements.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.element.elementiummodpartone_theelements.init.Elementiummodpart1TheelementsModBlocks;

public class ElementiumBlockBlockIsPlacedByProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.AIR) {
			world.setBlock(new BlockPos(x, y, z), Elementiummodpart1TheelementsModBlocks.ELEMENTIUM_BLOCK.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.OAK_LOG) {
			world.setBlock(new BlockPos(x, y, z), Elementiummodpart1TheelementsModBlocks.ELEMENTIUM_BLOCK.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.SUNFLOWER) {
			world.setBlock(new BlockPos(x, y, z), Elementiummodpart1TheelementsModBlocks.ELEMENTIUM_BLOCK.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.OAK_LEAVES) {
			world.setBlock(new BlockPos(x, y, z), Elementiummodpart1TheelementsModBlocks.ELEMENTIUM_BLOCK.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.FERN) {
			world.setBlock(new BlockPos(x, y, z), Elementiummodpart1TheelementsModBlocks.ELEMENTIUM_BLOCK.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.GRASS) {
			world.setBlock(new BlockPos(x, y, z), Elementiummodpart1TheelementsModBlocks.ELEMENTIUM_BLOCK.get().defaultBlockState(), 3);
		} else {
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y, z), Blocks.DIRT.defaultBlockState(), 3);
		}
		if (Math.random() >= 0.33) {
			if (Math.random() >= 0.5) {
				if (!((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.AIR)) {
					if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.GRASS_BLOCK) {
						world.setBlock(new BlockPos(x + 1, y, z), Elementiummodpart1TheelementsModBlocks.ELEMENTIUM_BLOCK.get().defaultBlockState(), 3);
					}
				}
			}
			if (Math.random() >= 0.5) {
				if (!((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.AIR)) {
					if ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.GRASS_BLOCK) {
						world.setBlock(new BlockPos(x - 1, y, z), Elementiummodpart1TheelementsModBlocks.ELEMENTIUM_BLOCK.get().defaultBlockState(), 3);
					}
				}
			}
			if (Math.random() >= 0.5) {
				if (!((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.AIR)) {
					if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.GRASS_BLOCK) {
						world.setBlock(new BlockPos(x, y, z + 1), Elementiummodpart1TheelementsModBlocks.ELEMENTIUM_BLOCK.get().defaultBlockState(), 3);
					}
				}
			}
			if (Math.random() >= 0.5) {
				if (!((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.AIR)) {
					if ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.GRASS_BLOCK) {
						world.setBlock(new BlockPos(x, y, z - 1), Elementiummodpart1TheelementsModBlocks.ELEMENTIUM_BLOCK.get().defaultBlockState(), 3);
					}
				}
			}
			if (Math.random() >= 0.5) {
				if (!((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.AIR)) {
					if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.GRASS_BLOCK) {
						world.setBlock(new BlockPos(x, y + 1, z), Elementiummodpart1TheelementsModBlocks.ELEMENTIUM_BLOCK.get().defaultBlockState(), 3);
					}
				}
			}
			if (Math.random() >= 0.5) {
				if (!((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.AIR)) {
					if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.GRASS_BLOCK) {
						world.setBlock(new BlockPos(x, y - 1, z), Elementiummodpart1TheelementsModBlocks.ELEMENTIUM_BLOCK.get().defaultBlockState(), 3);
					}
				}
			}
			if (Math.random() >= 0.5) {
				if (!((world.getBlockState(new BlockPos(x + 1, y + 1, z))).getBlock() == Blocks.AIR)) {
					if ((world.getBlockState(new BlockPos(x + 1, y + 1, z))).getBlock() == Blocks.GRASS_BLOCK) {
						world.setBlock(new BlockPos(x + 1, y + 1, z), Elementiummodpart1TheelementsModBlocks.ELEMENTIUM_BLOCK.get().defaultBlockState(), 3);
					}
				}
			}
			if (Math.random() >= 0.5) {
				if (!((world.getBlockState(new BlockPos(x - 1, y + 1, z))).getBlock() == Blocks.AIR)) {
					if ((world.getBlockState(new BlockPos(x - 1, y + 1, z))).getBlock() == Blocks.GRASS_BLOCK) {
						world.setBlock(new BlockPos(x - 1, y + 1, z), Elementiummodpart1TheelementsModBlocks.ELEMENTIUM_BLOCK.get().defaultBlockState(), 3);
					}
				}
			}
			if (Math.random() >= 0.5) {
				if (!((world.getBlockState(new BlockPos(x, y + 1, z + 1))).getBlock() == Blocks.AIR)) {
					if ((world.getBlockState(new BlockPos(x, y + 1, z + 1))).getBlock() == Blocks.GRASS_BLOCK) {
						world.setBlock(new BlockPos(x, y + 1, z + 1), Elementiummodpart1TheelementsModBlocks.ELEMENTIUM_BLOCK.get().defaultBlockState(), 3);
					}
				}
			}
			if (Math.random() >= 0.5) {
				if (!((world.getBlockState(new BlockPos(x, y + 1, z - 1))).getBlock() == Blocks.AIR)) {
					if ((world.getBlockState(new BlockPos(x, y + 1, z - 1))).getBlock() == Blocks.GRASS_BLOCK) {
						world.setBlock(new BlockPos(x, y + 1, z - 1), Elementiummodpart1TheelementsModBlocks.ELEMENTIUM_BLOCK.get().defaultBlockState(), 3);
					}
				}
			}
			if (Math.random() >= 0.5) {
				if (!((world.getBlockState(new BlockPos(x + 1, y - 1, z))).getBlock() == Blocks.AIR)) {
					if ((world.getBlockState(new BlockPos(x + 1, y - 1, z))).getBlock() == Blocks.GRASS_BLOCK) {
						world.setBlock(new BlockPos(x + 1, y - 1, z), Elementiummodpart1TheelementsModBlocks.ELEMENTIUM_BLOCK.get().defaultBlockState(), 3);
					}
				}
			}
			if (Math.random() >= 0.5) {
				if (!((world.getBlockState(new BlockPos(x - 1, y - 1, z))).getBlock() == Blocks.AIR)) {
					if ((world.getBlockState(new BlockPos(x - 1, y - 1, z))).getBlock() == Blocks.GRASS_BLOCK) {
						world.setBlock(new BlockPos(x - 1, y - 1, z), Elementiummodpart1TheelementsModBlocks.ELEMENTIUM_BLOCK.get().defaultBlockState(), 3);
					}
				}
			}
			if (Math.random() >= 0.5) {
				if (!((world.getBlockState(new BlockPos(x, y - 1, z + 1))).getBlock() == Blocks.AIR)) {
					if ((world.getBlockState(new BlockPos(x, y - 1, z + 1))).getBlock() == Blocks.GRASS_BLOCK) {
						world.setBlock(new BlockPos(x, y - 1, z + 1), Elementiummodpart1TheelementsModBlocks.ELEMENTIUM_BLOCK.get().defaultBlockState(), 3);
					}
				}
			}
			if (Math.random() >= 0.5) {
				if (!((world.getBlockState(new BlockPos(x, y - 1, z - 1))).getBlock() == Blocks.AIR)) {
					if ((world.getBlockState(new BlockPos(x, y - 1, z - 1))).getBlock() == Blocks.GRASS_BLOCK) {
						world.setBlock(new BlockPos(x, y - 1, z - 1), Elementiummodpart1TheelementsModBlocks.ELEMENTIUM_BLOCK.get().defaultBlockState(), 3);
					}
				}
			}
		} else {
			world.setBlock(new BlockPos(x, y, z), Elementiummodpart1TheelementsModBlocks.ELEMENTIUM_BLOCK.get().defaultBlockState(), 3);
		}
	}
}
