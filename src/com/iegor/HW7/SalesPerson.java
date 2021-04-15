package com.iegor.HW7;

import java.math.BigDecimal;

public class SalesPerson extends Employee{
    private int percent;

    public SalesPerson(String lastName, BigDecimal salary, int percent) {
        super(lastName, salary);
        this.percent = percent;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    @Override
    public BigDecimal setBonus(BigDecimal bonus) {
        if (bonus == null || bonus.compareTo(BigDecimal.valueOf(0))<0) {
            throw new IllegalArgumentException();
        }
        else if (this.percent > 100 && this.percent <= 200)
            this.bonus = bonus.multiply(BigDecimal.valueOf(2));
        else if (this.percent > 200)
            this.bonus = bonus.multiply(BigDecimal.valueOf(3));
        else this.bonus = bonus;
        return bonus;
    }
}