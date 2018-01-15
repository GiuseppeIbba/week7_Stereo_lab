import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDPlayerTest {

    CDPlayer cdPlayer;

    @Before


    public void before(){
        cdPlayer = new CDPlayer(3, 12);

    }

    @Test

    public void canGetNumberOfCds(){
        assertEquals(3, cdPlayer.getNumberOfCds() );
    }

}
