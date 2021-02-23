package com.java.strategy;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void strategy(int a, int b) {
        strategy.operation(a,b);
    }
}
