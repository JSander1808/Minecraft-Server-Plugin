package rembel.de.rembel.Main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import rembel.de.rembel.Listener.JoinListener;
import rembel.de.rembel.Listener.QuitListener;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new JoinListener(),this);
        pluginManager.registerEvents(new QuitListener(),this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
