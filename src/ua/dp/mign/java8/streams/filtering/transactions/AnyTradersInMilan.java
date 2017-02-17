package ua.dp.mign.java8.streams.filtering.transactions;

import ua.dp.mign.java8.domain.traders.Trader;
import ua.dp.mign.java8.domain.traders.Traders;

public final class AnyTradersInMilan {
    public static void main(String[] args) {
        System.out.println("Are there any traders in Milan: " +
                Traders.getTraders().stream()
                .map(Trader::getCity)
                .anyMatch(c -> "Milan".equals(c))
        );
    }
}
