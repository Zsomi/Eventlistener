package hu.zsomi.eventlisteners;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class EventListeners extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        System.out.println("The plugin loaded!");

        getServer().getPluginManager().registerEvents(this, this);

    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        System.out.println("A palyer joined the server!");
    }
}
