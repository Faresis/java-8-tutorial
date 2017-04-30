package ua.dp.mign.java8.basics.function;

import java.util.function.Function;

public final class FunctionalInterfaces {
    public static void main(String[] args) {
        useFunctionInterface();
    }

    private static void useFunctionInterface() {
        Function<String, Boolean> f = s -> new Boolean(s);

        System.out.println(f.apply("TRUE"));
        System.out.println(f.apply("true"));
        System.out.println(f.apply("Java8"));
        System.out.println(f.apply(null));
    }
}
