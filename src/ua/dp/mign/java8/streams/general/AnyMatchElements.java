package ua.dp.mign.java8.streams.general;

import ua.dp.mign.java8.domain.Dish;
import ua.dp.mign.java8.domain.Menu;

public final class AnyMatchElements {
    public static void main(String[] args) {
        System.out.println("Vegetarian dishes present in menu: " +
                Menu.getMenu().stream().anyMatch(Dish::isVegetarian)
        );
    }
}
