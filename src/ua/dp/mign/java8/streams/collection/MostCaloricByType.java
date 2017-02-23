package ua.dp.mign.java8.streams.collection;

import ua.dp.mign.java8.domain.dishes.Dish;
import ua.dp.mign.java8.domain.dishes.Menu;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.maxBy;

public final class MostCaloricByType {
    public static void main(String[] args) {
        System.out.println(Menu.getMenu().stream()
                .collect(groupingBy(Dish::getType, maxBy(comparing(Dish::getCalories))))
        );
    }
}
