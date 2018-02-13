package mastef_chief.intothemineframe.app;

import com.mrcrayfish.device.api.app.Application;
import com.mrcrayfish.device.api.app.Icons;
import com.mrcrayfish.device.api.app.Layout;
import com.mrcrayfish.device.api.app.component.Button;
import net.minecraft.nbt.NBTTagCompound;

public class ITMApp extends Application {

    //Layout Variables
    private Layout itmMenuLayout;
    private Layout itmSelectionLayout;

    //Button Variable
    private Button enterButton;

    @Override
    public void init() {

        //---ITM Menu Layout---
        itmMenuLayout = new Layout(125,30);

        this.setCurrentLayout(itmMenuLayout);

        //Create ITM Menu Components
        enterButton = new Button(5,7,115, 16, "Play", Icons.PLAY);

        //Add ITM Menu Components
        itmMenuLayout.addComponent(enterButton);


        //---End of ITM Menu Layout---

    }

    @Override
    public void load(NBTTagCompound nbtTagCompound) {

    }

    @Override
    public void save(NBTTagCompound nbtTagCompound) {

    }
}
