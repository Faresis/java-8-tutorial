package ua.dp.mign.java8.completablefuture.bestprice;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

public final class Shop {

    private final Random random = new Random();
    private final String name;

    public Shop(String name) {
        this.name = name;
    }

    public double getPrice(String product) {
        return calculatePrice(product);
    }

    public Future<Double> getPriceAsync(String product) {
        return CompletableFuture.supplyAsync(() -> calculatePrice(product));
    }

    private double calculatePrice(String product) throws PriceException {
        delay();
        if (this.name.startsWith("Exc")) {
            throw new PriceException();
        }
        return random.nextDouble() * product.charAt(0) + product.charAt(1);
    }

    private static void delay() {
        try {

            Thread.sleep(1000L);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static class PriceException extends RuntimeException {

    }
}
