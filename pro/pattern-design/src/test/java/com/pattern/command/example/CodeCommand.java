package com.pattern.command.example;

/**
 * Created by cheng.zhang on 2018/1/9.
 */
public class CodeCommand extends Command {
    public void execute() {
        super.cg.find();
        super.cg.change();
    }
}
