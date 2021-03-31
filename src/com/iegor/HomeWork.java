package com.iegor;

import java.util.Arrays;
import com.iegor.HW1.*;
import com.iegor.HW2.*;
import com.iegor.HW3.*;

public class HomeWork {
    public static void main(String[] args) {
        // Home work 1
        System.out.println("Home work 1 task 1 result is:");
        System.out.println(HW1.hw1task1(4));
        System.out.println("Home work 1 task 2 result is:");
        System.out.println(HW1.hw1task2(153));

        // Home work 2
        System.out.println("Home work 2 task 1 result is:");
        System.out.println(HW2.hw2task1(10101));
        System.out.println("Home work 2 task 2 result is:");
        System.out.println(HW2.hw2task2(11));
        System.out.println("Home work 2 task 3 result is:");
        System.out.println(HW2.hw2task3(4));

        // Home work 3
        // Array data
        // one dimension array
        int [] nums;
        nums = new int [] {2, 1, 4, 4};
        // two dimension array
        int[][] numsM;
        numsM = new int[][]{{2, 4, 3, 3}, {5, 7, 8, 5}, {2, 4, 3, 3}, {5, 7, 8, 5}};
        // >>Home work lesson 3 task 1: start   
        System.out.println("Home work 3 task 1 result is:");
        System.out.println(Arrays.toString(nums)); //to print an one domension array    
        HW3.hw3task1(nums);
        System.out.println(Arrays.toString(nums));
        // >>Home work lesson 3 task 1: end
        // >>Home work lesson 3 task 2: start
        System.out.println("Home work 3 task 2 result is:");
        System.out.println(Arrays.toString(nums)); //to print an one domension array 
        HW3.hw3task2(nums);
        System.out.println(HW3.hw3task2(nums));
        // >>Home work lesson 3 task 2: end
        // >>Home work lesson 3 task 3: start
        System.out.println("Home work 3 task 3 result is:");
        System.out.println(Arrays.deepToString(numsM));
        HW3.hw3task3(numsM);
        System.out.println(Arrays.deepToString(numsM)); //to print a two domension array
        // >>Home work lesson 3 task 3: end
    }
}
