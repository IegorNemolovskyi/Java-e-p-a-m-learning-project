package com.iegor;

import java.util.Arrays;

public class HomeWork {
    public static void main(String[] args) {
        // System.out.println(hw1task1(4));
        // System.out.println(hw1task2(153));
        // System.out.println(hw2task1(10101));
        // System.out.println(hw2task2(11));
        // System.out.println(hw2task3(4));
        // Array data
        // one dimension array
        int [] nums;
        nums = new int [] {10, 10, 10};
        // System.out.println(Arrays.toString(nums)); //to print an one domension array
        // two dimension array
        int[][] numsM;
        numsM = new int[][]{{2, 4, 3, 3}, {5, 7, 8, 5}, {2, 4, 3, 3}, {5, 7, 8, 5}};
        // >>Home work lesson 3 task 1: start       
        // hw3task1(nums);
        // System.out.println(Arrays.toString(nums));
        // >>Home work lesson 3 task 1: end
        // >>Home work lesson 3 task 2: start
        hw3task2(nums);
        System.out.println(hw3task2(nums));
        // >>Home work lesson 3 task 2: end
        // >>Home work lesson 3 task 3: start
        System.out.println(Arrays.deepToString(numsM));
        hw3task3(numsM);
        System.out.println(Arrays.deepToString(numsM)); //to print a two domension array
        // >>Home work lesson 3 task 3: end
    }


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

    public static void hw3task1(int[] nums) {
        // In a given array of integers nums swap values of the first and the last array elements, the second and the penultimate etc., if the two exchanged values are even.
        // Example:
        // {10, 5, 3, 4} =>  {4, 5, 3, 10}        
        // {100, 2, 3, 4, 5} => {100, 4, 3, 2, 5}        
        // {100, 2, 3, 45, 33, 8, 4, 54} => {54, 4, 3, 45, 33, 8, 2, 100} 
        for (int i = 0; i < nums.length / 2; i++) {
            int x = nums[i];
            int y = nums[nums.length - 1 - i];
            if (x % 2 == 0 && y % 2 == 0) {
                nums[i] = y;
                nums[nums.length - 1 - i] = x;
            }
        }
    }

    public static int hw3task2(int[] nums) {
        // In a given array of integers nums calculate integer result value, that is equal to the distance between the first and the last entry of the maximum value in the array.
        // Example:
        // {4, 100, 3, 4} result = 0
        // {5, 50, 50, 4, 5} result = 1
        // {5, 350, 350, 4, 350} result = 3
        // {10, 10, 10, 10, 10} result = 4 
        if (nums.length == 0) {
            return -1;
        }
        int firstMaxValue = nums[0];
        int lastMaxValue = nums[0];
        int firstMaxValuePosition = 0;
        int lastMaxValuePosition = 0;
        for (int i = 0; i < nums.length; i++) {
            if (firstMaxValue < nums[i]) {
                firstMaxValuePosition = i;
                firstMaxValue = nums[i];
            }
            if (lastMaxValue <= nums[i]) {
                lastMaxValuePosition = i;
                lastMaxValue = nums[i];
            }
        }
        int result = lastMaxValuePosition - firstMaxValuePosition;
        return result
                ;
    }

    public static void hw3task3(int[][] numsM) {
        // In a predetermined two-dimensional integer array (square matrix) matrix insert 0 into elements to the left side of the main diagonal, and 1 into elements to the right side of the diagonal.
        // Example:
        // {{2, 4, 3, 3},  {5, 7, 8, 5},  {2, 4, 3, 3},  {5, 7, 8, 5}}   =>   {{2, 1, 1, 1},  {0, 7, 1, 1},  {0, 0, 3, 1},  {0, 0, 0, 5}}
        for (int i = 0; i < numsM.length; i++) {
            for (int j = 0; j < numsM.length; j++) {
                if (i > j) {
                    numsM[i][j] = 0;
                }
                if (i < j) {
                    numsM[i][j] = 1;
                }
            }
        }
    }
}
