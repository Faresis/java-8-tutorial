package ua.dp.mign.java8.streams;

import ua.dp.mign.java8.streams.filtering.highcaloric.HighCaloricDishNamesStreamed;
import ua.dp.mign.java8.streams.filtering.lowcaloric.LowCaloricDishNames;
import ua.dp.mign.java8.streams.filtering.lowcaloric.LowCaloricDishNamesIterative;
import ua.dp.mign.java8.streams.filtering.lowcaloric.LowCaloricDishNamesStreamed;
import ua.dp.mign.java8.streams.filtering.numbers.DistinctEvenNumbers;
import ua.dp.mign.java8.streams.filtering.vegetarian.VegetarianDishes;

import java.util.Arrays;

public final class Printer {
    public static void main(String[] args) {
        LowCaloricDishNames lowCaloric = new LowCaloricDishNamesIterative();
        System.out.println("Low caloric dish names iterative: " + lowCaloric.getNames());

        lowCaloric = new LowCaloricDishNamesStreamed();
        System.out.println("Low caloric dish names streamed: " + lowCaloric.getNames());

        HighCaloricDishNamesStreamed highCaloric = new HighCaloricDishNamesStreamed();
        System.out.println("High caloric dish names streamed: " + highCaloric.getNames());

        VegetarianDishes vegetarianDishes = new VegetarianDishes();
        System.out.println("Vegetarian dishes: " + vegetarianDishes.getDishes());

        DistinctEvenNumbers distinctEvenNumbers = new DistinctEvenNumbers();
        System.out.println("Distinct even numbers: " + distinctEvenNumbers.filter(Arrays.asList(1, 2, 1, 3, 3, 2, 4)));
    }
}
