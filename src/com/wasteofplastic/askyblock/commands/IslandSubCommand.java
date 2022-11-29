package com.wasteofplastic.askyblock.commands;

import org.bukkit.command.CommandSender;

public interface IslandSubCommand {

    String getDescription();

    String getPermission();

    boolean onCommand(CommandSender sender, String[] split);

}
