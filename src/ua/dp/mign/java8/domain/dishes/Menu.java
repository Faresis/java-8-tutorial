package ua.dp.mign.java8.domain.dishes;

import java.util.Arrays;
import java.util.List;

/**
 * Class represents dishes menu.
 */
public final class Menu {

    private static final List<Dish> MENU = Arrays.asList(
            new Dish("pork", false, 800, Dish.Type.MEAT),
            new Dish("beef", false, 700, Dish.Type.MEAT),
            new Dish("chicken", false, 400, Dish.Type.MEAT),
            new Dish("french fries", true, 530, Dish.Type.OTHER),
            new Dish("rice", true, 350, Dish.Type.OTHER),
            new Dish("season fruit", true, 120, Dish.Type.OTHER),
            new Dish("pizza", true, 550, Dish.Type.OTHER),
            new Dish("prawns", false, 300, Dish.Type.FISH),
            new Dish("salmon", false, 450, Dish.Type.FISH)
    );

    public static List<Dish> getMenu() {
        return MENU;
    }

    private Menu() {
    }
}
