package com.iegor.HW.HW9;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class LongDeposit extends Deposit implements Prolongable {


    public LongDeposit(BigDecimal amount, int period) {
        super(amount, period);
    }

    @Override
    public BigDecimal income() {
        BigDecimal sum = amount;
        BigDecimal income = sum.subtract(amount);
        if (period <=0 || amount.compareTo(BigDecimal.valueOf(0))<0)
            throw new IllegalArgumentException();
        else if (period>0 && period<=6){
            return (BigDecimal.valueOf(0));
        }
        for (double i = 7; i <= period ; i++) {
            double percent = 0.15;
            sum = sum.multiply(BigDecimal.valueOf(1+percent));
            income = sum.subtract(amount);
        }
        return income.setScale(2,RoundingMode.HALF_EVEN);
    }

    @Override
    public String toString() {
        return "Long Deposit: " + super.toString() +
                "; Income= " + income();
    }

    @Override
    public boolean canToProlong() {
        int maxDepositPeriod = 36;
        if (period >= maxDepositPeriod){
            return false;
        }
        return true;
    }
}
