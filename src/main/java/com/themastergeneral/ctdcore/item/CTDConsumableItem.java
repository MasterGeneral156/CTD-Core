/*
	Project:	CTD Core 1.20
	File:		com.themastergeneral.ctdcore.item.CTDConsumableItem
	Author:		TheMasterGeneral
	Website: 	https://github.com/MasterGeneral156/CTD-Core
	License:	MIT License

				Copyright (c) 2024 TheMasterGeneral
				
				Permission is hereby granted, free of charge, to any person obtaining a copy
				of this software and associated documentation files (the "Software"), to deal
				in the Software without restriction, including without limitation the rights
				to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
				copies of the Software, and to permit persons to whom the Software is
				furnished to do so, subject to the following conditions:
				
				The above copyright notice and this permission notice shall be included in all
				copies or substantial portions of the Software.
				
				THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
				IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
				FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
				AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
				LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
				OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
				SOFTWARE.
*/
package com.themastergeneral.ctdcore.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class CTDConsumableItem extends CTDItem {

	public CTDConsumableItem(int hungerFed, float saturation) {
		super(new Item.Properties().food(new FoodProperties.Builder()
				.nutrition(hungerFed)
				.saturationMod(saturation)
				.build()));
	}
	
	public CTDConsumableItem(float saturation) {
		super(new Item.Properties().food(new FoodProperties.Builder()
				.saturationMod(saturation)
				.build()));
	}
	
	public CTDConsumableItem(int hungerFed) {
		super(new Item.Properties().food(new FoodProperties.Builder()
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
