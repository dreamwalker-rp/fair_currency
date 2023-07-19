package ru.xunto.fair_currency.configs;

import net.minecraft.item.Item;

import java.util.HashMap;

public class EntityToLoad {
    private HashMap<String, Integer> blocksAmount;
    private HashMap<String, BlockData> blocks;
    private Item[] items;

    public EntityToLoad(HashMap<String, Integer> blocksAmount, HashMap<String, BlockData> blocks, Item[] items) {
        this.blocksAmount = blocksAmount;
        this.blocks = blocks;
        this.items = items;
    }

    public HashMap<String, Integer> getBlocksAmount() {
        return blocksAmount;
    }

    public void setBlocksAmount(HashMap<String, Integer> blocksAmount) {
        this.blocksAmount = blocksAmount;
    }

    public Integer getBlockAmountByKey(String field){
        if (!blocksAmount.containsKey(field)){
            return 0;
        }
        return blocksAmount.get(field);
    }

    public HashMap<String, BlockData> getBlocks() {
        return blocks;
    }

    public void setBlocks(HashMap<String, BlockData> blocks) {
        this.blocks = blocks;
    }

    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }
}
