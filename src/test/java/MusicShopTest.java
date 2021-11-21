import Accessories.SheetMusic;
import Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MusicShopTest {

    MusicShop musicShop;
    Piano piano;
    SheetMusic sheetMusic;

    @Before
    public void before(){
        musicShop = new MusicShop();
        piano = new Piano("Oak Wood", "black", "Classic", 49, 3, 60, 100);
        sheetMusic = new SheetMusic("Beethoven", 25.0, 50.0, "Piano");
    }

    @Test
    public void stockStartsEmpty(){
        assertEquals(0, musicShop.getStock());
    }

    @Test
    public void canAddItemToStock(){
        musicShop.addItemToStock(piano);
        assertEquals(1,musicShop.getStock());
    }

    @Test
    public void canRemoveItemFromStock(){
        musicShop.addItemToStock(piano);
        musicShop.addItemToStock(sheetMusic);
        musicShop.removeItemFromStock(piano);
        assertEquals(1,musicShop.getStock());
    }
}
