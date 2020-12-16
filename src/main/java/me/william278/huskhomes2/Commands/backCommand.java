package me.william278.huskhomes2.Commands;

import me.william278.huskhomes2.Objects.TeleportationPoint;
import me.william278.huskhomes2.dataManager;
import me.william278.huskhomes2.messageManager;
import me.william278.huskhomes2.teleportManager;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class backCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            TeleportationPoint lastPosition = dataManager.getPlayerLastPosition(p);
            if (lastPosition != null) {
                teleportManager.queueTimedTeleport(p, lastPosition);
            } else {
                messageManager.sendMessage(p, "error_no_last_position");
            }
            return true;
        }
        return false;
    }
}