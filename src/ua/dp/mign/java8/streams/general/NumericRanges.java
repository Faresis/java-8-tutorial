package ua.dp.mign.java8.streams.general;

import java.util.stream.IntStream;

public final class NumericRanges {
    public static void main(String[] args) {
        IntStream.rangeClosed(0, 100)
                .filter(i -> i % 2 == 0)
                .forEach(System.out::println);
    }
}
