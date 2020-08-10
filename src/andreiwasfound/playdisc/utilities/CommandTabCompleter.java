package andreiwasfound.playdisc.utilities;

import andreiwasfound.playdisc.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

import java.util.ArrayList;
import java.util.List;

public class CommandTabCompleter implements TabCompleter {

    private Main plugin;

    List<String> arguments = new ArrayList<String>();

    public List<String> onTabComplete(CommandSender sender, Command cmd, String label, String[] args) {
        if (arguments.isEmpty()) {
            arguments.add("stop");
            arguments.add("13");
            arguments.add("cat");
            arguments.add("blocks");
            arguments.add("chirp");
            arguments.add("far");
            arguments.add("mall");
            arguments.add("mellohi");
            arguments.add("stal");
            arguments.add("strad");
            arguments.add("ward");
            arguments.add("11");
            arguments.add("wait");
            arguments.add("pigstep");
        }

        List<String> result = new ArrayList<String>();
        if (args.length == 1) {
            for (String a : arguments) {
                if (a.toLowerCase().startsWith(args[0].toLowerCase()))
                    result.add(a);
            }
            return result;
        }

        return null;
    }


}
