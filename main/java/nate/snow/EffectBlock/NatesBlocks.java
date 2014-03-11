package nate.snow.EffectBlock;

import java.util.*;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.potion.*;
import net.minecraft.world.*;
import net.minecraft.entity.player.*;

/** NatesBlocks.java 
 * This is just the super class that sets up the main block, without adding any potion effects.
 */

public class NatesBlocks extends Block {

	protected NatesBlocks(Material material) {
		super(material);
		// TODO Auto-generated constructor stub
		
	}
	
	@SideOnly(Side.CLIENT)
	public boolean isOpaqueCube() {
		return false;
	}
	
	public void onBlockAdded(World world, int x, int y, int z) {
		System.out.println(
				"World: "+ world + 
				" First int: " + x + 
				" 2nd int: " + y + 
				" 3rd int " + z);
		
		this.setLightLevel(-15.0F);
		System.out.println(this.getLightValue());
	}
	
	public int tickRate() {
		return 10;
	}
	
	@Override
	public void updateTick(World p_149674_1_, int p_149674_2_, int p_149674_3_, int p_149674_4_, Random p_149674_5_) {
		System.out.println(
				"World: " + p_149674_1_ +
				" 1st int: " + p_149674_2_ +
				" 2nd int: " + p_149674_3_ + 
				" 3rd int: " + p_149674_4_ +
				" Random:" + p_149674_5_);
	}
	
/*	public boolean onBlockActivated(World world, int x, int y, int z, 
			EntityPlayer player, int int1, 
			float float1, float float2, float float3) {
		
		System.out.println(
				"World: " + world + 
				" X: " + x + 
				" Y: " + y +
				" Z: " + z + 
				" EnitityPlayer: " + player +
				" int1: " + int1 +
				" float1 :" + float1 + 
				" float2: " + float2 +
				" float3: " + float3
 		);
		return true;
		
	}
*/	
	
	
	
}
