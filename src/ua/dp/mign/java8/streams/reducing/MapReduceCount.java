package ua.dp.mign.java8.streams.reducing;

import ua.dp.mign.java8.domain.dishes.Menu;

public final class MapReduceCount {
    public static void main(String[] args) {
        System.out.println("Number of dishes: " +
                Menu.getMenu().stream()
                .map(d -> 1)
                .reduce(0, (a, b) -> a + b));
    }
}
