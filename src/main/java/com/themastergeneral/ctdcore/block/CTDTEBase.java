package com.themastergeneral.ctdcore.block;

import javax.annotation.Nullable;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public abstract class CTDTEBase<TE extends TileEntity, IBlockAccess> extends CTDBlock {

	public CTDTEBase(Properties material, String name, String ModID) {
		super(material, name, ModID);
	}
	
	public abstract Class<TE> getTileEntityClass();
	
	public TE getTileEntity(IBlockAccess world, BlockPos pos) {
		return (TE)((World) world).getTileEntity(pos);
	}
	
	@Override
	public boolean hasTileEntity(IBlockState state) {
		return true;
	}
	
	@Nullable
	public abstract TE createTileEntity(World world, IBlockState state);

}
