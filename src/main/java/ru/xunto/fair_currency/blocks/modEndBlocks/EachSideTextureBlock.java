package ru.xunto.fair_currency.blocks.modEndBlocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import ru.xunto.fair_currency.blocks.BaseBlock;

public class EachSideTextureBlock extends BaseBlock {
    @SideOnly(Side.CLIENT)
    private IIcon topTexture;
    @SideOnly(Side.CLIENT)
    private IIcon botTexture;
    @SideOnly(Side.CLIENT)
    private IIcon frontTexture;
    @SideOnly(Side.CLIENT)
    private IIcon backTexture;
    @SideOnly(Side.CLIENT)
    private IIcon leftTexture;
    @SideOnly(Side.CLIENT)
    private IIcon rightTexture;


    public EachSideTextureBlock(String registryName, Material material) {
        super(registryName, material);
    }
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int p_149691_1_, int p_149691_2_) {
        return getTextureBySide(p_149691_1_);
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(IBlockAccess p_149673_1_, int p_149673_2_, int p_149673_3_, int p_149673_4_, int p_149673_5_) {
        return getTextureBySide(p_149673_5_);
    }

    private IIcon getTextureBySide(int side) {
        if (side == 0) {
            return this.botTexture;

        } else if (side == 1) {
            return this.topTexture;

        } else if (side == 2) {
            return this.frontTexture;

        } else if (side == 3) {
            return this.backTexture;

        } else if (side == 4) {
            return this.leftTexture;
        } else {
            return this.rightTexture;
        }
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_) {
        this.topTexture = p_149651_1_.registerIcon(this.getTextureName() + "_top");
        this.botTexture = p_149651_1_.registerIcon(this.getTextureName() + "_bottom");
        this.frontTexture = p_149651_1_.registerIcon(this.getTextureName() + "_front");
        this.backTexture = p_149651_1_.registerIcon(this.getTextureName() + "_back");
        this.leftTexture = p_149651_1_.registerIcon(this.getTextureName() + "_left");
        this.rightTexture = p_149651_1_.registerIcon(this.getTextureName() + "_right");
    }

}
