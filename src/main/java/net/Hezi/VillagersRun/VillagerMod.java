package net.Hezi.VillagersRun;

import org.slf4j.Logger;
import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;
import net.neoforged.neoforge.common.NeoForge;
import net.Hezi.VillagersRun.Event.TornadoEventHandler;

@Mod(VillagerMod.MODID)
public class VillagerMod {
    public static final String MODID = "villagersrun";
    public static final Logger LOGGER = LogUtils.getLogger();

    public VillagerMod(IEventBus modEventBus, ModContainer modContainer) {
        // Register your tornado event handler
        NeoForge.EVENT_BUS.register(new TornadoEventHandler());

        LOGGER.info("Villagers Take Cover mod loaded!");
    }
}