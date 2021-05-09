package com.iegor.Lectures.Lecture11;

import java.util.*;

class Ship{
    private String name;
    private int year;
    static class Point{
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Point point = (Point) o;
            return x == point.x && y == point.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }

        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }
    private Point point;

    public Ship(String name, int year, Point point) {
        this.name = name;
        this.year = year;
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ship ship = (Ship) o;
        return year == ship.year && name.equals(ship.name);// && point.equals(ship.point);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year);//, point);
    }

    @Override
    public String toString() {
        return "Ship{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", point=" + point +
                '}';
    }
}

class ListNode{
    Ship data;
    ListNode next;

    public ListNode(Ship data) {
        this.data = data;
        next = null;
    }
}

class ListLinkedShip implements Iterable<Ship>{
    private ListNode head;

    public ListLinkedShip() {
        head = null;
    }
    void addFirst(Ship ship){
        ListNode node = new ListNode(ship);
        if (head == null) {
            head = node;
        }
        else {
            node.next = head;
            head = node;
        }
    }
    void print(){
        ListNode iter = head;
        while (iter != null){
            System.out.println(iter.data);
            iter = iter.next;
        }
    }

    @Override
    public Iterator<Ship> iterator() {
        return new ListShipIterator(head);
    }
    class ListShipIterator implements Iterator<Ship>{
        ListNode iter;

        public ListShipIterator(ListNode head) {
            this.iter = head;
        }

        @Override
        public boolean hasNext() {
            return iter != null;
        }

        @Override
        public Ship next() {
            Ship ship = iter.data;
            iter = iter.next;
            return ship;
        }
    }
}

public class Lecture11 {
    public static void main(String[] args) {
        testEquals();
    ListLinkedShip shipList = new ListLinkedShip();
    shipList.addFirst(new Ship("Odessa1", 1991, new Ship.Point(1,1)));
    shipList.addFirst(new Ship("Odessa2", 1992, new Ship.Point(1,2)));
    shipList.addFirst(new Ship("Odessa3", 1993, new Ship.Point(1,3)));
    shipList.addFirst(new Ship("Odessa4", 1994, new Ship.Point(1,4)));
    shipList.addFirst(new Ship("Odessa5", 1995, new Ship.Point(1,5)));
    shipList.print();
        for (Ship ship: shipList) {
            System.out.println(ship.toString());
        }

        Iterator<Ship> iterShip = shipList.iterator();
        while (iterShip.hasNext()){
            Ship ship = iterShip.next();
        }
    }

    private static void testEquals() {
        Ship ship1 = new Ship("Odessa", 1990, new Ship.Point(1,3));
        Ship ship2 = new Ship("Odessa", 1990, new Ship.Point(1,5));
        System.out.print("Ship 1 and Ship 2 are identical: ");
        System.out.println(ship1 == ship2);
        System.out.print("Ship 1 and Ship 2 are equal: ");
        System.out.println(ship1.equals(ship2));

        Set<Ship> ships = new HashSet<>();
        ships.add(ship1);
        ships.add(new Ship("Kherson", 1995, new Ship.Point(2,5)));
        ships.add(ship2);
        System.out.println(ships);
        System.out.print("Ship list contains Ship: ");
        System.out.println(ships.contains(new Ship("Odessa", 1990, null)));
        ships.remove(new Ship("Odessa", 1990, null));
        System.out.println(ships);
        System.out.print("Ship list contains Ship when removed: ");
        System.out.println(ships.contains(new Ship("Odessa", 1990, null)));
    }
}
