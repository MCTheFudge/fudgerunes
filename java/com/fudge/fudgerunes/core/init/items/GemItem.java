package com.fudge.fudgerunes.core.init.items;

import java.util.EnumMap;

import com.fudge.fudgerunes.core.api.GemEnum;
import com.google.common.collect.Maps;

import net.minecraft.item.Item;

public class GemItem extends Item {
	
	private static final EnumMap<GemEnum,GemItem> GEM_MAP = Maps.newEnumMap(GemEnum.class);
	private final GemEnum gemEnum;

	public GemItem(GemEnum gem, Properties properties) {
		super(properties);
		this.gemEnum = gem;
		GEM_MAP.put(gem, this);
	}
	
	public GemEnum getGemEnum() {
		return this.gemEnum;
	}
	
	public static GemItem byGemEnum(GemEnum genum) {
		return GEM_MAP.get(genum);
	}

}
