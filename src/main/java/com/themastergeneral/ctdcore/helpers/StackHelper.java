/*
	Project:	CTD Core 1.19
	File:		com.themastergeneral.ctdcore.helpers.StackHelper
	Author:		TheMasterGeneral
	Website: 	https://github.com/MasterGeneral156/CTD-Core
	License:	MIT License

				Copyright (c) 2022 TheMasterGeneral
				
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
//Stack handling helpers.
package com.themastergeneral.ctdcore.helpers;

import net.minecraft.world.item.ItemStack;

public class StackHelper {
	
	/**
	 * Return if input ItemStack is a non-null, valid ItemStack.
	 * @param stack ItemStack to test
	 * @since 1.12.2
	 * @return boolean
	 */
	public static boolean isValid(ItemStack stack) 
	{
		return stack != null && !stack.isEmpty();
	}

	/**
	 * Return the size of an itemstack
	 * @param stack ItemStack to test
	 * @since 1.12.2
	 * @return boolean
	 */
	public static int getStackSize(ItemStack stack) 
	{
		if (!isValid(stack))
			return 0;
		else
			return stack.getCount();
	}
}
