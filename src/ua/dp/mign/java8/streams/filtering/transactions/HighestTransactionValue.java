package ua.dp.mign.java8.streams.filtering.transactions;

import ua.dp.mign.java8.domain.traders.Transaction;
import ua.dp.mign.java8.domain.traders.Transactions;

public final class HighestTransactionValue {
    public static void main(String[] args) {
        System.out.println("Highes transaction value: " +
                Transactions.getTransactions().stream()
                .mapToInt(Transaction::getValue)
                .max()
        );
    }
}
