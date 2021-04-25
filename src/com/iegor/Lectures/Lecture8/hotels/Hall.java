package com.iegor.Lectures.Lecture8.hotels;

public class Hall extends AbstractRoom{

    public Hall(double area) {
        super(area);
    }

    @Override
    public String toString() {
        return "Hall " + super.toString();
    }
}
