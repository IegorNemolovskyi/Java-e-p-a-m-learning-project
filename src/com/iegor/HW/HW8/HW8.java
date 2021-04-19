package com.iegor.HW.HW8;

import com.iegor.HW.HW6.ArrayRectangles;

import java.math.BigDecimal;

public class HW8 {
    public static void main(String[] args) {
        Deposit dep1 = new BaseDeposit(BigDecimal.valueOf(1000), 2);
        Deposit dep2 = new SpecialDeposit(BigDecimal.valueOf(1000), 2);
        Deposit dep3 = new LongDeposit(BigDecimal.valueOf(1000),7);



        System.out.println("BaseDeposit: Base amount = " + dep1.Amount() + "; Period = " + dep1.Period() + "; Income = " + dep1.Income(BigDecimal.valueOf(1000), 2));
        System.out.println("SpecialDeposit: Base amount = " + dep2.Amount() + "; Period = " + dep2.Period() + "; Income = " + dep2.Income(BigDecimal.valueOf(1000), 2));
        System.out.println("LongDeposit: Base amount = " + dep3.Amount() + "; Period = " + dep3.Period() + "; Income = " + dep3.Income(BigDecimal.valueOf(1000), 7));

        // ArrayRectangle
        Client client = new Client();
//        client.AddDeposit(dep1);
//        client.AddDeposit(dep2);
//        client.AddDeposit(dep3);
        System.out.println(client.AddDeposit(dep1));
        System.out.println(client.AddDeposit(dep2));
        System.out.println(client.AddDeposit(dep3));
        System.out.println(client.TotalIncome(BigDecimal.valueOf(1000),2));


    }
}
