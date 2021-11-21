package InstrumentsTest;

import Instruments.Guitar;
import Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {
    Piano piano;

    @Before
    public void before(){
        piano = new Piano("Oak Wood", "black", "Classic", 49, 3, 60, 100);
    }

    @Test
    public void canGetName(){
        assertEquals("Oak Wood", piano.getMaterialMadeFrom());
    }

    @Test
    public void canGetColour(){
        assertEquals("black", piano.getColour());
    }

    @Test
    public void canGetType(){
        assertEquals("Classic", piano.getType());
    }

    @Test
    public void canGetPianoKeys(){
        assertEquals(49, piano.getPianoKeys());
    }

    @Test
    public void canGetPedals(){
        assertEquals(3, piano.getPedals());
    }

    @Test
    public void canGetBuyingPrice(){
        assertEquals(60.0, piano.getBuyingPrice(), 0.0);
    }

    @Test
    public void canGetSellingPrice(){
        assertEquals(100.0, piano.getSellingPrice(), 0.0);
    }

    @Test
    public void canGetProfit(){
        assertEquals(40.0, piano.calculateMarkup(), 0.0);
    }
}
