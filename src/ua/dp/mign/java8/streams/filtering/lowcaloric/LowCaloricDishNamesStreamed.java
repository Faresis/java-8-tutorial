package ua.dp.mign.java8.streams.filtering.lowcaloric;

import ua.dp.mign.java8.domain.dishes.Dish;
import ua.dp.mign.java8.domain.dishes.Menu;

import java.util.List;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public final class LowCaloricDishNamesStreamed implements LowCaloricDishNames {
    @Override
    public List<String> getNames() {
        return Menu.getMenu().stream()
                .filter(d -> d.getCalories() < 400)
                .sorted(comparing(Dish::getCalories))
                .map(Dish::getName)
                .collect(toList());
    }

}
