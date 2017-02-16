package ua.dp.mign.java8.streams.vegeterian;

import ua.dp.mign.java8.domain.Dish;
import ua.dp.mign.java8.domain.Menu;

import java.util.List;

import static java.util.stream.Collectors.toList;

public final class VegeterainDishes {
    public List<Dish> getDishes() {
        return Menu.getMenu().stream()
                .filter(Dish::isVegetarian)
                .collect(toList());
    }
}
