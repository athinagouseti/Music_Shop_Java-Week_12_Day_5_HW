package AccessoriesTest;

import Accessories.Bow;
import Accessories.InstrumentString;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentStringTest {
    InstrumentString instrumentString;

    @Before
    public void before(){
        instrumentString = new InstrumentString("GuitarString", 50.0, 75.0, 6);
    }

    @Test
    public void canGetName(){
        assertEquals("GuitarString", instrumentString.getName());
    }

    @Test
    public void canGetBuyingPrice(){
        assertEquals(50.0, instrumentString.getBuyingPrice(), 0.0);
    }

    @Test
    public void canGetSellingPrice(){
        assertEquals(75.0, instrumentString.getSellingPrice(), 0.0);
    }

    @Test
    public void canGetNumberOfString(){
        assertEquals(6, instrumentString.getNumberOfStrings());
    }

    @Test
    public void canGetProfit(){
        assertEquals(25.0, instrumentString.calculateMarkup(), 0.0);
    }
}
