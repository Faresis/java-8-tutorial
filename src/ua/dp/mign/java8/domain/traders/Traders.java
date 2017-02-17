package ua.dp.mign.java8.domain.traders;

import java.util.Arrays;
import java.util.List;

public final class Traders {
    public static final Trader RAOUL = new Trader("Raoul", "Cambridge");
    public static final Trader MARIO = new Trader("Mario", "Milan");
    public static final Trader ALAN = new Trader("Alan", "Cambridge");
    public static final Trader BRIAN = new Trader("Brian", "Cambridge");

    private static final List<Trader> TRADERS = Arrays.asList(RAOUL, MARIO, ALAN, BRIAN);

    public static List<Trader> getTraders() {
        return TRADERS;
    }

    private Traders() {}
}
