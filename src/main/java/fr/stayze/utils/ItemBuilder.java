package fr.stayze.utils;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class ItemBuilder {

    private final ItemStack itemStack;

    public ItemBuilder(ItemStack itemStack) {
        this.itemStack = itemStack;
    }

    public ItemBuilder(Material material) {
        this.itemStack = new ItemStack(material);
    }

    public ItemBuilder setName(String name) {
        ItemMeta itemMeta = this.itemStack.getItemMeta();
        assert itemMeta != null;
        itemMeta.setDisplayName(name);
        this.itemStack.setItemMeta(itemMeta);
        return this;
    }

    public ItemBuilder setLore(List<String> lines) {
        ItemMeta itemMeta = this.itemStack.getItemMeta();
        itemMeta.setLore(lines);
        this.itemStack.setItemMeta(itemMeta);
        return this;
    }

    public ItemBuilder setAmount(int i) {
        this.itemStack.setAmount(i);
        return this;
    }

    public ItemStack toItemStack() {
        return this.itemStack;
    }
}
