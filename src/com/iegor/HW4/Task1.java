package com.iegor.HW4;

public class Task1 {
    private Task1(){}
    // Task 1*.
    // Create function IsSorted, determining whether a given array of integer
    // values of arbitrary length is sorted in a given order (the order is set up by
    // enum value SortOrder). Array and sort order are passed by parameters.
    // Function does not change the array.
    // * Functions’ signature should start from words public static

    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     * if set invalid arguments in method, then method must throws
     *  IllegalArgumentException
     */
    public static boolean isSorted(int[] array, SortOrder order) {
        if(array == null || array.length == 0) {
            throw new IllegalArgumentException();
        }
        if (order == SortOrder.ASC) {
            for (int i = 0; i < array.length-1; i++){
            if (array[i] > array[i+1])
                return false;
            }
            return true;
        }
        else if (order == SortOrder.DESC) {
                for (int i = 0; i < array.length-1; i++){
                    if (array[i] < array[i+1])
                        return false;
                }
            return true;
        }
        else
        return false;
    }
}
