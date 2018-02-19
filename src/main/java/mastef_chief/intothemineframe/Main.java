package mastef_chief.intothemineframe;

import com.mrcrayfish.device.api.ApplicationManager;
import mastef_chief.intothemineframe.app.ITMApp;
import mastef_chief.intothemineframe.init.RegistrationHandler;
import mastef_chief.intothemineframe.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS, dependencies = Reference.DEPENDS)
public class Main {

    private static Logger logger;

    @Mod.Instance
    public static Main instance;

    public static final CreativeTabs ITMTab = new ITMTab("ITMTab");

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){}

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event){
        RegistrationHandler.init();

        ApplicationManager.registerApplication(new ResourceLocation(Reference.MOD_ID, "itm_app"), ITMApp.class);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){}

}
