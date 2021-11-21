package AccessoriesTest;

import Accessories.Bow;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BowTest {

    Bow bow;

    @Before
    public void before(){
        bow = new Bow("BigBow", 50.0, 75.0);
    }

    @Test
    public void canGetName(){
        assertEquals("BigBow", bow.getName());
    }

    @Test
    public void canGetBuyingPrice(){
        assertEquals(50.0, bow.getBuyingPrice(), 0.0);
    }

    @Test
    public void canGetSellingPrice(){
        assertEquals(75.0, bow.getSellingPrice(), 0.0);
    }

    @Test
    public void canGetProfit(){
        assertEquals(25.0, bow.calculateMarkup(), 0.0);
    }
}
