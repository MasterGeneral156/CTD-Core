/*
	Project:	CTD Core 1.19
	File:		com.themastergeneral.ctdcore.helpers.WorldHelper
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
//Helper class for world base stuff.
package com.themastergeneral.ctdcore.helpers;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;

public class WorldHelper 
{
	// Function used to find the block under an entity.
	public static Block findBlockUnderEntity(Entity e) 
	{
		int blockX = e.getBlockX();
		int blockY = e.getBlockY();
		int blockZ = e.getBlockZ();
		BlockPos blockpos = new BlockPos(blockX, blockY, blockZ);
		return e.getCommandSenderWorld().getBlockState(blockpos).getBlock();
	}
	
	/**
	 * Test to see if level is raining
	 * @param level Level to test
	 * @return boolean
	 * @since 1.17.1-2.1.1b
	 */
	public static boolean isRaining(Level level) 
	{
		return level.isRaining();
	}
	
	/**
	 * Test to see if level is storming
	 * @param level Level to test
	 * @return boolean
	 * @since 1.20.2-2.4.5
	 */
	public static boolean isStorming(Level level)
	{
		return level.isThundering();
	}
	
	/**
	 * Test to see if level is currently day
	 * @param level Level to test
	 * @return boolean
	 * @since 1.20.2-2.4.5
	 */
	public static boolean isDaytime(Level level)
	{
		return level.isDay();
	}
	
	/**
	 * Test to see if level is currently night
	 * @param level Level to test
	 * @return boolean
	 * @since 1.20.2-2.4.5
	 */
	public static boolean isNighttime(Level level)
	{
		return level.isNight();
	}
	
	/**
	 * Test to see if level is daytime and not raining/storming.
	 * Used for solar powered generators.
	 * @param level Level to test
	 * @return boolean
	 * @since 1.20.2-2.4.5
	 */
	public static boolean isClearDaytime(Level level)
	{
		return ((isDaytime(level)) && (!isRaining(level)) && (!isStorming(level)));
	}
	
	/**
	 * Test to see if level is daytime and not raining/storming
	 * Used for moon powered generators.
	 * @param level Level to test
	 * @return boolean
	 * @since 1.20.2-2.4.5
	 */
	public static boolean isClearNighttime(Level level)
	{
		return ((isNighttime(level)) && (!isRaining(level)) && (!isStorming(level)));
	}
}