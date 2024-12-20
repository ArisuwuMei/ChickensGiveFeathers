package mei.arisuwu.chickensgivefeathers;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

public class Mod implements ModInitializer
{
	@Override
	public void onInitialize()
	{
		LootTableEvents.MODIFY.register((registryKey, lootTableBuilder, lootTableSource, wrapperLookup) -> {
			if (!lootTableSource.isBuiltin() || !registryKey.equals(LootTables.CHICKEN_LAY_GAMEPLAY))
				return;

			var featherPool = LootPool.builder().with(ItemEntry.builder(Items.FEATHER).apply(SetCountLootFunction.builder(
					UniformLootNumberProvider.create(1, 3)
			)));

			lootTableBuilder.pool(featherPool);
		});
	}
}