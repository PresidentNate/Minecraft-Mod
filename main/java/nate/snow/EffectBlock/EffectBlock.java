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
	public static Item lightningRod;
	
	/* Dyeable diamond armor concept, know you can have multi-colored armor and still have good protection! */
	public static Item dyeableDiamondHelmet;
	public static Item dyeableDiamondChestplate;
	public static Item dyeableDiamondLeggings;
	public static Item dyeableDiamondBoots;
	
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
		.setTextureName(EffectBlock.MODID + ":" + "lightning_rod");
		
		GameRegistry.registerItem(lightningRod, "Lightning_Rod");

		ItemStack lightningRodStack = new ItemStack(lightningRod);
		GameRegistry.addShapedRecipe(lightningRodStack,  "  x"," y ","y  ",
				'x',netherStar,'y',diamondBlock);
		
		
		/** Dyeable diamond armor */
		Item diamond_helmet = (Item) Item.itemRegistry.getObject("diamond_helmet");
		Item diamond_chestplate = (Item) Item.itemRegistry.getObject("diamond_chestplate");
		Item diamond_leggings = (Item) Item.itemRegistry.getObject("diamond_leggings");
		Item diamond_boots = (Item) Item.itemRegistry.getObject("diamond_boots");
		
		Item diamond = (Item) Item.itemRegistry.getObject("diamond");
		Item leather = (Item) Item.itemRegistry.getObject("leather");
		
		dyeableDiamondHelmet = new DyeableArmor()
		.setUnlocalizedName("Dyeable_Helmet")
		.setTextureName(EffectBlock.MODID +":" + "dyeable_helmet");
		
		dyeableDiamondChestplate = new DyeableArmor()
		.setUnlocalizedName("Dyeable_Chestplate")
		.setTextureName(EffectBlock.MODID +":" + "dyeable_chestplate");
		
		dyeableDiamondLeggings = new DyeableArmor()
		.setUnlocalizedName("Dyeable_Leggings")
		.setTextureName(EffectBlock.MODID +":" + "dyeable_leggings");
		
		dyeableDiamondBoots = new DyeableArmor()
		.setUnlocalizedName("Dyeable_Boots")
		.setTextureName(EffectBlock.MODID +":" + "dyeable_boots");
		
		GameRegistry.registerItem(dyeableDiamondHelmet, "Dyeable_Helmet");
		ItemStack dyeableHelmetStack = new ItemStack(dyeableDiamondHelmet);
		
		
		GameRegistry.addShapedRecipe(dyeableHelmetStack, "xxx","xyx","   ",'x',diamond_helmet,'y',diamond_helmet);
		
		GameRegistry.registerItem(dyeableDiamondChestplate, "Dyeable_Chestplate");
		ItemStack dyeableChestplateStack = new ItemStack(dyeableDiamondChestplate);
		
		GameRegistry.registerItem(dyeableDiamondLeggings, "Dyeable_Leggings");
		ItemStack dyeableLeggingsStack = new ItemStack(dyeableDiamondLeggings);

		GameRegistry.registerItem(dyeableDiamondBoots, "Dyeable_Boots");
		ItemStack dyeableBootsStack = new ItemStack(dyeableDiamondBoots);
		
		
	}
		
}
