package ru.xunto.fair_currency.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import ru.xunto.fair_currency.FairCurrencyMod;

public class ItemCoin extends Item {
    private Item lessCurrency = null;
    private Item higherCurrency = null;

    public ItemCoin(String registryName) {
        super(registryName, FairCurrencyMod.tab);
        this.setTextureName(FairCurrencyMod.MODID + ":" + registryName);
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

    public void setLessCurrency(Item lessCurrency) {
        this.lessCurrency = lessCurrency;
    }

    public void setHigherCurrency(Item higherCurrency) {
        this.higherCurrency = higherCurrency;
    }
}
