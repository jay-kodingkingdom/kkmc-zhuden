package com.kodingkingdom.zhuden;
import java.util.logging.Level;

import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;


public class ZhudenPlugin extends JavaPlugin {
	public Zhuden x=new Zhuden(this);
	@Override
    public void onEnable(){x.Live();} 
    @Override
    public void onDisable(){x.Die();}
        
    public Zhuden getHunt(){return x;}

	public void registerEvents(Listener listener){
		this.getServer().getPluginManager().registerEvents(listener, this);}
	public void deregisterEvents(Listener listener){
		HandlerList.unregisterAll(listener);}

	public int scheduleAsyncTask(Runnable task){
		return this.getServer().getScheduler().scheduleAsyncDelayedTask(this, task);}
	public int scheduleAsyncTask(Runnable task, long delay){
		return this.getServer().getScheduler().scheduleAsyncDelayedTask(this, task, delay);}
	public int scheduleTask(Runnable task, long delay){
		return this.getServer().getScheduler().scheduleSyncDelayedTask(this, task, delay);}
	public void cancelTask(int taskId){
		this.getServer().getScheduler().cancelTask(taskId);}
	
    static ZhudenPlugin singleton;
    public ZhudenPlugin(){singleton=this;}
    public static ZhudenPlugin getPlugin(){return singleton;}
    public static void debug(String msg){
    		singleton.getLogger().log(Level.INFO
    				, msg);}}