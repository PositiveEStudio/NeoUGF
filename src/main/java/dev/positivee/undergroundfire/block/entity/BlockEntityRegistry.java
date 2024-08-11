package dev.positivee.undergroundfire.block.entity;

import dev.positivee.undergroundfire.UndergroundFire;
import dev.positivee.undergroundfire.block.BlockRegistry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class BlockEntityRegistry
{
	public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPE = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, UndergroundFire.MODID);

	public static final Supplier<BlockEntityType<BlockEntityRichCoalOre>> RICH_COAL_ORE = BLOCK_ENTITY_TYPE.register("rich_coal_ore", () -> BlockEntityType.Builder.of(BlockEntityRichCoalOre::new, BlockRegistry.RICH_COAL_ORE.get()).build(null));
	public static final Supplier<BlockEntityType<BlockEntityGasCoal>> GAS_COAL = BLOCK_ENTITY_TYPE.register("gas_coal", () -> BlockEntityType.Builder.of(BlockEntityGasCoal::new, BlockRegistry.GAS_COAL.get()).build(null));
	public static final Supplier<BlockEntityType<BlockEntityBurningRichCoalOre>> BURNING_RICH_COAL_ORE = BLOCK_ENTITY_TYPE.register("burning_rich_coal_ore", () -> BlockEntityType.Builder.of(BlockEntityBurningRichCoalOre::new, BlockRegistry.BURNING_RICH_COAL_ORE.get()).build(null));
	public static final Supplier<BlockEntityType<BlockEntityGasCoalExtractor>> GAS_COAL_EXTRACTOR = BLOCK_ENTITY_TYPE.register("gas_coal_extractor", () -> BlockEntityType.Builder.of(BlockEntityGasCoalExtractor::new, BlockRegistry.GAS_COAL_EXTRACTOR.get()).build(null));
}
