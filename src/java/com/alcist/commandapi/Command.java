package com.alcist.commandapi;

public abstract class Command {

    public final CommandInfo info;

    public Command() {
        this.info = getClass().getAnnotation(CommandInfo.class);
    }

}