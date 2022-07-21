/*
	Project:	CTD Core 1.18
	File:		com.themastergeneral.ctdcore.helpers.WorldHelper
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
//Helper class for world base stuff.
package com.themastergeneral.ctdcore.helpers;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;

public class WorldHelper 
{
	/**
	 * Find the block under the input entity
	 * @param e Entity to find block for
	 * @since 1.18.2-2.1.3
	 * @return boolean
	 */
	public static Block findBlockUnderEntity(Entity e) 
	{
		double blockX = Math.floor(e.getX());
		double blockY = Math.floor(e.getY()-0.2D - e.getEyeY());
		double blockZ = Math.floor(e.getZ());
		BlockPos blockpos = new BlockPos(blockX, blockY, blockZ);
		return e.getCommandSenderWorld().getBlockState(blockpos).getBlock();
	}
	
	/**
	 * Test to see if current loaded level is raining
	 * @param level Level to test
	 * @return boolean
	 */
	public static boolean isRaining(Level level) 
	{
		return level.isRaining();
	}
	
	/**
	 * Test to see if current loaded level is night
	 * @param level Level to test
	 * @since 1.18.2-2.1.3
	 * @return boolean
	 */
	public static boolean isCurrentlyNight(Level level)
	{
		return level.isNight();
	}
	
	/**
	 * Test to see if currently night and during a thunderstorm
	 * @param level Level to test
	 * @since 1.18.2-2.1.3
	 * @return boolean
	 */
	public static boolean isPerfectStorm(Level level)
	{
		return (isRaining(level) && level.isThundering() && isCurrentlyNight(level));
	}
}