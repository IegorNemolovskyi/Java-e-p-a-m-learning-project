package com.iegor.HW6;

public class Rectangle {
    private double sideA;
    private double sideB;

    public Rectangle(double a, double b) {
        if (a <= 0 || b <= 0)
            throw new IllegalArgumentException();
        this.sideA = a;
        this.sideB = b;
    }

    public Rectangle(double a) {
        this(a, 5);
    }

    public Rectangle() {
        this(4, 3);
    }

    public double getSideA() {
        return this.sideA;
    }

    public double getSideB() {
        return this.sideB;
    }

    public double area() {
        double area = getSideA() * getSideB();
        return area;
    }

    public double perimeter() {
        double perimeter = 2 * sideA + 2 * sideB;
        return perimeter;
    }

    public boolean isSquare() {
        return sideA == sideB;
    }

    public void replaceSides() {
        double temp = sideA;
        sideA = sideB;
        sideB = temp;
    }

    public void print() {
        System.out.println("Rectangle with sides: A = " + this.getSideA() + ", B = " + this.getSideB() + ";");
    }

    @Override
    public String toString() {
        return "Rectangle(" +
                "x=" + sideA +
                ", y=" + sideB +
                ')';
    }


}
