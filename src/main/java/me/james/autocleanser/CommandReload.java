package me.james.autocleanser;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandReload implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        AutoCleanser.getInstance().reloadConfig();
        sender.sendMessage("§aAutoCleanser config reloaded.");
        return true;
    }
}