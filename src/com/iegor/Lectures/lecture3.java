package com.iegor.Lectures;
import java.util.Scanner;
public class lecture3 {

    public static void main(String[] args) {
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
        sc.close();
    }

    public static void isInRange(int n) {
        
        
    }

}
