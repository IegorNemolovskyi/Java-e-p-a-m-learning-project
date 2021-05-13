package com.iegor.Lectures.Lecture3;
import java.util.Scanner;
public class Lecture3 {

    public static void main(String[] args) {
        //int a = 1;
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
                    System.out.println("nums[" + i + "]");
                    int value = validateValue(sc);
                    nums[i] = value;
        }
        sc.close();
    }

    private static int validateValue(Scanner sc) {
        while (true){
        try{
        int valueInt = validateInt(sc);
        return isInRange(valueInt);
        }
        catch (IllegalArgumentException e){
                System.err.println("Value is not in range");
        }
        }
    }

    private static int validateInt(Scanner sc) {
        while(true){
        try{
        System.out.println(">>Enter value = " );
        return sc.nextInt();
        }catch (Exception e) {
            System.err.println("Error: input not INT");
            sc.nextLine();

        }
        }
    }

    public static int isInRange(int n) {
        if (n>0 && n < 12) {
            return n;
            
        }
        else {
            throw new IllegalArgumentException("Value is not in range");
        }
        
    }

}
