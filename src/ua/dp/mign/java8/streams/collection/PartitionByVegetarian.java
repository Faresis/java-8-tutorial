package ua.dp.mign.java8.streams.collection;

import ua.dp.mign.java8.domain.dishes.Dish;
import ua.dp.mign.java8.domain.dishes.Menu;

import java.util.stream.Collectors;

public final class PartitionByVegetarian {
    public static void main(String[] args) {
        System.out.println(Menu.getMenu().stream().collect(
                Collectors.partitioningBy(Dish::isVegetarian)
        ));
    }
}
