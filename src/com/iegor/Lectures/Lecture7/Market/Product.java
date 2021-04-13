package com.iegor.Lectures.Lecture7.Market;

public class Product {
    private String name;
    private double price;
    private int count;

    public Product(String name, double price, int count) {
        this.name = name;
        this.setPrice(price);
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price*1.20*Currency.usd;
    }

    public void setPrice(double price) {
        this.price = price/Currency.usd;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", count=" + count +
                '}';
    }
}
