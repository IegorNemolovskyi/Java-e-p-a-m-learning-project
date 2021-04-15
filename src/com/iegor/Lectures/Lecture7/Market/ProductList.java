package com.iegor.Lectures.Lecture7.Market;

import com.iegor.Lectures.Lecture7.People.DiscountAble;
//import com.iegor.Lectures.Lecture7.People.Person;

public class ProductList {
    private Product [] products;
    private int count;

    public ProductList(Product[] products) {
        this.products = products;
    }

    public ProductList() {
        this.products = new Product[10];
    }

    public void add(Product p) {
        products[count++]=p;
    }

    private double getTotalCost(){
        double sum = 0;
        for (Product p: products) {
            if (p == null) break;
                sum+=p.getPrice();
        }
        return sum;
    }

    public double getTotalCostWithDiscount(DiscountAble discount){
        double totalCost = getTotalCost();
        return totalCost * discount.getDiscount(totalCost);
    }

}
