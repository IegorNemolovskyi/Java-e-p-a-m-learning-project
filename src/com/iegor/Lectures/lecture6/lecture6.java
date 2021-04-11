package com.iegor.Lectures.lecture6;

import com.iegor.Lectures.lecture6.figures.*;

public class lecture6 {
    public static void main(String[] args) {
        Point p = new Point(3,4);
        //p.setX(1);
        //p.setY(2);
        System.out.println("x = " + p.getX());
        System.out.println("y = " + p.getY());
        System.out.println("Point (" + p.getX() + "," + p.getY()+ ")");
        p.print();
        System.out.println(p);

        Point p3 = new Point(2);
        System.out.println("Point (" + p3.getX() + "," + p3.getY()+ ")");
        p3.print();
        System.out.println(p3);

        Point p2 = new Point();
        System.out.println("Point (" + p2.getX() + "," + p2.getY()+ ")");
        p2.print();
        System.out.println(p2);

        Line line1 = new Line(p,p2);
        System.out.println(line1);

        Line line2 = new Line();
        System.out.println(line2);

        System.out.println(line1.getLenght());

        System.out.println(line2.getLenght());

        ListPoint listPoints = new ListPoint();
        listPoints.add(p);
        listPoints.add(p2);
        listPoints.add(p3);
        listPoints.print();
        System.out.println(listPoints.getMaxXCoordinate());
        System.out.println(listPoints.getMaxYCoordinate());
        System.out.println(listPoints.getMaxxCoordinate());
        System.out.println(listPoints.getMaxyCoordinate());

        //ListPoint listPoint2 = new ListPoint();
        //listPoints.add(new Point(p.getX(), p.getY())); // cloned point
        //listPoints.add(new Point(7, 6));
    }
}
