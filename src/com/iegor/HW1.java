package com.iegor;

public class HW1 {
    public static int hw1task1(int n) {
        // For a given integer n calculate the value which is equal to a:
        // • squared number, if its value is strictly positive; 
        // • modulus of a number, if its value is strictly negative;
        // • zero, if the integer n is zero.  
        // Example:
        // n = 4   -> result =  16
        // n = -5  ->  result =  5
        // n = 0   ->  result = 0
        if (n > 0)
            return n * n;
        else if (n < 0)
            return Math.abs(n);
        else
            return 0;
    }

    public static int hw1task2(int n) {
        // Find the maximum integer, that can be obtained by permutation of numbers of an arbitrary three-digit positive integer n (100<=n<=999).
        // Example:
        // n = 165  -> result =  651
        // n = 123 -> result = 321
        int result;
        if (n >= 100 && n <= 999) {
            int n1 = n / 100;
            int n2 = n / 10 - (n1 * 10);
            int n3 = n % 10;
            int max = Math.max(n1, Math.max(n2, n3));
            int min = Math.min(n1, Math.min(n2, n3));
            int mid = n1 + n2 + n3 - (max + min);
            result = max * 100 + mid * 10 + min;
        } else {
            result = 0;
        }
        return result;
    }
    
}
