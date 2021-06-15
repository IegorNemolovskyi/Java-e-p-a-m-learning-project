package com.iegor.HW.HW11.low;

import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    /**
     * Task 3.
     *
     * A sequence of non-empty strings stringList is given. Get a new sequence of strings, where each string consists
     * of the first and last characters of the corresponding string in the stringList sequence. For example:
     * input: {"asd", "a", "basdw"}
     * output: {"ad", "aa", "bw"}
     *
     * @param list
     * @return
     */

    public static List<String> getListExtremeLetters(List<String> list) {
        return list.stream()
                .map(string -> string.substring(0,1)+string.substring(string.length()-1))
                .collect(Collectors.toList());
    }
}
