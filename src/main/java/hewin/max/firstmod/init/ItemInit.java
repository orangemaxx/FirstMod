package hewin.max.firstmod.init;

import hewin.max.firstmod.FirstMod;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FirstMod.MODID);

    public static final RegistryObject<Item> NORMALDIFFICULTY = ITEMS.register(
            "normal_difficulty", () -> new Item(new Item.Properties()
                    .stacksTo(420)
                    .rarity(Rarity.EPIC)
                    .food(new FoodProperties.Builder()
                            .nutrition(5)
                            .saturationMod(0.2f)
                            .build())));

    public static final RegistryObject<Item> MONEY = ITEMS.register("money",
            () -> new Item(new Item.Properties()
                    .stacksTo(1)));

}
