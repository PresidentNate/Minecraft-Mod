package nate.snow.EffectBlock;

import java.util.*;

import net.minecraft.item.*;
import net.minecraft.entity.player.*;
import net.minecraft.command.*;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.*;


public class DyeableArmor extends Item {
	protected DyeableArmor() {
		this.setMaxStackSize(1);
		this.setCreativeTab(CreativeTabs.tabCombat);
		this.setMaxDamage(500);
	}

}
