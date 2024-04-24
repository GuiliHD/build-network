package freebuild.lobby;

import freebuild.lobby.listener.PlayerJoinListener;
import lombok.Getter;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class LobbyModule extends JavaPlugin {

    @Getter
    public static String prefix = "§aLobby §7| §f";

    @Override
    public void onEnable() {
        implementListener();

        System.out.println("&aLobbyModule geladen.");
    }

    private void implementListener() {
        getServer().getPluginManager().registerEvents(new PlayerJoinListener(), this);
    }
}
