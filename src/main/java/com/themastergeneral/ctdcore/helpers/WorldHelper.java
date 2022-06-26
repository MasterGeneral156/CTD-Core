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
import net.minecraft.world.level.block.Block;

public class WorldHelper 
{
	// Function used to find the block under an entity.
	/*public static Block findBlockUnderEntity(Entity e) 
	{
		int blockX = MathHelper.floor(e.getX());
		int blockY = MathHelper.floor(e.getY()-0.2D - e.getEyeY());
		int blockZ = MathHelper.floor(e.getZ());
		BlockPos blockpos = new BlockPos(blockX, blockY, blockZ);
		return e.getCommandSenderWorld().getBlockState(blockpos).getBlock();
	}*/
}