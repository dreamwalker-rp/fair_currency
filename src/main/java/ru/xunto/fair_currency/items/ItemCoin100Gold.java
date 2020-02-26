package ru.xunto.fair_currency.items;

import net.minecraft.item.ItemStack;

public class ItemCoin100Gold extends ItemCoin {

    public ItemCoin100Gold(String registryName) {
        super(registryName);
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return super.getUnlocalizedName(stack) + stack.getItemDamage();
    }
}
