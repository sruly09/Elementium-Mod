
package net.element.elementiummodpartone_theelements.block;

import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.BiomeColors;

import net.element.elementiummodpartone_theelements.procedures.ElementiumBlockBlockIsPlacedByProcedure;
import net.element.elementiummodpartone_theelements.init.Elementiummodpart1TheelementsModBlocks;

import java.util.List;
import java.util.Collections;

public class ElementiumBlockBlock extends Block {
	public ElementiumBlockBlock() {
		super(BlockBehaviour.Properties.of(Material.METAL)
				.sound(new ForgeSoundType(1.0f, 1.0f, () -> new SoundEvent(new ResourceLocation("block.amethyst_block.break")), () -> new SoundEvent(new ResourceLocation("block.amethyst_block.chime")),
						() -> new SoundEvent(new ResourceLocation("block.netherite_block.place")), () -> new SoundEvent(new ResourceLocation("block.netherite_block.hit")), () -> new SoundEvent(new ResourceLocation("block.netherite_block.fall"))))
				.strength(2.1f, 12f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
		if (player.getInventory().getSelected().getItem() instanceof PickaxeItem tieredItem)
			return tieredItem.getTier().getLevel() >= 4;
		return false;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

	@Override
	public void setPlacedBy(Level world, BlockPos pos, BlockState blockstate, LivingEntity entity, ItemStack itemstack) {
		super.setPlacedBy(world, pos, blockstate, entity, itemstack);
		ElementiumBlockBlockIsPlacedByProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}

	@OnlyIn(Dist.CLIENT)
	public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
		event.getBlockColors().register((bs, world, pos, index) -> {
			return world != null && pos != null ? BiomeColors.getAverageWaterColor(world, pos) : -1;
		}, Elementiummodpart1TheelementsModBlocks.ELEMENTIUM_BLOCK.get());
	}

	@OnlyIn(Dist.CLIENT)
	public static void itemColorLoad(RegisterColorHandlersEvent.Item event) {
		event.getItemColors().register((stack, index) -> {
			return 3694022;
		}, Elementiummodpart1TheelementsModBlocks.ELEMENTIUM_BLOCK.get());
	}
}
