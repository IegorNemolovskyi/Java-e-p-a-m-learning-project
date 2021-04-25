package com.iegor.HW.HW3;

public class HW3 {
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

    public static int[][] hw3task3(int[][] numsM) {
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
        return numsM;
    }
}
