
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.modtest.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.modtest.ModtestMod;

public class ModtestModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(ModtestMod.MODID);
	public static final DeferredItem<Item> MOB_TEST_01_SPAWN_EGG = REGISTRY.register("mob_test_01_spawn_egg", () -> new DeferredSpawnEggItem(ModtestModEntities.MOB_TEST_01, -1, -1, new Item.Properties()));
	// Start of user code block custom items
	// End of user code block custom items
}
