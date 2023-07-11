package ru.xunto.fair_currency.init;

import net.minecraft.item.Item;
import ru.xunto.fair_currency.FairCurrencyMod;
import ru.xunto.fair_currency.NotNamedItemsWrapper;
import ru.xunto.fair_currency.items.ItemCoin;

import java.util.ArrayList;
import java.util.List;

public class ItemInit {
    public static List<Item> ITEMS = new ArrayList<Item>();

    public static final ItemCoin goldCoin1gold = new ItemCoin("1_gold_coin");
    public static final ItemCoin goldCoin10gold = new ItemCoin("10_gold_coin");
    public static final ItemCoin goldCoin100gold = new ItemCoin("100_gold_coin");
    public static final ItemCoin goldCoin1000gold = new ItemCoin("1000_gold_coin");

    public ItemInit(){
        init();
    }

    public void init() {
        goldCoin1gold.setHigherCurrency(goldCoin10gold);

        goldCoin10gold.setLesserCurrency(goldCoin1gold);
        goldCoin10gold.setHigherCurrency(goldCoin100gold);

        goldCoin100gold.setLesserCurrency(goldCoin10gold);
        goldCoin100gold.setHigherCurrency(goldCoin1000gold);

        goldCoin1000gold.setLesserCurrency(goldCoin100gold);
    }

    public void addNotNamedItems() {
        String[] notNamedItem = getNotNamedFilesName();
        for (String itemName : notNamedItem) {
            addSimpleItems(itemName);
        }
    }

    public Item addSimpleItems(String itemName) {
        final ru.xunto.fair_currency.items.Item newItem = new ru.xunto.fair_currency.items.Item(itemName, FairCurrencyMod.TAB);
        newItem.register();
        newItem.setCreativeTab(FairCurrencyMod.TAB);
        return newItem;
    }

    public String[] getNotNamedFilesName() {
        NotNamedItemsWrapper notNamedItemsWrapper = new NotNamedItemsWrapper();
        return notNamedItemsWrapper.getItemsName();
    }


}
