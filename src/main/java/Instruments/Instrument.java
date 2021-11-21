package Instruments;

import Actions.IPlay;
import Actions.ISell;

public abstract class Instrument implements ISell, IPlay {
    private String materialMadeFrom;
    private String colour;
    private String type;
    private double buyingPrice;
    private double sellingPrice;

    public Instrument(String materialMadeFrom, String colour, String type, double buyingPrice, double sellingPrice) {
        this.materialMadeFrom = materialMadeFrom;
        this.colour = colour;
        this.type = type;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getMaterialMadeFrom() {
        return materialMadeFrom;
    }

    public String getColour() {
        return colour;
    }

    public String getType() {
        return type;
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

    public String play() {
        return "Playing";
    }
}
