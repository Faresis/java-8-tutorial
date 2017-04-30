package ua.dp.mign.java8.streams.collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public final class ForEachProcessing {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Smith");
        names.forEach(System.out::println);

        HashMap<String, String> map = new HashMap<>();
        map.put("h", "Hello");
        map.put("w", "World");
        map.forEach((k, v) -> System.out.println("Key: " + k + " Value: " + v));
    }
}
