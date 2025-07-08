package net.ayoubmrz.muckequipmentmod;

import net.ayoubmrz.muckequipmentmod.block.ModBlocks;
import net.ayoubmrz.muckequipmentmod.item.ModItemGroups;
import net.ayoubmrz.muckequipmentmod.item.ModItems;
import net.ayoubmrz.muckequipmentmod.util.ModTags;
import net.ayoubmrz.muckequipmentmod.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MuckEquipmentMod implements ModInitializer {
	public static final String MOD_ID = "muckequipmentmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();

		ModWorldGeneration.generateModWorldGen();

	}
}