package mastef_chief.intothemineframe.blocks;

import mastef_chief.intothemineframe.EnumModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.util.EnumFacing;

/**
 * Makes creating Blocks easier
 * @author TyrellPlayz
 */
public class ModBlock extends Block {

	// Do not need for every block
    public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);

	public ModBlock(Material materialIn, EnumModBlocks name) {
		super(materialIn);
		setUnlocalizedName(name.getUnlocalizedName());
		setRegistryName(name.getRegistryName());
	}

	public ModBlock(Material blockMaterialIn, MapColor blockMapColorIn, EnumModBlocks name) {
		super(blockMaterialIn, blockMapColorIn);
		setUnlocalizedName(name.getUnlocalizedName());
		setRegistryName(name.getRegistryName());
	}

}
