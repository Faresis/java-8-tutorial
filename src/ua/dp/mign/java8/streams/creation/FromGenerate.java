package ua.dp.mign.java8.streams.creation;

import java.util.stream.Stream;

public final class FromGenerate {
    public static void main(String[] args) {
        Stream.generate(Math::random)
                .limit(20)
                .forEach(System.out::println);
    }
}
