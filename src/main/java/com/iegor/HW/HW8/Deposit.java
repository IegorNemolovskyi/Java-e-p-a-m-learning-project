package com.iegor.HW.HW8;


import java.math.BigDecimal;

public abstract class Deposit {
    public final BigDecimal amount;
    public final int period;

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
