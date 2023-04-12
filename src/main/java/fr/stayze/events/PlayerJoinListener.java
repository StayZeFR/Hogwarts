package fr.stayze.events;

import fr.stayze.Hogwarts;
import fr.stayze.spells.Incendio;
import fr.stayze.spells.Spell;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        if (Hogwarts.getPlayer(p) == null) { Hogwarts.addPlayer(p); }
        Incendio incendio = new Incendio();
        incendio.setSpellLevel(5);
        Hogwarts.getPlayer(p).addSpell(incendio);
        for (Spell spell : Hogwarts.getPlayer(p).getSpells()) {
            Bukkit.broadcastMessage(spell.toString());
        }
        Hogwarts.getPlayer(p).getWand().give();
    }

}
