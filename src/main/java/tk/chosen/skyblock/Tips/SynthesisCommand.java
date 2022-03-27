package tk.chosen.skyblock.Tips;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;

import java.util.ArrayList;
import java.util.List;

public class SynthesisCommand implements CommandExecutor, TabExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length==0)
        {
            sender.sendMessage("§7§l/tips "+ChatColor.WHITE+"1");
        }
        else if(args.length==1)
        {
            String arg_to_string=args[0];
            if (arg_to_string.equals("1"))
            {
                sender.sendMessage(ChatColor.AQUA + "§lHello," + sender.getName() + " !");
                sender.sendMessage(ChatColor.AQUA + "§l我们新增了一些自定义合成表");
                sender.sendMessage(ChatColor.AQUA + "§l您可以在我们的Wiki找到");
                sender.sendMessage(ChatColor.AQUA + "§lhttps://Wiki.Skydom.net.cn/");
            }
            else if(arg_to_string.equals("help"))
            {
                sender.sendMessage(ChatColor.AQUA + "§l/tips 1 查看Wiki");
            }
            else
            {
                sender.sendMessage(ChatColor.AQUA + "§l指令错误 请使用/tips help 查看");
            }
        }

        return false;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        if(args.length==1)
        {
            List<String> list = new ArrayList<>();
            list.add ("version");
            list.add ("info");
            list.add ("update");
            list.add ("help");
            return list;
        }
        return null;
    }
}
