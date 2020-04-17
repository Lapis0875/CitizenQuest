package kr.ojr.lapis.citizenquest;

import org.bukkit.plugin.java.JavaPlugin;

// import for colored console
import kr.ojr.lapis.citizenquest.console.FormatedConsole;
import kr.ojr.lapis.citizenquest.console.LogType;

public final class CitizenQuest extends JavaPlugin {

    FormatedConsole formatedConsole = new FormatedConsole(this.getDescription());

    @Override
    public void onEnable() {
        // Plugin startup logic
        formatedConsole.console(LogType.INFO, "Plugin Enabled!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        formatedConsole.console(LogType.INFO, "Plugin Disabled!");
    }
}
