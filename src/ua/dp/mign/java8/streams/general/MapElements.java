package ua.dp.mign.java8.streams.general;

import ua.dp.mign.java8.domain.Dish;
import ua.dp.mign.java8.domain.Menu;

import static java.util.stream.Collectors.toList;

public final class MapElements {
    public static void main(String[] args) {
        System.out.println(Menu.getMenu().stream()
                .map(Dish::getName)
                .collect(toList())
        );
        System.out.println(Menu.getMenu().stream()
                .map(Dish::getName)
                .map(String::length)
                .collect(toList())
        );
    }
}
