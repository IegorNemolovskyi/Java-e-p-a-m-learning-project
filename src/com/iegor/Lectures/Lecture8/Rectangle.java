package com.iegor.Lectures.Lecture8;

public class Rectangle extends AbstarctFigure{
    private int sideA;
    private int sideB;

    public Rectangle(){
        this(0, 0);
    }

    public Rectangle(int sideA, int sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double perimeter() {
        return 2 * (sideA+sideB);
    }

    @Override
    public double area() {
        return sideA * sideB;
    }

    @Override
    public String toString() {
        return "Rectangle: " + this.perimeter() + this.area();
    }
}
