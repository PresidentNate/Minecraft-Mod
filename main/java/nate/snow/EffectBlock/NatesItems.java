package nate.snow.EffectBlock;

import java.util.*;

import net.minecraft.item.*;
import net.minecraft.world.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.*;
import net.minecraft.command.*;
import net.minecraft.enchantment.*;


/** NatesItems.java
 * 
 * Only one item to be added, the Lightning Rod!
 * Point it at a mob, and it strikes them with lightning.
 * Currently only causes an explosion (no terrain damage!), sets yourself on fire, and heals yourself.
 */
public class NatesItems extends Item {
	protected NatesItems() {
		
	}
	
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, int par4) {
		System.out.println(
				"ItemStack: " +par1ItemStack + 
				" EntityPlayer: " +par2EntityPlayer + 
				" ArrayList: " + par3List + 
				" Int: " + par4);
	}
	
	/** 
	 * Heals yourself, sets yourself on fire, and causes a deadly explosion to nearby mobs and players  
	 */
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer ePlayer) {
		world.createExplosion(ePlayer, ePlayer.posX, ePlayer.posY, ePlayer.posZ, 3.0F, false);
		if (ePlayer.shouldHeal()) {
			ePlayer.setFire(2);
			ePlayer.heal(5);
		}
		
		itemStack.damageItem(1, ePlayer);
		
		return itemStack;
	}
	
	/** 
	 * Currently only sets the mob/player on fire, but will also strike lightning and kill them.
	 */
	public boolean onLeftClickEntity(ItemStack itemStack, EntityPlayer ePlayer, Entity entity) {
		
		entity.setFire(5);
		
		
		itemStack.damageItem(2, ePlayer);
		
		return false;
	}
	
	public boolean isDamageable() {
		return true;
	}
	
}
