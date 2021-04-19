package com.iegor.HW.HW8;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class SpecialDeposit extends Deposit{
    private double percent;
    private BigDecimal sum;
    private BigDecimal interest;

    public SpecialDeposit(BigDecimal depositAmount, int depositPeriod) {
        super(depositAmount, depositPeriod);
    }

    @Override
    public BigDecimal Income(BigDecimal Amount, int Period) {
        sum = Amount;
        if (Period <=0 || Amount.compareTo(BigDecimal.valueOf(0))<0)
            throw new IllegalArgumentException();
        else for (double i = 1; i <= Period ; i++) {
            percent = i/100;
            sum = sum.multiply(BigDecimal.valueOf(1+percent));
            interest = sum.subtract(Amount);
        }
//        return interest.setScale(2,1);
//        return interest.round(new MathContext(0, RoundingMode.CEILING ));
        return interest.setScale(2,RoundingMode.CEILING);
    }

//    public BigDecimal getInterest() {
//        return interest;
//    }
}
