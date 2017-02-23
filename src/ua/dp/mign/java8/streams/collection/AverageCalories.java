package ua.dp.mign.java8.streams.collection;

import ua.dp.mign.java8.domain.dishes.Dish;
import ua.dp.mign.java8.domain.dishes.Menu;

import static java.util.stream.Collectors.averagingInt;

public final class AverageCalories {
    public static void main(String[] args) {
        System.out.println(Menu.getMenu().stream().collect(averagingInt(Dish::getCalories)));
    }
}
