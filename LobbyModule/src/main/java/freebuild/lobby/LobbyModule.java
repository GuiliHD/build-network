package freebuild.lobby;

import freebuild.lobby.listener.PlayerJoinListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class LobbyModule extends JavaPlugin {

    public static String prefix = "§aLobby §7| §f";

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new PlayerJoinListener(), this);

        System.out.println("LobbyModule geladen!");
    }
}
