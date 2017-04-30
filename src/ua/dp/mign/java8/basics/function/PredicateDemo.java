package ua.dp.mign.java8.basics.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public final class PredicateDemo {
    public static void main(String[] args) {
        Predicate<String> booleanTest = s -> new Boolean(s).booleanValue();

        List<String> strings = Arrays.asList("TRUE", "true", null, "", "false", "TrUe");
        process(strings, booleanTest);
    }

    private static void process(Iterable<String> strings, Predicate<String> booleanTest) {
        strings.forEach(s -> System.out.println(s + " tested " + booleanTest.test(s)));
    }
}
