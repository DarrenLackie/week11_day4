import org.example.Bedroom;
import org.example.Guest;
import org.example.Room;
import org.example.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest;
    Guest guest2;
    Guest guest3;

    @Before
    public void before(){
        guest = new Guest("Bob Bobson");
        guest2 = new Guest("Bob Bobson");
        guest3 = new Guest("Bob Bobson");
        bedroom = new Bedroom(RoomType.DOUBLE, 13);
        bedroom.addGuest(guest);
        bedroom.addGuest(guest2);
        bedroom.addGuest(guest3);
    }

    @Test
    public void canGetRoomNumber(){
        assertEquals(13, bedroom.getRoomNumber());
    }

    @Test
    public void canGetGuestsInRoom(){
        assertEquals(1, bedroom.getGuests().size());
    }

    @Test
    public void canAddGuest(){
        assertTrue(bedroom.getGuests().contains(guest2));
    }

    @Test
    public void canNotAddTooManyGuests(){
        assertFalse(bedroom.getGuests().contains(guest3));
    }



}
