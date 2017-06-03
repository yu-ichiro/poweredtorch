package com.yusmith.poweredtorch;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = PoweredTorch.MODID, version = PoweredTorch.VERSION)
public class PoweredTorch
{
    public static final String MODID = "poweredtorch";
    public static final String VERSION = "1.2";
    
    @EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
    	//
    	//  Powered Torch
    	//
    	GameRegistry.registerBlock(new BlockPoweredTorch(0).setCreativeTab(CreativeTabs.tabDecorations).setBlockTextureName("redstone_torch_off"), "blockPoweredTorch0");
		GameRegistry.registerBlock(new BlockPoweredTorch(1).setBlockTextureName("redstone_torch_on"), "blockPoweredTorch1");
		GameRegistry.registerBlock(new BlockPoweredTorch(2).setBlockTextureName("redstone_torch_on"), "blockPoweredTorch2");
		GameRegistry.registerBlock(new BlockPoweredTorch(3).setBlockTextureName("redstone_torch_on"), "blockPoweredTorch3");
		GameRegistry.registerBlock(new BlockPoweredTorch(4).setBlockTextureName("redstone_torch_on"), "blockPoweredTorch4");
		GameRegistry.registerBlock(new BlockPoweredTorch(5).setBlockTextureName("redstone_torch_on"), "blockPoweredTorch5");
		GameRegistry.registerBlock(new BlockPoweredTorch(6).setBlockTextureName("redstone_torch_on"), "blockPoweredTorch6");
		GameRegistry.registerBlock(new BlockPoweredTorch(7).setBlockTextureName("redstone_torch_on"), "blockPoweredTorch7");
		GameRegistry.registerBlock(new BlockPoweredTorch(8).setBlockTextureName("redstone_torch_on"), "blockPoweredTorch8");
		GameRegistry.registerBlock(new BlockPoweredTorch(9).setBlockTextureName("redstone_torch_on"), "blockPoweredTorch9");
		GameRegistry.registerBlock(new BlockPoweredTorch(10).setBlockTextureName("redstone_torch_on"), "blockPoweredTorch10");
		GameRegistry.registerBlock(new BlockPoweredTorch(11).setBlockTextureName("redstone_torch_on"), "blockPoweredTorch11");
		GameRegistry.registerBlock(new BlockPoweredTorch(12).setBlockTextureName("redstone_torch_on"), "blockPoweredTorch12");
		GameRegistry.registerBlock(new BlockPoweredTorch(13).setBlockTextureName("redstone_torch_on"), "blockPoweredTorch13");
		GameRegistry.registerBlock(new BlockPoweredTorch(14).setBlockTextureName("redstone_torch_on"), "blockPoweredTorch14");
		GameRegistry.registerBlock(new BlockPoweredTorch(15).setBlockTextureName("redstone_torch_on"), "blockPoweredTorch15");
		
		//
    	//  Powered Lamp
    	//
		GameRegistry.registerBlock(new BlockPoweredLamp(0).setCreativeTab(CreativeTabs.tabDecorations).setBlockTextureName("redstone_lamp_off"), "blockPoweredLamp0");
		GameRegistry.registerBlock(new BlockPoweredLamp(1).setBlockTextureName("redstone_lamp_on"), "blockPoweredLamp1");
		GameRegistry.registerBlock(new BlockPoweredLamp(2).setBlockTextureName("redstone_lamp_on"), "blockPoweredLamp2");
		GameRegistry.registerBlock(new BlockPoweredLamp(3).setBlockTextureName("redstone_lamp_on"), "blockPoweredLamp3");
		GameRegistry.registerBlock(new BlockPoweredLamp(4).setBlockTextureName("redstone_lamp_on"), "blockPoweredLamp4");
		GameRegistry.registerBlock(new BlockPoweredLamp(5).setBlockTextureName("redstone_lamp_on"), "blockPoweredLamp5");
		GameRegistry.registerBlock(new BlockPoweredLamp(6).setBlockTextureName("redstone_lamp_on"), "blockPoweredLamp6");
		GameRegistry.registerBlock(new BlockPoweredLamp(7).setBlockTextureName("redstone_lamp_on"), "blockPoweredLamp7");
		GameRegistry.registerBlock(new BlockPoweredLamp(8).setBlockTextureName("redstone_lamp_on"), "blockPoweredLamp8");
		GameRegistry.registerBlock(new BlockPoweredLamp(9).setBlockTextureName("redstone_lamp_on"), "blockPoweredLamp9");
		GameRegistry.registerBlock(new BlockPoweredLamp(10).setBlockTextureName("redstone_lamp_on"), "blockPoweredLamp10");
		GameRegistry.registerBlock(new BlockPoweredLamp(11).setBlockTextureName("redstone_lamp_on"), "blockPoweredLamp11");
		GameRegistry.registerBlock(new BlockPoweredLamp(12).setBlockTextureName("redstone_lamp_on"), "blockPoweredLamp12");
		GameRegistry.registerBlock(new BlockPoweredLamp(13).setBlockTextureName("redstone_lamp_on"), "blockPoweredLamp13");
		GameRegistry.registerBlock(new BlockPoweredLamp(14).setBlockTextureName("redstone_lamp_on"), "blockPoweredLamp14");
		GameRegistry.registerBlock(new BlockPoweredLamp(15).setBlockTextureName("redstone_lamp_on"), "blockPoweredLamp15");

	}

    @EventHandler
	public void init(FMLInitializationEvent event)
	{
    	// Main Recipe:    
    	// R=Redstone       R
    	// T=Torch          T
    	//
    	GameRegistry.addRecipe(new ItemStack(GameRegistry.findBlock(PoweredTorch.MODID, "blockPoweredTorch0")), "R", "T", 'R', Items.redstone, 'T', Blocks.torch);

    	// Alternative Recipe: Convert a Redstone Torch
    	// It wouldn't require coal/charcoal but takes 3 more stick for 4 torches
    	GameRegistry.addRecipe(new ItemStack(GameRegistry.findBlock(PoweredTorch.MODID, "blockPoweredTorch0")), "R", 'R', Blocks.redstone_torch);
    			
    	
		// Main Recipe:    
		// R=Redstone       R     R
		// T=Torch         RTR   RLR
		// L=Lantern        R     R
		GameRegistry.addRecipe(new ItemStack(GameRegistry.findBlock(PoweredTorch.MODID, "blockPoweredLamp0")), " R ", "RTR", " R ", 'R', Items.redstone, 'T', Blocks.torch);
		GameRegistry.addRecipe(new ItemStack(GameRegistry.findBlock(PoweredTorch.MODID, "blockPoweredLamp0")), " R ", "RLR", " R ", 'R', Items.redstone, 'L', Blocks.lit_pumpkin);
		
		// Alternative Recipe: Convert a Redstone Lamp
		GameRegistry.addRecipe(new ItemStack(GameRegistry.findBlock(PoweredTorch.MODID, "blockPoweredLamp0")), "L", 'L', Blocks.redstone_lamp);
	}
}
