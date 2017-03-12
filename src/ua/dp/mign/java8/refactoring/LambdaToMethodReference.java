package ua.dp.mign.java8.refactoring;

import ua.dp.mign.java8.domain.dishes.Dish;
import ua.dp.mign.java8.domain.dishes.Menu;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class LambdaToMethodReference {

    public static void main(String[] args) {
        Map<Dish.CaloricLevel, List<Dish>> dishesByCaloricLevelInline = Menu.getMenu().stream()
                .collect(Collectors.groupingBy(dish -> {
                    if (dish.getCalories() <= 400) return Dish.CaloricLevel.DIET;
                    else if(dish.getCalories() <= 700) return Dish.CaloricLevel.NORMAL;
                    else return Dish.CaloricLevel.FAT;
                }));

        Map<Dish.CaloricLevel, List<Dish>> dishesByCaloricLevelWithMethodReference = Menu.getMenu().stream()
                .collect(Collectors.groupingBy(Dish::getCaloricLevel));

        Menu.getMenu().sort((d1, d2) -> Integer.compare(d1.getCalories(), d2.getCalories()));
        Menu.getMenu().sort(Comparator.comparing(Dish::getCalories));

        int totalCaloriesInline = Menu.getMenu().stream().map(Dish::getCalories).reduce(0, (c1, c2) -> c1 + c2);
        int totalCaloriesMethod = Menu.getMenu().stream().collect(Collectors.summingInt(Dish::getCalories));

    }

}
