import org.example.ConferenceRoom;
import org.example.Guest;
import org.example.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;
    Guest guest1;
    Guest guest2;
    Guest guest3;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom(RoomType.CONFERENCE, "Balmoral");
        guest1 = new Guest("Bob Bobson");
        guest2 = new Guest("Dave Daveson");
        guest3 = new Guest("Shania Twain");
        conferenceRoom.addGuest(guest1);
        conferenceRoom.addGuest(guest2);
        conferenceRoom.addGuest(guest3);
    }

    @Test
    public void canGetName(){
        assertEquals("Balmoral", conferenceRoom.getName());
    }

    @Test
    public void canGetGuestsInRoom(){
        assertEquals(3, conferenceRoom.getGuests().size());
    }

    @Test
    public void canAddGuest(){
        assertTrue(conferenceRoom.getGuests().contains(guest1));
        assertTrue(conferenceRoom.getGuests().contains(guest2));
        assertTrue(conferenceRoom.getGuests().contains(guest3));
    }

}
