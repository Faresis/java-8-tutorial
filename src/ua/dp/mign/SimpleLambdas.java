package ua.dp.mign;

import java.util.function.BiFunction;
import java.util.function.Supplier;

public final class SimpleLambdas {

    public static void emptyBlocks() {
        Runnable emptyBlock = () -> { };
        Runnable explicitReturn = () -> { return; };
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
    }
}
