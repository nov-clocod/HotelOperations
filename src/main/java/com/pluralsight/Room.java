package com.pluralsight;

//Exercise 1 create Room class with gettors
public class Room {
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;

    public Room(int numberOfBeds, double price) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = false;
        this.isDirty = false;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isAvailable() {
        return !isOccupied && !isDirty;
    }

    //Exercise 2 create checkin, checkout, cleanroom
    public void checkIn() {
        if (isAvailable()) {
        isOccupied = true;
        isDirty = true;
        }
    }

    public void cleanroom() {
        if (!isOccupied) {
            isDirty = false;
        }
    }

    public void checkOut() {
        isOccupied = false;
    }
}
