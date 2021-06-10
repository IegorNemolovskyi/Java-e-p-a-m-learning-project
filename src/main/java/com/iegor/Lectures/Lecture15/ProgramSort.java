package com.iegor.Lectures.Lecture15;

import java.util.Arrays;
import java.util.Comparator;

public class ProgramSort {
    public static void main(String[] args) {
        int[] mas = {1, 12, 3, 14, 5, 3};
        Arrays.sort(mas);
        System.out.println(Arrays.toString(mas));

        Country[] countries = {
                new Country("A", 222, 555),
                new Country("C", 111, 222),
                new Country("B", 333, 444),
        };
//        Arrays.sort(countries, new Comparator<Country>() {
//            @Override
//            public int compare(Country o1, Country o2) {
//                return (int) (o1.getArea()-o2.getArea());
//            }
//        });
        Arrays.sort(countries, (o1, o2) -> (int) (o1.getArea()- o2.getArea()));
        System.out.println(Arrays.toString(countries));
//        Arrays.sort(countries, (o1, o2) -> (o1.getName().compareTo(o2.getName())));
        Arrays.sort(countries, Comparator.comparing(Country::getName));
        System.out.println(Arrays.toString(countries));
    }

    static class Country implements Comparable<Country>{
        private String name;
        private int count;
        private double area;

        public Country(String name, int count, double area) {
            this.name = name;
            this.count = count;
            this.area = area;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public double getArea() {
            return area;
        }

        public void setArea(double area) {
            this.area = area;
        }

        @Override
        public String toString() {
            return "\nCountry{" +
                    "name='" + name + '\'' +
                    ", count=" + count +
                    ", area=" + area +
                    '}';
        }

        @Override
        public int compareTo(Country o) {
            return this.getCount()-o.getCount();
        }
    }
}
