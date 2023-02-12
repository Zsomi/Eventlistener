package hu.zsomi.eventlisteners.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedLeaveEvent;

public class BedLeaveEventListener implements Listener {

    @EventHandler
    public void onBedLeaveEvent(PlayerBedLeaveEvent e) {
        Player player = e.getPlayer();

        player.setHealth(0);
    }
}
