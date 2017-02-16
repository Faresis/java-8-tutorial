package ua.dp.mign.java8.streams.general;

import java.util.Arrays;
import java.util.List;

public final class FindFirstElement {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.stream()
                .map(i -> i * i)
                .filter(n -> n % 3 == 0)
                .findFirst()
                .ifPresent(System.out::println);
    }
}
