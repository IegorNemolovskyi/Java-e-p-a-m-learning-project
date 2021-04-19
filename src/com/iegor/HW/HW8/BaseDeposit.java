package com.iegor.HW.HW8;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BaseDeposit extends Deposit{
    private BigDecimal interest;

    public BaseDeposit(BigDecimal depositAmount, int depositPeriod) {
        super(depositAmount, depositPeriod);
    }

    @Override
    public BigDecimal Income(BigDecimal Amount, int Period) {
        if (Period <=0 || Amount.compareTo(BigDecimal.valueOf(0))<0)
            throw new IllegalArgumentException();
        else interest = Amount().multiply(BigDecimal.valueOf(Math.pow(1.05,Period))).subtract(Amount());
//            return interest.setScale(2,1);
        return interest.setScale(2, RoundingMode.CEILING);
    }

}
