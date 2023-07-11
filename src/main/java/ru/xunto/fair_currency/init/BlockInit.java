package ru.xunto.fair_currency.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import ru.xunto.fair_currency.FairCurrencyMod;
import ru.xunto.fair_currency.blocks.BaseBlock;
import ru.xunto.fair_currency.blocks.NonCollisionBlock;

import java.util.ArrayList;
import java.util.List;

public class BlockInit {
    public static List<BaseBlock> BLOCKS = new ArrayList<BaseBlock>();

    public BlockInit(){
        addBlocks();
    }
    public BaseBlock createBlock(String blockName, Material material, int rendererType, float hardness) {
        BaseBlock baseBlock = new BaseBlock(blockName, FairCurrencyMod.TAB, material)
                .setRenderType(rendererType)
                .setHardness(hardness);
        return baseBlock;
    }

    public BaseBlock createNonCollisionBlock(String blockName, Material material, int rendererType, float hardness) {
        BaseBlock baseBlock = new NonCollisionBlock(blockName, FairCurrencyMod.TAB, material)
                .setRenderType(rendererType)
                .setHardness(hardness);
        return baseBlock;
    }

    public void addBlocks() {
        BaseBlock lantern_1 = createNonCollisionBlock("lantern_1", Material.plants, 1, 0.0F)
                .setLightLevel(1.0F).setOpaqueCube(false);
        lantern_1.setBlockBounds(0.25f, 0, 0.25f, 0.75f, 0.75f, 0.75f);
    }

    public void registerAll(){
        for (BaseBlock block: BLOCKS) {
            block.register();
        }
    }


}
