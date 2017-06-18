package ua.dp.mign.java8.streams.reducing;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class UniqueWords {
    public static void main(String[] args) {
        Stream<String> words = Stream.of("Zello Some", "New Some", "Thing New", "zGood");
        List<String> uniqueWords = words.flatMap(w -> Stream.of(w.split(" "))).peek(System.out::println)
                .distinct().sorted().collect(Collectors.toList());
        System.out.println(uniqueWords);
    }
}
