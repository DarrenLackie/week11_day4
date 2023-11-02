package org.example;

import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedroomCollection;
    private ArrayList<ConferenceRoom> conferenceRoomCollection;

    public Hotel() {
        this.bedroomCollection = new ArrayList<>();
        this.conferenceRoomCollection = new ArrayList<>();
    }

    public ArrayList<Bedroom> getBedroomCollection() {
        return bedroomCollection;
    }

    public ArrayList<ConferenceRoom> getConferenceRoomCollection() {
        return conferenceRoomCollection;
    }

    public void addBedroom(Bedroom bedroom){
        bedroomCollection.add(bedroom);
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom){
        conferenceRoomCollection.add(conferenceRoom);
    }

    public void checkGuestIntoBedroom(Bedroom bedroom, Guest guest){
        bedroom.addGuest(guest);
    }

    public void checkGuestOutOfBedroom(Bedroom bedroom, Guest guest){
        bedroom.removeGuest(guest);
    }


}
