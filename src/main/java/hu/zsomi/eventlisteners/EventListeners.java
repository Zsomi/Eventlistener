package hu.zsomi.eventlisteners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class EventListeners extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        System.out.println("The plugin loaded!");

        getServer().getPluginManager().registerEvents(this, this);
        getServer().getPluginManager().registerEvents(this, this);

    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        e.setJoinMessage("Hi Player!");
    }

    @EventHandler
    public void onBedLeaveEvent(PlayerBedLeaveEvent e) {
        Player player = e.getPlayer();
        player.setHealth(2);
    }


}
