package fr.stayze.items;

import fr.stayze.player.PlayerInfo;
import org.bukkit.inventory.ItemStack;

abstract class Item {

    protected ItemStack item;
    protected PlayerInfo playerInfo;
    protected int level;

    public Item(PlayerInfo playerInfo, ItemStack item) {
        this.playerInfo = playerInfo;
        this.item = item;
    }

    public ItemStack getItem() { return this.item; }
    public PlayerInfo getPlayerInfo() { return this.playerInfo; }
    public int getLevel() { return this.level; }
    public void setLevel(int level) { this.level = level; }

    public void give() { this.playerInfo.getPlayer().getInventory().addItem(this.item); }

}
