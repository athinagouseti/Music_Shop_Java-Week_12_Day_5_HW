package AccessoriesTest;

import Accessories.InstrumentString;
import Accessories.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {
    SheetMusic sheetMusic;

    @Before
    public void before(){
        sheetMusic = new SheetMusic("AC/DC Classics", 25.0, 50.0, "Guitar");
    }

    @Test
    public void canGetName(){
        assertEquals("AC/DC Classics", sheetMusic.getName());
    }

    @Test
    public void canGetBuyingPrice(){
        assertEquals(25.0, sheetMusic.getBuyingPrice(), 0.0);
    }

    @Test
    public void canGetSellingPrice(){
        assertEquals(50.0, sheetMusic.getSellingPrice(), 0.0);
    }

    @Test
    public void canGetSheetMusicType(){
        assertEquals("Guitar", sheetMusic.getType());
    }

    @Test
    public void canGetProfit(){
        assertEquals(25.0, sheetMusic.calculateMarkup(), 0.0);
    }
}
