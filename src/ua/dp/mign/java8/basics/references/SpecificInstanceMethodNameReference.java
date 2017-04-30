package ua.dp.mign.java8.basics.references;

import java.util.function.Supplier;

public final class SpecificInstanceMethodNameReference {
    public static void main(String[] args) {
        Integer i = new Integer(1);
        Supplier<String> toString = i::toString;
        System.out.println(toString.get());
    }
}
