package com.iegor.HW.HW11.middle;

import java.util.List;
import java.util.stream.Collectors;

public class Task6 {
    /**
     * Task 6.
     *
     * A sequence of positive integers numbers and a sequence of strings stringList are given. Get a new sequence
     * of strings according to the following rule:
     * for each value n from sequence numbers, select a string from sequence stringList that starts with a digit and has length n.
     * If Look at the template on the end of the task before solving the problem.
     * there are several required strings in the stringList sequence, return the first;
     * if there are none, then return the string "Not found" For example:
     * input: {1, 3, 4}, {"1aa", "aaa", "1", "a"}
     * output: {"1", "1aa", "Not Found"}
     *
     * @param numbers
     * @param stringList
     * @return
     */

    public static List<String> shouldReturnStringWithFirstLetterDigitAndLengthEqualsNumber
    (List<Integer> numbers, List<String> stringList) {
        return numbers.stream()
                .map(number -> {
                    return stringList.stream()
                            .filter(string -> string.length() == number && Character.isDigit(string.charAt(0)))
                            .findFirst()
                            .orElse("Not Found");
                })
                .map(string -> String.valueOf(string))
                .collect(Collectors.toList());
    }
}
