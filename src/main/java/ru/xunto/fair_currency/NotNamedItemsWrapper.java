package ru.xunto.fair_currency;

import java.util.ArrayList;
import java.util.List;

public class NotNamedItemsWrapper {

    public String[] getItemsName() {
        List<String> itemNames = new ArrayList<String>();
        for (int i = 0; i < 200; i++) {
            itemNames.add("item_" + i);
        }
        return itemNames.toArray(new String[]{});
    }
}
