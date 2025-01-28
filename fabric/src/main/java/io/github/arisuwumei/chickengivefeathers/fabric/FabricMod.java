package io.github.arisuwumei.chickengivefeathers.fabric;

import io.github.arisuwumei.chickengivefeathers.Mod;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.fabricmc.fabric.api.loot.v3.LootTableSource;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.LootTables;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryWrapper;

@SuppressWarnings("unused")
public class FabricMod implements ModInitializer
{
	@Override
	public void onInitialize()
	{
		LootTableEvents.MODIFY.register(FabricMod::onLootTableLoading);
	}

	public static void onLootTableLoading(RegistryKey<LootTable> registryKey, LootTable.Builder builder, LootTableSource source, RegistryWrapper.WrapperLookup wrapperLookup)
	{
		if (!registryKey.equals(LootTables.CHICKEN_LAY_GAMEPLAY)) return;

		builder.pool(Mod.CHICKEN_LAY_FEATHER_POOL);
	}
}