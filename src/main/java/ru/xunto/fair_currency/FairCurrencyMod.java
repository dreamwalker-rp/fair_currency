package ru.xunto.fair_currency;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import ru.xunto.fair_currency.items.ItemCoin;

@Mod(modid = FairCurrencyMod.MODID, version = FairCurrencyMod.VERSION)
public class FairCurrencyMod {
    public static final String MODID = "@@MODID@@";
    public static final String VERSION = "@@VERSION@@";

    public static final ItemCoin goldCoin = new ItemCoin("gold_coin");

    public static CreativeTabs tab = new CreativeTabs("Fair Currency") {
        @Override
        public net.minecraft.item.Item getTabIconItem() {
            return FairCurrencyMod.goldCoin;
        }
    };

    @EventHandler
    public void init(FMLInitializationEvent event) {
        goldCoin.register();
    }
}
