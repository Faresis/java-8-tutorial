package ua.dp.mign.java8.basics.references;

import java.util.function.IntFunction;

public final class StaticMethodNameReference {
    public static void main(String[] args) {
        IntFunction<String> f1 = i -> String.valueOf(i);
        System.out.println(f1.apply(100));

        IntFunction<String> f2 = String::valueOf;
        System.out.println(f2.apply(200));
    }
}
