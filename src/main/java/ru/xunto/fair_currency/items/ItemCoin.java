package ru.xunto.fair_currency.items;

import net.minecraft.item.ItemStack;
import ru.xunto.fair_currency.FairCurrencyMod;

public class ItemCoin extends Item {
    public ItemCoin(String registryName) {
        super(registryName, FairCurrencyMod.tab);
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return super.getUnlocalizedName(stack) + stack.getItemDamage();
    }
}
