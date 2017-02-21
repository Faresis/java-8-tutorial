package ua.dp.mign.java8.domain.traders;

import java.util.Arrays;
import java.util.List;

import static ua.dp.mign.java8.domain.traders.Transaction.Currency.EURO;
import static ua.dp.mign.java8.domain.traders.Transaction.Currency.UAH;
import static ua.dp.mign.java8.domain.traders.Transaction.Currency.USD;

public final class Transactions {
    private static final List<Transaction> TRANSACTIONS = Arrays.asList(
            new Transaction(Traders.BRIAN, 2011, 300, USD),
            new Transaction(Traders.RAOUL, 2012, 1000, USD),
            new Transaction(Traders.RAOUL, 2011, 400, EURO),
            new Transaction(Traders.MARIO, 2012, 710, EURO),
            new Transaction(Traders.MARIO, 2012, 700, UAH),
            new Transaction(Traders.ALAN, 2012, 950, USD)
    );

    public static List<Transaction> getTransactions() {
        return TRANSACTIONS;
    }

    private Transactions() {}
}
