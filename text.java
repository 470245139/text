package com.fengzhuocheng;

import org.bukkit.plugin.java.JavaPlugin;

public final class text extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("text插件已经启动!");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("text插件已经卸载!");
    }
}
