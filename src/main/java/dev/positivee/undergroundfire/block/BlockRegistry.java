package dev.positivee.undergroundfire.block;

import dev.positivee.undergroundfire.UndergroundFire;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BlockRegistry
{
	public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(UndergroundFire.MODID);

	public static final DeferredBlock<Block> RICH_COAL_ORE = BLOCKS.register("rich_coal_ore", BlockRichCoalOre::new);
	public static final DeferredBlock<Block> BURNING_RICH_COAL_ORE = BLOCKS.register("burning_rich_coal_ore", BlockBurningRichCoalOre::new);
	public static final DeferredBlock<Block> GAS_TANK = BLOCKS.register("gas_tank", BlockGasTank::new);
	public static final DeferredBlock<Block> GAS_COAL = BLOCKS.register("gas_coal", BlockGasCoal::new);
	public static final DeferredBlock<Block> GAS_COAL_EXTRACTOR = BLOCKS.register("gas_coal_extractor", BlockGasCoalExtractor::new);
}