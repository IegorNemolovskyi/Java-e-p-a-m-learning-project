package com.iegor.HW.HW11.low;

import java.util.List;
import java.util.stream.Collectors;

public class Task4 {
    /**
     *Task 4.
     *
     * A positive integer K and a sequence of non-empty strings stringList are given. Strings of the sequence contain
     * only numbers and capital letters of the Latin alphabet.
     * Get from stringList all strings of length K
     * ending in a digit
     * and sort them in ascending order. For example:
     * input: number = 2, {"8DC3", "4F", "B", "3S", "S3", "A1", "2A3G", "1B"}
     * output: {"A1", "S3"}
     *
     * @param number
     * @param stringList
     * @return
     */

    public static List<String> filterAndSortByLastDigit(int number, List<String> stringList) {
        return stringList.stream()
                .filter(string -> string.length() == number)
                .filter(string -> string.substring(string.length()-1).matches("\\d"))
                .sorted()
                .collect(Collectors.toList());
    }
}