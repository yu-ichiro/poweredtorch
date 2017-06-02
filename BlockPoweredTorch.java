package com.yusmith.poweredtorch;

import java.util.Random;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockTorch;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.util.ChatComponentText;

public class BlockPoweredTorch extends BlockTorch
{
	private final int lightLevel;
	
	public BlockPoweredTorch(int level) {
        super();
        this.lightLevel = level;
        this.setLightLevel(this.lightLevel+1/16F);
        this.setCreativeTab(null);
        this.setBlockName("blockPoweredTorch");
    }
	
   @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float posX, float posY, float posZ){
        //ブロックを右クリックした際の動作
    	if (world.isRemote == false) {
    		int next = player.isSneaking() ? lightLevel - 1 : lightLevel + 1;
    		if (next < 0 || next > 15) return true;
    		Block blk = GameRegistry.findBlock(PoweredTorch.MODID, "blockPoweredTorch"+next);
    		player.addChatComponentMessage(new ChatComponentText("Light level: " +next));
    		world.setBlock(x, y, z, blk, world.getBlockMetadata(x, y, z),3);
    	}
        return true;
    }

    @Override
    public int getLightValue(IBlockAccess world, int posX, int posY, int posZ) {
    	 return lightLevel;
    }
     /**
     * Returns the quantity of items to drop on block destruction.
     */
    
    @Override
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return Item.getItemFromBlock(GameRegistry.findBlock(PoweredTorch.MODID, "blockPoweredTorch0"));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(World p_149734_1_, int p_149734_2_, int p_149734_3_, int p_149734_4_, Random p_149734_5_) {
	    if (lightLevel > 0) {
	    	super.randomDisplayTick(p_149734_1_, p_149734_2_, p_149734_3_, p_149734_4_, p_149734_5_);
	    }
    }
}