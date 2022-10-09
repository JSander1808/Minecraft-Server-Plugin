package rembel.de.rembel.Listener;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class QuitListener implements Listener {

    @EventHandler
    public void onQuit(PlayerQuitEvent event){
        event.setQuitMessage(ChatColor.RED+event.getPlayer().getName()+ChatColor.GOLD+" hat den Server"+ChatColor.RED+" verlassen.");
    }
}
