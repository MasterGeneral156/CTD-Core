/*
	Project:	CTD Core 1.20
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

import net.minecraft.util.RandomSource;
import net.minecraft.world.item.ItemStack;

public class CTDDurabilityItem extends CTDItem {

	private int maxDurability;

	public CTDDurabilityItem(Properties properties, int durability) {
		super(properties.defaultDurability(durability));
		this.maxDurability = durability;
	}
	
	public CTDDurabilityItem(int durability) 
	{
		super(new Properties().defaultDurability(durability));
		this.maxDurability = durability;
	}

	@Override
	public ItemStack getCraftingRemainingItem(ItemStack itemStack)
    {
		ItemStack stack = itemStack.copy();
		if(stack.hurt(1, RandomSource.createNewThreadLocalInstance(), null))
			return ItemStack.EMPTY;
		else
			return stack;
    }

	@Override
	public int getMaxDamage(ItemStack stack)
	{
		return maxDurability;
	}

	@Override
	public boolean hasCraftingRemainingItem(ItemStack stack)
	{
		return true;
	}
}
