package com.iegor.HW.HW11.low;

import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    /**
     * Task 1.
     *
     * The character C and a sequence of non-empty strings stringList are given. Get a new sequence of strings with more than one character from the stringList, starting and ending with C. For example:
     * input: Symbol = 'a', {"Hello", "qwerty", "asda", "asdfa", "as", "a"}
     * output: {"asda", "asdfa"}
     *
     * @param symbol
     * @param stringList
     * @return
     */

    public static List<String> filterByFirstAndLastCharacter(char symbol, List<String> stringList) {
        return stringList.stream()
                .filter(string -> string.length()>1)
                .filter(string -> string.substring(string.length()-1).contains(String.valueOf(symbol)))
                .filter(string -> string.substring(0,1).contains(String.valueOf(symbol)))
                .collect(Collectors.toList());
    }

}

