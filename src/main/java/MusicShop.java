import Actions.ISell;

import java.util.ArrayList;

public class MusicShop {

    private ArrayList<ISell> stock;
    public MusicShop(){
        this.stock = new ArrayList<>();
    }

    public void addItemToStock(ISell item){
        this.stock.add(item);
    }

    public void removeItemFromStock(ISell item){
        this.stock.remove(item);
    }

    public int getStock() {
        return this.stock.size();
    }
}
