package tk.chosen.skyblock.Tips;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryOpenEvent;

public class Synthesis implements Listener {
    @EventHandler
    public void onInventoryOpenEvent(InventoryOpenEvent event){
        event.getPlayer().sendMessage(ChatColor.AQUA + "§lHello," + event.getPlayer().name() + " !");
        event.getPlayer().sendMessage(ChatColor.AQUA + "§l您正在合成，我们新增了一些自定义合成表");
        event.getPlayer().sendMessage(ChatColor.AQUA + "§l您可以在我们的Wiki找到");
        event.getPlayer().sendMessage(ChatColor.AQUA + "§lhttps://Wiki.Skydom.net.cn/");
        event.getPlayer().sendMessage(ChatColor.AQUA + "§l如果您想要再次显示这个信息，请输入/tips 1");
    }
}
