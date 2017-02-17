package ua.dp.mign.java8.streams.filtering.transactions;

import ua.dp.mign.java8.domain.traders.Transaction;
import ua.dp.mign.java8.domain.traders.Transactions;

public final class SmallestTransactionValue {
    public static void main(String[] args) {
        System.out.println("Smallest transaction value: " +
                Transactions.getTransactions().stream()
                .mapToInt(Transaction::getValue)
                .min()
        );
    }
}
