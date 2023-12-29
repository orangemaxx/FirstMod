package hewin.max.firstmod.init;

import hewin.max.firstmod.FirstMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class TagInit {

    public static final TagKey<Block> NEEDS_NORMAL_TOOL = tag("needs_normal_tool");

    private static TagKey<Block> tag(String name) {
        return BlockTags.create(new ResourceLocation(FirstMod.MODID, name));
    }

}
