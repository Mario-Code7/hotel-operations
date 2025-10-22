package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservationTest {

    @Test
    void getReservationTotal_ReservingKingRoomForOneNightNotWeekend() {
        Reservation reservation = new Reservation("King", 1, false);
        assertEquals(139.00, reservation.getReservationTotal());
    }

    @Test
    void getReservationTotal_ReservingKingRoomForTwoNightsNotWeekend() {
        Reservation reservation = new Reservation("King", 2, false);
        assertEquals(278.00, reservation.getReservationTotal());
    }
    @Test
    void getReservationTotal_ReservingDoubleRoomForOneNightNotWeekend() {
        Reservation reservation = new Reservation("double", 1, false);
        assertEquals(124.00, reservation.getReservationTotal());
    }
    @Test
    void getReservationTotal_ReservingDoubleRoomForTwoNightsNotWeekend() {
        Reservation reservation = new Reservation("double", 2, false);
        assertEquals(248.00, reservation.getReservationTotal());
    }

    @Test
    void getReservationTotal_ReservingKingRoomForOneNightWeekend() {
        Reservation reservation = new Reservation("King", 1, true);
        assertEquals(152.9, reservation.getReservationTotal());
    }

    @Test
    void getReservationTotal_ReservingKingRoomForTwoNightsWeekend() {
        Reservation reservation = new Reservation("King", 2, true);
        assertEquals(305.80, reservation.getReservationTotal());
    }

    @Test
    void getReservationTotal_ReservingDoubleRoomForOneNightWeekend() {
        Reservation reservation = new Reservation("double", 1, true);
        assertEquals(136.4, reservation.getReservationTotal());
    }

    @Test
    void getReservationTotal_ReservingDoubleRoomForTwoNightsWeekend() {
        Reservation reservation = new Reservation("double", 2, true);
        assertEquals(272.80, reservation.getReservationTotal());
    }
}