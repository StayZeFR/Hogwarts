package fr.stayze;

import fr.stayze.items.Wand;
import fr.stayze.spells.Spell;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class PlayerInfo {

    private Player player;
    private ArrayList<Spell> spells;
    private Wand wand;

    public PlayerInfo(Player player) {

        this.player = player;
        this.spells = new ArrayList<Spell>();
        this.wand = new Wand(this);

    }

    public Player getPlayer() { return this.player; }

    public void addSpell(Spell spell) { if (!this.spells.contains(spell)) this.spells.add(spell); }

    public void removeSpell(Spell spell) { this.spells.remove(spell); }

    public ArrayList<Spell> getSpells() { return this.spells; }
    public Wand getWand() { return this.wand; }

}
