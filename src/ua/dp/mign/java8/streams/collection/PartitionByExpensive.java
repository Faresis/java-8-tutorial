package ua.dp.mign.java8.streams.collection;

import ua.dp.mign.java8.domain.traders.Transaction;
import ua.dp.mign.java8.domain.traders.Transactions;

import static java.util.stream.Collectors.partitioningBy;

public final class PartitionByExpensive {
    public static void main(String[] args) {
        System.out.println(
            Transactions.getTransactions().stream()
                .collect(partitioningBy(Transaction::isExpensive))
        );
    }
}
