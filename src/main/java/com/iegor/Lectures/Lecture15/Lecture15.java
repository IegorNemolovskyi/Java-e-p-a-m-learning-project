package com.iegor.Lectures.Lecture15;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

@FunctionalInterface
interface MyOp{
    int operation (int x, int y);
}

public class Lecture15 {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
//        System.out.println(sum(x,y));

        MyOp sumOperation = (int a, int b) -> {return a + b;};
        MyOp multiplicationOperation = (x1, y1) -> x1 * y1;
        System.out.println("sumOperation: " + sumOperation.operation(3,7));
        System.out.println("multiplicationOperation: " + multiplicationOperation.operation(2,7));

        BiFunction <Integer, Integer, Integer> sum = (a, b) -> {return a + b;};
        BiFunction <Integer, Integer, Integer> multiplication = (a, b) -> {return a * b;};
        System.out.println("sum: " + sum.apply(5,4));
        System.out.println("multiplication: " + multiplication.apply(5,4));

        Function<List<Integer>, Integer> countOdd = (list) -> {
            int count = 0;
            for (Integer elem:list) {
                if (elem%2 == 1) count++;
            }
            return count;
        };
        System.out.println("count odd: " + countOdd.apply(Arrays.asList(1,2,3,4,5)));
        System.out.println("count odd: " + countOdd.apply(Arrays.asList(2,3,4,5,6)));
        System.out.println("count odd: " + countOdd.apply(Arrays.asList(3,4,5,6,7)));

    }

//    public static int sum(int x, int y){
//        return x+y;
//    }
}
