package com.iegor.Lectures.Lecture7;

import com.iegor.Lectures.Lecture7.Market.Currency;
import com.iegor.Lectures.Lecture7.Market.Product;
import com.iegor.Lectures.Lecture7.Market.ProductList;
import com.iegor.Lectures.Lecture7.People.*;

public class Lecture7 {
    public static void main(String[] args) {
        Currency.usd = 28.00;
        Student st1 = new Student("Tom", 1, 20);
        System.out.println(st1);
        Doctor doc1 = new Doctor("Hause", 66, 60);
        System.out.println(doc1);
        Fighter fight1 = new Fighter("Conan", 30, 75, 60);
        System.out.println(fight1);

        Person p = new Student("Bob", 2, 22);

        Person [] personList = new Person[3];// - moved to PersonList.java
        personList[0] = st1;
        personList[1] = doc1;
        personList[2] = fight1;

        PersonList pList = new PersonList(personList);

        int maxAge = pList.getMaxAge();
        System.out.println(maxAge);

        Person maxAgePerson = pList.getMaxAgePerson();
        System.out.println(maxAgePerson);

        for (Person person : personList) {
            System.out.println(person);
            System.out.println("Discount = " + person.getDiscount());
        }

        ProductList productList = new ProductList();
        productList.add(new Product("Apple", 20, 1));
        productList.add(new Product("Banana", 30, 1));
        productList.add(new Product("Potato", 10, 1));
//        productList.add(new Product("Pear", 15, 1));
        Currency.usd = 30.00;
        System.out.println(productList.getTotalCostWithDiscount(fight1));
        System.out.println(productList.getTotalCostWithDiscount(st1));
        System.out.println(productList.getTotalCostWithDiscount(doc1));
    }
}
