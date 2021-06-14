package com.iegor.HW.HW11.low;

import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    /**
     * Task 2.
     *
     * A sequence of non-empty strings stringList is given.
     * Get a sequence of ascending sorted integer values equal to the lengths of the strings included
     * in the stringList sequence. For example:
     * input: {"Hello", "world", "!", "Good", "morning", "!"}
     * output: {1, 1, 4, 5, 5, 7}
     *
     * @param stringList
     * @return
     */
    public static List<Integer> sortAscLengthsOfStrings(List<String> stringList) {
        return stringList.stream()
                .map(String::length)
                .sorted()
                .collect(Collectors.toList());
    }
}
