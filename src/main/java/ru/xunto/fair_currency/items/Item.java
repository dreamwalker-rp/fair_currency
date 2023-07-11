package ru.xunto.fair_currency.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import ru.xunto.fair_currency.FairCurrencyMod;
import ru.xunto.fair_currency.init.ItemInit;

public class Item extends net.minecraft.item.Item {
    private String registryName;

    public Item(String registryName, CreativeTabs tab) {
        this.registryName = registryName;
        this.setUnlocalizedName(registryName);
        this.setTextureName(FairCurrencyMod.MODID + ":" + registryName);
        setCreativeTab(FairCurrencyMod.TAB);
        ItemInit.ITEMS.add(this);
    }

    public void register() {
        GameRegistry.registerItem(this, this.registryName);
    }
}
