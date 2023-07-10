package org.skydom.chosen.server.skydomislandmanager.Settings;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.skydom.chosen.server.skydomislandmanager.SkydomIslandManager;

import java.util.*;

public class PotionEffectKeeper implements Listener {
    private static final Map<UUID, Collection<PotionEffect>> effect = new HashMap<>();

    public PotionEffectKeeper() {
        Bukkit.getPluginManager().registerEvents(this, JavaPlugin.getPlugin(SkydomIslandManager.class));
    }

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent e) {
        Player player = e.getEntity();
        effect.put(player.getUniqueId(), player.getActivePotionEffects());
    }

    @EventHandler
    public void onPlayerRespawn(PlayerRespawnEvent e) {
        Player player = e.getPlayer();
        Bukkit.getScheduler().runTaskLater(JavaPlugin.getPlugin(SkydomIslandManager.class), () -> {
            Collection<PotionEffect> potionEffects = effect.getOrDefault(player.getUniqueId(), List.of());
            for (PotionEffect potionEffect : potionEffects) {
                player.addPotionEffect(potionEffect);
            }
        }, 3L);
    }
}
