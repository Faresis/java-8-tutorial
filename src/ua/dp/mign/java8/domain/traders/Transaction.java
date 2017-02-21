package ua.dp.mign.java8.domain.traders;

import java.util.StringJoiner;

public final class Transaction {
    private final Trader trader;
    private final int year;
    private final int value;
    private final Currency currency;

    public Transaction(Trader trader, int year, int value, Currency currency) {
        this.trader = trader;
        this.year = year;
        this.value = value;
        this.currency = currency;
    }

    public Trader getTrader() {
        return trader;
    }

    public int getYear() {
        return year;
    }

    public int getValue() {
        return value;
    }

    public Currency getCurrency() {
        return currency;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Transaction.class.getSimpleName() + "[", "]")
                .add("trader=" + trader)
                .add("year=" + year)
                .add("value=" + value)
                .add("currency=" + currency)
                .toString();
    }

    public enum Currency {
        USD,
        EURO,
        UAH
    }
}
