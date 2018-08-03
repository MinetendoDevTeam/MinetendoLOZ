package com.minetendodevs.loz.objects.items;

import com.minetendodevs.loz.Main;
import com.minetendodevs.loz.init.ModItems;
import com.minetendodevs.loz.util.IHasModel;

import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.minetendoTab);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this,  0,  "inventory");
	}

}
