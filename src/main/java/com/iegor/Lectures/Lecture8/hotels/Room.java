package com.iegor.Lectures.Lecture8.hotels;

public class Room extends AbstractRoom{
    public Room(double area) {
        super(area);
    }

    @Override
    public String toString() {
        return "Room " + super.toString();
    }
}
