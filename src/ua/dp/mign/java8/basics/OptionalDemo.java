package ua.dp.mign.java8.basics;

import java.util.Optional;

public final class OptionalDemo {
    public static void main(String[] args) {
        Optional<String> hello = Optional.of("Hello");
        String s = hello.get();

        System.out.println(hello.isPresent() + " " + s);

        Optional<Object> opt2 = Optional.empty();
        System.out.println("Value or default: " + opt2.orElse("Default"));

        System.out.println("With supplier: " + opt2.orElseGet(() -> "Some value from supplier"));

        hello.ifPresent(System.out::println);

        Optional<Object> npe = Optional.of(null);
    }
}
