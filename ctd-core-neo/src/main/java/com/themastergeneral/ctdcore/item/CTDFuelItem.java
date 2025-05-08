/**
 * Project		CTD Core 1.21 - Neo
 * File			com.themastergeneral.ctdcore.item.CTDFuelItem.java
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

import javax.annotation.Nullable;

import com.themastergeneral.ctdcore.helpers.ModUtils;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.entity.FuelValues;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;

import java.util.List;
import java.util.function.Consumer;

public class CTDFuelItem extends CTDItem {

	private final int burnTicks;

	public CTDFuelItem(ResourceKey<Item> key, Properties properties, int burnTicks)
	{
		super(key, properties);
		this.burnTicks = burnTicks;
	}

	public CTDFuelItem(ResourceKey<Item> key, int burnTicks)
	{
		super(key, new Properties().setId(key));
		this.burnTicks = burnTicks;
	}

	public CTDFuelItem(ResourceKey<Item> key, int maxStackSize, int burnTicks)
	{
		super(key, new Properties().stacksTo(maxStackSize).setId(key));
		this.burnTicks = burnTicks;
	}

	@Override
	public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType, FuelValues fuelValues)
	{
		return this.burnTicks;
	}
}
