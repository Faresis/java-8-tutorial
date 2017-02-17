package ua.dp.mign.java8.streams.reducing;

import ua.dp.mign.java8.domain.traders.Trader;
import ua.dp.mign.java8.domain.traders.Transaction;
import ua.dp.mign.java8.domain.traders.Transactions;

public final class UniqueCities {
    public static void main(String[] args) {
        Transactions.getTransactions().stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .distinct()
                .forEach(System.out::println);
    }
}
