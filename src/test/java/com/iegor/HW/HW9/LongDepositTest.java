package com.iegor.HW.HW9;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.math.BigDecimal;

public class LongDepositTest {

    @Test
    public void testIncome() {
        Assert.assertEquals(new LongDeposit(BigDecimal.valueOf(1000), 35).income(), BigDecimal.valueOf(56575.45));
    }

    @Test
    public void testCanToProlongPeriod35() {
        Assert.assertEquals(new LongDeposit(BigDecimal.valueOf(1000), 35).canToProlong(),true);
    }

    @Test
    public void testCanToProlongPeriod36() {
        Assert.assertEquals(new LongDeposit(BigDecimal.valueOf(1000), 36).canToProlong(),false);
    }
}