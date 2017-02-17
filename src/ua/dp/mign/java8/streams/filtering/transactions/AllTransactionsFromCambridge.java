package ua.dp.mign.java8.streams.filtering.transactions;

import ua.dp.mign.java8.domain.traders.Transaction;
import ua.dp.mign.java8.domain.traders.Transactions;

public final class AllTransactionsFromCambridge {
    public static void main(String[] args) {
        Transactions.getTransactions().stream()
                .filter(t -> "Cambridge".equals(t.getTrader().getCity()))
                .map(Transaction::getValue)
                .forEach(System.out::println);
    }
}
