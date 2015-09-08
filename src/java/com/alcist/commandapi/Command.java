package com.alcist.commandapi;


import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Options;
import org.bukkit.command.CommandSender;

public abstract class Command {

    public final CommandInfo info;

    public Command() {
        this.info = getClass().getAnnotation(CommandInfo.class);
    }

}