package ua.dp.mign.java8.streams.numbers;

import java.util.Collection;
import java.util.List;

import static java.util.stream.Collectors.toList;

public final class DistinctEvenNumbers {
    public List<Integer> filter(Collection<Integer> numbers) {
        return numbers.stream()
                .filter(i -> i % 2 == 0)
                .distinct()
                .collect(toList());
    }
}
