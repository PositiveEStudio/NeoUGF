package dev.positivee.undergroundfire.entity;

import dev.positivee.undergroundfire.UndergroundFire;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class EntityRegistry
{
	public static final DeferredRegister<EntityType<?>> ENTITY_TYPE = DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, UndergroundFire.MODID);

	public static final Supplier<EntityType<EntityMouse>> MOUSE = ENTITY_TYPE.register("mouse",
			() -> EntityType.Builder.of(EntityMouse::new, MobCategory.MISC)
					.sized(0.25F, 1.1F)
					.clientTrackingRange(16).updateInterval(10)
					.build(UndergroundFire.MODID + ":mouse"));
}
