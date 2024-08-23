package lunar.imcompatible;

import org.bukkit.plugin.java.JavaPlugin;

import lib.crescent.nms.core.RegistryManager;
import lib.crescent.nms.enchantment.NMSEnchantment;
import net.minecraft.core.registries.Registries;

public class InfinityMendingCompatible extends JavaPlugin {
	public void onEnable() {
		RegistryManager.unfreezeRegistry(Registries.ENCHANTMENT);
		NMSEnchantment.removeExclusiveSet("minecraft:infinity");
		NMSEnchantment.removeExclusiveSet("minecraft:mending");
		RegistryManager.freezeRegistry(Registries.ENCHANTMENT);
	}
}
