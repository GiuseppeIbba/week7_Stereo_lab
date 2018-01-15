import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CassetteDeckTest {

    CassetteDeck cassetteDeck;

    @Before
    public void before(){
        cassetteDeck = new CassetteDeck(2, 2);
    }

    @Test

    public void canGetNumberofDoors(){
        assertEquals(2, cassetteDeck.getNumberOfDoors() );
    }
}
