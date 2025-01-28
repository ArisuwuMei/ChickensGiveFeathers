package io.github.arisuwumei.chickengivefeathers.fabric;

import io.github.arisuwumei.chickengivefeathers.Mod;
import net.minecraft.loot.LootTables;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.LootTableLoadEvent;

@net.neoforged.fml.common.Mod(Mod.ID)
@EventBusSubscriber(modid = Mod.ID)
public class NeoforgeMod
{
    @SubscribeEvent
    public static void onLootTableLoading(LootTableLoadEvent event)
    {
        if (!event.getName().equals(LootTables.CHICKEN_LAY_GAMEPLAY.getValue())) return;

        event.getTable().addPool(Mod.CHICKEN_LAY_FEATHER_POOL);
    }
}
