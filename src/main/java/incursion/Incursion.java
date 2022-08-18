package incursion;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Incursion implements ModInitializer {

	public static final Logger LOGGER = LoggerFactory.getLogger("modid");


	@Override
	public void onInitialize()
	{
		IItems.registerItems();

		LOGGER.info("Hello Fabric world!");
	}
}
