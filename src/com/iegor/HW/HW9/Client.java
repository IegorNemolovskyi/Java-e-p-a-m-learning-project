package com.iegor.HW.HW9;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class Client implements Iterable<Deposit>{
    private Deposit[] deposits;
    private int count = 0;

    public Client(Deposit[] deposits) { // e-mentor>> public Client() {
        this.deposits = new Deposit[10];
    }

    public boolean addDeposit(Deposit deposit) {
        for (int i = 0; i < deposits.length; i++) {
            if (deposits[i] == null) {
                deposits[count] = deposit;
                count++;
                return true;
            }
        }
        return false;
    }

    public BigDecimal totalIncome() {
        BigDecimal totalIncome = new BigDecimal(0);
        for (int i = 0; i < deposits.length; i++) {
            if (deposits[i] == null) break;
            totalIncome = totalIncome.add(deposits[i].income());
        }
        return totalIncome;
    }

    public BigDecimal maxIncome(){
        BigDecimal maxIncome = this.deposits[0].income();
        for (int i = 0; i < count; i++) {
            if (maxIncome.compareTo(this.deposits[i].income())<0){
                maxIncome = deposits[i].income();
            }
        }
        return maxIncome;
    }

    public BigDecimal getIncomeByNumber(int number) {
        if (number <= count){
            return deposits[number].income();
        }
        else return BigDecimal.ZERO;
    }
    public void sortDeposits(){
        Arrays.sort(deposits, Comparator.nullsFirst(Comparator.reverseOrder()));
        System.out.println(Arrays.toString(deposits));
    }

    @Override
    public Iterator<Deposit> iterator() {
        return Arrays.asList(deposits).iterator();
    }

    public int countPossibleToProlongDeposit() {
        int possibleToProlongCounter = 0;
        for (int i = 0; i < count; i++) {
            if (deposits[i].canToProlong()) {
                possibleToProlongCounter++;
            }
        }
        return possibleToProlongCounter;

    }

}

