package com.fudge.fudgerunes.core.api;

import net.minecraft.util.ResourceLocation;

public class RuneEffect {
	
	String tag;
	ResourceLocation image;
	
	/**
	 * use this constructor for registering new runes.
	 * @param tag is the key that will be used to reference the rune
	 * @param image ResourceLocation calls a texture to be used as that rune
	 */
	
	public RuneEffect(String tag, ResourceLocation image) {
		this(new ResourceLocation("fudgerunes","textures/runes/"+tag.toLowerCase()+".png"));
	}

	public String getTag() {
		return tag;
	
	}
	
	public RuneEffect(String tag) {
		// TODO Auto-generated constructor stub
	}

	public RuneEffect(ResourceLocation resourceLocation) {
		// TODO Auto-generated constructor stub
	}

	//potion effect runes
	public static final RuneEffect STRENGTH = new RuneEffect("tyr");
	public static final RuneEffect JOURNEY = new RuneEffect("wheel");
	public static final RuneEffect PROTECTION = new RuneEffect("protection");
	public static final RuneEffect VISION = new RuneEffect("sun");
	public static final RuneEffect WATER = new RuneEffect("water");
	public static final RuneEffect REGENERATION = new RuneEffect("thor");
	
	//enchantment effect runes
	public static final RuneEffect LUCK = new RuneEffect("freya");
	public static final RuneEffect WISDOM = new RuneEffect("odin");
	public static final RuneEffect GROWTH = new RuneEffect("cycles");
	public static final RuneEffect BIRTH = new RuneEffect("birth");
	public static final RuneEffect HASTE = new RuneEffect("horse");
	
	//specialty effect runes - NOT YET IMPLEMENTED
	public static final RuneEffect NYI1 = new RuneEffect("unimplemented");
	public static final RuneEffect NYI2 = new RuneEffect("unimplemented");
	public static final RuneEffect NYI3 = new RuneEffect("unimplemented");
	public static final RuneEffect NYI4 = new RuneEffect("unimplemented");
	public static final RuneEffect NYI5 = new RuneEffect("unimplemented");
	public static final RuneEffect NYI6 = new RuneEffect("unimplemented");
	public static final RuneEffect NYI7 = new RuneEffect("unimplemented");
	public static final RuneEffect NYI8 = new RuneEffect("unimplemented");
	public static final RuneEffect NYI9 = new RuneEffect("unimplemented");
	
	//misc and undecided
	public static final RuneEffect MAGIC = new RuneEffect("dawn");
	
}
