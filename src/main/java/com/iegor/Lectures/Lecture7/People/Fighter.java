package com.iegor.Lectures.Lecture7.People;

public class Fighter extends Person{
    private int power;
    private int defence;

    public Fighter(String name, int age, int power, int defence) {
        super(name, age);
        this.power = power;
        this.defence = defence;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    @Override
    public String toString() {
        return "Fighter{" +
                "name='" + this.getName() + '\'' +
                ", age=" + this.getAge() +
                ", power=" + power +
                ", defence=" + defence +
                '}';
    }
}
