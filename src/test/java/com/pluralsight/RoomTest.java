package com.pluralsight;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//Exercise Creating Unit Tests
class RoomTest {

    @Test
    public void checkIn_OccupiedAndDirty_True() {
        Room room1 = new Room(1, 129);
        boolean expectedDirty = true;
        boolean expectedOccupancy = true;

        room1.checkIn();

        boolean actualDirty = room1.isDirty();
        boolean actualOccupancy = room1.isOccupied();

        assertEquals(expectedDirty, actualDirty);
        assertEquals(expectedOccupancy, actualOccupancy);
    }

    @Test
    public void checkOut_Occupied_False() {
        Room room2 = new Room(1, 129);
        boolean expectedOccupancy = false;

        room2.checkOut();

        boolean actualOccupancy = room2.isOccupied();

        assertEquals(expectedOccupancy, actualOccupancy);
    }

    @Test
    public void cleanroom_Dirty_False() {
        Room room3 = new Room(1, 129);
        boolean expectedDirty = false;

        room3.cleanroom();

        boolean actualDirty = room3.isOccupied();

        assertEquals(expectedDirty, actualDirty);
    }

}