package ua.dp.mign.java8.streams.collectors;

import ua.dp.mign.java8.domain.dishes.Menu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.stream.Collector.Characteristics.CONCURRENT;
import static java.util.stream.Collector.Characteristics.IDENTITY_FINISH;

public final class ToListCollector<T> implements Collector<T, List<T>, List<T>> {
    @Override
    public Supplier<List<T>> supplier() {
        return ArrayList::new;
    }

    @Override
    public BiConsumer<List<T>, T> accumulator() {
        return (l, i) -> l.add(i);
    }

    @Override
    public BinaryOperator<List<T>> combiner() {
        return (l1, l2) -> { l1.addAll(l2); return l1; };
    }

    @Override
    public Function<List<T>, List<T>> finisher() {
        return Function.identity();
    }

    @Override
    public Set<Characteristics> characteristics() {
        return Collections.unmodifiableSet(EnumSet.of(IDENTITY_FINISH, CONCURRENT));
    }

    public static void main(String[] args) {
        System.out.println(Menu.getMenu().stream().collect(Collectors.toList()));
        System.out.println(Menu.getMenu().stream().collect(new ToListCollector<>()));
    }
}
