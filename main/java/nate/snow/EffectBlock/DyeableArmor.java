package nate.snow.EffectBlock;

import java.util.*;

import net.minecraft.item.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.Entity;
import net.minecraft.command.*;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.*;
import net.minecraft.item.ItemArmor;


public class DyeableArmor extends Item {
	protected DyeableArmor() {
		this.setMaxStackSize(1);
		this.setCreativeTab(CreativeTabs.tabCombat);
		this.setMaxDamage(500);
	}
	
	public boolean isValidArmor(ItemStack stack, int type, Entity entity) {
		
		return true;
	}

}
