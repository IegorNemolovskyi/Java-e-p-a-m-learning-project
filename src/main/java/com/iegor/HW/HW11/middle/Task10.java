package com.iegor.HW.HW11.middle;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task10 {

    /**
     * Task 10.
     *
     * A sequence of non-empty strings of Latin alphabet characters stringList is given.
     * Select the last character from each string, converting it to uppercase.
     * Return sorted sequence of characters in descending order by initial string length. For example:
     * input: {"asnsbiu", "asdsad", "asnsb", "asdf", "asdfb", "as", "a", "aop"}
     * output: {'U', 'D', 'B', 'B', 'F', 'P', 'S', 'A'}
     *
     * @param stringList
     * @return
     */
    public static List<Character> getSortedLastLettersInUpperCase(List<String> stringList) {
        return stringList.stream()
                .sorted(Comparator.comparingInt(String::length).reversed())
                .map(string -> Character.valueOf(string.charAt(string.length()-1)))
                .map(Character::toUpperCase)
                .collect(Collectors.toList());
    }
}