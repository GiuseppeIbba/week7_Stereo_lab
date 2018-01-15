import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComponentTest {

   CDPlayer cdPlayer;
   CassetteDeck cassetteDeck;



    @Before
    public void before() {
        cdPlayer = new CDPlayer(3, 12);
        cassetteDeck = new CassetteDeck(2, 2);
    }

    @Test
        public void cangetVolume() {
        assertEquals(3, cdPlayer.getVolume());
    }
}
