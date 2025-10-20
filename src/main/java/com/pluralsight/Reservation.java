package com.pluralsight;

public class Reservation {
    private String roomType;
    private double pricePerNight;
    private int numberOfNights;
    private boolean weekend;

    public Reservation(String roomType, int numberOfNights, boolean weekend) {
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
        setRoomType(roomType);
    }

    public String getRoomType() {
        return roomType;
    }

    public double getPrice() {
        return pricePerNight;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public boolean weekend() {
        return weekend;
    }

    public double getReservationTotal(){//deprived getter
        return pricePerNight * numberOfNights;
    }

    private void setRoomType(String roomType) {
        this.roomType = roomType.toLowerCase();

        switch (this.roomType) {
            case "king":
                this.pricePerNight = 139.00;
                break;
            case "double":
                this.pricePerNight = 124.00;
                break;
            default:
                throw new IllegalArgumentException("invalid room type" + roomType);
        }
        if (weekend) {
            pricePerNight = pricePerNight * 1.10;
        }
    }
    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public void setWeekend(boolean weekend) {
        this.weekend = weekend;

        setRoomType(this.roomType);
    }
}
