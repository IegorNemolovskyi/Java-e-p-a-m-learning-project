package com.iegor.Lectures.Lecture8.hotels;

public class Bathroom extends AbstractRoom{
    public Bathroom(double area) {
        super(area);
    }

    @Override
    public String toString() {
        return "Bathroom " + super.toString();
    }
}
