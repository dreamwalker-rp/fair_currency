package ru.xunto.fair_currency.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import ru.xunto.fair_currency.FairCurrencyMod;

public class ItemCoin extends Item {
    private Item lessCurrency = null;
    private Item currentCurrency;
    private Item hightCurrency = null;

    int lessStep = 1;
    int hightStep = 10;

    public ItemCoin(String registryName) {
        super(registryName, FairCurrencyMod.tab);
        this.setTextureName(FairCurrencyMod.MODID+":"+registryName);
        this.currentCurrency = this;
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return super.getUnlocalizedName(stack) + stack.getItemDamage();
    }

    public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player){
        if (item.stackSize >= 10){
            this.getHightCurrency(item, world, player);
        }else {
            this.getLessCurrency(item, world, player);
        }
        return item;
    }

    private void getLessCurrency (ItemStack item, World world, EntityPlayer player){
        if (lessCurrency == null){
            return;
        }
        ItemStack itemStack = new ItemStack(lessCurrency);
        itemStack.stackSize = 10;
        player.inventory.addItemStackToInventory(itemStack);
        ItemStack newItemStack = new ItemStack(this);
        newItemStack.stackSize = item.stackSize - 1;
        player.inventory.setInventorySlotContents(player.inventory.currentItem, newItemStack);
    }

    private void getHightCurrency (ItemStack item, World world, EntityPlayer player){
        if (hightCurrency == null){
            return;
        }
        ItemStack itemStack = new ItemStack(hightCurrency);
        player.inventory.addItemStackToInventory(itemStack);
        ItemStack newItemStack = new ItemStack(this);
        newItemStack.stackSize = item.stackSize - 10;
        player.inventory.setInventorySlotContents(player.inventory.currentItem, newItemStack);
    }

    public Item getLessCurrency() {
        return lessCurrency;
    }

    public void setLessCurrency(Item lessCurrency) {
        this.lessCurrency = lessCurrency;
    }

    public Item getCurrentCurrency() {
        return currentCurrency;
    }

    public void setCurrentCurrency(Item currentCurrency) {
        this.currentCurrency = currentCurrency;
    }

    public Item getHightCurrency() {
        return hightCurrency;
    }

    public void setHightCurrency(Item hightCurrency) {
        this.hightCurrency = hightCurrency;
    }

}
