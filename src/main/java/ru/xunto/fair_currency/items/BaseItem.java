package ru.xunto.fair_currency.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import ru.xunto.fair_currency.FairCurrencyMod;
import ru.xunto.fair_currency.init.ItemInit;

public class BaseItem extends Item {
    private final String registryName;

    public BaseItem(String registryName) {
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
