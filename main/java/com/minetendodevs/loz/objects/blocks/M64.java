package com.minetendodevs.loz.objects.blocks;

import com.minetendodevs.loz.objects.blocks.BlockBase;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class M64 extends BlockBase
{

	public M64(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(5.0f);
		setResistance(15.0f);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(1.0f);
	}
	
	@Override
    public boolean isOpaqueCube(IBlockState state) 
    {
        return false;
    }
	
}
