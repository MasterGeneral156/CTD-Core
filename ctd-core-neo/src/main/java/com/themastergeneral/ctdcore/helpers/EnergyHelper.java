package com.themastergeneral.ctdcore.helpers;
/*
	Project:	CTD Core 1.21
	File:		com.themastergeneral.ctdcore.helpers.EnergyHelper
	Author:		TheMasterGeneral
	Website: 	https://github.com/MasterGeneral156/CTD-Core
	License:	MIT License

				Copyright (c) 2024 TheMasterGeneral

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
public class EnergyHelper {

	/**
	 * Return AE2 Energy from Forge Energy Units
	 * @param int Forge Energy
	 * @return AE2 Energy
	 * @since 1.21-2.6.2
	 */
	public int FEtoAE(int energy)
	{
		return energy / 2;
	}

	/**
	 * Return Forge Energy from AE2 Energy
	 * @param int AE2 Energy
	 * @return Forge Energy
	 * @since 1.21-2.6.2
	 */
	public int AEtoFE(int energy)
	{
		return energy * 2;
	}

}
