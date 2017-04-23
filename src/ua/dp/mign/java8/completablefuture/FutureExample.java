package ua.dp.mign.java8.completablefuture;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class FutureExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<Double> future = executorService.submit(() -> doSomeComputation());
        doSomethingElse();

        try {

            Double result = future.get(1, TimeUnit.MINUTES);
            System.out.println("result : " + result);

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }

    private static Double doSomeComputation() {
        System.out.println("performing long running computation");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("finished long running computation");

        return 42d;
    }

    private static void doSomethingElse() {
        System.out.println("doing something else");
    }
}
