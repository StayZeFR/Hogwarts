package fr.stayze.items;

import fr.stayze.PlayerInfo;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class Wand extends Item {

    public Wand(PlayerInfo playerInfo) {

        //temporaire !
        super(playerInfo, new ItemStack(Material.STICK));
    }
}
