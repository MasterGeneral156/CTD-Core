package com.themastergeneral.ctdcore.tests;

import com.themastergeneral.ctdcore.CTDCore;
import com.themastergeneral.ctdcore.item.CTDArrow;
import com.themastergeneral.ctdcore.item.CTDBow;
import com.themastergeneral.ctdcore.item.CTDShield;
import com.themastergeneral.ctdcore.item.RegisterItem;

public class ItemTest extends RegisterItem {
	public static void loadTestItems() {
		register(new CTDArrow("ctdarrow", CTDCore.MODID));
		register(new CTDBow("ctdbow", CTDCore.MODID, 36, 375));
		register(new CTDShield("ctdshield", CTDCore.MODID, 444));
	}
}
