package nate.snow.EffectBlock;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;


public class NatesBlocks extends Block {

	protected NatesBlocks(Material material) {
		super(material);
		// TODO Auto-generated constructor stub
		
	}
	
	@SideOnly(Side.CLIENT)
	public boolean isOpaqueCube() {
		return false;
	}
	
	public int setLightLevel(int l) {
		return l;
	}
	
	
	
}
