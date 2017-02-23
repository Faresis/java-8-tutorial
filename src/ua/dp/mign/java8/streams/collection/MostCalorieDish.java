package ua.dp.mign.java8.streams.collection;

import ua.dp.mign.java8.domain.dishes.Dish;

import static java.lang.System.out;
import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.reducing;
import static ua.dp.mign.java8.domain.dishes.Menu.getMenu;

public final class MostCalorieDish {
    public static void main(String[] args) {
        out.println(getMenu().stream()
                .collect(maxBy(comparingInt(Dish::getCalories)))
        );

        out.println(getMenu().stream()
                .collect(reducing((d1, d2) ->
                        d1.getCalories() > d2.getCalories() ? d1 : d2))
        );
    }
}
