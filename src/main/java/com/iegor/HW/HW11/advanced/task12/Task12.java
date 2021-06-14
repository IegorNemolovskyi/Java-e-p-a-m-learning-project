package com.iegor.HW.HW11.advanced.task12;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task12 {
    /**
     * Task 12.
     *
     * A sequence of positive integers integerList1 and integerList2 are given.
     * All values in each sequence are different.
     * Get a set (list of NumberPair values) of all value pairs that satisfy the following conditions:
     * the first element of the pair belongs to the sequence integerList1,
     * the second belongs to integerList2,
     * and both elements end with the same digit.
     * The NumberPair type includes <value_1> <value_2> fields.
     * The resulting NumberPair list must be sorted in ascending order by the first field,
     * and if they are equal, by the second. For example:
     * input: {1, 2, 33, 44}, {11, 22, 13}
     * output: {NumberPair(1, 11), NumberPair(2, 22), NumberPair(3, 33)}
     *
     * @param integerList1
     * @param integerList2
     * @return
     */

    public static List<NumberPair> makeNumberPairsFromTwoList(List<Integer> integerList1, List<Integer> integerList2) {
        return integerList1
                .stream()
                .flatMap(firstNumber -> integerList2.stream()
                        .filter(secondNumber -> secondNumber % 10 == firstNumber %10)
                        .map(secondNumber -> new NumberPair(firstNumber,secondNumber))
                )
                .sorted(Comparator.comparing(NumberPair::getValue1).thenComparing(NumberPair::getValue2))
                .collect(Collectors.toList());
    }
}
