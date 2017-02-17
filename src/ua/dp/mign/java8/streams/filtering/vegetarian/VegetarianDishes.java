package ua.dp.mign.java8.streams.filtering.vegetarian;

import ua.dp.mign.java8.domain.dishes.Dish;
import ua.dp.mign.java8.domain.dishes.Menu;

import java.util.List;

import static java.util.stream.Collectors.toList;

public final class VegetarianDishes {
    public List<Dish> getDishes() {
        return Menu.getMenu().stream()
                .filter(Dish::isVegetarian)
                .collect(toList());
    }
}
