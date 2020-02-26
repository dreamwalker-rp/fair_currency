package ru.xunto.fair_currency.items;

import net.minecraft.item.ItemStack;
import ru.xunto.fair_currency.FairCurrencyMod;

public class ItemCoin1Gold extends ItemCoin {
    private String itemName = "1gold";

    public ItemCoin1Gold(String registryName) {
        super(registryName);
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return super.getUnlocalizedName(stack) + stack.getItemDamage();
    }
}
