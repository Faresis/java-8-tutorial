package ua.dp.mign.java8.streams.reducing;

import ua.dp.mign.java8.domain.traders.Trader;
import ua.dp.mign.java8.domain.traders.Traders;

import static java.util.stream.Collectors.joining;

public final class AllTradersNames {
    public static void main(String[] args) {
        System.out.println(Traders.getTraders().stream()
                .map(Trader::getName)
                .sorted()
                .collect(joining(", ")));
    }
}
