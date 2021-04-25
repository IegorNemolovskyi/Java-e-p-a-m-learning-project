package com.iegor.Lectures.Lecture8;

public abstract class AbstarctFigure {
    public abstract double perimeter ();
    public abstract double area();
    public void show(){
        System.out.println(this.getClass().getSimpleName());
        System.out.println("Perimeter = " + this.perimeter());
        System.out.println("Area = " + this.area());
    }
}
