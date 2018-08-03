package com.minetendodevs.loz.init;

import java.util.ArrayList;
import java.util.List;

import com.minetendodevs.loz.objects.blocks.M64;
import com.minetendodevs.loz.objects.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Blocks
	public static final Block M_64 = new M64("m_64", Material.IRON);
	public static final Block BLOCK_COPPER = new BlockBase("block_copper", Material.IRON);
	//Ores

}
