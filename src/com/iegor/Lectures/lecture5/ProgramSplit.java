package com.iegor.Lectures.lecture5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ProgramSplit {
    public static void main(String[] args) throws FileNotFoundException {
        String str = "mama mila ramu mama ramu mila mama mama";
        printIndexWord(str, "mama");

        String[] words = str.split(" ");
        System.out.println(Arrays.toString(words));
        System.out.println(words.length);

        String strSister = str.replaceAll("mama", "sister");
        System.out.println(strSister);


        int [] arrValues = new int[10];
        Scanner sc = new Scanner(new FileInputStream("D:\\02-Programming\\Learning\\EPAM\\HW\\Java e p a m learning project\\src\\com\\iegor\\Lectures\\lecture5\\value.txt"));
        String strValues = "";
        while (sc.hasNextLine())
        strValues += sc.nextLine();
        System.out.println(strValues);
        String[] valueStr = strValues.split(" ");
        for (int i = 0; i < valueStr.length; i++) {
            if (i >= arrValues.length)
                arrValues = Arrays.copyOf(arrValues,arrValues.length*2);
            arrValues[i] = Integer.parseInt(valueStr[i]);
            System.out.println(Arrays.toString(arrValues));
        }
        arrValues = Arrays.copyOf(arrValues,valueStr.length);
        System.out.println(Arrays.toString(arrValues));


        int [] arrValues2 = new int[10];
        Scanner sc2 = new Scanner(new FileInputStream("D:\\02-Programming\\Learning\\EPAM\\HW\\Java e p a m learning project\\src\\com\\iegor\\Lectures\\lecture5\\value.txt"));
        StringBuilder strValues2 = new StringBuilder();
        while (sc2.hasNextLine()){
            System.out.println(strValues2.capacity() + "/" + strValues2.length());
            strValues2.append(sc2.nextLine());
        }
        System.out.println(strValues2);
        String[] valueStr2 = strValues2.toString().split(" ");
        for (int i = 0; i < valueStr2.length; i++) {
            if (i >= arrValues2.length)
                arrValues2 = Arrays.copyOf(arrValues2,arrValues2.length*2);
            arrValues2[i] = Integer.parseInt(valueStr2[i]);
        }
        arrValues2 = Arrays.copyOf(arrValues2,valueStr2.length);
        System.out.println(Arrays.toString(arrValues2));

    }

    private static void printIndexWord(String str, String word) {
        int index = str.indexOf(word);
        System.out.println(index);
        int indexLast = str.lastIndexOf(word);
        while (index < indexLast) {
            index = str.indexOf(word, index + 1);
            System.out.println(index);
        }
    }
}
