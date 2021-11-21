package InstrumentsTest;

import Accessories.Bow;
import Instruments.Piano;
import Instruments.Violin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViolinTest {
    Violin violin;
    Bow bow;

    @Before
    public void before(){
        violin = new Violin("Pine", "silver", "Classic", 6, bow, 50, 80);
        bow = new Bow("BigBow", 50.0, 75.0);
    }

    @Test
    public void canGetName(){
        assertEquals("Pine", violin.getMaterialMadeFrom());
    }

    @Test
    public void canGetColour(){
        assertEquals("silver", violin.getColour());
    }

    @Test
    public void canGetType(){
        assertEquals("Classic", violin.getType());
    }

    @Test
    public void canGetStrings(){
        assertEquals(6, violin.getViolinStrings());
    }

    @Test
    public void canGetBow(){
        assertEquals("BigBow", bow.getName());
    }

    @Test
    public void canGetBuyingPrice(){
        assertEquals(50.0, violin.getBuyingPrice(), 0.0);
    }

    @Test
    public void canGetSellingPrice(){
        assertEquals(80.0, violin.getSellingPrice(), 0.0);
    }

    @Test
    public void canGetProfit(){
        assertEquals(30.0, violin.calculateMarkup(), 0.0);
    }
}
