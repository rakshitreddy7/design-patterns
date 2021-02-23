package com.java.strategy;

public class MultiplyStrategy implements Strategy {
    @Override
    public void operation(int a, int b) {
        System.out.println(a * b);
    }
}
