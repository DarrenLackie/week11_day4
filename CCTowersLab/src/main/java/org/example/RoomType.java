package org.example;

public enum RoomType {

    SINGLE(1),
    DOUBLE(2),
    TRIPLE(3),
    FAMILY(4),
    CONFERENCE(20);

    private final int capacity;

    RoomType(int capacity){
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}
