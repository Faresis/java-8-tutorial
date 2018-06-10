package ua.dp.mign.java8.streams.creation;

import java.util.stream.IntStream;

public final class Primes {
    private static final int FIRST = 1;

    public static void main(String[] args) {
        IntStream.iterate(Primes.FIRST, Primes::next)
                .limit(15)
                .forEach(System.out::println);

        IntStream.iterate(Primes.FIRST, j -> ++j)
                .filter(Primes::isPrime)
                .limit(15)
                .forEach(System.out::println);
    }

    private static int next(int i) {
        return IntStream.iterate(++i, j -> ++j)
                .filter(Primes::isPrime)
                .findFirst()
                .getAsInt();
    }

    private static boolean isPrime(int candidate) {
        int candidateRoot = (int) Math.sqrt(candidate);
        return IntStream.rangeClosed(2, candidateRoot)
                .noneMatch(i -> candidate % i == 0);
    }
}
