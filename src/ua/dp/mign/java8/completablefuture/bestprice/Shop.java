package ua.dp.mign.java8.completablefuture.bestprice;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

public final class Shop {

    private static final Random RANDOM = new Random();
    private final String name;

    public Shop(String name) {
        this.name = name;
    }

    public String getName() {
        System.out.println(Thread.currentThread().getName() + " " + System.nanoTime() + " Getting name for: " + name);
        return name;
    }

    public double getPrice(String product) {
        System.out.println(Thread.currentThread().getName() + " " + System.nanoTime() + " Getting price for: " + name);
        return calculatePrice(product);
    }

    public String getPriceWithDiscount(String product) {
        System.out.println(Thread.currentThread().getName() + " " + System.nanoTime() + " Getting price with discount for: " + name);

        double price = calculatePrice(product);
        Discount.Code discount = Discount.Code.values()[RANDOM.nextInt(Discount.Code.values().length)];
        return String.format("%s:%.2f:%s", name, price, discount);
    }

    public Future<Double> getPriceAsync(String product) {
        return CompletableFuture.supplyAsync(() -> calculatePrice(product));
    }

    private double calculatePrice(String product) throws PriceException {
        delay();
        if (this.name.startsWith("Exc")) {
            throw new PriceException();
        }
        return RANDOM.nextDouble() * product.charAt(0) + product.charAt(1);
    }

    private static void delay() {
        int delay = 500 + RANDOM.nextInt(2000);
        try {

            Thread.sleep(delay);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static class PriceException extends RuntimeException { }
}
