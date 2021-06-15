package com.iegor.HW.HW11.middle;

import java.util.*;
import java.util.stream.Collectors;

public class Task7 {
    /**
     * Task 7.
     *
     * You are given a positive integer K and a sequence of integers integerList.
     * Calculate the symmetrical difference between two subsets of integer values:
     * the first subset is all even integerList values,
     * the second subset is the integerList values excluding the first K elements.
     * In the resulting difference, replace the order with the reversed.
     * //Example: Input 123456789, result 9,7,4,2 For example:
     * input: number = 5, {1, 2, 3, 4, 5, 6, 7, 8, 9}
     * output: {9, 7, 4, 2}
     *
     * @param number
     * @param integerList
     * @return
     */

    public static List<Integer> getSortedDifferenceBetweenSubsets(int number, List<Integer> integerList) {
        return integerList.stream()
                .filter(integer -> (integer%2==0 && integer<number) || (integer%2==1 && integer>number))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}