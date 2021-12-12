package fr.doritanh.plugins.noCreeperExplosion;

import org.bukkit.plugin.java.JavaPlugin;

public class NoCreeperExplosion extends JavaPlugin {
	
	 @Override
	 public void onEnable() {
	 	this.getServer().getPluginManager().registerEvents(new CreeperExplodeListener(), this);
	 }
	    
	 @Override
	 public void onDisable() {}
}
