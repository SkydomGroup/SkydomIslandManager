package org.skydom.chosen.skyblock.Tips;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.ArrayList;
import java.util.List;

public class SynthesisCommand implements CommandExecutor, TabCompleter {
    @Override
    @ParametersAreNonnullByDefault
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(args.length==0){
            sender.sendMessage(ChatColor.AQUA + "你输入的指令好像有问题哎，快快输入/Tips help查看帮助吧！");
            return true;
        }
        if(args.length==1){
            String arg_to_string=args[0];
            if (arg_to_string.equals("1")){
                sender.sendMessage(ChatColor.AQUA + "§lHello," + sender.getName() + "!");
                sender.sendMessage(ChatColor.AQUA + "§l我们新增了一些自定义合成表");
                sender.sendMessage(ChatColor.AQUA + "§l您可以在我们的Wiki找到");
                sender.sendMessage(ChatColor.AQUA + "§lhttps://Wiki.Skydom.org/" + "        点击链接打开");
                sender.sendMessage(ChatColor.AQUA + "§l如果您是新玩家，请输入/is创建属于你自己的岛屿");
                sender.sendMessage(ChatColor.AQUA + "§l如果您想要再次显示这个信息，请输入/Tips 1");
                // 发送消息
            } else if (arg_to_string.equals("help")){
                sender.sendMessage(ChatColor.AQUA + "§l/Tips 1 显示小提示");
            }
            else {
                sender.sendMessage(ChatColor.AQUA + "你输入的指令好像有问题哎，快快输入/Tips help查看帮助吧！");
            }
            return true;
        }
        return false;
    }
    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        if(args.length==1)
        {
            List<String> list = new ArrayList<>();
            list.add ("1");
            list.add ("help");
            return list;
        }
        return null;
    }
}
// Tips