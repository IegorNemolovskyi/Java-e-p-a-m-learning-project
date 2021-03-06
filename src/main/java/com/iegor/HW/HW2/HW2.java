package com.iegor.HW.HW2;

public class HW2 {
    
    public static int hw2task1(int value) {
        // For a positive integer n calculate the result value, which is equal to the sum of the odd numbers of n.
        // Example,
        // n = 1234 result = 4
        // n = 246 result = 0
        if (value > 0) {
            int result = 0;
            for (int i = value; i > 0; i /= 10) {
                if (i % 2 != 0) {
                    result += i % 10;
                }
            }
            return result;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static int hw2task2(int value) {
        // For a positive integer n calculate the result value, which is equal to the amount of the “1” in the binary
        // representation of n.
        // Example,
        // n = 14 = 1110 result = 3
        // n = 128 = 1000 0000 result = 1
        if (value > 0) {
            int result = 0;
            while (value > 0) {
                result += value & 1;
                value >>= 1;
            }
            return result;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static int hw2task3(int value) {
        // For a positive integer n, calculate the result value, which is equal to the sum of the first n Fibonacci numbers.
        // Note. Fibonacci numbers are a series of numbers in which each next number is equal to the sum of the two
        // preceding ones: 0, 1, 1, 2, 3, 5, 8, 13... (the value of the fist element in Fibonacci numbers is "0", the values of the second and the third elements are equal to "1", for other elements use the formula F(n)=F(n-1)+F(n-2))
        // Example,
        // n = 8 result = 33
        // n = 11 result = 143
        if (value == 1)
            return 0;
        else if (value > 0) {
            int f[] = new int[value + 1];
            f[0] = 0;
            f[1] = 1;
            int result = f[0] + f[1];
            for (int i = 2; i <= value - 1; i++) {
                f[i] = f[i - 1] + f[i - 2];
                result += f[i];
            }
            return result;
        } else {
            throw new IllegalArgumentException();
        }
    }
    
}
