package com.pattern.command.example;

/**
 * Created by cheng.zhang on 2018/1/9.
 */
public abstract class Command {
    CodeGroup cg = new CodeGroup();
    PageGroup pg = new PageGroup();
    RequirementGroup rg = new RequirementGroup();
    public abstract void execute();
}
