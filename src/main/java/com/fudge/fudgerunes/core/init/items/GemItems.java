package com.fudge.fudgerunes.core.init.items;

import java.util.Locale;

import com.fudge.fudgerunes.core.api.GemElement;
import com.fudge.fudgerunes.core.itemgroup.FRItemGroup;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;

public enum GemItems implements IStringSerializable {
	
	//Four Elements
	RUBY("ruby", GemElement.FIRE),
	SAPPHIRE("sapphire", GemElement.WATER),
	MALACHITE("malachite", GemElement.EARTH),
	CITRINE("citrine", GemElement.AIR),
	
	//Four Energies
	TOPAZ("topaz", GemElement.LIGHTNING),
	//ender pearl? maybe new ender crystal that must be crafted?
	ENDERITE("ender gem", GemElement.ENDER),
	ONYX("onyx", GemElement.DEATH),
	KYANITE("kyanite", GemElement.LIFE),
	
	//Two Abstracts
	AMETHYST("amethyst", GemElement.ORDER),
	AMBER("amber", GemElement.CHAOS);
	
	private final String name;
	private final GemElement element;
	
	private GemItems(String name, GemElement element){
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
		public Item EnumItem() {
			return this.item = new Item(new Item.Properties().tab(FRItemGroup.FUDGE_RUNES));
	}
	
	public Item getItem() {
		return this.item;
	}
	
	public ItemStack getItemStack() {
		return new ItemStack(this.item);
	}
	
	@Override
	public String getSerializedName() {
		return toString().toLowerCase(Locale.ROOT);
	}

}
