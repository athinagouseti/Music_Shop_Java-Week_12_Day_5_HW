package Accessories;

public class InstrumentString extends Accessory{

    private int numberOfStrings;
    public InstrumentString(String name, double buyingPrice, double sellingPrice, int numberOfStrings) {
        super(name, buyingPrice, sellingPrice);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return this.numberOfStrings;
    }
}
