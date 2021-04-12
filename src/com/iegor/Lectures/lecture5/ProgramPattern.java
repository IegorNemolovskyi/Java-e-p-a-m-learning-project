package com.iegor.Lectures.lecture5;

import java.util.regex.*;

public class ProgramPattern {
    public static void main(String[] args) {
        String pattern = "[a-z]+";
        String text = "nowisthetime";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        while (m.find()){
            System.out.print(text.substring(m.start(), m.end())+ "*");
        }
        System.out.println(m.matches());
    }
}
