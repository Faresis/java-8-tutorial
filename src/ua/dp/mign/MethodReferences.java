package ua.dp.mign;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntSupplier;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;

public final class MethodReferences {

    public static void staticMethodReferences() {
        /**
         * Those functions are equivalent.
         * First one defined with lambda expression.
         * Second one with method reference. Which is referred to
         * static {@link Integer#parseInt(String)} method.
         */
        ToIntFunction<String> lambda1 = (String s) -> Integer.parseInt(s);
        ToIntFunction<String> reference1 = Integer::parseInt;

        BiFunction<String, Integer, Integer> lambda2 = (String str, Integer num) -> Integer.getInteger(str, num);
        BiFunction<String, Integer, Integer> reference2 = Integer::getInteger;
    }

    public static void instanceMethodReferences() {
        /**
         * Those functions are equivalent.
         * First one defined with lambda expression.
         * Second one with instance method reference. Which is referred to
         * instance {@link List#contains(Object)} method.
         * In case when instance method is referenced then it is called on the first argument of the
         * function descriptor. All other arguments of the function descriptor are passed as parameters
         * to this method.
         */
        BiPredicate<List<String>, String> lambda1 = (List<String> lst, String s) -> lst.contains(s);
        BiPredicate<List<String>, String> reference1 = List::contains;

        BiFunction<String, String, String> lambda2 = (String s1, String s2) -> s1.concat(s2);
        BiFunction<String, String, String> reference2 = String::concat;
    }

    public static void particularInstanceMethodReferences() {
        List<String> list = Arrays.asList("first", "second");
        IntSupplier lambda1 = () -> list.size();
        IntSupplier reference1 = list::size;

        Consumer<String> lambda2 = (String s) -> list.add(s);
        Consumer<String> reference2 = list::add;
    }

    public static void constructorReferences() {
        Supplier<String> lambda1 = () -> new String();
        Supplier<String> reference1 = String::new;

        Function<String, String> lambda2 = (String s) -> new String(s);
        Function<String, String> reference2 = String::new;
    }
}
