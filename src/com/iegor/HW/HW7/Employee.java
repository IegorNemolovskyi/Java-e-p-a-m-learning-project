package com.iegor.HW.HW7;

import java.math.BigDecimal;

public abstract class Employee {
    private String lastName;
    private BigDecimal salary;
    protected BigDecimal bonus = new BigDecimal(10);

    public Employee(String lastName, BigDecimal salary) {
        super();
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getLastName() {
        return lastName;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        if (salary.compareTo(BigDecimal.valueOf(0))<0){
            throw new IllegalArgumentException();
        }
        else this.salary = salary;
    }

    public BigDecimal getBonus() {
        return bonus;
    }

    public abstract BigDecimal setBonus(BigDecimal bonus);

    public BigDecimal toPay() {
        if (salary == null || bonus == null || bonus.compareTo(BigDecimal.valueOf(0))<0) {
            throw new IllegalArgumentException();
        }
        else return getSalary().add(bonus);
    }

    @Override
    public String toString() {
        return getLastName() + "; " + getSalary() + "; " + getBonus() + "; " + toPay();
    }
}
