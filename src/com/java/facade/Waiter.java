package com.java.facade;

public class Waiter {
    public static String deliverFood(FoodType foodType) {
        Ingredient ingredients = new Ingredient();

        switch (foodType) {
            case PASTA:
                Food pasta = new Pasta();
                String pastaIngredients = ingredients.getPastaIngredients();
                pasta.prepareFood(pastaIngredients);
                return pasta.getFood();

            case PIZZA:
                Food pizza = new Pizza();
                String pizzaIngredients = ingredients.getPizzaIngredients();
                pizza.prepareFood(pizzaIngredients);
                return pizza.getFood();
        }

        return null;
    }
}
