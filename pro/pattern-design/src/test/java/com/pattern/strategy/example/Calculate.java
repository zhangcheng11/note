package com.pattern.strategy.example;

/**
 * Created by cheng.zhang on 2018/1/10.
 */
public enum Calculate {
    ADD("+"){
        public int exec(int a,int b){
            return a + b;
        }
    },
    SUB("-"){
        public int exec(int a,int b){
            return a - b;
        }
    },
    ;
    private String symbol;
    private Calculate(String _symbol){
        this.symbol = _symbol;
    }

    public String getSymbol() {
        return symbol;
    }
    public abstract int exec(int a,int b);
}
