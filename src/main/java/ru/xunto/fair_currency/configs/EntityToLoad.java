package ru.xunto.fair_currency.configs;

import net.minecraft.item.Item;

import java.util.HashMap;


public class EntityToLoad {
    //private BlockRecord[] blocks;
    private HashMap<String, BlockData> blocks;
    private Item[] items;

    public EntityToLoad(HashMap<String, BlockData> Blocks, Item[] Items) {
        this.blocks = Blocks;
        this.items = Items;
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
