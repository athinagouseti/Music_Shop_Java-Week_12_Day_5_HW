package Accessories;

public class SheetMusic extends Accessory{

    private String type;
    public SheetMusic(String name, double buyingPrice, double sellingPrice, String type) {
        super(name, buyingPrice, sellingPrice);
        this.type = type;
    }

    public String getType() {
        return this.type;
    }
}
