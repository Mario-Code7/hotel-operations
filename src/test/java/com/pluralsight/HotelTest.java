package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HotelTest {

    @Test
    void bookRoom_whenRoomsAvailable_returnTrue() {
        //arrange: create object
        Hotel grandBudapestHotel = new Hotel("Grand Budapest Hotel", 15, 100);
        //act: call method
        boolean result = grandBudapestHotel.bookRoom(5, false);
        //assert: verify changes
        assertTrue(result);
    }

    @Test
    void bookRoom_whenRoomsAreNotAvailable_returnFalse() {
        //arrange: create object
        Hotel grandBudapestHotel = new Hotel("Grand Budapest Hotel", 15, 100);
        //act: call method
        boolean result = grandBudapestHotel.bookRoom(101, false);
        //assert: verify changes
        assertFalse(result);
    }
}