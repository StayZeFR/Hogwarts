package fr.stayze;

import fr.stayze.events.PlayerJoinListener;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;

public class Hogwarts extends JavaPlugin {

    private static HashMap<Player, PlayerInfo> playersInfo;

    @Override
    public void onEnable() {

        getLogger().info("Hello world");
        init();

    }

    private void init() {

        playersInfo = new HashMap<>();
        this.getServer().getPluginManager().registerEvents(new PlayerJoinListener(), this);

    }

    public static PlayerInfo getPlayer(Player p) { return playersInfo.get(p); }
    public static void addPlayer(Player p) {
        PlayerInfo playerInfo = new PlayerInfo(p);
        playersInfo.put(p, playerInfo);
    }

}
