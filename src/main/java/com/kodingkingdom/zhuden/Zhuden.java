package com.kodingkingdom.zhuden;

import java.util.logging.Level;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;


public class Zhuden implements Listener {

	//Collect Time frequency of building events, Periodic world saves, Chat messages, Treasure hunt questions
	
	
	ZhudenPlugin plugin;	
	public Zhuden(ZhudenPlugin Plugin){plugin=Plugin;}
	
	public void Live () {
		plugin.registerEvents(this);
	}	
	public void Die () {}
	

	@EventHandler
    public void log_build (BlockPlaceEvent e) {
        plugin .getLogger () .log (Level .FINE,  ("placed, " + e .getPlayer () .getDisplayName () + " (aka) " + e .getPlayer () .getName () + " (aka) " + e .getPlayer() .getUniqueId ()));;
	}
	@EventHandler
    public void log_break (BlockBreakEvent e) {
        plugin .getLogger () .log (Level .FINE,  ("broke, " + e .getPlayer () .getDisplayName () + " (aka) " + e .getPlayer () .getName () + " (aka) " + e .getPlayer() .getUniqueId ()));;
	}
}
