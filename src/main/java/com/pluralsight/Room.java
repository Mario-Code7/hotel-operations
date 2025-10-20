package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;
    private boolean available;

    public Room(int numberOfBeds, double price, boolean occupied, boolean dirty, boolean available) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
        this.available = available;
    }

    public int numberOfBeds() {
        return numberOfBeds;
    }

    public double price() {
        return price;
    }

    public boolean occupied() {
        return occupied;
    }

    public boolean dirty() {
        return dirty;
    }

    public boolean available() {
        return !occupied && !dirty;
    }
}
