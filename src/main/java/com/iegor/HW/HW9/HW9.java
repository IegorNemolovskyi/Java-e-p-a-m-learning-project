package com.iegor.HW.HW9;
/**
 Task
 To add the following new functionalities to the project created in task 7:
 To create interface Prolongable (prolonging deposit) and declare within it method
 canToProlong without parameters that returns logic value true or false, depending
 on the fact whether this specific deposit can be prolonged or not.
 To implement interface Prolongable in classes SpecialDeposit and LongDeposit.
 In addition, special deposit (SpecialDeposit) can be prolonged only when more than
 1000 UAH were deposited, and long-term deposit (LongDeposit) can be prolonged
 if the period of deposit is no longer than 3 years.
 To implement standard generic interface Comparable in abstract class
 Deposit. Total sum amount (sum deposited plus interest during entire period) should
 be considered as comparison criteria of Deposit instances.
 To implement additionally in class Client:
 • interface Iterable.
 • Method sortDeposits, which performs deposits sorting in array deposits in
 descending order of total sum amount (sum deposited plus interest during entire period).
 • Method countPossibleToProlongDeposit, which returns integer – amount
 of current client’s deposits that can be prolonged.
**/

import java.math.BigDecimal;
import java.util.Arrays;

public class HW9 {
    public static void main(String[] args) {
        Deposit dep1 = new BaseDeposit(BigDecimal.valueOf(1000), 3);
        Deposit dep2 = new SpecialDeposit(BigDecimal.valueOf(1000), 3);
        Deposit dep3 = new LongDeposit(BigDecimal.valueOf(1000), 7);


        System.out.println(dep1);
        System.out.println(dep2);
        System.out.println(dep3);

        Deposit[] deposits = new Deposit[] {dep1, dep2, dep3};
//        System.out.println(Arrays.toString(deposits));

        Client client = new Client(deposits);
        client.addDeposit(dep1);
        client.addDeposit(dep2);
        client.addDeposit(dep3);
//        System.out.println(client.addDeposit(dep1));
//        System.out.println(client.addDeposit(dep2));
//        System.out.println(client.addDeposit(dep3));
        System.out.print("Total income from deposits is: ");
        System.out.println(client.totalIncome());
        System.out.print("Max income from deposits is: ");
        System.out.println(client.maxIncome());
        System.out.print("Deposit income value by number: ");
        System.out.println(client.getIncomeByNumber(1));

        Prolongable prolongable1 = new SpecialDeposit(BigDecimal.valueOf(1000), 6);
        Prolongable prolongable2 = new LongDeposit(BigDecimal.valueOf(1000), 35);
        System.out.print(prolongable1 + " can be prolonged: ");
        System.out.println(prolongable1.canToProlong());
        System.out.print(prolongable2 + " can be prolonged: ");
        System.out.println(prolongable2.canToProlong());

//        Arrays.sort(deposits);
        System.out.println(Arrays.toString(deposits));
//        client.sortDeposits();
        System.out.print("Can to prolong Clients deposits: ");
        System.out.println(client.countPossibleToProlongDeposit());

    }
}
