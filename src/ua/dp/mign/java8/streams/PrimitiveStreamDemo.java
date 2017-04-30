package ua.dp.mign.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public final class PrimitiveStreamDemo {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(20, 2, 72, 991, 100, -11);

        IntStream is = integers.stream().mapToInt(i -> i);
        System.out.println("Max: " + is.max());

        IntStream is1 = integers.stream().mapToInt(i -> i);
        System.out.println("Min: " + is1.min());

        IntStream is2 = integers.stream().mapToInt(i -> i);
        System.out.println("Sum: " + is2.sum());

        IntStream is3 = integers.stream().mapToInt(i -> i);
        System.out.println("Avg: " + is3.average().getAsDouble());
    }
}
