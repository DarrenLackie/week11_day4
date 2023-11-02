import org.example.Guest;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest;

    @Before
    public void before(){
        guest = new Guest("Bob Bobson");
    }

    @Test
    public void canGetName(){
        assertEquals("Bob Bobson", guest.getName());
    }
}
