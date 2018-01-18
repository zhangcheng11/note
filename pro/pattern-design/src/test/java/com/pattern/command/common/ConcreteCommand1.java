package com.pattern.command.common;

/**
 * Created by cheng.zhang on 2018/1/9.
 */
public class ConcreteCommand1 extends Command {

    public ConcreteCommand1(Receiver receiver) {
        super(receiver);
    }
    public void execute() {
        super.receiver.dosomething();
    }
}
