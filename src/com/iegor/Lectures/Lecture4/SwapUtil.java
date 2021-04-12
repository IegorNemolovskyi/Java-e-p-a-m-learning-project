package com.iegor.Lectures.Lecture4;

import java.util.Arrays;

public class SwapUtil {
    static void showDefaultValueInArray() {
        int[] arrInt = new int [10];
        double[] arrDouble = new double [10];
        Object[] arrObject = new Object [10];
        String [] arrString = new String [10];
        System.out.println(arrInt);
        System.out.println(Arrays.toString(arrInt));
        System.out.println(arrDouble);
        System.out.println(Arrays.toString(arrDouble));
        System.out.println(arrObject);
        System.out.println(Arrays.toString(arrObject));
        System.out.println(arrString);
        System.out.println(Arrays.toString(arrString));
    }

    static void swapFunction(int a, int b) {
        System.out.println("Before swapping (inside), a = " + a + " b " + b);
        // Swap n1 with n2
        int c = a;
        a = b;
        b = c;
        System.out.println("After swapping (inside), a = " + a + " b " + b);
    }

    static void swapFunction(int[] arr) {
        System.out.println("Before swapping(Inside), " + Arrays.toString(arr));
        // Swap n1 with n2
        int t = arr[0];
        arr[0] = arr[1];
        arr[1] = t;
        System.out.println("After swapping(Inside), " + Arrays.toString(arr));
    }

    static void swapFunctionIncorrect(int[] arr1, int[] arr2) {
        System.out.println("Before swapping(Inside)1, " + Arrays.toString(arr1));
        System.out.println("Before swapping(Inside)2, " + Arrays.toString(arr2));

        int [] t = arr1;
        arr1 = arr2;
        arr2 = t;
        System.out.println("After swapping(Inside)1, " + Arrays.toString(arr1));
        System.out.println("After swapping(Inside)2, " + Arrays.toString(arr2));
    }

    static void swapFunction(int[] arr1, int[] arr2) {
        System.out.println("Before swapping(Inside)1, " + Arrays.toString(arr1));
        System.out.println("Before swapping(Inside)2, " + Arrays.toString(arr2));

        // int [] t = new int [arr1.length];
        // for (int i = 0; i < t.length; i++) {
        //     t[i]=arr1[i];
        // }
        // arr1 = arr2;
        // arr2 = t;

        // int [] t = Arrays.copyOf(arr1, arr1.length);
        // arr1 = Arrays.copyOf(arr2, arr2.length);
        // arr2 = Arrays.copyOf(t, t.length);

        int [] t = new int [arr1.length];
        for (int i = 0; i < t.length; i++) {
            t[i]=arr1[i];
        }
        for (int i = 0; i < t.length; i++) {
            arr1[i]=arr2[i];
        }
        for (int i = 0; i < t.length; i++) {
            arr2[i]=t[i];
        }
        
        System.out.println("After swapping(Inside)1, " + Arrays.toString(arr1));
        System.out.println("After swapping(Inside)2, " + Arrays.toString(arr2));
    }

    static void swapFunction(MySwap mySwap) {
        
        int t = mySwap.y;
        mySwap.y = mySwap.x;
        mySwap.x = t;
    }

    static void swapFunction(Integer a, Integer b) {
        System.out.println("Before swapping (inside), a = " + a + " b " + b);
        // Swap n1 with n2
        int c = a;
        a = b;
        b = c;
        System.out.println("After swapping (inside), a = " + a + " b " + b);
    }
}
