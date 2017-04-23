package ua.dp.mign.java8.completablefuture.bestprice;

public final class BestPriceFinderSyncConsumer {
    public static void main(String[] args) {
        BestPriceFinder bestPriceFinder = new BestPriceFinder();

        long start = System.nanoTime();
        System.out.println(bestPriceFinder.findPrices("milk"));
        long finish = (System.nanoTime() - start) / 1_000_000;
        System.out.println("time spent: " + finish);
    }
}
