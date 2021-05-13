package com.iegor.Lectures.Lecture8.hotels;

public class HotelRoom extends AbstractRoom{
    private int number;
    private Hall hall;
    private Bathroom bathroom;
    private Room [] rooms;

    public HotelRoom(int number, Hall hall, Bathroom bathroom, Room[] rooms) {
        super(0);
        this.number = number;
        this.hall = hall;
        this.bathroom = bathroom;
        this.rooms = rooms;
    }

    public HotelRoom(int number, double hallArea, double bathroomArea, double ... roomsArea) {
        super(0);
        this.number = number;
        this.hall = new Hall(hallArea);
        this.bathroom = new Bathroom(bathroomArea);
        rooms = new Room[roomsArea.length];
        for (int i = 0; i < roomsArea.length; i++) {
            rooms[i] = new Room(roomsArea[i]);
        }
    }

    public HotelRoom(int number) {
        super(0);
        this.number = number;
        this.hall = new Hall(5);
        this.bathroom = new Bathroom(3);
        rooms = new Room[]{new Room(10)};
    }

    public double getRoomsArea(){
        double sum = 0;
        for (int i = 0; i < rooms.length; i++) {
            sum+=rooms[i].getArea();
        }
        return sum;
    }

    public double getArea (){
        return hall.getArea() + bathroom.getArea() + getRoomsArea();
    }
}
