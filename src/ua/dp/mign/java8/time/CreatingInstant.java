package ua.dp.mign.java8.time;

import java.time.Instant;

public final class CreatingInstant {
    public static void main(String[] args) {
        Instant i1 = Instant.ofEpochSecond(3);
        Instant i2 = Instant.ofEpochSecond(3, 0);
        Instant i3 = Instant.ofEpochSecond(2, 1_000_000_000);
        Instant i4 = Instant.ofEpochSecond(4, -1_000_000_000);

        System.out.printf("i1 %s\n", i1);
        System.out.printf("i2 %s\n", i2);
        System.out.printf("i3 %s\n", i3);
        System.out.printf("i4 %s\n", i4);
    }
}
