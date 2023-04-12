package fr.stayze;

import fr.stayze.spells.Spell;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class PlayerInfo {

    private Player player;
    private ArrayList<Spell> spells;

    public PlayerInfo(Player player) {

        this.player = player;
        this.spells = new ArrayList<Spell>();

    }

    public Player getPlayer() { return this.player; }

    public void addSpell(Spell spell) { if (!this.spells.contains(spell)) this.spells.add(spell); }

    public void removeSpell(Spell spell) { this.spells.remove(spell); }

    public ArrayList<Spell> getSpells() { return this.spells; }

}
