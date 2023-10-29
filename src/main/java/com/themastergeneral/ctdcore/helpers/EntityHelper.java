/*
	Project:	CTD Core 1.20
	File:		com.themastergeneral.ctdcore.helpers.EntityHelper
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

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

public class EntityHelper {

	/**
	 * Return the current player's helmet as ItemStack.
	 * @param player
	 * @return Player's helmet ItemStack.
	 * @since 1.19.4-2.3.1
	 */
	public static ItemStack getPlayerHelmet(Player player)
	{
		return player.getInventory().getArmor(CTDConstants.helmetSlot);
	}
	
	/**
	 * Return the current player's chest plate as ItemStack.
	 * @param player
	 * @return Player's chestplate ItemStack.
	 * @since 1.19.4-2.3.1
	 */
	public static ItemStack getPlayerChest(Player player)
	{
		return player.getInventory().getArmor(CTDConstants.chestSlot);
	}
	
	/**
	 * Return the current player's leggings as ItemStack.
	 * @param player
	 * @return Player's leggings ItemStack.
	 * @since 1.19.4-2.3.1
	 */
	public static ItemStack getPlayerLegs(Player player)
	{
		return player.getInventory().getArmor(CTDConstants.legSlot);
	}
	
	/**
	 * Return the current player's boots as itemstack.
	 * @param player
	 * @return Player's boots ItemStack.
	 * @since 1.19.4-2.3.1
	 */
	public static ItemStack getPlayerBoots(Player player)
	{
		return player.getInventory().getArmor(CTDConstants.bootSlot);
	}
	
	/**
	 * Tests the UUID to see if its REALLY the CTD Core mod author...
	 * @param String playerUUID
	 * @return bool
	 * @since 1.20.2-2.4.5
	 */
	public static boolean isMasterGeneral(String playerUUID)
	{
		if (playerUUID == CTDConstants.tmgUUID)
			return true;
		else if (playerUUID == CTDConstants.tmgAltUUID)
			return true;
		else
			return false;
	}
	
	/**
	 * Tests the Player Entity to see if its REALLY the CTD Core mod author...
	 * @param Player player
	 * @return bool
	 * @since 1.20.2-2.4.5
	 */
	public static boolean isMasterGeneral(Player player)
	{
		return isMasterGeneral(player.getStringUUID());
	}
}
