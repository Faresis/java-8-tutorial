package ua.dp.mign.java8.streams.collection;

import ua.dp.mign.java8.domain.dishes.Menu;

import static java.util.stream.Collectors.counting;

public final class DishesCount {
    public static void main(String[] args) {
        System.out.println(Menu.getMenu().stream().collect(counting()));

        System.out.println(Menu.getMenu().stream().count());
    }
}
