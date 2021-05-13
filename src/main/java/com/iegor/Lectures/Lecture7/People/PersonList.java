package com.iegor.Lectures.Lecture7.People;

import com.iegor.Lectures.Lecture7.People.Person;

public class PersonList {
    private Person[] personList;

    public PersonList() {
        this.personList = new Person[3];
    }

    public PersonList(Person[] personList) {
        this.personList = personList;
    }

    public Person getMaxAgePerson() {
        Person maxAgePerson = this.personList[0];
        for (Person person: this.personList) {
            if (maxAgePerson.getAge()<person.getAge())
                maxAgePerson = person;
        }
        return maxAgePerson;
    }

    public int getMaxAge() {
        int maxAge = personList[0].getAge();
        for (int i = 0; i < personList.length; i++) {
            if (maxAge< personList[i].getAge())
                maxAge = personList[i].getAge();
        }
        return maxAge;
    }
}
