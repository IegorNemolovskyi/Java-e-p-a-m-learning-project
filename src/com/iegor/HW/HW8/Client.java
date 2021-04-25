package com.iegor.HW.HW8;

import com.iegor.Lectures.Lecture7.Market.Product;

import java.math.BigDecimal;

public class Client {
    private Deposit [] deposits;
    private int count = 0;

    public Client(Deposit[] deposits) {
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
}

