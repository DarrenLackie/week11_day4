import org.example.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HotelTest {

    Hotel hotel;
    ConferenceRoom conferenceRoom;
    Bedroom bedroom;
    Guest guest;

    @Before
    public void before(){
        hotel = new Hotel();
        conferenceRoom = new ConferenceRoom(RoomType.CONFERENCE, "Mull");
        bedroom = new Bedroom(RoomType.DOUBLE, 55);
        guest = new Guest("Bill Wilson");
    }

    @Test
    public void canAddBedroom(){
        hotel.addBedroom(bedroom);
        assertEquals(1, hotel.getBedroomCollection().size());
    }

    @Test
    public void canAddConferenceRoom(){
        hotel.addConferenceRoom(conferenceRoom);
        assertEquals(1, hotel.getConferenceRoomCollection().size());
    }

    @Test
    public void canCheckGuestInToBedroom(){
        hotel.checkGuestIntoBedroom(bedroom, guest);
        assertEquals(1, bedroom.getGuests().size());
    }

    @Test
    public void canCheckGuestOutOfBedroom(){
        hotel.checkGuestIntoBedroom(bedroom, guest);
        hotel.checkGuestOutOfBedroom(bedroom, guest);
        assertEquals(0, bedroom.getGuests().size());
    }
}
