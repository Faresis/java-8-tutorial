package ua.dp.mign.java8.streams.reducing;

import ua.dp.mign.java8.domain.dishes.Dish;
import ua.dp.mign.java8.domain.dishes.Menu;

public final class SumOfAllCalories {
    public static void main(String[] args) {
        System.out.println("Sum of all calories in the menu: " +
                Menu.getMenu().stream()
                .mapToInt(Dish::getCalories)
                .sum()
        );


        System.out.println("Sum of all calories in the menu (reduction): " +
                Menu.getMenu().stream()
                        .map(d -> d.getCalories())
                        .reduce(Integer::sum)
        );
    }
}
