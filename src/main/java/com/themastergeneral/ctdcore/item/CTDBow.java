/*
	Project:	CTD Core 1.19
	File:		com.themastergeneral.ctdcore.item.CTDBow
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
//Extend to create a bow that uses ammo from ItemArrow
package com.themastergeneral.ctdcore.item;

import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.ItemStack;

public class CTDBow extends BowItem {
	protected int drawspeed; // How long it should take to draw the bow completely.
	
	public CTDBow(Properties builder, int drawspeed, int maxdurability) {
		super(builder.defaultDurability(maxdurability));
		this.drawspeed = drawspeed;
	}

	public int getMaxItemUseDuration(ItemStack stack) {
		return drawspeed;
	}

}
