package dev.positivee.undergroundfire;

import com.mojang.logging.LogUtils;
import dev.positivee.undergroundfire.block.BlockRegistry;
import dev.positivee.undergroundfire.block.entity.BlockEntityRegistry;
import dev.positivee.undergroundfire.creative.CreativeTabRegistry;
import dev.positivee.undergroundfire.datagen.DataGen;
import dev.positivee.undergroundfire.entity.EntityRegistry;
import dev.positivee.undergroundfire.item.ItemRegistry;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.NeoForge;
import org.slf4j.Logger;

@Mod(UndergroundFire.MODID)
public class UndergroundFire
{
	public static final String MODID = "undergroundfire";
	private static final Logger LOGGER = LogUtils.getLogger();

	public UndergroundFire(IEventBus modEventBus, ModContainer modContainer)
	{
		NeoForge.EVENT_BUS.register(this);

		ItemRegistry.ITEMS.register(modEventBus);
		BlockRegistry.BLOCKS.register(modEventBus);
		BlockEntityRegistry.BLOCK_ENTITY_TYPE.register(modEventBus);
		EntityRegistry.ENTITY_TYPE.register(modEventBus);
		CreativeTabRegistry.CREATIVE_MODE_TAB.register(modEventBus);

		modEventBus.addListener(DataGen::gatherData);
	}
}
