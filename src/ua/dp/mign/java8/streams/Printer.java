package ua.dp.mign.java8.streams;

import ua.dp.mign.java8.streams.highcaloric.HighCaloricDishNamesStreamed;
import ua.dp.mign.java8.streams.lowcaloric.LowCaloricDishNames;
import ua.dp.mign.java8.streams.lowcaloric.LowCaloricDishNamesIterative;
import ua.dp.mign.java8.streams.lowcaloric.LowCaloricDishNamesStreamed;

public final class Printer {
    public static void main(String[] args) {
        LowCaloricDishNames lowCaloric = new LowCaloricDishNamesIterative();
        System.out.println("Low caloric dish names iterative: " + lowCaloric.getNames());

        lowCaloric = new LowCaloricDishNamesStreamed();
        System.out.println("Low caloric dish names streamed: " + lowCaloric.getNames());

        HighCaloricDishNamesStreamed highCaloric = new HighCaloricDishNamesStreamed();
        System.out.println("High caloric dish names streamed: " + highCaloric.getNames());
    }
}