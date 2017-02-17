package ua.dp.mign.java8.streams.general;

import ua.dp.mign.java8.domain.dishes.Menu;

public final class NoneMatchElements {
    public static void main(String[] args) {
        System.out.println("None dishes are above 1000 calories: " +
                Menu.getMenu().stream().noneMatch(d -> d.getCalories() >= 1000)
        );
    }
}
