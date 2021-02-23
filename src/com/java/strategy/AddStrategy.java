package com.java.strategy;

public class AddStrategy implements Strategy {
    @Override
    public void operation(int a, int b) {
        System.out.println(a + b);
    }
}
