package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HotelTest {

    @Test
    void bookRoom_whenSuitesAvailable_returnTrue() {
        //arrange: create object
        Hotel grandBudapestHotel = new Hotel("Grand Budapest Hotel", 15, 100);
        //act: call method
        boolean result = grandBudapestHotel.bookRoom(5, true);
        //assert: verify changes
        assertTrue(result);
    }

    @Test
    void bookRoom_whenSuitesAreNotAvailable_returnFalse() {
        //arrange: create object
        Hotel grandBudapestHotel = new Hotel("Grand Budapest Hotel", 15, 100);
        //act: call method
        boolean result = grandBudapestHotel.bookRoom(101, false);
        //assert: verify changes
        assertFalse(result);
    }

    @Test
    void bookRoom_whenRoomsAreAvailable_returnTrue() {
        //arrange: create object
        Hotel grandBudapestHotel = new Hotel("Grand Budapest Hotel", 15, 100);
        //act: call method
        boolean result = grandBudapestHotel.bookRoom(99, true);
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