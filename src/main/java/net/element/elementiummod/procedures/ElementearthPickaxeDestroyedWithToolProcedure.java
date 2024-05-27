package net.element.elementiummod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.util.RandomSource;
import net.minecraft.tags.BlockTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

public class ElementearthPickaxeDestroyedWithToolProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double posX = 0;
		double posY = 0;
		double posZ = 0;
		if (itemstack.getItem() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()
				&& ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(new ResourceLocation("minecraft:mineable/pickaxe"))) == true
						|| (world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(new ResourceLocation("minecraft:ores/iron"))) == true
						|| (world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(new ResourceLocation("minecraft:anvil"))) == true
						|| (world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(new ResourceLocation("minecraft:ice"))) == true || false == true
						|| (world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(new ResourceLocation("minecraft:shulker_boxes"))) == true || false == true)
				&& !((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.BEDROCK)) {
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
			posX = x - 1;
			posY = y - 1;
			posZ = z - 1;
			for (int index0 = 0; index0 < 3; index0++) {
				for (int index1 = 0; index1 < 3; index1++) {
					for (int index2 = 0; index2 < 3; index2++) {
						if (itemstack.getOrCreateTag().getBoolean("stopMining") == false) {
							if (((world.getBlockState(BlockPos.containing(posX, posY, posZ))).is(BlockTags.create(new ResourceLocation("minecraft:mineable/pickaxe"))) == true
									|| (world.getBlockState(BlockPos.containing(posX, posY, posZ))).is(BlockTags.create(new ResourceLocation("minecraft:ores/iron"))) == true
									|| (world.getBlockState(BlockPos.containing(posX, posY, posZ))).is(BlockTags.create(new ResourceLocation("minecraft:anvil"))) == true
									|| (world.getBlockState(BlockPos.containing(posX, posY, posZ))).is(BlockTags.create(new ResourceLocation("minecraft:ice"))) == true || false == true
									|| (world.getBlockState(BlockPos.containing(posX, posY, posZ))).is(BlockTags.create(new ResourceLocation("minecraft:shulker_boxes"))) == true || false == true)
									&& !((world.getBlockState(BlockPos.containing(posX, posY, posZ))).getBlock() == Blocks.BEDROCK)) {
								{
									BlockPos _pos = BlockPos.containing(posX, posY, posZ);
									Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(posX, posY, posZ), null);
									world.destroyBlock(_pos, false);
								}
								if ((new Object() {
									public boolean checkGamemode(Entity _ent) {
										if (_ent instanceof ServerPlayer _serverPlayer) {
											return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
										} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
											return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
													&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
										}
										return false;
									}
								}.checkGamemode(entity)) == false) {
									{
										ItemStack _ist = itemstack;
										if (_ist.hurt(1, RandomSource.create(), null)) {
											_ist.shrink(1);
											_ist.setDamageValue(0);
										}
									}
									if (itemstack.getDamageValue() == 0) {
										if (world instanceof Level _level) {
											if (!_level.isClientSide()) {
												_level.playSound(null, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.item.break")), SoundSource.NEUTRAL, 1,
														(float) 0.9);
											} else {
												_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.item.break")), SoundSource.NEUTRAL, 1, (float) 0.9, false);
											}
										}
										if (entity instanceof Player _player) {
											ItemStack _stktoremove = itemstack;
											_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
										}
										itemstack.getOrCreateTag().putBoolean("stopMining", true);
									}
								}
							}
						}
						posZ = posZ + 1;
					}
					posZ = z - 1;
					posX = posX + 1;
				}
				posX = x - 1;
				posZ = z - 1;
				posY = posY + 1;
			}
		}
	}
}
