package rembel.de.rembel.Listener;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event){
        event.setJoinMessage(ChatColor.GREEN+event.getPlayer().getName()+ChatColor.GOLD+" ist dem Server"+ChatColor.GREEN+" beigetreten.");
    }
}
