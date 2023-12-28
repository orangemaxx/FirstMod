package hewin.max.firstmod;


import hewin.max.firstmod.init.ItemInit;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(FirstMod.MODID)
public class FirstMod {

    public static final String MODID = "firstmod";

    public FirstMod() {
        IEventBus modbus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.ITEMS.register(modbus);
    }

}
