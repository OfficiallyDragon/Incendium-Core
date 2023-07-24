package dev.dragongames.incendiumcore.listeners;

import org.bukkit.ChatColor;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinLeaveListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        event.setJoinMessage(ChatColor.GOLD + "Incendium" + ChatColor.GRAY + " » " + ChatColor.YELLOW + player.getName() + " has joined the server!");

        player.sendTitle(ChatColor.UNDERLINE + "Welcome To", ChatColor.GOLD + "" + ChatColor.BOLD + "Incendium SMP!", 10, 40, 10);
        player.spawnParticle(Particle.TOTEM, player.getLocation(), 1000);
        player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1, 1);

    }

    @EventHandler
    public void onPlayerLeave(PlayerQuitEvent event) {
        Player player = event.getPlayer();
        event.setQuitMessage(ChatColor.GOLD + "Incendium" + ChatColor.GRAY + " » " + ChatColor.YELLOW + player.getName() + " has left the server!");

    }

}
