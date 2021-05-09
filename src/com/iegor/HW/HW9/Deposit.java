package com.iegor.HW.HW9;


import java.math.BigDecimal;

public abstract class Deposit implements Comparable<Deposit>, Prolongable{
    public final BigDecimal amount;
    public final int period;

    @Override
    public int compareTo(Deposit o) {
        return (this.getAmount().add(this.income()).compareTo(o.getAmount().add(o.income())));
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public int getPeriod() {
        return period;
    }

    public Deposit(BigDecimal amount, int period) {
        this.amount = amount;
        this.period = period;
    }

    public abstract BigDecimal income();

    @Override
    public String toString() {
        return "Base amount = " + getAmount() +
                "; Period = " + getPeriod();
    }
}
