package hewin.max.firstmod;


import hewin.max.firstmod.init.BlockInit;
import hewin.max.firstmod.init.CreativeInit;
import hewin.max.firstmod.init.ItemInit;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(FirstMod.MODID)
public class FirstMod {

    public static final String MODID = "firstmod";

    public FirstMod() {
        // Initialise eventbus
        IEventBus modbus = FMLJavaModLoadingContext.get().getModEventBus();

        // Add files to eventbus
        ItemInit.ITEMS.register(modbus);
        BlockInit.BLOCK.register(modbus);
        CreativeInit.TABS.register(modbus);
    }

}
