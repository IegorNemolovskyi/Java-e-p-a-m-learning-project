package com.iegor.HW.HW11;
import com.iegor.HW.HW11.advanced.Entrant;
import com.iegor.HW.HW11.advanced.task11.Task11;
import com.iegor.HW.HW11.advanced.task12.Task12;
import com.iegor.HW.HW11.advanced.task13.Task13;
import com.iegor.HW.HW11.advanced.task14.Supplier;
import com.iegor.HW.HW11.advanced.task14.SupplierDiscount;
import com.iegor.HW.HW11.advanced.task14.Task14;
import com.iegor.HW.HW11.low.*;
import com.iegor.HW.HW11.middle.*;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

public class HW11 {
    public static void main(String[] args) {
        //LOW LEVEL
//        //Task1
//        List<String> stringList1 = Arrays.asList("Hello", "qwerty", "asda", "asdfa", "as", "a");
//        System.out.println(stringList1);
//        //Result
//        System.out.println(Task1.filterByFirstAndLastCharacter('a', stringList1));

//        //Task2
//        List<String> stringList2 = Arrays.asList("Hello", "world", "!", "Good", "morning", "!");
//        System.out.println(stringList2);
//        //Result
//        System.out.println(Task2.sortAscLengthsOfStrings(stringList2));

//        //Task3
//        List<String> stringList3 = Arrays.asList("asd", "a", "basdw");
//        System.out.println(stringList3);
//        //Result
//        System.out.println(Task3.getListExtremeLetters(stringList3));

//        //Task4
//        List<String> stringList4 = Arrays.asList("8DC3", "4F", "B", "3S", "S3", "A1", "2A3G", "1B");
//        System.out.println(stringList4);
//        //Result
//        System.out.println(Task4.filterAndSortByLastDigit(2,stringList4));

//        //Task5
//        List<Integer> intList5 = Arrays.asList(1, 2, 3, 4, 5, 6);
//        System.out.println(intList5);
//        //Result
//        System.out.println(Task5.getSortedAscOddValues(intList5));

//        //Task6
//        List<Integer> intList6 = Arrays.asList(1, 3, 4);
//        List<String> stringList6 = Arrays.asList("1aa", "aaa", "1", "a");
//        System.out.println(intList6 + "," + stringList6);
//        //Result
//        System.out.println(Task6.shouldReturnStringWithFirstLetterDigitAndLengthEqualsNumber(intList6, stringList6));

//        //Task7
//        List<Integer> intList7 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
//        int number7 = 5;
//        System.out.println(number7 + "," + intList7);
//        //Result
//        System.out.println(Task7.getSortedDifferenceBetweenSubsets(number7, intList7));

//        //Task8
//        List<Integer> intList8 = Arrays.asList(-10, 3, -3, 4, 55, 6);
//        int D8 = 3;
//        int K8 = 4;
//        System.out.println(D8 + "," + K8 + "," +intList8);
//        //Result
//        System.out.println(Task8.getSortedUnionTwoSubsetsIntegers(D8, K8, intList8));

//        //Task9
//        List<String> stringList9 = Arrays.asList("ABC", "A", "BCD", "D", "B");
//        System.out.println(stringList9);
//        //Result
//        System.out.println(Task9.shouldReturnStringListWithLengthAndFirstLetter(stringList9));

//        //Task10
//        List<String> stringList10 = Arrays.asList("asnsbiu", "asdsad", "asnsb", "asdf", "asdfb", "as", "a", "aop");
//        System.out.println(stringList10);
//        //Result
//        System.out.println(Task10.getSortedLastLettersInUpperCase(stringList10));

//        //Task11
//        List<Entrant> entrantList11 = Arrays.asList(
//                new Entrant(1, 1993, "Ivanov"),
//                new Entrant(2, 1992, "Petrov"),
//                new Entrant(3, 1993, "Pupkin"),
//                new Entrant(3, 2000, "Zobkin"),
//                new Entrant(3, 2000, "Zabkin"));
//        System.out.println(entrantList11);
//        //Result
//        System.out.println(Task11.getYearSchoolStats(entrantList11));

//        //Task12
//        List<Integer> integerList1_1 = Arrays.asList(1, 2, 33, 44);
//        List<Integer> integerList1_2 = Arrays.asList(11, 22, 13);
//        System.out.println(integerList1_1 + "," + integerList1_2);
//        //Result
//        System.out.println((Task12.makeNumberPairsFromTwoList(integerList1_1, integerList1_2)));

//        //Task13
//        List<Entrant> entrantList13 = Arrays.asList(
//                new Entrant(11, 2003, "Ivanov"),
//                new Entrant(11, 2001, "Petrov"),
//                new Entrant(11, 2001, "Pupkin"),
//                new Entrant(10, 1999, "Zobkin"),
//                new Entrant(10, 1999, "Zabkin"),
//                new Entrant(10, 1999, "Ivanov"),
//                new Entrant(10, 2000, "Petrov"),
//                new Entrant(14, 2001, "Pupkin"),
//                new Entrant(15, 2000, "Zobkin"),
//                new Entrant(10, 2000, "Ivanov"),
//                new Entrant(12, 2003, "Petrov"),
//                new Entrant(11, 2003, "Pupkin"),
//                new Entrant(10, 2003, "Zobkin")
//        );
//        System.out.println(entrantList13);
//        List<Integer> yearList13 = Arrays.asList(2001, 1999, 2000, 2002, 2003);
//        System.out.println(yearList13);
//        //Result
//        System.out.println(Task13.getYearSchoolStatList(entrantList13, yearList13));

        //Task14
        List<Supplier> supplierList14 = Arrays.asList(
                new Supplier(1, 1993, "Sumskaya"),
                new Supplier(2, 1994, "Pushkinskaya"),
                new Supplier(3, 1995, "Beketova"),
                new Supplier(4, 1996, "Amosova"),
                new Supplier(5, 1996, "Amosova")
        );
        System.out.println(supplierList14);
        List<SupplierDiscount> supplierDiscountList14 = Arrays.asList(
                new SupplierDiscount(1, 9, "Posad"),
                new SupplierDiscount(2, 9, "Posad"),
                new SupplierDiscount(3, 10, "Colins"),
                new SupplierDiscount(4, 10, "Colins"),
                new SupplierDiscount(5, 10, "Denim")
        );
        System.out.println(supplierDiscountList14);
        //Result
        System.out.println(Task14.getShopsWithMaxDiscountOwners(supplierList14, supplierDiscountList14));

    }
}
