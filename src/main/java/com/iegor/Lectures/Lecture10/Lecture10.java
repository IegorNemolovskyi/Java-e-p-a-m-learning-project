package com.iegor.Lectures.Lecture10;

import java.util.ArrayList;

class TwoTuple<A, B>{
    public final A first;
    public final B second;
    public TwoTuple(A first, B second){
        this.first = first;
        this.second = second;
    }
}

public class Lecture10 {
    public static void main(String[] args) {
        TwoTuple<Integer, Integer> tt = new TwoTuple<>(1, 2);
        System.out.println(tt.first.getClass().getName());
        System.out.println(tt.second.getClass().getName());


        ArrayList listObj = new ArrayList();
        listObj.add("A");
        System.out.println(listObj.get(0));
        listObj.add(111);
        String value01 = (String) listObj.get(0);
        int value02 = (Integer) listObj.get(1);

        ArrayList<String> listStr = new ArrayList<>();
        listStr.add("A");
        //listStr.add(111);
        String value11 = listStr.get(0);
//        String value12 = listStr.get(1);
    }
}
