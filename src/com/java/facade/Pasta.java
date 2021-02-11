package com.java.facade;

public class Pasta implements Food {
    private String preparedFood;

    @Override
    public String getFood() {
        return preparedFood;
    }

    @Override
    public void prepareFood(String ingredients) {
        preparedFood = "Pasta is prepared with ingredients " + ingredients;
    }
}
