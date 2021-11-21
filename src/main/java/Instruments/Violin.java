package Instruments;

import Accessories.Bow;

public class Violin extends Instrument {
    private int violinStrings;
    private Bow bow;

    public Violin(String materialMadeFrom, String colour, String type, int violinStrings, Bow bow, double buyingPrice, double sellingPrice) {
        super(materialMadeFrom, colour, type, buyingPrice, sellingPrice);
        this.violinStrings = violinStrings;
        this.bow = bow;
    }

    public int getViolinStrings() {
        return this.violinStrings;
    }

    public Bow getBow() {
        return this.bow;
    }

}
