package com.minetendodevs.loz.tabs;



import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class MinetendoTab extends CreativeTabs
{
	public MinetendoTab(String label)
	{
		super("minetendoTab");
		this.setBackgroundImageName("minebg.png");
	}
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(Item.getItemFromBlock(Blocks.ANVIL));
	}
}