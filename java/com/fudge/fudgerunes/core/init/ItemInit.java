package com.fudge.fudgerunes.core.init;

import java.util.function.Supplier;

import com.fudge.fudgerunes.FudgeRunes;
import com.fudge.fudgerunes.core.api.GemEnum;
import com.fudge.fudgerunes.core.init.items.ItemRunedGem;
import com.fudge.fudgerunes.core.itemgroup.FudgeRunesItemGroup;

import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			FudgeRunes.MOD_ID);

	// Items
	public static final RegistryObject<Item> RUNIC_QUARTZ = ITEMS.register("runic_quartz",
			() -> new Item(new Properties().tab(FudgeRunesItemGroup.FUDGE_RUNES)));

// PRIOR ATTEMPT - IGNORE
	public static final Supplier<ItemRunedGem> RUNED_GEM = ITEMS.register("runed_gem",
			() -> new ItemRunedGem(new Properties().tab(FudgeRunesItemGroup.FUDGE_RUNES)));
	

	// Tools
	public static final RegistryObject<Item> CHISEL_TOOL = ITEMS.register("chisel_tool",
			() -> new Item(new Properties().tab(FudgeRunesItemGroup.FUDGE_RUNES)));
	

	public static void registerItems(RegistryEvent.Register<Item> event) {
		for (GemEnum e : GemEnum.values()) {
			Item item = e.getItem();
			String name = e.getSerializedName();
			
			item.setRegistryName(new ResourceLocation("fudgerunes","textures/items/"+name+".png"));
			event.getRegistry().register(item);
			
		}
		
	}

}
