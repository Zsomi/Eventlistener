package hu.zsomi.eventlisteners;

import hu.zsomi.eventlisteners.listeners.BedLeaveEventListener;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class EventListeners extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        System.out.println("The plugin loaded!");

        getServer().getPluginManager().registerEvents(new BedLeaveEventListener(),this);
    }
}
