package hewin.max.firstmod.init;

import hewin.max.firstmod.FirstMod;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ToolsInit {

    public static final DeferredRegister<Item> TOOL = DeferredRegister.create(ForgeRegistries.ITEMS, FirstMod.MODID);

    public static final RegistryObject<SwordItem> NORMAL_SWORD = TOOL.register()

}
