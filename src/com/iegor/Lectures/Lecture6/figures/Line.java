package com.iegor.Lectures.Lecture6.figures;

public class Line {
    private Point begin;
    private Point end;

    public Line() {
        this.begin = new Point(3,3);
        this.end = new Point(5,5);
    }

    public Line(Point begin) {
        this.begin = begin;
        this.end = new Point(1, 3);
    }

    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public Point getBegin() {
        return begin;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public double getLenght(){
        return Math.sqrt(Math.pow(begin.getX()-end.getX(), 2) + Math.pow(begin.getY()-end.getY(), 2));
    }

    @Override
    public String toString() {
        return "Line{" +
                "begin=" + begin +
                ", end=" + end +
                '}';
    }
}
