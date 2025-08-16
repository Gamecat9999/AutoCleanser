package me.james.autocleanser;

import org.bukkit.plugin.java.JavaPlugin;

public class AutoCleanser extends JavaPlugin {
    private static AutoCleanser instance;

    @Override
    public void onEnable() {
        instance = this;
        saveDefaultConfig();
        getCommand("cleanser").setExecutor(new CommandReload());
        new CleanserTask().runTaskTimer(this, 0, 20L * 60 * getConfig().getInt("interval-minutes"));
    }

    public static AutoCleanser getInstance() {
        return instance;
    }
}