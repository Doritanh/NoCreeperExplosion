package fr.doritanh.plugins.noCreeperExplosion;

import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;

public class CreeperExplodeListener implements Listener {

	@EventHandler
	public void onEntityExplode(EntityExplodeEvent event) {
		if (event.getEntity().getType() == EntityType.CREEPER) {
			event.setCancelled(true);
			event.getEntity().getWorld().spawnParticle(
					Particle.EXPLOSION_LARGE,
					event.getEntity().getLocation(),
					0);
			event.getEntity().getWorld().playSound(
					event.getEntity().getLocation(),
					Sound.ENTITY_GENERIC_EXPLODE,
					1,
					1);
		}
	}
	
}
