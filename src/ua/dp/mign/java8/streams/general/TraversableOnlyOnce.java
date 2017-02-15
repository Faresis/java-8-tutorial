package ua.dp.mign.java8.streams.general;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public final class TraversableOnlyOnce {
    public static void main(String[] args) {
        List<String> title = Arrays.asList("Java8", "in", "action");
        Stream<String> s = title.stream();
        s.forEach(System.out::println);

        // Stream can be consumed only once. So the following code will cause IllegalStateException.
        s.forEach(System.out::println);
    }
}
