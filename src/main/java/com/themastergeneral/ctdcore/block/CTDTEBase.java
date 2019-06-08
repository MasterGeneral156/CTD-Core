package com.themastergeneral.ctdcore.block;

import javax.annotation.Nullable;

import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.extensions.IForgeBlockState;

public abstract class CTDTEBase<TE extends TileEntity, IBlockAccess> extends CTDBlock {

	public CTDTEBase(Properties material, String name, String ModID) {
		super(material, name, ModID);
	}
	
	public abstract Class<TE> getTileEntityClass();
	
	public TE getTileEntity(IBlockAccess world, BlockPos pos) {
		return (TE)((World) world).getTileEntity(pos);
	}
	
	public boolean hasTileEntity(IForgeBlockState state) {
		return true;
	}
	
	@Nullable
	public abstract TE createTileEntity(World world, IForgeBlockState state);

}
