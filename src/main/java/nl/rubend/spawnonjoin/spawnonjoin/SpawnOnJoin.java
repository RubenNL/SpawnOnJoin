package nl.rubend.spawnonjoin.spawnonjoin;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class SpawnOnJoin extends JavaPlugin implements Listener {
	@Override public void onEnable() {
		Bukkit.getPluginManager().registerEvents(this, this);
	}
	@EventHandler private void onJoin(PlayerJoinEvent event) {
		event.getPlayer().performCommand("lobby");
	}
}
