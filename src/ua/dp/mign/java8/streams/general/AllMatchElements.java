package ua.dp.mign.java8.streams.general;

import ua.dp.mign.java8.domain.dishes.Menu;

public final class AllMatchElements {
    public static void main(String[] args) {
        System.out.println("All dishes are below 1000 calories :" +
                Menu.getMenu().stream().allMatch(d -> d.getCalories() < 1000)
        );
    }
}
