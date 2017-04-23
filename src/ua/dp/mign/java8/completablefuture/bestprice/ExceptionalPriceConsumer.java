package ua.dp.mign.java8.completablefuture.bestprice;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public final class ExceptionalPriceConsumer {
    public static void main(String[] args) {
        Shop exceptional = new Shop("Exceptional");

        long start = System.nanoTime();

        Future<Double> milk = exceptional.getPriceAsync("milk");
        long invocationTime = (System.nanoTime() - start) / 1_000_000;
        System.out.println("invocation time :" + invocationTime);

        doSomethingElse();

        try {

            double price = milk.get();
            System.out.printf("Price is %.2f%n", price);

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        long retrievalTime = (System.nanoTime() - start) / 1_000_000;
        System.out.println("retrieval time :" + retrievalTime);

    }

    private static void doSomethingElse() {
        System.out.println("doing something else.");
    }
}
