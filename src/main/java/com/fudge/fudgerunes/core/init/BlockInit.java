package com.fudge.fudgerunes.core.init;

import com.fudge.fudgerunes.FudgeRunes;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
			FudgeRunes.MOD_ID);

	public static final RegistryObject<Block> RUNIC_QUARTZ_ORE = BLOCKS.register("runic_quartz_ore",
			() -> new Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.COLOR_GRAY).strength(1.1f, 4F)
					.lightLevel(s -> 1).requiresCorrectToolForDrops().harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE)));

}
