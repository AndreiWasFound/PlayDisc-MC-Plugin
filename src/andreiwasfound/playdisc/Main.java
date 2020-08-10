package andreiwasfound.playdisc;

import andreiwasfound.playdisc.utilities.CommandTabCompleter;
import andreiwasfound.playdisc.utilities.MetricsLite;
import andreiwasfound.playdisc.utilities.UpdateChecker;
import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        printToConsole("UpdateChecker is trying to register");
        updateChecker();
        printToConsole("UpdateChecker has been registered successfully");
        printToConsole("Commands are trying to register");
        registerCommands();
        printToConsole("Commands have been registered successfully");
        printToConsole("Events are trying to register");
        registerEvents();
        printToConsole("Events have been registered successfully");
        printToConsole("bStats is trying to register");
        int pluginId = 8425;
        MetricsLite metrics = new MetricsLite(this, pluginId);
        printToConsole("bStats has been registered successfully");
    }

    @Override
    public void onDisable() {

    }

    public void registerCommands() {
        getCommand("playdisc").setExecutor(new Commands(this));
        getCommand("playdisc").setTabCompleter(new CommandTabCompleter());
    }

    private void registerEvents() {
        PluginManager pm = this.getServer().getPluginManager();
        pm.registerEvents(new Events(this), this);
    }

    public void printToConsole(String msg) {
        this.getServer().getConsoleSender().sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.GREEN + "PlayDisc" + ChatColor.DARK_GRAY + "]" + ChatColor.RESET + " " + msg);
    }

    public void updateChecker() {
        new UpdateChecker(this, 80958).getLatestVersion(version -> {
            if (this.getDescription().getVersion().equalsIgnoreCase(version)) {
                printToConsole("PlayDisc is up to date!");
            } else {
                printToConsole("PlayDisc is outdated!");
                printToConsole("Newest version: " + version);
                printToConsole("Your version: " + pluginymlVersion);
                printToConsole("Please Update Here: " + pluginymlWebsite);
            }
        });
    }

    PluginDescriptionFile pluginyml = this.getDescription();
    String pluginymlVersion = pluginyml.getVersion();
    String pluginymlWebsite = pluginyml.getWebsite();
}
