package com.iegor.Lectures.Lecture7.People;

public class Doctor extends Person{
    private int licenseId;

    public Doctor(String name, int licenseId, int age) {
        super(name, age);
        this.licenseId = licenseId;
    }

    public int getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(int licenseId) {
        this.licenseId = licenseId;
    }

    public void setAge(int age) {
        if (30<age && age<70)
        super.setAge(age);
    }

//    @Override
//    public String toString() {
//        return "Doctor{" +
//                "name='" + name + '\'' +
//                ", licenseId=" + licenseId +
//                ", age=" + age +
//                '}';
//    }


    @Override
    public double getDiscount() {
        return 0.5;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "licenseId=" + licenseId +
                "} " +super.toString();
    }
}
