package ua.dp.mign.java8.completablefuture.bestprice;

public final class Quote {

    private final String shopName;
    private final double price;
    private final Discount.Code discount;

    public Quote(String shopName, double price, Discount.Code discount) {
        this.shopName = shopName;
        this.price = price;
        this.discount = discount;
    }

    public static Quote parse(String string) {
        String[] split = string.split(":");
        return new Quote(split[0], Double.parseDouble(split[1]), Discount.Code.valueOf(split[2]));
    }

    public String getShopName() {
        return shopName;
    }

    public double getPrice() {
        return price;
    }

    public Discount.Code getDiscount() {
        return discount;
    }
}
