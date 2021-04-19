package com.iegor.HW.HW8;

import java.math.BigDecimal;

public abstract class Deposit {
    private BigDecimal depositAmount;
    private int depositPeriod;
    protected BigDecimal income;

    public Deposit(BigDecimal depositAmount, int depositPeriod) {
        this.depositAmount = depositAmount;
        this.depositPeriod = depositPeriod;
    }

    public Deposit() {
        this.depositAmount = depositAmount;
        this.depositPeriod = depositPeriod;
    }

    public BigDecimal Amount() {
        return depositAmount;
    }


    public int Period() {
        return depositPeriod;
    }

    public abstract BigDecimal Income (BigDecimal Amount, int Period);

    public BigDecimal getIncome() {
        return income;
    }


}
