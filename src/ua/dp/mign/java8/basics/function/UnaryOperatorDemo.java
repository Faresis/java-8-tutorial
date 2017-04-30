package ua.dp.mign.java8.basics.function;

import java.util.function.UnaryOperator;

public final class UnaryOperatorDemo {
    public static void main(String[] args) {
        UnaryOperator<String> f = s -> "prefix " + s;
        System.out.println(f.apply("suffix"));
    }
}
