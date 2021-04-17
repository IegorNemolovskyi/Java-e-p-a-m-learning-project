package com.iegor.Lectures.Lecture8.hotels;

public class HotelRooms {
    public static void printRoomsArea(HotelRoom[] rooms) {
        for (HotelRoom room: rooms) {
            System.out.println(room.getArea());
        }
    }
}
