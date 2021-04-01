package com.iegor.Lectures.lecture4;

import java.lang.reflect.Array;
import java.util.Arrays;
class MySwap{
    int x;
    int y;
}
public class lecture4 {
    public static void main(String[] args) {
        int a = 30;
        int b = 45;
        SwapUtil.swapFunction(a, b);
        //Now, Before and After swapping values will be same here
        System.out.println("After swapping, a = " + a + " and b is " + b);
        SwapUtil.showDefaultValueInArray();
        int[] arr = {a, b};
        SwapUtil.swapFunction(arr);
        System.out.println("After swapping, "+ Arrays.toString(arr));
        MySwap mySwap = new MySwap();
        mySwap.x = a;
        mySwap.y = b;
        SwapUtil.swapFunction(mySwap);
        System.out.println("After swapping, x = "+ mySwap.x + " and y is " + mySwap.y);

        int [] arr1 = {1, 1, 1,};
        int [] arr2 = {2, 2, 2,};
        SwapUtil.swapFunction(arr1, arr2);
        System.out.println("After swapping, arr1 = "+ Arrays.toString(arr1));
        System.out.println("After swapping, arr2 = "+ Arrays.toString(arr2));
        
        Integer i1 = a;
        Integer i2 = b;
        SwapUtil.swapFunction(i1, i2);
        System.out.println("After swapping, i1 = " + i1 + " and i2 is " + i2); 
    
    }

    
} 
