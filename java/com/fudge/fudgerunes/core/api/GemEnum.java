package com.fudge.fudgerunes.core.api;

import java.util.Locale;

import com.fudge.fudgerunes.core.itemgroup.FudgeRunesItemGroup;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;

public enum GemEnum implements IStringSerializable {
	
	//Four Elements
	RUBY("ruby", GemElement.FIRE),
	SAPPHIRE("sapphire", GemElement.WATER),
	MALACHITE("malachite", GemElement.EARTH),
	CITRINE("citrine", GemElement.AIR),
	
	//Four Energies
	TOPAZ("topaz", GemElement.LIGHTNING),
	//ender pearl? maybe new ender crystal that must be crafted?
	ENDER_GEM("ender gem", GemElement.ENDER),
	ONYX("onyx", GemElement.DEATH),
	KYANITE("kyanite", GemElement.LIFE),
	
	//Two Abstracts
	AMETHYST("amethyst", GemElement.ORDER),
	AMBER("amber", GemElement.CHAOS);
	
	private final String name;
	private final GemElement element;
	
	private GemEnum(String name, GemElement element){
		this.name = getName();
		this.element = getElement();
	}

	public String getName() {
		return this.name;
	}
	
	public GemElement getElement() {
		return this.element;
	}
	
	public Item item; 
		void EnumItem() {
			this.item = new Item(new Item.Properties().tab(FudgeRunesItemGroup.FUDGE_RUNES));
	}
	
	public Item getItem() {
		return this.item;
	}
	
	public ItemStack getItemStack() {
		return new ItemStack(this.getItem());
	}
	
	@Override
	public String getSerializedName() {
		return toString().toLowerCase(Locale.ROOT);
	}

}
