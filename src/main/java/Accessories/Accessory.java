package Accessories;

import Actions.ISell;

public abstract class Accessory implements ISell {
    private String name;
    private double buyingPrice;
    private double sellingPrice;

    public Accessory(String name, double buyingPrice, double sellingPrice) {
        this.name = name;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getName(){
        return this.name;
    }

    public double getBuyingPrice() {
        return this.buyingPrice;
    }

    public double getSellingPrice() {
        return this.sellingPrice;
    }


    public double calculateMarkup() {
        double profit = getSellingPrice() - getBuyingPrice();
        return profit;
    }
}
