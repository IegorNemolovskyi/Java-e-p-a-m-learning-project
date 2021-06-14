package com.iegor.HW.HW11.middle;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task9 {
    /**
     *Task 9.
     *
     * A sequence of non-empty strings stringList is given, containing only uppercase letters of the Latin alphabet.
     * For all strings starting with the same letter, determine their total length
     * and obtain a sequence of strings of the form "S-C", where S is the total length of all strings from stringList
     * that begin with the character C.
     * Order the resulting sequence in descending order of the numerical values of the sums,
     * and for equal values of the sums, in ascending order of the C character codes. For example:
     * input: {"ABC", "A", "BCD", "D"}
     * output: {"4-A", "3-B", "1-D"}
     *
     * @param stringList
     * @return
     */

    public static List<String> shouldReturnStringListWithLengthAndFirstLetter(List<String> stringList) {
        return stringList.stream()
                .collect(Collectors.groupingBy(string -> Character.valueOf(string.charAt(0))))
                .keySet()
                .stream()
                .map(character -> {
                    int count = 0;
                    for (int i = 0; i < stringList.size(); i++) {
                        if (stringList.get(i).charAt(0) == character)
                            count += stringList.get(i).length();
                    }
                    return count + "-" + character;
                })
                .sorted(Comparator.comparing(string -> Integer.parseInt(string.toString().substring(0,string.toString().indexOf("-"))))
                        .thenComparing(string -> string.toString().substring(string.toString().indexOf("-") + 1, string.toString().length()-1))
                        .reversed()                        )
                .collect(Collectors.toList());
    }
}
/**
 * List<String> temp = new ArrayList<>();
 *
 * char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
 * for (int n = 0; n < alphabet.length; n++) {
 *  boolean isFound = false;
 *  int count = 0;
 *  for (int m = 0; m < stringList.size(); m++) {
 *   if (stringList.get(m).charAt(0)==alphabet[n]) {
 *   isFound=true;
 *   count += stringList.get(m).length();
 *   }
 *  }
 *  if (isFound)
 *   temp.add(count+"-"+alphabet[n]);
 *  }
 * return temp;
 */