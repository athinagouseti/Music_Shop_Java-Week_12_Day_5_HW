package Instruments;

public class Guitar extends Instrument{
    private int guitarStrings;

    public Guitar(String materialMadeFrom, String colour, String type,int guitarStrings, double buyingPrice, double sellingPrice) {
        super(materialMadeFrom, colour, type, buyingPrice, sellingPrice);
        this.guitarStrings = guitarStrings;
    }

    public int getGuitarStrings() {
        return guitarStrings;
    }
}
