package ua.dp.mign.java8.streams.collection;

import ua.dp.mign.java8.domain.dishes.Dish;
import ua.dp.mign.java8.domain.dishes.Menu;

import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.maxBy;

public final class MostCalorieDish {
    public static void main(String[] args) {
        System.out.println(Menu.getMenu().stream()
                .collect(maxBy(comparingInt(Dish::getCalories)))
        );
    }
}
