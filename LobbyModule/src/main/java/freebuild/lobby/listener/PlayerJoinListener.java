package freebuild.lobby.listener;

import freebuild.lobby.LobbyModule;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event, Player player) {
        event.setJoinMessage("test");
    }
}
