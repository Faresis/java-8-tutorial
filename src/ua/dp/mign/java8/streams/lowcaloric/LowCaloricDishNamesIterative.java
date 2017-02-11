package ua.dp.mign.java8.streams.lowcaloric;

import ua.dp.mign.java8.domain.Dish;
import ua.dp.mign.java8.domain.Menu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class LowCaloricDishNamesIterative implements LowCaloricDishNames {
    @Override
    public List<String> getNames() {
        List<Dish> lowCaloricDishes = new ArrayList<>();
        for (Dish d : Menu.getMenu()) {
            if (d.getCalories() < 400) {
                lowCaloricDishes.add(d);
            }
        }
        Collections.sort(lowCaloricDishes, new Comparator<Dish>() {
            @Override
            public int compare(Dish o1, Dish o2) {
                return Integer.compare(o1.getCalories(), o2.getCalories());
            }
        });
        List<String> lowCaloricDishesNames = new ArrayList<>();
        for (Dish d : lowCaloricDishes) {
            lowCaloricDishesNames.add(d.getName());
        }
        return lowCaloricDishesNames;
    }
}
