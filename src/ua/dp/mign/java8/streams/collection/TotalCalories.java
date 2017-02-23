package ua.dp.mign.java8.streams.collection;

import ua.dp.mign.java8.domain.dishes.Dish;

import static java.lang.System.out;
import static java.util.stream.Collectors.reducing;
import static java.util.stream.Collectors.summingInt;
import static ua.dp.mign.java8.domain.dishes.Menu.getMenu;

public final class TotalCalories {
    public static void main(String[] args) {
        out.println(getMenu().stream().collect(summingInt(Dish::getCalories)));

        out.println(getMenu().stream().collect(reducing(0, Dish::getCalories, (i, z) -> i + z)));
    }
}
