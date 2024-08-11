package dev.positivee.undergroundfire.item;

import dev.positivee.undergroundfire.UndergroundFire;
import dev.positivee.undergroundfire.block.BlockRegistry;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ItemRegistry
{
	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(UndergroundFire.MODID);

	public static final DeferredItem<Item> MOUSE = ITEMS.register("mouse", ItemMouse::new);

	public static final DeferredItem<BlockItem> RICH_COAL_ORE = ITEMS.register("rich_coal_ore", () -> new BlockItem(BlockRegistry.RICH_COAL_ORE.get(), new Item.Properties()));
	public static final DeferredItem<BlockItem> BURNING_RICH_COAL_ORE = ITEMS.register("burning_rich_coal_ore", () -> new BlockItem(BlockRegistry.BURNING_RICH_COAL_ORE.get(), new Item.Properties()));
	public static final DeferredItem<BlockItem> GAS_TANK = ITEMS.register("gas_tank", () -> new BlockItem(BlockRegistry.GAS_TANK.get(), new Item.Properties().stacksTo(1)));
	public static final DeferredItem<BlockItem> GAS_COAL_EXTRACTOR = ITEMS.register("gas_coal_extractor", () -> new BlockItem(BlockRegistry.GAS_COAL_EXTRACTOR.get(), new Item.Properties()));
}
