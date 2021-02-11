package com.java.facade;

import static com.java.facade.FoodType.PASTA;
import static com.java.facade.FoodType.PIZZA;

public class Customer {
    public static void main(String[] args) {
        System.out.println(Waiter.deliverFood(PIZZA));
        System.out.println(Waiter.deliverFood(PASTA));
    }
}
