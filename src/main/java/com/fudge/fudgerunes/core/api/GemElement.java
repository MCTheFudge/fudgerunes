package com.fudge.fudgerunes.core.api;

public class GemElement {
	
	String tag;
	
	/**
	 * use this constructor for registering new elements.
	 * @param tag is the key that will be used to reference the element
	 */
	
	public GemElement(String tag) {
		
	}

	public String getTag() {
		return tag;
	
	}
	
	//tier 1 - the "elements"
	public static final GemElement FIRE = new GemElement("fire");
	public static final GemElement WATER = new GemElement("water");
	public static final GemElement AIR = new GemElement("air");
	public static final GemElement EARTH = new GemElement("earth");
	
	//tier 2 - the "abstracts"
	public static final GemElement ORDER = new GemElement("order");
	public static final GemElement CHAOS = new GemElement("chaos");
	
	//tier 3 - the "energies"
	public static final GemElement LIGHTNING = new GemElement("lightning");
	public static final GemElement ENDER = new GemElement("ender");
	public static final GemElement DEATH = new GemElement("death");
	public static final GemElement LIFE = new GemElement("life");
	
}
