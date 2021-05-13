package com.iegor.Lectures.Lecture8;

public class Circle extends AbstarctFigure{
    private int x;
    private int y;
    private int radius;
//    private final double PI = 3.14;

    public Circle(){
        this(0, 0, 0);
    }

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle: " + this.perimeter() + " , "+ this.area();
    }
}
