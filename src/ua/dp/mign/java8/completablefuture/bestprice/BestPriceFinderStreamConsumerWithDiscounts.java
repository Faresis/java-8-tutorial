package ua.dp.mign.java8.completablefuture.bestprice;

import java.util.concurrent.CompletableFuture;

public final class BestPriceFinderStreamConsumerWithDiscounts {
    public static void main(String[] args) {
        BestPriceFinder bestPriceFinder = new BestPriceFinder();

        long start = System.nanoTime();
        CompletableFuture[] prices = bestPriceFinder.findPricesStream("milk")
                .map(future -> future.thenAccept(System.out::println))
                .toArray(size -> new CompletableFuture[size]);
        CompletableFuture.allOf(prices).join();
        long finish = (System.nanoTime() - start) / 1_000_000;
        System.out.println("time spent: " + finish);
    }
}
