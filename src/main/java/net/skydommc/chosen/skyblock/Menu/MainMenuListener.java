package net.skydommc.chosen.skyblock.Menu;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.ItemStack;

import java.util.Random;

public class MainMenuListener implements Listener {
    public static final Random RANDOM = new Random();
    @EventHandler
    public void onClick(InventoryClickEvent e){
        Player player = (Player) e.getWhoClicked();
        InventoryView MainMenu = player.getOpenInventory();
        if (MainMenu.getTitle().equals(RecipeMenu.TITLE)) {
            e.setCancelled(true);
            ItemStack clickedItem = e.getCurrentItem();
            if (clickedItem == null) {
                return;
            }
            if (clickedItem.getItemMeta().getDisplayName().equals(RecipeMenu.IRON)) {
                player.closeInventory();
                // 子类名.open((player));
                // player.sendMessage("文字");
                return;
            }
        }
    }
}
