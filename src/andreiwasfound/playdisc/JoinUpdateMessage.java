package andreiwasfound.playdisc;

import andreiwasfound.playdisc.utilities.UpdateChecker;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinUpdateMessage implements Listener {

    private Main plugin;

    JoinUpdateMessage(Main plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();
        if (player.hasPermission("playdisc.updatemessage")) {
        new UpdateChecker(plugin, 82591).getLatestVersion(version -> {
            if (!(plugin.getDescription().getVersion().equalsIgnoreCase(version))) {
                player.sendMessage(ChatColor.GREEN + "PlayDisc is " + ChatColor.RED + "outdated!");
                player.sendMessage(ChatColor.GREEN + "Newest version: " + ChatColor.GOLD +  version);
                player.sendMessage(ChatColor.GREEN + "Server version: " + ChatColor.RED + plugin.pluginymlVersion);
                player.sendMessage(ChatColor.GREEN + "Please Update Here: " + ChatColor.RED + plugin.pluginymlWebsite);
            }
        });
    }
    }
}
