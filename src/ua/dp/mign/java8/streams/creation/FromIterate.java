package ua.dp.mign.java8.streams.creation;

import java.util.stream.Stream;

public final class FromIterate {
    public static void main(String[] args) {
        Stream.iterate(0, n -> n + 2)
                .limit(20)
                .forEach(System.out::println);
    }
}
