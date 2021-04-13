package com.iegor.Lectures.Lecture6.figures;

public class Point {
    private int x;
    private int y;

    public Point() {
//        this.x = 0;
//        this.y = 0;
        this(0, 0);
    }

    public Point(int x) {
//        this.x = x;
//        this.y = 5;
        this(x,10);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        if (x > 0) this.x = x;
        else
            //this.x = 0;
            throw new IllegalArgumentException();
    }

    public int getX() {
        return this.x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return this.y;
    }

    public void print(){
        System.out.println("Point method2 (" + this.getX() + "," + this.getY()+ ")");
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
