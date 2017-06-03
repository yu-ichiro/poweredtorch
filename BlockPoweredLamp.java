package com.yusmith.poweredtorch;

import java.util.Random;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MapColor;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;


public class BlockPoweredLamp extends Block {
	
	private final int lightLevel;
	
	BlockPoweredLamp(int level) {
		super(new Material(MapColor.sandColor));
		this.lightLevel=level;
		this.setLightLevel((level+1.0F)/16.0F);
		this.setCreativeTab(null);
		this.setBlockName("blockPoweredLamp");
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float posX, float posY, float posZ)
    {
		if (!world.isRemote) {
			int next = Utils.mod(player.isSneaking() ? lightLevel - 1 : lightLevel + 1, 16);
			player.addChatComponentMessage(new ChatComponentText("Light level: " +next));
    		world.setBlock(x, y, z, GameRegistry.findBlock(PoweredTorch.MODID, "blockPoweredLamp" +next), 0, 3);
		}
        return true;
    }
	
    @Override
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return Item.getItemFromBlock(GameRegistry.findBlock(PoweredTorch.MODID, "blockPoweredLamp0"));
    }


}
