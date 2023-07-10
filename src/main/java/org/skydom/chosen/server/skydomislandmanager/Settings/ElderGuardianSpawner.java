package org.skydom.chosen.server.skydomislandmanager.Settings;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Guardian;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.skydom.chosen.server.skydomislandmanager.SkydomIslandManager;

public class ElderGuardianSpawner implements Listener {
    public ElderGuardianSpawner() {
        Bukkit.getPluginManager().registerEvents(this, JavaPlugin.getPlugin(SkydomIslandManager.class));
    }

    @EventHandler
    public void on(EntityDamageByEntityEvent event) {
        Entity damager = event.getDamager();
        Entity entity = event.getEntity();
        if (!damager.getType().equals(EntityType.LIGHTNING)) {
            return;
        }
        if (!entity.getType().equals(EntityType.GUARDIAN)) {
            return;
        }
        Guardian guardian = (Guardian) entity;
        Location location = guardian.getLocation();
        guardian.remove();
        location.getWorld().spawnEntity(location, EntityType.ELDER_GUARDIAN);
    }
}
