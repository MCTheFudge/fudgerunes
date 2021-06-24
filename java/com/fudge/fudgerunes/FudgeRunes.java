package com.fudge.fudgerunes;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.fudge.fudgerunes.core.init.BlockInit;
import com.fudge.fudgerunes.core.init.ItemInit;
import com.fudge.fudgerunes.core.itemgroup.FudgeRunesItemGroup;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("fudgerunes")
@Mod.EventBusSubscriber(modid = FudgeRunes.MOD_ID, bus = Bus.MOD)
public class FudgeRunes {

	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MOD_ID = "fudgerunes";

	public FudgeRunes() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

		ItemInit.ITEMS.register(bus);
		BlockInit.BLOCKS.register(bus);

		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
		BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {

			event.getRegistry()
					.register(new BlockItem(block, new Item.Properties().tab(FudgeRunesItemGroup.FUDGE_RUNES))
							.setRegistryName(block.getRegistryName()));
		});
		
	}

	
}
