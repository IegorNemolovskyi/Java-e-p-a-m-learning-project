package com.iegor.Lectures.Lecture14;

import java.io.Serializable;

public class Droid implements Serializable {
    private String name;
    private int armorAmount;
    private int weaponsAmount;
//    private transient Army aray;
    private int weaponPower;

    public Droid(String name, int armorAmount, int weaponsAmount, int weaponPower) {
        this.name = name;
        this.armorAmount = armorAmount;
        this.weaponsAmount = weaponsAmount;
        this.weaponPower = weaponPower;
    }

    public  Droid(){}



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArmorAmount() {
        return armorAmount;
    }

    public void setArmorAmount(int armorAmount) {
        this.armorAmount = armorAmount;
    }

    public int getWeaponsAmount() {
        return weaponsAmount;
    }

    public void setWeaponsAmount(int weaponsAmount) {
        this.weaponsAmount = weaponsAmount;
    }

    public int getWeaponPower() {
        return weaponPower;
    }

    public void setWeaponPower(int weaponPower) {
        this.weaponPower = weaponPower;
    }

    @Override
    public String toString() {
        return name + ";" +
                armorAmount + ";" +
                weaponsAmount + ";" +
                weaponPower;
    }

    public String toStringCSV() {
        return name + ";" +
                armorAmount + ";" +
                weaponsAmount + ";" +
                weaponPower;
    }
    public String toStringTSV() {
        return name + " " +
                armorAmount + " " +
                weaponsAmount + " " +
                weaponPower;
    }
}
