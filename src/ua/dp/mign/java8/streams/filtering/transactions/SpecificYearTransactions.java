package ua.dp.mign.java8.streams.filtering.transactions;

import ua.dp.mign.java8.domain.traders.Transaction;
import ua.dp.mign.java8.domain.traders.Transactions;

import static java.util.Comparator.comparing;

public final class SpecificYearTransactions {
    public static void main(String[] args) {
        Transactions.getTransactions().stream()
                .filter(t -> 2011 == t.getYear())
                .sorted(comparing(Transaction::getValue))
                .forEach(System.out::println);
    }
}
