package com.iegor.Lectures.lecture5;

import java.util.Scanner;

public class lecture5 {
    public static void main(String[] args) {
        String str;
        int[] masInt = {1, 4, 'a'};
        char[] masChar = {50, 54, 's'};

        System.out.println(masInt); // array address
        for (int i = 0; i < masInt.length; i++) {
            System.out.println((masInt[i])); // ascii numbers
            System.out.println((char) masInt[i]); // ascii symbol
        }
        System.out.println(masChar); // ascii symbols

        masInt = getMasInt();

        int sum = getSum(masInt); // get sum of entered array
        System.out.println(sum); // print the result
    }

    private static int[] getMasInt() {
        int[] masInt;
        Scanner sc = new Scanner(System.in); // create array with entered data
        masInt = new int[3];
        for (int i = 0; i < masInt.length; i++) {
            System.out.println("Enter value: ");
            String value = sc.next();
            masInt[i] = value.charAt(0);
        }
        return masInt;
    }

    private static int getSum(int[] masInt) {
        int sum = 0;
        for (int i = 0; i < masInt.length; i++) {
            sum += masInt[i];
        }
        return sum;
    }
}
