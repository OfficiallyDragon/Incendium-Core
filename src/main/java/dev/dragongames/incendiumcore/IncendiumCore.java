package dev.dragongames.incendiumcore;

import dev.dragongames.incendiumcore.listeners.JoinLeaveListener;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class IncendiumCore extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info(ChatColor.GOLD + "IncendiumCore" + ChatColor.BOLD + "has been enabled!");

        getServer().getPluginManager().registerEvents(new JoinLeaveListener(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

    }
}
