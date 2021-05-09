package com.iegor.HW.HW9;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BaseDeposit extends Deposit implements Prolongable{

    public BaseDeposit(BigDecimal amount, int period) {
        super(amount, period);
    }
    @Override
    public BigDecimal income() {
        BigDecimal income;
        double percent = 5;
        if (period <=0 || amount.compareTo(BigDecimal.valueOf(0))<0)
            throw new IllegalArgumentException();
        else income = amount.multiply(BigDecimal.valueOf(Math.pow((1+percent/100),period))).subtract(amount).subtract(BigDecimal.valueOf(0.001));
        return income.setScale(2, RoundingMode.HALF_EVEN);
    }

    @Override
    public String toString() {
        return "BaseDeposit: " + super.toString() +
                "; Income= " + income();
    }

    public boolean canToProlong() {
        return false;
        }
}
