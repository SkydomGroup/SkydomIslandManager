package org.skydom.chosen.skyblock.Tips;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class Synthesis implements Listener {
    @EventHandler
    public void onPlayerJoinEvent(PlayerJoinEvent event){
        try {
            Thread.currentThread().sleep(1); // 等待1毫秒
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        event.getPlayer().sendMessage(ChatColor.AQUA + "§lHello," + event.getPlayer().getName() + "!");
        event.getPlayer().sendMessage(ChatColor.AQUA + "§l欢迎加入服务器，我们新增了一些自定义合成表");
        event.getPlayer().sendMessage(ChatColor.AQUA + "§l您可以在我们的Wiki找到");
        event.getPlayer().sendMessage(ChatColor.AQUA + "§lhttps://Wiki.Skydom.org/" + "        点击链接打开");
        event.getPlayer().sendMessage(ChatColor.AQUA + "§l如果您是新玩家，请输入/is创建属于你自己的岛屿");
        event.getPlayer().sendMessage(ChatColor.AQUA + "§l如果您想要再次显示这个信息，请输入/Tips 1");
        // 发送消息
    }
}