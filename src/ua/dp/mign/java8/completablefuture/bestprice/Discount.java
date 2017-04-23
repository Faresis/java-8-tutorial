package ua.dp.mign.java8.completablefuture.bestprice;

import java.util.Random;

public final class Discount {

    private static final Random RANDOM = new Random();

    public enum Code {
        NONE(0), SILVER(5), GOLD(10), PLATINUM(15), DIAMOND(20);

        private final int percentage;

        Code(int percentage) {
            this.percentage = percentage;
        }
    }

    public static String applyDiscount(Quote quote) {
        System.out.println(Thread.currentThread().getName() + " " + System.nanoTime() + " Applying discount for: " + quote.getShopName());

        return quote.getShopName() + " price is " + Discount.apply(quote.getPrice(), quote.getDiscount());
    }

    private static double apply(double price, Code discount) {
        delay();
        return price * (100 - discount.percentage) / 100;
    }

    public static void delay() {
        int delay = 500 + RANDOM.nextInt(2000);
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
