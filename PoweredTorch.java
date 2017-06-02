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
    public static final String VERSION = "1.0";
    
    @EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		//ブロックのインスタンス生成
    	//ブロックの登録。登録文字列はMOD内で被らなければ何でも良い。
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
		
		GameRegistry.addRecipe(new ItemStack(GameRegistry.findBlock(PoweredTorch.MODID, "blockPoweredTorch0")), "R", "T", 'R', Items.redstone, 'T', Blocks.torch);
	}
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
	
    }
}
