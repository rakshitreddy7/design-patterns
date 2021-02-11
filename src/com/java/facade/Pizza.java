package com.java.facade;

public class Pizza implements Food {
    private String preparedFood;

    @Override
    public String getFood() {
        return preparedFood;
    }

    @Override
    public void prepareFood(String ingredients) {
        preparedFood = "Pizza is prepared with ingredients " + ingredients;
    }
}
