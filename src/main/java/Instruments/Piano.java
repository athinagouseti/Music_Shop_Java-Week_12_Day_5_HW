package Instruments;

public class Piano extends Instrument{
    private int pianoKeys;
    private int pedals;

    public Piano(String materialMadeFrom, String colour, String type, int pianoKeys, int pedals, double buyingPrice, double sellingPrice) {
        super(materialMadeFrom, colour, type, buyingPrice, sellingPrice);
        this.pianoKeys = pianoKeys;
        this.pedals = pedals;
    }

    public int getPianoKeys() {
        return this.pianoKeys;
    }

    public int getPedals() {
        return this.pedals;
    }
}
