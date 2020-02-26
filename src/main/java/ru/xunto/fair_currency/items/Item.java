package ru.xunto.fair_currency.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;

public class Item extends net.minecraft.item.Item {
    private String registryName;

    public Item(String registryName, CreativeTabs tab) {
        this.registryName = registryName;
        this.setUnlocalizedName(registryName);
        //this.setCreativeTab(tab);
    }

    public void register() {
        GameRegistry.registerItem(this, this.registryName);
    }
}
