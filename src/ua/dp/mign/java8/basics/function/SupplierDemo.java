package ua.dp.mign.java8.basics.function;

import java.util.function.Function;
import java.util.function.Supplier;

public final class SupplierDemo {
    public static void main(String[] args) {
        Supplier<String> sup = String::new;
        Function<String, String> constructor = String::new;
        System.out.println(sup);
        System.out.println(sup.get());
        System.out.println(constructor.apply("hw"));
    }
}
