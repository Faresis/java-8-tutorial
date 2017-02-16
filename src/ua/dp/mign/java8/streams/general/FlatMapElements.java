package ua.dp.mign.java8.streams.general;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class FlatMapElements {
    public static void main(String[] args) {
        String[] arrayOfWords = {"Goodbye", "World"};
        Stream<String> streamOfWords = Arrays.stream(arrayOfWords);

        System.out.println(streamOfWords.map(word -> word.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList()));
    }
}
