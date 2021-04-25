package com.iegor.HW.HW8;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SpecialDeposit extends Deposit {
//    private double percent;

    public SpecialDeposit(BigDecimal amount, int period) {
        super(amount, period);
    }

    @Override
    public BigDecimal income() {
        BigDecimal sum = amount;
        BigDecimal income = sum.subtract(amount);
        if (period <=0 || amount.compareTo(BigDecimal.valueOf(0))<0)
            throw new IllegalArgumentException();
        else for (double i = 1; i <= period ; i++) {
            double percent = i/100;
            sum = sum.multiply(BigDecimal.valueOf(1+percent));
            income = sum.subtract(amount);
        }
        return income.setScale(2,RoundingMode.HALF_EVEN);
    }

    @Override
    public String toString() {
        return "BaseDeposit: " + super.toString() +
                "; Income= " + income();
    }
}
