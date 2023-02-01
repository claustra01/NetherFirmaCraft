package claustra01.netherfirmacraft;

import claustra01.netherfirmacraft.block.NFCBlock;
import com.mojang.logging.LogUtils;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod("netherfirmacraft")
public class NetherFirmaCraft {

	public static final String namespace = "tfc";

	public static final Logger LOGGER = LogUtils.getLogger();

	public NetherFirmaCraft() {
		final IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		NFCBlock.BLOCKS.register(bus);
	}
}
