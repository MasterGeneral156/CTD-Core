/*
	Project:	CTD Core 1.19
	File:		com.themastergeneral.ctdcore.helpers.CTDConstants
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

import net.minecraft.world.entity.EquipmentSlot;

public class CTDConstants {

	//Equipment slots
	public static int helmetSlot	= EquipmentSlot.HEAD.getIndex();
	public static int chestSlot		= EquipmentSlot.CHEST.getIndex();
	public static int legSlot		= EquipmentSlot.LEGS.getIndex();
	public static int bootSlot		= EquipmentSlot.FEET.getIndex();
	
	//Important Player UUIDs
	public static String tmgUUID	= "ee1b5154-53c7-43df-99d3-4e8a7bac6d03";
	public static String tmgAltUUID	= "2d2c2552-01bf-42fb-86cb-d788cb66ffb2";
}
