/*
	Project:	CTD Core 1.20
	File:		com.themastergeneral.ctdcore.helpers.ModUtils
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
package com.themastergeneral.ctdcore.helpers;

import java.text.NumberFormat;

import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;

public class ModUtils 
{
	/**
	 * Helper function to display a string as a component.
	 * @param string
	 * @return Literal Component
	 * @since 1.19.4-2.3.0
	 */
	public static MutableComponent displayString(String string)
	{
		return Component.literal(string);
	}
	
	/**
	 * Helper function to display a string translation key as a component.
	 * @param string
	 * @return Translatable Component
	 * @since 1.19.4-2.3.0
	 */
	public static MutableComponent displayTranslation(String string)
	{
		return Component.translatable(string);
	}
	
	/**
	 * Makes the input number into a friendly readable number (IE: 1K, 200K, 3M, etc.)
	 * @param number
	 * @return Formatted Number (IE: 1K, 200K, 3M)
	 * @since 1.20.2-2.4.5
	 */
	public static String returnShortenedNumber(Number number)
	{
		Long numberLong = (Long) number.longValue();
		NumberFormat nf = NumberFormat.getInstance();
		String returned;
		
		if (numberLong < 1000)
	        returned = nf.format(number);
	    else if (numberLong < 1000000L)
	        returned = nf.format(numberLong / 1000L) + "K";
	    else if (numberLong < 1000000000L)
	        returned = nf.format(numberLong / 1000000L) + "M";
	    else if (numberLong < 1000000000000L)
	        returned = nf.format(numberLong / 1000000000L) + "B";
	    else if (numberLong < 1000000000000000L)
	        returned = nf.format(numberLong / 1000000000000L) + "T";
	    else if (numberLong < 1000000000000000000L)
	        returned = nf.format(numberLong / 1000000000000000L) + " Q";
	    else
	        returned = nf.format(number);
	    return returned;
	}
}
