package com.fudge.fudgerunes.core.itemgroup;

import com.fudge.fudgerunes.core.init.ItemInit;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class FRItemGroup extends ItemGroup {

	public static final FRItemGroup FUDGE_RUNES = new FRItemGroup(ItemGroup.TABS.length, "fudge_runes");

	public FRItemGroup(int p_i1853_1_, String p_i1853_2_) {
		super(p_i1853_1_, p_i1853_2_);
		// TODO Auto-generated constructor stub
	}

	@Override
	public ItemStack makeIcon() {
		// TODO Auto-generated method stub
		return new ItemStack(ItemInit.RUNIC_QUARTZ.get());
	}

}
