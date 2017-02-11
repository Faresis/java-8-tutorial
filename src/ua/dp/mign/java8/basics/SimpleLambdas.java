package ua.dp.mign.java8.basics;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public final class SimpleLambdas {

    public static void emptyBlocks() {
        Runnable emptyBlock = () -> { };
        Runnable explicitReturn = () -> { return; };
    }

    public static void noReturnValue() {
        Consumer<String> noBlock = (str) -> System.out.println(str);
        Consumer<String> withBlock = (String str) -> { System.out.println(str); };
    }

    public static void withReturnValue() {
        Supplier<String> implicitReturn = () -> "returnValue";
        Supplier<String> explicitReturn = () -> { return "returnValue"; };
        /**
         * In case when braces are used then explicit return should be used.
         * Following code would not compile.
         * Can't use implicit return with braces.
         */
        //Supplier<String> implicitReturnWithBraces = () -> { "returnValue"; };
        /**
         * In case when explicit return is used then braces should be added.
         * Following code would not compile.
         * Can't use explicit return without braces.
         */
        //Supplier<String> explicitReturnWithoutBraces = () -> return "returnValue";
    }

    public static void withParameters() {
        BiFunction<String, Integer, Boolean> explicitTypes = (String string, Integer integer) -> string.length() == integer;
        BiFunction<String, Integer, Boolean> implicitTypes = (string, integer) -> string.length() == integer;

        /**
         * In case when there is only one parameter then parentheses can be omitted.
         */
        Predicate<String> singleParam = s -> true;
    }

    public static void withException() {
        FunctionalInterfaceWithException var = () -> Files.readAllLines(FileSystems.getDefault().getPath("folder", "file"));
    }

    @FunctionalInterface
    private interface FunctionalInterfaceWithException {
        void process() throws IOException;
    }

    public static void voidCompatibilityRule() {
        /**
         * Predicate accepts string and returns boolean. Nothing special here.
         */
        Predicate<String> withReturnValue = s -> new ArrayList().add("1");
        /**
         * Consumer takes a string and returns nothing.
         * Despite the fact that expression in lambda returns boolean this lambda
         * matches target type due to void compatibility rule.
         * Return value simply ignored.
         */
        Consumer<String> withoutReturnValue = s -> new ArrayList().add("1");
    }

    public static void usingLocalVariables() {
        // final variables can be captured by lambdas.
        final int counter = 10;
        Runnable usingFinal = () -> System.out.println(counter);

        /**
         * Variables that are effectively final, thus are assigned only once,
         * can be captured by lambdas.
         *
         */
        String text = "text";
        Runnable usingEffectivelyFinal = () -> System.out.println(text);

        /**
         * This will not compile because variable state is changed.
         * Such variables can't be used in lambdas.
         */
        //String variable = "initialState";
        //Runnable usingNonFinal = () -> System.out.println(variable);
        //variable = "newState";
    }
}
