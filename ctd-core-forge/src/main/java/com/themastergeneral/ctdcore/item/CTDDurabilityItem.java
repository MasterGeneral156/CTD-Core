/*
	Project:	CTD Core 1.21
	File:		CTDDurabilityItem.java
	Author:		TheMasterGeneral
	Website: 	https://github.com/MasterGeneral156/CTD-Core
	License:	MIT License
				Copyright (c) 2023 TheMasterGeneral
				
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

import java.util.List;


import com.themastergeneral.ctdcore.helpers.CTDConstants;
import com.themastergeneral.ctdcore.helpers.ModUtils;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class CTDDurabilityItem extends CTDItem {


	public CTDDurabilityItem(Properties properties, int durability) {
		super(properties.durability(durability).stacksTo(1));
	}
	
	public CTDDurabilityItem(int durability) 
	{
		super(new Properties().durability(durability).stacksTo(1));
	}

	@Override
	public ItemStack getCraftingRemainingItem(ItemStack itemStack)
    {
		ItemStack stack = itemStack.copy();
		if(stack.getDamageValue() == stack.getMaxDamage())
			return ItemStack.EMPTY;
		else
		{
			if (stack.getMaxDamage() != CTDConstants.creativeDurability)
				stack.hurtAndBreak(1, null, null);
			return stack.copy();
		}
    }

	@Override
	public boolean hasCraftingRemainingItem(ItemStack stack)
	{
		return true;
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack stack, Item.TooltipContext p_333372_, List<Component> tooltip, TooltipFlag flagIn) {
		if (stack.isDamageableItem()) {
			int remaining = stack.getMaxDamage() - stack.getDamageValue();

			if (Screen.hasShiftDown()) {
				tooltip.add(ModUtils.displayString("Durability: "
						+ ModUtils.returnFormattedNumber(remaining) + "/"
						+ ModUtils.returnFormattedNumber(stack.getMaxDamage())));
			} else {
				tooltip.add(ModUtils.displayString("Durability: "
						+ ModUtils.returnShortenedNumber(remaining) + "/"
						+ ModUtils.returnShortenedNumber(stack.getMaxDamage())));
			}
		}
	}

	
	@Override
	public boolean isFoil(ItemStack stack) {
		if (stack.isEnchanted())
			return true;
		else if (stack.getMaxDamage() == CTDConstants.creativeDurability)
			return true;
		else
			return false;
    }
}
