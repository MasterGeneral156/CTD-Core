/**
 * Project		CTD Core 1.21 - Neo
 * File			com.themastergeneral.ctdcore.item.CTDConsumableItem.java
 * Author		TheMasterGeneral
 * Website		https://github.com/MasterGeneral156/CTD-Core
 * 				https://www.curseforge.com/minecraft/mc-mods/ctd-core
 * 				https://modrinth.com/mod/ctd-core
 * 				https://maven.chivalryengine.com/
 * 	License		MIT License
 *
 * 				Copyright (c) 2025 TheMasterGeneral
 *
 * 				Permission is hereby granted, free of charge, to any person obtaining a copy
 * 				of this software and associated documentation files (the "Software"), to deal
 * 				in the Software without restriction, including without limitation the rights
 * 				to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * 				copies of the Software, and to permit persons to whom the Software is
 * 				furnished to do so, subject to the following conditions:
 *
 * 				The above copyright notice and this permission notice shall be included in all
 * 				copies or substantial portions of the Software.
 *
 * 				THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * 				IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * 				FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * 				AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * 				LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * 				OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * 				SOFTWARE.
 */
package com.themastergeneral.ctdcore.item;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class CTDConsumableItem extends CTDItem {

	public CTDConsumableItem(ResourceKey<Item> key, int hungerFed, float saturation) {
		super(key, new Item.Properties().food(new FoodProperties.Builder()
				.nutrition(hungerFed)
				.saturationModifier(saturation)
				.build()));
	}

	public CTDConsumableItem(ResourceKey<Item> key, float saturation) {
		super(key, new Item.Properties().food(new FoodProperties.Builder()
				.saturationModifier(saturation)
				.build()));
	}

	public CTDConsumableItem(ResourceKey<Item> key, int hungerFed) {
		super(key, new Item.Properties().food(new FoodProperties.Builder()
				.nutrition(hungerFed)
				.build()));
	}

	//TODO make work with effects.
	/*public CTDConsumableItem(int hungerFed, float saturation, MobEffectInstance effect, float effectChance) {
		super(new Item.Properties().food(new FoodProperties.Builder()
				.nutrition(hungerFed)
				.saturationMod(saturation)
				.effect(effect, effectChance)
				.build()));
	}*/

}
