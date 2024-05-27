
package net.element.elementiummod.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class ObsidianInfusedElemondiumBlock extends Block {
	public ObsidianInfusedElemondiumBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(80.85f, 1402.5f).lightLevel(s -> 2));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
