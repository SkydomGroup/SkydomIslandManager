package tk.chosen.skyblock.Tips;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.List;

public interface onTabComplete extends CommandExecutor {
    @Override
    @ParametersAreNonnullByDefault
    boolean onCommand(CommandSender sender, Command command, String label, String[] args);

    List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args);
}
