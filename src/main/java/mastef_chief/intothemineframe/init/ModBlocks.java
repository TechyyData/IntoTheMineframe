package mastef_chief.intothemineframe.init;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;

/**
 * Used for registering blocks
 * @author TyrellPlayz
 */
public class ModBlocks {

    //public static Block example;

    static {
        //example = new BlockExample();
    }

    /**
     * Register blocks
     */
    public static void register() {
        //registerBlock(example);
    }

    private static void registerBlock(Block block) {
        registerBlock(block, new ItemBlock(block));
    }

    private static void registerBlock(Block block, ItemBlock item) {
        if(block.getRegistryName() == null)
            throw new IllegalArgumentException("A block being registered does not have a registry name and could be successfully registered.");
        RegistrationHandler.Blocks.add(block);
        item.setRegistryName(block.getRegistryName());
        RegistrationHandler.Items.add(item);
    }


}
