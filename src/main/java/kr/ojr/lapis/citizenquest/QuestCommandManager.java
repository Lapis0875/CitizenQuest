package kr.ojr.lapis.citizenquest;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class QuestCommandManager implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (label.equals("citizenquest") || label.equals("cq") || label.equals("q") || label.equals("quest")){
            switch (args.length){
                case 0:
                    break;
                case 1:
                    break;
            }
        }
        return false;
    }


}
