package ua.dp.mign.java8.domain.traders;

import java.util.Arrays;
import java.util.List;

public final class Transactions {
    private static final List<Transaction> TRANSACTIONS = Arrays.asList(
            new Transaction(Traders.BRIAN, 2011, 300),
            new Transaction(Traders.RAOUL, 2012, 1000),
            new Transaction(Traders.RAOUL, 2011, 400),
            new Transaction(Traders.MARIO, 2012, 710),
            new Transaction(Traders.MARIO, 2012, 700),
            new Transaction(Traders.ALAN, 2012, 950)
    );

    private Transactions() {}
}
