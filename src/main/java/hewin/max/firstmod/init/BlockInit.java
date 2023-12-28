package hewin.max.firstmod.init;

import hewin.max.firstmod.FirstMod;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {

    public static final DeferredRegister<Block> BLOCK = DeferredRegister.create(ForgeRegistries.BLOCKS, FirstMod.MODID);

    public static final RegistryObject<Block> NORMAL_BLOCK = BLOCK.register("normal_block",
            () -> new Block(BlockBehaviour.Properties.of()));

}
