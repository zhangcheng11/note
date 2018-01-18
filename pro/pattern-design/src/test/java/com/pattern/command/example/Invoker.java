package com.pattern.command.example;

/**
 * Created by cheng.zhang on 2018/1/9.
 */
public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }
    public void action(){
        this.command.execute();
    }
}
