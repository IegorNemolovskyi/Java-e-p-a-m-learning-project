package com.iegor.HW.HW10;

import org.testng.Assert;
import org.testng.annotations.*;

public class MatrixTest {

    @Test (priority = 1)
    public void testAddition() throws MatrixException {
        Matrix matrix1 = new Matrix(new double[][]{{2, 3, 4}, {3, 4, 5}, {4, 5, 6}});
        Matrix matrix2 = new Matrix(new double[][]{{3, 4, 5}, {4, 5, 6}, {5, 6, 7}});
        Matrix matrixResult = new Matrix(new double[][]{{5, 7, 9}, {7, 9, 11}, {9, 11, 13}});

        Assert.assertEquals(matrix1.addition(matrix2).twoDimensionalArrayOutOfMatrix(), matrixResult.twoDimensionalArrayOutOfMatrix());
    }

    @Test (priority = 2)
    public void testSubtraction() throws MatrixException {
        Matrix matrix1 = new Matrix(new double[][]{{10, 12, 14}, {12, 14, 16}, {14, 16, 18}});
        Matrix matrix2 = new Matrix(new double[][]{{3, 4, 5}, {4, 5, 6}, {5, 6, 7}});
        Matrix matrixResult = new Matrix(new double[][]{{7, 8, 9}, {8, 9, 10}, {9, 10, 11}});

        Assert.assertEquals(matrix1.subtraction(matrix2).twoDimensionalArrayOutOfMatrix(), matrixResult.twoDimensionalArrayOutOfMatrix());
    }

    @Test (priority = 3)
    public void testMultiplication() throws MatrixException {
        Matrix matrix1 = new Matrix(new double[][]{{2, 3, 4}, {3, 4, 5}, {4, 5, 6}});
        Matrix matrix2 = new Matrix(new double[][]{{3, 4, 5}, {4, 5, 6}, {5, 6, 7}});
        Matrix matrixResult = new Matrix(new double[][]{{38, 47, 56}, {50, 62, 74}, {62, 77, 92}});

        Assert.assertEquals(matrix1.multiplication(matrix2).twoDimensionalArrayOutOfMatrix(), matrixResult.twoDimensionalArrayOutOfMatrix());
    }
}