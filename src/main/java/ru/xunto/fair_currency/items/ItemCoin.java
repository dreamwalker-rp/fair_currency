package ru.xunto.fair_currency.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import ru.xunto.fair_currency.FairCurrencyMod;

public class ItemCoin extends BaseItem {
    private BaseItem lessCurrency = null;
    private BaseItem higherCurrency = null;

    public ItemCoin(String registryName) {
        super(registryName);
    }

    public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player) {
        if (item.stackSize >= 10) this.getHigherCurrency(item, world, player);
        else this.getLessCurrency(item, world, player);

        return item;
    }

    private void getLessCurrency(ItemStack item, World world, EntityPlayer player) {
        if (lessCurrency == null) return;

        ItemStack itemStack = new ItemStack(lessCurrency, 10);
        player.inventory.addItemStackToInventory(itemStack);

        ItemStack newItemStack = new ItemStack(this, item.stackSize - 1);
        player.inventory.setInventorySlotContents(player.inventory.currentItem, newItemStack);
    }

    private void getHigherCurrency(ItemStack item, World world, EntityPlayer player) {
        if (higherCurrency == null) return;

        ItemStack itemStack = new ItemStack(higherCurrency);
        player.inventory.addItemStackToInventory(itemStack);

        ItemStack newItemStack = new ItemStack(this, item.stackSize - 10);
        player.inventory.setInventorySlotContents(player.inventory.currentItem, newItemStack);
    }

    public void setLesserCurrency(BaseItem lessCurrency) {
        this.lessCurrency = lessCurrency;
    }

    public void setHigherCurrency(BaseItem higherCurrency) {
        this.higherCurrency = higherCurrency;
    }
}
