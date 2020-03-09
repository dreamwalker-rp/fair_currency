package ru.xunto.fair_currency;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import ru.xunto.fair_currency.blocks.BaseBlock;
import ru.xunto.fair_currency.blocks.NonCollisionBlock;
import ru.xunto.fair_currency.items.Item;
import ru.xunto.fair_currency.items.ItemCoin;

@Mod(modid = FairCurrencyMod.MODID, version = FairCurrencyMod.VERSION)
public class FairCurrencyMod {
    public static final String MODID = "@@MODID@@";
    public static final String VERSION = "@@VERSION@@";

    public static final ItemCoin goldCoin1gold = new ItemCoin("1_gold_coin");
    public static final ItemCoin goldCoin10gold = new ItemCoin("10_gold_coin");
    public static final ItemCoin goldCoin100gold = new ItemCoin("100_gold_coin");
    public static final ItemCoin goldCoin1000gold = new ItemCoin("1000_gold_coin");

    public static CreativeTabs tab = new CreativeTabs("Fair Currency") {
        @Override
        public net.minecraft.item.Item getTabIconItem() {
            return FairCurrencyMod.goldCoin1000gold;
        }
    };

    @EventHandler
    public void init(FMLInitializationEvent event) {
        goldCoin1gold.setHigherCurrency(goldCoin10gold);

        goldCoin10gold.setLessCurrency(goldCoin1gold);
        goldCoin10gold.setHigherCurrency(goldCoin100gold);

        goldCoin100gold.setLessCurrency(goldCoin10gold);
        goldCoin100gold.setHigherCurrency(goldCoin1000gold);

        goldCoin1000gold.setLessCurrency(goldCoin100gold);

        goldCoin1gold.register();
        goldCoin10gold.register();
        goldCoin100gold.register();
        goldCoin1000gold.register();

        //TODO: сделать нормально
        goldCoin1gold.setCreativeTab(tab);
        goldCoin10gold.setCreativeTab(tab);
        goldCoin100gold.setCreativeTab(tab);
        goldCoin1000gold.setCreativeTab(tab);

        addNotNamedItems();
        addBlocks();
    }

    private void addNotNamedItems() {
        String[] notNamedItem = getNotNamedFilesName();
        for (String itemName : notNamedItem) {
            addSimpleItems(itemName);
        }
    }

    private Item addSimpleItems(String itemName) {
        final Item newItem = new Item(itemName, FairCurrencyMod.tab);
        newItem.register();
        newItem.setCreativeTab(tab);
        return newItem;
    }

    private String[] getNotNamedFilesName() {
        NotNamedItemsWrapper notNamedItemsWrapper = new NotNamedItemsWrapper();
        return notNamedItemsWrapper.getItemsName();
    }

    private void addBlocks() {
        BaseBlock lantern_1 = createNonCollisionBlock("lantern_1", Material.plants, 1, 0.0F)
                .setLightLevel(1.0F).setOpaqueCube(false);
        lantern_1.setBlockBounds(0.25f, 0, 0.25f, 0.75f, 0.75f, 0.75f);
        registerBlock(lantern_1);
    }

    private BaseBlock createBlock(String blockName, Material material, int rendererType, float hardness) {
        BaseBlock baseBlock = new BaseBlock(blockName, tab, material)
                .setRenderType(rendererType)
                .setHardness(hardness);
        return baseBlock;
    }

    private BaseBlock createNonCollisionBlock(String blockName, Material material, int rendererType, float hardness) {
        BaseBlock baseBlock = new NonCollisionBlock(blockName, tab, material)
                .setRenderType(rendererType)
                .setHardness(hardness);
        return baseBlock;
    }


    private BaseBlock registerBlock(BaseBlock baseBlock) {
        baseBlock.register();
        baseBlock.setCreativeTab(tab);
        return baseBlock;
    }

}
