package com.pluralsight;

public class Reservation {
    private String roomType;
    private double price;
    private int numberOfNights;
    private boolean isWeekend;

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        return price;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public double getReservationTotal() {
        if (roomType.equalsIgnoreCase("king")) {
            price = 139;
            if (isWeekend) {
                return numberOfNights * price * 1.1;
            } else {
                return numberOfNights * price;
            }
        }

        if (roomType.equalsIgnoreCase("double")) {
            price = 124;
            if (isWeekend) {
                return numberOfNights * price * 1.1;
            } else {
                return numberOfNights * price;
            }

        }
        return 0;
    }
}
