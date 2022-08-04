package net.skydommc.chosen.skyblock.Settings;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

public class DeleteSomeCreatures implements Listener {
    @EventHandler
    public void on(CreatureSpawnEvent event) {
        Entity entity = event.getEntity();
        if (entity.getType().equals(EntityType.BAT)) {
            entity.remove();
        }
        if (entity.getType().equals(EntityType.PHANTOM)) {
            entity.remove();
        }
    }
}
