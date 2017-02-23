package ua.dp.mign.java8.streams.collection;

import ua.dp.mign.java8.domain.dishes.Dish;
import ua.dp.mign.java8.domain.dishes.Menu;

import static java.util.stream.Collectors.joining;

public final class DishNames {
    public static void main(String[] args) {
        System.out.println(Menu.getMenu().stream()
                .map(Dish::getName)
                .map(String::toUpperCase)
                .collect(joining(", ")));

    }
}
