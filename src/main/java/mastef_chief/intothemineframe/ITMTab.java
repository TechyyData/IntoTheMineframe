package mastef_chief.intothemineframe;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ITMTab extends CreativeTabs {

    public ITMTab(String label) {super("ITMTab");}

    @Override
    public ItemStack getTabIconItem() {return new ItemStack(Item.getItemFromBlock(Blocks.BARRIER));}//Barrier Block is placeholder until we make a mod block


}
