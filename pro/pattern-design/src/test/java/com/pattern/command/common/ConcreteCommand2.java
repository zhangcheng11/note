package com.pattern.command.common;

/**
 * Created by cheng.zhang on 2018/1/9.
 */
public class ConcreteCommand2 extends Command {
    public ConcreteCommand2(Receiver receiver) {
        super(receiver);
    }

    public void execute() {
        super.receiver.dosomething();
    }
}
