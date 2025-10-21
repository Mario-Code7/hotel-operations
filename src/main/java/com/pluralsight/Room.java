package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;
    private boolean available;

    public Room() {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
        this.available = available;
    }

    public void checkIn(){
        if (!available){
            throw new IllegalArgumentException("Cannot check in. Room is not available.");
        }
        occupied = true;
        dirty = true;
    }

    public void checkout(){
        if (!available){
            throw new IllegalArgumentException("Room is available.");
        }
        occupied = false;
        cleanRoom();
    }

    private void cleanRoom(){
       dirty = false;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean occupied() {
        return occupied;
    }

    public boolean dirty() {
        return dirty;
    }

    public boolean available() {//deprived getter
        return !occupied && !dirty;
    }
}
