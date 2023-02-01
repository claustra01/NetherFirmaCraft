package claustra01.netherfirmacraft;

import com.mojang.logging.LogUtils;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(NetherFirmaCraft.mod_id)
public class NetherFirmaCraft {

	public static final String mod_id = "netherfirmacraft";

	public static final Logger LOGGER = LogUtils.getLogger();

	public NetherFirmaCraft() {
		final IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
	}
}
