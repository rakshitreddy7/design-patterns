package com.java.strategy;

public class Main {
    public static void main(String[] args) {
        Context context = new Context(new AddStrategy());
        context.strategy(10,20);

        context = new Context(new SubStrategy());
        context.strategy(10,20);

        context = new Context(new MultiplyStrategy());
        context.strategy(10,20);
    }
}
