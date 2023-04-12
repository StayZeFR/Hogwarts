package fr.stayze;

import fr.stayze.database.Database;
import fr.stayze.events.PlayerJoinListener;
import fr.stayze.player.PlayerInfo;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;

public class Hogwarts extends JavaPlugin {

    private static Hogwarts instance;

    private HashMap<Player, PlayerInfo> playersInfo;
    private FileConfiguration config;

    @Override
    public void onEnable() {

        getLogger().info("Hello world");
        init();

    }

    private void init() {

        instance = this;
        this.saveDefaultConfig();
        this.playersInfo = new HashMap<>();
        this.getServer().getPluginManager().registerEvents(new PlayerJoinListener(), this);
        Database.connect();

    }

    public PlayerInfo getPlayer(Player p) { return this.playersInfo.get(p); }
    public void addPlayer(Player p) {
        PlayerInfo playerInfo = new PlayerInfo(p);
        this.playersInfo.put(p, playerInfo);
    }
    public FileConfiguration getConfig() { return this.config; }

    public static Hogwarts getInstance() {
        return instance;
    }

}
