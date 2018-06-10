package ua.dp.mign.java8.streams.creation;

import java.util.stream.Stream;

public final class Fibonacci {

    public static void main(String[] args) {
        Stream.iterate(FiboNum.FIRST, FiboNum::next)
                .limit(12)
                .forEach(System.out::println);
    }

    private static final class FiboNum {

        public static final FiboNum FIRST = of(1, 0);

        private final int current;
        private final int prev;

        private FiboNum(int current, int prev) {
            this.current = current;
            this.prev = prev;
        }

        public static FiboNum of(int current, int prev) {
            return new FiboNum(current, prev);
        }

        public static FiboNum next(FiboNum num) {
            return of(num.current + num.prev, num.current);
        }

        @Override
        public String toString() {
            return String.valueOf(current);
        }
    }
}


