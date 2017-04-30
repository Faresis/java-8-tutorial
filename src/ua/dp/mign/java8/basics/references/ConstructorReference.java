package ua.dp.mign.java8.basics.references;

import java.util.function.Function;

public final class ConstructorReference {
    public static void main(String[] args) {
        Function<char[], String> f1 = String::new;
        System.out.println(f1.apply(new char[] { 'H', 'i' }));
    }
}
