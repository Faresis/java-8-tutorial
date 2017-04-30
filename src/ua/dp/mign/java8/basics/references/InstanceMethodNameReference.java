package ua.dp.mign.java8.basics.references;

import java.util.function.BiPredicate;
import java.util.function.UnaryOperator;

public final class InstanceMethodNameReference {
    public static void main(String[] args) {
        UnaryOperator<String> trim = String::trim;
        BiPredicate<String, String> equalsIgnoreCase = String::equalsIgnoreCase;

        System.out.println(equalsIgnoreCase.test("hello", "HELLO"));
        System.out.println(trim.apply("        hellO        "));
    }
}
