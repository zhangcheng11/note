package com.pattern.command.common;

/**
 * Created by cheng.zhang on 2018/1/9.
 */
public abstract class Command {
    protected Receiver receiver;

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    public abstract void execute();
}
