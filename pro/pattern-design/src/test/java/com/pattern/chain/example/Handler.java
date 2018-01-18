package com.pattern.chain.example;

/**
 * Created by cheng.zhang on 2018/1/10.
 */
public abstract class Handler {
    public static int UNMARRIED = 1;
    public static int MARRIED = 2;
    public static int WIDOW = 3;
    private int level = 0;
    private Handler nextHandler;
    public Handler(int level){
        this.level = level;
    }
    public void setNextHandler(Handler next){
        this.nextHandler = next;
    }
    public void handleRequest(IWoman woman){
        if(woman.getType() == this.level){
            this.response(woman.getRequest());
        }else{
            if(this.nextHandler != null){
                this.nextHandler.handleRequest(woman);
            }else{
                System.out.println("没有相应的处理对象");
            }
        }
    }
    public abstract void response(String request);

}
