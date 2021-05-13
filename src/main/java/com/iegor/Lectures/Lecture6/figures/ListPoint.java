package com.iegor.Lectures.Lecture6.figures;

public class ListPoint {
    private Point [] points;
    private int count;
    public ListPoint(){
        points = new Point[10];
        count = 0;
    }
    public void add(Point p){
        points[count] = p;
        count++;

    }
    public void print(){
        for (int i = 0; i < count; i++) {
            System.out.println(points[i]);
        }
    }

    public int getMaxXCoordinate (){
        Point maxXCoordinate = points[0];
        for (int i = 0; i < count; i++) {
            if (maxXCoordinate.getX()<points[i].getX())
                maxXCoordinate = points[i];
        }
        return maxXCoordinate.getX();
    }

    public int getMaxYCoordinate (){
        Point maxYCoordinate = points[0];
        for (int i = 0; i < count; i++) {
            if (maxYCoordinate.getY()<points[i].getY())
                maxYCoordinate = points[i];
        }
        return maxYCoordinate.getY();
    }

    public Point getMaxxCoordinate (){
        Point maxXCoordinate = points[0];
        for (int i = 0; i < count; i++) {
            if (maxXCoordinate.getX()<points[i].getX())
                maxXCoordinate = points[i];
        }
        return maxXCoordinate;
    }

    public Point getMaxyCoordinate (){
        Point maxYCoordinate = points[0];
        for (int i = 0; i < count; i++) {
            if (maxYCoordinate.getY()<points[i].getY())
                maxYCoordinate = points[i];
        }
        return maxYCoordinate;
    }


}
