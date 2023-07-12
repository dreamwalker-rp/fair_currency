package ru.xunto.fair_currency;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import ru.xunto.fair_currency.init.BlockInit;
import ru.xunto.fair_currency.init.ItemInit;

@Mod(modid = FairCurrencyMod.MODID, version = FairCurrencyMod.VERSION)
public class FairCurrencyMod {
    public static final String MODID = "@@MODID@@";
    public static final String VERSION = "@@VERSION@@";

    public static CreativeTabs TAB = new CreativeTabs("Fair Currency") {
        @Override
        public Item getTabIconItem() {
            return ItemInit.goldCoin1000gold;
        }
    };

    @EventHandler
    public void init(FMLInitializationEvent event) {
        BlockInit blockInit = new BlockInit();
        ItemInit itemInit = new ItemInit();
        itemInit.registerAll();
        blockInit.registerAll();
    }
}
