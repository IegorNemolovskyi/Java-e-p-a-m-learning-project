package com.iegor.HW.HW11.low;

import java.util.List;
import java.util.stream.Collectors;

public class Task5 {
    /**
     * Task 5.
     *
     * A sequence of positive integer values integerList is given.
     * Get sequence of string representations of only odd integerList values
     * and sort in ascending order. For example:
     * input: {1, 2, 3, 4, 5, 6}
     * output: {"1", "3", "5"}
     *
     * @param intList
     * @return
     */

    public static List<String> getSortedAscOddValues(List<Integer> intList) {
        return intList.stream()
                .filter(string -> string%2==1)
                .map(String::valueOf)
                .collect(Collectors.toList());
    }
}
