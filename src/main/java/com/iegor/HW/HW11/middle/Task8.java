package com.iegor.HW.HW11.middle;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task8 {
    /**
     *Task 8.
     *
     * You are given a positive integer K and integer D and a sequence of integers integerList.
     * Compute a union of two subsets of integers:
     * the first subset is all values of integerList greater than D,
     * the second subset is an integer list of values starting with an element with ordinal number K inclusive
     * (the numbering of elements in the integer list starting from 0).
     * Sort the resulting sequence in descending order. For example:
     * input: D = 3, K = 4, integerList{-10, 3, -3, 4, 55, 6}
     * output: {55, 6, 4}
     *
     * @param d
     * @param k
     * @param intList
     * @return
     */

    public static List<Integer> getSortedUnionTwoSubsetsIntegers(int d, int k, List<Integer> intList) {
        return intList.stream()
                .filter(integer -> integer>d || intList.indexOf(integer)>=k)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}
