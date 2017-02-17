package ua.dp.mign.java8.streams.filtering.highcaloric;

import ua.dp.mign.java8.domain.dishes.Dish;
import ua.dp.mign.java8.domain.dishes.Menu;

import java.util.List;

import static java.util.stream.Collectors.toList;

public final class HighCaloricDishNamesStreamed {
    public List<String> getNames() {
        return Menu.getMenu().stream()
                .filter(d -> d.getCalories() > 300)
                .map(Dish::getName)
                .limit(3)
                .collect(toList());
    }
}
