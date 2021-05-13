package com.iegor.HW.HW9;

import org.testng.Assert;
import org.testng.annotations.*;

import java.math.BigDecimal;

public class SpecialDepositTest {
    @Test
    public void testIncome() {
        Assert.assertEquals(new SpecialDeposit(BigDecimal.valueOf(1000), 3).income(), BigDecimal.valueOf(61.11));
    }

    @Test
    public void testCanToProlong1000() {
        Assert.assertEquals(new SpecialDeposit(BigDecimal.valueOf(1000), 3).canToProlong(),false);
    }

    @Test
    public void testCanToProlong1001() {
        Assert.assertEquals(new SpecialDeposit(BigDecimal.valueOf(1001), 3).canToProlong(),true);
    }
}