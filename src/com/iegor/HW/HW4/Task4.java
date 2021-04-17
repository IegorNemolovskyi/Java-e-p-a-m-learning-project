package com.iegor.HW.HW4;

public class Task4 {
    private Task4(){}
    // Task 4.
    // Create function SumGeometricElements, determining the sum of the first
    // elements of a decreasing geometric progression of real numbers with a
    // given initial element of a progression a1 and a given progression step t,
    // while the last element must be greater than a given alim. an is calculated
    // by the formula (an+1 = an * t), 0<t<1 .
    // Example,
    // For a progression, where a1 = 100, and t = 0.5, the sum of the first elements,
    // grater than alim = 20, equals to 100+50+25 = 175

    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     * if set invalid arguments in method, then method must throws
     * IllegalArgumentException
     */
    public static double sumGeometricElements(int a1, double t, int alim) {
        double result = 0;
            if (t > 0 && t< 1 && a1 > alim && alim >= 0) {
                double progresValue = a1;
                while (progresValue > alim && progresValue >= 0.000001) {
                    result += progresValue;
                    progresValue *= t;
                }
            } else {
                throw new IllegalArgumentException();
            }
            return java.lang.Math.round(result);
    }
}