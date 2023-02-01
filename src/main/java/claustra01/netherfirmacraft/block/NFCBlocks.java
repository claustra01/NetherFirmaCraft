package claustra01.netherfirmacraft.block;

import claustra01.netherfirmacraft.NetherFirmaCraft;
import claustra01.netherfirmacraft.item.NFCItems;
import net.dries007.tfc.common.TFCItemGroup;
import net.dries007.tfc.common.blocks.rock.Ore;
import net.dries007.tfc.util.Helpers;
import net.dries007.tfc.util.registry.RegistrationHelpers;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nullable;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

public class NFCBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, NetherFirmaCraft.namespace);

    public static final Map<NetherRock, Map<Ore, RegistryObject<Block>>> ORES = Helpers.mapOfKeys(NetherRock.class, rock ->
            Helpers.mapOfKeys(Ore.class, ore -> !ore.isGraded(), ore ->
                    register(("ore/" + ore.name() + "/" + rock.name()), () -> ore.create(rock), TFCItemGroup.ORES)
            )
    );

    public static final Map<NetherRock, Map<Ore, Map<Ore.Grade, RegistryObject<Block>>>> GRADED_ORES = Helpers.mapOfKeys(NetherRock.class, rock ->
            Helpers.mapOfKeys(Ore.class, Ore::isGraded, ore ->
                    Helpers.mapOfKeys(Ore.Grade.class, grade ->
                            register(("ore/" + grade.name() + "_" + ore.name() + "/" + rock.name()), () -> ore.create(rock), TFCItemGroup.ORES)
                    )
            )
    );

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> blockSupplier, CreativeModeTab group)
    {
        return register(name, blockSupplier, block -> new BlockItem(block, new Item.Properties().tab(group)));
    }

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> blockSupplier, @Nullable Function<T, ? extends BlockItem> blockItemFactory)
    {
        return RegistrationHelpers.registerBlock(BLOCKS, NFCItems.ITEMS, name, blockSupplier, blockItemFactory);
    }
}
