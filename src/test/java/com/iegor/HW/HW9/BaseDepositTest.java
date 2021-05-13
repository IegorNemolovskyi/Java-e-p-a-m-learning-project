package com.iegor.HW.HW9;

import org.testng.Assert;
import org.testng.annotations.*;

import java.math.BigDecimal;

public class BaseDepositTest {

    @Test
    public void testIncome() {
        Assert.assertEquals(new BaseDeposit(BigDecimal.valueOf(1000), 3).income(),BigDecimal.valueOf(157.62));
    }

    @Test
    public void testCanToProlong() {
        Assert.assertEquals(new BaseDeposit(BigDecimal.valueOf(1000), 3).canToProlong(),false);
    }
}