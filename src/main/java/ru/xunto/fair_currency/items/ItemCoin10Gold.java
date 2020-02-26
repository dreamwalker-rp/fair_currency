package ru.xunto.fair_currency.items;

import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import ru.xunto.fair_currency.FairCurrencyMod;

public class ItemCoin10Gold extends ItemCoin {

    public ItemCoin10Gold(String registryName) {
        super(registryName);
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return super.getUnlocalizedName(stack) + stack.getItemDamage();
    }

//    public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player){
//        if (item.stackSize >= 10){
//            this.getHightCurrency(item, world, player);
//        }else {
//            this.getLessCurrency(item, world, player);
//        }
//        return item;
//    }
//
//    private void getLessCurrency (ItemStack item, World world, EntityPlayer player){
//        System.out.println("getLessCurrency");
//        ItemStack itemStack = new ItemStack(FairCurrencyMod.goldCoin1gold);
//        itemStack.stackSize = 10;
//        //player.inventory.decrStackSize(player.inventory.currentItem, 1);
//        //item.stackSize = item.stackSize - 1;
//        player.inventory.addItemStackToInventory(itemStack);
//        ItemStack newItemStack = new ItemStack(FairCurrencyMod.goldCoin10gold);
//        newItemStack.stackSize = item.stackSize - 1;
//        player.inventory.setInventorySlotContents(player.inventory.currentItem, newItemStack);
//    }
//
//    private void getHightCurrency (ItemStack item, World world, EntityPlayer player){
//        System.out.println("getHightCurrency");
//        //item.stackSize = item.stackSize - 10;
//        //player.inventory.decrStackSize(player.inventory.currentItem, 10);
//        ItemStack itemStack = new ItemStack(FairCurrencyMod.goldCoin100gold);
//        player.inventory.addItemStackToInventory(itemStack);
//        ItemStack newItemStack = new ItemStack(FairCurrencyMod.goldCoin10gold);
//        newItemStack.stackSize = item.stackSize - 10;
//        player.inventory.setInventorySlotContents(player.inventory.currentItem, newItemStack);
//    }
}
