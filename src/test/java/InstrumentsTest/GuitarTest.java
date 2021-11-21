package InstrumentsTest;

import Instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {
    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Oak Wood", "brown", "Classic", 6, 25.0, 50.0);
    }

    @Test
    public void canGetName(){
        assertEquals("Oak Wood", guitar.getMaterialMadeFrom());
    }

    @Test
    public void canGetColour(){
        assertEquals("brown", guitar.getColour());
    }

    @Test
    public void canGetType(){
        assertEquals("Classic", guitar.getType());
    }

    @Test
    public void canGetGuitarStrings(){
        assertEquals(6, guitar.getGuitarStrings());
    }

    @Test
    public void canGetBuyingPrice(){
        assertEquals(25.0, guitar.getBuyingPrice(), 0.0);
    }

    @Test
    public void canGetSellingPrice(){
        assertEquals(50.0, guitar.getSellingPrice(), 0.0);
    }

    @Test
    public void canGetProfit(){
        assertEquals(25.0, guitar.calculateMarkup(), 0.0);
    }

}
