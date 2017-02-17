package ua.dp.mign.java8.streams.reducing;

import ua.dp.mign.java8.domain.Dish;
import ua.dp.mign.java8.domain.Menu;

public final class HighestCaloryDish {
    public static void main(String[] args) {
        Menu.getMenu().stream()
                .mapToInt(Dish::getCalories)
                .max()
                .ifPresent(i -> System.out.println("Highest calory dish in the menu: " + i));

        Menu.getMenu().stream()
                .map(Dish::getCalories)
                .reduce(Integer::max)
                .ifPresent(i -> System.out.println("Highest calory dish in the menu (reduced): " + i));
    }
}
