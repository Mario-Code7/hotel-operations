package com.pluralsight;



public class HotelApp {
    public static void main(String[] args) {
    Reservation reservation = new Reservation("King", 1, false);
        System.out.println(reservation.getReservationTotal());

        Employee employee = new Employee(12312333, "John", "Killer", 27, 50);
        System.out.println(employee.getTotalPay());


    }
}
