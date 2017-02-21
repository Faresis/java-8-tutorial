package ua.dp.mign.java8.streams.creation;

import java.util.stream.Stream;

public final class FromValues {
    public static void main(String[] args) {
        Stream.of("Java 8", "Lambdas", "In", "Action")
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
