package ua.dp.mign.java8.streams.parallel;

import java.util.function.Function;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import static java.lang.System.out;

public final class SummingNumbers {

    public static long sequentalSum(long n) {
        return Stream.iterate(1L, i -> i + 1)
                .limit(n)
                .reduce(0L, Long::sum);
    }

    public static long iterativeSum(long n) {
        long result = 0L;
        for (long i = 1; i <= n; ++i) {
            result += i;
        }
        return result;
    }

    public static long parallelSum(long n) {
        return Stream.iterate(1L, i -> i + 1)
                .limit(n)
                .parallel()
                .reduce(0L, Long::sum);
    }

    public static long rangedSum(long n) {
        return LongStream.rangeClosed(1, n)
                .reduce(0L, Long::sum);
    }

    public static long rangedParallelSum(long n) {
        return LongStream.rangeClosed(1, n)
                .parallel()
                .reduce(0L, Long::sum);
    }

    public static long sideEffectSum(long n) {
        Accumulator accumulator = new Accumulator();
        LongStream.rangeClosed(1, n).forEach(accumulator::add);
        return accumulator.total;
    }

    public static long sideEffectParallelSum(long n) {
        Accumulator accumulator = new Accumulator();
        LongStream.rangeClosed(1, n).parallel().forEach(accumulator::add);
        return accumulator.total;
    }

    private static class Accumulator {
        long total = 0;

        void add(long value) {
            total += value;
        }
    }

    public static long measureSumPerf(Function<Long, Long> adder, long n) {
        long fastest = Long.MAX_VALUE;
        for (int i = 0; i < 10; i++) {
            long start = System.nanoTime();
            long sum = adder.apply(n);
            System.out.println("Result: " + sum);
            long duration = (System.nanoTime() - start) / 1_000_000;
            if (duration < fastest) fastest = duration;
        }
        return fastest;
    }

    public static void main(String[] args) {
/*        out.println("Sequental sum done in: " + measureSumPerf(SummingNumbers::sequentalSum, 10_000_000) + "msecs");
        out.println("Iterative sum done in: " + measureSumPerf(SummingNumbers::iterativeSum, 10_000_000) + "msecs");
        out.println("Parallel sum done in: " + measureSumPerf(SummingNumbers::parallelSum, 10_000_000) + "msecs");
        out.println("Ranged sum done in: " + measureSumPerf(SummingNumbers::rangedSum, 10_000_000) + "msecs");
        out.println("Ranged parallel sum done in: " + measureSumPerf(SummingNumbers::rangedParallelSum, 10_000_000) + "msecs");*/

        out.println("Side effect parallel sum done in: " + measureSumPerf(SummingNumbers::sideEffectParallelSum, 10_000_000) + "msecs");
    }
}
