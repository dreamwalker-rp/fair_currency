package ru.xunto.fair_currency.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;

public class Item extends net.minecraft.item.Item {
    private String registryName;
    private CreativeTabs tab;

    public Item(String registryName, CreativeTabs tab) {
        this.registryName = registryName;
        this.tab = tab;
        this.setUnlocalizedName(registryName);
    }

    public void register() {
        GameRegistry.registerItem(this, this.registryName);
    }
}
