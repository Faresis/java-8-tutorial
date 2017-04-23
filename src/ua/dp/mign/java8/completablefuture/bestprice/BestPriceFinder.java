package ua.dp.mign.java8.completablefuture.bestprice;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public final class BestPriceFinder {
    private final List<Shop> shops = Arrays.asList(
            new Shop("BestPrice"),
            new Shop("LetsSaveBig"),
            new Shop("MyFavoriteShop"),
            new Shop("BuyItAll")
    );

    public List<String> findPrices(String product) {
        return shops.stream()
                .map(shop -> String.format("%s price is %.2f",
                        shop.getName(), shop.getPrice(product)))
                .collect(toList());
    }
}
