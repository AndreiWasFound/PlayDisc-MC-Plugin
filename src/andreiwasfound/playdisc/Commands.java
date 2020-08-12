package andreiwasfound.playdisc;

import org.bukkit.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commands implements CommandExecutor {

    private Main plugin;
    public Commands(Main plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player player = (Player) sender;
        if (args.length == 0) {
            player.sendMessage(ChatColor.RED + "Usage: /playdisc [disc name]");
            return true;
        } else if (args.length == 1) {
                if (args[0].equalsIgnoreCase("stop")) {
                player.stopSound(Sound.MUSIC_DISC_11);
                player.stopSound(Sound.MUSIC_DISC_13);
                player.stopSound(Sound.MUSIC_DISC_CAT);
                player.stopSound(Sound.MUSIC_DISC_CHIRP);
                player.stopSound(Sound.MUSIC_DISC_FAR);
                player.stopSound(Sound.MUSIC_DISC_MALL);
                player.stopSound(Sound.MUSIC_DISC_MELLOHI);
                player.stopSound(Sound.MUSIC_DISC_STAL);
                player.stopSound(Sound.MUSIC_DISC_STRAD);
                player.stopSound(Sound.MUSIC_DISC_WAIT);
                player.stopSound(Sound.MUSIC_DISC_WARD);
                player.stopSound(Sound.MUSIC_DISC_BLOCKS);
                player.stopSound(Sound.MUSIC_DISC_PIGSTEP);
                player.sendMessage(ChatColor.GREEN + "All playing songs have stopped");
                return true;
            } else if (args[0].equalsIgnoreCase("13")) {
                player.playSound(player.getLocation(), Sound.MUSIC_DISC_13, 60F, 1F);
                player.sendMessage(ChatColor.GREEN + "Now playing 13 by C418");
                return true;
            } else if (args[0].equalsIgnoreCase("11")) {
                player.playSound(player.getLocation(), Sound.MUSIC_DISC_11, 60F, 1F);
                player.sendMessage(ChatColor.GREEN + "Now playing 11 by C418");
                return true;
            } else if (args[0].equalsIgnoreCase("cat")) {
                player.playSound(player.getLocation(), Sound.MUSIC_DISC_CAT, 60F, 1F);
                player.sendMessage(ChatColor.GREEN + "Now playing cat by C418");
                return true;
            } else if (args[0].equalsIgnoreCase("chirp")) {
                player.playSound(player.getLocation(), Sound.MUSIC_DISC_CHIRP, 60F, 1F);
                player.sendMessage(ChatColor.GREEN + "Now playing chirp by C418");
                return true;
            } else if (args[0].equalsIgnoreCase("far")) {
                player.playSound(player.getLocation(), Sound.MUSIC_DISC_FAR, 60F, 1F);
                player.sendMessage(ChatColor.GREEN + "Now playing far by C418");
                return true;
            } else if (args[0].equalsIgnoreCase("mall")) {
                player.playSound(player.getLocation(), Sound.MUSIC_DISC_13, 60F, 1F);
                player.sendMessage(ChatColor.GREEN + "Now playing mall by C418");
                return true;
            } else if (args[0].equalsIgnoreCase("mellohi")) {
                player.playSound(player.getLocation(), Sound.MUSIC_DISC_MELLOHI, 60F, 1F);
                player.sendMessage(ChatColor.GREEN + "Now playing mellohi by C418");
                return true;
            } else if (args[0].equalsIgnoreCase("stal")) {
                player.playSound(player.getLocation(), Sound.MUSIC_DISC_STAL, 60F, 1F);
                player.sendMessage(ChatColor.GREEN + "Now playing stal by C418");
                return true;
            } else if (args[0].equalsIgnoreCase("strad")) {
                player.playSound(player.getLocation(), Sound.MUSIC_DISC_13, 60F, 1F);
                player.sendMessage(ChatColor.GREEN + "Now playing strad by C418");
                return true;
            } else if (args[0].equalsIgnoreCase("wait")) {
                player.playSound(player.getLocation(), Sound.MUSIC_DISC_WAIT, 60F, 1F);
                player.sendMessage(ChatColor.GREEN + "Now playing wait by C418");
                return true;
            } else if (args[0].equalsIgnoreCase("ward")) {
                player.playSound(player.getLocation(), Sound.MUSIC_DISC_WARD, 60F, 1F);
                player.sendMessage(ChatColor.GREEN + "Now playing ward by C418");
                return true;
            } else if (args[0].equalsIgnoreCase("blocks")) {
                player.playSound(player.getLocation(), Sound.MUSIC_DISC_BLOCKS, 60F, 1F);
                player.sendMessage(ChatColor.GREEN + "Now playing blocks by C418");
                return true;
            } else if (args[0].equalsIgnoreCase("pigstep")) {
                player.playSound(player.getLocation(), Sound.MUSIC_DISC_PIGSTEP, 60F, 1F);
                player.sendMessage(ChatColor.GREEN + "Now playing Pigstep by Lena Raine");
                return true;
            } else {
                    player.sendMessage(ChatColor.RED + "Invalid song name");
                    return true;
                }
        } else {
            player.sendMessage(ChatColor.RED + "Usage: /playdisc [disc name]");
            return true;
        }
    }
}
