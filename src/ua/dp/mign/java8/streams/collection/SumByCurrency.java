package ua.dp.mign.java8.streams.collection;

import ua.dp.mign.java8.domain.traders.Transaction;
import ua.dp.mign.java8.domain.traders.Transactions;

import java.util.Map;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingInt;

public final class SumByCurrency {
    public static void main(String[] args) {
        Map<Transaction.Currency, Integer> sumByCurrency = Transactions.getTransactions().stream()
                .collect(groupingBy(Transaction::getCurrency,
                        summingInt(Transaction::getValue)));

        System.out.println(sumByCurrency);
    }
}
