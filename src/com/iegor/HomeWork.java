package com.iegor;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        // System.out.println(hw1task1(4));
        // System.out.println(hw1task2(153));
        // System.out.println(hw2task1(10101));
        // System.out.println(hw2task2(11));
        // System.out.println(hw2task3(4));
        
        int a = 1;
        int [] nums = new  int[10];
        System.out.println(nums);
        fillNums(nums);
        // int sumResult = sumArray(nums);
        // System.out.println(sumResult);
        printNums(nums); //hw3task1(nums);
        //System.out.println(hw3task1);
        nums = new int [] {4, 100, 3, 4};
        printNums(nums); 
        fillFromConsole(nums);
        printNums(nums);
    }
    
    public static int hw1task1(int n){
        // For a given integer n calculate the value which is equal to a:
        // • squared number, if its value is strictly positive; 
        // • modulus of a number, if its value is strictly negative;
        // • zero, if the integer n is zero.  
        // Example:
        // n = 4   -> result =  16
        // n = -5  ->  result =  5
        // n = 0   ->  result = 0
        if (n>0)
            return n*n;
        else if (n<0)
            return Math.abs(n);
        else
            return 0;
    }

    public static int hw1task2(int n){
        // Find the maximum integer, that can be obtained by permutation of numbers of an arbitrary three-digit positive integer n (100<=n<=999).
        // Example:
        // n = 165  -> result =  651
        // n = 123 -> result = 321
        int result;
        if(n>=100 && n<=999){
            int n1 = n / 100;
            int n2 = n / 10-(n1*10);
            int n3= n % 10;
            int max = Math.max(n1,Math.max(n2,n3));
            int min = Math.min(n1,Math.min(n2,n3));
            int mid = n1 + n2 + n3 - (max + min);
            result=max*100+mid*10+min;
        }
        else{
            result = 0;
        }
        return result;
    }

    public static int hw2task1(int value){
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
        } 
		else {
            throw new IllegalArgumentException();
        }
    }

    public static int hw2task2(int value) {
        // For a positive integer n calculate the result value, which is equal to the amount of the “1” in the binary
        // representation of n.
        // Example,
        // n = 14 = 1110 result = 3
        // n = 128 = 1000 0000 result = 1
        if (value>0){
            int result=0;
            while (value > 0) {
                result += value & 1;
                value >>= 1;
            }
            return result;
        }
        else {
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
            return  0;
		else if (value >0){
            int f[] = new int[value + 1];
            f[0] = 0;
            f[1] = 1;
            int result = f[0] + f[1];
            for (int i = 2; i <= value - 1; i++) {
                f[i] = f[i - 1] + f[i - 2];
                result += f[i];
            }
            return result ;
        }
        else {
            throw new IllegalArgumentException();
        }
    }

    public static void printNums(int [] nums) {  //public static void hw3task1 (int [] nums)
        for (int i = 0; i < nums.length; i++) {
            System.out.println(" nums[" + i + "] = " + nums[i]);
        }

    }

    public static int sumArray(int [] nums) {
        int sum = 0;
        for (int elem: nums) {
            sum+=elem;
        }
        return sum;
    }

    public static void fillNums(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums [i] = i*i;
        }
    }

    public static void fillFromConsole(int [] nums) {
        Scanner sc = new Scanner(System.in);
                for (int i = 0; i < nums.length; i++) {
                    validateInt(nums, sc, i);
        }
        sc.close();
    }

    private static void validateInt(int[] nums, Scanner sc, int i) {
        while(true){
        try{
        System.out.println(" Enter nums[" + i + "]" );
        nums [i] = sc.nextInt();
        break;
        }catch (Exception e) {
            System.err.println("Error: input not INT");
            sc.nextLine();

        }
        }
    }

    public static void isInRange(int n) {
        
        
    }

}
