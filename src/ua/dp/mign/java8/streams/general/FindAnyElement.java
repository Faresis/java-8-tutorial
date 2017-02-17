package ua.dp.mign.java8.streams.general;

import ua.dp.mign.java8.domain.dishes.Dish;
import ua.dp.mign.java8.domain.dishes.Menu;

public final class FindAnyElement {
    public static void main(String[] args) {
        Menu.getMenu().stream()
                .filter(Dish::isVegetarian)
                .findAny()
                .ifPresent(System.out::println);
    }
}
