package com.pattern.command.example;

/**
 * Created by cheng.zhang on 2018/1/9.
 */
public class PageCommand extends Command {
    public void execute() {
        super.pg.find();
        super.pg.add();
        super.pg.plan();
    }
}
