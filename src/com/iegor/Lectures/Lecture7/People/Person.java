package com.iegor.Lectures.Lecture7.People;

public class Person implements DiscountAble{
    private String name;
    private int age;

    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getDiscount(){
        return 1;
    }

    public double getDiscount(double totalCost){
        if (totalCost > 50) return 0.8 * getDiscount();
        else return 1;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
