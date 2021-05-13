package com.iegor.Lectures.Lecture8.hotels;

public class AbstractRoom {
    private double area;

    public AbstractRoom(double area) {
        this.area = area;
    }

    public double getArea() {
        return area;
    }

//    public void setArea(double area) {
//        this.area = area;
//    }

    @Override
    public String toString() {
        return "area=" + area;
    }
}
