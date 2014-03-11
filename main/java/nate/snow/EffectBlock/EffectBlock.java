package nate.snow.EffectBlock;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.block.material.Material;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.*;

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
	public static final String version = "0.0.5";
	public static final String name = "Effect Block";
		
	public static Block effectBlock;
	public static Block chestHopper;
	public static Item lightningRod;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ItemStack diamondBlock = new ItemStack(Block.getBlockFromName("diamond_block"));
		
		Item netherStar = (Item) Item.itemRegistry.getObject("nether_star");
		
		/** Sets values for the EffectBlock */
		effectBlock = new NatesBlocks(Material.iron)
		.setBlockName("EffectBlock")
		.setHardness(5.0F)
		.setStepSound(Block.soundTypeMetal)
		.setCreativeTab(CreativeTabs.tabMisc)
		.setResistance(5.0F)
		.setBlockTextureName(EffectBlock.MODID+":"+"effect_block");
				
		effectBlock.setHarvestLevel("pickaxe", 3);

		GameRegistry.registerBlock(effectBlock, effectBlock.getUnlocalizedName().substring(5));
		
		ItemStack effectBlockStack = new ItemStack(effectBlock);
		GameRegistry.addShapedRecipe(effectBlockStack, "xxx","xyx","xxx",
				'x',netherStar,'y',diamondBlock);		
		
		
		/** Other Blocks???? */
		lightningRod = new NatesItems()
		.setUnlocalizedName("lightningRod")
		.setTextureName(EffectBlock.MODID + ":" + "lightning_rod")
		.setCreativeTab(CreativeTabs.tabCombat)
		.setMaxStackSize(1)
		.setMaxDamage(5000);
		
		GameRegistry.registerItem(lightningRod, "Lightning Rod");

		ItemStack lightningRodStack = new ItemStack(lightningRod);
		GameRegistry.addShapedRecipe(lightningRodStack,  "  x"," y ","y  ",
				'x',netherStar,'y',diamondBlock);
		
		
	}
		
}
