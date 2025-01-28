package io.github.arisuwumei.chickengivefeathers;

import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

public class Mod
{
    public static final String ID = "chickensgivefeathers";

    public static final LootPool CHICKEN_LAY_FEATHER_POOL = LootPool.builder().with(
        ItemEntry.builder(Items.FEATHER).apply(
            SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 2)
    ))).build();
}
