package ua.dp.mign.java8.streams.general;

import ua.dp.mign.java8.domain.dishes.Dish;
import ua.dp.mign.java8.domain.dishes.Menu;

public final class AnyMatchElements {
    public static void main(String[] args) {
        System.out.println("Vegetarian dishes present in menu: " +
                Menu.getMenu().stream().anyMatch(Dish::isVegetarian)
        );
    }
}
