package me.james.autocleanser;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Item;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.List;

public class CleanserTask extends BukkitRunnable {
    @Override
    public void run() {
        List<String> whitelist = AutoCleanser.getInstance().getConfig().getStringList("whitelist");
        int removed = 0;

        for (World world : Bukkit.getWorlds()) {
            for (Item item : world.getEntitiesByClass(Item.class)) {
                Material type = item.getItemStack().getType();
                if (!whitelist.contains(type.name())) {
                    item.remove();
                    removed++;
                }
            }
        }

        if (AutoCleanser.getInstance().getConfig().getBoolean("broadcast-removal") && removed > 0) {
            Bukkit.broadcastMessage("§eAutoCleanser removed §c" + removed + " §eitems.");
        }
    }
}