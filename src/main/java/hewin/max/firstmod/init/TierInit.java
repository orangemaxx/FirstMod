package hewin.max.firstmod.init;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class TierInit {

    public static final ForgeTier NORMAL = new ForgeTier(
            4,
            1800,
            0.5f,
            0.0f,
            15,
            TagInit.NEEDS_NORMAL_TOOL,
            () -> Ingredient.of(ItemInit.NORMALDIFFICULTY.get())
    );

}
