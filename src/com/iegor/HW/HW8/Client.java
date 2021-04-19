package com.iegor.HW.HW8;

import java.math.BigDecimal;

public class Client {
    private Deposit[] deposits;
    private int count;


    public Client() {
        this.deposits = new Deposit[3];
        this.count = 0;
    }

    public boolean AddDeposit(Deposit deposit) {
        for (int i = 0; i < deposits.length; i++) {
            if (deposits[i] == null) {
                deposits[count] = deposit;
                count++;
                return true;
            }
        }
        return false;
    }

    public BigDecimal TotalIncome(BigDecimal Amount, int Period){
        BigDecimal sum = new BigDecimal(0);
        for (int i = 0; i < deposits.length; i++) {
            sum=sum.add(deposits[i].Income(Amount, Period));
        }
        return sum;
    }
//    public double getRoomsArea(){
//        double sum = 0;
//        for (int i = 0; i < rooms.length; i++) {
//            sum+=rooms[i].getArea();
//        }
//        return sum;
//    }



}

