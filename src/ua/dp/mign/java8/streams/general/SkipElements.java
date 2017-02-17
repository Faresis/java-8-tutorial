package ua.dp.mign.java8.streams.general;

import ua.dp.mign.java8.domain.dishes.Menu;

import static java.util.stream.Collectors.toList;

public final class SkipElements {
    public static void main(String[] args) {
        System.out.println(Menu.getMenu().stream()
                .filter(d -> d.getCalories() > 300)
                .skip(2)
                .collect(toList())
        );
    }
}
