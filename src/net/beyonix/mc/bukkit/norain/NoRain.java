package net.beyonix.mc.bukkit.norain;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.weather.WeatherChangeEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class NoRain extends JavaPlugin implements Listener {

	@EventHandler
	public void onWeatherChange(WeatherChangeEvent event) {
		//Cancel the event if it specifies that rain will start
		if ( event.toWeatherState() )
			event.setCancelled( super.isEnabled() );
	}
}