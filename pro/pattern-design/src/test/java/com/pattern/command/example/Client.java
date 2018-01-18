package com.pattern.command.example;

/**
 * Created by cheng.zhang on 2018/1/9.
 */
public class Client {
    public static void main(String[] args) {
        Command codeCommand = new CodeCommand();
        Invoker invoker = new Invoker();
        invoker.setCommand(codeCommand);
        invoker.action();
    }
}
