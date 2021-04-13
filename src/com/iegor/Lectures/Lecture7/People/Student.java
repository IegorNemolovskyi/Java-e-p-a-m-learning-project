package com.iegor.Lectures.Lecture7.People;

public class Student extends Person{
    //private String name; - moved to Person.class
    private int groupId;
    //private int age; - moved to Person.class

    public Student(String name, int groupId, int age) {
        super(name, age);
//        this.name = name; - replaced with super()
        this.groupId = groupId;
//        this.age = age; - replaced with super()
    }

//    public String getName() { - moved to Person.class
//        return name;
//    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

//    public int getAge() { - moved to Person.class
//        return age;
//    }

//    public void setAge(int age) { - moved to Person.class
//        this.age = age;
//    }


    @Override
    public double getDiscount() {
        return 0.75;
    }

    @Override
    public void setAge(int age) {
        if (16<age && age<25)
        super.setAge(age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + super.getName() + '\'' +
                ", groupId=" + groupId +
                ", age=" + super.getAge() +
                '}';
    }
}
