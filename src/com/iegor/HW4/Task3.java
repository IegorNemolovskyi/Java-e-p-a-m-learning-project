package com.iegor.HW4;

public class Task3 {
    private Task3(){}
    // Task 3.
    // Create function MultArithmeticElements, which determines the
    // multiplication of the first n elements of arithmetic progression of real
    // numbers with a given initial element of progression a1 and progression step
    // t. an is calculated by the formula (an+1 = an + t).
    // Example,
    // For a1 = 5, t = 3, n = 4 multiplication equals to 5*8*11*14 = 6160

    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     * if set invalid arguments in method, then method must throws
     * IllegalArgumentException
     */
    public static int multiArithmeticElements(int a1, int t, int n) {
        int mult = a1;
        if (n == 1) {
            return a1;
        } else if (n > 1) {
            return mult * multiArithmeticElements(a1 + t, t, n - 1);
        } else {
            throw new IllegalArgumentException();
        }
    }
}