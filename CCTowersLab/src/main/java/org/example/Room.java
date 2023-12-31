package org.example;

import java.util.ArrayList;

public abstract class Room {

    private RoomType roomType;
    private ArrayList<Guest> guests;

    public Room(RoomType roomType) {
        this.roomType = roomType;
        this.guests = new ArrayList<>();
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public void setGuests(ArrayList<Guest> guests) {
        this.guests = guests;
    }

    public void addGuest(Guest guest){
        if(roomType.getCapacity() > guests.size()) {
            guests.add(guest);
        }
    }

    public void removeGuest(Guest guest){
        guests.remove(guest);
    }
}
