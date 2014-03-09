package nate.snow.EffectBlock;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.block.material.Material;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

/** EffectBlock.java
 * Programmed by: Nathan Soucy
 * This is just a simple Mod that adds a new block to the game, 
 * which will give you the power of a full beacon in one block!
 * It's almost too powerful, but also incredibly expensive.
 */

@Mod(modid=EffectBlock.MODID, name=EffectBlock.name, version=EffectBlock.version)
public class EffectBlock {
	
	public static final String MODID = "effectblock";
	public static final String version = "0.0.3";
	public static final String name = "Effect Block";
		
	public static Block effectBlock;
	public static Block blockTest;	
	public static Block stoneStair;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ItemStack diamondBlock = new ItemStack(Block.getBlockFromName("diamond_block"));
		
		Item netherStar = (Item) Item.itemRegistry.getObject("nether_star");
		
		/** Sets values for the block */
		effectBlock = new NatesBlocks(Material.glass)
		.setBlockName("EffectBlock")
		.setHardness(5.0F)
		.setStepSound(Block.soundTypeMetal)
		.setCreativeTab(CreativeTabs.tabMisc)
		.setLightLevel(-50.0F)
		.setResistance(5.0F)
		.setBlockTextureName(EffectBlock.MODID+":"+"effect_block");
				
		effectBlock.setHarvestLevel("pickaxe", 3);
		
		GameRegistry.registerBlock(effectBlock, effectBlock.getUnlocalizedName().substring(5));
		
		ItemStack effectBlockStack = new ItemStack(effectBlock);
						
		GameRegistry.addShapedRecipe(effectBlockStack, "xxx","xyx","xxx",
				'x',netherStar,'y',diamondBlock);
		
		stoneStair = new NatesBlocks(Material.rock)
		.setBlockName("StoneStair")
		.setCreativeTab(CreativeTabs.tabDecorations)
		.setStepSound(Block.soundTypeStone);
		
	}
		
}
