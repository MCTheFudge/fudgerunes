package com.fudge.fudgerunes.core.init.items;

import java.util.Arrays;

import com.fudge.fudgerunes.core.api.GemElement;
import com.fudge.fudgerunes.core.api.RuneEffect;
import com.fudge.fudgerunes.core.init.ItemInit;
import com.mojang.datafixers.types.templates.List;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.IStringSerializable;

public class ItemRunedGem extends Item implements IStringSerializable {

	public ItemRunedGem(Properties properties) {
		super(properties);
		
	}

	public void getSubItems(Item item, ItemGroup tab, List subItems) {
		
		Arrays.asList(createGem(null, null, ItemRunedGem.GemCut.NO, true));
		Arrays.asList(createGem(GemElement.LIFE, RuneEffect.REGENERATION, ItemRunedGem.GemCut.NO, false));
		Arrays.asList(createGem(GemElement.LIFE, RuneEffect.REGENERATION, ItemRunedGem.GemCut.YES, false));
		Arrays.asList(createGem(GemElement.EARTH, RuneEffect.JOURNEY, ItemRunedGem.GemCut.NO, false));
		Arrays.asList(createGem(GemElement.EARTH, RuneEffect.JOURNEY, ItemRunedGem.GemCut.YES, false));
		
	}

	public static ItemStack createGem(GemElement element, RuneEffect rune, GemCut cut, boolean forceCreate) {

		if(!forceCreate && (element==null || rune==null || cut==null))
			return null;
		ItemStack stack = new ItemStack((IItemProvider) ItemInit.RUNED_GEM);
		stack.setTag(new CompoundNBT());
		if(element!=null)
			stack.getTag().putString("GemElement", element.getTag());
		if(rune!=null)
			stack.getTag().putString("RuneEffect", rune.getTag());
		if(cut!=null)
			stack.getTag().putByte("GemCut", (byte) cut.ordinal());
		return stack;
	}

		public enum GemCut {

			YES,
			NO;
	
			public static GemCut getValue(byte b) 
			{
				if(b>=0&&b<values().length)
					return values()[b];
				return values()[0];
			}
		}

		@Override
		public String getSerializedName() {
			// TODO Auto-generated method stub
			return null;
		}
}
