package ua.dp.mign.java8.completablefuture;

import java.util.function.Function;

public final class Composing {
    public static void main(String[] args) {
        Function<Integer, Integer> func = (x) -> x * 2;
        System.out.println(repeat(0, func).apply(10));
    }

    static <A> Function<A, A> repeat(int n, Function<A, A> function) {
        return n == 0 ? x -> x :
                function.compose(repeat(n - 1, function));
    }
}
