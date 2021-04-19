package com.iegor.HW.HW8;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class LongDeposit extends Deposit{
    private double percent;
    private BigDecimal sum;
    private BigDecimal interest;

    public LongDeposit(BigDecimal depositAmount, int depositPeriod) {
        super(depositAmount, depositPeriod);
    }

    @Override
    public BigDecimal Income(BigDecimal Amount, int Period) {
        sum = Amount;
        if (Period <=0 || Amount.compareTo(BigDecimal.valueOf(0))<0)
            throw new IllegalArgumentException();
        else if (Period>0 && Period<=6){
            return Amount;
        }
        for (double i = 7; i <= Period ; i++) {
            percent = 0.15;
            sum = sum.multiply(BigDecimal.valueOf(1+percent));
            interest = sum.subtract(Amount);
        }
//        return interest.setScale(2,1);
        return interest.setScale(2,RoundingMode.CEILING);
    }
}
