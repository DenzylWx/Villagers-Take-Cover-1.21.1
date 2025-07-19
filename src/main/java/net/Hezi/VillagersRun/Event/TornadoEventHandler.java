package net.Hezi.VillagersRun.Event;
import net.neoforged.neoforge.event.tick.ServerTickEvent;
import net.neoforged.bus.api.SubscribeEvent;


public class TornadoEventHandler {

    @SubscribeEvent
    public void onServerTick(ServerTickEvent.Post event) {
        // Check for tornadoes using PMWeather API
        // This is where you'll add tornado detection code later
        System.out.println("Checking for tornadoes..."); // Test message
    }
}
