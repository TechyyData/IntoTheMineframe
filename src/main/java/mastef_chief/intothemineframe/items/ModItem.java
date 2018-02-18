package mastef_chief.intothemineframe.items;


import mastef_chief.intothemineframe.EnumModItems;

import net.minecraft.item.Item;

/**
 * Makes creating Items easier
 * @author TyrellPlayz
 */
public class ModItem extends Item{

	public ModItem(EnumModItems name) {
		setUnlocalizedName(name.getUnlocalizedName());
		setRegistryName(name.getRegistryName());
	}
	
	
}
