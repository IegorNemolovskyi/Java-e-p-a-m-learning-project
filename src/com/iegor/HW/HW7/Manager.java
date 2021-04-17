package com.iegor.HW.HW7;

import java.math.BigDecimal;

public class Manager extends Employee{
    private int quantity;

    public Manager(String lastName, BigDecimal salary, int clientAmount) {
        super(lastName, salary);
        this.quantity = clientAmount;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public BigDecimal setBonus(BigDecimal bonus) {
        if (bonus == null || bonus.compareTo(BigDecimal.valueOf(0))<0) {
            throw new IllegalArgumentException();
        }
        else if (this.quantity > 100 && this.quantity <= 150)
            this.bonus = bonus.add(new BigDecimal(500));
        else if (this.quantity > 150)
            this.bonus = bonus.add(new BigDecimal(1000));
        else this.bonus = bonus;
        return bonus;
    }
}

